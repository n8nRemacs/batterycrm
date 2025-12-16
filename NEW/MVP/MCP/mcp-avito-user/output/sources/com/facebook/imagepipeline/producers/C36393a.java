package com.facebook.imagepipeline.producers;

import com.facebook.infer.annotation.Nullsafe;

/* compiled from: AddImageTransformMetaDataProducer.java */
@Nullsafe
/* renamed from: com.facebook.imagepipeline.producers.a, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C36393a implements i0<YW0.d> {

    /* renamed from: a, reason: collision with root package name */
    public final i0<YW0.d> f340635a;

    /* compiled from: AddImageTransformMetaDataProducer.java */
    /* renamed from: com.facebook.imagepipeline.producers.a$b */
    public static class b extends r<YW0.d, YW0.d> {
        public b() {
            throw null;
        }

        public b(InterfaceC36410l interfaceC36410l, C10538a c10538a) {
            super(interfaceC36410l);
        }

        @Override // com.facebook.imagepipeline.producers.AbstractC36395b
        public final void i(int i12, @I41.h Object obj) throws Throwable {
            YW0.d dVar = (YW0.d) obj;
            InterfaceC36410l<O> interfaceC36410l = this.f340716b;
            if (dVar == null) {
                interfaceC36410l.c(i12, null);
                return;
            }
            if (!YW0.d.i(dVar)) {
                dVar.h();
            }
            interfaceC36410l.c(i12, dVar);
        }
    }

    public C36393a(i0<YW0.d> i0Var) {
        this.f340635a = i0Var;
    }

    @Override // com.facebook.imagepipeline.producers.i0
    public final void b(InterfaceC36410l<YW0.d> interfaceC36410l, k0 k0Var) {
        this.f340635a.b(new b(interfaceC36410l, null), k0Var);
    }
}
