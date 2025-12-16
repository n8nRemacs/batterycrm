package Ss0;

import J81.e;
import J81.k;
import J81.o;
import Ts0.C15403a;
import Us0.C15564a;
import Vs0.C15714a;
import Y61.l;
import com.avito.android.remote.model.TypedResult;
import e30.InterfaceC39936a;
import e30.InterfaceC39938c;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* compiled from: ServiceBookingAdditionalSettingsApi.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007J\"\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00042\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\bH§@¢\u0006\u0004\b\u000b\u0010\fJ\"\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00042\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\bH§@¢\u0006\u0004\b\u000f\u0010\f¨\u0006\u0010"}, d2 = {"LSs0/a;", "", "", "bookingToggle", "Lcom/avito/android/remote/model/TypedResult;", "LVs0/a;", "c", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "techBreakId", "LTs0/a;", "a", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "bottomsheetTimeGap", "LUs0/a;", "b", "_avito_service-booking-additional-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC39936a
/* renamed from: Ss0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC15219a {
    @o("2/serviceBooking/flexibleSchedule/techBreakSetting")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @InterfaceC39938c
    @e
    @k({"X-Geo-required: true"})
    @l
    Object a(@J81.c("techBreakId") @l String str, @Y61.k Continuation<? super TypedResult<C15403a>> continuation);

    @o("2/serviceBooking/flexibleSchedule/timeGapSetting")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @InterfaceC39938c
    @e
    @k({"X-Geo-required: true"})
    @l
    Object b(@J81.c("bottomsheetTimeGap") @l String str, @Y61.k Continuation<? super TypedResult<C15564a>> continuation);

    @o("2/serviceBooking/flexibleSchedule/bookingToggle")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @InterfaceC39938c
    @e
    @k({"X-Geo-required: true"})
    @l
    Object c(@J81.c("bookingToggle") boolean z12, @Y61.k Continuation<? super TypedResult<C15714a>> continuation);
}
