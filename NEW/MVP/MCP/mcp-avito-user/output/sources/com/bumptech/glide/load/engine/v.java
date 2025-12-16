package com.bumptech.glide.load.engine;

import androidx.core.util.y;
import com.bumptech.glide.util.pool.a;
import j.N;

/* compiled from: LockedResource.java */
/* loaded from: classes5.dex */
final class v<Z> implements w<Z>, a.d {

    /* renamed from: f, reason: collision with root package name */
    public static final y.a<v<?>> f339165f = com.bumptech.glide.util.pool.a.a(20, new a());

    /* renamed from: b, reason: collision with root package name */
    public final com.bumptech.glide.util.pool.e f339166b = com.bumptech.glide.util.pool.e.a();

    /* renamed from: c, reason: collision with root package name */
    public w<Z> f339167c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f339168d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f339169e;

    /* compiled from: LockedResource.java */
    public class a implements a.b<v<?>> {
        @Override // com.bumptech.glide.util.pool.a.b
        public final v<?> create() {
            return new v<>();
        }
    }

    @Override // com.bumptech.glide.util.pool.a.d
    @N
    public final com.bumptech.glide.util.pool.e a() {
        return this.f339166b;
    }

    @Override // com.bumptech.glide.load.engine.w
    @N
    public final Class<Z> b() {
        return this.f339167c.b();
    }

    @Override // com.bumptech.glide.load.engine.w
    public final synchronized void c() {
        this.f339166b.b();
        this.f339169e = true;
        if (!this.f339168d) {
            this.f339167c.c();
            this.f339167c = null;
            f339165f.a(this);
        }
    }

    public final synchronized void d() {
        this.f339166b.b();
        if (!this.f339168d) {
            throw new IllegalStateException("Already unlocked");
        }
        this.f339168d = false;
        if (this.f339169e) {
            c();
        }
    }

    @Override // com.bumptech.glide.load.engine.w
    @N
    public final Z get() {
        return this.f339167c.get();
    }

    @Override // com.bumptech.glide.load.engine.w
    public final int getSize() {
        return this.f339167c.getSize();
    }
}
