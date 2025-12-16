package bolts;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* compiled from: AndroidExecutors.java */
/* loaded from: classes10.dex */
final class a {

    /* renamed from: b, reason: collision with root package name */
    public static final a f57451b = new a();

    /* renamed from: c, reason: collision with root package name */
    public static final int f57452c;

    /* renamed from: d, reason: collision with root package name */
    public static final int f57453d;

    /* renamed from: a, reason: collision with root package name */
    public final Executor f57454a = new b();

    /* compiled from: AndroidExecutors.java */
    public static class b implements Executor {
        public b() {
        }

        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            new Handler(Looper.getMainLooper()).post(runnable);
        }
    }

    static {
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        f57452c = iAvailableProcessors + 1;
        f57453d = (iAvailableProcessors * 2) + 1;
    }
}
