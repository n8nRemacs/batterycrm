package com.avito.android.str_booking.analytics;

import Y61.k;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import com.avito.android.analytics.provider.clickstream.a;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;
import kotlin.enums.c;

/* compiled from: BookingPageUpdateStatusEvent.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/str_booking/analytics/BookingPageUpdateStatusEvent;", "Lcom/avito/android/analytics/provider/clickstream/a;", "UpdateStatus", "_avito_str-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class BookingPageUpdateStatusEvent implements a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f285380b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: BookingPageUpdateStatusEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_booking/analytics/BookingPageUpdateStatusEvent$UpdateStatus;", "", "_avito_str-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class UpdateStatus {

        /* renamed from: c, reason: collision with root package name */
        public static final UpdateStatus f285381c;

        /* renamed from: d, reason: collision with root package name */
        public static final UpdateStatus f285382d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ UpdateStatus[] f285383e;

        /* renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f285384f;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f285385b;

        static {
            UpdateStatus updateStatus = new UpdateStatus("POLLING", 0, "polling");
            f285381c = updateStatus;
            UpdateStatus updateStatus2 = new UpdateStatus("EVENT_BUS", 1, "event_bus");
            f285382d = updateStatus2;
            UpdateStatus[] updateStatusArr = {updateStatus, updateStatus2};
            f285383e = updateStatusArr;
            f285384f = c.a(updateStatusArr);
        }

        public UpdateStatus(String str, int i12, String str2) {
            this.f285385b = str2;
        }

        public static UpdateStatus valueOf(String str) {
            return (UpdateStatus) Enum.valueOf(UpdateStatus.class, str);
        }

        public static UpdateStatus[] values() {
            return (UpdateStatus[]) f285383e.clone();
        }
    }

    public BookingPageUpdateStatusEvent(int i12, @k String str, boolean z12, boolean z13, @k UpdateStatus updateStatus) {
        this.f285380b = new ParametrizedClickStreamEvent(15761, 2, P0.g(new Q("uid", Integer.valueOf(i12)), new Q("iid", 1), new Q("orderid", str), new Q("toggle_value", "feature_toggle: " + z12 + ", backend_toggle: " + z13), new Q("booking_status_update_type", updateStatus.f285385b)), null, 8, null);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF328428b() {
        return this.f285380b.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @k
    public final Map<String, Object> getParams() {
        return this.f285380b.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF328429c() {
        return this.f285380b.f90248c;
    }
}
