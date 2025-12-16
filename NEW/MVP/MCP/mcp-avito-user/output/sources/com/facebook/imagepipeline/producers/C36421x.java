package com.facebook.imagepipeline.producers;

import com.facebook.infer.annotation.Nullsafe;

/* compiled from: EncodedMemoryCacheProducer.java */
@Nullsafe
/* renamed from: com.facebook.imagepipeline.producers.x, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C36421x implements i0<YW0.d> {

    /* renamed from: a, reason: collision with root package name */
    public final com.facebook.imagepipeline.cache.B f340760a;

    /* renamed from: b, reason: collision with root package name */
    public final com.facebook.imagepipeline.cache.o f340761b;

    /* renamed from: c, reason: collision with root package name */
    public final i0<YW0.d> f340762c;

    /* compiled from: EncodedMemoryCacheProducer.java */
    /* renamed from: com.facebook.imagepipeline.producers.x$a */
    public static class a extends r<YW0.d, YW0.d> {

        /* renamed from: c, reason: collision with root package name */
        public final com.facebook.imagepipeline.cache.B f340763c;

        /* renamed from: d, reason: collision with root package name */
        public final com.facebook.cache.common.c f340764d;

        /* renamed from: e, reason: collision with root package name */
        public final boolean f340765e;

        /* renamed from: f, reason: collision with root package name */
        public final boolean f340766f;

        public a(com.facebook.cache.common.c cVar, com.facebook.imagepipeline.cache.B b12, InterfaceC36410l interfaceC36410l, boolean z12, boolean z13) {
            super(interfaceC36410l);
            this.f340763c = b12;
            this.f340764d = cVar;
            this.f340765e = z12;
            this.f340766f = z13;
        }

        /* JADX WARN: Removed duplicated region for block: B:44:0x006d A[Catch: all -> 0x005d, TryCatch #2 {all -> 0x005d, blocks: (B:3:0x0002, B:12:0x0018, B:15:0x0022, B:26:0x003e, B:29:0x004b, B:32:0x0056, B:37:0x0060, B:38:0x0063, B:40:0x0065, B:41:0x0068, B:44:0x006d, B:42:0x0069, B:43:0x006c, B:45:0x0071, B:28:0x0043, B:17:0x002a, B:19:0x002e, B:21:0x0032, B:31:0x0050), top: B:54:0x0002, inners: #0, #1, #3 }] */
        /* JADX WARN: Removed duplicated region for block: B:45:0x0071 A[Catch: all -> 0x005d, TRY_LEAVE, TryCatch #2 {all -> 0x005d, blocks: (B:3:0x0002, B:12:0x0018, B:15:0x0022, B:26:0x003e, B:29:0x004b, B:32:0x0056, B:37:0x0060, B:38:0x0063, B:40:0x0065, B:41:0x0068, B:44:0x006d, B:42:0x0069, B:43:0x006c, B:45:0x0071, B:28:0x0043, B:17:0x002a, B:19:0x002e, B:21:0x0032, B:31:0x0050), top: B:54:0x0002, inners: #0, #1, #3 }] */
        @Override // com.facebook.imagepipeline.producers.AbstractC36395b
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void i(int r5, @I41.h java.lang.Object r6) {
            /*
                r4 = this;
                YW0.d r6 = (YW0.d) r6
                com.facebook.imagepipeline.systrace.b.a()     // Catch: java.lang.Throwable -> L5d
                boolean r0 = com.facebook.imagepipeline.producers.AbstractC36395b.f(r5)     // Catch: java.lang.Throwable -> L5d
                com.facebook.imagepipeline.producers.l<O> r1 = r4.f340716b
                if (r0 != 0) goto L71
                if (r6 == 0) goto L71
                r0 = r5 & 10
                if (r0 == 0) goto L15
                r0 = 1
                goto L16
            L15:
                r0 = 0
            L16:
                if (r0 != 0) goto L71
                r6.m()     // Catch: java.lang.Throwable -> L5d
                RW0.c r0 = r6.f19499c     // Catch: java.lang.Throwable -> L5d
                RW0.c r2 = RW0.c.f14507b     // Catch: java.lang.Throwable -> L5d
                if (r0 != r2) goto L22
                goto L71
            L22:
                com.facebook.common.references.a<com.facebook.common.memory.PooledByteBuffer> r0 = r6.f19498b     // Catch: java.lang.Throwable -> L5d
                com.facebook.common.references.a r0 = com.facebook.common.references.a.b(r0)     // Catch: java.lang.Throwable -> L5d
                if (r0 == 0) goto L6d
                boolean r2 = r4.f340766f     // Catch: java.lang.Throwable -> L3b
                if (r2 == 0) goto L3d
                boolean r2 = r4.f340765e     // Catch: java.lang.Throwable -> L3b
                if (r2 == 0) goto L3d
                com.facebook.imagepipeline.cache.B r2 = r4.f340763c     // Catch: java.lang.Throwable -> L3b
                com.facebook.cache.common.c r3 = r4.f340764d     // Catch: java.lang.Throwable -> L3b
                com.facebook.common.references.a r2 = r2.b(r3, r0)     // Catch: java.lang.Throwable -> L3b
                goto L3e
            L3b:
                r5 = move-exception
                goto L69
            L3d:
                r2 = 0
            L3e:
                com.facebook.common.references.a.c(r0)     // Catch: java.lang.Throwable -> L5d
                if (r2 == 0) goto L6d
                YW0.d r0 = new YW0.d     // Catch: java.lang.Throwable -> L64
                r0.<init>(r2)     // Catch: java.lang.Throwable -> L64
                r0.c(r6)     // Catch: java.lang.Throwable -> L64
                com.facebook.common.references.a.c(r2)     // Catch: java.lang.Throwable -> L5d
                r6 = 1065353216(0x3f800000, float:1.0)
                r1.d(r6)     // Catch: java.lang.Throwable -> L5f
                r1.c(r5, r0)     // Catch: java.lang.Throwable -> L5f
                YW0.d.b(r0)     // Catch: java.lang.Throwable -> L5d
            L59:
                com.facebook.imagepipeline.systrace.b.a()
                goto L75
            L5d:
                r5 = move-exception
                goto L76
            L5f:
                r5 = move-exception
                YW0.d.b(r0)     // Catch: java.lang.Throwable -> L5d
                throw r5     // Catch: java.lang.Throwable -> L5d
            L64:
                r5 = move-exception
                com.facebook.common.references.a.c(r2)     // Catch: java.lang.Throwable -> L5d
                throw r5     // Catch: java.lang.Throwable -> L5d
            L69:
                com.facebook.common.references.a.c(r0)     // Catch: java.lang.Throwable -> L5d
                throw r5     // Catch: java.lang.Throwable -> L5d
            L6d:
                r1.c(r5, r6)     // Catch: java.lang.Throwable -> L5d
                goto L59
            L71:
                r1.c(r5, r6)     // Catch: java.lang.Throwable -> L5d
                goto L59
            L75:
                return
            L76:
                com.facebook.imagepipeline.systrace.b.a()
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.imagepipeline.producers.C36421x.a.i(int, java.lang.Object):void");
        }
    }

    public C36421x(com.facebook.imagepipeline.cache.B b12, com.facebook.imagepipeline.cache.o oVar, i0 i0Var) {
        this.f340760a = b12;
        this.f340761b = oVar;
        this.f340762c = i0Var;
    }

    @Override // com.facebook.imagepipeline.producers.i0
    public final void b(InterfaceC36410l<YW0.d> interfaceC36410l, k0 k0Var) {
        try {
            com.facebook.imagepipeline.systrace.b.a();
            m0 m0VarI = k0Var.i();
            m0VarI.c(k0Var, "EncodedMemoryCacheProducer");
            com.facebook.cache.common.j jVarB = this.f340761b.b(k0Var.j(), k0Var.a());
            k0Var.j().getClass();
            com.facebook.common.references.a aVar = this.f340760a.get(jVarB);
            try {
                if (aVar != null) {
                    YW0.d dVar = new YW0.d(aVar);
                    try {
                        m0VarI.j(k0Var, "EncodedMemoryCacheProducer", m0VarI.d(k0Var, "EncodedMemoryCacheProducer") ? com.facebook.common.internal.k.a("cached_value_found", "true") : null);
                        m0VarI.b(k0Var, "EncodedMemoryCacheProducer", true);
                        k0Var.l("memory_encoded");
                        interfaceC36410l.d(1.0f);
                        interfaceC36410l.c(1, dVar);
                        YW0.d.b(dVar);
                        return;
                    } catch (Throwable th2) {
                        YW0.d.b(dVar);
                        throw th2;
                    }
                }
                if (k0Var.n().f340802b >= 3) {
                    m0VarI.j(k0Var, "EncodedMemoryCacheProducer", m0VarI.d(k0Var, "EncodedMemoryCacheProducer") ? com.facebook.common.internal.k.a("cached_value_found", "false") : null);
                    m0VarI.b(k0Var, "EncodedMemoryCacheProducer", false);
                    k0Var.k("memory_encoded", "nil-result");
                    interfaceC36410l.c(1, null);
                    return;
                }
                com.facebook.imagepipeline.cache.B b12 = this.f340760a;
                k0Var.j().getClass();
                a aVar2 = new a(jVarB, b12, interfaceC36410l, true, k0Var.c().a().f340337c);
                m0VarI.j(k0Var, "EncodedMemoryCacheProducer", m0VarI.d(k0Var, "EncodedMemoryCacheProducer") ? com.facebook.common.internal.k.a("cached_value_found", "false") : null);
                this.f340762c.b(aVar2, k0Var);
            } finally {
                com.facebook.common.references.a.c(aVar);
            }
        } finally {
            com.facebook.imagepipeline.systrace.b.a();
        }
    }
}
