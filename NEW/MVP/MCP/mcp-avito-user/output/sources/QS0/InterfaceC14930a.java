package Qs0;

import J81.o;
import J81.t;
import Rs0.C15078a;
import Y61.k;
import Y61.l;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.service_booking_additional_settings.additionalsettings.remote.model.post_toggle.ToggleResult;
import e30.InterfaceC39936a;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* compiled from: ServiceBookingAdditionalSettingsApi.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H§@¢\u0006\u0004\b\u0004\u0010\u0005J \u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00022\b\b\u0001\u0010\u0007\u001a\u00020\u0006H§@¢\u0006\u0004\b\t\u0010\nJ\"\u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\u00022\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u000bH§@¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LQs0/a;", "", "Lcom/avito/android/remote/model/TypedResult;", "LRs0/a;", "c", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "bookingToggle", "Lcom/avito/android/service_booking_additional_settings/additionalsettings/remote/model/post_toggle/ToggleResult;", "b", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "timeGapId", "a", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "_avito_service-booking-additional-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC39936a
/* renamed from: Qs0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC14930a {
    @o("1/serviceBooking/flexibleSchedule/timeGapSetting")
    @l
    Object a(@l @t("bottomsheetTimeGap") String str, @k Continuation<? super TypedResult<ToggleResult>> continuation);

    @o("1/serviceBooking/flexibleSchedule/bookingToggle")
    @l
    Object b(@t("bookingToggle") boolean z12, @k Continuation<? super TypedResult<ToggleResult>> continuation);

    @o("1/serviceBooking/flexibleSchedule/settings")
    @l
    Object c(@k Continuation<? super TypedResult<C15078a>> continuation);
}
