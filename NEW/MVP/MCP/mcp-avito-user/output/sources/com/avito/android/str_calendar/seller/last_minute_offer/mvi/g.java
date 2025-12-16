package com.avito.android.str_calendar.seller.last_minute_offer.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.arch.mvi.q;
import com.avito.android.str_calendar.seller.last_minute_offer.mvi.entity.LastMinuteOfferInternalAction;
import com.avito.android.str_calendar.seller.last_minute_offer.mvi.entity.LastMinuteOfferState;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: LastMinuteOfferFeatureBuilder.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/arch/mvi/q;", "LKy0/b;", "Lcom/avito/android/str_calendar/seller/last_minute_offer/mvi/entity/LastMinuteOfferInternalAction;", "Lcom/avito/android/str_calendar/seller/last_minute_offer/mvi/entity/LastMinuteOfferState;", "LKy0/c;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/arch/mvi/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
final class g extends N implements Y41.l<q<Ky0.b, LastMinuteOfferInternalAction, LastMinuteOfferState, Ky0.c>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ e f287963l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ c f287964m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ScreenPerformanceTracker f287965n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ l f287966o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ j f287967p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(e eVar, c cVar, ScreenPerformanceTracker screenPerformanceTracker, l lVar, j jVar) {
        super(1);
        this.f287963l = eVar;
        this.f287964m = cVar;
        this.f287965n = screenPerformanceTracker;
        this.f287966o = lVar;
        this.f287967p = jVar;
    }

    @Override // Y41.l
    public final G0 invoke(q<Ky0.b, LastMinuteOfferInternalAction, LastMinuteOfferState, Ky0.c> qVar) {
        q<Ky0.b, LastMinuteOfferInternalAction, LastMinuteOfferState, Ky0.c> qVar2 = qVar;
        qVar2.f92008d = this.f287963l;
        qVar2.f92009e = this.f287964m;
        qVar2.f92011g = new com.avito.android.analytics.screens.mvi.o(this.f287965n, this.f287966o);
        qVar2.f92010f = this.f287967p;
        AW.f fVar = AW.f.f434a;
        com.avito.android.arch.mvi.log.g.f91991f.getClass();
        qVar2.c(fVar, com.avito.android.arch.mvi.log.g.f91993h);
        return G0.f406611a;
    }
}
