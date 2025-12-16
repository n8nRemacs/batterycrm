package com.facebook.imagepipeline.producers;

import com.facebook.common.memory.PooledByteBuffer;
import com.facebook.infer.annotation.Nullsafe;

/* compiled from: RemoveImageTransformMetaDataProducer.java */
@Nullsafe
/* loaded from: classes15.dex */
public class p0 implements i0<com.facebook.common.references.a<PooledByteBuffer>> {

    /* compiled from: RemoveImageTransformMetaDataProducer.java */
    public class b extends r<YW0.d, com.facebook.common.references.a<PooledByteBuffer>> {
        public b() {
            throw null;
        }

        public b(p0 p0Var, InterfaceC36410l interfaceC36410l, a aVar) {
            super(interfaceC36410l);
        }

        @Override // com.facebook.imagepipeline.producers.AbstractC36395b
        public final void i(int i12, @I41.h Object obj) {
            YW0.d dVar = (YW0.d) obj;
            try {
                aVarB = YW0.d.k(dVar) ? com.facebook.common.references.a.b(dVar.f19498b) : null;
                this.f340716b.c(i12, aVarB);
            } finally {
                com.facebook.common.references.a.c(aVarB);
            }
        }
    }

    @Override // com.facebook.imagepipeline.producers.i0
    public final void b(InterfaceC36410l<com.facebook.common.references.a<PooledByteBuffer>> interfaceC36410l, k0 k0Var) {
        new b(this, interfaceC36410l, null);
        throw null;
    }
}
