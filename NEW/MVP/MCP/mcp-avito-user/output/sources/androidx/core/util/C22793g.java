package androidx.core.util;

import j.X;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Consumer;
import kotlin.Metadata;
import kotlin.Z;

/* compiled from: PlatformConsumer.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Landroidx/core/util/g;", "T", "Ljava/util/function/Consumer;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "core-ktx_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@X
/* renamed from: androidx.core.util.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C22793g<T> extends AtomicBoolean implements Consumer<T> {
    @Override // java.util.function.Consumer
    public final void accept(T t12) {
        if (compareAndSet(false, true)) {
            int i12 = Z.f406624c;
            throw null;
        }
    }

    @Override // java.util.concurrent.atomic.AtomicBoolean
    @Y61.k
    public final String toString() {
        return "ContinuationConsumer(resultAccepted = " + get() + ')';
    }
}
