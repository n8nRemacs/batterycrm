package com.facebook.imagepipeline.cache;

import com.facebook.common.memory.PooledByteBuffer;
import com.facebook.infer.annotation.Nullsafe;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import pW0.InterfaceC47022a;
import uW0.C48986a;

/* compiled from: BufferedDiskCache.java */
@Nullsafe
/* renamed from: com.facebook.imagepipeline.cache.k, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public class C36378k {

    /* renamed from: a, reason: collision with root package name */
    public final com.facebook.cache.disk.k f340232a;

    /* renamed from: b, reason: collision with root package name */
    public final wW0.g f340233b;

    /* renamed from: c, reason: collision with root package name */
    public final wW0.j f340234c;

    /* renamed from: d, reason: collision with root package name */
    public final Executor f340235d;

    /* renamed from: e, reason: collision with root package name */
    public final Executor f340236e;

    /* renamed from: f, reason: collision with root package name */
    public final M f340237f = new M();

    /* renamed from: g, reason: collision with root package name */
    public final A f340238g;

    /* compiled from: BufferedDiskCache.java */
    /* renamed from: com.facebook.imagepipeline.cache.k$a */
    public class a implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ com.facebook.cache.common.c f340239b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ YW0.d f340240c;

        public a(com.facebook.cache.common.c cVar, YW0.d dVar) {
            this.f340239b = cVar;
            this.f340240c = dVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                C36378k.b(C36378k.this, this.f340239b, this.f340240c);
            } finally {
            }
        }
    }

    public C36378k(com.facebook.cache.disk.k kVar, wW0.g gVar, wW0.j jVar, Executor executor, Executor executor2, A a12) {
        this.f340232a = kVar;
        this.f340233b = gVar;
        this.f340234c = jVar;
        this.f340235d = executor;
        this.f340236e = executor2;
        this.f340238g = a12;
    }

    public static PooledByteBuffer a(C36378k c36378k, com.facebook.cache.common.c cVar) throws IOException {
        A a12 = c36378k.f340238g;
        try {
            C48986a.g(cVar.a(), C36378k.class, "Disk cache read for %s");
            InterfaceC47022a interfaceC47022aA = c36378k.f340232a.a(cVar);
            if (interfaceC47022aA == null) {
                C48986a.g(cVar.a(), C36378k.class, "Disk cache miss for %s");
                a12.getClass();
                return null;
            }
            C48986a.g(cVar.a(), C36378k.class, "Found entry in disk cache for %s");
            a12.getClass();
            InputStream inputStreamA = interfaceC47022aA.a();
            try {
                com.facebook.imagepipeline.memory.z zVarB = c36378k.f340233b.b((int) interfaceC47022aA.size(), inputStreamA);
                inputStreamA.close();
                C48986a.g(cVar.a(), C36378k.class, "Successful read from disk cache for %s");
                return zVarB;
            } catch (Throwable th2) {
                inputStreamA.close();
                throw th2;
            }
        } catch (IOException e12) {
            C48986a.k(e12, "Exception reading from cache for %s", cVar.a());
            a12.getClass();
            throw e12;
        }
    }

    public static void b(C36378k c36378k, com.facebook.cache.common.c cVar, YW0.d dVar) {
        c36378k.getClass();
        C48986a.g(cVar.a(), C36378k.class, "About to write to disk-cache for key %s");
        try {
            c36378k.f340232a.d(cVar, new C36381n(c36378k, dVar));
            c36378k.f340238g.getClass();
            C48986a.g(cVar.a(), C36378k.class, "Successful disk-cache write for key %s");
        } catch (IOException e12) {
            C48986a.k(e12, "Failed to write to disk-cache for key %s", cVar.a());
        }
    }

    public final bolts.x<YW0.d> c(com.facebook.cache.common.c cVar, AtomicBoolean atomicBoolean) {
        bolts.x<YW0.d> xVarC;
        try {
            com.facebook.imagepipeline.systrace.b.a();
            YW0.d dVarA = this.f340237f.a(cVar);
            if (dVarA != null) {
                C48986a.g(cVar.a(), C36378k.class, "Found image for %s in staging area");
                this.f340238g.getClass();
                return bolts.x.d(dVarA);
            }
            try {
                xVarC = bolts.x.a(new CallableC36377j(this, atomicBoolean, cVar), this.f340235d);
            } catch (Exception e12) {
                C48986a.k(e12, "Failed to schedule disk-cache read for %s", cVar.a());
                xVarC = bolts.x.c(e12);
            }
            return xVarC;
        } finally {
            com.facebook.imagepipeline.systrace.b.a();
        }
    }

    public final void d(com.facebook.cache.common.c cVar, YW0.d dVar) {
        M m12 = this.f340237f;
        try {
            com.facebook.imagepipeline.systrace.b.a();
            cVar.getClass();
            if (!YW0.d.k(dVar)) {
                throw new IllegalArgumentException();
            }
            m12.c(cVar, dVar);
            YW0.d dVarA = YW0.d.a(dVar);
            try {
                this.f340236e.execute(new a(cVar, dVarA));
            } catch (Exception e12) {
                C48986a.k(e12, "Failed to schedule disk-cache write for %s", cVar.a());
                m12.e(cVar, dVar);
                YW0.d.b(dVarA);
            }
        } finally {
            com.facebook.imagepipeline.systrace.b.a();
        }
    }

    public final void e(com.facebook.cache.common.c cVar) {
        cVar.getClass();
        this.f340237f.d(cVar);
        try {
            bolts.x.a(new CallableC36379l(this, cVar), this.f340236e);
        } catch (Exception e12) {
            C48986a.k(e12, "Failed to schedule disk-cache remove for %s", cVar.a());
            bolts.x.c(e12);
        }
    }
}
