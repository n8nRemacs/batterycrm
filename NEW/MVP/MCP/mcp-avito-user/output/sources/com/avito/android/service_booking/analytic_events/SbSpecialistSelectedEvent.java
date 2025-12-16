package com.avito.android.service_booking.analytic_events;

import Y61.k;
import Y61.l;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import com.avito.android.analytics.provider.clickstream.a;
import com.avito.android.util.C35755b0;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;
import kotlin.enums.c;

/* compiled from: SbSpecialistSelectedEvent.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/service_booking/analytic_events/SbSpecialistSelectedEvent;", "Lcom/avito/android/analytics/provider/clickstream/a;", "SpecialistType", "_avito_service-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SbSpecialistSelectedEvent implements a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f274160b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SbSpecialistSelectedEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_booking/analytic_events/SbSpecialistSelectedEvent$SpecialistType;", "", "_avito_service-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class SpecialistType {

        /* renamed from: c, reason: collision with root package name */
        public static final SpecialistType f274161c;

        /* renamed from: d, reason: collision with root package name */
        public static final SpecialistType f274162d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ SpecialistType[] f274163e;

        /* renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f274164f;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f274165b;

        static {
            SpecialistType specialistType = new SpecialistType("ANY_SPECIALIST", 0, "choose_any_master");
            f274161c = specialistType;
            SpecialistType specialistType2 = new SpecialistType("SPECIFIC_SPECIALIST", 1, "choose_specific_master");
            f274162d = specialistType2;
            SpecialistType[] specialistTypeArr = {specialistType, specialistType2};
            f274163e = specialistTypeArr;
            f274164f = c.a(specialistTypeArr);
        }

        public SpecialistType(String str, int i12, String str2) {
            this.f274165b = str2;
        }

        public static SpecialistType valueOf(String str) {
            return (SpecialistType) Enum.valueOf(SpecialistType.class, str);
        }

        public static SpecialistType[] values() {
            return (SpecialistType[]) f274163e.clone();
        }
    }

    public SbSpecialistSelectedEvent(@k SpecialistType specialistType, @k String str, @l String str2, @l String str3) {
        this.f274160b = new ParametrizedClickStreamEvent(9380, 2, C35755b0.c(P0.g(new Q("iid", str), new Q("mcid", str2), new Q("locationid", str3), new Q("action_type", specialistType.f274165b))), null, 8, null);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF97978b() {
        return this.f274160b.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @k
    public final Map<String, Object> getParams() {
        return this.f274160b.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF97979c() {
        return this.f274160b.f90248c;
    }
}
