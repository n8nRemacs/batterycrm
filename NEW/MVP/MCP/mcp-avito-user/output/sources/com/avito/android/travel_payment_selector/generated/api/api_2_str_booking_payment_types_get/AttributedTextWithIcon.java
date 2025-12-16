package com.avito.android.travel_payment_selector.generated.api.api_2_str_booking_payment_types_get;

import Y61.k;
import Y61.l;
import com.avito.android.remote.model.text.AttributedText;
import com.google.gson.annotations.c;
import kF0.e;
import kotlin.Metadata;
import kotlin.enums.a;

/* compiled from: Api2StrBookingPaymentTypesGetResponse.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u00002\u00020\u0001:\u0001\u0013B#\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Lcom/avito/android/travel_payment_selector/generated/api/api_2_str_booking_payment_types_get/AttributedTextWithIcon;", "", "LkF0/e;", "icon", "Lcom/avito/android/travel_payment_selector/generated/api/api_2_str_booking_payment_types_get/AttributedTextWithIcon$IconPosition;", "iconPosition", "Lcom/avito/android/remote/model/text/AttributedText;", "text", "<init>", "(LkF0/e;Lcom/avito/android/travel_payment_selector/generated/api/api_2_str_booking_payment_types_get/AttributedTextWithIcon$IconPosition;Lcom/avito/android/remote/model/text/AttributedText;)V", "LkF0/e;", "getIcon", "()LkF0/e;", "Lcom/avito/android/travel_payment_selector/generated/api/api_2_str_booking_payment_types_get/AttributedTextWithIcon$IconPosition;", "getIconPosition", "()Lcom/avito/android/travel_payment_selector/generated/api/api_2_str_booking_payment_types_get/AttributedTextWithIcon$IconPosition;", "Lcom/avito/android/remote/model/text/AttributedText;", "a", "()Lcom/avito/android/remote/model/text/AttributedText;", "IconPosition", "_avito_travel-payment-selector_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class AttributedTextWithIcon {

    @c("icon")
    @l
    private final e icon;

    @c("iconPosition")
    @l
    private final IconPosition iconPosition;

    @c("text")
    @k
    private final AttributedText text;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: Api2StrBookingPaymentTypesGetResponse.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/travel_payment_selector/generated/api/api_2_str_booking_payment_types_get/AttributedTextWithIcon$IconPosition;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Start", "End", "_avito_travel-payment-selector_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class IconPosition {

        @c("end")
        public static final IconPosition End;

        @c("start")
        public static final IconPosition Start;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ IconPosition[] f302638b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ a f302639c;

        static {
            IconPosition iconPosition = new IconPosition("Start", 0, "start");
            Start = iconPosition;
            IconPosition iconPosition2 = new IconPosition("End", 1, "end");
            End = iconPosition2;
            IconPosition[] iconPositionArr = {iconPosition, iconPosition2};
            f302638b = iconPositionArr;
            f302639c = kotlin.enums.c.a(iconPositionArr);
        }

        private IconPosition(String str, int i12, String str2) {
        }

        public static IconPosition valueOf(String str) {
            return (IconPosition) Enum.valueOf(IconPosition.class, str);
        }

        public static IconPosition[] values() {
            return (IconPosition[]) f302638b.clone();
        }
    }

    public AttributedTextWithIcon(@l e eVar, @l IconPosition iconPosition, @k AttributedText attributedText) {
        this.icon = eVar;
        this.iconPosition = iconPosition;
        this.text = attributedText;
    }

    @k
    /* renamed from: a, reason: from getter */
    public final AttributedText getText() {
        return this.text;
    }
}
