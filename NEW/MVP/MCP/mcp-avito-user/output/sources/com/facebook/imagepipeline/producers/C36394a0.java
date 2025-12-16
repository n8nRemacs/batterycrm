package com.facebook.imagepipeline.producers;

import android.graphics.Bitmap;
import com.facebook.infer.annotation.Nullsafe;
import java.io.Closeable;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: PostprocessorProducer.java */
@Nullsafe
/* renamed from: com.facebook.imagepipeline.producers.a0, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C36394a0 implements i0<com.facebook.common.references.a<YW0.b>> {

    /* renamed from: a, reason: collision with root package name */
    public final i0<com.facebook.common.references.a<YW0.b>> f340636a;

    /* renamed from: b, reason: collision with root package name */
    public final com.facebook.imagepipeline.bitmaps.f f340637b;

    /* renamed from: c, reason: collision with root package name */
    public final Executor f340638c;

    /* compiled from: PostprocessorProducer.java */
    /* renamed from: com.facebook.imagepipeline.producers.a0$b */
    public class b extends r<com.facebook.common.references.a<YW0.b>, com.facebook.common.references.a<YW0.b>> {

        /* renamed from: c, reason: collision with root package name */
        public final m0 f340639c;

        /* renamed from: d, reason: collision with root package name */
        public final k0 f340640d;

        /* renamed from: e, reason: collision with root package name */
        public final com.facebook.imagepipeline.request.a f340641e;

        /* renamed from: f, reason: collision with root package name */
        @J41.a
        public boolean f340642f;

        /* renamed from: g, reason: collision with root package name */
        @J41.a
        @I41.h
        public com.facebook.common.references.a<YW0.b> f340643g;

        /* renamed from: h, reason: collision with root package name */
        @J41.a
        public int f340644h;

        /* renamed from: i, reason: collision with root package name */
        @J41.a
        public boolean f340645i;

        /* renamed from: j, reason: collision with root package name */
        @J41.a
        public boolean f340646j;

        public b(InterfaceC36410l interfaceC36410l, m0 m0Var, com.facebook.imagepipeline.request.a aVar, k0 k0Var) {
            super(interfaceC36410l);
            this.f340643g = null;
            this.f340644h = 0;
            this.f340645i = false;
            this.f340646j = false;
            this.f340639c = m0Var;
            this.f340641e = aVar;
            this.f340640d = k0Var;
            k0Var.b(new C36396b0(this));
        }

        public static void m(b bVar, com.facebook.common.references.a aVar, int i12) throws Throwable {
            Map<String, String> mapA;
            com.facebook.imagepipeline.request.a aVar2 = bVar.f340641e;
            if (!com.facebook.common.references.a.k(aVar)) {
                throw new IllegalArgumentException();
            }
            if (!(((YW0.b) aVar.i()) instanceof YW0.c)) {
                bVar.o(aVar, i12);
                return;
            }
            m0 m0Var = bVar.f340639c;
            k0 k0Var = bVar.f340640d;
            m0Var.c(k0Var, "PostprocessorProducer");
            com.facebook.common.references.a<YW0.b> aVar3 = null;
            Map<String, String> mapA2 = null;
            try {
                try {
                    com.facebook.common.references.a<YW0.b> aVarP = bVar.p((YW0.b) aVar.i());
                    try {
                        if (m0Var.d(k0Var, "PostprocessorProducer")) {
                            aVar2.getClass();
                            mapA2 = com.facebook.common.internal.k.a("Postprocessor", "Unknown postprocessor");
                        }
                        m0Var.j(k0Var, "PostprocessorProducer", mapA2);
                        bVar.o(aVarP, i12);
                        com.facebook.common.references.a.c(aVarP);
                    } catch (Throwable th2) {
                        th = th2;
                        aVar3 = aVarP;
                        com.facebook.common.references.a.c(aVar3);
                        throw th;
                    }
                } catch (Exception e12) {
                    if (m0Var.d(k0Var, "PostprocessorProducer")) {
                        aVar2.getClass();
                        mapA = com.facebook.common.internal.k.a("Postprocessor", "Unknown postprocessor");
                    } else {
                        mapA = null;
                    }
                    m0Var.h(k0Var, "PostprocessorProducer", e12, mapA);
                    if (bVar.n()) {
                        bVar.f340716b.a(e12);
                    }
                    com.facebook.common.references.h<Closeable> hVar = com.facebook.common.references.a.f339838f;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        }

        @Override // com.facebook.imagepipeline.producers.r, com.facebook.imagepipeline.producers.AbstractC36395b
        public final void g() {
            if (n()) {
                this.f340716b.b();
            }
        }

        @Override // com.facebook.imagepipeline.producers.r, com.facebook.imagepipeline.producers.AbstractC36395b
        public final void h(Throwable th2) {
            if (n()) {
                this.f340716b.a(th2);
            }
        }

        @Override // com.facebook.imagepipeline.producers.AbstractC36395b
        public final void i(int i12, @I41.h Object obj) {
            com.facebook.common.references.a aVar = (com.facebook.common.references.a) obj;
            if (!com.facebook.common.references.a.k(aVar)) {
                if (AbstractC36395b.e(i12)) {
                    o(null, i12);
                    return;
                }
                return;
            }
            synchronized (this) {
                try {
                    if (!this.f340642f) {
                        com.facebook.common.references.a<YW0.b> aVar2 = this.f340643g;
                        this.f340643g = com.facebook.common.references.a.b(aVar);
                        this.f340644h = i12;
                        this.f340645i = true;
                        boolean zQ2 = q();
                        com.facebook.common.references.a.c(aVar2);
                        if (zQ2) {
                            C36394a0.this.f340638c.execute(new RunnableC36398c0(this));
                        }
                    }
                } finally {
                }
            }
        }

        public final boolean n() {
            synchronized (this) {
                try {
                    if (this.f340642f) {
                        return false;
                    }
                    com.facebook.common.references.a<YW0.b> aVar = this.f340643g;
                    this.f340643g = null;
                    this.f340642f = true;
                    com.facebook.common.references.a.c(aVar);
                    return true;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x0010  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void o(@I41.h com.facebook.common.references.a<YW0.b> r3, int r4) {
            /*
                r2 = this;
                boolean r0 = com.facebook.imagepipeline.producers.AbstractC36395b.e(r4)
                if (r0 != 0) goto L10
                monitor-enter(r2)
                boolean r1 = r2.f340642f     // Catch: java.lang.Throwable -> Ld
                monitor-exit(r2)
                if (r1 == 0) goto L18
                goto L10
            Ld:
                r3 = move-exception
                monitor-exit(r2)     // Catch: java.lang.Throwable -> Ld
                throw r3
            L10:
                if (r0 == 0) goto L1d
                boolean r0 = r2.n()
                if (r0 == 0) goto L1d
            L18:
                com.facebook.imagepipeline.producers.l<O> r0 = r2.f340716b
                r0.c(r4, r3)
            L1d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.imagepipeline.producers.C36394a0.b.o(com.facebook.common.references.a, int):void");
        }

        public final com.facebook.common.references.a<YW0.b> p(YW0.b bVar) {
            YW0.c cVar = (YW0.c) bVar;
            com.facebook.common.references.a<Bitmap> aVarB = this.f340641e.b(cVar.f19494e, C36394a0.this.f340637b);
            try {
                YW0.c cVar2 = new YW0.c(aVarB, bVar.a(), cVar.f19496g, cVar.f19497h);
                cVar2.c(cVar.f19492b);
                return com.facebook.common.references.a.m(cVar2);
            } finally {
                com.facebook.common.references.a.c(aVarB);
            }
        }

        public final synchronized boolean q() {
            if (this.f340642f || !this.f340645i || this.f340646j || !com.facebook.common.references.a.k(this.f340643g)) {
                return false;
            }
            this.f340646j = true;
            return true;
        }
    }

    /* compiled from: PostprocessorProducer.java */
    /* renamed from: com.facebook.imagepipeline.producers.a0$c */
    public class c extends r<com.facebook.common.references.a<YW0.b>, com.facebook.common.references.a<YW0.b>> implements com.facebook.imagepipeline.request.f {

        /* renamed from: c, reason: collision with root package name */
        @J41.a
        public boolean f340648c;

        /* renamed from: d, reason: collision with root package name */
        @J41.a
        @I41.h
        public com.facebook.common.references.a<YW0.b> f340649d;

        public c(C36394a0 c36394a0, b bVar, com.facebook.imagepipeline.request.e eVar, k0 k0Var, a aVar) {
            super(bVar);
            this.f340648c = false;
            this.f340649d = null;
            eVar.c(this);
            k0Var.b(new C36400d0(this));
        }

        @Override // com.facebook.imagepipeline.producers.r, com.facebook.imagepipeline.producers.AbstractC36395b
        public final void g() {
            if (m()) {
                this.f340716b.b();
            }
        }

        @Override // com.facebook.imagepipeline.producers.r, com.facebook.imagepipeline.producers.AbstractC36395b
        public final void h(Throwable th2) {
            if (m()) {
                this.f340716b.a(th2);
            }
        }

        @Override // com.facebook.imagepipeline.producers.AbstractC36395b
        public final void i(int i12, Object obj) {
            com.facebook.common.references.a aVar = (com.facebook.common.references.a) obj;
            if (AbstractC36395b.f(i12)) {
                return;
            }
            synchronized (this) {
                try {
                    if (!this.f340648c) {
                        com.facebook.common.references.a<YW0.b> aVar2 = this.f340649d;
                        this.f340649d = com.facebook.common.references.a.b(aVar);
                        com.facebook.common.references.a.c(aVar2);
                    }
                } finally {
                }
            }
            synchronized (this) {
                try {
                    if (!this.f340648c) {
                        com.facebook.common.references.a aVarB = com.facebook.common.references.a.b(this.f340649d);
                        try {
                            this.f340716b.c(0, aVarB);
                        } finally {
                            com.facebook.common.references.a.c(aVarB);
                        }
                    }
                } finally {
                }
            }
        }

        public final boolean m() {
            synchronized (this) {
                try {
                    if (this.f340648c) {
                        return false;
                    }
                    com.facebook.common.references.a<YW0.b> aVar = this.f340649d;
                    this.f340649d = null;
                    this.f340648c = true;
                    com.facebook.common.references.a.c(aVar);
                    return true;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    /* compiled from: PostprocessorProducer.java */
    /* renamed from: com.facebook.imagepipeline.producers.a0$d */
    public class d extends r<com.facebook.common.references.a<YW0.b>, com.facebook.common.references.a<YW0.b>> {
        public d(C36394a0 c36394a0, b bVar, a aVar) {
            super(bVar);
        }

        @Override // com.facebook.imagepipeline.producers.AbstractC36395b
        public final void i(int i12, Object obj) {
            com.facebook.common.references.a aVar = (com.facebook.common.references.a) obj;
            if (AbstractC36395b.f(i12)) {
                return;
            }
            this.f340716b.c(i12, aVar);
        }
    }

    public C36394a0(i0<com.facebook.common.references.a<YW0.b>> i0Var, com.facebook.imagepipeline.bitmaps.f fVar, Executor executor) {
        i0Var.getClass();
        this.f340636a = i0Var;
        this.f340637b = fVar;
        executor.getClass();
        this.f340638c = executor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.imagepipeline.producers.i0
    public final void b(InterfaceC36410l<com.facebook.common.references.a<YW0.b>> interfaceC36410l, k0 k0Var) {
        m0 m0VarI = k0Var.i();
        com.facebook.imagepipeline.request.a aVar = k0Var.j().f340793m;
        aVar.getClass();
        b bVar = new b(interfaceC36410l, m0VarI, aVar, k0Var);
        this.f340636a.b(aVar instanceof com.facebook.imagepipeline.request.e ? new c(this, bVar, (com.facebook.imagepipeline.request.e) aVar, k0Var, null) : new d(this, bVar, null), k0Var);
    }
}
