package com.avito.android.service_booking_day_settings.daysettings.domain.shedule_day.converters;

import com.avito.android.R;
import com.avito.android.service_booking_day_settings.daysettings.data.remote.model.DayScheduleResult;
import com.avito.android.service_booking_day_settings.daysettings.mvi.entity.DaySettingsState;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: SaveScheduleInfoConverter.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_service-booking-day-settings_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class q {

    /* compiled from: SaveScheduleInfoConverter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f276816a;

        static {
            int[] iArr = new int[DayScheduleResult.ServiceBookingSaveScheduleInfo.ActionButton.ButtonStyle.values().length];
            try {
                iArr[DayScheduleResult.ServiceBookingSaveScheduleInfo.ActionButton.ButtonStyle.PRIMARY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DayScheduleResult.ServiceBookingSaveScheduleInfo.ActionButton.ButtonStyle.SECONDARY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f276816a = iArr;
        }
    }

    public static final DaySettingsState.SaveScheduleInfo.ActionButtonItem a(DayScheduleResult.ServiceBookingSaveScheduleInfo.ActionButton actionButton) {
        int i12;
        String title = actionButton.getTitle();
        int i13 = a.f276816a[actionButton.getStyle().ordinal()];
        if (i13 == 1) {
            i12 = R.attr.buttonPrimaryLarge;
        } else {
            if (i13 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i12 = R.attr.buttonSecondaryLarge;
        }
        return new DaySettingsState.SaveScheduleInfo.ActionButtonItem(title, Integer.valueOf(i12));
    }
}
