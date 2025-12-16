package com.yandex.metrica.impl.ob;

/* loaded from: classes7.dex */
public class R4 extends X4 {

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final C38698b8 f379281b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private final C38812fm f379282c;

    public R4(@j.N L3 l32) {
        this(l32, l32.x(), C38812fm.c());
    }

    @Override // com.yandex.metrica.impl.ob.S4
    public boolean a(@j.N C38715c0 c38715c0) {
        L3 l3A = a();
        if (this.f379281b.k() || this.f379281b.l()) {
            return false;
        }
        if (l3A.m().P()) {
            this.f379282c.b();
        }
        a().j().a();
        return false;
    }

    @j.k0
    public R4(@j.N L3 l32, @j.N C38698b8 c38698b8, @j.N C38812fm c38812fm) {
        super(l32);
        this.f379281b = c38698b8;
        this.f379282c = c38812fm;
    }
}
