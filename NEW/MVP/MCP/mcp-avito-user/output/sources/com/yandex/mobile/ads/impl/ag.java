package com.yandex.mobile.ads.impl;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes8.dex */
public final class ag {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final ExecutorService f383546a = Executors.newSingleThreadExecutor();

    public static final class a implements Runnable {

        /* renamed from: d, reason: collision with root package name */
        @j.N
        private final Bitmap f383549d;

        /* renamed from: e, reason: collision with root package name */
        @j.N
        private final b f383550e;

        /* renamed from: c, reason: collision with root package name */
        @j.N
        private final gg f383548c = new gg();

        /* renamed from: b, reason: collision with root package name */
        @j.N
        private final Handler f383547b = new Handler(Looper.getMainLooper());

        public a(@j.N Bitmap bitmap, @j.N b bVar) {
            this.f383549d = bitmap;
            this.f383550e = bVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            gg ggVar = this.f383548c;
            Bitmap bitmap = this.f383549d;
            ggVar.getClass();
            this.f383547b.post(new zf(this, gg.a(bitmap)));
        }
    }

    public interface b {
        void a(@j.N Bitmap bitmap);
    }

    public final void a(@j.N Bitmap bitmap, @j.N b bVar) {
        this.f383546a.execute(new a(bitmap, bVar));
    }
}
