package com.avito.android.seller_promotions.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.seller_promotions.mvi.entity.SellerPromotionsInternalAction;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: SellerPromotionsFeatureBuilder.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/arch/mvi/q;", "LOq0/d;", "Lcom/avito/android/seller_promotions/mvi/entity/SellerPromotionsInternalAction;", "LOq0/g;", "LOq0/f;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/arch/mvi/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class y extends N implements Y41.l<com.avito.android.arch.mvi.q<Oq0.d, SellerPromotionsInternalAction, Oq0.g, Oq0.f>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ w f268068l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C34670a f268069m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ScreenPerformanceTracker f268070n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ H f268071o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ F f268072p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(w wVar, C34670a c34670a, ScreenPerformanceTracker screenPerformanceTracker, H h12, F f12) {
        super(1);
        this.f268068l = wVar;
        this.f268069m = c34670a;
        this.f268070n = screenPerformanceTracker;
        this.f268071o = h12;
        this.f268072p = f12;
    }

    @Override // Y41.l
    public final G0 invoke(com.avito.android.arch.mvi.q<Oq0.d, SellerPromotionsInternalAction, Oq0.g, Oq0.f> qVar) {
        com.avito.android.arch.mvi.q<Oq0.d, SellerPromotionsInternalAction, Oq0.g, Oq0.f> qVar2 = qVar;
        qVar2.f92008d = this.f268068l;
        qVar2.f92009e = this.f268069m;
        qVar2.f92011g = new com.avito.android.analytics.screens.mvi.o(this.f268070n, this.f268071o);
        qVar2.f92010f = this.f268072p;
        AW.f fVar = AW.f.f434a;
        com.avito.android.arch.mvi.log.g.f91991f.getClass();
        qVar2.c(fVar, com.avito.android.arch.mvi.log.g.f91992g);
        return G0.f406611a;
    }
}
