package com.facebook.imagepipeline.producers;

import android.graphics.Bitmap;
import com.facebook.imagepipeline.core.C36382a;
import com.facebook.infer.annotation.Nullsafe;
import java.util.HashMap;
import java.util.concurrent.Executor;
import wW0.InterfaceC49570a;

/* compiled from: DecodeProducer.java */
@Nullsafe
/* renamed from: com.facebook.imagepipeline.producers.n, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C36412n implements i0<com.facebook.common.references.a<YW0.b>> {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC49570a f340688a;

    /* renamed from: b, reason: collision with root package name */
    public final Executor f340689b;

    /* renamed from: c, reason: collision with root package name */
    public final com.facebook.imagepipeline.decoder.b f340690c;

    /* renamed from: d, reason: collision with root package name */
    public final com.facebook.imagepipeline.decoder.d f340691d;

    /* renamed from: e, reason: collision with root package name */
    public final i0<YW0.d> f340692e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f340693f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f340694g;

    /* renamed from: h, reason: collision with root package name */
    public final int f340695h;

    /* renamed from: i, reason: collision with root package name */
    public final C36382a f340696i;

    /* renamed from: j, reason: collision with root package name */
    public final com.facebook.common.internal.r<Boolean> f340697j;

    /* compiled from: DecodeProducer.java */
    /* renamed from: com.facebook.imagepipeline.producers.n$a */
    public class a extends c {
        public a() {
            throw null;
        }

        @Override // com.facebook.imagepipeline.producers.C36412n.c
        public final int n(YW0.d dVar) {
            return dVar.g();
        }

        @Override // com.facebook.imagepipeline.producers.C36412n.c
        public final YW0.i o() {
            YW0.g gVar = new YW0.g();
            gVar.f19508a = 0;
            gVar.f19509b = false;
            gVar.f19510c = false;
            return gVar;
        }

        @Override // com.facebook.imagepipeline.producers.C36412n.c
        public final synchronized boolean s(@I41.h YW0.d dVar, int i12) {
            if (AbstractC36395b.f(i12)) {
                return false;
            }
            return this.f340705g.e(dVar, i12);
        }
    }

    /* compiled from: DecodeProducer.java */
    /* renamed from: com.facebook.imagepipeline.producers.n$b */
    public class b extends c {

        /* renamed from: i, reason: collision with root package name */
        public final com.facebook.imagepipeline.decoder.e f340698i;

        /* renamed from: j, reason: collision with root package name */
        public final com.facebook.imagepipeline.decoder.d f340699j;

        /* renamed from: k, reason: collision with root package name */
        public int f340700k;

        public b(C36412n c36412n, InterfaceC36410l interfaceC36410l, k0 k0Var, com.facebook.imagepipeline.decoder.e eVar, com.facebook.imagepipeline.decoder.d dVar, int i12) {
            super(interfaceC36410l, k0Var, i12);
            this.f340698i = eVar;
            dVar.getClass();
            this.f340699j = dVar;
            this.f340700k = 0;
        }

        @Override // com.facebook.imagepipeline.producers.C36412n.c
        public final int n(YW0.d dVar) {
            return this.f340698i.f340404f;
        }

        @Override // com.facebook.imagepipeline.producers.C36412n.c
        public final YW0.i o() {
            return this.f340699j.b(this.f340698i.f340403e);
        }

        @Override // com.facebook.imagepipeline.producers.C36412n.c
        public final synchronized boolean s(@I41.h YW0.d dVar, int i12) {
            try {
                boolean zE2 = this.f340705g.e(dVar, i12);
                if (AbstractC36395b.f(i12) || AbstractC36395b.l(i12, 8)) {
                    if (!AbstractC36395b.l(i12, 4) && YW0.d.k(dVar)) {
                        dVar.m();
                        if (dVar.f19499c == RW0.b.f14495a) {
                            if (!this.f340698i.b(dVar)) {
                                return false;
                            }
                            int i13 = this.f340698i.f340403e;
                            int i14 = this.f340700k;
                            if (i13 <= i14) {
                                return false;
                            }
                            if (i13 < this.f340699j.a(i14) && !this.f340698i.f340405g) {
                                return false;
                            }
                            this.f340700k = i13;
                        }
                    }
                }
                return zE2;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* compiled from: DecodeProducer.java */
    /* renamed from: com.facebook.imagepipeline.producers.n$c */
    public abstract class c extends r<YW0.d, com.facebook.common.references.a<YW0.b>> {

        /* renamed from: c, reason: collision with root package name */
        public final k0 f340701c;

        /* renamed from: d, reason: collision with root package name */
        public final m0 f340702d;

        /* renamed from: e, reason: collision with root package name */
        public final UW0.b f340703e;

        /* renamed from: f, reason: collision with root package name */
        @J41.a
        public boolean f340704f;

        /* renamed from: g, reason: collision with root package name */
        public final I f340705g;

        public c(InterfaceC36410l interfaceC36410l, k0 k0Var, int i12) {
            super(interfaceC36410l);
            this.f340701c = k0Var;
            this.f340702d = k0Var.i();
            UW0.b bVar = k0Var.j().f340785e;
            this.f340703e = bVar;
            this.f340704f = false;
            C36413o c36413o = new C36413o(this, k0Var, i12);
            Executor executor = C36412n.this.f340689b;
            bVar.getClass();
            this.f340705g = new I(executor, c36413o);
            k0Var.b(new C36414p(this));
        }

        @Override // com.facebook.imagepipeline.producers.r, com.facebook.imagepipeline.producers.AbstractC36395b
        public final void g() {
            q(true);
            this.f340716b.b();
        }

        @Override // com.facebook.imagepipeline.producers.r, com.facebook.imagepipeline.producers.AbstractC36395b
        public final void h(Throwable th2) {
            q(true);
            this.f340716b.a(th2);
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x0037 A[Catch: all -> 0x0021, TryCatch #0 {all -> 0x0021, blocks: (B:3:0x0002, B:7:0x0010, B:11:0x0023, B:13:0x0029, B:14:0x0037, B:17:0x003e, B:20:0x0047, B:22:0x004f), top: B:27:0x0002 }] */
        @Override // com.facebook.imagepipeline.producers.AbstractC36395b
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void i(int r5, @I41.h java.lang.Object r6) {
            /*
                r4 = this;
                YW0.d r6 = (YW0.d) r6
                com.facebook.imagepipeline.systrace.b.a()     // Catch: java.lang.Throwable -> L21
                boolean r0 = com.facebook.imagepipeline.producers.AbstractC36395b.e(r5)     // Catch: java.lang.Throwable -> L21
                if (r0 == 0) goto L37
                com.facebook.imagepipeline.producers.l<O> r1 = r4.f340716b
                r2 = 1
                if (r6 != 0) goto L23
                com.facebook.common.util.ExceptionWithNoStacktrace r5 = new com.facebook.common.util.ExceptionWithNoStacktrace     // Catch: java.lang.Throwable -> L21
                java.lang.String r6 = "Encoded image is null."
                r5.<init>(r6)     // Catch: java.lang.Throwable -> L21
                r4.q(r2)     // Catch: java.lang.Throwable -> L21
                r1.a(r5)     // Catch: java.lang.Throwable -> L21
            L1d:
                com.facebook.imagepipeline.systrace.b.a()
                goto L55
            L21:
                r5 = move-exception
                goto L56
            L23:
                boolean r3 = r6.j()     // Catch: java.lang.Throwable -> L21
                if (r3 != 0) goto L37
                com.facebook.common.util.ExceptionWithNoStacktrace r5 = new com.facebook.common.util.ExceptionWithNoStacktrace     // Catch: java.lang.Throwable -> L21
                java.lang.String r6 = "Encoded image is not valid."
                r5.<init>(r6)     // Catch: java.lang.Throwable -> L21
                r4.q(r2)     // Catch: java.lang.Throwable -> L21
                r1.a(r5)     // Catch: java.lang.Throwable -> L21
                goto L1d
            L37:
                boolean r6 = r4.s(r6, r5)     // Catch: java.lang.Throwable -> L21
                if (r6 != 0) goto L3e
                goto L1d
            L3e:
                r6 = 4
                boolean r5 = com.facebook.imagepipeline.producers.AbstractC36395b.l(r5, r6)     // Catch: java.lang.Throwable -> L21
                if (r0 != 0) goto L4f
                if (r5 != 0) goto L4f
                com.facebook.imagepipeline.producers.k0 r5 = r4.f340701c     // Catch: java.lang.Throwable -> L21
                boolean r5 = r5.h()     // Catch: java.lang.Throwable -> L21
                if (r5 == 0) goto L1d
            L4f:
                com.facebook.imagepipeline.producers.I r5 = r4.f340705g     // Catch: java.lang.Throwable -> L21
                r5.c()     // Catch: java.lang.Throwable -> L21
                goto L1d
            L55:
                return
            L56:
                com.facebook.imagepipeline.systrace.b.a()
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.imagepipeline.producers.C36412n.c.i(int, java.lang.Object):void");
        }

        @Override // com.facebook.imagepipeline.producers.r, com.facebook.imagepipeline.producers.AbstractC36395b
        public final void j(float f12) {
            super.j(f12 * 0.99f);
        }

        @I41.h
        public final com.facebook.common.internal.k m(@I41.h YW0.b bVar, long j12, YW0.i iVar, boolean z12, String str, String str2, String str3, String str4) {
            if (!this.f340702d.d(this.f340701c, "DecodeProducer")) {
                return null;
            }
            String strValueOf = String.valueOf(j12);
            String strValueOf2 = String.valueOf(iVar.b());
            String strValueOf3 = String.valueOf(z12);
            if (!(bVar instanceof YW0.c)) {
                HashMap map = new HashMap(7);
                map.put("queueTime", strValueOf);
                map.put("hasGoodQuality", strValueOf2);
                map.put("isFinal", strValueOf3);
                map.put("encodedImageSize", str2);
                map.put("imageFormat", str);
                map.put("requestedImageSize", str3);
                map.put("sampleSize", str4);
                return new com.facebook.common.internal.k(map);
            }
            Bitmap bitmap = ((YW0.c) bVar).f19494e;
            bitmap.getClass();
            String str5 = bitmap.getWidth() + "x" + bitmap.getHeight();
            HashMap map2 = new HashMap(8);
            map2.put("bitmapSize", str5);
            map2.put("queueTime", strValueOf);
            map2.put("hasGoodQuality", strValueOf2);
            map2.put("isFinal", strValueOf3);
            map2.put("encodedImageSize", str2);
            map2.put("imageFormat", str);
            map2.put("requestedImageSize", str3);
            map2.put("sampleSize", str4);
            map2.put("byteCount", bitmap.getByteCount() + "");
            return new com.facebook.common.internal.k(map2);
        }

        public abstract int n(YW0.d dVar);

        public abstract YW0.i o();

        public final YW0.b p(YW0.d dVar, int i12, YW0.i iVar) {
            UW0.b bVar = this.f340703e;
            C36412n c36412n = C36412n.this;
            c36412n.getClass();
            return c36412n.f340690c.a(dVar, i12, iVar, bVar);
        }

        public final void q(boolean z12) {
            YW0.d dVar;
            synchronized (this) {
                if (z12) {
                    if (!this.f340704f) {
                        this.f340716b.d(1.0f);
                        this.f340704f = true;
                        I i12 = this.f340705g;
                        synchronized (i12) {
                            dVar = i12.f340550e;
                            i12.f340550e = null;
                            i12.f340551f = 0;
                        }
                        YW0.d.b(dVar);
                    }
                }
            }
        }

        public final void r(YW0.d dVar, YW0.b bVar) throws Throwable {
            dVar.m();
            Integer numValueOf = Integer.valueOf(dVar.f19502f);
            k0 k0Var = this.f340701c;
            k0Var.e(numValueOf, "encoded_width");
            dVar.m();
            k0Var.e(Integer.valueOf(dVar.f19503g), "encoded_height");
            k0Var.e(Integer.valueOf(dVar.g()), "encoded_size");
            if (bVar instanceof YW0.a) {
                Bitmap bitmapD = ((YW0.a) bVar).d();
                k0Var.e(String.valueOf(bitmapD == null ? null : bitmapD.getConfig()), "bitmap_config");
            }
            if (bVar != null) {
                bVar.c(k0Var.getExtras());
            }
        }

        public boolean s(@I41.h YW0.d dVar, int i12) {
            return this.f340705g.e(dVar, i12);
        }
    }

    public C36412n(InterfaceC49570a interfaceC49570a, Executor executor, com.facebook.imagepipeline.decoder.b bVar, com.facebook.imagepipeline.decoder.d dVar, boolean z12, boolean z13, i0 i0Var, int i12, C36382a c36382a, com.facebook.common.internal.r rVar) {
        interfaceC49570a.getClass();
        this.f340688a = interfaceC49570a;
        executor.getClass();
        this.f340689b = executor;
        bVar.getClass();
        this.f340690c = bVar;
        dVar.getClass();
        this.f340691d = dVar;
        this.f340693f = z12;
        this.f340694g = z13;
        i0Var.getClass();
        this.f340692e = i0Var;
        this.f340695h = i12;
        this.f340696i = c36382a;
        this.f340697j = rVar;
    }

    @Override // com.facebook.imagepipeline.producers.i0
    public final void b(InterfaceC36410l<com.facebook.common.references.a<YW0.b>> interfaceC36410l, k0 k0Var) {
        try {
            com.facebook.imagepipeline.systrace.b.a();
            this.f340692e.b(!com.facebook.common.util.g.c(k0Var.j().f340782b) ? new a(interfaceC36410l, k0Var, this.f340695h) : new b(this, interfaceC36410l, k0Var, new com.facebook.imagepipeline.decoder.e(this.f340688a), this.f340691d, this.f340695h), k0Var);
            com.facebook.imagepipeline.systrace.b.a();
        } catch (Throwable th2) {
            com.facebook.imagepipeline.systrace.b.a();
            throw th2;
        }
    }
}
