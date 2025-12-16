package com.avito.android.remote.model.inn.items;

import Y61.k;
import Y61.l;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.inn.items.VerificationInnItem;
import com.avito.android.remote.model.text.TooltipAttribute;
import com.google.gson.annotations.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: VerificationButtonGroupItem.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u001bB)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\bHÆ\u0003J1\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u001e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0002\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0016X\u0097\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001c"}, d2 = {"Lcom/avito/android/remote/model/inn/items/VerificationButtonGroupItem;", "Lcom/avito/android/remote/model/inn/items/VerificationInnItem;", "id", "", "buttons", "", "Lcom/avito/android/remote/model/inn/items/VerificationButtonGroupItem$VerificationButton;", BeduinPromoBlockModel.SERIALIZED_NAME_STYLE, "Lcom/avito/android/remote/model/inn/items/VerificationInnItem$Style;", "(Ljava/lang/String;Ljava/util/List;Lcom/avito/android/remote/model/inn/items/VerificationInnItem$Style;)V", "getButtons", "()Ljava/util/List;", "getId", "()Ljava/lang/String;", "getStyle", "()Lcom/avito/android/remote/model/inn/items/VerificationInnItem$Style;", "component1", "component2", "component3", "copy", "equals", "", PluralsKeys.OTHER, "", "hashCode", "", "toString", "VerificationButton", "_avito-discouraged_avito-api_verification"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class VerificationButtonGroupItem implements VerificationInnItem {

    @c("buttons")
    @l
    private final List<VerificationButton> buttons;

    @c("id")
    @k
    private final String id;

    @c(BeduinPromoBlockModel.SERIALIZED_NAME_STYLE)
    @l
    private final VerificationInnItem.Style style;

    public VerificationButtonGroupItem(@k String str, @l List<VerificationButton> list, @l VerificationInnItem.Style style) {
        this.id = str;
        this.buttons = list;
        this.style = style;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ VerificationButtonGroupItem copy$default(VerificationButtonGroupItem verificationButtonGroupItem, String str, List list, VerificationInnItem.Style style, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = verificationButtonGroupItem.id;
        }
        if ((i12 & 2) != 0) {
            list = verificationButtonGroupItem.buttons;
        }
        if ((i12 & 4) != 0) {
            style = verificationButtonGroupItem.style;
        }
        return verificationButtonGroupItem.copy(str, list, style);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @l
    public final List<VerificationButton> component2() {
        return this.buttons;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final VerificationInnItem.Style getStyle() {
        return this.style;
    }

    @k
    public final VerificationButtonGroupItem copy(@k String id2, @l List<VerificationButton> buttons, @l VerificationInnItem.Style style) {
        return new VerificationButtonGroupItem(id2, buttons, style);
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VerificationButtonGroupItem)) {
            return false;
        }
        VerificationButtonGroupItem verificationButtonGroupItem = (VerificationButtonGroupItem) other;
        return L.f(this.id, verificationButtonGroupItem.id) && L.f(this.buttons, verificationButtonGroupItem.buttons) && L.f(this.style, verificationButtonGroupItem.style);
    }

    @l
    public final List<VerificationButton> getButtons() {
        return this.buttons;
    }

    @Override // com.avito.android.remote.model.inn.items.VerificationInnItem
    @k
    public String getId() {
        return this.id;
    }

    @Override // com.avito.android.remote.model.inn.items.VerificationInnItem
    @l
    public VerificationInnItem.Style getStyle() {
        return this.style;
    }

    public int hashCode() {
        int iHashCode = this.id.hashCode() * 31;
        List<VerificationButton> list = this.buttons;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        VerificationInnItem.Style style = this.style;
        return iHashCode2 + (style != null ? style.hashCode() : 0);
    }

    @k
    public String toString() {
        return "VerificationButtonGroupItem(id=" + this.id + ", buttons=" + this.buttons + ", style=" + this.style + ')';
    }

    public /* synthetic */ VerificationButtonGroupItem(String str, List list, VerificationInnItem.Style style, int i12, C42822w c42822w) {
        this(str, list, (i12 & 4) != 0 ? null : style);
    }

    /* compiled from: VerificationButtonGroupItem.kt */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u001fB9\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nJ\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\tHÆ\u0003JE\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006 "}, d2 = {"Lcom/avito/android/remote/model/inn/items/VerificationButtonGroupItem$VerificationButton;", "", "id", "", "iconName", "title", TooltipAttribute.PARAM_DEEP_LINK, "Lcom/avito/android/deep_linking/links/DeepLink;", "buttonStyle", "Lcom/avito/android/remote/model/inn/items/VerificationButtonGroupItem$VerificationButton$Style;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;Lcom/avito/android/remote/model/inn/items/VerificationButtonGroupItem$VerificationButton$Style;)V", "getButtonStyle", "()Lcom/avito/android/remote/model/inn/items/VerificationButtonGroupItem$VerificationButton$Style;", "getIconName", "()Ljava/lang/String;", "getId", "getTitle", "getUri", "()Lcom/avito/android/deep_linking/links/DeepLink;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", PluralsKeys.OTHER, "hashCode", "", "toString", "Style", "_avito-discouraged_avito-api_verification"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class VerificationButton {

        @c(BeduinPromoBlockModel.SERIALIZED_NAME_STYLE)
        @l
        private final Style buttonStyle;

        @c("icon")
        @l
        private final String iconName;

        @c("id")
        @l
        private final String id;

        @c("title")
        @l
        private final String title;

        @c(TooltipAttribute.PARAM_DEEP_LINK)
        @l
        private final DeepLink uri;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: VerificationButtonGroupItem.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/remote/model/inn/items/VerificationButtonGroupItem$VerificationButton$Style;", "", "(Ljava/lang/String;I)V", "DEFAULT", "PRIMARY", "SECONDARY", "_avito-discouraged_avito-api_verification"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Style {
            private static final /* synthetic */ a $ENTRIES;
            private static final /* synthetic */ Style[] $VALUES;

            @c("default")
            public static final Style DEFAULT = new Style("DEFAULT", 0);

            @c("primary")
            public static final Style PRIMARY = new Style("PRIMARY", 1);

            @c("secondary")
            public static final Style SECONDARY = new Style("SECONDARY", 2);

            private static final /* synthetic */ Style[] $values() {
                return new Style[]{DEFAULT, PRIMARY, SECONDARY};
            }

            static {
                Style[] styleArr$values = $values();
                $VALUES = styleArr$values;
                $ENTRIES = kotlin.enums.c.a(styleArr$values);
            }

            private Style(String str, int i12) {
            }

            @k
            public static a<Style> getEntries() {
                return $ENTRIES;
            }

            public static Style valueOf(String str) {
                return (Style) Enum.valueOf(Style.class, str);
            }

            public static Style[] values() {
                return (Style[]) $VALUES.clone();
            }
        }

        public VerificationButton(@l String str, @l String str2, @l String str3, @l DeepLink deepLink, @l Style style) {
            this.id = str;
            this.iconName = str2;
            this.title = str3;
            this.uri = deepLink;
            this.buttonStyle = style;
        }

        public static /* synthetic */ VerificationButton copy$default(VerificationButton verificationButton, String str, String str2, String str3, DeepLink deepLink, Style style, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = verificationButton.id;
            }
            if ((i12 & 2) != 0) {
                str2 = verificationButton.iconName;
            }
            String str4 = str2;
            if ((i12 & 4) != 0) {
                str3 = verificationButton.title;
            }
            String str5 = str3;
            if ((i12 & 8) != 0) {
                deepLink = verificationButton.uri;
            }
            DeepLink deepLink2 = deepLink;
            if ((i12 & 16) != 0) {
                style = verificationButton.buttonStyle;
            }
            return verificationButton.copy(str, str4, str5, deepLink2, style);
        }

        @l
        /* renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        @l
        /* renamed from: component2, reason: from getter */
        public final String getIconName() {
            return this.iconName;
        }

        @l
        /* renamed from: component3, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        @l
        /* renamed from: component4, reason: from getter */
        public final DeepLink getUri() {
            return this.uri;
        }

        @l
        /* renamed from: component5, reason: from getter */
        public final Style getButtonStyle() {
            return this.buttonStyle;
        }

        @k
        public final VerificationButton copy(@l String id2, @l String iconName, @l String title, @l DeepLink uri, @l Style buttonStyle) {
            return new VerificationButton(id2, iconName, title, uri, buttonStyle);
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof VerificationButton)) {
                return false;
            }
            VerificationButton verificationButton = (VerificationButton) other;
            return L.f(this.id, verificationButton.id) && L.f(this.iconName, verificationButton.iconName) && L.f(this.title, verificationButton.title) && L.f(this.uri, verificationButton.uri) && this.buttonStyle == verificationButton.buttonStyle;
        }

        @l
        public final Style getButtonStyle() {
            return this.buttonStyle;
        }

        @l
        public final String getIconName() {
            return this.iconName;
        }

        @l
        public final String getId() {
            return this.id;
        }

        @l
        public final String getTitle() {
            return this.title;
        }

        @l
        public final DeepLink getUri() {
            return this.uri;
        }

        public int hashCode() {
            String str = this.id;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.iconName;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.title;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            DeepLink deepLink = this.uri;
            int iHashCode4 = (iHashCode3 + (deepLink == null ? 0 : deepLink.hashCode())) * 31;
            Style style = this.buttonStyle;
            return iHashCode4 + (style != null ? style.hashCode() : 0);
        }

        @k
        public String toString() {
            return "VerificationButton(id=" + this.id + ", iconName=" + this.iconName + ", title=" + this.title + ", uri=" + this.uri + ", buttonStyle=" + this.buttonStyle + ')';
        }

        public /* synthetic */ VerificationButton(String str, String str2, String str3, DeepLink deepLink, Style style, int i12, C42822w c42822w) {
            this(str, str2, str3, deepLink, (i12 & 16) != 0 ? null : style);
        }
    }
}
