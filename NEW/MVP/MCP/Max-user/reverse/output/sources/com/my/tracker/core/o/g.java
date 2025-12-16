package com.my.tracker.core.o;

import android.os.Handler;
import android.os.Looper;
import com.my.tracker.core.Tracer;
import defpackage.g30;
import defpackage.m1h;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* loaded from: classes.dex */
public abstract class g {
    public static final Handler a = new Handler(Looper.getMainLooper());
    private static final Queue b = new LinkedList();
    static volatile Executor c;

    public static void a(Executor executor) {
        if (c != null) {
            Tracer.e("Async - unexpected init error");
            return;
        }
        if (executor == null) {
            executor = Executors.newSingleThreadExecutor();
        }
        c = executor;
    }

    public static void b(Runnable runnable) {
        if (runnable == null) {
            return;
        }
        try {
            Executor executor = c;
            if (executor == null) {
                Tracer.e("Async - background executor is not found");
            } else {
                a(executor, b, runnable);
            }
        } catch (Throwable th) {
            Tracer.e("Async - unexpected error " + th, th);
        }
    }

    public static void c(Runnable runnable) {
        if (Looper.getMainLooper() != Looper.myLooper()) {
            a.post(new g30(runnable, 7));
            return;
        }
        try {
            runnable.run();
        } catch (Throwable th) {
            Tracer.e("Async: onUi exception has been caught", th);
        }
    }

    public static Executor a() {
        return c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(Runnable runnable) {
        try {
            runnable.run();
        } catch (Throwable th) {
            Tracer.e("Async: onUi exception has been caught", th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(Queue queue) {
        Runnable runnable;
        synchronized (queue) {
            runnable = (Runnable) queue.peek();
        }
        while (runnable != null) {
            try {
                runnable.run();
            } catch (Throwable th) {
                Tracer.e("Async: exception has been caught", th);
            }
            synchronized (queue) {
                queue.poll();
                runnable = (Runnable) queue.peek();
            }
        }
    }

    public static void a(Executor executor, Queue queue, Runnable runnable) {
        synchronized (queue) {
            try {
                if (queue.peek() != null) {
                    queue.add(runnable);
                } else if (queue.add(runnable)) {
                    executor.execute(new m1h(16, queue));
                } else {
                    Tracer.e("Async: unexpected error: unable to queue command");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
