package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.tk1;

/* loaded from: classes8.dex */
public final class bd1 extends fa1<md1, ed1> {

    /* renamed from: u, reason: collision with root package name */
    @j.N
    private final hd1 f383928u;

    public bd1(@j.N Context context, @j.N String str, @j.N tk1.b bVar, @j.N md1 md1Var, @j.N qd1 qd1Var) {
        super(context, 0, str, bVar, md1Var, qd1Var);
        this.f383928u = new hd1(context);
    }

    @Override // com.yandex.mobile.ads.impl.fa1
    public final kz0<ed1> a(@j.N zo0 zo0Var, int i12) {
        ed1 ed1VarA = this.f383928u.a(zo0Var);
        return ed1VarA != null ? !ed1VarA.b().b().isEmpty() ? kz0.a(ed1VarA, null) : kz0.a(new ms()) : kz0.a(new rr0("Can't parse VAST response."));
    }
}
