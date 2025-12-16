package com.bumptech.glide.request;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.util.Log;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.GlideException;
import com.bumptech.glide.load.engine.m;
import com.bumptech.glide.load.engine.w;
import com.bumptech.glide.request.target.p;
import com.bumptech.glide.request.target.q;
import j.B;
import j.InterfaceC42165v;
import j.N;
import j.P;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.Executor;

/* compiled from: SingleRequest.java */
/* loaded from: classes5.dex */
public final class i<R> implements d, p, h {

    /* renamed from: y, reason: collision with root package name */
    public static final boolean f339560y = Log.isLoggable("Request", 2);

    /* renamed from: a, reason: collision with root package name */
    public final com.bumptech.glide.util.pool.e f339561a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f339562b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f339563c;

    /* renamed from: d, reason: collision with root package name */
    public final com.bumptech.glide.e f339564d;

    /* renamed from: e, reason: collision with root package name */
    @P
    public final Object f339565e;

    /* renamed from: f, reason: collision with root package name */
    public final Class<R> f339566f;

    /* renamed from: g, reason: collision with root package name */
    public final com.bumptech.glide.request.a<?> f339567g;

    /* renamed from: h, reason: collision with root package name */
    public final int f339568h;

    /* renamed from: i, reason: collision with root package name */
    public final int f339569i;

    /* renamed from: j, reason: collision with root package name */
    public final Priority f339570j;

    /* renamed from: k, reason: collision with root package name */
    public final q<R> f339571k;

    /* renamed from: l, reason: collision with root package name */
    @P
    public final ArrayList f339572l;

    /* renamed from: m, reason: collision with root package name */
    public final com.bumptech.glide.request.transition.g<? super R> f339573m;

    /* renamed from: n, reason: collision with root package name */
    public final Executor f339574n;

    /* renamed from: o, reason: collision with root package name */
    @B
    public w<R> f339575o;

    /* renamed from: p, reason: collision with root package name */
    @B
    public m.d f339576p;

    /* renamed from: q, reason: collision with root package name */
    public volatile m f339577q;

    /* renamed from: r, reason: collision with root package name */
    @B
    public a f339578r;

    /* renamed from: s, reason: collision with root package name */
    @B
    @P
    public Drawable f339579s;

    /* renamed from: t, reason: collision with root package name */
    @B
    @P
    public Drawable f339580t;

    /* renamed from: u, reason: collision with root package name */
    @B
    @P
    public Drawable f339581u;

    /* renamed from: v, reason: collision with root package name */
    @B
    public int f339582v;

    /* renamed from: w, reason: collision with root package name */
    @B
    public int f339583w;

    /* renamed from: x, reason: collision with root package name */
    @B
    public boolean f339584x;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SingleRequest.java */
    public static final class a {

        /* renamed from: b, reason: collision with root package name */
        public static final a f339585b;

        /* renamed from: c, reason: collision with root package name */
        public static final a f339586c;

        /* renamed from: d, reason: collision with root package name */
        public static final a f339587d;

        /* renamed from: e, reason: collision with root package name */
        public static final a f339588e;

        /* renamed from: f, reason: collision with root package name */
        public static final a f339589f;

        /* renamed from: g, reason: collision with root package name */
        public static final a f339590g;

        /* renamed from: h, reason: collision with root package name */
        public static final /* synthetic */ a[] f339591h;

