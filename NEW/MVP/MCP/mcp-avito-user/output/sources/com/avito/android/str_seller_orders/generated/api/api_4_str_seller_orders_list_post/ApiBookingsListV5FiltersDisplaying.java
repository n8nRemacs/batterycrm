package com.avito.android.str_seller_orders.generated.api.api_4_str_seller_orders_list_post;

import Y61.l;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.enums.a;

/* compiled from: Api4StrSellerOrdersListPostResponse.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\u00020\u0001:\u0001\u0010B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\t\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u0011"}, d2 = {"Lcom/avito/android/str_seller_orders/generated/api/api_4_str_seller_orders_list_post/ApiBookingsListV5FiltersDisplaying;", "", "", "buttonTitle", "Lcom/avito/android/str_seller_orders/generated/api/api_4_str_seller_orders_list_post/ApiBookingsListV5FiltersDisplaying$Style;", BeduinPromoBlockModel.SERIALIZED_NAME_STYLE, "title", "<init>", "(Ljava/lang/String;Lcom/avito/android/str_seller_orders/generated/api/api_4_str_seller_orders_list_post/ApiBookingsListV5FiltersDisplaying$Style;Ljava/lang/String;)V", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Lcom/avito/android/str_seller_orders/generated/api/api_4_str_seller_orders_list_post/ApiBookingsListV5FiltersDisplaying$Style;", "b", "()Lcom/avito/android/str_seller_orders/generated/api/api_4_str_seller_orders_list_post/ApiBookingsListV5FiltersDisplaying$Style;", "c", "Style", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ApiBookingsListV5FiltersDisplaying {

    @c("buttonTitle")
    @l
    private final String buttonTitle;

    @c(BeduinPromoBlockModel.SERIALIZED_NAME_STYLE)
    @l
    private final Style style;

    @c("title")
    @l
    private final String title;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: Api4StrSellerOrdersListPostResponse.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/str_seller_orders/generated/api/api_4_str_seller_orders_list_post/ApiBookingsListV5FiltersDisplaying$Style;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "CHECKBOX", "CHECKMARK", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Style {

        @c("CHECKBOX")
        public static final Style CHECKBOX;

        @c("CHECKMARK")
        public static final Style CHECKMARK;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ Style[] f288804b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ a f288805c;

        static {
            Style style = new Style("CHECKBOX", 0, "CHECKBOX");
            CHECKBOX = style;
            Style style2 = new Style("CHECKMARK", 1, "CHECKMARK");
            CHECKMARK = style2;
            Style[] styleArr = {style, style2};
            f288804b = styleArr;
            f288805c = kotlin.enums.c.a(styleArr);
        }

        private Style(String str, int i12, String str2) {
        }

        public static Style valueOf(String str) {
            return (Style) Enum.valueOf(Style.class, str);
        }

        public static Style[] values() {
            return (Style[]) f288804b.clone();
        }
    }

    public ApiBookingsListV5FiltersDisplaying(@l String str, @l Style style, @l String str2) {
        this.buttonTitle = str;
        this.style = style;
        this.title = str2;
    }

    @l
    /* renamed from: a, reason: from getter */
    public final String getButtonTitle() {
        return this.buttonTitle;
    }

    @l
    /* renamed from: b, reason: from getter */
    public final Style getStyle() {
        return this.style;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final String getTitle() {
        return this.title;
    }
}
