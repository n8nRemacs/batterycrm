package com.huawei.hmf.tasks.a;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* loaded from: classes7.dex */
public final class a {

    /* renamed from: b, reason: collision with root package name */
    public static final a f363184b = new a();

    /* renamed from: c, reason: collision with root package name */
    public static final int f363185c;

    /* renamed from: d, reason: collision with root package name */
    public static final int f363186d;

    /* renamed from: a, reason: collision with root package name */
    public final Executor f363187a = new ExecutorC10749a(0);

    /* renamed from: com.huawei.hmf.tasks.a.a$a, reason: collision with other inner class name */
    public static class ExecutorC10749a implements Executor {
        public ExecutorC10749a() {
        }

        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            new Handler(Looper.getMainLooper()).post(runnable);
        }

        public /* synthetic */ ExecutorC10749a(byte b12) {
            this();
        }
    }

    static {
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        f363185c = iAvailableProcessors + 1;
        f363186d = (iAvailableProcessors * 2) + 1;
    }
}
