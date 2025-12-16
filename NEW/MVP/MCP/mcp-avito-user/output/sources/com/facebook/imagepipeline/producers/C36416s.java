package com.facebook.imagepipeline.producers;

import java.util.concurrent.CancellationException;

/* compiled from: DiskCacheReadProducer.java */
/* renamed from: com.facebook.imagepipeline.producers.s, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
class C36416s implements bolts.h<YW0.d, Void> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ m0 f340719a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k0 f340720b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ InterfaceC36410l f340721c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C36418u f340722d;

    public C36416s(C36418u c36418u, m0 m0Var, k0 k0Var, InterfaceC36410l interfaceC36410l) {
        this.f340722d = c36418u;
        this.f340719a = m0Var;
        this.f340720b = k0Var;
        this.f340721c = interfaceC36410l;
    }

    @Override // bolts.h
    public final Void a(bolts.x<YW0.d> xVar) {
        boolean zG2 = xVar.g();
        k0 k0Var = this.f340720b;
        InterfaceC36410l<YW0.d> interfaceC36410l = this.f340721c;
        m0 m0Var = this.f340719a;
        if (zG2 || (xVar.h() && (xVar.e() instanceof CancellationException))) {
            m0Var.f(k0Var, "DiskCacheProducer");
            interfaceC36410l.b();
        } else {
            boolean zH2 = xVar.h();
            C36418u c36418u = this.f340722d;
            if (zH2) {
                m0Var.h(k0Var, "DiskCacheProducer", xVar.e(), null);
                c36418u.f340738d.b(interfaceC36410l, k0Var);
            } else {
                YW0.d dVarF = xVar.f();
                if (dVarF != null) {
                    m0Var.j(k0Var, "DiskCacheProducer", C36418u.c(m0Var, k0Var, true, dVarF.g()));
                    m0Var.b(k0Var, "DiskCacheProducer", true);
                    k0Var.l("disk");
                    interfaceC36410l.d(1.0f);
                    interfaceC36410l.c(1, dVarF);
                    dVarF.close();
                } else {
                    m0Var.j(k0Var, "DiskCacheProducer", C36418u.c(m0Var, k0Var, false, 0));
                    c36418u.f340738d.b(interfaceC36410l, k0Var);
                }
            }
        }
        return null;
    }
}
