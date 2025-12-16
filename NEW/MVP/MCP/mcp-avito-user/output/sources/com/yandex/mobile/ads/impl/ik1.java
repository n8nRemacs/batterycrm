package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.text.TextUtils;
import com.yandex.mobile.ads.impl.r2;
import com.yandex.mobile.ads.impl.tk1;

/* loaded from: classes8.dex */
public final class ik1 extends fa1<jk1, ek1> {

    /* renamed from: u, reason: collision with root package name */
    @j.N
    private final hk1 f386508u;

    /* renamed from: v, reason: collision with root package name */
    @j.N
    private final rk1 f386509v;

    public ik1(@j.N Context context, @j.N String str, @j.N tk1.b bVar, @j.N jk1 jk1Var, @j.N nk1 nk1Var) {
        super(context, 0, str, bVar, jk1Var, nk1Var);
        this.f386508u = new hk1();
        this.f386509v = yo0.a();
    }

    @Override // com.yandex.mobile.ads.impl.fa1
    @j.N
    public final kz0<ek1> a(@j.N zo0 zo0Var, int i12) {
        byte[] bArr;
        if (200 != i12 || (bArr = zo0Var.f392316b) == null || bArr.length == 0) {
            int i13 = r2.f389360c;
            return kz0.a(new ok1(x2.a(null, r2.a.a(zo0Var).a()).b()));
        }
        String strA = this.f386509v.a(zo0Var);
        if (TextUtils.isEmpty(strA)) {
            return kz0.a(new rr0("Can't parse VMAP response"));
        }
        try {
            return kz0.a(this.f386508u.a(strA), null);
        } catch (Exception e12) {
            return kz0.a(new rr0(e12));
        }
    }
}
