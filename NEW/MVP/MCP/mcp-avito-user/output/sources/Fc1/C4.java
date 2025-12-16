package Fc1;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

/* loaded from: classes9.dex */
public final class C4 extends SSLSocketFactory {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final SSLSocketFactory f4836a = SSLContext.getInstance("TLS").getSocketFactory();

    public static void a(Socket socket) {
        if (socket instanceof SSLSocket) {
            ((SSLSocket) socket).setEnabledProtocols(new String[]{"TLSv1.1", "TLSv1.2"});
        }
    }

    @Override // javax.net.SocketFactory
    @Y61.k
    public final Socket createSocket(@Y61.k String str, int i12) throws IOException {
        Socket socketCreateSocket = this.f4836a.createSocket(str, i12);
        a(socketCreateSocket);
        return socketCreateSocket;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    @Y61.k
    public final String[] getDefaultCipherSuites() {
        return this.f4836a.getDefaultCipherSuites();
    }

    @Override // javax.net.ssl.SSLSocketFactory
    @Y61.k
    public final String[] getSupportedCipherSuites() {
        return this.f4836a.getSupportedCipherSuites();
    }

    @Override // javax.net.SocketFactory
    @Y61.k
    public final Socket createSocket(@Y61.k String str, int i12, @Y61.k InetAddress inetAddress, int i13) throws IOException {
        Socket socketCreateSocket = this.f4836a.createSocket(str, i12, inetAddress, i13);
        a(socketCreateSocket);
        return socketCreateSocket;
    }

    @Override // javax.net.SocketFactory
    @Y61.k
    public final Socket createSocket(@Y61.k InetAddress inetAddress, int i12) throws IOException {
        Socket socketCreateSocket = this.f4836a.createSocket(inetAddress, i12);
        a(socketCreateSocket);
        return socketCreateSocket;
    }

    @Override // javax.net.SocketFactory
    @Y61.k
    public final Socket createSocket(@Y61.k InetAddress inetAddress, int i12, @Y61.k InetAddress inetAddress2, int i13) throws IOException {
        Socket socketCreateSocket = this.f4836a.createSocket(inetAddress, i12, inetAddress2, i13);
        a(socketCreateSocket);
        return socketCreateSocket;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    @Y61.k
    public final Socket createSocket(@Y61.k Socket socket, @Y61.k String str, int i12, boolean z12) throws IOException {
        Socket socketCreateSocket = this.f4836a.createSocket(socket, str, i12, z12);
        a(socketCreateSocket);
        return socketCreateSocket;
    }
}
