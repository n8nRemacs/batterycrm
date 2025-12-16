package com.avito.android.service_booking_utils.events.reminder_banner;

import Y61.k;
import Y61.l;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import com.avito.android.util.C35755b0;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;
import kotlin.jvm.internal.C42822w;

/* compiled from: ServiceBookingReminderCloseEvent.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/service_booking_utils/events/reminder_banner/a;", "Lcom/avito/android/analytics/provider/clickstream/a;", "a", "_avito_service-booking-utils_utils"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class a implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: c, reason: collision with root package name */
    @k
    public static final String f278377c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public static final String f278378d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public static final String f278379e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public static final String f278380f;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f278381b;

    /* compiled from: ServiceBookingReminderCloseEvent.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082D¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082D¢\u0006\u0006\n\u0004\b\t\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/avito/android/service_booking_utils/events/reminder_banner/a$a;", "", "<init>", "()V", "", "ACTION_TYPE", "Ljava/lang/String;", "BANNER_TYPE", "FROM_PAGE", "FROM_SOURCE", "_avito_service-booking-utils_utils"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.service_booking_utils.events.reminder_banner.a$a, reason: collision with other inner class name */
    public static final class C8272a {
        public /* synthetic */ C8272a(C42822w c42822w) {
            this();
        }

        public C8272a() {
        }
    }

    static {
        new C8272a(null);
        f278377c = "from_page";
        f278378d = "banner_type";
        f278379e = "action_type";
        f278380f = "from_source";
    }

    public a(@l String str, @l String str2, @l String str3, @l String str4) {
        this.f278381b = new ParametrizedClickStreamEvent(15471, 2, C35755b0.c(P0.g(new Q(f278377c, str), new Q(f278378d, str2), new Q(f278379e, str3), new Q(f278380f, str4))), null, 8, null);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF328428b() {
        return this.f278381b.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @k
    public final Map<String, Object> getParams() {
        return this.f278381b.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF328429c() {
        return this.f278381b.f90248c;
    }
}
