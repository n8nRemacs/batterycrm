package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.tk1;
import java.util.List;

/* loaded from: classes8.dex */
public final class ud1 extends fa1<ne1, List<ne1>> {

    /* renamed from: u, reason: collision with root package name */
    @j.N
    private final hd1 f390517u;

    public ud1(@j.N Context context, @j.N String str, @j.N tk1.b bVar, @j.N ne1 ne1Var, @j.N nm1 nm1Var) {
        super(context, 0, str, bVar, ne1Var, nm1Var);
        this.f390517u = new hd1(context);
    }

    @Override // com.yandex.mobile.ads.impl.fa1
    public final kz0<List<ne1>> a(@j.N zo0 zo0Var, int i12) {
        ed1 ed1VarA = this.f390517u.a(zo0Var);
        if (ed1VarA == null) {
            return kz0.a(new rr0("Can't parse VAST response."));
        }
        List<ne1> listB = ed1VarA.b().b();
        return listB.isEmpty() ? kz0.a(new ms()) : kz0.a(listB, null);
    }
}
