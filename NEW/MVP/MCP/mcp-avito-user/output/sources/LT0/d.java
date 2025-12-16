package Lt0;

import com.avito.android.R;
import com.avito.android.service_booking_schedule_repetition_impl.model.ServiceBookingRepetitionResult;
import com.avito.android.service_booking_schedule_repetition_impl.mvi.entity.ScheduleRepetitionState;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: SaveScheduleInfoConverter.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_service-booking-schedule-repetition_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class d {

    /* compiled from: SaveScheduleInfoConverter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f10168a;

        static {
            int[] iArr = new int[ServiceBookingRepetitionResult.ServiceBookingSaveScheduleInfo.ActionButton.ButtonStyle.values().length];
            try {
                iArr[ServiceBookingRepetitionResult.ServiceBookingSaveScheduleInfo.ActionButton.ButtonStyle.PRIMARY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ServiceBookingRepetitionResult.ServiceBookingSaveScheduleInfo.ActionButton.ButtonStyle.SECONDARY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f10168a = iArr;
        }
    }

    public static final ScheduleRepetitionState.Content.SaveScheduleInfo.ActionButtonItem a(ServiceBookingRepetitionResult.ServiceBookingSaveScheduleInfo.ActionButton actionButton) {
        int i12;
        String strB = actionButton.getTitle();
        int i13 = a.f10168a[actionButton.getStyle().ordinal()];
        if (i13 == 1) {
            i12 = R.attr.buttonPrimaryLarge;
        } else {
            if (i13 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i12 = R.attr.buttonSecondaryLarge;
        }
        return new ScheduleRepetitionState.Content.SaveScheduleInfo.ActionButtonItem(strB, Integer.valueOf(i12));
    }
}
