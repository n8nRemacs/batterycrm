package com.yandex.metrica.impl.ob;

/* loaded from: classes7.dex */
class E2 implements InterfaceC38986mm<C38737cm> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Throwable f378000a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f378001b;

    public E2(D2 d22, Throwable th2, String str) {
        this.f378000a = th2;
        this.f378001b = str;
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC38986mm
    public void b(C38737cm c38737cm) {
        C38737cm c38737cm2 = c38737cm;
        if (c38737cm2.isEnabled()) {
            c38737cm2.e(this.f378000a, this.f378001b);
        }
    }
}
