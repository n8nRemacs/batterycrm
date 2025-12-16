package com.avito.android.service_booking_utils.events;

import Y61.k;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import java.util.Collections;
import java.util.Map;
import kotlin.Metadata;
import kotlin.enums.c;

/* compiled from: HelpLinkClickedEvent.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/service_booking_utils/events/HelpLinkClickedEvent;", "Lcom/avito/android/analytics/provider/clickstream/a;", "FromPage", "_avito_service-booking-utils_utils"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class HelpLinkClickedEvent implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f278337b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: HelpLinkClickedEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_booking_utils/events/HelpLinkClickedEvent$FromPage;", "", "_avito_service-booking-utils_utils"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class FromPage {

        /* renamed from: c, reason: collision with root package name */
        public static final FromPage f278338c;

        /* renamed from: d, reason: collision with root package name */
        public static final FromPage f278339d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ FromPage[] f278340e;

        /* renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f278341f;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f278342b;

        static {
            FromPage fromPage = new FromPage("LIST_SELLER", 0, "list_seller");
            f278338c = fromPage;
            FromPage fromPage2 = new FromPage("SCHEDULE_DAY", 1, "schedule_day");
            f278339d = fromPage2;
            FromPage[] fromPageArr = {fromPage, fromPage2};
            f278340e = fromPageArr;
            f278341f = c.a(fromPageArr);
        }

        public FromPage(String str, int i12, String str2) {
            this.f278342b = str2;
        }

        public static FromPage valueOf(String str) {
            return (FromPage) Enum.valueOf(FromPage.class, str);
        }

        public static FromPage[] values() {
            return (FromPage[]) f278340e.clone();
        }
    }

    public HelpLinkClickedEvent(@k FromPage fromPage) {
        int i12 = 10827;
        this.f278337b = new ParametrizedClickStreamEvent(i12, 1, Collections.singletonMap("from_page", fromPage.f278342b), null, 8, null);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF90247b() {
        return this.f278337b.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @k
    public final Map<String, Object> getParams() {
        return this.f278337b.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF90248c() {
        return this.f278337b.f90248c;
    }
}
