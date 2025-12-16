package com.avito.android.trx_promo_impl.generated.api.api_trx_promo_configure_v_7;

import Y61.k;
import Y61.l;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.remote.model.text.AttributedText;
import com.google.gson.annotations.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.enums.a;

/* compiled from: ApiTrxPromoConfigureV7Response.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\u0018\u00002\u00020\u0001:\u0001\u0019B1\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fR\"\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Lcom/avito/android/trx_promo_impl/generated/api/api_trx_promo_configure_v_7/OkResponseSuccessOkBanner;", "", "", "Lcom/avito/android/trx_promo_impl/generated/api/api_trx_promo_configure_v_7/OkResponseSuccessOkBannerButtonsItem;", "buttons", "Lcom/avito/android/remote/model/text/AttributedText;", "description", "Lcom/avito/android/trx_promo_impl/generated/api/api_trx_promo_configure_v_7/OkResponseSuccessOkBanner$Style;", BeduinPromoBlockModel.SERIALIZED_NAME_STYLE, "", "title", "<init>", "(Ljava/util/List;Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/trx_promo_impl/generated/api/api_trx_promo_configure_v_7/OkResponseSuccessOkBanner$Style;Ljava/lang/String;)V", "Ljava/util/List;", "a", "()Ljava/util/List;", "Lcom/avito/android/remote/model/text/AttributedText;", "b", "()Lcom/avito/android/remote/model/text/AttributedText;", "Lcom/avito/android/trx_promo_impl/generated/api/api_trx_promo_configure_v_7/OkResponseSuccessOkBanner$Style;", "c", "()Lcom/avito/android/trx_promo_impl/generated/api/api_trx_promo_configure_v_7/OkResponseSuccessOkBanner$Style;", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "Style", "_avito_trx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class OkResponseSuccessOkBanner {

    @c("buttons")
    @l
    private final List<OkResponseSuccessOkBannerButtonsItem> buttons;

    @c("description")
    @l
    private final AttributedText description;

    @c(BeduinPromoBlockModel.SERIALIZED_NAME_STYLE)
    @k
    private final Style style;

    @c("title")
    @k
    private final String title;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ApiTrxPromoConfigureV7Response.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\r\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Lcom/avito/android/trx_promo_impl/generated/api/api_trx_promo_configure_v_7/OkResponseSuccessOkBanner$Style;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Beige", "Blue", "Default", "Green", "Orange", "Red", "Violet", "Warmgray", "White", "_avito_trx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Style {

        @c("beige")
        public static final Style Beige;

        @c("blue")
        public static final Style Blue;

        @c("default")
        public static final Style Default;

        @c("green")
        public static final Style Green;

        @c("orange")
        public static final Style Orange;

        @c("red")
        public static final Style Red;

        @c("violet")
        public static final Style Violet;

        @c("warmgray")
        public static final Style Warmgray;

        @c("white")
        public static final Style White;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ Style[] f304187c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ a f304188d;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f304189b;

        static {
            Style style = new Style("Beige", 0, "beige");
            Beige = style;
            Style style2 = new Style("Blue", 1, "blue");
            Blue = style2;
            Style style3 = new Style("Default", 2, "default");
            Default = style3;
            Style style4 = new Style("Green", 3, "green");
            Green = style4;
            Style style5 = new Style("Orange", 4, "orange");
            Orange = style5;
            Style style6 = new Style("Red", 5, "red");
            Red = style6;
            Style style7 = new Style("Violet", 6, "violet");
            Violet = style7;
            Style style8 = new Style("Warmgray", 7, "warmgray");
            Warmgray = style8;
            Style style9 = new Style("White", 8, "white");
            White = style9;
            Style[] styleArr = {style, style2, style3, style4, style5, style6, style7, style8, style9};
            f304187c = styleArr;
            f304188d = kotlin.enums.c.a(styleArr);
        }

        private Style(String str, int i12, String str2) {
            this.f304189b = str2;
        }

        public static Style valueOf(String str) {
            return (Style) Enum.valueOf(Style.class, str);
        }

        public static Style[] values() {
            return (Style[]) f304187c.clone();
        }
    }

    public OkResponseSuccessOkBanner(@l List<OkResponseSuccessOkBannerButtonsItem> list, @l AttributedText attributedText, @k Style style, @k String str) {
        this.buttons = list;
        this.description = attributedText;
        this.style = style;
        this.title = str;
    }

    @l
    public final List<OkResponseSuccessOkBannerButtonsItem> a() {
        return this.buttons;
    }

    @l
    /* renamed from: b, reason: from getter */
    public final AttributedText getDescription() {
        return this.description;
    }

    @k
    /* renamed from: c, reason: from getter */
    public final Style getStyle() {
        return this.style;
    }

    @k
    /* renamed from: d, reason: from getter */
    public final String getTitle() {
        return this.title;
    }
}
