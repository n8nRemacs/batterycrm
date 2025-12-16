package com.huawei.secure.android.common.ssl;

import java.net.InetAddress;
import java.net.Socket;
import javax.net.ssl.SSLSocketFactory;

/* loaded from: classes7.dex */
public class e extends SSLSocketFactory {
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
        throw null;
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
