package androidx.compose.runtime;

import androidx.compose.runtime.snapshots.InterfaceC22156a;
import kotlin.Metadata;

/* compiled from: SnapshotIntState.kt */
@F3
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\bg\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0003"}, d2 = {"Landroidx/compose/runtime/w1;", "Landroidx/compose/runtime/J0;", "Landroidx/compose/runtime/y1;", "", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.runtime.w1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC22196w1 extends J0, InterfaceC22204y1<Integer> {

    /* compiled from: SnapshotIntState.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.runtime.w1$a */
    public static final class a {
    }

    @InterfaceC22156a
    default void K3(int i12) {
        L3(i12);
    }

    void L3(int i12);

    @Override // androidx.compose.runtime.J0
    int e();

    @Override // androidx.compose.runtime.InterfaceC22204y1
    /* bridge */ /* synthetic */ default void setValue(Integer num) {
        K3(num.intValue());
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.runtime.J0, androidx.compose.runtime.I3
    @Y61.k
    @InterfaceC22156a
    default Integer getValue() {
        return Integer.valueOf(e());
    }
}
