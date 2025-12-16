package com.avito.android.str_calendar.seller.calendar.mvi;

import Jy0.InterfaceC14261a;
import Jy0.InterfaceC14263c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.arch.mvi.q;
import com.avito.android.str_calendar.seller.calendar.mvi.entity.StrSellerCalendarInternalAction;
import com.avito.android.str_calendar.seller.calendar.mvi.entity.StrSellerCalendarState;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: StrSellerCalendarFeatureBuilder.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/arch/mvi/q;", "LJy0/a;", "Lcom/avito/android/str_calendar/seller/calendar/mvi/entity/StrSellerCalendarInternalAction;", "Lcom/avito/android/str_calendar/seller/calendar/mvi/entity/StrSellerCalendarState;", "LJy0/c;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/arch/mvi/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
final class h extends N implements Y41.l<q<InterfaceC14261a, StrSellerCalendarInternalAction, StrSellerCalendarState, InterfaceC14263c>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ f f287757l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ d f287758m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ScreenPerformanceTracker f287759n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ m f287760o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ k f287761p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(f fVar, d dVar, ScreenPerformanceTracker screenPerformanceTracker, m mVar, k kVar) {
        super(1);
        this.f287757l = fVar;
        this.f287758m = dVar;
        this.f287759n = screenPerformanceTracker;
        this.f287760o = mVar;
        this.f287761p = kVar;
    }

    @Override // Y41.l
    public final G0 invoke(q<InterfaceC14261a, StrSellerCalendarInternalAction, StrSellerCalendarState, InterfaceC14263c> qVar) {
        q<InterfaceC14261a, StrSellerCalendarInternalAction, StrSellerCalendarState, InterfaceC14263c> qVar2 = qVar;
        qVar2.f92008d = this.f287757l;
        qVar2.f92009e = this.f287758m;
        qVar2.f92011g = new com.avito.android.analytics.screens.mvi.o(this.f287759n, this.f287760o);
        qVar2.f92010f = this.f287761p;
        AW.f fVar = AW.f.f434a;
        com.avito.android.arch.mvi.log.g.f91991f.getClass();
        qVar2.c(fVar, com.avito.android.arch.mvi.log.g.f91993h);
        return G0.f406611a;
    }
}
