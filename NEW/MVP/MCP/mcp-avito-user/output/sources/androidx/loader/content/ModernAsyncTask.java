package androidx.loader.content;

import android.os.Binder;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
abstract class ModernAsyncTask<Result> {

    /* renamed from: f, reason: collision with root package name */
    public static Handler f46942f;

    /* renamed from: c, reason: collision with root package name */
    public volatile Status f46944c = Status.f46947b;

    /* renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f46945d = new AtomicBoolean();

    /* renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f46946e = new AtomicBoolean();

    /* renamed from: b, reason: collision with root package name */
    public final FutureTask<Result> f46943b = new b(new a());

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Status {

        /* renamed from: b, reason: collision with root package name */
        public static final Status f46947b;

        /* renamed from: c, reason: collision with root package name */
        public static final Status f46948c;

        /* renamed from: d, reason: collision with root package name */
        public static final Status f46949d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ Status[] f46950e;

        static {
            Status status = new Status("PENDING", 0);
            f46947b = status;
            Status status2 = new Status("RUNNING", 1);
            f46948c = status2;
            Status status3 = new Status("FINISHED", 2);
            f46949d = status3;
            f46950e = new Status[]{status, status2, status3};
        }

        public Status() {
            throw null;
        }

        public static Status valueOf(String str) {
            return (Status) Enum.valueOf(Status.class, str);
        }

        public static Status[] values() {
            return (Status[]) f46950e.clone();
        }
    }

    public class a implements Callable<Result> {
        public a() {
        }

        @Override // java.util.concurrent.Callable
        public final Result call() {
            ModernAsyncTask modernAsyncTask = ModernAsyncTask.this;
            modernAsyncTask.f46946e.set(true);
            Result result = null;
            try {
                Process.setThreadPriority(10);
                result = (Result) modernAsyncTask.a();
                Binder.flushPendingCommands();
                return result;
            } finally {
            }
        }
    }

    public class b extends FutureTask<Result> {
        public b(Callable callable) {
            super(callable);
        }

        @Override // java.util.concurrent.FutureTask
        public final void done() {
            ModernAsyncTask modernAsyncTask = ModernAsyncTask.this;
            AtomicBoolean atomicBoolean = modernAsyncTask.f46946e;
            try {
                Result result = get();
                if (atomicBoolean.get()) {
                    return;
                }
                modernAsyncTask.d(result);
            } catch (InterruptedException unused) {
            } catch (CancellationException unused2) {
                if (atomicBoolean.get()) {
                    return;
                }
                modernAsyncTask.d(null);
            } catch (ExecutionException e12) {
                throw new RuntimeException("An error occurred while executing doInBackground()", e12.getCause());
            } catch (Throwable th2) {
                throw new RuntimeException("An error occurred while executing doInBackground()", th2);
            }
        }
    }

    public class c implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Object f46953b;

        public c(Object obj) {
            this.f46953b = obj;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public final void run() {
            ModernAsyncTask modernAsyncTask = ModernAsyncTask.this;
            Object obj = this.f46953b;
            if (modernAsyncTask.f46945d.get()) {
                modernAsyncTask.b(obj);
            } else {
                modernAsyncTask.c(obj);
            }
            modernAsyncTask.f46944c = Status.f46949d;
        }
    }

    public static /* synthetic */ class d {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f46955a;

        static {
            int[] iArr = new int[Status.values().length];
            f46955a = iArr;
            try {
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f46955a[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public abstract Result a();

    public final void d(Result result) {
        Handler handler;
        synchronized (ModernAsyncTask.class) {
            try {
                if (f46942f == null) {
                    f46942f = new Handler(Looper.getMainLooper());
                }
                handler = f46942f;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        handler.post(new c(result));
    }

    public void b(Result result) {
    }

    public void c(Result result) {
    }
}
