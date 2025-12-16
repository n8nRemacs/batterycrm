package com.facebook.imagepipeline.core;

import androidx.core.util.y;
import cX0.C27123f;
import com.facebook.common.memory.PooledByteBuffer;
import com.facebook.imagepipeline.cache.B;
import com.facebook.imagepipeline.cache.C36373f;
import com.facebook.imagepipeline.cache.C36378k;
import com.facebook.imagepipeline.cache.G;
import com.facebook.imagepipeline.memory.F;
import com.facebook.imagepipeline.producers.y0;
import java.io.Closeable;
import java.util.concurrent.ExecutorService;

/* compiled from: ImagePipelineFactory.java */
@J41.c
/* loaded from: classes12.dex */
public class u {

    /* renamed from: t, reason: collision with root package name */
    public static u f340344t;

    /* renamed from: a, reason: collision with root package name */
    public final y0 f340345a;

    /* renamed from: b, reason: collision with root package name */
    public final r f340346b;

    /* renamed from: c, reason: collision with root package name */
    public final C36382a f340347c;

    /* renamed from: d, reason: collision with root package name */
    public com.facebook.imagepipeline.cache.s<com.facebook.cache.common.c, YW0.b> f340348d;

    /* renamed from: e, reason: collision with root package name */
    @I41.h
    public B<com.facebook.cache.common.c, YW0.b> f340349e;

    /* renamed from: f, reason: collision with root package name */
    public G f340350f;

    /* renamed from: g, reason: collision with root package name */
    @I41.h
    public B<com.facebook.cache.common.c, PooledByteBuffer> f340351g;

    /* renamed from: h, reason: collision with root package name */
    @I41.h
    public C36378k f340352h;

    /* renamed from: i, reason: collision with root package name */
    @I41.h
    public com.facebook.cache.disk.k f340353i;

    /* renamed from: j, reason: collision with root package name */
    @I41.h
    public com.facebook.imagepipeline.decoder.b f340354j;

    /* renamed from: k, reason: collision with root package name */
    @I41.h
    public p f340355k;

    /* renamed from: l, reason: collision with root package name */
    @I41.h
    public C27123f f340356l;

    /* renamed from: m, reason: collision with root package name */
    @I41.h
    public z f340357m;

    /* renamed from: n, reason: collision with root package name */
    @I41.h
    public A f340358n;

    /* renamed from: o, reason: collision with root package name */
    @I41.h
    public C36378k f340359o;

    /* renamed from: p, reason: collision with root package name */
    @I41.h
    public com.facebook.cache.disk.k f340360p;

    /* renamed from: q, reason: collision with root package name */
    @I41.h
    public com.facebook.imagepipeline.bitmaps.a f340361q;

    /* renamed from: r, reason: collision with root package name */
    @I41.h
    public com.facebook.imagepipeline.platform.c f340362r;

    /* renamed from: s, reason: collision with root package name */
    @I41.h
    public TW0.a f340363s;

    public u(r rVar) {
        com.facebook.imagepipeline.systrace.b.a();
        this.f340346b = rVar;
        t tVar = rVar.f340322u;
        tVar.getClass();
        this.f340345a = new y0(rVar.f340309h.f340285d);
        tVar.getClass();
        com.facebook.common.references.h<Closeable> hVar = com.facebook.common.references.a.f339838f;
        this.f340347c = new C36382a(rVar.f340324w);
        com.facebook.imagepipeline.systrace.b.a();
    }

