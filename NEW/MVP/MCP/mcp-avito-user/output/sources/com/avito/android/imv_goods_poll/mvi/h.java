package com.avito.android.imv_goods_poll.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.arch.mvi.q;
import com.avito.android.imv_goods_poll.mvi.entity.ImvGoodsPollInternalAction;
import fN.InterfaceC40319a;
import fN.InterfaceC40320b;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ImvGoodsPollFeatureBuilder.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/arch/mvi/q;", "LfN/a;", "Lcom/avito/android/imv_goods_poll/mvi/entity/ImvGoodsPollInternalAction;", "LfN/c;", "LfN/b;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/arch/mvi/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class h extends N implements Y41.l<q<InterfaceC40319a, ImvGoodsPollInternalAction, fN.c, InterfaceC40320b>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ f f170701l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ b f170702m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ k f170703n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ ScreenPerformanceTracker f170704o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ m f170705p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(f fVar, b bVar, k kVar, ScreenPerformanceTracker screenPerformanceTracker, m mVar) {
        super(1);
        this.f170701l = fVar;
        this.f170702m = bVar;
        this.f170703n = kVar;
        this.f170704o = screenPerformanceTracker;
        this.f170705p = mVar;
    }

    @Override // Y41.l
    public final G0 invoke(q<InterfaceC40319a, ImvGoodsPollInternalAction, fN.c, InterfaceC40320b> qVar) {
        q<InterfaceC40319a, ImvGoodsPollInternalAction, fN.c, InterfaceC40320b> qVar2 = qVar;
        qVar2.f92008d = this.f170701l;
        qVar2.f92009e = this.f170702m;
        qVar2.f92010f = this.f170703n;
        qVar2.f92011g = new com.avito.android.analytics.screens.mvi.o(this.f170704o, this.f170705p);
        AW.f fVar = AW.f.f434a;
        com.avito.android.arch.mvi.log.g.f91991f.getClass();
        qVar2.c(fVar, com.avito.android.arch.mvi.log.g.f91993h);
        return G0.f406611a;
    }
}
