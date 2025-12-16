package kF0;

import Y61.l;
import com.avito.android.travel_payment_selector.generated.api.api_2_str_booking_payment_types_get.AttributedTextPairConnectingLine;
import com.avito.android.travel_payment_selector.generated.api.api_2_str_booking_payment_types_get.AttributedTextWithIcon;
import kotlin.Metadata;

/* compiled from: Api2StrBookingPaymentTypesGetResponse.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\f\u001a\u0004\b\u000f\u0010\u000e¨\u0006\u0010"}, d2 = {"LkF0/b;", "", "Lcom/avito/android/travel_payment_selector/generated/api/api_2_str_booking_payment_types_get/AttributedTextPairConnectingLine;", "connectingLine", "Lcom/avito/android/travel_payment_selector/generated/api/api_2_str_booking_payment_types_get/AttributedTextWithIcon;", "leftPart", "rightPart", "<init>", "(Lcom/avito/android/travel_payment_selector/generated/api/api_2_str_booking_payment_types_get/AttributedTextPairConnectingLine;Lcom/avito/android/travel_payment_selector/generated/api/api_2_str_booking_payment_types_get/AttributedTextWithIcon;Lcom/avito/android/travel_payment_selector/generated/api/api_2_str_booking_payment_types_get/AttributedTextWithIcon;)V", "Lcom/avito/android/travel_payment_selector/generated/api/api_2_str_booking_payment_types_get/AttributedTextPairConnectingLine;", "getConnectingLine", "()Lcom/avito/android/travel_payment_selector/generated/api/api_2_str_booking_payment_types_get/AttributedTextPairConnectingLine;", "Lcom/avito/android/travel_payment_selector/generated/api/api_2_str_booking_payment_types_get/AttributedTextWithIcon;", "a", "()Lcom/avito/android/travel_payment_selector/generated/api/api_2_str_booking_payment_types_get/AttributedTextWithIcon;", "b", "_avito_travel-payment-selector_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class b {

    @com.google.gson.annotations.c("connectingLine")
    @l
    private final AttributedTextPairConnectingLine connectingLine;

    @com.google.gson.annotations.c("leftPart")
    @Y61.k
    private final AttributedTextWithIcon leftPart;

    @com.google.gson.annotations.c("rightPart")
    @l
    private final AttributedTextWithIcon rightPart;

    public b(@l AttributedTextPairConnectingLine attributedTextPairConnectingLine, @Y61.k AttributedTextWithIcon attributedTextWithIcon, @l AttributedTextWithIcon attributedTextWithIcon2) {
        this.connectingLine = attributedTextPairConnectingLine;
        this.leftPart = attributedTextWithIcon;
        this.rightPart = attributedTextWithIcon2;
    }

    @Y61.k
    /* renamed from: a, reason: from getter */
    public final AttributedTextWithIcon getLeftPart() {
        return this.leftPart;
    }

    @l
    /* renamed from: b, reason: from getter */
    public final AttributedTextWithIcon getRightPart() {
        return this.rightPart;
    }
}
