package androidx.compose.foundation.pager;

import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;

/* compiled from: PagerState.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "currentValue", "<anonymous parameter 1>", "Lkotlin/G0;", "invoke", "(FF)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes.dex */
final class q0 extends kotlin.jvm.internal.N implements Y41.p<Float, Float, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ l0.e f30026l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ e0 f30027m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(l0.e eVar, e0 e0Var) {
        super(2);
        this.f30026l = eVar;
        this.f30027m = e0Var;
    }

    @Override // Y41.p
    public final G0 invoke(Float f12, Float f13) {
        float fFloatValue = f12.floatValue();
        f13.floatValue();
        l0.e eVar = this.f30026l;
        eVar.f406839b += this.f30027m.f29921a.a(fFloatValue - eVar.f406839b);
        return G0.f406611a;
    }
}
