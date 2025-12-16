package Il0;

import Y61.k;
import Y61.l;
import com.avito.android.remote.short_term_rent.generated.api.api_2_str_booking_request_pay_post.PaymentType;
import kotlin.Metadata;

/* compiled from: Api2StrBookingRequestPayPostRequest.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\"\u0018\u00002\u00020\u0001B\u0081\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0018\u001a\u0004\b!\u0010\u001aR\u001c\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u001b\u001a\u0004\b\"\u0010\u001dR\u001c\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u001b\u001a\u0004\b#\u0010\u001dR\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010$\u001a\u0004\b%\u0010&R\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010'\u001a\u0004\b(\u0010)R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010*\u001a\u0004\b+\u0010,R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u001b\u001a\u0004\b-\u0010\u001dR\u001a\u0010\u0012\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010.\u001a\u0004\b/\u00100R\u001a\u0010\u0014\u001a\u00020\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u00101\u001a\u0004\b2\u00103R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u001b\u001a\u0004\b4\u0010\u001d¨\u00065"}, d2 = {"LIl0/b;", "", "", "bonusAmount", "", "bonusSelectionId", "LIl0/g;", "contact", "guestsCount", "guestsDetailed", "idempotencyKey", "itemId", "", "nonRefundableDiscountEnable", "Lcom/avito/android/remote/short_term_rent/generated/api/api_2_str_booking_request_pay_post/PaymentType;", "paymentType", "promoCode", "LIl0/e;", "range", "LIl0/c;", "redirect", "x", "<init>", "(Ljava/lang/Long;Ljava/lang/String;LIl0/g;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;JLjava/lang/Boolean;Lcom/avito/android/remote/short_term_rent/generated/api/api_2_str_booking_request_pay_post/PaymentType;Ljava/lang/String;LIl0/e;LIl0/c;Ljava/lang/String;)V", "Ljava/lang/Long;", "getBonusAmount", "()Ljava/lang/Long;", "Ljava/lang/String;", "getBonusSelectionId", "()Ljava/lang/String;", "LIl0/g;", "getContact", "()LIl0/g;", "getGuestsCount", "getGuestsDetailed", "getIdempotencyKey", "J", "getItemId", "()J", "Ljava/lang/Boolean;", "getNonRefundableDiscountEnable", "()Ljava/lang/Boolean;", "Lcom/avito/android/remote/short_term_rent/generated/api/api_2_str_booking_request_pay_post/PaymentType;", "getPaymentType", "()Lcom/avito/android/remote/short_term_rent/generated/api/api_2_str_booking_request_pay_post/PaymentType;", "getPromoCode", "LIl0/e;", "getRange", "()LIl0/e;", "LIl0/c;", "getRedirect", "()LIl0/c;", "getX", "_avito-discouraged_avito-api_short-term-rent"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Il0.b, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C14129b {

    @com.google.gson.annotations.c("bonusAmount")
    @l
    private final Long bonusAmount;

    @com.google.gson.annotations.c("bonusSelectionId")
    @l
    private final String bonusSelectionId;

    @com.google.gson.annotations.c("contact")
    @k
    private final g contact;

    @com.google.gson.annotations.c("guestsCount")
    @l
    private final Long guestsCount;

    @com.google.gson.annotations.c("guestsDetailed")
    @l
    private final String guestsDetailed;

    @com.google.gson.annotations.c("idempotencyKey")
    @l
    private final String idempotencyKey;

    @com.google.gson.annotations.c("itemId")
    private final long itemId;

    @com.google.gson.annotations.c("nonRefundableDiscountEnable")
    @l
    private final Boolean nonRefundableDiscountEnable;

    @com.google.gson.annotations.c("paymentType")
    @l
    private final PaymentType paymentType;

    @com.google.gson.annotations.c("promoCode")
    @l
    private final String promoCode;

    @com.google.gson.annotations.c("range")
    @k
    private final e range;

    @com.google.gson.annotations.c("redirect")
    @k
    private final c redirect;

    @com.google.gson.annotations.c("x")
    @l
    private final String x;

    public C14129b(@l Long l12, @l String str, @k g gVar, @l Long l13, @l String str2, @l String str3, long j12, @l Boolean bool, @l PaymentType paymentType, @l String str4, @k e eVar, @k c cVar, @l String str5) {
        this.bonusAmount = l12;
        this.bonusSelectionId = str;
        this.contact = gVar;
        this.guestsCount = l13;
        this.guestsDetailed = str2;
        this.idempotencyKey = str3;
        this.itemId = j12;
        this.nonRefundableDiscountEnable = bool;
        this.paymentType = paymentType;
        this.promoCode = str4;
        this.range = eVar;
        this.redirect = cVar;
        this.x = str5;
    }
}
