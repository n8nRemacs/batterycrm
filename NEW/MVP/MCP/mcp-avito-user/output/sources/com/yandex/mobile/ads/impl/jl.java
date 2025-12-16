package com.yandex.mobile.ads.impl;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.UnknownServiceException;
import java.security.cert.CertificateException;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocket;

/* loaded from: classes8.dex */
public final class jl {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    private final List<il> f386910a;

    /* renamed from: b, reason: collision with root package name */
    private int f386911b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f386912c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f386913d;

    public jl(@Y61.k List<il> list) {
        this.f386910a = list;
    }

    @Y61.k
    public final il a(@Y61.k SSLSocket sSLSocket) throws UnknownServiceException {
        boolean z12;
        il ilVar;
        int i12 = this.f386911b;
        int size = this.f386910a.size();
        while (true) {
            z12 = true;
            if (i12 >= size) {
                ilVar = null;
                break;
            }
            ilVar = this.f386910a.get(i12);
            if (ilVar.a(sSLSocket)) {
                this.f386911b = i12 + 1;
                break;
            }
            i12++;
        }
        if (ilVar == null) {
            StringBuilder sbA = Cif.a("Unable to find acceptable protocols. isFallback=");
            sbA.append(this.f386913d);
            sbA.append(", modes=");
            sbA.append(this.f386910a);
            sbA.append(", supported protocols=");
            sbA.append(Arrays.toString(sSLSocket.getEnabledProtocols()));
            throw new UnknownServiceException(sbA.toString());
        }
        int i13 = this.f386911b;
        int size2 = this.f386910a.size();
        while (true) {
            if (i13 >= size2) {
                z12 = false;
                break;
            }
            if (this.f386910a.get(i13).a(sSLSocket)) {
                break;
            }
            i13++;
        }
        this.f386912c = z12;
        ilVar.a(sSLSocket, this.f386913d);
        return ilVar;
    }

    public final boolean a(@Y61.k IOException iOException) {
        this.f386913d = true;
        return (!this.f386912c || (iOException instanceof ProtocolException) || (iOException instanceof InterruptedIOException) || ((iOException instanceof SSLHandshakeException) && (iOException.getCause() instanceof CertificateException)) || (iOException instanceof SSLPeerUnverifiedException) || !(iOException instanceof SSLException)) ? false : true;
    }
}
