package androidx.compose.runtime;

import androidx.compose.runtime.snapshots.InterfaceC22156a;
import kotlin.Metadata;

/* compiled from: SnapshotDoubleState.kt */
@F3
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0000\bg\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0003"}, d2 = {"Landroidx/compose/runtime/u1;", "Landroidx/compose/runtime/p0;", "Landroidx/compose/runtime/y1;", "", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.runtime.u1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC22188u1 extends InterfaceC22138p0, InterfaceC22204y1<Double> {

    /* compiled from: SnapshotDoubleState.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.runtime.u1$a */
    public static final class a {
    }

    @Override // androidx.compose.runtime.InterfaceC22138p0
    double i();

    @InterfaceC22156a
    default void l(double d12) {
        v(d12);
    }

    @Override // androidx.compose.runtime.InterfaceC22204y1
    /* bridge */ /* synthetic */ default void setValue(Double d12) {
        l(d12.doubleValue());
    }

    void v(double d12);

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.runtime.InterfaceC22138p0, androidx.compose.runtime.I3
    @Y61.k
    @InterfaceC22156a
    /* renamed from: getValue */
    default Double getF42167b() {
        return Double.valueOf(i());
    }
}
