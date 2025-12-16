package com.facebook.imagepipeline.producers;

/* compiled from: WebpTranscodeProducer.java */
/* loaded from: classes15.dex */
class E0 extends u0<YW0.d> {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ YW0.d f340537g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ F0 f340538h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E0(F0 f02, InterfaceC36410l interfaceC36410l, m0 m0Var, k0 k0Var, YW0.d dVar) {
        super(interfaceC36410l, m0Var, k0Var, "WebpTranscodeProducer");
        this.f340538h = f02;
        this.f340537g = dVar;
    }

    @Override // com.facebook.common.executors.h
    public final void b(Object obj) {
        YW0.d.b((YW0.d) obj);
    }

    @Override // com.facebook.common.executors.h
    public final Object c() {
        this.f340538h.getClass();
        throw null;
    }

    @Override // com.facebook.imagepipeline.producers.u0, com.facebook.common.executors.h
    public final void d() {
        YW0.d.b(this.f340537g);
        super.d();
    }

    @Override // com.facebook.imagepipeline.producers.u0, com.facebook.common.executors.h
    public final void e(Exception exc) {
        YW0.d.b(this.f340537g);
        super.e(exc);
    }

    @Override // com.facebook.imagepipeline.producers.u0, com.facebook.common.executors.h
    public final void f(Object obj) {
        YW0.d.b(this.f340537g);
        super.f((YW0.d) obj);
    }
}
