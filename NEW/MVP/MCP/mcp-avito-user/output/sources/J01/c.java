package J01;

import java.net.Socket;
import org.apache.http.conn.ssl.BrowserCompatHostnameVerifier;
import org.apache.http.conn.ssl.SSLSocketFactory;
import org.apache.http.conn.ssl.StrictHostnameVerifier;

@Deprecated
/* loaded from: classes7.dex */
public class c extends SSLSocketFactory {
    static {
        new BrowserCompatHostnameVerifier();
        new StrictHostnameVerifier();
    }

    @Override // org.apache.http.conn.ssl.SSLSocketFactory, org.apache.http.conn.scheme.LayeredSocketFactory
    public final Socket createSocket(Socket socket, String str, int i12, boolean z12) {
        throw null;
    }

    @Override // org.apache.http.conn.ssl.SSLSocketFactory, org.apache.http.conn.scheme.SocketFactory
    public final Socket createSocket() {
        throw null;
    }
}
