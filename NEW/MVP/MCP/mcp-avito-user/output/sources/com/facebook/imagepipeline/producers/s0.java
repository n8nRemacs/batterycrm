package com.facebook.imagepipeline.producers;

import cX0.C27119b;
import cX0.C27123f;
import com.facebook.infer.annotation.Nullsafe;
import java.util.HashMap;
import java.util.concurrent.Executor;

/* compiled from: ResizeAndRotateProducer.java */
@Nullsafe
/* loaded from: classes15.dex */
public class s0 implements i0<YW0.d> {

    /* renamed from: a, reason: collision with root package name */
    public final Executor f340723a;

    /* renamed from: b, reason: collision with root package name */
    public final wW0.g f340724b;

    /* renamed from: c, reason: collision with root package name */
    public final i0<YW0.d> f340725c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f340726d;

    /* renamed from: e, reason: collision with root package name */
    public final C27123f f340727e;

    /* compiled from: ResizeAndRotateProducer.java */
    public class a extends r<YW0.d, YW0.d> {

        /* renamed from: c, reason: collision with root package name */
        public final boolean f340728c;

        /* renamed from: d, reason: collision with root package name */
        public final C27123f f340729d;

        /* renamed from: e, reason: collision with root package name */
        public final k0 f340730e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f340731f;

        /* renamed from: g, reason: collision with root package name */
        public final I f340732g;

        public a(InterfaceC36410l interfaceC36410l, k0 k0Var, boolean z12, C27123f c27123f) {
            super(interfaceC36410l);
            this.f340731f = false;
            this.f340730e = k0Var;
            k0Var.j().getClass();
            this.f340728c = z12;
            this.f340729d = c27123f;
            this.f340732g = new I(s0.this.f340723a, new q0(this));
            k0Var.b(new r0(this, interfaceC36410l));
        }

