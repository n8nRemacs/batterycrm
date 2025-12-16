package com.facebook.imagepipeline.producers;

import com.facebook.common.util.TriState;
import com.facebook.infer.annotation.Nullsafe;

/* compiled from: WebpTranscodeProducer.java */
@Nullsafe
/* loaded from: classes15.dex */
public class F0 implements i0<YW0.d> {

    /* compiled from: WebpTranscodeProducer.java */
    public class a extends r<YW0.d, YW0.d> {

        /* renamed from: c, reason: collision with root package name */
        public final k0 f340541c;

        /* renamed from: d, reason: collision with root package name */
        public TriState f340542d;

        public a(InterfaceC36410l<YW0.d> interfaceC36410l, k0 k0Var) {
            super(interfaceC36410l);
            this.f340541c = k0Var;
            this.f340542d = TriState.f339862d;
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x0024  */
        @Override // com.facebook.imagepipeline.producers.AbstractC36395b
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void i(int r12, @I41.h java.lang.Object r13) throws java.lang.Throwable {
            /*
                r11 = this;
                YW0.d r13 = (YW0.d) r13
                com.facebook.common.util.TriState r0 = r11.f340542d
                com.facebook.common.util.TriState r1 = com.facebook.common.util.TriState.f339862d
                com.facebook.common.util.TriState r2 = com.facebook.common.util.TriState.f339861c
                com.facebook.common.util.TriState r3 = com.facebook.common.util.TriState.f339860b
                r4 = 0
                if (r0 != r1) goto L3a
                if (r13 == 0) goto L3a
                java.io.InputStream r0 = r13.f()
                r0.getClass()
                RW0.c r0 = RW0.d.a(r0)     // Catch: java.io.IOException -> L35
                boolean r5 = RW0.b.a(r0)
                if (r5 == 0) goto L2e
                com.facebook.imagepipeline.nativecode.g r0 = com.facebook.imagepipeline.nativecode.h.f340504a
                if (r0 != 0) goto L26
            L24:
                r1 = r2
                goto L32
            L26:
                boolean r0 = r0.a()
                if (r0 != 0) goto L24
                r1 = r3
                goto L32
            L2e:
                RW0.c r5 = RW0.c.f14507b
                if (r0 != r5) goto L24
            L32:
                r11.f340542d = r1
                goto L3a
            L35:
                r12 = move-exception
                com.facebook.common.internal.u.a(r12)
                throw r4
            L3a:
                com.facebook.common.util.TriState r0 = r11.f340542d
                com.facebook.imagepipeline.producers.l<O> r1 = r11.f340716b
                if (r0 != r2) goto L44
                r1.c(r12, r13)
                goto L6b
            L44:
                boolean r0 = com.facebook.imagepipeline.producers.AbstractC36395b.e(r12)
                if (r0 == 0) goto L6b
                com.facebook.common.util.TriState r0 = r11.f340542d
                if (r0 != r3) goto L68
                if (r13 != 0) goto L51
                goto L68
            L51:
                com.facebook.imagepipeline.producers.F0 r6 = com.facebook.imagepipeline.producers.F0.this
                r6.getClass()
                YW0.d r10 = YW0.d.a(r13)
                com.facebook.imagepipeline.producers.E0 r5 = new com.facebook.imagepipeline.producers.E0
                com.facebook.imagepipeline.producers.k0 r9 = r11.f340541c
                com.facebook.imagepipeline.producers.m0 r8 = r9.i()
                com.facebook.imagepipeline.producers.l<O> r7 = r11.f340716b
                r5.<init>(r6, r7, r8, r9, r10)
                throw r4
            L68:
                r1.c(r12, r13)
            L6b:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.imagepipeline.producers.F0.a.i(int, java.lang.Object):void");
        }
    }

    public F0() {
        throw null;
    }

    @Override // com.facebook.imagepipeline.producers.i0
    public final void b(InterfaceC36410l<YW0.d> interfaceC36410l, k0 k0Var) {
        new a(interfaceC36410l, k0Var);
        throw null;
    }
}
