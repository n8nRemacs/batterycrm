package com.avito.android.service_booking_additional_settings.additionalsettings.domain.converters;

import com.avito.android.R;
import com.avito.android.service_booking_additional_settings.additionalsettings.remote.model.screen_data.ServiceBookingAdditionalSettingsElement;
import j.InterfaceC42165v;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: AdditionalSettingsElementsContentConverter.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_service-booking-additional-settings_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class q {

    /* compiled from: AdditionalSettingsElementsContentConverter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f274856a;

        static {
            int[] iArr = new int[ServiceBookingAdditionalSettingsElement.IconType.values().length];
            try {
                iArr[ServiceBookingAdditionalSettingsElement.IconType.CALENDAR_ICON.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ServiceBookingAdditionalSettingsElement.IconType.BLOCK_TIME.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ServiceBookingAdditionalSettingsElement.IconType.TECH_BREAK.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f274856a = iArr;
        }
    }

    @InterfaceC42165v
    public static final int a(@Y61.k ServiceBookingAdditionalSettingsElement.IconType iconType) {
        int i12 = a.f274856a[iconType.ordinal()];
        if (i12 == 1) {
            return R.drawable.ic_booking_toggle_selector;
        }
        if (i12 == 2) {
            return R.drawable.ic_booking_time_gap_selector;
        }
        if (i12 == 3) {
            return R.drawable.ic_booking_tech_break_selector;
        }
        throw new NoWhenBranchMatchedException();
    }
}
