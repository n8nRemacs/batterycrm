package androidx.work.impl.utils;

import androidx.annotation.RestrictTo;
import java.util.concurrent.Executor;

/* compiled from: SynchronousExecutor.java */
@RestrictTo
/* loaded from: classes10.dex */
public class I implements Executor {
    @Override // java.util.concurrent.Executor
    public final void execute(@j.N Runnable runnable) {
        runnable.run();
    }
}
