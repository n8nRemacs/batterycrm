package com.avito.android.short_term_rent.generated.api.api_1_str_booking_form_get;

import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.AdvertDetailsBlockIdKt;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.remote.model.text.TooltipAttribute;
import java.util.List;
import jw0.C42435b;
import jw0.C42437d;
import jw0.C42438e;
import jw0.q;
import jw0.s;
import kotlin.Metadata;

/* compiled from: Api1StrBookingFormGetResponse.kt */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0011\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0082\u0001\u0011\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#¨\u0006$"}, d2 = {"Lcom/avito/android/short_term_rent/generated/api/api_1_str_booking_form_get/BookingFormPageBlock;", "", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "BookingFormBlockToggleV2", "p", "Lcom/avito/android/short_term_rent/generated/api/api_1_str_booking_form_get/BookingFormPageBlock$a;", "Lcom/avito/android/short_term_rent/generated/api/api_1_str_booking_form_get/BookingFormPageBlock$b;", "Lcom/avito/android/short_term_rent/generated/api/api_1_str_booking_form_get/BookingFormPageBlock$c;", "Lcom/avito/android/short_term_rent/generated/api/api_1_str_booking_form_get/BookingFormPageBlock$d;", "Lcom/avito/android/short_term_rent/generated/api/api_1_str_booking_form_get/BookingFormPageBlock$e;", "Lcom/avito/android/short_term_rent/generated/api/api_1_str_booking_form_get/BookingFormPageBlock$f;", "Lcom/avito/android/short_term_rent/generated/api/api_1_str_booking_form_get/BookingFormPageBlock$g;", "Lcom/avito/android/short_term_rent/generated/api/api_1_str_booking_form_get/BookingFormPageBlock$h;", "Lcom/avito/android/short_term_rent/generated/api/api_1_str_booking_form_get/BookingFormPageBlock$i;", "Lcom/avito/android/short_term_rent/generated/api/api_1_str_booking_form_get/BookingFormPageBlock$j;", "Lcom/avito/android/short_term_rent/generated/api/api_1_str_booking_form_get/BookingFormPageBlock$k;", "Lcom/avito/android/short_term_rent/generated/api/api_1_str_booking_form_get/BookingFormPageBlock$l;", "Lcom/avito/android/short_term_rent/generated/api/api_1_str_booking_form_get/BookingFormPageBlock$m;", "Lcom/avito/android/short_term_rent/generated/api/api_1_str_booking_form_get/BookingFormPageBlock$n;", "Lcom/avito/android/short_term_rent/generated/api/api_1_str_booking_form_get/BookingFormPageBlock$o;", "Lcom/avito/android/short_term_rent/generated/api/api_1_str_booking_form_get/BookingFormPageBlock$BookingFormBlockToggleV2;", "Lcom/avito/android/short_term_rent/generated/api/api_1_str_booking_form_get/BookingFormPageBlock$p;", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface BookingFormPageBlock {

    /* compiled from: Api1StrBookingFormGetResponse.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\u0018\u00002\u00020\u0001:\u0002\u001e\u001fB9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006 "}, d2 = {"Lcom/avito/android/short_term_rent/generated/api/api_1_str_booking_form_get/BookingFormPageBlock$BookingFormBlockToggleV2;", "Lcom/avito/android/short_term_rent/generated/api/api_1_str_booking_form_get/BookingFormPageBlock;", "", "id", "", "needFormReload", "", "Ljw0/g;", "options", "Lcom/avito/android/short_term_rent/generated/api/api_1_str_booking_form_get/BookingFormPageBlock$BookingFormBlockToggleV2$Size;", "size", "Lcom/avito/android/short_term_rent/generated/api/api_1_str_booking_form_get/BookingFormPageBlock$BookingFormBlockToggleV2$Variant;", "variant", "<init>", "(Ljava/lang/String;ZLjava/util/List;Lcom/avito/android/short_term_rent/generated/api/api_1_str_booking_form_get/BookingFormPageBlock$BookingFormBlockToggleV2$Size;Lcom/avito/android/short_term_rent/generated/api/api_1_str_booking_form_get/BookingFormPageBlock$BookingFormBlockToggleV2$Variant;)V", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Z", "b", "()Z", "Ljava/util/List;", "c", "()Ljava/util/List;", "Lcom/avito/android/short_term_rent/generated/api/api_1_str_booking_form_get/BookingFormPageBlock$BookingFormBlockToggleV2$Size;", "getSize", "()Lcom/avito/android/short_term_rent/generated/api/api_1_str_booking_form_get/BookingFormPageBlock$BookingFormBlockToggleV2$Size;", "Lcom/avito/android/short_term_rent/generated/api/api_1_str_booking_form_get/BookingFormPageBlock$BookingFormBlockToggleV2$Variant;", "getVariant", "()Lcom/avito/android/short_term_rent/generated/api/api_1_str_booking_form_get/BookingFormPageBlock$BookingFormBlockToggleV2$Variant;", "Size", "Variant", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class BookingFormBlockToggleV2 implements BookingFormPageBlock {

        @com.google.gson.annotations.c("id")
        @Y61.k
        private final String id;

        @com.google.gson.annotations.c("needFormReload")
        private final boolean needFormReload;

        @com.google.gson.annotations.c("options")
        @Y61.k
        private final List<jw0.g> options;

        @com.google.gson.annotations.c("size")
        @Y61.l
        private final Size size;

        @com.google.gson.annotations.c("variant")
        @Y61.l
        private final Variant variant;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: Api1StrBookingFormGetResponse.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/avito/android/short_term_rent/generated/api/api_1_str_booking_form_get/BookingFormPageBlock$BookingFormBlockToggleV2$Size;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Xs", "S", "M", "L", "Xl", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Size {

            /* renamed from: L, reason: collision with root package name */
            @com.google.gson.annotations.c("l")
            public static final Size f282361L;

            /* renamed from: M, reason: collision with root package name */
            @com.google.gson.annotations.c("m")
            public static final Size f282362M;

            /* renamed from: S, reason: collision with root package name */
            @com.google.gson.annotations.c("s")
            public static final Size f282363S;

            /* renamed from: Xl, reason: collision with root package name */
            @com.google.gson.annotations.c("xl")
            public static final Size f282364Xl;

            /* renamed from: Xs, reason: collision with root package name */
            @com.google.gson.annotations.c("xs")
            public static final Size f282365Xs;

            /* renamed from: b, reason: collision with root package name */
            public static final /* synthetic */ Size[] f282366b;

            /* renamed from: c, reason: collision with root package name */
            public static final /* synthetic */ kotlin.enums.a f282367c;

            static {
                Size size = new Size("Xs", 0, "xs");
                f282365Xs = size;
                Size size2 = new Size("S", 1, "s");
                f282363S = size2;
                Size size3 = new Size("M", 2, "m");
                f282362M = size3;
                Size size4 = new Size("L", 3, "l");
                f282361L = size4;
                Size size5 = new Size("Xl", 4, "xl");
                f282364Xl = size5;
                Size[] sizeArr = {size, size2, size3, size4, size5};
                f282366b = sizeArr;
                f282367c = kotlin.enums.c.a(sizeArr);
            }

            private Size(String str, int i12, String str2) {
            }

            public static Size valueOf(String str) {
                return (Size) Enum.valueOf(Size.class, str);
            }

            public static Size[] values() {
                return (Size[]) f282366b.clone();
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: Api1StrBookingFormGetResponse.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/short_term_rent/generated/api/api_1_str_booking_form_get/BookingFormPageBlock$BookingFormBlockToggleV2$Variant;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Default", "NoAccent", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Variant {

            @com.google.gson.annotations.c("default")
            public static final Variant Default;

            @com.google.gson.annotations.c("noAccent")
            public static final Variant NoAccent;

            /* renamed from: b, reason: collision with root package name */
            public static final /* synthetic */ Variant[] f282368b;

            /* renamed from: c, reason: collision with root package name */
            public static final /* synthetic */ kotlin.enums.a f282369c;

            static {
                Variant variant = new Variant("Default", 0, "default");
                Default = variant;
                Variant variant2 = new Variant("NoAccent", 1, "noAccent");
                NoAccent = variant2;
                Variant[] variantArr = {variant, variant2};
                f282368b = variantArr;
                f282369c = kotlin.enums.c.a(variantArr);
            }

            private Variant(String str, int i12, String str2) {
            }

            public static Variant valueOf(String str) {
                return (Variant) Enum.valueOf(Variant.class, str);
            }

            public static Variant[] values() {
                return (Variant[]) f282368b.clone();
            }
        }

        public BookingFormBlockToggleV2(@Y61.k String str, boolean z12, @Y61.k List<jw0.g> list, @Y61.l Size size, @Y61.l Variant variant) {
            this.id = str;
            this.needFormReload = z12;
            this.options = list;
            this.size = size;
            this.variant = variant;
        }

        @Y61.k
        /* renamed from: a, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* renamed from: b, reason: from getter */
        public final boolean getNeedFormReload() {
            return this.needFormReload;
        }

        @Y61.k
        public final List<jw0.g> c() {
            return this.options;
        }
    }

    /* compiled from: Api1StrBookingFormGetResponse.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\n\u001a\u0004\b\r\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\n\u001a\u0004\b\u000e\u0010\fR\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/avito/android/short_term_rent/generated/api/api_1_str_booking_form_get/BookingFormPageBlock$a;", "Lcom/avito/android/short_term_rent/generated/api/api_1_str_booking_form_get/BookingFormPageBlock;", "", "darkImageUrl", "id", "lightImageUrl", "Lcom/avito/android/remote/model/text/AttributedText;", "title", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/text/AttributedText;)V", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "b", "c", "Lcom/avito/android/remote/model/text/AttributedText;", "d", "()Lcom/avito/android/remote/model/text/AttributedText;", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements BookingFormPageBlock {

        @com.google.gson.annotations.c("darkImageUrl")
        @Y61.k
        private final String darkImageUrl;

        @com.google.gson.annotations.c("id")
        @Y61.k
        private final String id;

        @com.google.gson.annotations.c("lightImageUrl")
        @Y61.k
        private final String lightImageUrl;

        @com.google.gson.annotations.c("title")
        @Y61.k
        private final AttributedText title;

        public a(@Y61.k String str, @Y61.k String str2, @Y61.k String str3, @Y61.k AttributedText attributedText) {
            this.darkImageUrl = str;
            this.id = str2;
            this.lightImageUrl = str3;
            this.title = attributedText;
        }

        @Y61.k
        /* renamed from: a, reason: from getter */
        public final String getDarkImageUrl() {
            return this.darkImageUrl;
        }

        @Y61.k
        /* renamed from: b, reason: from getter */
        public final String getId() {
            return this.id;
        }

        @Y61.k
        /* renamed from: c, reason: from getter */
        public final String getLightImageUrl() {
            return this.lightImageUrl;
        }

        @Y61.k
        /* renamed from: d, reason: from getter */
        public final AttributedText getTitle() {
            return this.title;
        }
    }

    /* compiled from: Api1StrBookingFormGetResponse.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0018\u0018\u00002\u00020\u0001BS\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001c\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0017\u001a\u0004\b\u001d\u0010\u0019R\u001a\u0010\f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0017\u001a\u0004\b!\u0010\u0019R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0017\u001a\u0004\b\"\u0010\u0019¨\u0006#"}, d2 = {"Lcom/avito/android/short_term_rent/generated/api/api_1_str_booking_form_get/BookingFormPageBlock$b;", "Lcom/avito/android/short_term_rent/generated/api/api_1_str_booking_form_get/BookingFormPageBlock;", "Ljw0/d;", "clickstream", "Lcom/avito/android/deep_linking/links/DeepLink;", ContextActionHandler.Link.DEEPLINK, "", "id", "Lcom/avito/android/short_term_rent/generated/api/api_1_str_booking_form_get/BookingFormBlockButtonParameters;", AdvertDetailsBlockIdKt.BLOCK_ID_PARAMETERS, BeduinPromoBlockModel.SERIALIZED_NAME_STYLE, "Lcom/avito/android/remote/model/text/AttributedText;", "title", "titleString", TooltipAttribute.PARAM_DEEP_LINK, "<init>", "(Ljw0/d;Lcom/avito/android/deep_linking/links/DeepLink;Ljava/lang/String;Lcom/avito/android/short_term_rent/generated/api/api_1_str_booking_form_get/BookingFormBlockButtonParameters;Ljava/lang/String;Lcom/avito/android/remote/model/text/AttributedText;Ljava/lang/String;Ljava/lang/String;)V", "Ljw0/d;", "a", "()Ljw0/d;", "Lcom/avito/android/deep_linking/links/DeepLink;", "b", "()Lcom/avito/android/deep_linking/links/DeepLink;", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "Lcom/avito/android/short_term_rent/generated/api/api_1_str_booking_form_get/BookingFormBlockButtonParameters;", "getParameters", "()Lcom/avito/android/short_term_rent/generated/api/api_1_str_booking_form_get/BookingFormBlockButtonParameters;", "getStyle", "Lcom/avito/android/remote/model/text/AttributedText;", "getTitle", "()Lcom/avito/android/remote/model/text/AttributedText;", "getTitleString", "getUri", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b implements BookingFormPageBlock {

        @com.google.gson.annotations.c("clickstream")
        @Y61.l
        private final C42437d clickstream;

        @com.google.gson.annotations.c(ContextActionHandler.Link.DEEPLINK)
        @Y61.l
        private final DeepLink deepLink;

        @com.google.gson.annotations.c("id")
        @Y61.k
        private final String id;

        @com.google.gson.annotations.c(AdvertDetailsBlockIdKt.BLOCK_ID_PARAMETERS)
        @Y61.l
        private final BookingFormBlockButtonParameters parameters;

        @com.google.gson.annotations.c(BeduinPromoBlockModel.SERIALIZED_NAME_STYLE)
        @Y61.l
        private final String style;

        @com.google.gson.annotations.c("title")
        @Y61.k
        private final AttributedText title;

        @com.google.gson.annotations.c("titleString")
        @Y61.l
        private final String titleString;

        @com.google.gson.annotations.c(TooltipAttribute.PARAM_DEEP_LINK)
        @Y61.l
        private final String uri;

        public b(@Y61.l C42437d c42437d, @Y61.l DeepLink deepLink, @Y61.k String str, @Y61.l BookingFormBlockButtonParameters bookingFormBlockButtonParameters, @Y61.l String str2, @Y61.k AttributedText attributedText, @Y61.l String str3, @Y61.l String str4) {
            this.clickstream = c42437d;
            this.deepLink = deepLink;
            this.id = str;
            this.parameters = bookingFormBlockButtonParameters;
            this.style = str2;
            this.title = attributedText;
            this.titleString = str3;
            this.uri = str4;
        }

        @Y61.l
        /* renamed from: a, reason: from getter */
        public final C42437d getClickstream() {
            return this.clickstream;
        }

        @Y61.l
        /* renamed from: b, reason: from getter */
        public final DeepLink getDeepLink() {
            return this.deepLink;
        }

        @Y61.k
        /* renamed from: c, reason: from getter */
        public final String getId() {
            return this.id;
        }
    }

    /* compiled from: Api1StrBookingFormGetResponse.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0012\u0018\u00002\u00020\u0001B3\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\fR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\n\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0013\u001a\u0004\b\u0019\u0010\u0015¨\u0006\u001a"}, d2 = {"Lcom/avito/android/short_term_rent/generated/api/api_1_str_booking_form_get/BookingFormPageBlock$c;", "Lcom/avito/android/short_term_rent/generated/api/api_1_str_booking_form_get/BookingFormPageBlock;", "Lcom/avito/android/deep_linking/links/DeepLink;", ContextActionHandler.Link.DEEPLINK, "", "id", "Lcom/avito/android/remote/model/text/AttributedText;", "left", "", "leftWidthPercent", "right", "<init>", "(Lcom/avito/android/deep_linking/links/DeepLink;Ljava/lang/String;Lcom/avito/android/remote/model/text/AttributedText;Ljava/lang/Long;Lcom/avito/android/remote/model/text/AttributedText;)V", "Lcom/avito/android/deep_linking/links/DeepLink;", "a", "()Lcom/avito/android/deep_linking/links/DeepLink;", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "Lcom/avito/android/remote/model/text/AttributedText;", "c", "()Lcom/avito/android/remote/model/text/AttributedText;", "Ljava/lang/Long;", "getLeftWidthPercent", "()Ljava/lang/Long;", "d", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c implements BookingFormPageBlock {

        @com.google.gson.annotations.c(ContextActionHandler.Link.DEEPLINK)
        @Y61.l
        private final DeepLink deepLink;

        @com.google.gson.annotations.c("id")
        @Y61.k
        private final String id;

        @com.google.gson.annotations.c("left")
        @Y61.k
        private final AttributedText left;

        @com.google.gson.annotations.c("leftWidthPercent")
        @Y61.l
        private final Long leftWidthPercent;

        @com.google.gson.annotations.c("right")
        @Y61.k
        private final AttributedText right;

        public c(@Y61.l DeepLink deepLink, @Y61.k String str, @Y61.k AttributedText attributedText, @Y61.l Long l12, @Y61.k AttributedText attributedText2) {
            this.deepLink = deepLink;
            this.id = str;
            this.left = attributedText;
            this.leftWidthPercent = l12;
            this.right = attributedText2;
        }

        @Y61.l
        /* renamed from: a, reason: from getter */
        public final DeepLink getDeepLink() {
            return this.deepLink;
        }

        @Y61.k
        /* renamed from: b, reason: from getter */
        public final String getId() {
            return this.id;
        }

        @Y61.k
        /* renamed from: c, reason: from getter */
        public final AttributedText getLeft() {
            return this.left;
        }

        @Y61.k
        /* renamed from: d, reason: from getter */
        public final AttributedText getRight() {
            return this.right;
        }
    }

    /* compiled from: Api1StrBookingFormGetResponse.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001B+\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\n\u001a\u0004\b\r\u0010\fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\n\u001a\u0004\b\u000e\u0010\fR\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/avito/android/short_term_rent/generated/api/api_1_str_booking_form_get/BookingFormPageBlock$d;", "Lcom/avito/android/short_term_rent/generated/api/api_1_str_booking_form_get/BookingFormPageBlock;", "", "darkImageUrl", "id", "lightImageUrl", "Lcom/avito/android/remote/model/text/AttributedText;", "text", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/text/AttributedText;)V", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "b", "c", "Lcom/avito/android/remote/model/text/AttributedText;", "d", "()Lcom/avito/android/remote/model/text/AttributedText;", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class d implements BookingFormPageBlock {

        @com.google.gson.annotations.c("darkImageUrl")
        @Y61.l
        private final String darkImageUrl;

        @com.google.gson.annotations.c("id")
        @Y61.k
        private final String id;

        @com.google.gson.annotations.c("lightImageUrl")
        @Y61.l
        private final String lightImageUrl;

        @com.google.gson.annotations.c("text")
        @Y61.k
        private final AttributedText text;

        public d(@Y61.l String str, @Y61.k String str2, @Y61.l String str3, @Y61.k AttributedText attributedText) {
            this.darkImageUrl = str;
            this.id = str2;
            this.lightImageUrl = str3;
            this.text = attributedText;
        }

        @Y61.l
        /* renamed from: a, reason: from getter */
        public final String getDarkImageUrl() {
            return this.darkImageUrl;
        }

        @Y61.k
        /* renamed from: b, reason: from getter */
        public final String getId() {
            return this.id;
        }

        @Y61.l
        /* renamed from: c, reason: from getter */
        public final String getLightImageUrl() {
            return this.lightImageUrl;
        }

        @Y61.k
        /* renamed from: d, reason: from getter */
        public final AttributedText getText() {
            return this.text;
        }
    }

    /* compiled from: Api1StrBookingFormGetResponse.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0018\u0018\u00002\u00020\u0001Bg\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u000f\u001a\u00020\t\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0011\u0010\u0012R\"\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0007\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0016\u001a\u0004\b\u0019\u0010\u0018R\u001a\u0010\b\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0016\u001a\u0004\b\u001a\u0010\u0018R\u001a\u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010\u000b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u001b\u001a\u0004\b\u000b\u0010\u001dR\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u001e\u001a\u0004\b!\u0010 R\u001a\u0010\u000f\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u001b\u001a\u0004\b\"\u0010\u001dR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0016\u001a\u0004\b#\u0010\u0018¨\u0006$"}, d2 = {"Lcom/avito/android/short_term_rent/generated/api/api_1_str_booking_form_get/BookingFormPageBlock$e;", "Lcom/avito/android/short_term_rent/generated/api/api_1_str_booking_form_get/BookingFormPageBlock;", "", "Ljw0/n;", "constraints", "", "hint", "id", "inputType", "", "isEnabled", "isRequired", "", "maxLines", "minLines", "needFormReload", "value", "<init>", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/Long;Ljava/lang/Long;ZLjava/lang/String;)V", "Ljava/util/List;", "a", "()Ljava/util/List;", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "c", "d", "Z", "i", "()Z", "Ljava/lang/Long;", "e", "()Ljava/lang/Long;", "f", "g", "h", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class e implements BookingFormPageBlock {

        @com.google.gson.annotations.c("constraints")
        @Y61.l
        private final List<jw0.n> constraints;

        @com.google.gson.annotations.c("hint")
        @Y61.l
        private final String hint;

        @com.google.gson.annotations.c("id")
        @Y61.k
        private final String id;

        @com.google.gson.annotations.c("inputType")
        @Y61.k
        private final String inputType;

        @com.google.gson.annotations.c("isEnabled")
        private final boolean isEnabled;

        @com.google.gson.annotations.c("isRequired")
        private final boolean isRequired;

        @com.google.gson.annotations.c("maxLines")
        @Y61.l
        private final Long maxLines;

        @com.google.gson.annotations.c("minLines")
        @Y61.l
        private final Long minLines;

        @com.google.gson.annotations.c("needFormReload")
        private final boolean needFormReload;

        @com.google.gson.annotations.c("value")
        @Y61.l
        private final String value;

        public e(@Y61.l List<jw0.n> list, @Y61.l String str, @Y61.k String str2, @Y61.k String str3, boolean z12, boolean z13, @Y61.l Long l12, @Y61.l Long l13, boolean z14, @Y61.l String str4) {
            this.constraints = list;
            this.hint = str;
            this.id = str2;
            this.inputType = str3;
            this.isEnabled = z12;
            this.isRequired = z13;
            this.maxLines = l12;
            this.minLines = l13;
            this.needFormReload = z14;
            this.value = str4;
        }

        @Y61.l
        public final List<jw0.n> a() {
            return this.constraints;
        }

        @Y61.l
        /* renamed from: b, reason: from getter */
        public final String getHint() {
            return this.hint;
        }

        @Y61.k
        /* renamed from: c, reason: from getter */
        public final String getId() {
            return this.id;
        }

        @Y61.k
        /* renamed from: d, reason: from getter */
        public final String getInputType() {
            return this.inputType;
        }

        @Y61.l
        /* renamed from: e, reason: from getter */
        public final Long getMaxLines() {
            return this.maxLines;
        }

        @Y61.l
        /* renamed from: f, reason: from getter */
        public final Long getMinLines() {
            return this.minLines;
        }

        /* renamed from: g, reason: from getter */
        public final boolean getNeedFormReload() {
            return this.needFormReload;
        }

        @Y61.l
        /* renamed from: h, reason: from getter */
        public final String getValue() {
            return this.value;
        }

        /* renamed from: i, reason: from getter */
        public final boolean getIsEnabled() {
            return this.isEnabled;
        }
    }

    /* compiled from: Api1StrBookingFormGetResponse.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u000b\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lcom/avito/android/short_term_rent/generated/api/api_1_str_booking_form_get/BookingFormPageBlock$f;", "Lcom/avito/android/short_term_rent/generated/api/api_1_str_booking_form_get/BookingFormPageBlock;", "Lcom/avito/android/deep_linking/links/DeepLink;", ContextActionHandler.Link.DEEPLINK, "", "id", "Lcom/avito/android/remote/model/Image;", "image", "", "itemId", "Lcom/avito/android/remote/model/text/AttributedText;", "title", "<init>", "(Lcom/avito/android/deep_linking/links/DeepLink;Ljava/lang/String;Lcom/avito/android/remote/model/Image;JLcom/avito/android/remote/model/text/AttributedText;)V", "Lcom/avito/android/deep_linking/links/DeepLink;", "getDeepLink", "()Lcom/avito/android/deep_linking/links/DeepLink;", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Lcom/avito/android/remote/model/Image;", "b", "()Lcom/avito/android/remote/model/Image;", "J", "getItemId", "()J", "Lcom/avito/android/remote/model/text/AttributedText;", "c", "()Lcom/avito/android/remote/model/text/AttributedText;", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class f implements BookingFormPageBlock {

        @com.google.gson.annotations.c(ContextActionHandler.Link.DEEPLINK)
        @Y61.k
        private final DeepLink deepLink;

        @com.google.gson.annotations.c("id")
        @Y61.k
        private final String id;

        @com.google.gson.annotations.c("image")
        @Y61.k
        private final Image image;

        @com.google.gson.annotations.c("itemId")
        private final long itemId;

        @com.google.gson.annotations.c("title")
        @Y61.k
        private final AttributedText title;

        public f(@Y61.k DeepLink deepLink, @Y61.k String str, @Y61.k Image image, long j12, @Y61.k AttributedText attributedText) {
            this.deepLink = deepLink;
            this.id = str;
            this.image = image;
            this.itemId = j12;
            this.title = attributedText;
        }

        @Y61.k
        /* renamed from: a, reason: from getter */
        public final String getId() {
            return this.id;
        }

        @Y61.k
        /* renamed from: b, reason: from getter */
        public final Image getImage() {
            return this.image;
        }

        @Y61.k
        /* renamed from: c, reason: from getter */
        public final AttributedText getTitle() {
            return this.title;
        }
    }

    /* compiled from: Api1StrBookingFormGetResponse.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R \u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lcom/avito/android/short_term_rent/generated/api/api_1_str_booking_form_get/BookingFormPageBlock$g;", "Lcom/avito/android/short_term_rent/generated/api/api_1_str_booking_form_get/BookingFormPageBlock;", "", "default", "", "id", "", "needFormReload", "", "Ljw0/p;", "terms", "<init>", "(JLjava/lang/String;ZLjava/util/List;)V", "J", "a", "()J", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "Z", "getNeedFormReload", "()Z", "Ljava/util/List;", "b", "()Ljava/util/List;", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class g implements BookingFormPageBlock {

        @com.google.gson.annotations.c("default")
        private final long default;

        @com.google.gson.annotations.c("id")
        @Y61.k
        private final String id;

        @com.google.gson.annotations.c("needFormReload")
        private final boolean needFormReload;

        @com.google.gson.annotations.c("terms")
        @Y61.k
        private final List<jw0.p> terms;

        public g(long j12, @Y61.k String str, boolean z12, @Y61.k List<jw0.p> list) {
            this.default = j12;
            this.id = str;
            this.needFormReload = z12;
            this.terms = list;
        }

        /* renamed from: a, reason: from getter */
        public final long getDefault() {
            return this.default;
        }

        @Y61.k
        public final List<jw0.p> b() {
            return this.terms;
        }
    }

    /* compiled from: Api1StrBookingFormGetResponse.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/avito/android/short_term_rent/generated/api/api_1_str_booking_form_get/BookingFormPageBlock$h;", "Lcom/avito/android/short_term_rent/generated/api/api_1_str_booking_form_get/BookingFormPageBlock;", "", "id", "", "Ljw0/q;", "methods", "", "needFormReload", "<init>", "(Ljava/lang/String;Ljava/util/List;Z)V", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Ljava/util/List;", "b", "()Ljava/util/List;", "Z", "c", "()Z", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class h implements BookingFormPageBlock {

        @com.google.gson.annotations.c("id")
        @Y61.k
        private final String id;

        @com.google.gson.annotations.c("methods")
        @Y61.k
        private final List<q> methods;

        @com.google.gson.annotations.c("needFormReload")
        private final boolean needFormReload;

        public h(@Y61.k String str, @Y61.k List<q> list, boolean z12) {
            this.id = str;
            this.methods = list;
            this.needFormReload = z12;
        }

        @Y61.k
        /* renamed from: a, reason: from getter */
        public final String getId() {
            return this.id;
        }

        @Y61.k
        public final List<q> b() {
            return this.methods;
        }

        /* renamed from: c, reason: from getter */
        public final boolean getNeedFormReload() {
            return this.needFormReload;
        }
    }

    /* compiled from: Api1StrBookingFormGetResponse.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R \u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lcom/avito/android/short_term_rent/generated/api/api_1_str_booking_form_get/BookingFormPageBlock$i;", "Lcom/avito/android/short_term_rent/generated/api/api_1_str_booking_form_get/BookingFormPageBlock;", "", "checkedVariantsIndex", "", "id", "", "needFormReload", "", "Ljw0/s;", "variants", "<init>", "(JLjava/lang/String;ZLjava/util/List;)V", "J", "a", "()J", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "Z", "c", "()Z", "Ljava/util/List;", "d", "()Ljava/util/List;", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class i implements BookingFormPageBlock {

        @com.google.gson.annotations.c("checkedVariantsIndex")
        private final long checkedVariantsIndex;

        @com.google.gson.annotations.c("id")
        @Y61.k
        private final String id;

        @com.google.gson.annotations.c("needFormReload")
        private final boolean needFormReload;

        @com.google.gson.annotations.c("variants")
        @Y61.k
        private final List<s> variants;

        public i(long j12, @Y61.k String str, boolean z12, @Y61.k List<s> list) {
            this.checkedVariantsIndex = j12;
            this.id = str;
            this.needFormReload = z12;
            this.variants = list;
        }

        /* renamed from: a, reason: from getter */
        public final long getCheckedVariantsIndex() {
            return this.checkedVariantsIndex;
        }

        @Y61.k
        /* renamed from: b, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* renamed from: c, reason: from getter */
        public final boolean getNeedFormReload() {
            return this.needFormReload;
        }

        @Y61.k
        public final List<s> d() {
            return this.variants;
        }
    }

    /* compiled from: Api1StrBookingFormGetResponse.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\u0018\u00002\u00020\u0001B-\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b\n\u0010\u000bR \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\t\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u000f\u001a\u0004\b\u0015\u0010\u0011¨\u0006\u0016"}, d2 = {"Lcom/avito/android/short_term_rent/generated/api/api_1_str_booking_form_get/BookingFormPageBlock$j;", "Lcom/avito/android/short_term_rent/generated/api/api_1_str_booking_form_get/BookingFormPageBlock;", "", "Ljw0/e;", "buttons", "", "id", "", "needFormReload", "value", "<init>", "(Ljava/util/List;Ljava/lang/String;ZLjava/lang/String;)V", "Ljava/util/List;", "a", "()Ljava/util/List;", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "Z", "c", "()Z", "d", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class j implements BookingFormPageBlock {

        @com.google.gson.annotations.c("buttons")
        @Y61.k
        private final List<C42438e> buttons;

        @com.google.gson.annotations.c("id")
        @Y61.k
        private final String id;

        @com.google.gson.annotations.c("needFormReload")
        private final boolean needFormReload;

        @com.google.gson.annotations.c("value")
        @Y61.k
        private final String value;

        public j(@Y61.k List<C42438e> list, @Y61.k String str, boolean z12, @Y61.k String str2) {
            this.buttons = list;
            this.id = str;
            this.needFormReload = z12;
            this.value = str2;
        }

        @Y61.k
        public final List<C42438e> a() {
            return this.buttons;
        }

        @Y61.k
        /* renamed from: b, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* renamed from: c, reason: from getter */
        public final boolean getNeedFormReload() {
            return this.needFormReload;
        }

        @Y61.k
        /* renamed from: d, reason: from getter */
        public final String getValue() {
            return this.value;
        }
    }

    /* compiled from: Api1StrBookingFormGetResponse.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\u0018\u00002\u00020\u0001B\u001f\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bR\"\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/avito/android/short_term_rent/generated/api/api_1_str_booking_form_get/BookingFormPageBlock$k;", "Lcom/avito/android/short_term_rent/generated/api/api_1_str_booking_form_get/BookingFormPageBlock;", "", "Ljw0/b;", "badges", "", "id", "<init>", "(Ljava/util/List;Ljava/lang/String;)V", "Ljava/util/List;", "a", "()Ljava/util/List;", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class k implements BookingFormPageBlock {

        @com.google.gson.annotations.c("badges")
        @Y61.l
        private final List<C42435b> badges;

        @com.google.gson.annotations.c("id")
        @Y61.k
        private final String id;

        public k(@Y61.l List<C42435b> list, @Y61.k String str) {
            this.badges = list;
            this.id = str;
        }

        @Y61.l
        public final List<C42435b> a() {
            return this.badges;
        }

        @Y61.k
        /* renamed from: b, reason: from getter */
        public final String getId() {
            return this.id;
        }
    }

    /* compiled from: Api1StrBookingFormGetResponse.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0014\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\b\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0014\u001a\u0004\b\b\u0010\u0016R\u001a\u0010\t\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0014\u001a\u0004\b\u0017\u0010\u0016R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0011\u001a\u0004\b\u0018\u0010\u0013R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0011\u001a\u0004\b\u0019\u0010\u0013¨\u0006\u001a"}, d2 = {"Lcom/avito/android/short_term_rent/generated/api/api_1_str_booking_form_get/BookingFormPageBlock$l;", "Lcom/avito/android/short_term_rent/generated/api/api_1_str_booking_form_get/BookingFormPageBlock;", "Lcom/avito/android/deep_linking/links/DeepLink;", ContextActionHandler.Link.DEEPLINK, "", "id", "", "isEnabled", "isRequired", "needFormReload", "text", "value", "<init>", "(Lcom/avito/android/deep_linking/links/DeepLink;Ljava/lang/String;ZZZLjava/lang/String;Ljava/lang/String;)V", "Lcom/avito/android/deep_linking/links/DeepLink;", "a", "()Lcom/avito/android/deep_linking/links/DeepLink;", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "Z", "f", "()Z", "c", "d", "e", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class l implements BookingFormPageBlock {

        @com.google.gson.annotations.c(ContextActionHandler.Link.DEEPLINK)
        @Y61.k
        private final DeepLink deepLink;

        @com.google.gson.annotations.c("id")
        @Y61.k
        private final String id;

        @com.google.gson.annotations.c("isEnabled")
        private final boolean isEnabled;

        @com.google.gson.annotations.c("isRequired")
        private final boolean isRequired;

        @com.google.gson.annotations.c("needFormReload")
        private final boolean needFormReload;

        @com.google.gson.annotations.c("text")
        @Y61.l
        private final String text;

        @com.google.gson.annotations.c("value")
        @Y61.l
        private final String value;

        public l(@Y61.k DeepLink deepLink, @Y61.k String str, boolean z12, boolean z13, boolean z14, @Y61.l String str2, @Y61.l String str3) {
            this.deepLink = deepLink;
            this.id = str;
            this.isEnabled = z12;
            this.isRequired = z13;
            this.needFormReload = z14;
            this.text = str2;
            this.value = str3;
        }

        @Y61.k
        /* renamed from: a, reason: from getter */
        public final DeepLink getDeepLink() {
            return this.deepLink;
        }

        @Y61.k
        /* renamed from: b, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* renamed from: c, reason: from getter */
        public final boolean getNeedFormReload() {
            return this.needFormReload;
        }

        @Y61.l
        /* renamed from: d, reason: from getter */
        public final String getText() {
            return this.text;
        }

        @Y61.l
        /* renamed from: e, reason: from getter */
        public final String getValue() {
            return this.value;
        }

        /* renamed from: f, reason: from getter */
        public final boolean getIsEnabled() {
            return this.isEnabled;
        }
    }

    /* compiled from: Api1StrBookingFormGetResponse.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/avito/android/short_term_rent/generated/api/api_1_str_booking_form_get/BookingFormPageBlock$m;", "Lcom/avito/android/short_term_rent/generated/api/api_1_str_booking_form_get/BookingFormPageBlock;", "", "height", "", "id", "<init>", "(JLjava/lang/String;)V", "J", "a", "()J", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class m implements BookingFormPageBlock {

        @com.google.gson.annotations.c("height")
        private final long height;

        @com.google.gson.annotations.c("id")
        @Y61.k
        private final String id;

        public m(long j12, @Y61.k String str) {
            this.height = j12;
            this.id = str;
        }

        /* renamed from: a, reason: from getter */
        public final long getHeight() {
            return this.height;
        }

        @Y61.k
        /* renamed from: b, reason: from getter */
        public final String getId() {
            return this.id;
        }
    }

    /* compiled from: Api1StrBookingFormGetResponse.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u00002\u00020\u0001B)\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lcom/avito/android/short_term_rent/generated/api/api_1_str_booking_form_get/BookingFormPageBlock$n;", "Lcom/avito/android/short_term_rent/generated/api/api_1_str_booking_form_get/BookingFormPageBlock;", "Lcom/avito/android/deep_linking/links/DeepLink;", ContextActionHandler.Link.DEEPLINK, "", "id", "", "needFormReload", "Lcom/avito/android/remote/model/text/AttributedText;", "text", "<init>", "(Lcom/avito/android/deep_linking/links/DeepLink;Ljava/lang/String;ZLcom/avito/android/remote/model/text/AttributedText;)V", "Lcom/avito/android/deep_linking/links/DeepLink;", "a", "()Lcom/avito/android/deep_linking/links/DeepLink;", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "Z", "getNeedFormReload", "()Z", "Lcom/avito/android/remote/model/text/AttributedText;", "c", "()Lcom/avito/android/remote/model/text/AttributedText;", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class n implements BookingFormPageBlock {

        @com.google.gson.annotations.c(ContextActionHandler.Link.DEEPLINK)
        @Y61.l
        private final DeepLink deepLink;

        @com.google.gson.annotations.c("id")
        @Y61.k
        private final String id;

        @com.google.gson.annotations.c("needFormReload")
        private final boolean needFormReload;

        @com.google.gson.annotations.c("text")
        @Y61.k
        private final AttributedText text;

        public n(@Y61.l DeepLink deepLink, @Y61.k String str, boolean z12, @Y61.k AttributedText attributedText) {
            this.deepLink = deepLink;
            this.id = str;
            this.needFormReload = z12;
            this.text = attributedText;
        }

        @Y61.l
        /* renamed from: a, reason: from getter */
        public final DeepLink getDeepLink() {
            return this.deepLink;
        }

        @Y61.k
        /* renamed from: b, reason: from getter */
        public final String getId() {
            return this.id;
        }

        @Y61.k
        /* renamed from: c, reason: from getter */
        public final AttributedText getText() {
            return this.text;
        }
    }

    /* compiled from: Api1StrBookingFormGetResponse.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/avito/android/short_term_rent/generated/api/api_1_str_booking_form_get/BookingFormPageBlock$o;", "Lcom/avito/android/short_term_rent/generated/api/api_1_str_booking_form_get/BookingFormPageBlock;", "", "id", "", "needFormReload", "", "Ljw0/f;", "options", "<init>", "(Ljava/lang/String;ZLjava/util/List;)V", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Z", "b", "()Z", "Ljava/util/List;", "c", "()Ljava/util/List;", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class o implements BookingFormPageBlock {

        @com.google.gson.annotations.c("id")
        @Y61.k
        private final String id;

        @com.google.gson.annotations.c("needFormReload")
        private final boolean needFormReload;

        @com.google.gson.annotations.c("options")
        @Y61.k
        private final List<jw0.f> options;

        public o(@Y61.k String str, boolean z12, @Y61.k List<jw0.f> list) {
            this.id = str;
            this.needFormReload = z12;
            this.options = list;
        }

        @Y61.k
        /* renamed from: a, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* renamed from: b, reason: from getter */
        public final boolean getNeedFormReload() {
            return this.needFormReload;
        }

        @Y61.k
        public final List<jw0.f> c() {
            return this.options;
        }
    }

    /* compiled from: Api1StrBookingFormGetResponse.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/short_term_rent/generated/api/api_1_str_booking_form_get/BookingFormPageBlock$p;", "Lcom/avito/android/short_term_rent/generated/api/api_1_str_booking_form_get/BookingFormPageBlock;", "<init>", "()V", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class p implements BookingFormPageBlock {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final p f282385a = new p();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof p);
        }

        public final int hashCode() {
            return -3902810;
        }

        @Y61.k
        public final String toString() {
            return "Unknown";
        }
    }
}