        static {
            a aVar = new a("PENDING", 0);
            f339585b = aVar;
            a aVar2 = new a("RUNNING", 1);
            f339586c = aVar2;
            a aVar3 = new a("WAITING_FOR_SIZE", 2);
            f339587d = aVar3;
            a aVar4 = new a("COMPLETE", 3);
            f339588e = aVar4;
            a aVar5 = new a("FAILED", 4);
            f339589f = aVar5;
            a aVar6 = new a("CLEARED", 5);
            f339590g = aVar6;
            f339591h = new a[]{aVar, aVar2, aVar3, aVar4, aVar5, aVar6};
        }

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f339591h.clone();
        }
    }

    public i(Context context, com.bumptech.glide.e eVar, @N Object obj, @P Object obj2, Class cls, com.bumptech.glide.request.a aVar, int i12, int i13, Priority priority, q qVar, @P ArrayList arrayList, m mVar, com.bumptech.glide.request.transition.g gVar, Executor executor) {
        if (f339560y) {
            String.valueOf(hashCode());
        }
        this.f339561a = com.bumptech.glide.util.pool.e.a();
        this.f339562b = obj;
        this.f339563c = context;
        this.f339564d = eVar;
        this.f339565e = obj2;
        this.f339566f = cls;
        this.f339567g = aVar;
        this.f339568h = i12;
        this.f339569i = i13;
        this.f339570j = priority;
        this.f339571k = qVar;
        this.f339572l = arrayList;
        this.f339577q = mVar;
        this.f339573m = gVar;
        this.f339574n = executor;
        this.f339578r = a.f339585b;
        eVar.getClass();
    }

    @Override // com.bumptech.glide.request.d
    public final boolean a() {
        boolean z12;
        synchronized (this.f339562b) {
            z12 = this.f339578r == a.f339590g;
        }
        return z12;
    }

    @Override // com.bumptech.glide.request.d
    public final void b() {
        synchronized (this.f339562b) {
            try {
                if (this.f339584x) {
                    throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
                }
                this.f339561a.b();
                int i12 = com.bumptech.glide.util.g.f339641a;
                SystemClock.elapsedRealtimeNanos();
                if (this.f339565e == null) {
                    if (com.bumptech.glide.util.m.i(this.f339568h, this.f339569i)) {
                        this.f339582v = this.f339568h;
                        this.f339583w = this.f339569i;
                    }
                    if (this.f339581u == null) {
                        com.bumptech.glide.request.a<?> aVar = this.f339567g;
                        aVar.getClass();
                        this.f339581u = null;
                        int i13 = aVar.f339550n;
                        if (i13 > 0) {
                            this.f339581u = g(i13);
                        }
                    }
                    h(new GlideException("Received null model"), this.f339581u == null ? 5 : 3);
                    return;
                }
                a aVar2 = this.f339578r;
                a aVar3 = a.f339586c;
                if (aVar2 == aVar3) {
                    throw new IllegalArgumentException("Cannot restart a running request");
                }
                if (aVar2 == a.f339588e) {
                    i(this.f339575o, DataSource.f338831f);
                    return;
                }
                a aVar4 = a.f339587d;
                this.f339578r = aVar4;
                if (com.bumptech.glide.util.m.i(this.f339568h, this.f339569i)) {
                    c(this.f339568h, this.f339569i);
                } else {
                    this.f339571k.j(this);
                }
                a aVar5 = this.f339578r;
                if (aVar5 == aVar3 || aVar5 == aVar4) {
                    this.f339571k.k(f());
                }
                if (f339560y) {
                    SystemClock.elapsedRealtimeNanos();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.bumptech.glide.request.target.p
    public final void c(int i12, int i13) {
        Object obj;
        int iRound = i12;
        this.f339561a.b();
        Object obj2 = this.f339562b;
        synchronized (obj2) {
            try {
                try {
                    boolean z12 = f339560y;
                    if (z12) {
                        int i14 = com.bumptech.glide.util.g.f339641a;
                        SystemClock.elapsedRealtimeNanos();
                    }
                    if (this.f339578r == a.f339587d) {
                        a aVar = a.f339586c;
                        this.f339578r = aVar;
                        this.f339567g.getClass();
                        if (iRound != Integer.MIN_VALUE) {
                            iRound = Math.round(iRound * 1.0f);
                        }
                        this.f339582v = iRound;
                        this.f339583w = i13 == Integer.MIN_VALUE ? i13 : Math.round(1.0f * i13);
                        if (z12) {
                            int i15 = com.bumptech.glide.util.g.f339641a;
                            SystemClock.elapsedRealtimeNanos();
                        }
                        m mVar = this.f339577q;
                        com.bumptech.glide.e eVar = this.f339564d;
                        Object obj3 = this.f339565e;
                        com.bumptech.glide.request.a<?> aVar2 = this.f339567g;
                        try {
                            obj = obj2;
                        } catch (Throwable th2) {
                            th = th2;
                            obj = obj2;
                        }
                        try {
                            this.f339576p = mVar.a(eVar, obj3, aVar2.f339547k, this.f339582v, this.f339583w, aVar2.f339553q, this.f339566f, this.f339570j, aVar2.f339539c, aVar2.f339552p, aVar2.f339548l, aVar2.f339556t, aVar2.f339551o, aVar2.f339544h, aVar2.f339557u, this, this.f339574n);
                            if (this.f339578r != aVar) {
                                this.f339576p = null;
                            }
                            if (z12) {
                                int i16 = com.bumptech.glide.util.g.f339641a;
                                SystemClock.elapsedRealtimeNanos();
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            throw th;
                        }
                    }
                } catch (Throwable th4) {
                    th = th4;
                }
            } catch (Throwable th5) {
                th = th5;
                obj = obj2;
            }
        }
    }

    @Override // com.bumptech.glide.request.d
    public final void clear() {
        synchronized (this.f339562b) {
            try {
                if (this.f339584x) {
                    throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
                }
                this.f339561a.b();
                a aVar = this.f339578r;
                a aVar2 = a.f339590g;
                if (aVar == aVar2) {
                    return;
                }
                if (this.f339584x) {
                    throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
                }
                this.f339561a.b();
                this.f339571k.h(this);
                m.d dVar = this.f339576p;
                w<R> wVar = null;
                if (dVar != null) {
                    dVar.a();
                    this.f339576p = null;
                }
                w<R> wVar2 = this.f339575o;
                if (wVar2 != null) {
                    this.f339575o = null;
                    wVar = wVar2;
                }
                this.f339571k.b(f());
                this.f339578r = aVar2;
                if (wVar != null) {
                    this.f339577q.getClass();
                    m.f(wVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.bumptech.glide.request.d
    public final boolean d() {
        boolean z12;
        synchronized (this.f339562b) {
            z12 = this.f339578r == a.f339588e;
        }
        return z12;
    }

    public final Object e() {
        this.f339561a.b();
        return this.f339562b;
    }

    @B
    public final Drawable f() {
        if (this.f339580t == null) {
            this.f339580t = this.f339567g.f339543g;
        }
        return this.f339580t;
    }

    @B
    public final Drawable g(@InterfaceC42165v int i12) {
        this.f339567g.getClass();
        Resources.Theme theme = this.f339563c.getTheme();
        com.bumptech.glide.e eVar = this.f339564d;
        return com.bumptech.glide.load.resource.drawable.a.a(eVar, eVar, i12, theme);
    }

    public final void h(GlideException glideException, int i12) {
        int i13;
        this.f339561a.b();
        synchronized (this.f339562b) {
            try {
                glideException.getClass();
                int i14 = this.f339564d.f338748h;
                if (i14 <= i12) {
                    Objects.toString(this.f339565e);
                    if (i14 <= 4) {
                        ArrayList arrayList = new ArrayList();
                        GlideException.a(glideException, arrayList);
                        int size = arrayList.size();
                        int i15 = 0;
                        while (i15 < size) {
                            int i16 = i15 + 1;
                            i15 = i16;
                        }
                    }
                }
                Drawable drawableF = null;
                this.f339576p = null;
                this.f339578r = a.f339589f;
                this.f339584x = true;
                try {
                    ArrayList arrayList2 = this.f339572l;
                    if (arrayList2 != null) {
                        Iterator it = arrayList2.iterator();
                        if (it.hasNext()) {
                            ((f) it.next()).d(glideException);
                            throw null;
                        }
                    }
                    if (this.f339565e == null) {
                        if (this.f339581u == null) {
                            com.bumptech.glide.request.a<?> aVar = this.f339567g;
                            aVar.getClass();
                            this.f339581u = null;
                            int i17 = aVar.f339550n;
                            if (i17 > 0) {
                                this.f339581u = g(i17);
                            }
                        }
                        drawableF = this.f339581u;
                    }
                    if (drawableF == null) {
                        if (this.f339579s == null) {
                            com.bumptech.glide.request.a<?> aVar2 = this.f339567g;
                            Drawable drawable = aVar2.f339541e;
                            this.f339579s = drawable;
                            if (drawable == null && (i13 = aVar2.f339542f) > 0) {
                                this.f339579s = g(i13);
                            }
                        }
                        drawableF = this.f339579s;
                    }
                    if (drawableF == null) {
                        drawableF = f();
                    }
                    this.f339571k.g(drawableF);
                    this.f339584x = false;
                } finally {
                    this.f339584x = false;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void i(w<?> wVar, DataSource dataSource) {
        this.f339561a.b();
        w<?> wVar2 = null;
        try {
            synchronized (this.f339562b) {
                try {
                    this.f339576p = null;
                    if (wVar == null) {
                        h(new GlideException("Expected to receive a Resource<R> with an object of " + this.f339566f + " inside, but instead got null."), 5);
                        return;
                    }
                    Object obj = wVar.get();
                    if (obj != null && this.f339566f.isAssignableFrom(obj.getClass())) {
                        j(wVar, obj, dataSource);
                        return;
                    }
                    try {
                        this.f339575o = null;
                        StringBuilder sb2 = new StringBuilder("Expected to receive an object of ");
                        sb2.append(this.f339566f);
                        sb2.append(" but instead got ");
                        sb2.append(obj != null ? obj.getClass() : "");
                        sb2.append("{");
                        sb2.append(obj);
                        sb2.append("} inside Resource{");
                        sb2.append(wVar);
                        sb2.append("}.");
                        sb2.append(obj != null ? "" : " To indicate failure return a null Resource object, rather than a Resource object containing null data.");
                        h(new GlideException(sb2.toString()), 5);
                        this.f339577q.getClass();
                        m.f(wVar);
                    } catch (Throwable th2) {
                        wVar2 = wVar;
                        th = th2;
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            }
        } catch (Throwable th4) {
            if (wVar2 != null) {
                this.f339577q.getClass();
                m.f(wVar2);
            }
            throw th4;
        }
    }

    @Override // com.bumptech.glide.request.d
    public final boolean isRunning() {
        boolean z12;
        synchronized (this.f339562b) {
            try {
                a aVar = this.f339578r;
                z12 = aVar == a.f339586c || aVar == a.f339587d;
            } finally {
            }
        }
        return z12;
    }

    @B
    public final void j(w<R> wVar, R r12, DataSource dataSource) {
        this.f339578r = a.f339588e;
        this.f339575o = wVar;
        if (this.f339564d.f338748h <= 3) {
            Objects.toString(dataSource);
            Objects.toString(this.f339565e);
            int i12 = com.bumptech.glide.util.g.f339641a;
            SystemClock.elapsedRealtimeNanos();
        }
        this.f339584x = true;
        try {
            ArrayList arrayList = this.f339572l;
            if (arrayList != null) {
                Iterator it = arrayList.iterator();
                if (it.hasNext()) {
                    ((f) it.next()).i(r12);
                    throw null;
                }
            }
            this.f339571k.c(r12, this.f339573m.a(dataSource, true));
            this.f339584x = false;
        } catch (Throwable th2) {
            this.f339584x = false;
            throw th2;
        }
    }

    @Override // com.bumptech.glide.request.d
    public final void pause() {
        synchronized (this.f339562b) {
            try {
                if (isRunning()) {
                    clear();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