    @I41.h
    public final TW0.a a() {
        if (this.f340363s == null) {
            com.facebook.imagepipeline.bitmaps.a aVar = this.f340361q;
            r rVar = this.f340346b;
            if (aVar == null) {
                F f12 = rVar.f340316o;
                e();
                this.f340361q = new com.facebook.imagepipeline.bitmaps.a(f12.a(), this.f340347c);
            }
            com.facebook.imagepipeline.bitmaps.a aVar2 = this.f340361q;
            b bVar = rVar.f340309h;
            com.facebook.imagepipeline.cache.s<com.facebook.cache.common.c, YW0.b> sVarB = b();
            rVar.f340322u.getClass();
            if (!TW0.b.f15696a) {
                try {
                    TW0.b.f15697b = (TW0.a) Class.forName("com.facebook.fresco.animation.factory.AnimatedFactoryV2Impl").getConstructor(com.facebook.imagepipeline.bitmaps.f.class, f.class, com.facebook.imagepipeline.cache.s.class, Boolean.TYPE, com.facebook.common.executors.g.class).newInstance(aVar2, bVar, sVarB, Boolean.FALSE, null);
                } catch (Throwable unused) {
                }
                if (TW0.b.f15697b != null) {
                    TW0.b.f15696a = true;
                }
            }
            this.f340363s = TW0.b.f15697b;
        }
        return this.f340363s;
    }

    public final com.facebook.imagepipeline.cache.s<com.facebook.cache.common.c, YW0.b> b() {
        if (this.f340348d == null) {
            r rVar = this.f340346b;
            com.facebook.imagepipeline.cache.q qVar = rVar.f340325x;
            com.facebook.imagepipeline.cache.u uVar = rVar.f340302a;
            C36373f c36373f = rVar.f340303b;
            t tVar = rVar.f340322u;
            tVar.getClass();
            tVar.getClass();
            this.f340348d = qVar.a(uVar, rVar.f340313l, c36373f, null);
        }
        return this.f340348d;
    }

    public final B<com.facebook.cache.common.c, PooledByteBuffer> c() {
        if (this.f340351g == null) {
            r rVar = this.f340346b;
            rVar.getClass();
            if (this.f340350f == null) {
                this.f340350f = com.facebook.imagepipeline.cache.y.a(rVar.f340308g, rVar.f340313l);
            }
            this.f340351g = com.facebook.imagepipeline.cache.z.a(this.f340350f, rVar.f340310i);
        }
        return this.f340351g;
    }

    public final C36378k d() {
        if (this.f340352h == null) {
            com.facebook.cache.disk.k kVar = this.f340353i;
            r rVar = this.f340346b;
            if (kVar == null) {
                this.f340353i = rVar.f340307f.a(rVar.f340312k);
            }
            com.facebook.cache.disk.k kVar2 = this.f340353i;
            wW0.g gVarB = rVar.f340316o.b(rVar.f340314m);
            wW0.j jVarC = rVar.f340316o.c();
            ExecutorService executorService = rVar.f340309h.f340282a;
            this.f340352h = new C36378k(kVar2, gVarB, jVarC, executorService, executorService, rVar.f340310i);
        }
        return this.f340352h;
    }

    public final com.facebook.imagepipeline.platform.d e() {
        if (this.f340362r == null) {
            r rVar = this.f340346b;
            F f12 = rVar.f340316o;
            rVar.f340322u.getClass();
            int i12 = f12.f340435a.f340427c.f340446d;
            this.f340362r = new com.facebook.imagepipeline.platform.c(f12.a(), i12, new y.c(i12));
        }
        return this.f340362r;
    }

    public final C36378k f() {
        if (this.f340359o == null) {
            com.facebook.cache.disk.k kVar = this.f340360p;
            r rVar = this.f340346b;
            if (kVar == null) {
                this.f340360p = rVar.f340307f.a(rVar.f340321t);
            }
            com.facebook.cache.disk.k kVar2 = this.f340360p;
            wW0.g gVarB = rVar.f340316o.b(rVar.f340314m);
            wW0.j jVarC = rVar.f340316o.c();
            ExecutorService executorService = rVar.f340309h.f340282a;
            this.f340359o = new C36378k(kVar2, gVarB, jVarC, executorService, executorService, rVar.f340310i);
        }
        return this.f340359o;
    }
}
