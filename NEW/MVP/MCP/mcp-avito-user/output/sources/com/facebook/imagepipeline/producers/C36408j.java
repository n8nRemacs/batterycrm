package com.facebook.imagepipeline.producers;

import com.facebook.imagepipeline.cache.C36374g;
import com.facebook.imagepipeline.cache.C36378k;
import com.facebook.infer.annotation.Nullsafe;

/* compiled from: BitmapProbeProducer.java */
@Nullsafe
/* renamed from: com.facebook.imagepipeline.producers.j, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C36408j implements i0<com.facebook.common.references.a<YW0.b>> {

    /* compiled from: BitmapProbeProducer.java */
    /* renamed from: com.facebook.imagepipeline.producers.j$a */
    public static class a extends r<com.facebook.common.references.a<YW0.b>, com.facebook.common.references.a<YW0.b>> {

        /* renamed from: c, reason: collision with root package name */
        public final k0 f340682c;

        /* renamed from: d, reason: collision with root package name */
        public final com.facebook.imagepipeline.cache.o f340683d;

        public a(InterfaceC36410l interfaceC36410l, k0 k0Var, com.facebook.imagepipeline.cache.B b12, C36378k c36378k, C36378k c36378k2, com.facebook.imagepipeline.cache.o oVar, C36374g c36374g, C36374g c36374g2) {
            super(interfaceC36410l);
            this.f340682c = k0Var;
            this.f340683d = oVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x0058 A[Catch: all -> 0x004f, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x004f, blocks: (B:3:0x0004, B:13:0x001b, B:15:0x0030, B:17:0x0038, B:20:0x0051, B:22:0x0058), top: B:27:0x0004 }] */
        @Override // com.facebook.imagepipeline.producers.AbstractC36395b
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void i(int r6, @I41.h java.lang.Object r7) {
            /*
                r5 = this;
                com.facebook.common.references.a r7 = (com.facebook.common.references.a) r7
                com.facebook.imagepipeline.producers.k0 r0 = r5.f340682c
                com.facebook.imagepipeline.systrace.b.a()     // Catch: java.lang.Throwable -> L4f
                boolean r1 = com.facebook.imagepipeline.producers.AbstractC36395b.f(r6)     // Catch: java.lang.Throwable -> L4f
                com.facebook.imagepipeline.producers.l<O> r2 = r5.f340716b
                if (r1 != 0) goto L58
                if (r7 == 0) goto L58
                r1 = r6 & 8
                if (r1 == 0) goto L17
                r1 = 1
                goto L18
            L17:
                r1 = 0
            L18:
                if (r1 == 0) goto L1b
                goto L58
            L1b:
                com.facebook.imagepipeline.request.ImageRequest r1 = r0.j()     // Catch: java.lang.Throwable -> L4f
                com.facebook.imagepipeline.cache.o r3 = r5.f340683d     // Catch: java.lang.Throwable -> L4f
                java.lang.Object r4 = r0.a()     // Catch: java.lang.Throwable -> L4f
                r3.b(r1, r4)     // Catch: java.lang.Throwable -> L4f
                java.lang.Object r1 = r0.f()     // Catch: java.lang.Throwable -> L4f
                java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> L4f
                if (r1 == 0) goto L51
                java.lang.String r3 = "memory_bitmap"
                boolean r1 = r1.equals(r3)     // Catch: java.lang.Throwable -> L4f
                if (r1 == 0) goto L51
                com.facebook.imagepipeline.core.s r1 = r0.c()     // Catch: java.lang.Throwable -> L4f
                com.facebook.imagepipeline.core.t r1 = r1.a()     // Catch: java.lang.Throwable -> L4f
                r1.getClass()     // Catch: java.lang.Throwable -> L4f
                com.facebook.imagepipeline.core.s r0 = r0.c()     // Catch: java.lang.Throwable -> L4f
                com.facebook.imagepipeline.core.t r0 = r0.a()     // Catch: java.lang.Throwable -> L4f
                r0.getClass()     // Catch: java.lang.Throwable -> L4f
                goto L51
            L4f:
                r6 = move-exception
                goto L5d
            L51:
                r2.c(r6, r7)     // Catch: java.lang.Throwable -> L4f
            L54:
                com.facebook.imagepipeline.systrace.b.a()
                goto L5c
            L58:
                r2.c(r6, r7)     // Catch: java.lang.Throwable -> L4f
                goto L54
            L5c:
                return
            L5d:
                com.facebook.imagepipeline.systrace.b.a()
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.imagepipeline.producers.C36408j.a.i(int, java.lang.Object):void");
        }
    }

    /* JADX WARN: Finally extract failed */
    @Override // com.facebook.imagepipeline.producers.i0
    public final void b(InterfaceC36410l<com.facebook.common.references.a<YW0.b>> interfaceC36410l, k0 k0Var) {
        try {
            com.facebook.imagepipeline.systrace.b.a();
            m0 m0VarI = k0Var.i();
            m0VarI.c(k0Var, "BitmapProbeProducer");
            new a(interfaceC36410l, k0Var, null, null, null, null, null, null);
            m0VarI.j(k0Var, "BitmapProbeProducer", null);
            com.facebook.imagepipeline.systrace.b.a();
            throw null;
        } catch (Throwable th2) {
            com.facebook.imagepipeline.systrace.b.a();
            throw th2;
        }
    }
}
