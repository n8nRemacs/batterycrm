package androidx.core.util;

import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.Z;

/* compiled from: Runnable.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Landroidx/core/util/h;", "Ljava/lang/Runnable;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "core-ktx_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: androidx.core.util.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class RunnableC22794h extends AtomicBoolean implements Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        if (compareAndSet(false, true)) {
            int i12 = Z.f406624c;
            G0 g02 = G0.f406611a;
            throw null;
        }
    }

    @Override // java.util.concurrent.atomic.AtomicBoolean
    @Y61.k
    public final String toString() {
        return "ContinuationRunnable(ran = " + get() + ')';
    }
}
