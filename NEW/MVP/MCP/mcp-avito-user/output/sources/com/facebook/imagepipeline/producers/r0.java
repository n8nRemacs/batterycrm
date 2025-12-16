package com.facebook.imagepipeline.producers;

import com.facebook.imagepipeline.producers.s0;

/* compiled from: ResizeAndRotateProducer.java */
/* loaded from: classes15.dex */
class r0 extends C36401e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InterfaceC36410l f340717a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s0.a f340718b;

    public r0(s0.a aVar, InterfaceC36410l interfaceC36410l) {
        this.f340718b = aVar;
        this.f340717a = interfaceC36410l;
    }

    @Override // com.facebook.imagepipeline.producers.C36401e, com.facebook.imagepipeline.producers.l0
    public final void a() {
        s0.a aVar = this.f340718b;
        if (aVar.f340730e.h()) {
            aVar.f340732g.c();
        }
    }

    @Override // com.facebook.imagepipeline.producers.C36401e, com.facebook.imagepipeline.producers.l0
    public final void c() {
        YW0.d dVar;
        s0.a aVar = this.f340718b;
        I i12 = aVar.f340732g;
        synchronized (i12) {
            dVar = i12.f340550e;
            i12.f340550e = null;
            i12.f340551f = 0;
        }
        YW0.d.b(dVar);
        aVar.f340731f = true;
        this.f340717a.b();
    }
}
