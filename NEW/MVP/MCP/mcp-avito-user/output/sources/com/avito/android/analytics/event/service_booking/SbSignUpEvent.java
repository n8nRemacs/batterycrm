package com.avito.android.analytics.event.service_booking;

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
import kotlin.jvm.internal.C42822w;

/* compiled from: SbSignUpEvent.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/analytics/event/service_booking/SbSignUpEvent;", "Lcom/avito/android/analytics/provider/clickstream/a;", "ServiceBookingSource", "_avito_analytics_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class SbSignUpEvent implements a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f90135b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SbSignUpEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/analytics/event/service_booking/SbSignUpEvent$ServiceBookingSource;", "", "_avito_analytics_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ServiceBookingSource {

        /* renamed from: c, reason: collision with root package name */
        public static final ServiceBookingSource f90136c;

        /* renamed from: d, reason: collision with root package name */
        public static final ServiceBookingSource f90137d;

        /* renamed from: e, reason: collision with root package name */
        public static final ServiceBookingSource f90138e;

        /* renamed from: f, reason: collision with root package name */
        public static final ServiceBookingSource f90139f;

        /* renamed from: g, reason: collision with root package name */
        public static final /* synthetic */ ServiceBookingSource[] f90140g;

        /* renamed from: h, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f90141h;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f90142b;

        static {
            ServiceBookingSource serviceBookingSource = new ServiceBookingSource("STICKY_BTN", 0, "t");
            f90136c = serviceBookingSource;
            ServiceBookingSource serviceBookingSource2 = new ServiceBookingSource("STATIC_BTN", 1, "r");
            f90137d = serviceBookingSource2;
            ServiceBookingSource serviceBookingSource3 = new ServiceBookingSource("SNIPPET", 2, "s");
            f90138e = serviceBookingSource3;
            ServiceBookingSource serviceBookingSource4 = new ServiceBookingSource("XL_SNIPPET", 3, "xs");
            f90139f = serviceBookingSource4;
            ServiceBookingSource[] serviceBookingSourceArr = {serviceBookingSource, serviceBookingSource2, serviceBookingSource3, serviceBookingSource4};
            f90140g = serviceBookingSourceArr;
            f90141h = c.a(serviceBookingSourceArr);
        }

        public ServiceBookingSource(String str, int i12, String str2) {
            this.f90142b = str2;
        }

        public static ServiceBookingSource valueOf(String str) {
            return (ServiceBookingSource) Enum.valueOf(ServiceBookingSource.class, str);
        }

        public static ServiceBookingSource[] values() {
            return (ServiceBookingSource[]) f90140g.clone();
        }
    }

    public SbSignUpEvent(@k String str, @l String str2, @l String str3, @k ServiceBookingSource serviceBookingSource, @l String str4) {
        this.f90135b = new ParametrizedClickStreamEvent(6154, 2, C35755b0.c(P0.g(new Q("iid", str), new Q("mcid", str2), new Q("locationid", str3), new Q("vsrc", serviceBookingSource.f90142b), new Q("x", str4))), null, 8, null);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF75431b() {
        return this.f90135b.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @k
    public final Map<String, Object> getParams() {
        return this.f90135b.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF75432c() {
        return this.f90135b.f90248c;
    }

    public /* synthetic */ SbSignUpEvent(String str, String str2, String str3, ServiceBookingSource serviceBookingSource, String str4, int i12, C42822w c42822w) {
        this(str, str2, str3, serviceBookingSource, (i12 & 16) != 0 ? null : str4);
    }
}
