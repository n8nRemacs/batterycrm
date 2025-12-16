package com.facebook.imagepipeline.producers;

import com.facebook.imagepipeline.cache.C36374g;
import com.facebook.imagepipeline.cache.C36378k;
import com.facebook.infer.annotation.Nullsafe;

/* compiled from: EncodedProbeProducer.java */
@Nullsafe
/* renamed from: com.facebook.imagepipeline.producers.y, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C36422y implements i0<YW0.d> {

    /* compiled from: EncodedProbeProducer.java */
    /* renamed from: com.facebook.imagepipeline.producers.y$a */
    public static class a extends r<YW0.d, YW0.d> {

        /* renamed from: c, reason: collision with root package name */
        public final k0 f340767c;

        /* renamed from: d, reason: collision with root package name */
        public final C36378k f340768d;

        /* renamed from: e, reason: collision with root package name */
        public final C36378k f340769e;

        /* renamed from: f, reason: collision with root package name */
        public final com.facebook.imagepipeline.cache.o f340770f;

        /* renamed from: g, reason: collision with root package name */
        public final C36374g<com.facebook.cache.common.c> f340771g;

        /* renamed from: h, reason: collision with root package name */
        public final C36374g<com.facebook.cache.common.c> f340772h;

        public a(InterfaceC36410l<YW0.d> interfaceC36410l, k0 k0Var, C36378k c36378k, C36378k c36378k2, com.facebook.imagepipeline.cache.o oVar, C36374g<com.facebook.cache.common.c> c36374g, C36374g<com.facebook.cache.common.c> c36374g2) {
            super(interfaceC36410l);
            this.f340767c = k0Var;
            this.f340768d = c36378k;
            this.f340769e = c36378k2;
            this.f340770f = oVar;
            this.f340771g = c36374g;
            this.f340772h = c36374g2;
        }

        /* JADX WARN: Removed duplicated region for block: B:38:0x0081 A[Catch: all -> 0x0058, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x0058, blocks: (B:3:0x0004, B:12:0x001a, B:15:0x0024, B:18:0x0045, B:20:0x004c, B:22:0x004f, B:24:0x0055, B:28:0x005c, B:27:0x005a, B:36:0x007a, B:32:0x006a, B:33:0x006b, B:35:0x0077, B:38:0x0081, B:19:0x0046), top: B:45:0x0004, inners: #0 }] */
        @Override // com.facebook.imagepipeline.producers.AbstractC36395b
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void i(int r7, @I41.h java.lang.Object r8) {
            /*
                r6 = this;
                YW0.d r8 = (YW0.d) r8
                com.facebook.imagepipeline.producers.k0 r0 = r6.f340767c
                com.facebook.imagepipeline.systrace.b.a()     // Catch: java.lang.Throwable -> L58
                boolean r1 = com.facebook.imagepipeline.producers.AbstractC36395b.f(r7)     // Catch: java.lang.Throwable -> L58
                com.facebook.imagepipeline.producers.l<O> r2 = r6.f340716b
                if (r1 != 0) goto L81
                if (r8 == 0) goto L81
                r1 = r7 & 10
                if (r1 == 0) goto L17
                r1 = 1
                goto L18
            L17:
                r1 = 0
            L18:
                if (r1 != 0) goto L81
                r8.m()     // Catch: java.lang.Throwable -> L58
                RW0.c r1 = r8.f19499c     // Catch: java.lang.Throwable -> L58
                RW0.c r3 = RW0.c.f14507b     // Catch: java.lang.Throwable -> L58
                if (r1 != r3) goto L24
                goto L81
            L24:
                com.facebook.imagepipeline.request.ImageRequest r1 = r0.j()     // Catch: java.lang.Throwable -> L58
                com.facebook.imagepipeline.cache.o r3 = r6.f340770f     // Catch: java.lang.Throwable -> L58
                java.lang.Object r4 = r0.a()     // Catch: java.lang.Throwable -> L58
                com.facebook.cache.common.j r3 = r3.b(r1, r4)     // Catch: java.lang.Throwable -> L58
                com.facebook.imagepipeline.cache.g<com.facebook.cache.common.c> r4 = r6.f340771g     // Catch: java.lang.Throwable -> L58
                r4.a(r3)     // Catch: java.lang.Throwable -> L58
                java.lang.String r4 = "memory_encoded"
                java.lang.Object r5 = r0.f()     // Catch: java.lang.Throwable -> L58
                boolean r4 = r4.equals(r5)     // Catch: java.lang.Throwable -> L58
                com.facebook.imagepipeline.cache.g<com.facebook.cache.common.c> r5 = r6.f340772h
                if (r4 == 0) goto L6b
                monitor-enter(r5)     // Catch: java.lang.Throwable -> L58
                java.util.LinkedHashSet<E> r0 = r5.f340228b     // Catch: java.lang.Throwable -> L68
                boolean r0 = r0.contains(r3)     // Catch: java.lang.Throwable -> L68
                monitor-exit(r5)     // Catch: java.lang.Throwable -> L58
                if (r0 != 0) goto L7a
                com.facebook.imagepipeline.request.ImageRequest$CacheChoice r0 = r1.f340781a     // Catch: java.lang.Throwable -> L58
                com.facebook.imagepipeline.request.ImageRequest$CacheChoice r1 = com.facebook.imagepipeline.request.ImageRequest.CacheChoice.f340795b     // Catch: java.lang.Throwable -> L58
                if (r0 != r1) goto L5a
                com.facebook.imagepipeline.cache.k r0 = r6.f340769e     // Catch: java.lang.Throwable -> L58
                goto L5c
            L58:
                r7 = move-exception
                goto L86
            L5a:
                com.facebook.imagepipeline.cache.k r0 = r6.f340768d     // Catch: java.lang.Throwable -> L58
            L5c:
                r0.getClass()     // Catch: java.lang.Throwable -> L58
                com.facebook.cache.disk.k r0 = r0.f340232a     // Catch: java.lang.Throwable -> L58
                r0.c(r3)     // Catch: java.lang.Throwable -> L58
                r5.a(r3)     // Catch: java.lang.Throwable -> L58
                goto L7a
            L68:
                r7 = move-exception
                monitor-exit(r5)     // Catch: java.lang.Throwable -> L68
                throw r7     // Catch: java.lang.Throwable -> L58
            L6b:
                java.lang.String r1 = "disk"
                java.lang.Object r0 = r0.f()     // Catch: java.lang.Throwable -> L58
                boolean r0 = r1.equals(r0)     // Catch: java.lang.Throwable -> L58
                if (r0 == 0) goto L7a
                r5.a(r3)     // Catch: java.lang.Throwable -> L58
            L7a:
                r2.c(r7, r8)     // Catch: java.lang.Throwable -> L58
            L7d:
                com.facebook.imagepipeline.systrace.b.a()
                goto L85
            L81:
                r2.c(r7, r8)     // Catch: java.lang.Throwable -> L58
                goto L7d
            L85:
                return
            L86:
                com.facebook.imagepipeline.systrace.b.a()
                throw r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.imagepipeline.producers.C36422y.a.i(int, java.lang.Object):void");
        }
    }

    /* JADX WARN: Finally extract failed */
    @Override // com.facebook.imagepipeline.producers.i0
    public final void b(InterfaceC36410l<YW0.d> interfaceC36410l, k0 k0Var) {
        try {
            com.facebook.imagepipeline.systrace.b.a();
            m0 m0VarI = k0Var.i();
            m0VarI.c(k0Var, "EncodedProbeProducer");
            new a(interfaceC36410l, k0Var, null, null, null, null, null);
            m0VarI.j(k0Var, "EncodedProbeProducer", null);
            com.facebook.imagepipeline.systrace.b.a();
            throw null;
        } catch (Throwable th2) {
            com.facebook.imagepipeline.systrace.b.a();
            throw th2;
        }
    }
}
