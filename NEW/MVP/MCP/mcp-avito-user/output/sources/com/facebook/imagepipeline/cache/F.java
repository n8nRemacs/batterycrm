package com.facebook.imagepipeline.cache;

import com.facebook.imagepipeline.cache.s;

/* compiled from: LruCountingMemoryCache.java */
/* loaded from: classes12.dex */
class F implements com.facebook.common.references.h<Object> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ s.a f340199a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ G f340200b;

    public F(G g12, s.a aVar) {
        this.f340200b = g12;
        this.f340199a = aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x003c  */
    @Override // com.facebook.common.references.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(java.lang.Object r5) {
        /*
            r4 = this;
            com.facebook.imagepipeline.cache.G r5 = r4.f340200b
            com.facebook.imagepipeline.cache.s$a r0 = r4.f340199a
            r5.getClass()
            monitor-enter(r5)
            monitor-enter(r5)     // Catch: java.lang.Throwable -> L4d
            int r1 = r0.f340251c     // Catch: java.lang.Throwable -> L51
            r2 = 0
            r3 = 1
            if (r1 <= 0) goto L11
            r1 = r3
            goto L12
        L11:
            r1 = r2
        L12:
            com.facebook.common.internal.o.d(r1)     // Catch: java.lang.Throwable -> L51
            int r1 = r0.f340251c     // Catch: java.lang.Throwable -> L51
            int r1 = r1 - r3
            r0.f340251c = r1     // Catch: java.lang.Throwable -> L51
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L4d
            monitor-enter(r5)     // Catch: java.lang.Throwable -> L4d
            boolean r1 = r0.f340252d     // Catch: java.lang.Throwable -> L2e
            if (r1 != 0) goto L30
            int r1 = r0.f340251c     // Catch: java.lang.Throwable -> L2e
            if (r1 != 0) goto L30
            com.facebook.imagepipeline.cache.r<K, com.facebook.imagepipeline.cache.s$a<K, V>> r1 = r5.f340202b     // Catch: java.lang.Throwable -> L2e
            K r2 = r0.f340249a     // Catch: java.lang.Throwable -> L2e
            r1.c(r2, r0)     // Catch: java.lang.Throwable -> L2e
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L4d
            r2 = r3
            goto L31
        L2e:
            r0 = move-exception
            goto L4f
        L30:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L4d
        L31:
            com.facebook.common.references.a r1 = r5.i(r0)     // Catch: java.lang.Throwable -> L4d
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L4d
            com.facebook.common.references.a.c(r1)
            if (r2 == 0) goto L3c
            goto L3d
        L3c:
            r0 = 0
        L3d:
            if (r0 == 0) goto L46
            com.facebook.imagepipeline.cache.s$b<K> r0 = r0.f340253e
            if (r0 == 0) goto L46
            r0.a()
        L46:
            r5.g()
            r5.f()
            return
        L4d:
            r0 = move-exception
            goto L54
        L4f:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L2e
            throw r0     // Catch: java.lang.Throwable -> L4d
        L51:
            r0 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L51
            throw r0     // Catch: java.lang.Throwable -> L4d
        L54:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L4d
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.imagepipeline.cache.F.a(java.lang.Object):void");
    }
}