        /* JADX WARN: Removed duplicated region for block: B:25:0x0071  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0074  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x0082  */
        @Override // com.facebook.imagepipeline.producers.AbstractC36395b
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void i(int r14, @I41.h java.lang.Object r15) throws java.lang.Throwable {
            /*
                r13 = this;
                YW0.d r15 = (YW0.d) r15
                boolean r0 = r13.f340731f
                if (r0 == 0) goto L8
                goto Ld6
            L8:
                boolean r0 = com.facebook.imagepipeline.producers.AbstractC36395b.e(r14)
                r1 = 1
                com.facebook.imagepipeline.producers.l<O> r2 = r13.f340716b
                if (r15 != 0) goto L19
                if (r0 == 0) goto Ld6
                r14 = 0
                r2.c(r1, r14)
                goto Ld6
            L19:
                r15.m()
                RW0.c r3 = r15.f19499c
                com.facebook.imagepipeline.producers.k0 r4 = r13.f340730e
                com.facebook.imagepipeline.request.ImageRequest r5 = r4.j()
                cX0.f r6 = r13.f340729d
                boolean r7 = r13.f340728c
                cX0.c r6 = r6.createImageTranscoder(r3, r7)
                r15.m()
                RW0.c r7 = r15.f19499c
                RW0.c r8 = RW0.c.f14507b
                com.facebook.common.util.TriState r9 = com.facebook.common.util.TriState.f339862d
                com.facebook.common.util.TriState r10 = com.facebook.common.util.TriState.f339860b
                r11 = 0
                if (r7 != r8) goto L3c
                r8 = r9
                goto L83
            L3c:
                r15.m()
                RW0.c r7 = r15.f19499c
                boolean r7 = r6.c(r7)
                com.facebook.common.util.TriState r8 = com.facebook.common.util.TriState.f339861c
                if (r7 != 0) goto L4a
                goto L83
            L4a:
                UW0.e r7 = r5.f340787g
                boolean r12 = r7.f16418a
                if (r12 != 0) goto L71
                int r12 = cX0.C27122e.b(r7, r15)
                if (r12 != 0) goto L6f
                boolean r7 = r7.f16418a
                if (r7 == 0) goto L5e
                r15.f19501e = r11
                r7 = r11
                goto L6d
            L5e:
                com.facebook.common.internal.j<java.lang.Integer> r7 = cX0.C27122e.f57919a
                r15.m()
                int r12 = r15.f19501e
                java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
                boolean r7 = r7.contains(r12)
            L6d:
                if (r7 == 0) goto L71
            L6f:
                r7 = r1
                goto L72
            L71:
                r7 = r11
            L72:
                if (r7 != 0) goto L80
                UW0.e r7 = r5.f340787g
                UW0.d r5 = r5.f340786f
                boolean r5 = r6.d(r15, r7, r5)
                if (r5 == 0) goto L7f
                goto L80
            L7f:
                r1 = r11
            L80:
                if (r1 == 0) goto L83
                r8 = r10
            L83:
                if (r0 != 0) goto L88
                if (r8 != r9) goto L88
                goto Ld6
            L88:
                if (r8 == r10) goto Lc2
                RW0.c r0 = RW0.b.f14495a
                if (r3 == r0) goto L9d
                RW0.c r0 = RW0.b.f14505k
                if (r3 != r0) goto L93
                goto L9d
            L93:
                com.facebook.imagepipeline.request.ImageRequest r0 = r4.j()
                UW0.e r0 = r0.f340787g
                r0.getClass()
                goto Lbe
            L9d:
                com.facebook.imagepipeline.request.ImageRequest r0 = r4.j()
                UW0.e r0 = r0.f340787g
                boolean r0 = r0.f16418a
                if (r0 != 0) goto Lbe
                r15.m()
                int r0 = r15.f19500d
                if (r0 == 0) goto Lbe
                r15.m()
                int r0 = r15.f19500d
                r1 = -1
                if (r0 == r1) goto Lbe
                YW0.d r15 = YW0.d.a(r15)
                if (r15 == 0) goto Lbe
                r15.f19500d = r11
            Lbe:
                r2.c(r14, r15)
                goto Ld6
            Lc2:
                com.facebook.imagepipeline.producers.I r1 = r13.f340732g
                boolean r14 = r1.e(r15, r14)
                if (r14 != 0) goto Lcb
                goto Ld6
            Lcb:
                if (r0 != 0) goto Ld3
                boolean r14 = r4.h()
                if (r14 == 0) goto Ld6
            Ld3:
                r1.c()
            Ld6:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.imagepipeline.producers.s0.a.i(int, java.lang.Object):void");
        }

        @I41.h
        public final com.facebook.common.internal.k m(YW0.d dVar, @I41.h UW0.d dVar2, @I41.h C27119b c27119b, @I41.h String str) throws Throwable {
            String str2;
            long j12;
            k0 k0Var = this.f340730e;
            if (!k0Var.i().d(k0Var, "ResizeAndRotateProducer")) {
                return null;
            }
            StringBuilder sb2 = new StringBuilder();
            dVar.m();
            sb2.append(dVar.f19502f);
            sb2.append("x");
            dVar.m();
            sb2.append(dVar.f19503g);
            String string = sb2.toString();
            if (dVar2 != null) {
                str2 = dVar2.f16412a + "x" + dVar2.f16413b;
            } else {
                str2 = "Unspecified";
            }
            HashMap map = new HashMap();
            dVar.m();
            map.put("Image format", String.valueOf(dVar.f19499c));
            map.put("Original size", string);
            map.put("Requested size", str2);
            I i12 = this.f340732g;
            synchronized (i12) {
                j12 = i12.f340554i - i12.f340553h;
            }
            map.put("queueTime", String.valueOf(j12));
            map.put("Transcoder id", str);
            map.put("Transcoding result", String.valueOf(c27119b));
            return new com.facebook.common.internal.k(map);
        }
    }

    public s0(Executor executor, wW0.g gVar, i0 i0Var, boolean z12, C27123f c27123f) {
        executor.getClass();
        this.f340723a = executor;
        gVar.getClass();
        this.f340724b = gVar;
        this.f340725c = i0Var;
        c27123f.getClass();
        this.f340727e = c27123f;
        this.f340726d = z12;
    }

    @Override // com.facebook.imagepipeline.producers.i0
    public final void b(InterfaceC36410l<YW0.d> interfaceC36410l, k0 k0Var) {
        this.f340725c.b(new a(interfaceC36410l, k0Var, this.f340726d, this.f340727e), k0Var);
    }
}
