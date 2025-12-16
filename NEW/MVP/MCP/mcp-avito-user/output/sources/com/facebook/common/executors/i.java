package com.facebook.common.executors;

import android.os.Handler;
import android.os.Looper;
import com.facebook.infer.annotation.Nullsafe;

/* compiled from: UiThreadImmediateExecutorService.java */
@Nullsafe
/* loaded from: classes5.dex */
public class i extends e {

    /* renamed from: c, reason: collision with root package name */
    @I41.h
    public static i f339817c;

    public i() {
        super(new Handler(Looper.getMainLooper()));
    }

    public static i a() {
        if (f339817c == null) {
            f339817c = new i();
        }
        return f339817c;
    }

    @Override // com.facebook.common.executors.e, java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        if (Thread.currentThread() == this.f339814b.getLooper().getThread()) {
            runnable.run();
        } else {
            super.execute(runnable);
        }
    }
}
