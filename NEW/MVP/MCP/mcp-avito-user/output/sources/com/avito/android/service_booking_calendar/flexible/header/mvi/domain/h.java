package com.avito.android.service_booking_calendar.flexible.header.mvi.domain;

import Y61.k;
import Zs0.b;
import it0.C42108c;
import it0.InterfaceC42109d;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: HeaderTooltipConverter.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_booking_calendar/flexible/header/mvi/domain/h;", "Lcom/avito/android/service_booking_calendar/flexible/header/mvi/domain/g;", "_avito_service-booking-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class h implements g {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC42109d f275974a;

    @Inject
    public h(@k InterfaceC42109d interfaceC42109d) {
        this.f275974a = interfaceC42109d;
    }

    @Override // com.avito.android.service_booking_calendar.flexible.header.mvi.domain.g
    @k
    public final ArrayList a(@k List list) {
        ArrayList arrayList = new ArrayList();
        int i12 = 0;
        for (Object obj : list) {
            int i13 = i12 + 1;
            if (i12 < 0) {
                C42745f0.H0();
                throw null;
            }
            b.C1466b c1466b = (b.C1466b) obj;
            C42108c c42108c = new C42108c(c1466b.getButtonTitle(), i12, c1466b.getTitle(), c1466b.getText(), c1466b.getIconType());
            C42108c c42108c2 = this.f275974a.a(c42108c) ? null : c42108c;
            if (c42108c2 != null) {
                arrayList.add(c42108c2);
            }
            i12 = i13;
        }
        return arrayList;
    }
}
