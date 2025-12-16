package com.google.android.datatransport.runtime;

import android.util.Log;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* compiled from: SafeLoggingExecutor.java */
/* loaded from: classes10.dex */
class p implements Executor {

    /* renamed from: b, reason: collision with root package name */
    public final ExecutorService f343169b;

    /* compiled from: SafeLoggingExecutor.java */
    public static class a implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        public final Runnable f343170b;

        public a(Runnable runnable) {
            this.f343170b = runnable;
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                this.f343170b.run();
            } catch (Exception unused) {
                Log.isLoggable("TRuntime.".concat("Executor"), 6);
            }
        }
    }

    public p(ExecutorService executorService) {
        this.f343169b = executorService;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f343169b.execute(new a(runnable));
    }
}
