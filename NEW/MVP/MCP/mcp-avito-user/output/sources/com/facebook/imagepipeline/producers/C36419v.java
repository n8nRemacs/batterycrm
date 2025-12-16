package com.facebook.imagepipeline.producers;

import com.facebook.imagepipeline.cache.C36378k;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.infer.annotation.Nullsafe;

/* compiled from: DiskCacheWriteProducer.java */
@Nullsafe
/* renamed from: com.facebook.imagepipeline.producers.v, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C36419v implements i0<YW0.d> {

    /* renamed from: a, reason: collision with root package name */
    public final C36378k f340743a;

    /* renamed from: b, reason: collision with root package name */
    public final C36378k f340744b;

    /* renamed from: c, reason: collision with root package name */
    public final com.facebook.imagepipeline.cache.o f340745c;

    /* renamed from: d, reason: collision with root package name */
    public final i0<YW0.d> f340746d;

    /* compiled from: DiskCacheWriteProducer.java */
    /* renamed from: com.facebook.imagepipeline.producers.v$b */
    public static class b extends r<YW0.d, YW0.d> {

        /* renamed from: c, reason: collision with root package name */
        public final k0 f340747c;

        /* renamed from: d, reason: collision with root package name */
        public final C36378k f340748d;

        /* renamed from: e, reason: collision with root package name */
        public final C36378k f340749e;

        /* renamed from: f, reason: collision with root package name */
        public final com.facebook.imagepipeline.cache.o f340750f;

        public b() {
            throw null;
        }

        public b(InterfaceC36410l interfaceC36410l, k0 k0Var, C36378k c36378k, C36378k c36378k2, com.facebook.imagepipeline.cache.o oVar, a aVar) {
            super(interfaceC36410l);
            this.f340747c = k0Var;
            this.f340748d = c36378k;
            this.f340749e = c36378k2;
            this.f340750f = oVar;
        }

        @Override // com.facebook.imagepipeline.producers.AbstractC36395b
        public final void i(int i12, @I41.h Object obj) throws Throwable {
            YW0.d dVar = (YW0.d) obj;
            k0 k0Var = this.f340747c;
            k0Var.i().c(k0Var, "DiskCacheWriteProducer");
            boolean zF2 = AbstractC36395b.f(i12);
            InterfaceC36410l<O> interfaceC36410l = this.f340716b;
            if (!zF2 && dVar != null && (i12 & 10) == 0) {
                dVar.m();
                if (dVar.f19499c != RW0.c.f14507b) {
                    ImageRequest imageRequestJ = k0Var.j();
                    com.facebook.cache.common.j jVarB = this.f340750f.b(imageRequestJ, k0Var.a());
                    if (imageRequestJ.f340781a == ImageRequest.CacheChoice.f340795b) {
                        this.f340749e.d(jVarB, dVar);
                    } else {
                        this.f340748d.d(jVarB, dVar);
                    }
                    k0Var.i().j(k0Var, "DiskCacheWriteProducer", null);
                    interfaceC36410l.c(i12, dVar);
                    return;
                }
            }
            k0Var.i().j(k0Var, "DiskCacheWriteProducer", null);
            interfaceC36410l.c(i12, dVar);
        }
    }

    public C36419v(C36378k c36378k, C36378k c36378k2, com.facebook.imagepipeline.cache.o oVar, i0<YW0.d> i0Var) {
        this.f340743a = c36378k;
        this.f340744b = c36378k2;
        this.f340745c = oVar;
        this.f340746d = i0Var;
    }

    @Override // com.facebook.imagepipeline.producers.i0
    public final void b(InterfaceC36410l<YW0.d> interfaceC36410l, k0 k0Var) {
        if (k0Var.n().f340802b >= 2) {
            k0Var.k("disk", "nil-result_write");
            interfaceC36410l.c(1, null);
        } else {
            k0Var.j().getClass();
            this.f340746d.b(new b(interfaceC36410l, k0Var, this.f340743a, this.f340744b, this.f340745c, null), k0Var);
        }
    }
}
