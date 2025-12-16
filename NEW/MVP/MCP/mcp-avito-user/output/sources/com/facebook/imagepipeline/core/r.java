package com.facebook.imagepipeline.core;

import aX0.InterfaceC19835f;
import android.app.ActivityManager;
import android.content.Context;
import android.graphics.Bitmap;
import com.facebook.cache.disk.d;
import com.facebook.common.time.RealtimeSinceBootClock;
import com.facebook.imagepipeline.cache.C36373f;
import com.facebook.imagepipeline.cache.L;
import com.facebook.imagepipeline.core.t;
import com.facebook.imagepipeline.memory.E;
import com.facebook.imagepipeline.memory.F;
import com.facebook.imagepipeline.producers.D;
import com.facebook.imagepipeline.producers.V;
import com.facebook.infer.annotation.Nullsafe;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

/* compiled from: ImagePipelineConfig.java */
@Nullsafe
/* loaded from: classes12.dex */
public class r implements s {

    /* renamed from: y, reason: collision with root package name */
    public static final b f340301y = new b(null);

    /* renamed from: a, reason: collision with root package name */
    public final com.facebook.imagepipeline.cache.u f340302a;

    /* renamed from: b, reason: collision with root package name */
    public final C36373f f340303b;

    /* renamed from: c, reason: collision with root package name */
    public final com.facebook.imagepipeline.cache.v f340304c;

    /* renamed from: d, reason: collision with root package name */
    public final Context f340305d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f340306e;

    /* renamed from: f, reason: collision with root package name */
    public final c f340307f;

    /* renamed from: g, reason: collision with root package name */
    public final com.facebook.imagepipeline.cache.w f340308g;

    /* renamed from: h, reason: collision with root package name */
    public final com.facebook.imagepipeline.core.b f340309h;

    /* renamed from: i, reason: collision with root package name */
    public final L f340310i;

    /* renamed from: j, reason: collision with root package name */
    public final com.facebook.common.internal.r<Boolean> f340311j;

    /* renamed from: k, reason: collision with root package name */
    public final com.facebook.cache.disk.d f340312k;

    /* renamed from: l, reason: collision with root package name */
    public final wW0.c f340313l;

    /* renamed from: m, reason: collision with root package name */
    public final int f340314m;

    /* renamed from: n, reason: collision with root package name */
    public final V f340315n;

    /* renamed from: o, reason: collision with root package name */
    public final F f340316o;

    /* renamed from: p, reason: collision with root package name */
    public final com.facebook.imagepipeline.decoder.f f340317p;

    /* renamed from: q, reason: collision with root package name */
    public final Set<InterfaceC19835f> f340318q;

    /* renamed from: r, reason: collision with root package name */
    public final HashSet f340319r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f340320s;

    /* renamed from: t, reason: collision with root package name */
    public final com.facebook.cache.disk.d f340321t;

    /* renamed from: u, reason: collision with root package name */
    public final t f340322u;

    /* renamed from: v, reason: collision with root package name */
    public final boolean f340323v;

    /* renamed from: w, reason: collision with root package name */
    public final VW0.b f340324w;

    /* renamed from: x, reason: collision with root package name */
    public final com.facebook.imagepipeline.cache.q f340325x;

    /* compiled from: ImagePipelineConfig.java */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final Context f340326a;

        /* renamed from: c, reason: collision with root package name */
        @I41.h
        public wW0.c f340328c;

        /* renamed from: e, reason: collision with root package name */
        @I41.h
        public V f340330e;

        /* renamed from: f, reason: collision with root package name */
        @I41.h
        public LinkedHashSet f340331f;

        /* renamed from: g, reason: collision with root package name */
        public final t.b f340332g;

        /* renamed from: h, reason: collision with root package name */
        public final boolean f340333h;

        /* renamed from: i, reason: collision with root package name */
        public final VW0.b f340334i;

        /* renamed from: b, reason: collision with root package name */
        public boolean f340327b = false;

        /* renamed from: d, reason: collision with root package name */
        @I41.h
        public Integer f340329d = null;

        public a(Context context, q qVar) {
            t.b bVar = new t.b();
            bVar.f340340a = com.facebook.common.internal.t.a(Boolean.FALSE);
            bVar.f340341b = true;
            bVar.f340342c = true;
            bVar.f340343d = 20;
            this.f340332g = bVar;
            this.f340333h = true;
            this.f340334i = new VW0.b();
            context.getClass();
            this.f340326a = context;
        }
    }

    /* compiled from: ImagePipelineConfig.java */
    public static class b {
        public /* synthetic */ b(q qVar) {
            this();
        }

        public b() {
        }
    }

    public r(a aVar, q qVar) {
        L l12;
        com.facebook.imagepipeline.systrace.b.a();
        t.b bVar = aVar.f340332g;
        bVar.getClass();
        this.f340322u = new t(bVar, null);
        Object systemService = aVar.f340326a.getSystemService("activity");
        systemService.getClass();
        this.f340302a = new com.facebook.imagepipeline.cache.u((ActivityManager) systemService);
        this.f340303b = new C36373f();
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
        this.f340304c = com.facebook.imagepipeline.cache.v.e();
        Context context = aVar.f340326a;
        context.getClass();
        this.f340305d = context;
        e eVar = new e();
        c cVar = new c();
        cVar.f340287a = eVar;
        this.f340307f = cVar;
        this.f340306e = aVar.f340327b;
        this.f340308g = new com.facebook.imagepipeline.cache.w();
        synchronized (L.class) {
            try {
                if (L.f340215a == null) {
                    L.f340215a = new L();
                }
                l12 = L.f340215a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f340310i = l12;
        this.f340311j = new q();
        Context context2 = aVar.f340326a;
        try {
            com.facebook.imagepipeline.systrace.b.a();
            com.facebook.cache.disk.d dVar = new com.facebook.cache.disk.d(new d.b(context2, null));
            com.facebook.imagepipeline.systrace.b.a();
            this.f340312k = dVar;
            wW0.c cVar2 = aVar.f340328c;
            this.f340313l = cVar2 == null ? wW0.d.a() : cVar2;
            Integer num = aVar.f340329d;
            this.f340314m = num != null ? num.intValue() : 0;
            com.facebook.imagepipeline.systrace.b.a();
            V v12 = aVar.f340330e;
            V v13 = v12;
            if (v12 == null) {
                D d12 = new D(RealtimeSinceBootClock.get());
                d12.f340529a = 30000;
                v13 = d12;
            }
            this.f340315n = v13;
            com.facebook.imagepipeline.systrace.b.a();
            E e12 = new E(new E.b(), null);
            this.f340316o = new F(e12);
            this.f340317p = new com.facebook.imagepipeline.decoder.f();
            Set<InterfaceC19835f> set = aVar.f340331f;
            this.f340318q = set == null ? new HashSet<>() : set;
            this.f340319r = new HashSet();
            this.f340320s = true;
            this.f340321t = dVar;
            this.f340309h = new com.facebook.imagepipeline.core.b(e12.f340427c.f340446d);
            this.f340323v = aVar.f340333h;
            this.f340324w = aVar.f340334i;
            this.f340325x = new com.facebook.imagepipeline.cache.q();
        } finally {
            com.facebook.imagepipeline.systrace.b.a();
        }
    }

    @Override // com.facebook.imagepipeline.core.s
    public final t a() {
        return this.f340322u;
    }
}
