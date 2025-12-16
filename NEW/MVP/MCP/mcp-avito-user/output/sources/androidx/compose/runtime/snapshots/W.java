package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.internal.C22083a;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: StateObjectImpl.kt */
@androidx.compose.runtime.internal.P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b \u0018\u00002\u00020\u0001B\t\b\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/runtime/snapshots/W;", "Landroidx/compose/runtime/snapshots/V;", "<init>", "()V", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class W implements V {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final C22083a f38673b = new C22083a(0);

    public final boolean p(int i12) {
        int i13 = this.f38673b.get();
        int i14 = C22164i.f38715b;
        return (i12 & i13) != 0;
    }

    public final void q(int i12) {
        C22083a c22083a;
        int i13;
        do {
            c22083a = this.f38673b;
            i13 = c22083a.get();
            int i14 = C22164i.f38715b;
            if ((i13 & i12) != 0) {
                return;
            }
        } while (!c22083a.compareAndSet(i13, i13 | i12));
    }
}
