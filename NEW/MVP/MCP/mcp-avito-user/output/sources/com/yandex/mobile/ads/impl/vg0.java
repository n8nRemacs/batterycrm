package com.yandex.mobile.ads.impl;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes8.dex */
public final class vg0 {

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final ExecutorService f390874b = Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)));

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final Executor f390873a = new androidx.media3.exoplayer.audio.o(new Handler(Looper.getMainLooper()), 0);

    @j.N
    public final ExecutorService a() {
        return this.f390874b;
    }

    @j.N
    public final Executor b() {
        return this.f390873a;
    }
}
