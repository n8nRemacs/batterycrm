package androidx.work.impl.utils.taskexecutor;

import androidx.annotation.RestrictTo;
import androidx.work.impl.utils.z;
import j.N;
import java.util.concurrent.Executor;
import kotlinx.coroutines.A0;
import kotlinx.coroutines.M;

/* compiled from: TaskExecutor.java */
@RestrictTo
/* loaded from: classes10.dex */
public interface b {
    @N
    default M a() {
        return A0.b(d());
    }

    default void b(@N Runnable runnable) {
        d().execute(runnable);
    }

    @N
    Executor c();

    @N
    z d();
}
