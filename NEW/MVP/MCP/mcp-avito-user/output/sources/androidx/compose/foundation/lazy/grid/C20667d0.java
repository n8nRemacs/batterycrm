package androidx.compose.foundation.lazy.grid;

import java.util.List;
import kotlin.Metadata;

/* compiled from: LazyGrid.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/lazy/grid/d0;", "Landroidx/compose/foundation/lazy/grid/t0;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.foundation.lazy.grid.d0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C20667d0 extends t0 {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f29116g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ E0 f29117h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20667d0(boolean z12, E0 e02, int i12, int i13, C20665c0 c20665c0, H0 h02) {
        super(z12, e02, i12, i13, c20665c0, h02);
        this.f29116g = z12;
        this.f29117h = e02;
    }

    @Override // androidx.compose.foundation.lazy.grid.t0
    public final s0 b(int i12, C20691p0[] c20691p0Arr, List<C20664c> list, int i13) {
        return new s0(i12, c20691p0Arr, this.f29117h, list, this.f29116g, i13);
    }
}
