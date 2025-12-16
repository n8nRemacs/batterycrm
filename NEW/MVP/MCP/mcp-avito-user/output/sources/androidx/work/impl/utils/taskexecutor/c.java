package androidx.work.impl.utils.taskexecutor;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.RestrictTo;
import androidx.work.impl.utils.z;
import j.N;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import kotlinx.coroutines.A0;
import kotlinx.coroutines.M;

/* compiled from: WorkManagerTaskExecutor.java */
@RestrictTo
/* loaded from: classes10.dex */
public class c implements b {

    /* renamed from: a, reason: collision with root package name */
    public final z f56028a;

    /* renamed from: b, reason: collision with root package name */
    public final M f56029b;

    /* renamed from: c, reason: collision with root package name */
    public final Handler f56030c = new Handler(Looper.getMainLooper());

    /* renamed from: d, reason: collision with root package name */
    public final Executor f56031d = new a();

    /* compiled from: WorkManagerTaskExecutor.java */
    public class a implements Executor {
        public a() {
        }

        @Override // java.util.concurrent.Executor
        public final void execute(@N Runnable runnable) {
            c.this.f56030c.post(runnable);
        }
    }

    public c(@N ExecutorService executorService) {
        z zVar = new z(executorService);
        this.f56028a = zVar;
        this.f56029b = A0.b(zVar);
    }

    @Override // androidx.work.impl.utils.taskexecutor.b
    @N
    public final M a() {
        return this.f56029b;
    }

    @Override // androidx.work.impl.utils.taskexecutor.b
    @N
    public final Executor c() {
        return this.f56031d;
    }

    @Override // androidx.work.impl.utils.taskexecutor.b
    @N
    public final z d() {
        return this.f56028a;
    }
}
