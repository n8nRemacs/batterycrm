package com.avito.android.service_booking.analytic_events;

import Y61.k;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import com.avito.android.analytics.provider.clickstream.a;
import com.avito.android.util.C35755b0;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;
import kotlin.enums.c;

/* compiled from: SBSpecialistScreenOpenEvent.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/service_booking/analytic_events/SBSpecialistScreenOpenEvent;", "Lcom/avito/android/analytics/provider/clickstream/a;", "FromPageType", "_avito_service-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SBSpecialistScreenOpenEvent implements a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f274147b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SBSpecialistScreenOpenEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_booking/analytic_events/SBSpecialistScreenOpenEvent$FromPageType;", "", "_avito_service-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class FromPageType {

        /* renamed from: c, reason: collision with root package name */
        public static final FromPageType f274148c;

        /* renamed from: d, reason: collision with root package name */
        public static final FromPageType f274149d;

        /* renamed from: e, reason: collision with root package name */
        public static final FromPageType f274150e;

        /* renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ FromPageType[] f274151f;

        /* renamed from: g, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f274152g;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f274153b;

        static {
            FromPageType fromPageType = new FromPageType("MANY_MASTERS", 0, "many_masters");
            f274148c = fromPageType;
            FromPageType fromPageType2 = new FromPageType("ONE_MASTER", 1, "one_master");
            f274149d = fromPageType2;
            FromPageType fromPageType3 = new FromPageType("CUT_SERVICE", 2, "cut_services");
            f274150e = fromPageType3;
            FromPageType[] fromPageTypeArr = {fromPageType, fromPageType2, fromPageType3};
            f274151f = fromPageTypeArr;
            f274152g = c.a(fromPageTypeArr);
        }

        public FromPageType(String str, int i12, String str2) {
            this.f274153b = str2;
        }

        public static FromPageType valueOf(String str) {
            return (FromPageType) Enum.valueOf(FromPageType.class, str);
        }

        public static FromPageType[] values() {
            return (FromPageType[]) f274151f.clone();
        }
    }

    public SBSpecialistScreenOpenEvent(@k String str, @k FromPageType fromPageType) {
        int i12 = 9492;
        this.f274147b = new ParametrizedClickStreamEvent(i12, 1, C35755b0.c(P0.g(new Q("iid", str), new Q("from_page", fromPageType.f274153b))), null, 8, null);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF83096b() {
        return this.f274147b.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @k
    public final Map<String, Object> getParams() {
        return this.f274147b.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF83097c() {
        return this.f274147b.f90248c;
    }
}
