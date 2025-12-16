package com.bumptech.glide.load.engine.prefill;

import com.bumptech.glide.load.h;
import j.N;
import j.k0;
import java.security.MessageDigest;
import java.util.concurrent.TimeUnit;

/* compiled from: BitmapPreFillRunner.java */
/* loaded from: classes5.dex */
final class a implements Runnable {

    /* compiled from: BitmapPreFillRunner.java */
    @k0
    /* renamed from: com.bumptech.glide.load.engine.prefill.a$a, reason: collision with other inner class name */
    public static class C10508a {
    }

    /* compiled from: BitmapPreFillRunner.java */
    public static final class b implements h {
        @Override // com.bumptech.glide.load.h
        public final void b(@N MessageDigest messageDigest) {
            throw new UnsupportedOperationException();
        }
    }

    static {
        new C10508a();
        TimeUnit.SECONDS.toMillis(1L);
    }

    @Override // java.lang.Runnable
    public final void run() {
        throw null;
    }
}
