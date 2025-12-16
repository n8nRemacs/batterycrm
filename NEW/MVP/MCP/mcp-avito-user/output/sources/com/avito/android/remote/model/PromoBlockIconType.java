package com.avito.android.remote.model;

import Y61.k;
import com.avito.android.remote.model.notifications_settings.NotificationsSettings;
import com.avito.android.remote.model.payment.PaymentMethodTypeKt;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PromoBlockIconType.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/avito/android/remote/model/PromoBlockIconType;", "", "(Ljava/lang/String;I)V", "DELIVERY", "DELIVERY_COURIER", "SAFE_PAYMENT", "DELIVERY_UNAVAILABLE", "ARROW_RIGHT", "DELIVERY_OUTLINE", "WALLET", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class PromoBlockIconType {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ PromoBlockIconType[] $VALUES;

    @c(NotificationsSettings.Section.SECTION_DELIVERY)
    public static final PromoBlockIconType DELIVERY = new PromoBlockIconType("DELIVERY", 0);

    @c("deliveryCourier")
    public static final PromoBlockIconType DELIVERY_COURIER = new PromoBlockIconType("DELIVERY_COURIER", 1);

    @c("safePayment")
    public static final PromoBlockIconType SAFE_PAYMENT = new PromoBlockIconType("SAFE_PAYMENT", 2);

    @c("deliveryUnavailable")
    public static final PromoBlockIconType DELIVERY_UNAVAILABLE = new PromoBlockIconType("DELIVERY_UNAVAILABLE", 3);

    @c("arrowRight")
    public static final PromoBlockIconType ARROW_RIGHT = new PromoBlockIconType("ARROW_RIGHT", 4);

    @c("deliveryOutline")
    public static final PromoBlockIconType DELIVERY_OUTLINE = new PromoBlockIconType("DELIVERY_OUTLINE", 5);

    @c(PaymentMethodTypeKt.PAYMENT_METHOD_TYPE_WALLET)
    public static final PromoBlockIconType WALLET = new PromoBlockIconType("WALLET", 6);

    private static final /* synthetic */ PromoBlockIconType[] $values() {
        return new PromoBlockIconType[]{DELIVERY, DELIVERY_COURIER, SAFE_PAYMENT, DELIVERY_UNAVAILABLE, ARROW_RIGHT, DELIVERY_OUTLINE, WALLET};
    }

    static {
        PromoBlockIconType[] promoBlockIconTypeArr$values = $values();
        $VALUES = promoBlockIconTypeArr$values;
        $ENTRIES = kotlin.enums.c.a(promoBlockIconTypeArr$values);
    }

    private PromoBlockIconType(String str, int i12) {
    }

    @k
    public static a<PromoBlockIconType> getEntries() {
        return $ENTRIES;
    }

    public static PromoBlockIconType valueOf(String str) {
        return (PromoBlockIconType) Enum.valueOf(PromoBlockIconType.class, str);
    }

    public static PromoBlockIconType[] values() {
        return (PromoBlockIconType[]) $VALUES.clone();
    }
}
