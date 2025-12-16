package com.avito.android.remote.model.inn.items;

import Y61.k;
import Y61.l;
import com.adjust.sdk.Constants;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.inn.items.VerificationInnItem;
import com.avito.android.remote.model.text.TooltipAttribute;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: VerificationButtonItem.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001:\u0002*+BK\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0002\u0010\u000eJ\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\rHÆ\u0003J[\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\rHÆ\u0001J\u0013\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010&HÖ\u0003J\t\u0010'\u001a\u00020(HÖ\u0001J\t\u0010)\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0002\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0018\u0010\f\u001a\u0004\u0018\u00010\r8\u0016X\u0097\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0012R\u0018\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a¨\u0006,"}, d2 = {"Lcom/avito/android/remote/model/inn/items/VerificationButtonItem;", "Lcom/avito/android/remote/model/inn/items/VerificationInnItem;", "id", "", "iconName", "title", TooltipAttribute.PARAM_DEEP_LINK, "Lcom/avito/android/deep_linking/links/DeepLink;", "type", "Lcom/avito/android/remote/model/inn/items/VerificationButtonItem$Type;", "buttonStyle", "Lcom/avito/android/remote/model/inn/items/VerificationButtonItem$Style;", BeduinPromoBlockModel.SERIALIZED_NAME_STYLE, "Lcom/avito/android/remote/model/inn/items/VerificationInnItem$Style;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;Lcom/avito/android/remote/model/inn/items/VerificationButtonItem$Type;Lcom/avito/android/remote/model/inn/items/VerificationButtonItem$Style;Lcom/avito/android/remote/model/inn/items/VerificationInnItem$Style;)V", "getButtonStyle", "()Lcom/avito/android/remote/model/inn/items/VerificationButtonItem$Style;", "getIconName", "()Ljava/lang/String;", "getId", "getStyle", "()Lcom/avito/android/remote/model/inn/items/VerificationInnItem$Style;", "getTitle", "getType", "()Lcom/avito/android/remote/model/inn/items/VerificationButtonItem$Type;", "getUri", "()Lcom/avito/android/deep_linking/links/DeepLink;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", PluralsKeys.OTHER, "", "hashCode", "", "toString", "Style", "Type", "_avito-discouraged_avito-api_verification"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class VerificationButtonItem implements VerificationInnItem {

    @c("buttonStyle")
    @l
    private final Style buttonStyle;

    @c("icon")
    @l
    private final String iconName;

    @c("id")
    @k
    private final String id;

    @c(BeduinPromoBlockModel.SERIALIZED_NAME_STYLE)
    @l
    private final VerificationInnItem.Style style;

    @c("title")
    @l
    private final String title;

    @c("type")
    @l
    private final Type type;

    @c(TooltipAttribute.PARAM_DEEP_LINK)
    @l
    private final DeepLink uri;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: VerificationButtonItem.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/remote/model/inn/items/VerificationButtonItem$Style;", "", "(Ljava/lang/String;I)V", "DEFAULT", "PRIMARY", "SECONDARY", "_avito-discouraged_avito-api_verification"}, k = 1, mv = {1, 9, 0}, xi = 48)
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

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: VerificationButtonItem.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/remote/model/inn/items/VerificationButtonItem$Type;", "", "(Ljava/lang/String;I)V", "DEEPLINK", "VALIDATE", "BACK", "_avito-discouraged_avito-api_verification"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Type {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;

        @c(Constants.DEEPLINK)
        public static final Type DEEPLINK = new Type("DEEPLINK", 0);

        @c("validate")
        public static final Type VALIDATE = new Type("VALIDATE", 1);

        @c("back")
        public static final Type BACK = new Type("BACK", 2);

        private static final /* synthetic */ Type[] $values() {
            return new Type[]{DEEPLINK, VALIDATE, BACK};
        }

        static {
            Type[] typeArr$values = $values();
            $VALUES = typeArr$values;
            $ENTRIES = kotlin.enums.c.a(typeArr$values);
        }

        private Type(String str, int i12) {
        }

        @k
        public static a<Type> getEntries() {
            return $ENTRIES;
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) $VALUES.clone();
        }
    }

    public VerificationButtonItem(@k String str, @l String str2, @l String str3, @l DeepLink deepLink, @l Type type, @l Style style, @l VerificationInnItem.Style style2) {
        this.id = str;
        this.iconName = str2;
        this.title = str3;
        this.uri = deepLink;
        this.type = type;
        this.buttonStyle = style;
        this.style = style2;
    }

    public static /* synthetic */ VerificationButtonItem copy$default(VerificationButtonItem verificationButtonItem, String str, String str2, String str3, DeepLink deepLink, Type type, Style style, VerificationInnItem.Style style2, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = verificationButtonItem.id;
        }
        if ((i12 & 2) != 0) {
            str2 = verificationButtonItem.iconName;
        }
        String str4 = str2;
        if ((i12 & 4) != 0) {
            str3 = verificationButtonItem.title;
        }
        String str5 = str3;
        if ((i12 & 8) != 0) {
            deepLink = verificationButtonItem.uri;
        }
        DeepLink deepLink2 = deepLink;
        if ((i12 & 16) != 0) {
            type = verificationButtonItem.type;
        }
        Type type2 = type;
        if ((i12 & 32) != 0) {
            style = verificationButtonItem.buttonStyle;
        }
        Style style3 = style;
        if ((i12 & 64) != 0) {
            style2 = verificationButtonItem.style;
        }
        return verificationButtonItem.copy(str, str4, str5, deepLink2, type2, style3, style2);
    }

    @k
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
    public final Type getType() {
        return this.type;
    }

    @l
    /* renamed from: component6, reason: from getter */
    public final Style getButtonStyle() {
        return this.buttonStyle;
    }

    @l
    /* renamed from: component7, reason: from getter */
    public final VerificationInnItem.Style getStyle() {
        return this.style;
    }

    @k
    public final VerificationButtonItem copy(@k String id2, @l String iconName, @l String title, @l DeepLink uri, @l Type type, @l Style buttonStyle, @l VerificationInnItem.Style style) {
        return new VerificationButtonItem(id2, iconName, title, uri, type, buttonStyle, style);
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VerificationButtonItem)) {
            return false;
        }
        VerificationButtonItem verificationButtonItem = (VerificationButtonItem) other;
        return L.f(this.id, verificationButtonItem.id) && L.f(this.iconName, verificationButtonItem.iconName) && L.f(this.title, verificationButtonItem.title) && L.f(this.uri, verificationButtonItem.uri) && this.type == verificationButtonItem.type && this.buttonStyle == verificationButtonItem.buttonStyle && L.f(this.style, verificationButtonItem.style);
    }

    @l
    public final Style getButtonStyle() {
        return this.buttonStyle;
    }

    @l
    public final String getIconName() {
        return this.iconName;
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

    @l
    public final String getTitle() {
        return this.title;
    }

    @l
    public final Type getType() {
        return this.type;
    }

    @l
    public final DeepLink getUri() {
        return this.uri;
    }

    public int hashCode() {
        int iHashCode = this.id.hashCode() * 31;
        String str = this.iconName;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.title;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        DeepLink deepLink = this.uri;
        int iHashCode4 = (iHashCode3 + (deepLink == null ? 0 : deepLink.hashCode())) * 31;
        Type type = this.type;
        int iHashCode5 = (iHashCode4 + (type == null ? 0 : type.hashCode())) * 31;
        Style style = this.buttonStyle;
        int iHashCode6 = (iHashCode5 + (style == null ? 0 : style.hashCode())) * 31;
        VerificationInnItem.Style style2 = this.style;
        return iHashCode6 + (style2 != null ? style2.hashCode() : 0);
    }

    @k
    public String toString() {
        return "VerificationButtonItem(id=" + this.id + ", iconName=" + this.iconName + ", title=" + this.title + ", uri=" + this.uri + ", type=" + this.type + ", buttonStyle=" + this.buttonStyle + ", style=" + this.style + ')';
    }

    public /* synthetic */ VerificationButtonItem(String str, String str2, String str3, DeepLink deepLink, Type type, Style style, VerificationInnItem.Style style2, int i12, C42822w c42822w) {
        this(str, str2, str3, deepLink, type, style, (i12 & 64) != 0 ? null : style2);
    }
}
