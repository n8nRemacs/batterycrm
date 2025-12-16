package com.bumptech.glide.request;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.engine.l;
import com.bumptech.glide.load.k;
import com.bumptech.glide.load.n;
import com.bumptech.glide.load.resource.bitmap.AbstractC36364h;
import com.bumptech.glide.load.resource.bitmap.DownsampleStrategy;
import com.bumptech.glide.load.resource.bitmap.q;
import com.bumptech.glide.request.a;
import com.bumptech.glide.util.m;
import j.InterfaceC42154j;
import j.InterfaceC42165v;
import j.N;
import j.P;
import okhttp3.internal.http2.Http2;
import shark.AndroidResourceIdNames;

/* compiled from: BaseRequestOptions.java */
/* loaded from: classes5.dex */
public abstract class a<T extends a<T>> implements Cloneable {

    /* renamed from: b, reason: collision with root package name */
    public int f339538b;

    /* renamed from: e, reason: collision with root package name */
    @P
    public Drawable f339541e;

    /* renamed from: f, reason: collision with root package name */
    public int f339542f;

    /* renamed from: g, reason: collision with root package name */
    @P
    public Drawable f339543g;

    /* renamed from: l, reason: collision with root package name */
    public boolean f339548l;

    /* renamed from: n, reason: collision with root package name */
    public int f339550n;

    /* renamed from: r, reason: collision with root package name */
    public boolean f339554r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f339555s;

    /* renamed from: u, reason: collision with root package name */
    public boolean f339557u;

    /* renamed from: c, reason: collision with root package name */
    @N
    public l f339539c = l.f339090d;

    /* renamed from: d, reason: collision with root package name */
    @N
    public Priority f339540d = Priority.f338667b;

    /* renamed from: h, reason: collision with root package name */
    public boolean f339544h = true;

    /* renamed from: i, reason: collision with root package name */
    public int f339545i = -1;

    /* renamed from: j, reason: collision with root package name */
    public int f339546j = -1;

    /* renamed from: k, reason: collision with root package name */
    @N
    public com.bumptech.glide.load.h f339547k = jW0.c.f405623b;

    /* renamed from: m, reason: collision with root package name */
    public boolean f339549m = true;

    /* renamed from: o, reason: collision with root package name */
    @N
    public k f339551o = new k();

    /* renamed from: p, reason: collision with root package name */
    @N
    public com.bumptech.glide.util.b f339552p = new com.bumptech.glide.util.b();

    /* renamed from: q, reason: collision with root package name */
    @N
    public Class<?> f339553q = Object.class;

    /* renamed from: t, reason: collision with root package name */
    public boolean f339556t = true;

    public static boolean l(int i12, int i13) {
        return (i12 & i13) != 0;
    }

    @N
    @InterfaceC42154j
    public T a(@N a<?> aVar) {
        if (this.f339555s) {
            return (T) clone().a(aVar);
        }
        int i12 = aVar.f339538b;
        if (l(aVar.f339538b, 1048576)) {
            this.f339557u = aVar.f339557u;
        }
        if (l(aVar.f339538b, 4)) {
            this.f339539c = aVar.f339539c;
        }
        if (l(aVar.f339538b, 8)) {
            this.f339540d = aVar.f339540d;
        }
        if (l(aVar.f339538b, 16)) {
            this.f339541e = aVar.f339541e;
            this.f339542f = 0;
            this.f339538b &= -33;
        }
        if (l(aVar.f339538b, 32)) {
            this.f339542f = aVar.f339542f;
            this.f339541e = null;
            this.f339538b &= -17;
        }
        if (l(aVar.f339538b, 64)) {
            this.f339543g = aVar.f339543g;
            this.f339538b &= -129;
        }
        if (l(aVar.f339538b, 128)) {
            this.f339543g = null;
            this.f339538b &= -65;
        }
        if (l(aVar.f339538b, 256)) {
            this.f339544h = aVar.f339544h;
        }
        if (l(aVar.f339538b, 512)) {
            this.f339546j = aVar.f339546j;
            this.f339545i = aVar.f339545i;
        }
        if (l(aVar.f339538b, 1024)) {
            this.f339547k = aVar.f339547k;
        }
        if (l(aVar.f339538b, 4096)) {
            this.f339553q = aVar.f339553q;
        }
        if (l(aVar.f339538b, 8192)) {
            this.f339550n = 0;
            this.f339538b &= -16385;
        }
        if (l(aVar.f339538b, Http2.INITIAL_MAX_FRAME_SIZE)) {
            this.f339550n = aVar.f339550n;
            this.f339538b &= -8193;
        }
        if (l(aVar.f339538b, AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR)) {
            this.f339549m = aVar.f339549m;
        }
        if (l(aVar.f339538b, 131072)) {
            this.f339548l = aVar.f339548l;
        }
        if (l(aVar.f339538b, 2048)) {
            this.f339552p.putAll(aVar.f339552p);
            this.f339556t = aVar.f339556t;
        }
        if (!this.f339549m) {
            this.f339552p.clear();
            int i13 = this.f339538b;
            this.f339548l = false;
            this.f339538b = i13 & (-133121);
            this.f339556t = true;
        }
        this.f339538b |= aVar.f339538b;
        this.f339551o.f339200b.g(aVar.f339551o.f339200b);
        q();
        return this;
    }

