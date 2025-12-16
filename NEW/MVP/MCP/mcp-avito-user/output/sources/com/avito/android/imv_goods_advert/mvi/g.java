package com.avito.android.imv_goods_advert.mvi;

import aN.InterfaceC19793a;
import com.avito.android.analytics.screens.mvi.o;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.arch.mvi.q;
import com.avito.android.imv_goods_advert.mvi.entity.ImvGoodsAdvertInternalAction;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ImvGoodsAdvertFeatureBuilder.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/arch/mvi/q;", "LaN/a;", "Lcom/avito/android/imv_goods_advert/mvi/entity/ImvGoodsAdvertInternalAction;", "LaN/c;", "LaN/b;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/arch/mvi/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class g extends N implements Y41.l<q<InterfaceC19793a, ImvGoodsAdvertInternalAction, aN.c, aN.b>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ e f170560l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ c f170561m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ScreenPerformanceTracker f170562n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ l f170563o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ j f170564p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(e eVar, c cVar, ScreenPerformanceTracker screenPerformanceTracker, l lVar, j jVar) {
        super(1);
        this.f170560l = eVar;
        this.f170561m = cVar;
        this.f170562n = screenPerformanceTracker;
        this.f170563o = lVar;
        this.f170564p = jVar;
    }

    @Override // Y41.l
    public final G0 invoke(q<InterfaceC19793a, ImvGoodsAdvertInternalAction, aN.c, aN.b> qVar) {
        q<InterfaceC19793a, ImvGoodsAdvertInternalAction, aN.c, aN.b> qVar2 = qVar;
        qVar2.f92008d = this.f170560l;
        qVar2.f92009e = this.f170561m;
        qVar2.f92011g = new o(this.f170562n, this.f170563o);
        qVar2.f92010f = this.f170564p;
        AW.f fVar = AW.f.f434a;
        com.avito.android.arch.mvi.log.g.f91991f.getClass();
        qVar2.c(fVar, com.avito.android.arch.mvi.log.g.f91993h);
        return G0.f406611a;
    }
}
