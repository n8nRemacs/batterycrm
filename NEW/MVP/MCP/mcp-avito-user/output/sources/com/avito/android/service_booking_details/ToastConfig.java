package com.avito.android.service_booking_details;

import kotlin.Metadata;

/* compiled from: ServiceBookingItemDetailsView.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/service_booking_details/ToastConfig;", "", "ToastAnchor", "_avito_service-booking-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ToastConfig {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ServiceBookingItemDetailsView.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_booking_details/ToastConfig$ToastAnchor;", "", "_avito_service-booking-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ToastAnchor {

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ ToastAnchor[] f277210b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f277211c;

        static {
            ToastAnchor[] toastAnchorArr = {new ToastAnchor("ROOT", 0), new ToastAnchor("BUTTONS_CONTAINER", 1)};
            f277210b = toastAnchorArr;
            f277211c = kotlin.enums.c.a(toastAnchorArr);
        }

        public ToastAnchor() {
            throw null;
        }

        public static ToastAnchor valueOf(String str) {
            return (ToastAnchor) Enum.valueOf(ToastAnchor.class, str);
        }

        public static ToastAnchor[] values() {
            return (ToastAnchor[]) f277210b.clone();
        }
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ToastConfig)) {
            return false;
        }
        throw null;
    }

    public final int hashCode() {
        throw null;
    }

    @Y61.k
    public final String toString() {
        throw null;
    }
}
