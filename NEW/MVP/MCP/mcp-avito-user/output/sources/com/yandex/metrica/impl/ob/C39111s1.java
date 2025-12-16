package com.yandex.metrica.impl.ob;

/* renamed from: com.yandex.metrica.impl.ob.s1, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
class C39111s1 implements InterfaceC38967m3<C39066q3> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C39087r1 f381815a;

    public C39111s1(C39087r1 c39087r1) {
        this.f381815a = c39087r1;
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC38967m3
    public boolean a(C38992n3 c38992n3) {
        return !this.f381815a.f381701c.getPackageName().equals(((C39066q3) c38992n3).f381448a);
    }
}
