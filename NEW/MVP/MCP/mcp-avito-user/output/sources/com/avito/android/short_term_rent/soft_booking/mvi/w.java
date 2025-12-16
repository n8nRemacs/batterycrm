package com.avito.android.short_term_rent.soft_booking.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.short_term_rent.soft_booking.mvi.entity.StrSoftBookingInternalAction;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import ow0.InterfaceC44950a;
import ow0.InterfaceC44952b;

/* compiled from: StrSoftBookingFeatureBuilder.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/arch/mvi/q;", "Low0/a;", "Lcom/avito/android/short_term_rent/soft_booking/mvi/entity/StrSoftBookingInternalAction;", "Lcom/avito/android/short_term_rent/soft_booking/mvi/state/a;", "Low0/b;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/arch/mvi/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class w extends N implements Y41.l<com.avito.android.arch.mvi.q<InterfaceC44950a, StrSoftBookingInternalAction, com.avito.android.short_term_rent.soft_booking.mvi.state.a, InterfaceC44952b>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ u f282865l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C34981a f282866m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ScreenPerformanceTracker f282867n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ B f282868o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ z f282869p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(u uVar, C34981a c34981a, ScreenPerformanceTracker screenPerformanceTracker, B b12, z zVar) {
        super(1);
        this.f282865l = uVar;
        this.f282866m = c34981a;
        this.f282867n = screenPerformanceTracker;
        this.f282868o = b12;
        this.f282869p = zVar;
    }

    @Override // Y41.l
    public final G0 invoke(com.avito.android.arch.mvi.q<InterfaceC44950a, StrSoftBookingInternalAction, com.avito.android.short_term_rent.soft_booking.mvi.state.a, InterfaceC44952b> qVar) {
        com.avito.android.arch.mvi.q<InterfaceC44950a, StrSoftBookingInternalAction, com.avito.android.short_term_rent.soft_booking.mvi.state.a, InterfaceC44952b> qVar2 = qVar;
        qVar2.f92008d = this.f282865l;
        qVar2.f92009e = this.f282866m;
        qVar2.f92011g = new com.avito.android.analytics.screens.mvi.o(this.f282867n, this.f282868o);
        qVar2.f92010f = this.f282869p;
        AW.f fVar = AW.f.f434a;
        com.avito.android.arch.mvi.log.g.f91991f.getClass();
        qVar2.c(fVar, com.avito.android.arch.mvi.log.g.f91993h);
        return G0.f406611a;
    }
}
