package defpackage;

import android.content.Context;
import android.net.SSLCertificateSocketFactory;
import android.net.SSLSessionCache;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import javax.net.ssl.SSLSocketFactory;

/* loaded from: classes2.dex */
public final class j6f extends SSLSocketFactory {
    public final String a;
    public final SSLCertificateSocketFactory b;

    public j6f(Context context, String str) {
        SSLSessionCache sSLSessionCache;
        String name = j6f.class.getName();
        this.a = name;
        l6b l6bVar = wqi.a;
        if (l6bVar != null) {
            lg8 lg8Var = lg8.d;
            if (l6bVar.b(lg8Var)) {
                l6bVar.c(lg8Var, name, "init, useX509Extension=true", null);
            }
        }
        try {
            sSLSessionCache = new SSLSessionCache(context.getDir("tamtam_sslcache", 0));
        } catch (IOException e) {
            wqi.e(this.a, "failed to create ssl cache with specified dir", e);
            sSLSessionCache = new SSLSessionCache(context);
        }
        SSLCertificateSocketFactory sSLCertificateSocketFactory = (SSLCertificateSocketFactory) SSLCertificateSocketFactory.getDefault(5000, sSLSessionCache);
        this.b = sSLCertificateSocketFactory;
        try {
            sSLCertificateSocketFactory.setTrustManagers(new y1g[]{new y1g(str)});
        } catch (Throwable th) {
            wqi.e(this.a, "failed set tam trust manager to default ssl socket factory", th);
            throw th;
        }
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket() throws IOException {
        SSLCertificateSocketFactory sSLCertificateSocketFactory = this.b;
        Socket socketCreateSocket = sSLCertificateSocketFactory.createSocket();
        sSLCertificateSocketFactory.setUseSessionTickets(socketCreateSocket, true);
        return socketCreateSocket;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final String[] getDefaultCipherSuites() {
        return this.b.getDefaultCipherSuites();
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final String[] getSupportedCipherSuites() {
        return this.b.getSupportedCipherSuites();
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(InetAddress inetAddress, int i) throws IOException {
        SSLCertificateSocketFactory sSLCertificateSocketFactory = this.b;
        Socket socketCreateSocket = sSLCertificateSocketFactory.createSocket(inetAddress, i);
        sSLCertificateSocketFactory.setUseSessionTickets(socketCreateSocket, true);
        return socketCreateSocket;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final Socket createSocket(Socket socket, String str, int i, boolean z) throws IOException {
        SSLCertificateSocketFactory sSLCertificateSocketFactory = this.b;
        Socket socketCreateSocket = sSLCertificateSocketFactory.createSocket(socket, str, i, z);
        sSLCertificateSocketFactory.setUseSessionTickets(socketCreateSocket, true);
        return socketCreateSocket;
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(String str, int i) throws IOException {
        SSLCertificateSocketFactory sSLCertificateSocketFactory = this.b;
        Socket socketCreateSocket = sSLCertificateSocketFactory.createSocket(str, i);
        sSLCertificateSocketFactory.setUseSessionTickets(socketCreateSocket, true);
        return socketCreateSocket;
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(String str, int i, InetAddress inetAddress, int i2) throws IOException {
        SSLCertificateSocketFactory sSLCertificateSocketFactory = this.b;
        Socket socketCreateSocket = sSLCertificateSocketFactory.createSocket(str, i, inetAddress, i2);
        sSLCertificateSocketFactory.setUseSessionTickets(socketCreateSocket, true);
        return socketCreateSocket;
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(InetAddress inetAddress, int i, InetAddress inetAddress2, int i2) throws IOException {
        SSLCertificateSocketFactory sSLCertificateSocketFactory = this.b;
        Socket socketCreateSocket = sSLCertificateSocketFactory.createSocket(inetAddress, i, inetAddress2, i2);
        sSLCertificateSocketFactory.setUseSessionTickets(socketCreateSocket, true);
        return socketCreateSocket;
    }
}
