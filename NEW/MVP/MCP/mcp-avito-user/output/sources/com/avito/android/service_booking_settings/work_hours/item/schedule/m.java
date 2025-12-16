package com.avito.android.service_booking_settings.work_hours.item.schedule;

import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ServiceBookingWorkHourPayloadCreator.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_booking_settings/work_hours/item/schedule/m;", "", "_avito_service-booking-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class m {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f278019a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final org.threeten.bp.g f278020b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final org.threeten.bp.g f278021c;

    public m(boolean z12, @Y61.k org.threeten.bp.g gVar, @Y61.k org.threeten.bp.g gVar2) {
        this.f278019a = z12;
        this.f278020b = gVar;
        this.f278021c = gVar2;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return this.f278019a == mVar.f278019a && L.f(this.f278020b, mVar.f278020b) && L.f(this.f278021c, mVar.f278021c);
    }

    public final int hashCode() {
        return this.f278021c.hashCode() + ((this.f278020b.hashCode() + (Boolean.hashCode(this.f278019a) * 31)) * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ServiceBookingWorkHourPayload(isEnabled=");
        sb2.append(this.f278019a);
        sb2.append(", from=");
        sb2.append(this.f278020b);
        sb2.append(", to=");
        return org.webrtc.h.f(sb2, this.f278021c, ')');
    }
}
