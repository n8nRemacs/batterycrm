package com.avito.android.short_term_rent.soft_booking.domain;

import Hl0.InterfaceC14002a;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.util.R0;
import com.google.gson.Gson;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlinx.coroutines.flow.C43137a0;
import kotlinx.coroutines.flow.C43152f0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.X;

/* compiled from: StrSoftBookingApplyInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/short_term_rent/soft_booking/domain/i;", "Lcom/avito/android/short_term_rent/soft_booking/domain/d;", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class i implements d {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC14002a f282615a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final R0 f282616b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.remote.error.f f282617c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final ScreenPerformanceTracker f282618d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final Gson f282619e;

    @Inject
    public i(@Y61.k InterfaceC14002a interfaceC14002a, @Y61.k R0 r02, @Y61.k com.avito.android.remote.error.f fVar, @Y61.k ScreenPerformanceTracker screenPerformanceTracker, @Y61.k Gson gson) {
        this.f282615a = interfaceC14002a;
        this.f282616b = r02;
        this.f282617c = fVar;
        this.f282618d = screenPerformanceTracker;
        this.f282619e = gson;
    }

    @Override // com.avito.android.short_term_rent.soft_booking.domain.d
    @Y61.k
    public final X a(@Y61.k com.avito.android.short_term_rent.soft_booking.mvi.state.a aVar, @Y61.k Y41.p pVar) {
        return new X(new C43137a0(new g(2, null), new C43152f0(com.avito.android.analytics.screens.utils.m.a(C43175k.I(this.f282616b.a(), C43175k.G(new e(aVar, this, pVar, null))), this.f282618d, "performance_track_apply_booking"), new f(this, null))), new h(3, null));
    }
}
