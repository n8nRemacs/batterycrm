package com.avito.android.service_booking_calendar.flexible.data.mvi;

import com.avito.android.service_booking_calendar.flexible.data.mvi.entity.a;
import gt0.InterfaceC40733a;
import java.util.List;
import javax.inject.Inject;
import jt0.InterfaceC42425a;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;

/* compiled from: DataStateToActionsAdapter.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/service_booking_calendar/flexible/data/mvi/n;", "Lcom/avito/android/service_booking_calendar/flexible/data/mvi/m;", "<init>", "()V", "_avito_service-booking-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class n implements m {
    @Inject
    public n() {
    }

    @Override // com.avito.android.service_booking_calendar.flexible.data.mvi.m
    @Y61.k
    public final List<com.avito.android.service_booking_calendar.flexible.d> a(@Y61.k com.avito.android.service_booking_calendar.flexible.data.mvi.entity.a aVar) {
        if (aVar.f275724b) {
            return C42745f0.U(InterfaceC42425a.b.f405869a, InterfaceC40733a.C11232a.f396897a, InterfaceC40733a.i.f396904a);
        }
        a.c cVar = aVar.f275725c;
        if (cVar != null) {
            return C42745f0.U(new InterfaceC40733a.h(cVar.f275731a), new InterfaceC42425a.C11587a(cVar.f275732b));
        }
        a.C8178a c8178a = aVar.f275723a;
        return c8178a != null ? C42745f0.U(new InterfaceC42425a.p(c8178a.f275727a, c8178a.f275728b, c8178a.f275730d), new InterfaceC40733a.g(c8178a.f275729c)) : C42784z0.f406748b;
    }
}
