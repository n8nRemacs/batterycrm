package iw0;

import J81.f;
import J81.t;
import Y61.k;
import Y61.l;
import com.avito.android.remote.model.TypedResult;
import e30.InterfaceC39936a;
import e30.InterfaceC39938c;
import jw0.InterfaceC42434a;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* compiled from: ShortTermRentApi.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J°\u0001\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\b\b\u0001\u0010\u0003\u001a\u00020\u00022\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u00042\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u00042\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u00042\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u00042\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\u00042\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u00042\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\u00042\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\u0004H§@¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Liw0/a;", "", "", "itemId", "", "checkInDate", "checkOutDate", "promoCode", "guestsDetailed", "fullName", "phone", "email", "bonusStateId", "bonusAmount", "", "nonRefundableDiscountEnable", "paymentType", "paymentPlan", "Lcom/avito/android/remote/model/TypedResult;", "Ljw0/a;", "a", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC39936a
/* renamed from: iw0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC42121a {
    @f("1/str/booking/form")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @InterfaceC39938c
    @l
    Object a(@t("itemId") long j12, @l @t("checkInDate") String str, @l @t("checkOutDate") String str2, @l @t("promoCode") String str3, @l @t("guestsDetailed") String str4, @l @t("fullName") String str5, @l @t("phone") String str6, @l @t("email") String str7, @l @t("bonusStateId") String str8, @l @t("bonusAmount") Long l12, @l @t("nonRefundableDiscountEnable") Boolean bool, @l @t("paymentType") String str9, @l @t("paymentPlan") String str10, @k Continuation<? super TypedResult<InterfaceC42434a>> continuation);
}
