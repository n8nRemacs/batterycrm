package androidx.work;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;

/* compiled from: Configuration.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/work/c;", "Ljava/util/concurrent/ThreadFactory;", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: androidx.work.c, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class ThreadFactoryC23539c implements ThreadFactory {

    /* renamed from: b, reason: collision with root package name */
    public final AtomicInteger f55475b = new AtomicInteger(0);

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f55476c;

    public ThreadFactoryC23539c(boolean z12) {
        this.f55476c = z12;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        StringBuilder sbR = androidx.compose.foundation.H.r(this.f55476c ? "WM.task-" : "androidx.work-");
        sbR.append(this.f55475b.incrementAndGet());
        return new Thread(runnable, sbR.toString());
    }
}
