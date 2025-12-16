package com.yandex.metrica.impl.ob;

/* renamed from: com.yandex.metrica.impl.ob.c5, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C38720c5 extends X4 {

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final C38698b8 f380281b;

    public C38720c5(@j.N L3 l32) {
        super(l32);
        this.f380281b = l32.x();
    }

    @Override // com.yandex.metrica.impl.ob.S4
    public boolean a(@j.N C38715c0 c38715c0) {
        L3 l3A = a();
        l3A.e().toString();
        if (!this.f380281b.k() || !l3A.B()) {
            return false;
        }
        l3A.r().d(C38715c0.a(c38715c0, l3A));
        return false;
    }
}
