package androidx.core.os;

import android.os.Handler;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* compiled from: ExecutorCompat.java */
/* renamed from: androidx.core.os.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C22782j {

    /* compiled from: ExecutorCompat.java */
    /* renamed from: androidx.core.os.j$a */
    public static class a implements Executor {

        /* renamed from: b, reason: collision with root package name */
        public final Handler f44803b;

        public a(@j.N Handler handler) {
            handler.getClass();
            this.f44803b = handler;
        }

        @Override // java.util.concurrent.Executor
        public final void execute(@j.N Runnable runnable) {
            runnable.getClass();
            Handler handler = this.f44803b;
            if (handler.post(runnable)) {
                return;
            }
            throw new RejectedExecutionException(handler + " is shutting down");
        }
    }

    @j.N
    public static Executor a(@j.N Handler handler) {
        return new a(handler);
    }
}
