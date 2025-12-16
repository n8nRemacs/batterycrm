package com.avito.android.service_booking_settings.domain.converters;

import com.avito.android.service_booking.api.models.work_hours.ServiceBookingWorkHours;
import com.avito.android.service_booking_settings.work_hours.mvi.entity.Option;
import com.avito.android.util.InterfaceC35863o4;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: ServiceBookingWorkHoursTimeGapConverter.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_booking_settings/domain/converters/t;", "Lcom/avito/android/service_booking_settings/domain/converters/s;", "_avito_service-booking-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class t implements s {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35863o4 f277890a;

    @Inject
    public t(@Y61.k InterfaceC35863o4 interfaceC35863o4) {
        this.f277890a = interfaceC35863o4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.avito.android.service_booking_settings.domain.converters.s
    @Y61.l
    public final Ut0.k a(@Y61.l ServiceBookingWorkHours.ServiceBookingTimeGap serviceBookingTimeGap) {
        Option option = null;
        if (serviceBookingTimeGap == null) {
            return null;
        }
        List<ServiceBookingWorkHours.Options> listC = serviceBookingTimeGap.c();
        ArrayList arrayList = new ArrayList(C42745f0.q(listC, 10));
        for (ServiceBookingWorkHours.Options options : listC) {
            arrayList.add(new Option(options.getId(), options.getTitle()));
        }
        String strA = this.f277890a.a();
        String title = serviceBookingTimeGap.getTitle();
        String description = serviceBookingTimeGap.getDescription();
        String placeholder = serviceBookingTimeGap.getPlaceholder();
        String value = serviceBookingTimeGap.getValue();
        if (value != null) {
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (L.f(((Option) next).f278053b, value)) {
                    option = next;
                    break;
                }
            }
            option = option;
        }
        return new Ut0.k(strA, title, description, placeholder, option, arrayList, false, 64, null);
    }
}
