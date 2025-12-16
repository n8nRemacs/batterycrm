package androidx.compose.foundation.lazy.staggeredgrid;

import kotlin.Metadata;

/* compiled from: LazyStaggeredGridMeasureResult.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/foundation/lazy/staggeredgrid/L;", "it", "", "invoke", "(Landroidx/compose/foundation/lazy/staggeredgrid/L;)Ljava/lang/Integer;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes.dex */
final class k0 extends kotlin.jvm.internal.N implements Y41.l<L, Integer> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f29644l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(int i12) {
        super(1);
        this.f29644l = i12;
    }

    @Override // Y41.l
    public final Integer invoke(L l12) {
        return Integer.valueOf(l12.getIndex() - this.f29644l);
    }
}
