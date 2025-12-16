package com.avito.android.service_booking.remote.result;

import Y61.k;
import Y61.l;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ServiceBookingResult.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/service_booking/remote/result/ServiceBookingError;", "Landroid/os/Parcelable;", "<init>", "()V", "Lcom/avito/android/service_booking/remote/result/ServiceBookingResult$Failure;", "Lcom/avito/android/service_booking/remote/result/ServiceBookingResult$PartnerServiceError;", "Lcom/avito/android/service_booking/remote/result/ServiceBookingResult$WrongSlotError;", "_avito_service-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class ServiceBookingError implements Parcelable {
    public /* synthetic */ ServiceBookingError(C42822w c42822w) {
        this();
    }

    public boolean equals(@l Object obj) {
        String message = getMessage();
        ServiceBookingError serviceBookingError = obj instanceof ServiceBookingError ? (ServiceBookingError) obj : null;
        return L.f(message, serviceBookingError != null ? serviceBookingError.getMessage() : null);
    }

    @k
    public abstract String getMessage();

    public int hashCode() {
        return getMessage().hashCode();
    }

    private ServiceBookingError() {
    }
}
