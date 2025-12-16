package com.avito.android.short_term_rent.bookingform.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.short_term_rent.bookingform.mvi.entity.BookingFormInternalAction;
import cw0.C39425b;
import cw0.InterfaceC39424a;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: BookingFormFeatureBuilder.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/arch/mvi/q;", "Lcom/avito/android/short_term_rent/bookingform/mvi/entity/a;", "Lcom/avito/android/short_term_rent/bookingform/mvi/entity/BookingFormInternalAction;", "Lcw0/b;", "Lcw0/a;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/arch/mvi/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class x extends N implements Y41.l<com.avito.android.arch.mvi.q<com.avito.android.short_term_rent.bookingform.mvi.entity.a, BookingFormInternalAction, C39425b, InterfaceC39424a>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ t f282018l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C34968a f282019m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ScreenPerformanceTracker f282020n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ C f282021o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ A f282022p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(t tVar, C34968a c34968a, ScreenPerformanceTracker screenPerformanceTracker, C c12, A a12) {
        super(1);
        this.f282018l = tVar;
        this.f282019m = c34968a;
        this.f282020n = screenPerformanceTracker;
        this.f282021o = c12;
        this.f282022p = a12;
    }

    @Override // Y41.l
    public final G0 invoke(com.avito.android.arch.mvi.q<com.avito.android.short_term_rent.bookingform.mvi.entity.a, BookingFormInternalAction, C39425b, InterfaceC39424a> qVar) {
        com.avito.android.arch.mvi.q<com.avito.android.short_term_rent.bookingform.mvi.entity.a, BookingFormInternalAction, C39425b, InterfaceC39424a> qVar2 = qVar;
        qVar2.f92008d = this.f282018l;
        qVar2.f92009e = this.f282019m;
        qVar2.f92011g = new com.avito.android.analytics.screens.mvi.o(this.f282020n, this.f282021o);
        qVar2.f92010f = this.f282022p;
        AW.f fVar = AW.f.f434a;
        com.avito.android.arch.mvi.log.g.f91991f.getClass();
        qVar2.c(fVar, com.avito.android.arch.mvi.log.g.f91993h);
        return G0.f406611a;
    }
}
