package com.bumptech.glide.util.pool;

import j.N;

/* compiled from: StateVerifier.java */
/* loaded from: classes5.dex */
public abstract class e {

    /* compiled from: StateVerifier.java */
    public static class b extends e {
        public b() {
            super();
        }

        @Override // com.bumptech.glide.util.pool.e
        public final void b() {
            throw null;
        }
    }

    /* compiled from: StateVerifier.java */
    public static class c extends e {

        /* renamed from: a, reason: collision with root package name */
        public volatile boolean f339656a;

        public c() {
            super();
        }

        @Override // com.bumptech.glide.util.pool.e
        public final void b() {
            if (this.f339656a) {
                throw new IllegalStateException("Already released");
            }
        }
    }

    @N
    public static e a() {
        return new c();
    }

    public abstract void b();

    public e() {
    }
}
