package kotlinx.coroutines.tasks;

import Y61.k;
import java.util.concurrent.Executor;
import kotlin.Metadata;

/* compiled from: Tasks.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lkotlinx/coroutines/tasks/a;", "Ljava/util/concurrent/Executor;", "<init>", "()V", "kotlinx-coroutines-play-services"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
final class a implements Executor {
    static {
        new a();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(@k Runnable runnable) {
        runnable.run();
    }
}
