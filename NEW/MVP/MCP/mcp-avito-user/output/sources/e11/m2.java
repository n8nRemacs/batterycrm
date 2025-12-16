package e11;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes7.dex */
public abstract class m2 {

    /* renamed from: a, reason: collision with root package name */
    public static final ExecutorService f394684a = Executors.newSingleThreadExecutor();

    /* renamed from: b, reason: collision with root package name */
    public static final ExecutorService f394685b = Executors.newSingleThreadExecutor();

    /* renamed from: c, reason: collision with root package name */
    public static final a f394686c = new a();

    /* renamed from: d, reason: collision with root package name */
    public static final Handler f394687d = new Handler(Looper.getMainLooper());

    public class a implements Executor {
        @Override // java.util.concurrent.Executor
        public final void execute(@j.N Runnable runnable) {
            m2.f394687d.post(runnable);
        }
    }

    public static void a(@j.N Runnable runnable) {
        f394684a.execute(runnable);
    }

    public static boolean b() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    public static void c(@j.N Runnable runnable) {
        f394685b.execute(runnable);
    }

    public static void d(@j.N Runnable runnable) {
        f394686c.execute(runnable);
    }
}
