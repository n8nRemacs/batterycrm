package jF0;

import Y61.k;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.travel_payment_selector.generated.api.api_1_str_booking_payment_types_get.PaymentTypesResSuccessPaymentTypesItem;
import java.util.List;
import kotlin.Metadata;

/* compiled from: Api1StrBookingPaymentTypesGetResponse.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"LjF0/a;", "", "", "defaultPaymentTypeIndex", "", "Lcom/avito/android/travel_payment_selector/generated/api/api_1_str_booking_payment_types_get/PaymentTypesResSuccessPaymentTypesItem;", "paymentTypes", "Lcom/avito/android/remote/model/text/AttributedText;", "title", "<init>", "(JLjava/util/List;Lcom/avito/android/remote/model/text/AttributedText;)V", "J", "getDefaultPaymentTypeIndex", "()J", "Ljava/util/List;", "getPaymentTypes", "()Ljava/util/List;", "Lcom/avito/android/remote/model/text/AttributedText;", "getTitle", "()Lcom/avito/android/remote/model/text/AttributedText;", "_avito_travel-payment-selector_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: jF0.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C42243a {

    @com.google.gson.annotations.c("defaultPaymentTypeIndex")
    private final long defaultPaymentTypeIndex;

    @com.google.gson.annotations.c("paymentTypes")
    @k
    private final List<PaymentTypesResSuccessPaymentTypesItem> paymentTypes;

    @com.google.gson.annotations.c("title")
    @k
    private final AttributedText title;

    public C42243a(long j12, @k List<PaymentTypesResSuccessPaymentTypesItem> list, @k AttributedText attributedText) {
        this.defaultPaymentTypeIndex = j12;
        this.paymentTypes = list;
        this.title = attributedText;
    }
}
