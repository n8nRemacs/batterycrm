package com.yandex.mobile.ads.impl;

import java.io.IOException;

/* loaded from: classes8.dex */
public final class v00 extends k81 {

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ u00 f390644e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ b10 f390645f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v00(String str, u00 u00Var, b10 b10Var) {
        super(str, true);
        this.f390644e = u00Var;
        this.f390645f = b10Var;
    }

    @Override // com.yandex.mobile.ads.impl.k81
    public final long e() {
        try {
            this.f390644e.e().a(this.f390645f);
            return -1L;
        } catch (IOException e12) {
            ts0 ts0Var = ts0.f390301a;
            StringBuilder sbA = Cif.a("Http2Connection.Listener failure for ");
            sbA.append(this.f390644e.c());
            String string = sbA.toString();
            ts0Var.getClass();
            ts0.a(4, string, e12);
            try {
                this.f390645f.a(xs.f391800c, e12);
                return -1L;
            } catch (IOException unused) {
                return -1L;
            }
        }
    }
}
