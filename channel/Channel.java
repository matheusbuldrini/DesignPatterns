package channel;

abstract class Channel {
	 
    public abstract void send();
    public abstract void receive();
 
}
 
class TCPChannel extends Channel {
     
    public void send() {
        System.out.println("ENVIANDO via TCP");
    }
    public void receive() {
        System.out.println("RECEBENDO via TCP");
    }
}

class UDPChannel extends Channel {
    
    public void send() {
        System.out.println("ENVIANDO via UDP");
    }
    public void receive() {
        System.out.println("RECEBENDO via UDP");
    }
}
 
abstract class ChannelDecorator extends Channel {
     
    protected Channel DecoratedChannel;
 
    public ChannelDecorator(Channel DecoratedChannel) {
        this.DecoratedChannel = DecoratedChannel;
    }
 
}

class ZipChannel extends ChannelDecorator {
	 
    public ZipChannel(Channel DecoratedChannel) {
        super(DecoratedChannel);
    }
 
    public void send() {
    	System.out.println("Compactando...");
    	DecoratedChannel.send();
    } 
	public void receive() {
    	System.out.println("Descompactando...");
    	DecoratedChannel.receive();
	} 
}

class BufferChannel extends ChannelDecorator {
	 
    public BufferChannel(Channel DecoratedChannel) {
        super(DecoratedChannel);
    }
 
    public void send() {
    	System.out.println("Fazendo buffer do envio...");
    	DecoratedChannel.send();
    }

	public void receive() {
    	System.out.println("Fazendo buffer do recebimento... ");
    	DecoratedChannel.receive();
	} 
}

class LogChannel extends ChannelDecorator {
	 
    public LogChannel(Channel DecoratedChannel) {
        super(DecoratedChannel);
    }
 
    public void send() {
    	System.out.println("Registrando envio...");
    	DecoratedChannel.send();
    } 
	public void receive() {
    	System.out.println("Registrando recebimento...");
    	DecoratedChannel.receive();
	} 
}