package androidx.compose.runtime;

import androidx.compose.runtime.snapshots.InterfaceC22156a;
import kotlin.Metadata;

/* compiled from: SnapshotLongState.kt */
@F3
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\bg\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0003"}, d2 = {"Landroidx/compose/runtime/x1;", "Landroidx/compose/runtime/U0;", "Landroidx/compose/runtime/y1;", "", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.runtime.x1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC22200x1 extends U0, InterfaceC22204y1<Long> {

    /* compiled from: SnapshotLongState.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.runtime.x1$a */
    public static final class a {
    }

    @Override // androidx.compose.runtime.U0
    long g();

    @InterfaceC22156a
    default void k(long j12) {
        n(j12);
    }

    void n(long j12);

    @Override // androidx.compose.runtime.InterfaceC22204y1
    /* bridge */ /* synthetic */ default void setValue(Long l12) {
        k(l12.longValue());
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.runtime.U0, androidx.compose.runtime.I3
    @Y61.k
    @InterfaceC22156a
    /* renamed from: getValue */
    default Long getF42167b() {
        return Long.valueOf(g());
    }
}
