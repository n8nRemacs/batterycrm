package J01;

import java.net.InetAddress;
import java.net.Socket;
import javax.net.ssl.SSLSocketFactory;
import org.apache.http.conn.ssl.BrowserCompatHostnameVerifier;
import org.apache.http.conn.ssl.StrictHostnameVerifier;

@Deprecated
/* loaded from: classes7.dex */
public class d extends SSLSocketFactory {
    static {
        new BrowserCompatHostnameVerifier();
        new StrictHostnameVerifier();
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(String str, int i12) {
        throw null;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final String[] getDefaultCipherSuites() {
        return new String[0];
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final String[] getSupportedCipherSuites() {
        return new String[0];
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(String str, int i12, InetAddress inetAddress, int i13) {
        throw null;
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(InetAddress inetAddress, int i12) {
        inetAddress.getHostAddress();
        throw null;
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(InetAddress inetAddress, int i12, InetAddress inetAddress2, int i13) {
        inetAddress.getHostAddress();
        throw null;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final Socket createSocket(Socket socket, String str, int i12, boolean z12) {
        throw null;
    }
}
