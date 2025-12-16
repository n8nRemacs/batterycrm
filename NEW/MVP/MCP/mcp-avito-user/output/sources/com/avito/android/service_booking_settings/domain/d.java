package com.avito.android.service_booking_settings.domain;

import com.avito.android.service_booking.api.models.work_hours.ServiceBookingWorkHours;
import kotlin.Metadata;

/* compiled from: ServiceBookingSettingsMviInteractor.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_service-booking-settings_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class d {

    /* compiled from: ServiceBookingSettingsMviInteractor.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f277892a;

        static {
            int[] iArr = new int[ServiceBookingWorkHours.ServiceBookingSaveScheduleInfo.ActionButton.ButtonStyle.values().length];
            try {
                iArr[ServiceBookingWorkHours.ServiceBookingSaveScheduleInfo.ActionButton.ButtonStyle.PRIMARY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ServiceBookingWorkHours.ServiceBookingSaveScheduleInfo.ActionButton.ButtonStyle.SECONDARY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f277892a = iArr;
        }
    }
}
