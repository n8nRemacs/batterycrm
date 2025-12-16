package com.avito.android.remote.model.inn;

import Y61.k;
import Y61.l;
import com.adjust.sdk.Constants;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.publish.drafts.LocalPublishState;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.inn.items.VerificationInnItem;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.remote.model.text.TooltipAttribute;
import com.google.gson.annotations.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.jvm.internal.L;

/* compiled from: VerificationFormBuilderResult.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001:\u0002,-BQ\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0010J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010 \u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0019J\u000b\u0010!\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u0011\u0010#\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rHÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0005HÆ\u0003Jh\u0010%\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010&J\u0013\u0010'\u001a\u00020\u00072\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010)\u001a\u00020*HÖ\u0001J\t\u0010+\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u001e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0018\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b\u0006\u0010\u0019R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0016R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001d¨\u0006."}, d2 = {"Lcom/avito/android/remote/model/inn/VerificationFormBuilderResult;", "", "title", "", "subtitle", "Lcom/avito/android/remote/model/text/AttributedText;", "isClosable", "", "footerPosition", "Lcom/avito/android/remote/model/inn/VerificationFormBuilderResult$FooterPosition;", "action", "Lcom/avito/android/remote/model/inn/VerificationFormBuilderResult$Action;", LocalPublishState.FIELDS, "", "Lcom/avito/android/remote/model/inn/items/VerificationInnItem;", "footer", "(Ljava/lang/String;Lcom/avito/android/remote/model/text/AttributedText;Ljava/lang/Boolean;Lcom/avito/android/remote/model/inn/VerificationFormBuilderResult$FooterPosition;Lcom/avito/android/remote/model/inn/VerificationFormBuilderResult$Action;Ljava/util/List;Lcom/avito/android/remote/model/text/AttributedText;)V", "getAction", "()Lcom/avito/android/remote/model/inn/VerificationFormBuilderResult$Action;", "getFields", "()Ljava/util/List;", "getFooter", "()Lcom/avito/android/remote/model/text/AttributedText;", "getFooterPosition", "()Lcom/avito/android/remote/model/inn/VerificationFormBuilderResult$FooterPosition;", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getSubtitle", "getTitle", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/lang/String;Lcom/avito/android/remote/model/text/AttributedText;Ljava/lang/Boolean;Lcom/avito/android/remote/model/inn/VerificationFormBuilderResult$FooterPosition;Lcom/avito/android/remote/model/inn/VerificationFormBuilderResult$Action;Ljava/util/List;Lcom/avito/android/remote/model/text/AttributedText;)Lcom/avito/android/remote/model/inn/VerificationFormBuilderResult;", "equals", PluralsKeys.OTHER, "hashCode", "", "toString", "Action", "FooterPosition", "_avito-discouraged_avito-api_verification"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class VerificationFormBuilderResult {

    @c("action")
    @l
    private final Action action;

    @c(LocalPublishState.FIELDS)
    @l
    private final List<VerificationInnItem> fields;

    @c("footer")
    @l
    private final AttributedText footer;

    @c("footerPosition")
    @l
    private final FooterPosition footerPosition;

    @c("isClosable")
    @l
    private final Boolean isClosable;

    @c("subtitle")
    @l
    private final AttributedText subtitle;

    @c("title")
    @l
    private final String title;

    /* compiled from: VerificationFormBuilderResult.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001:\u0002\u0013\u0014B-\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nR\u0018\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, d2 = {"Lcom/avito/android/remote/model/inn/VerificationFormBuilderResult$Action;", "", "title", "", "type", "Lcom/avito/android/remote/model/inn/VerificationFormBuilderResult$Action$Type;", TooltipAttribute.PARAM_DEEP_LINK, "Lcom/avito/android/deep_linking/links/DeepLink;", BeduinPromoBlockModel.SERIALIZED_NAME_STYLE, "Lcom/avito/android/remote/model/inn/VerificationFormBuilderResult$Action$Style;", "(Ljava/lang/String;Lcom/avito/android/remote/model/inn/VerificationFormBuilderResult$Action$Type;Lcom/avito/android/deep_linking/links/DeepLink;Lcom/avito/android/remote/model/inn/VerificationFormBuilderResult$Action$Style;)V", "getStyle", "()Lcom/avito/android/remote/model/inn/VerificationFormBuilderResult$Action$Style;", "getTitle", "()Ljava/lang/String;", "getType", "()Lcom/avito/android/remote/model/inn/VerificationFormBuilderResult$Action$Type;", "getUri", "()Lcom/avito/android/deep_linking/links/DeepLink;", "Style", "Type", "_avito-discouraged_avito-api_verification"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Action {

        @c(BeduinPromoBlockModel.SERIALIZED_NAME_STYLE)
        @l
        private final Style style;

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
        /* compiled from: VerificationFormBuilderResult.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/remote/model/inn/VerificationFormBuilderResult$Action$Style;", "", "(Ljava/lang/String;I)V", "DEFAULT", "PRIMARY", "SECONDARY", "_avito-discouraged_avito-api_verification"}, k = 1, mv = {1, 9, 0}, xi = 48)
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
        /* compiled from: VerificationFormBuilderResult.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/remote/model/inn/VerificationFormBuilderResult$Action$Type;", "", "(Ljava/lang/String;I)V", "DEEPLINK", "VALIDATE", "BACK", "_avito-discouraged_avito-api_verification"}, k = 1, mv = {1, 9, 0}, xi = 48)
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

        public Action(@l String str, @l Type type, @l DeepLink deepLink, @l Style style) {
            this.title = str;
            this.type = type;
            this.uri = deepLink;
            this.style = style;
        }

        @l
        public final Style getStyle() {
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
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: VerificationFormBuilderResult.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/remote/model/inn/VerificationFormBuilderResult$FooterPosition;", "", "(Ljava/lang/String;I)V", "TOP", "BOTTOM", "_avito-discouraged_avito-api_verification"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class FooterPosition {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ FooterPosition[] $VALUES;

        @c("top")
        public static final FooterPosition TOP = new FooterPosition("TOP", 0);

        @c("bottom")
        public static final FooterPosition BOTTOM = new FooterPosition("BOTTOM", 1);

        private static final /* synthetic */ FooterPosition[] $values() {
            return new FooterPosition[]{TOP, BOTTOM};
        }

        static {
            FooterPosition[] footerPositionArr$values = $values();
            $VALUES = footerPositionArr$values;
            $ENTRIES = kotlin.enums.c.a(footerPositionArr$values);
        }

        private FooterPosition(String str, int i12) {
        }

        @k
        public static a<FooterPosition> getEntries() {
            return $ENTRIES;
        }

        public static FooterPosition valueOf(String str) {
            return (FooterPosition) Enum.valueOf(FooterPosition.class, str);
        }

        public static FooterPosition[] values() {
            return (FooterPosition[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public VerificationFormBuilderResult(@l String str, @l AttributedText attributedText, @l Boolean bool, @l FooterPosition footerPosition, @l Action action, @l List<? extends VerificationInnItem> list, @l AttributedText attributedText2) {
        this.title = str;
        this.subtitle = attributedText;
        this.isClosable = bool;
        this.footerPosition = footerPosition;
        this.action = action;
        this.fields = list;
        this.footer = attributedText2;
    }

    public static /* synthetic */ VerificationFormBuilderResult copy$default(VerificationFormBuilderResult verificationFormBuilderResult, String str, AttributedText attributedText, Boolean bool, FooterPosition footerPosition, Action action, List list, AttributedText attributedText2, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = verificationFormBuilderResult.title;
        }
        if ((i12 & 2) != 0) {
            attributedText = verificationFormBuilderResult.subtitle;
        }
        AttributedText attributedText3 = attributedText;
        if ((i12 & 4) != 0) {
            bool = verificationFormBuilderResult.isClosable;
        }
        Boolean bool2 = bool;
        if ((i12 & 8) != 0) {
            footerPosition = verificationFormBuilderResult.footerPosition;
        }
        FooterPosition footerPosition2 = footerPosition;
        if ((i12 & 16) != 0) {
            action = verificationFormBuilderResult.action;
        }
        Action action2 = action;
        if ((i12 & 32) != 0) {
            list = verificationFormBuilderResult.fields;
        }
        List list2 = list;
        if ((i12 & 64) != 0) {
            attributedText2 = verificationFormBuilderResult.footer;
        }
        return verificationFormBuilderResult.copy(str, attributedText3, bool2, footerPosition2, action2, list2, attributedText2);
    }

    @l
    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final AttributedText getSubtitle() {
        return this.subtitle;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final Boolean getIsClosable() {
        return this.isClosable;
    }

    @l
    /* renamed from: component4, reason: from getter */
    public final FooterPosition getFooterPosition() {
        return this.footerPosition;
    }

    @l
    /* renamed from: component5, reason: from getter */
    public final Action getAction() {
        return this.action;
    }

    @l
    public final List<VerificationInnItem> component6() {
        return this.fields;
    }

    @l
    /* renamed from: component7, reason: from getter */
    public final AttributedText getFooter() {
        return this.footer;
    }

    @k
    public final VerificationFormBuilderResult copy(@l String title, @l AttributedText subtitle, @l Boolean isClosable, @l FooterPosition footerPosition, @l Action action, @l List<? extends VerificationInnItem> fields, @l AttributedText footer) {
        return new VerificationFormBuilderResult(title, subtitle, isClosable, footerPosition, action, fields, footer);
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VerificationFormBuilderResult)) {
            return false;
        }
        VerificationFormBuilderResult verificationFormBuilderResult = (VerificationFormBuilderResult) other;
        return L.f(this.title, verificationFormBuilderResult.title) && L.f(this.subtitle, verificationFormBuilderResult.subtitle) && L.f(this.isClosable, verificationFormBuilderResult.isClosable) && this.footerPosition == verificationFormBuilderResult.footerPosition && L.f(this.action, verificationFormBuilderResult.action) && L.f(this.fields, verificationFormBuilderResult.fields) && L.f(this.footer, verificationFormBuilderResult.footer);
    }

    @l
    public final Action getAction() {
        return this.action;
    }

    @l
    public final List<VerificationInnItem> getFields() {
        return this.fields;
    }

    @l
    public final AttributedText getFooter() {
        return this.footer;
    }

    @l
    public final FooterPosition getFooterPosition() {
        return this.footerPosition;
    }

    @l
    public final AttributedText getSubtitle() {
        return this.subtitle;
    }

    @l
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        String str = this.title;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        AttributedText attributedText = this.subtitle;
        int iHashCode2 = (iHashCode + (attributedText == null ? 0 : attributedText.hashCode())) * 31;
        Boolean bool = this.isClosable;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        FooterPosition footerPosition = this.footerPosition;
        int iHashCode4 = (iHashCode3 + (footerPosition == null ? 0 : footerPosition.hashCode())) * 31;
        Action action = this.action;
        int iHashCode5 = (iHashCode4 + (action == null ? 0 : action.hashCode())) * 31;
        List<VerificationInnItem> list = this.fields;
        int iHashCode6 = (iHashCode5 + (list == null ? 0 : list.hashCode())) * 31;
        AttributedText attributedText2 = this.footer;
        return iHashCode6 + (attributedText2 != null ? attributedText2.hashCode() : 0);
    }

    @l
    public final Boolean isClosable() {
        return this.isClosable;
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("VerificationFormBuilderResult(title=");
        sb2.append(this.title);
        sb2.append(", subtitle=");
        sb2.append(this.subtitle);
        sb2.append(", isClosable=");
        sb2.append(this.isClosable);
        sb2.append(", footerPosition=");
        sb2.append(this.footerPosition);
        sb2.append(", action=");
        sb2.append(this.action);
        sb2.append(", fields=");
        sb2.append(this.fields);
        sb2.append(", footer=");
        return com.avito.android.actions_sheet.a.w(sb2, this.footer, ')');
    }
}
