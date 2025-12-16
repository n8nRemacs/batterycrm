package com.yandex.mobile.ads.impl;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

/* loaded from: classes8.dex */
public final class lu0 extends SSLSocketFactory {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f387712b = 0;

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    private final SSLSocketFactory f387713a;

    public static final class a {
        public /* synthetic */ a(int i12) {
            this();
        }

        public static final String[] a(SSLSocketFactory sSLSocketFactory) {
            int i12 = lu0.f387712b;
            String[] defaultCipherSuites = sSLSocketFactory.getDefaultCipherSuites();
            ArrayList arrayList = new ArrayList(Arrays.asList(Arrays.copyOf(defaultCipherSuites, defaultCipherSuites.length)));
            arrayList.remove("TLS_RSA_WITH_AES_128_CBC_SHA");
            arrayList.add(0, "TLS_RSA_WITH_AES_128_CBC_SHA");
            return (String[]) arrayList.toArray(new String[0]);
        }

        public static final String[] b(SSLSocketFactory sSLSocketFactory) {
            int i12 = lu0.f387712b;
            String[] supportedCipherSuites = sSLSocketFactory.getSupportedCipherSuites();
            ArrayList arrayList = new ArrayList(Arrays.asList(Arrays.copyOf(supportedCipherSuites, supportedCipherSuites.length)));
            arrayList.remove("TLS_RSA_WITH_AES_128_CBC_SHA");
            arrayList.add(0, "TLS_RSA_WITH_AES_128_CBC_SHA");
            return (String[]) arrayList.toArray(new String[0]);
        }

        private a() {
        }

        @Y61.l
        public static lu0 a() throws NoSuchAlgorithmException, KeyManagementException {
            try {
                SSLContext sSLContext = SSLContext.getInstance("TLSv1");
                try {
                    sSLContext.init(null, null, null);
                } catch (KeyManagementException unused) {
                }
                return new lu0(sSLContext.getSocketFactory());
            } catch (NoSuchAlgorithmException unused2) {
                return null;
            }
        }
    }

    static {
        new a(0);
    }

    public lu0(@Y61.k SSLSocketFactory sSLSocketFactory) {
        this.f387713a = sSLSocketFactory;
    }

    @Override // javax.net.SocketFactory
    @Y61.k
    public final Socket createSocket(@Y61.k String str, int i12) throws IOException {
        Socket socketCreateSocket = this.f387713a.createSocket(str, i12);
        ((SSLSocket) socketCreateSocket).setEnabledCipherSuites(a.a(this.f387713a));
        return socketCreateSocket;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    @Y61.k
    public final String[] getDefaultCipherSuites() {
        return a.a(this.f387713a);
    }

    @Override // javax.net.ssl.SSLSocketFactory
    @Y61.k
    public final String[] getSupportedCipherSuites() {
        return a.b(this.f387713a);
    }

    @Override // javax.net.SocketFactory
    @Y61.k
    public final Socket createSocket(@Y61.k InetAddress inetAddress, int i12) throws IOException {
        Socket socketCreateSocket = this.f387713a.createSocket(inetAddress, i12);
        ((SSLSocket) socketCreateSocket).setEnabledCipherSuites(a.a(this.f387713a));
        return socketCreateSocket;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    @Y61.k
    public final Socket createSocket(@Y61.k Socket socket, @Y61.k String str, int i12, boolean z12) throws IOException {
        Socket socketCreateSocket = this.f387713a.createSocket(socket, str, i12, z12);
        ((SSLSocket) socketCreateSocket).setEnabledCipherSuites(a.a(this.f387713a));
        return socketCreateSocket;
    }

    @Override // javax.net.SocketFactory
    @Y61.k
    public final Socket createSocket(@Y61.k String str, int i12, @Y61.k InetAddress inetAddress, int i13) throws IOException {
        Socket socketCreateSocket = this.f387713a.createSocket(str, i12, inetAddress, i13);
        ((SSLSocket) socketCreateSocket).setEnabledCipherSuites(a.a(this.f387713a));
        return socketCreateSocket;
    }

    @Override // javax.net.SocketFactory
    @Y61.k
    public final Socket createSocket(@Y61.k InetAddress inetAddress, int i12, @Y61.k InetAddress inetAddress2, int i13) throws IOException {
        Socket socketCreateSocket = this.f387713a.createSocket(inetAddress, i12, inetAddress2, i13);
        ((SSLSocket) socketCreateSocket).setEnabledCipherSuites(a.a(this.f387713a));
        return socketCreateSocket;
    }
}
