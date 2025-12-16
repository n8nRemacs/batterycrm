package com.yandex.mobile.ads.impl;

import java.util.List;
import javax.net.ssl.SSLSocket;

/* loaded from: classes8.dex */
public final class qp implements d61 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    private final a f389277a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    private d61 f389278b;

    public interface a {
        boolean a(@Y61.k SSLSocket sSLSocket);

        @Y61.k
        v9 b(@Y61.k SSLSocket sSLSocket);
    }

    public qp(@Y61.k u9 u9Var) {
        this.f389277a = u9Var;
    }

    @Override // com.yandex.mobile.ads.impl.d61
    public final boolean a() {
        return true;
    }

    @Override // com.yandex.mobile.ads.impl.d61
    @Y61.l
    public final String b(@Y61.k SSLSocket sSLSocket) {
        d61 d61Var;
        synchronized (this) {
            try {
                if (this.f389278b == null && this.f389277a.a(sSLSocket)) {
                    this.f389278b = this.f389277a.b(sSLSocket);
                }
                d61Var = this.f389278b;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (d61Var != null) {
            return d61Var.b(sSLSocket);
        }
        return null;
    }

    @Override // com.yandex.mobile.ads.impl.d61
    public final boolean a(@Y61.k SSLSocket sSLSocket) {
        return this.f389277a.a(sSLSocket);
    }

    @Override // com.yandex.mobile.ads.impl.d61
    public final void a(@Y61.k SSLSocket sSLSocket, @Y61.l String str, @Y61.k List<? extends sv0> list) {
        d61 d61Var;
        synchronized (this) {
            try {
                if (this.f389278b == null && this.f389277a.a(sSLSocket)) {
                    this.f389278b = this.f389277a.b(sSLSocket);
                }
                d61Var = this.f389278b;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (d61Var != null) {
            d61Var.a(sSLSocket, str, list);
        }
    }
}
