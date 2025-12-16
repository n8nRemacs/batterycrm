package com.facebook.imagepipeline.producers;

import com.facebook.imagepipeline.cache.C36372e;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.infer.annotation.Nullsafe;

/* compiled from: PostprocessedBitmapMemoryCacheProducer.java */
@Nullsafe
/* loaded from: classes15.dex */
public class Z implements i0<com.facebook.common.references.a<YW0.b>> {

    /* renamed from: a, reason: collision with root package name */
    public final com.facebook.imagepipeline.cache.B f340628a;

    /* renamed from: b, reason: collision with root package name */
    public final com.facebook.imagepipeline.cache.o f340629b;

    /* renamed from: c, reason: collision with root package name */
    public final C36394a0 f340630c;

    /* compiled from: PostprocessedBitmapMemoryCacheProducer.java */
    public static class a extends r<com.facebook.common.references.a<YW0.b>, com.facebook.common.references.a<YW0.b>> {

        /* renamed from: c, reason: collision with root package name */
        public final com.facebook.cache.common.c f340631c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f340632d;

        /* renamed from: e, reason: collision with root package name */
        public final com.facebook.imagepipeline.cache.B f340633e;

        /* renamed from: f, reason: collision with root package name */
        public final boolean f340634f;

        public a(com.facebook.cache.common.c cVar, com.facebook.imagepipeline.cache.B b12, InterfaceC36410l interfaceC36410l, boolean z12, boolean z13) {
            super(interfaceC36410l);
            this.f340631c = cVar;
            this.f340632d = z12;
            this.f340633e = b12;
            this.f340634f = z13;
        }

        @Override // com.facebook.imagepipeline.producers.AbstractC36395b
        public final void i(int i12, @I41.h Object obj) {
            com.facebook.common.references.a aVar = (com.facebook.common.references.a) obj;
            InterfaceC36410l<O> interfaceC36410l = this.f340716b;
            if (aVar == null) {
                if (AbstractC36395b.e(i12)) {
                    interfaceC36410l.c(i12, null);
                }
            } else if (!AbstractC36395b.f(i12) || this.f340632d) {
                com.facebook.common.references.a aVarB = this.f340634f ? this.f340633e.b(this.f340631c, aVar) : null;
                try {
                    interfaceC36410l.d(1.0f);
                    if (aVarB != null) {
                        aVar = aVarB;
                    }
                    interfaceC36410l.c(i12, aVar);
                } finally {
                    com.facebook.common.references.a.c(aVarB);
                }
            }
        }
    }

    public Z(com.facebook.imagepipeline.cache.B b12, com.facebook.imagepipeline.cache.o oVar, C36394a0 c36394a0) {
        this.f340628a = b12;
        this.f340629b = oVar;
        this.f340630c = c36394a0;
    }

    @Override // com.facebook.imagepipeline.producers.i0
    public final void b(InterfaceC36410l<com.facebook.common.references.a<YW0.b>> interfaceC36410l, k0 k0Var) {
        m0 m0VarI = k0Var.i();
        ImageRequest imageRequestJ = k0Var.j();
        Object objA = k0Var.a();
        com.facebook.imagepipeline.request.a aVar = imageRequestJ.f340793m;
        C36394a0 c36394a0 = this.f340630c;
        if (aVar == null || aVar.a() == null) {
            c36394a0.b(interfaceC36410l, k0Var);
            return;
        }
        m0VarI.c(k0Var, "PostprocessedBitmapMemoryCacheProducer");
        C36372e c36372eA = this.f340629b.a(imageRequestJ, objA);
        k0Var.j().getClass();
        com.facebook.common.references.a aVar2 = this.f340628a.get(c36372eA);
        if (aVar2 == null) {
            k0Var.j().getClass();
            a aVar3 = new a(c36372eA, this.f340628a, interfaceC36410l, aVar instanceof com.facebook.imagepipeline.request.e, true);
            m0VarI.j(k0Var, "PostprocessedBitmapMemoryCacheProducer", m0VarI.d(k0Var, "PostprocessedBitmapMemoryCacheProducer") ? com.facebook.common.internal.k.a("cached_value_found", "false") : null);
            c36394a0.b(aVar3, k0Var);
            return;
        }
        m0VarI.j(k0Var, "PostprocessedBitmapMemoryCacheProducer", m0VarI.d(k0Var, "PostprocessedBitmapMemoryCacheProducer") ? com.facebook.common.internal.k.a("cached_value_found", "true") : null);
        m0VarI.b(k0Var, "PostprocessedBitmapMemoryCacheProducer", true);
        k0Var.k("memory_bitmap", "postprocessed");
        interfaceC36410l.d(1.0f);
        interfaceC36410l.c(1, aVar2);
        aVar2.close();
    }
}
