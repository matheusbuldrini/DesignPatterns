package channel;

public class Main {
	public static void main(String[] args) {
        Channel ZipBufLogTCPChannel = new ZipChannel(new BufferChannel(new LogChannel(new TCPChannel())));
        Channel ZipBufLogUDPChannel = new ZipChannel(new BufferChannel(new LogChannel(new UDPChannel())));
        Channel ZipLogUDPChannel = new ZipChannel(new LogChannel(new UDPChannel()));
        Channel ZipTCPChannel = new ZipChannel(new TCPChannel());
        Channel BufUDPChannel = new BufferChannel(new UDPChannel());
        ZipBufLogTCPChannel.send();
        ZipBufLogTCPChannel.receive();
        ZipBufLogUDPChannel.send();
        ZipBufLogUDPChannel.receive();
        ZipLogUDPChannel.send();
        ZipLogUDPChannel.receive();
        ZipTCPChannel.send();
        ZipTCPChannel.receive();
        BufUDPChannel.send();
        BufUDPChannel.receive();
	}
}
