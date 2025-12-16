package com.avito.android.publish.price_list.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.publish.price_list.mvi.entity.SelectPriceListInternalAction;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: SelectPriceListFeatureBuilder.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/arch/mvi/q;", "Lcom/avito/android/publish/price_list/mvi/entity/a;", "Lcom/avito/android/publish/price_list/mvi/entity/SelectPriceListInternalAction;", "Lcom/avito/android/publish/price_list/mvi/entity/f;", "Lcom/avito/android/publish/price_list/mvi/entity/e;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/arch/mvi/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class l extends N implements Y41.l<com.avito.android.arch.mvi.q<com.avito.android.publish.price_list.mvi.entity.a, SelectPriceListInternalAction, com.avito.android.publish.price_list.mvi.entity.f, com.avito.android.publish.price_list.mvi.entity.e>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ j f238905l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ h f238906m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ScreenPerformanceTracker f238907n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ q f238908o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ o f238909p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(j jVar, h hVar, ScreenPerformanceTracker screenPerformanceTracker, q qVar, o oVar) {
        super(1);
        this.f238905l = jVar;
        this.f238906m = hVar;
        this.f238907n = screenPerformanceTracker;
        this.f238908o = qVar;
        this.f238909p = oVar;
    }

    @Override // Y41.l
    public final G0 invoke(com.avito.android.arch.mvi.q<com.avito.android.publish.price_list.mvi.entity.a, SelectPriceListInternalAction, com.avito.android.publish.price_list.mvi.entity.f, com.avito.android.publish.price_list.mvi.entity.e> qVar) {
        com.avito.android.arch.mvi.q<com.avito.android.publish.price_list.mvi.entity.a, SelectPriceListInternalAction, com.avito.android.publish.price_list.mvi.entity.f, com.avito.android.publish.price_list.mvi.entity.e> qVar2 = qVar;
        qVar2.f92008d = this.f238905l;
        qVar2.f92009e = this.f238906m;
        qVar2.f92011g = new com.avito.android.analytics.screens.mvi.o(this.f238907n, this.f238908o);
        qVar2.f92010f = this.f238909p;
        AW.f fVar = AW.f.f434a;
        com.avito.android.arch.mvi.log.g.f91991f.getClass();
        qVar2.c(fVar, com.avito.android.arch.mvi.log.g.f91993h);
        return G0.f406611a;
    }
}
