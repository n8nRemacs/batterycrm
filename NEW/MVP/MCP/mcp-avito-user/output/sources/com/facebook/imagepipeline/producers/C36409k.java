package com.facebook.imagepipeline.producers;

import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.infer.annotation.Nullsafe;

/* compiled from: BranchOnSeparateImagesProducer.java */
@Nullsafe
/* renamed from: com.facebook.imagepipeline.producers.k, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C36409k implements i0<YW0.d> {

    /* renamed from: a, reason: collision with root package name */
    public final s0 f340684a;

    /* renamed from: b, reason: collision with root package name */
    public final z0 f340685b;

    /* compiled from: BranchOnSeparateImagesProducer.java */
    /* renamed from: com.facebook.imagepipeline.producers.k$b */
    public class b extends r<YW0.d, YW0.d> {

        /* renamed from: c, reason: collision with root package name */
        public final k0 f340686c;

        public b() {
            throw null;
        }

        public b(InterfaceC36410l interfaceC36410l, k0 k0Var, a aVar) {
            super(interfaceC36410l);
            this.f340686c = k0Var;
        }

        @Override // com.facebook.imagepipeline.producers.r, com.facebook.imagepipeline.producers.AbstractC36395b
        public final void h(@I41.h Throwable th2) {
            C36409k.this.f340685b.b(this.f340716b, this.f340686c);
        }

        @Override // com.facebook.imagepipeline.producers.AbstractC36395b
        public final void i(int i12, @I41.h Object obj) throws Throwable {
            YW0.d dVar = (YW0.d) obj;
            k0 k0Var = this.f340686c;
            ImageRequest imageRequestJ = k0Var.j();
            boolean zE2 = AbstractC36395b.e(i12);
            boolean zB2 = D0.b(dVar, imageRequestJ.f340786f);
            InterfaceC36410l<O> interfaceC36410l = this.f340716b;
            if (dVar != null && zB2) {
                if (zE2 && zB2) {
                    interfaceC36410l.c(i12, dVar);
                } else {
                    interfaceC36410l.c(i12 & (-2), dVar);
                }
            }
            if (!zE2 || zB2) {
                return;
            }
            YW0.d.b(dVar);
            C36409k.this.f340685b.b(interfaceC36410l, k0Var);
        }
    }

    public C36409k(s0 s0Var, z0 z0Var) {
        this.f340684a = s0Var;
        this.f340685b = z0Var;
    }

    @Override // com.facebook.imagepipeline.producers.i0
    public final void b(InterfaceC36410l<YW0.d> interfaceC36410l, k0 k0Var) {
        this.f340684a.b(new b(interfaceC36410l, k0Var, null), k0Var);
    }
}
