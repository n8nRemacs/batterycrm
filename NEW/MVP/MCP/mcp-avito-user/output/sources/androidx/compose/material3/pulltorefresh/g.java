package androidx.compose.material3.pulltorefresh;

import androidx.compose.ui.semantics.C;
import androidx.compose.ui.semantics.F;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: PullToRefresh.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/semantics/F;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/ui/semantics/F;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class g extends N implements Y41.l<F, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Y41.a<Float> f37092l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(Y41.a<Float> aVar) {
        super(1);
        this.f37092l = aVar;
    }

    @Override // Y41.l
    public final G0 invoke(F f12) {
        C.r(f12, new androidx.compose.ui.semantics.h(this.f37092l.invoke().floatValue(), kotlin.ranges.s.m(0.0f, 1.0f), 0));
        return G0.f406611a;
    }
}
