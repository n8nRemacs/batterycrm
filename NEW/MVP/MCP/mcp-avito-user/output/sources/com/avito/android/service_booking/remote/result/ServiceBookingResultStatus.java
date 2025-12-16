package com.avito.android.service_booking.remote.result;

import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ServiceBookingResult.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_booking/remote/result/ServiceBookingResultStatus;", "", "_avito_service-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ServiceBookingResultStatus {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ ServiceBookingResultStatus[] f274811b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ a f274812c;

    static {
        ServiceBookingResultStatus[] serviceBookingResultStatusArr = {new ServiceBookingResultStatus("OK", 0), new ServiceBookingResultStatus("FAILURE", 1), new ServiceBookingResultStatus("PARTNER_OUT_OF_SERVICE", 2), new ServiceBookingResultStatus("WRONG_TIME_SLOT", 3)};
        f274811b = serviceBookingResultStatusArr;
        f274812c = c.a(serviceBookingResultStatusArr);
    }

    public static ServiceBookingResultStatus valueOf(String str) {
        return (ServiceBookingResultStatus) Enum.valueOf(ServiceBookingResultStatus.class, str);
    }

    public static ServiceBookingResultStatus[] values() {
        return (ServiceBookingResultStatus[]) f274811b.clone();
    }
}
