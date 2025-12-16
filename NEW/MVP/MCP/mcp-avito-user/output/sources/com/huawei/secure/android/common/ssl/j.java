package com.huawei.secure.android.common.ssl;

import android.content.Context;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

/* loaded from: classes7.dex */
public class j extends SSLSocketFactory {

    /* renamed from: d, reason: collision with root package name */
    public static volatile j f363732d;

    /* renamed from: a, reason: collision with root package name */
    public SSLContext f363733a;

    /* renamed from: b, reason: collision with root package name */
    public Context f363734b;

    /* renamed from: c, reason: collision with root package name */
    public String[] f363735c;

    @Override // javax.net.SocketFactory
    public final Socket createSocket(String str, int i12) throws IOException {
        Socket socketCreateSocket = this.f363733a.getSocketFactory().createSocket(str, i12);
        if (socketCreateSocket instanceof SSLSocket) {
            SSLSocket sSLSocket = (SSLSocket) socketCreateSocket;
            g.b(sSLSocket);
            g.a(sSLSocket);
            this.f363735c = (String[]) ((SSLSocket) socketCreateSocket).getEnabledCipherSuites().clone();
        }
        return socketCreateSocket;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final String[] getDefaultCipherSuites() {
        return new String[0];
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final String[] getSupportedCipherSuites() {
        String[] strArr = this.f363735c;
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
        Socket socketCreateSocket = this.f363733a.getSocketFactory().createSocket(socket, str, i12, z12);
        if (socketCreateSocket instanceof SSLSocket) {
            SSLSocket sSLSocket = (SSLSocket) socketCreateSocket;
            g.b(sSLSocket);
            g.a(sSLSocket);
            this.f363735c = (String[]) ((SSLSocket) socketCreateSocket).getEnabledCipherSuites().clone();
        }
        return socketCreateSocket;
    }
}
