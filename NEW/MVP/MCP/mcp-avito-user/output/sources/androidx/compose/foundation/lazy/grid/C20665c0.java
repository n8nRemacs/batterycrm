package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.List;
import kotlin.Metadata;

/* compiled from: LazyGrid.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/lazy/grid/c0;", "Landroidx/compose/foundation/lazy/grid/r0;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.foundation.lazy.grid.c0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C20665c0 extends r0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.foundation.lazy.layout.Q f29105d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ I0 f29106e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f29107f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f29108g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f29109h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f29110i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ long f29111j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20665c0(P p12, androidx.compose.foundation.lazy.layout.Q q12, int i12, I0 i02, boolean z12, boolean z13, int i13, int i14, long j12) {
        super(p12, q12, i12);
        this.f29105d = q12;
        this.f29106e = i02;
        this.f29107f = z12;
        this.f29108g = z13;
        this.f29109h = i13;
        this.f29110i = i14;
        this.f29111j = j12;
    }

    @Override // androidx.compose.foundation.lazy.grid.r0
    public final C20691p0 b(int i12, Object obj, Object obj2, int i13, int i14, List<? extends androidx.compose.ui.layout.K0> list, long j12, int i15, int i16) {
        LayoutDirection f40388b = this.f29105d.getF40524b();
        LazyLayoutItemAnimator<C20691p0> lazyLayoutItemAnimator = this.f29106e.f29031m;
        return new C20691p0(i12, obj, this.f29107f, i13, i14, this.f29108g, f40388b, this.f29109h, this.f29110i, list, this.f29111j, obj2, lazyLayoutItemAnimator, j12, i15, i16, null);
    }
}
