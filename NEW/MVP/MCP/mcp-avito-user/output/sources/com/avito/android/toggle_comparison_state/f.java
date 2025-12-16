package com.avito.android.toggle_comparison_state;

import Uq.InterfaceC15558a;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class f implements l41.s {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f301601b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i f301602c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p f301603d;

    public /* synthetic */ f(i iVar, p pVar, int i12) {
        this.f301601b = i12;
        this.f301602c = iVar;
        this.f301603d = pVar;
    }

    @Override // l41.s
    public final Object get() {
        switch (this.f301601b) {
            case 0:
                InterfaceC15558a interfaceC15558a = this.f301602c.f301608a.get();
                p pVar = this.f301603d;
                return interfaceC15558a.d(pVar.f301626b, pVar.f301625a, pVar.f301630f, pVar.f301627c);
            default:
                InterfaceC15558a interfaceC15558a2 = this.f301602c.f301608a.get();
                p pVar2 = this.f301603d;
                return interfaceC15558a2.a(pVar2.f301625a, pVar2.f301630f, pVar2.f301627c);
        }
    }
}
