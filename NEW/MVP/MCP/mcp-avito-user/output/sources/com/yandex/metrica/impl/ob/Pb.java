package com.yandex.metrica.impl.ob;

import android.content.Context;
import android.os.Looper;

/* loaded from: classes7.dex */
public abstract class Pb {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    protected final C38774e9 f379162a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    protected final Cc f379163b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    protected final G1 f379164c;

    /* renamed from: d, reason: collision with root package name */
    @j.N
    private final InterfaceC38827gc f379165d;

    /* renamed from: e, reason: collision with root package name */
    @j.N
    private final Mb f379166e;

    /* renamed from: f, reason: collision with root package name */
    @j.N
    private final Nb f379167f;

    public Pb(@j.N Cc cc2, @j.N C38774e9 c38774e9, @j.N G1 g12) {
        this.f379163b = cc2;
        this.f379162a = c38774e9;
        this.f379164c = g12;
        InterfaceC38827gc interfaceC38827gcA = a();
        this.f379165d = interfaceC38827gcA;
        this.f379166e = new Mb(interfaceC38827gcA, c());
        this.f379167f = new Nb(cc2.f377899a.f379362b);
    }

    @j.N
    public Ec<Xb> a(@j.N Pc pc2, @j.P Xb xb2) {
        Sb sb2 = this.f379163b.f377899a;
        Context context = sb2.f379361a;
        Looper looper = sb2.f379362b.getLooper();
        Cc cc2 = this.f379163b;
        return new Ec<>(new Tc(context, looper, cc2.f377900b, a(cc2.f377899a.f379363c), b(), new C39290zc(pc2)), this.f379166e, new Ob(this.f379165d, new com.yandex.metrica.coreutils.services.e()), this.f379167f, xb2);
    }

    @j.N
    public abstract InterfaceC38827gc a();

    @j.N
    public abstract InterfaceC39291zd a(@j.N C39267yd c39267yd);

    @j.N
    public abstract String b();

    @j.N
    public abstract String c();
}
