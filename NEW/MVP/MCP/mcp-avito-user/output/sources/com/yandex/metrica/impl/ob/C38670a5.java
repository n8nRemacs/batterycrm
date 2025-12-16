package com.yandex.metrica.impl.ob;

/* renamed from: com.yandex.metrica.impl.ob.a5, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C38670a5 extends X4 {

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final C38698b8 f380108b;

    public C38670a5(@j.N L3 l32) {
        this(l32, l32.x());
    }

    @Override // com.yandex.metrica.impl.ob.S4
    public boolean a(@j.N C38715c0 c38715c0) {
        L3 l3A = a();
        if (this.f380108b.k()) {
            return false;
        }
        if (!this.f380108b.l()) {
            l3A.r().a(C38715c0.b(c38715c0));
        }
        this.f380108b.a(true);
        return false;
    }

    @j.k0
    public C38670a5(@j.N L3 l32, @j.N C38698b8 c38698b8) {
        super(l32);
        this.f380108b = c38698b8;
    }
}
