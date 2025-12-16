package com.facebook.imagepipeline.producers;

import com.facebook.imagepipeline.cache.C36372e;
import com.facebook.infer.annotation.Nullsafe;

/* compiled from: BitmapMemoryCacheProducer.java */
@Nullsafe
/* renamed from: com.facebook.imagepipeline.producers.h, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C36406h implements i0<com.facebook.common.references.a<YW0.b>> {

    /* renamed from: a, reason: collision with root package name */
    public final com.facebook.imagepipeline.cache.B f340674a;

    /* renamed from: b, reason: collision with root package name */
    public final com.facebook.imagepipeline.cache.o f340675b;

    /* renamed from: c, reason: collision with root package name */
    public final i0<com.facebook.common.references.a<YW0.b>> f340676c;

    /* compiled from: BitmapMemoryCacheProducer.java */
    /* renamed from: com.facebook.imagepipeline.producers.h$a */
    public class a extends r<com.facebook.common.references.a<YW0.b>, com.facebook.common.references.a<YW0.b>> {

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ com.facebook.cache.common.c f340677c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ boolean f340678d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC36410l interfaceC36410l, com.facebook.cache.common.c cVar, boolean z12) {
            super(interfaceC36410l);
            this.f340677c = cVar;
            this.f340678d = z12;
        }

        /* JADX WARN: Removed duplicated region for block: B:35:0x0076 A[Catch: all -> 0x0014, TRY_LEAVE, TryCatch #1 {all -> 0x0014, blocks: (B:3:0x0002, B:7:0x0010, B:12:0x001c, B:14:0x002a, B:18:0x0034, B:25:0x0061, B:30:0x006a, B:31:0x006e, B:32:0x0071, B:33:0x0072, B:35:0x0076, B:46:0x0091, B:47:0x0094, B:44:0x008c, B:38:0x0080, B:43:0x0089, B:20:0x003c, B:22:0x0056, B:29:0x0067), top: B:52:0x0002, inners: #0, #2 }] */
        /* JADX WARN: Removed duplicated region for block: B:37:0x007e  */
        /* JADX WARN: Removed duplicated region for block: B:42:0x0088  */
        @Override // com.facebook.imagepipeline.producers.AbstractC36395b
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void i(int r10, @I41.h java.lang.Object r11) {
            /*
                r9 = this;
                com.facebook.common.references.a r11 = (com.facebook.common.references.a) r11
                com.facebook.imagepipeline.systrace.b.a()     // Catch: java.lang.Throwable -> L14
                boolean r0 = com.facebook.imagepipeline.producers.AbstractC36395b.e(r10)     // Catch: java.lang.Throwable -> L14
                r1 = 0
                com.facebook.imagepipeline.producers.l<O> r2 = r9.f340716b
                if (r11 != 0) goto L1c
                if (r0 == 0) goto L17
                r2.c(r10, r1)     // Catch: java.lang.Throwable -> L14
                goto L17
            L14:
                r10 = move-exception
                goto L95
            L17:
                com.facebook.imagepipeline.systrace.b.a()
                goto L90
            L1c:
                java.lang.Object r3 = r11.i()     // Catch: java.lang.Throwable -> L14
                YW0.b r3 = (YW0.b) r3     // Catch: java.lang.Throwable -> L14
                r3 = 8
                boolean r3 = com.facebook.imagepipeline.producers.AbstractC36395b.l(r10, r3)     // Catch: java.lang.Throwable -> L14
                if (r3 == 0) goto L2e
                r2.c(r10, r11)     // Catch: java.lang.Throwable -> L14
                goto L17
            L2e:
                com.facebook.cache.common.c r3 = r9.f340677c
                com.facebook.imagepipeline.producers.h r4 = com.facebook.imagepipeline.producers.C36406h.this
                if (r0 != 0) goto L72
                com.facebook.imagepipeline.cache.B r5 = r4.f340674a     // Catch: java.lang.Throwable -> L14
                com.facebook.common.references.a r5 = r5.get(r3)     // Catch: java.lang.Throwable -> L14
                if (r5 == 0) goto L72
                java.lang.Object r6 = r11.i()     // Catch: java.lang.Throwable -> L65
                YW0.b r6 = (YW0.b) r6     // Catch: java.lang.Throwable -> L65
                YW0.i r6 = r6.a()     // Catch: java.lang.Throwable -> L65
                java.lang.Object r7 = r5.i()     // Catch: java.lang.Throwable -> L65
                YW0.b r7 = (YW0.b) r7     // Catch: java.lang.Throwable -> L65
                YW0.i r7 = r7.a()     // Catch: java.lang.Throwable -> L65
                boolean r8 = r7.a()     // Catch: java.lang.Throwable -> L65
                if (r8 != 0) goto L67
                int r7 = r7.c()     // Catch: java.lang.Throwable -> L65
                int r6 = r6.c()     // Catch: java.lang.Throwable -> L65
                if (r7 < r6) goto L61
                goto L67
            L61:
                com.facebook.common.references.a.c(r5)     // Catch: java.lang.Throwable -> L14
                goto L72
            L65:
                r10 = move-exception
                goto L6e
            L67:
                r2.c(r10, r5)     // Catch: java.lang.Throwable -> L65
                com.facebook.common.references.a.c(r5)     // Catch: java.lang.Throwable -> L14
                goto L17
            L6e:
                com.facebook.common.references.a.c(r5)     // Catch: java.lang.Throwable -> L14
                throw r10     // Catch: java.lang.Throwable -> L14
            L72:
                boolean r5 = r9.f340678d     // Catch: java.lang.Throwable -> L14
                if (r5 == 0) goto L7c
                com.facebook.imagepipeline.cache.B r1 = r4.f340674a     // Catch: java.lang.Throwable -> L14
                com.facebook.common.references.a r1 = r1.b(r3, r11)     // Catch: java.lang.Throwable -> L14
            L7c:
                if (r0 == 0) goto L86
                r0 = 1065353216(0x3f800000, float:1.0)
                r2.d(r0)     // Catch: java.lang.Throwable -> L84
                goto L86
            L84:
                r10 = move-exception
                goto L91
            L86:
                if (r1 == 0) goto L89
                r11 = r1
            L89:
                r2.c(r10, r11)     // Catch: java.lang.Throwable -> L84
                com.facebook.common.references.a.c(r1)     // Catch: java.lang.Throwable -> L14
                goto L17
            L90:
                return
            L91:
                com.facebook.common.references.a.c(r1)     // Catch: java.lang.Throwable -> L14
                throw r10     // Catch: java.lang.Throwable -> L14
            L95:
                com.facebook.imagepipeline.systrace.b.a()
                throw r10
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.imagepipeline.producers.C36406h.a.i(int, java.lang.Object):void");
        }
    }

    public C36406h(com.facebook.imagepipeline.cache.B b12, com.facebook.imagepipeline.cache.o oVar, i0 i0Var) {
        this.f340674a = b12;
        this.f340675b = oVar;
        this.f340676c = i0Var;
    }

    @Override // com.facebook.imagepipeline.producers.i0
    public final void b(InterfaceC36410l<com.facebook.common.references.a<YW0.b>> interfaceC36410l, k0 k0Var) {
        try {
            com.facebook.imagepipeline.systrace.b.a();
            m0 m0VarI = k0Var.i();
            m0VarI.c(k0Var, d());
            C36372e c36372eC = this.f340675b.c(k0Var.j(), k0Var.a());
            k0Var.j().getClass();
            com.facebook.common.references.a aVar = this.f340674a.get(c36372eC);
            if (aVar != null) {
                k0Var.d(((YW0.e) aVar.i()).getExtras());
                boolean zA2 = ((YW0.b) aVar.i()).a().a();
                if (zA2) {
                    m0VarI.j(k0Var, d(), m0VarI.d(k0Var, d()) ? com.facebook.common.internal.k.a("cached_value_found", "true") : null);
                    m0VarI.b(k0Var, d(), true);
                    k0Var.k("memory_bitmap", c());
                    interfaceC36410l.d(1.0f);
                }
                interfaceC36410l.c(zA2 ? 1 : 0, aVar);
                aVar.close();
                if (zA2) {
                    com.facebook.imagepipeline.systrace.b.a();
                    return;
                }
            }
            if (k0Var.n().f340802b >= 4) {
                m0VarI.j(k0Var, d(), m0VarI.d(k0Var, d()) ? com.facebook.common.internal.k.a("cached_value_found", "false") : null);
                m0VarI.b(k0Var, d(), false);
                k0Var.k("memory_bitmap", c());
                interfaceC36410l.c(1, null);
                com.facebook.imagepipeline.systrace.b.a();
                return;
            }
            k0Var.j().getClass();
            InterfaceC36410l<com.facebook.common.references.a<YW0.b>> interfaceC36410lE = e(interfaceC36410l, c36372eC, true);
            m0VarI.j(k0Var, d(), m0VarI.d(k0Var, d()) ? com.facebook.common.internal.k.a("cached_value_found", "false") : null);
            com.facebook.imagepipeline.systrace.b.a();
            this.f340676c.b(interfaceC36410lE, k0Var);
            com.facebook.imagepipeline.systrace.b.a();
            com.facebook.imagepipeline.systrace.b.a();
        } catch (Throwable th2) {
            com.facebook.imagepipeline.systrace.b.a();
            throw th2;
        }
    }

    public String c() {
        return "pipe_bg";
    }

    public String d() {
        return "BitmapMemoryCacheProducer";
    }

    public InterfaceC36410l<com.facebook.common.references.a<YW0.b>> e(InterfaceC36410l<com.facebook.common.references.a<YW0.b>> interfaceC36410l, com.facebook.cache.common.c cVar, boolean z12) {
        return new a(interfaceC36410l, cVar, z12);
    }
}
