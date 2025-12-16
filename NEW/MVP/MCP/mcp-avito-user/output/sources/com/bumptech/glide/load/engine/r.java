package com.bumptech.glide.load.engine;

import j.N;

/* compiled from: EngineResource.java */
/* loaded from: classes5.dex */
class r<Z> implements w<Z> {

    /* renamed from: b, reason: collision with root package name */
    public final boolean f339154b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f339155c;

    /* renamed from: d, reason: collision with root package name */
    public final w<Z> f339156d;

    /* renamed from: e, reason: collision with root package name */
    public final m f339157e;

    /* renamed from: f, reason: collision with root package name */
    public final com.bumptech.glide.load.h f339158f;

    /* renamed from: g, reason: collision with root package name */
    public int f339159g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f339160h;

    /* compiled from: EngineResource.java */
    public interface a {
    }

    public r(w wVar, boolean z12, boolean z13, com.bumptech.glide.load.h hVar, m mVar) {
        com.bumptech.glide.util.k.c(wVar, "Argument must not be null");
        this.f339156d = wVar;
        this.f339154b = z12;
        this.f339155c = z13;
        this.f339158f = hVar;
        com.bumptech.glide.util.k.c(mVar, "Argument must not be null");
        this.f339157e = mVar;
    }

    public final synchronized void a() {
        if (this.f339160h) {
            throw new IllegalStateException("Cannot acquire a recycled resource");
        }
        this.f339159g++;
    }

    @Override // com.bumptech.glide.load.engine.w
    @N
    public final Class<Z> b() {
        return this.f339156d.b();
    }

    @Override // com.bumptech.glide.load.engine.w
    public final synchronized void c() {
        if (this.f339159g > 0) {
            throw new IllegalStateException("Cannot recycle a resource while it is still acquired");
        }
        if (this.f339160h) {
            throw new IllegalStateException("Cannot recycle a resource that has already been recycled");
        }
        this.f339160h = true;
        if (this.f339155c) {
            this.f339156d.c();
        }
    }

    public final void d() {
        boolean z12;
        synchronized (this) {
            int i12 = this.f339159g;
            if (i12 <= 0) {
                throw new IllegalStateException("Cannot release a recycled or not yet acquired resource");
            }
            z12 = true;
            int i13 = i12 - 1;
            this.f339159g = i13;
            if (i13 != 0) {
                z12 = false;
            }
        }
        if (z12) {
            this.f339157e.d(this.f339158f, this);
        }
    }

    @Override // com.bumptech.glide.load.engine.w
    @N
    public final Z get() {
        return this.f339156d.get();
    }

    @Override // com.bumptech.glide.load.engine.w
    public final int getSize() {
        return this.f339156d.getSize();
    }

    public final synchronized String toString() {
        return "EngineResource{isMemoryCacheable=" + this.f339154b + ", listener=" + this.f339157e + ", key=" + this.f339158f + ", acquired=" + this.f339159g + ", isRecycled=" + this.f339160h + ", resource=" + this.f339156d + '}';
    }
}
