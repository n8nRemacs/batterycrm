package com.huawei.secure.android.common.ssl;

import android.content.Context;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.security.KeyManagementException;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import org.apache.http.conn.ssl.BrowserCompatHostnameVerifier;
import org.apache.http.conn.ssl.StrictHostnameVerifier;

@Deprecated
/* loaded from: classes7.dex */
public class i extends SSLSocketFactory {

    /* renamed from: d, reason: collision with root package name */
    @Deprecated
    public static final StrictHostnameVerifier f363727d;

    /* renamed from: e, reason: collision with root package name */
    public static volatile i f363728e;

    /* renamed from: a, reason: collision with root package name */
    public SSLContext f363729a;

    /* renamed from: b, reason: collision with root package name */
    public Context f363730b;

    /* renamed from: c, reason: collision with root package name */
    public String[] f363731c;

    static {
        new BrowserCompatHostnameVerifier();
        f363727d = new StrictHostnameVerifier();
        f363728e = null;
    }

    public i(l lVar) throws KeyManagementException {
        this.f363729a = null;
        SSLContext sSLContextC = g.c();
        this.f363729a = sSLContextC;
        sSLContextC.init(null, new X509TrustManager[]{lVar}, null);
    }

    public static i a(Context context) {
        System.currentTimeMillis();
        if (context != null && V01.e.f16866a == null) {
            V01.e.f16866a = context.getApplicationContext();
        }
        if (f363728e == null) {
            synchronized (i.class) {
                try {
                    if (f363728e == null) {
                        i iVar = new i();
                        iVar.f363729a = null;
                        if (context != null) {
                            iVar.f363730b = context.getApplicationContext();
                            iVar.f363729a = g.c();
                            iVar.f363729a.init(null, new X509TrustManager[]{k.a(context)}, null);
                        }
                        f363728e = iVar;
                    }
                } finally {
                }
            }
        }
        if (f363728e.f363730b == null && context != null) {
            i iVar2 = f363728e;
            iVar2.getClass();
            iVar2.f363730b = context.getApplicationContext();
        }
        System.currentTimeMillis();
        return f363728e;
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(String str, int i12) throws IOException {
        Socket socketCreateSocket = this.f363729a.getSocketFactory().createSocket(str, i12);
        if (socketCreateSocket instanceof SSLSocket) {
            SSLSocket sSLSocket = (SSLSocket) socketCreateSocket;
            g.b(sSLSocket);
            g.a(sSLSocket);
            this.f363731c = (String[]) ((SSLSocket) socketCreateSocket).getEnabledCipherSuites().clone();
        }
        return socketCreateSocket;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final String[] getDefaultCipherSuites() {
        return new String[0];
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final String[] getSupportedCipherSuites() {
        String[] strArr = this.f363731c;
        return strArr != null ? strArr : new String[0];
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(InetAddress inetAddress, int i12) {
        return createSocket(inetAddress.getHostAddress(), i12);
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(String str, int i12, InetAddress inetAddress, int i13) {
        return createSocket(str, i12);
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(InetAddress inetAddress, int i12, InetAddress inetAddress2, int i13) {
        return createSocket(inetAddress.getHostAddress(), i12);
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final Socket createSocket(Socket socket, String str, int i12, boolean z12) throws IOException {
        Socket socketCreateSocket = this.f363729a.getSocketFactory().createSocket(socket, str, i12, z12);
        if (socketCreateSocket instanceof SSLSocket) {
            SSLSocket sSLSocket = (SSLSocket) socketCreateSocket;
            g.b(sSLSocket);
            g.a(sSLSocket);
            this.f363731c = (String[]) ((SSLSocket) socketCreateSocket).getEnabledCipherSuites().clone();
        }
        return socketCreateSocket;
    }
}
