package com.facebook.imagepipeline.cache;

import com.facebook.common.memory.PooledByteBuffer;
import com.facebook.infer.annotation.Nullsafe;

/* compiled from: EncodedMemoryCacheFactory.java */
@Nullsafe
/* loaded from: classes12.dex */
public class z {

    /* compiled from: EncodedMemoryCacheFactory.java */
    public static class a implements J<com.facebook.cache.common.c> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ A f340258a;

        public a(A a12) {
            this.f340258a = a12;
        }

        @Override // com.facebook.imagepipeline.cache.J
        public final void a(com.facebook.cache.common.c cVar) {
            this.f340258a.getClass();
        }

        @Override // com.facebook.imagepipeline.cache.J
        public final void b(com.facebook.cache.common.c cVar) {
            this.f340258a.getClass();
        }

        @Override // com.facebook.imagepipeline.cache.J
        public final void c(com.facebook.cache.common.c cVar) {
            this.f340258a.getClass();
        }
    }

    public static B<com.facebook.cache.common.c, PooledByteBuffer> a(H<com.facebook.cache.common.c, PooledByteBuffer> h12, A a12) {
        a12.getClass();
        return new B<>(h12, new a(a12));
    }
}