    @Override // 
    @InterfaceC42154j
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public T clone() {
        try {
            T t12 = (T) super.clone();
            k kVar = new k();
            t12.f339551o = kVar;
            kVar.f339200b.g(this.f339551o.f339200b);
            com.bumptech.glide.util.b bVar = new com.bumptech.glide.util.b();
            t12.f339552p = bVar;
            bVar.putAll(this.f339552p);
            t12.f339554r = false;
            t12.f339555s = false;
            return t12;
        } catch (CloneNotSupportedException e12) {
            throw new RuntimeException(e12);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        aVar.getClass();
        return Float.compare(1.0f, 1.0f) == 0 && this.f339542f == aVar.f339542f && m.a(this.f339541e, aVar.f339541e) && m.a(this.f339543g, aVar.f339543g) && this.f339550n == aVar.f339550n && m.a(null, null) && this.f339544h == aVar.f339544h && this.f339545i == aVar.f339545i && this.f339546j == aVar.f339546j && this.f339548l == aVar.f339548l && this.f339549m == aVar.f339549m && this.f339539c.equals(aVar.f339539c) && this.f339540d == aVar.f339540d && this.f339551o.equals(aVar.f339551o) && this.f339552p.equals(aVar.f339552p) && this.f339553q.equals(aVar.f339553q) && m.a(this.f339547k, aVar.f339547k) && m.a(null, null);
    }

    @N
    @InterfaceC42154j
    public final T f(@N Class<?> cls) {
        if (this.f339555s) {
            return (T) clone().f(cls);
        }
        this.f339553q = cls;
        this.f339538b |= 4096;
        q();
        return this;
    }

    @N
    @InterfaceC42154j
    public final T g(@N l lVar) {
        if (this.f339555s) {
            return (T) clone().g(lVar);
        }
        com.bumptech.glide.util.k.c(lVar, "Argument must not be null");
        this.f339539c = lVar;
        this.f339538b |= 4;
        q();
        return this;
    }

    public final int hashCode() {
        return m.g(m.g(m.g(m.g(m.g(m.g(m.g(m.f(0, m.f(0, m.f(this.f339549m ? 1 : 0, m.f(this.f339548l ? 1 : 0, m.f(this.f339546j, m.f(this.f339545i, m.f(this.f339544h ? 1 : 0, m.g(m.f(this.f339550n, m.g(m.f(0, m.g(m.f(this.f339542f, m.e(1.0f, 17)), this.f339541e)), this.f339543g)), null)))))))), this.f339539c), this.f339540d), this.f339551o), this.f339552p), this.f339553q), this.f339547k), null);
    }

    @N
    @InterfaceC42154j
    public final T i(@InterfaceC42165v int i12) {
        if (this.f339555s) {
            return (T) clone().i(i12);
        }
        this.f339542f = i12;
        int i13 = this.f339538b | 32;
        this.f339541e = null;
        this.f339538b = i13 & (-17);
        q();
        return this;
    }

    @N
    @InterfaceC42154j
    public final T j(@P Drawable drawable) {
        if (this.f339555s) {
            return (T) clone().j(drawable);
        }
        this.f339541e = drawable;
        int i12 = this.f339538b | 16;
        this.f339542f = 0;
        this.f339538b = i12 & (-33);
        q();
        return this;
    }

    @N
    @InterfaceC42154j
    public final T k(@InterfaceC42165v int i12) {
        if (this.f339555s) {
            return (T) clone().k(i12);
        }
        this.f339550n = i12;
        this.f339538b = (this.f339538b | Http2.INITIAL_MAX_FRAME_SIZE) & (-8193);
        q();
        return this;
    }

    @N
    public final a m(@N DownsampleStrategy downsampleStrategy, @N AbstractC36364h abstractC36364h) {
        if (this.f339555s) {
            return clone().m(downsampleStrategy, abstractC36364h);
        }
        com.bumptech.glide.load.j<DownsampleStrategy> jVar = DownsampleStrategy.f339337f;
        com.bumptech.glide.util.k.c(downsampleStrategy, "Argument must not be null");
        r(jVar, downsampleStrategy);
        return u(abstractC36364h, false);
    }

    @N
    @InterfaceC42154j
    public final T n(int i12, int i13) {
        if (this.f339555s) {
            return (T) clone().n(i12, i13);
        }
        this.f339546j = i12;
        this.f339545i = i13;
        this.f339538b |= 512;
        q();
        return this;
    }

    @N
    @InterfaceC42154j
    public final T o(@P Drawable drawable) {
        if (this.f339555s) {
            return (T) clone().o(drawable);
        }
        this.f339543g = drawable;
        this.f339538b = (this.f339538b | 64) & (-129);
        q();
        return this;
    }

    @N
    @InterfaceC42154j
    public final a p() {
        Priority priority = Priority.f338668c;
        if (this.f339555s) {
            return clone().p();
        }
        this.f339540d = priority;
        this.f339538b |= 8;
        q();
        return this;
    }

    @N
    public final void q() {
        if (this.f339554r) {
            throw new IllegalStateException("You cannot modify locked T, consider clone()");
        }
    }

    @N
    @InterfaceC42154j
    public final a r(@N com.bumptech.glide.load.j jVar, @N DownsampleStrategy downsampleStrategy) {
        if (this.f339555s) {
            return clone().r(jVar, downsampleStrategy);
        }
        com.bumptech.glide.util.k.b(jVar);
        com.bumptech.glide.util.k.b(downsampleStrategy);
        this.f339551o.f339200b.put(jVar, downsampleStrategy);
        q();
        return this;
    }

    @N
    @InterfaceC42154j
    public final T s(@N com.bumptech.glide.load.h hVar) {
        if (this.f339555s) {
            return (T) clone().s(hVar);
        }
        this.f339547k = hVar;
        this.f339538b |= 1024;
        q();
        return this;
    }

    @N
    @InterfaceC42154j
    public final a t() {
        if (this.f339555s) {
            return clone().t();
        }
        this.f339544h = false;
        this.f339538b |= 256;
        q();
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @N
    public final T u(@N n<Bitmap> nVar, boolean z12) {
        if (this.f339555s) {
            return (T) clone().u(nVar, z12);
        }
        q qVar = new q(nVar, z12);
        w(Bitmap.class, nVar, z12);
        w(Drawable.class, qVar, z12);
        w(BitmapDrawable.class, qVar, z12);
        w(com.bumptech.glide.load.resource.gif.c.class, new com.bumptech.glide.load.resource.gif.f(nVar), z12);
        q();
        return this;
    }

    @N
    @InterfaceC42154j
    public final a v(@N DownsampleStrategy downsampleStrategy, @N com.bumptech.glide.load.resource.bitmap.n nVar) {
        if (this.f339555s) {
            return clone().v(downsampleStrategy, nVar);
        }
        com.bumptech.glide.load.j<DownsampleStrategy> jVar = DownsampleStrategy.f339337f;
        com.bumptech.glide.util.k.c(downsampleStrategy, "Argument must not be null");
        r(jVar, downsampleStrategy);
        return u(nVar, true);
    }

    @N
    public final <Y> T w(@N Class<Y> cls, @N n<Y> nVar, boolean z12) {
        if (this.f339555s) {
            return (T) clone().w(cls, nVar, z12);
        }
        com.bumptech.glide.util.k.b(nVar);
        this.f339552p.put(cls, nVar);
        int i12 = this.f339538b;
        this.f339549m = true;
        this.f339538b = 67584 | i12;
        this.f339556t = false;
        if (z12) {
            this.f339538b = i12 | 198656;
            this.f339548l = true;
        }
        q();
        return this;
    }

    @N
    @InterfaceC42154j
    public final a x() {
        if (this.f339555s) {
            return clone().x();
        }
        this.f339557u = true;
        this.f339538b |= 1048576;
        q();
        return this;
    }
}
