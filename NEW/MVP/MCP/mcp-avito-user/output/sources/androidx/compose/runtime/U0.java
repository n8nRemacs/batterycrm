package androidx.compose.runtime;

import androidx.compose.runtime.snapshots.InterfaceC22156a;
import kotlin.Metadata;

/* compiled from: SnapshotLongState.kt */
@F3
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\bg\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0003À\u0006\u0003"}, d2 = {"Landroidx/compose/runtime/U0;", "Landroidx/compose/runtime/I3;", "", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public interface U0 extends I3<Long> {

    /* compiled from: SnapshotLongState.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
    }

    long g();

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.runtime.I3
    @Y61.k
    @InterfaceC22156a
    default Long getValue() {
        return Long.valueOf(g());
    }
}
