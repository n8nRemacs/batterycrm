package androidx.core.util;

import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.Z;

/* compiled from: AndroidXConsumer.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Landroidx/core/util/b;", "T", "Landroidx/core/util/e;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "core-ktx_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: androidx.core.util.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C22788b<T> extends AtomicBoolean implements InterfaceC22791e<T> {
    @Override // androidx.core.util.InterfaceC22791e
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
