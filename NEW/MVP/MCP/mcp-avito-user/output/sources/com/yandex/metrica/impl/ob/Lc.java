package com.yandex.metrica.impl.ob;

import android.content.Context;
import android.os.Looper;

/* loaded from: classes7.dex */
public class Lc {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    protected final Cc f378787a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final G1 f378788b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private final Ic f378789c;

    public Lc(@j.N Cc cc2) {
        this(cc2, new G1());
    }

    @j.N
    private Ic a() {
        return new Ic();
    }

    @j.k0
    public Lc(@j.N Cc cc2, @j.N G1 g12) {
        this.f378787a = cc2;
        this.f378788b = g12;
        this.f378789c = a();
    }

    @j.N
    public Ec<Xb> a(@j.N Pc pc2, @j.P Xb xb2) {
        Sb sb2 = this.f378787a.f377899a;
        Context context = sb2.f379361a;
        Looper looper = sb2.f379362b.getLooper();
        Cc cc2 = this.f378787a;
        return new Ec<>(new Tc(context, looper, cc2.f377900b, this.f378788b.c(cc2.f377899a.f379363c), "passive", new C39290zc(pc2)), this.f378789c, new Kc(), new Jc(), xb2);
    }
}
