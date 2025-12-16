package com.bumptech.glide.util;

import android.os.Handler;
import android.os.Looper;
import j.N;
import java.util.concurrent.Executor;

/* compiled from: Executors.java */
/* loaded from: classes5.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public static final Executor f339638a = new a();

    /* renamed from: b, reason: collision with root package name */
    public static final Executor f339639b = new b();

    /* compiled from: Executors.java */
    public class a implements Executor {

        /* renamed from: b, reason: collision with root package name */
        public final Handler f339640b = new Handler(Looper.getMainLooper());

        @Override // java.util.concurrent.Executor
        public final void execute(@N Runnable runnable) {
            this.f339640b.post(runnable);
        }
    }

    /* compiled from: Executors.java */
    public class b implements Executor {
        @Override // java.util.concurrent.Executor
        public final void execute(@N Runnable runnable) {
            runnable.run();
        }
    }
}
