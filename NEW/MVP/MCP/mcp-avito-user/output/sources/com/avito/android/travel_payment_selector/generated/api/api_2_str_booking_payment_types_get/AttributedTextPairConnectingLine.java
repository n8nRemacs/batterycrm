package com.avito.android.travel_payment_selector.generated.api.api_2_str_booking_payment_types_get;

import Y61.l;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.google.gson.annotations.c;
import kF0.k;
import kotlin.Metadata;
import kotlin.enums.a;

/* compiled from: Api2StrBookingPaymentTypesGetResponse.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001:\u0001\u000eB\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lcom/avito/android/travel_payment_selector/generated/api/api_2_str_booking_payment_types_get/AttributedTextPairConnectingLine;", "", "LkF0/k;", "color", "Lcom/avito/android/travel_payment_selector/generated/api/api_2_str_booking_payment_types_get/AttributedTextPairConnectingLine$Style;", BeduinPromoBlockModel.SERIALIZED_NAME_STYLE, "<init>", "(LkF0/k;Lcom/avito/android/travel_payment_selector/generated/api/api_2_str_booking_payment_types_get/AttributedTextPairConnectingLine$Style;)V", "LkF0/k;", "getColor", "()LkF0/k;", "Lcom/avito/android/travel_payment_selector/generated/api/api_2_str_booking_payment_types_get/AttributedTextPairConnectingLine$Style;", "getStyle", "()Lcom/avito/android/travel_payment_selector/generated/api/api_2_str_booking_payment_types_get/AttributedTextPairConnectingLine$Style;", "Style", "_avito_travel-payment-selector_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class AttributedTextPairConnectingLine {

    @c("color")
    @l
    private final k color;

    @c(BeduinPromoBlockModel.SERIALIZED_NAME_STYLE)
    @Y61.k
    private final Style style;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: Api2StrBookingPaymentTypesGetResponse.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/travel_payment_selector/generated/api/api_2_str_booking_payment_types_get/AttributedTextPairConnectingLine$Style;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Dotted", "_avito_travel-payment-selector_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Style {

        @c("dotted")
        public static final Style Dotted;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ Style[] f302636b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ a f302637c;

        static {
            Style style = new Style("Dotted", 0, "dotted");
            Dotted = style;
            Style[] styleArr = {style};
            f302636b = styleArr;
            f302637c = kotlin.enums.c.a(styleArr);
        }

        private Style(String str, int i12, String str2) {
        }

        public static Style valueOf(String str) {
            return (Style) Enum.valueOf(Style.class, str);
        }

        public static Style[] values() {
            return (Style[]) f302636b.clone();
        }
    }

    public AttributedTextPairConnectingLine(@l k kVar, @Y61.k Style style) {
        this.color = kVar;
        this.style = style;
    }
}
