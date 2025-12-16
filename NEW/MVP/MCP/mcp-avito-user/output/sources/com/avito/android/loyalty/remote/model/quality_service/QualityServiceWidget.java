package com.avito.android.loyalty.remote.model.quality_service;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.remote.model.text.AttributedText;
import com.google.gson.annotations.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: QualityServiceWidget.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/loyalty/remote/model/quality_service/QualityServiceWidget;", "", "PlatesItem", "a", "b", "Lcom/avito/android/loyalty/remote/model/quality_service/QualityServiceWidget$PlatesItem;", "Lcom/avito/android/loyalty/remote/model/quality_service/QualityServiceWidget$b;", "_avito-discouraged_avito-network_loyalty"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public interface QualityServiceWidget {

    /* compiled from: QualityServiceWidget.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u000fB!\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR\"\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lcom/avito/android/loyalty/remote/model/quality_service/QualityServiceWidget$PlatesItem;", "Lcom/avito/android/loyalty/remote/model/quality_service/QualityServiceWidget;", "Lcom/avito/android/loyalty/remote/model/quality_service/QualityServiceWidget$a;", BeduinPromoBlockModel.SERIALIZED_NAME_STYLE, "", "Lcom/avito/android/loyalty/remote/model/quality_service/QualityServiceWidget$PlatesItem$PlateItem;", "items", "<init>", "(Lcom/avito/android/loyalty/remote/model/quality_service/QualityServiceWidget$a;Ljava/util/List;)V", "Lcom/avito/android/loyalty/remote/model/quality_service/QualityServiceWidget$a;", "b", "()Lcom/avito/android/loyalty/remote/model/quality_service/QualityServiceWidget$a;", "Ljava/util/List;", "a", "()Ljava/util/List;", "PlateItem", "_avito-discouraged_avito-network_loyalty"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class PlatesItem implements QualityServiceWidget {

        @c("items")
        @l
        private final List<PlateItem> items;

        @c(BeduinPromoBlockModel.SERIALIZED_NAME_STYLE)
        @l
        private final a style;

        /* compiled from: QualityServiceWidget.kt */
        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0013B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Lcom/avito/android/loyalty/remote/model/quality_service/QualityServiceWidget$PlatesItem$PlateItem;", "", "", "title", "Lcom/avito/android/loyalty/remote/model/quality_service/QualityServiceWidget$PlatesItem$PlateItem$Color;", "color", "Lcom/avito/android/remote/model/text/AttributedText;", "subtitle", "<init>", "(Ljava/lang/String;Lcom/avito/android/loyalty/remote/model/quality_service/QualityServiceWidget$PlatesItem$PlateItem$Color;Lcom/avito/android/remote/model/text/AttributedText;)V", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "Lcom/avito/android/loyalty/remote/model/quality_service/QualityServiceWidget$PlatesItem$PlateItem$Color;", "a", "()Lcom/avito/android/loyalty/remote/model/quality_service/QualityServiceWidget$PlatesItem$PlateItem$Color;", "Lcom/avito/android/remote/model/text/AttributedText;", "b", "()Lcom/avito/android/remote/model/text/AttributedText;", "Color", "_avito-discouraged_avito-network_loyalty"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class PlateItem {

            @c("color")
            @l
            private final Color color;

            @c("subtitle")
            @l
            private final AttributedText subtitle;

            @c("title")
            @l
            private final String title;

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            /* compiled from: QualityServiceWidget.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/loyalty/remote/model/quality_service/QualityServiceWidget$PlatesItem$PlateItem$Color;", "", "(Ljava/lang/String;I)V", "DEFAULT", "RED", "YELLOW", "GREEN", "_avito-discouraged_avito-network_loyalty"}, k = 1, mv = {1, 9, 0}, xi = 48)
            public static final class Color {

                @c("default")
                public static final Color DEFAULT;

                @c("green")
                public static final Color GREEN;

                @c("red")
                public static final Color RED;

                @c("yellow")
                public static final Color YELLOW;

                /* renamed from: b, reason: collision with root package name */
                public static final /* synthetic */ Color[] f183243b;

                /* renamed from: c, reason: collision with root package name */
                public static final /* synthetic */ kotlin.enums.a f183244c;

                static {
                    Color color = new Color("DEFAULT", 0);
                    DEFAULT = color;
                    Color color2 = new Color("RED", 1);
                    RED = color2;
                    Color color3 = new Color("YELLOW", 2);
                    YELLOW = color3;
                    Color color4 = new Color("GREEN", 3);
                    GREEN = color4;
                    Color[] colorArr = {color, color2, color3, color4};
                    f183243b = colorArr;
                    f183244c = kotlin.enums.c.a(colorArr);
                }

                private Color(String str, int i12) {
                }

                public static Color valueOf(String str) {
                    return (Color) Enum.valueOf(Color.class, str);
                }

                public static Color[] values() {
                    return (Color[]) f183243b.clone();
                }
            }

            public PlateItem(@l String str, @l Color color, @l AttributedText attributedText) {
                this.title = str;
                this.color = color;
                this.subtitle = attributedText;
            }

            @l
            /* renamed from: a, reason: from getter */
            public final Color getColor() {
                return this.color;
            }

            @l
            /* renamed from: b, reason: from getter */
            public final AttributedText getSubtitle() {
                return this.subtitle;
            }

            @l
            /* renamed from: c, reason: from getter */
            public final String getTitle() {
                return this.title;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof PlateItem)) {
                    return false;
                }
                PlateItem plateItem = (PlateItem) obj;
                return L.f(this.title, plateItem.title) && this.color == plateItem.color && L.f(this.subtitle, plateItem.subtitle);
            }

            public final int hashCode() {
                String str = this.title;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                Color color = this.color;
                int iHashCode2 = (iHashCode + (color == null ? 0 : color.hashCode())) * 31;
                AttributedText attributedText = this.subtitle;
                return iHashCode2 + (attributedText != null ? attributedText.hashCode() : 0);
            }

            @k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("PlateItem(title=");
                sb2.append(this.title);
                sb2.append(", color=");
                sb2.append(this.color);
                sb2.append(", subtitle=");
                return com.avito.android.actions_sheet.a.w(sb2, this.subtitle, ')');
            }
        }

        public PlatesItem(@l a aVar, @l List<PlateItem> list) {
            this.style = aVar;
            this.items = list;
        }

        @l
        public final List<PlateItem> a() {
            return this.items;
        }

        @l
        /* renamed from: b, reason: from getter */
        public final a getStyle() {
            return this.style;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PlatesItem)) {
                return false;
            }
            PlatesItem platesItem = (PlatesItem) obj;
            return L.f(this.style, platesItem.style) && L.f(this.items, platesItem.items);
        }

        public final int hashCode() {
            a aVar = this.style;
            int iHashCode = (aVar == null ? 0 : aVar.hashCode()) * 31;
            List<PlateItem> list = this.items;
            return iHashCode + (list != null ? list.hashCode() : 0);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("PlatesItem(style=");
            sb2.append(this.style);
            sb2.append(", items=");
            return H.p(sb2, this.items, ')');
        }
    }

    /* compiled from: QualityServiceWidget.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/avito/android/loyalty/remote/model/quality_service/QualityServiceWidget$a;", "", "", "marginBottom", "<init>", "(I)V", "I", "a", "()I", "_avito-discouraged_avito-network_loyalty"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a {

        @c("marginBottom")
        private final int marginBottom;

        public a(int i12) {
            this.marginBottom = i12;
        }

        /* renamed from: a, reason: from getter */
        public final int getMarginBottom() {
            return this.marginBottom;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.marginBottom == ((a) obj).marginBottom;
        }

        public final int hashCode() {
            return Integer.hashCode(this.marginBottom);
        }

        @k
        public final String toString() {
            return r.t(new StringBuilder("Style(marginBottom="), this.marginBottom, ')');
        }
    }

    /* compiled from: QualityServiceWidget.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/avito/android/loyalty/remote/model/quality_service/QualityServiceWidget$b;", "Lcom/avito/android/loyalty/remote/model/quality_service/QualityServiceWidget;", "Lcom/avito/android/loyalty/remote/model/quality_service/QualityServiceWidget$a;", BeduinPromoBlockModel.SERIALIZED_NAME_STYLE, "Lcom/avito/android/remote/model/text/AttributedText;", "content", "<init>", "(Lcom/avito/android/loyalty/remote/model/quality_service/QualityServiceWidget$a;Lcom/avito/android/remote/model/text/AttributedText;)V", "Lcom/avito/android/loyalty/remote/model/quality_service/QualityServiceWidget$a;", "b", "()Lcom/avito/android/loyalty/remote/model/quality_service/QualityServiceWidget$a;", "Lcom/avito/android/remote/model/text/AttributedText;", "a", "()Lcom/avito/android/remote/model/text/AttributedText;", "_avito-discouraged_avito-network_loyalty"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b implements QualityServiceWidget {

        @c("content")
        @l
        private final AttributedText content;

        @c(BeduinPromoBlockModel.SERIALIZED_NAME_STYLE)
        @l
        private final a style;

        public b(@l a aVar, @l AttributedText attributedText) {
            this.style = aVar;
            this.content = attributedText;
        }

        @l
        /* renamed from: a, reason: from getter */
        public final AttributedText getContent() {
            return this.content;
        }

        @l
        /* renamed from: b, reason: from getter */
        public final a getStyle() {
            return this.style;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return L.f(this.style, bVar.style) && L.f(this.content, bVar.content);
        }

        public final int hashCode() {
            a aVar = this.style;
            int iHashCode = (aVar == null ? 0 : aVar.hashCode()) * 31;
            AttributedText attributedText = this.content;
            return iHashCode + (attributedText != null ? attributedText.hashCode() : 0);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("TextItem(style=");
            sb2.append(this.style);
            sb2.append(", content=");
            return com.avito.android.actions_sheet.a.w(sb2, this.content, ')');
        }
    }
}
