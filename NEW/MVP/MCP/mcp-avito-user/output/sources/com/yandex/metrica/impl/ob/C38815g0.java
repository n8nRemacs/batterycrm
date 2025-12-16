package com.yandex.metrica.impl.ob;

/* renamed from: com.yandex.metrica.impl.ob.g0, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
class C38815g0 implements InterfaceC38685ak {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C38865i0 f380610a;

    public C38815g0(C38865i0 c38865i0) {
        this.f380610a = c38865i0;
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC38685ak
    public void a(Zj zj2) {
        C39177uj c39177ujB = zj2.b();
        if (c39177ujB != null) {
            this.f380610a.f380758g.put("cellular_connection_type", c39177ujB.m());
        }
        this.f380610a.f380758g.put("call_state", Integer.valueOf(zj2.a()));
    }
}
