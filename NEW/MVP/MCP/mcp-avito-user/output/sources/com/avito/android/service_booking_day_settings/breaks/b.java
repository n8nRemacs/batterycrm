package com.avito.android.service_booking_day_settings.breaks;

import Y61.k;
import Y61.l;
import com.avito.android.util.A4;
import com.squareup.anvil.annotations.ContributesBinding;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: ServiceBookingBreaksFormatterImpl.kt */
@s0
@ContributesBinding
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/service_booking_day_settings/breaks/b;", "Lcom/avito/android/service_booking_day_settings/breaks/a;", "<init>", "()V", "_avito_service-booking-day-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class b implements a {
    @Inject
    public b() {
    }

    @Override // com.avito.android.service_booking_day_settings.breaks.a
    @k
    public final LinkedHashMap a(@k List list, @l Map map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int i12 = 0;
        for (Object obj : list) {
            int i13 = i12 + 1;
            if (i12 < 0) {
                C42745f0.H0();
                throw null;
            }
            e eVar = (e) obj;
            Integer numF = eVar.f();
            if (numF != null) {
                int iIntValue = numF.intValue();
                A4 a42 = A4.f318516a;
                a42.getClass();
                linkedHashMap.putAll(A4.h(Integer.valueOf(iIntValue), "breaks[" + i12 + "][from]"));
            }
            Integer numL = eVar.L();
            if (numL != null) {
                int iIntValue2 = numL.intValue();
                A4 a43 = A4.f318516a;
                a43.getClass();
                linkedHashMap.putAll(A4.h(Integer.valueOf(iIntValue2), "breaks[" + i12 + "][to]"));
            }
            i12 = i13;
        }
        if (map != null) {
            linkedHashMap.putAll(map);
        }
        return linkedHashMap;
    }
}
