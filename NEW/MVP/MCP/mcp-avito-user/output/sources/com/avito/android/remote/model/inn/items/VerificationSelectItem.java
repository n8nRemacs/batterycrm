package com.avito.android.remote.model.inn.items;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.avito.android.beduin.common.component.cart_item.BeduinCartItemModel;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.inn.items.VerificationInnItem;
import com.avito.android.remote.model.inn.validation.VerificationValidation;
import com.avito.android.remote.model.messenger.context.ChannelContext;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.remote.model.text.TooltipAttribute;
import com.google.gson.annotations.c;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: VerificationSelectItem.kt */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b%\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001:\u0002@AB\u0091\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\t\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016¢\u0006\u0002\u0010\u0017J\t\u0010,\u001a\u00020\u0003HÆ\u0003J\u000f\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00120\tHÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0014HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0016HÆ\u0003J\u0017\u00100\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u00102\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\rHÆ\u0003J\u0010\u00105\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0019J\u000b\u00106\u001a\u0004\u0018\u00010\rHÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u0003HÆ\u0003J°\u0001\u00108\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0016\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\t2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÆ\u0001¢\u0006\u0002\u00109J\u0013\u0010:\u001a\u00020\u00062\b\u0010;\u001a\u0004\u0018\u00010<HÖ\u0003J\t\u0010=\u001a\u00020>HÖ\u0001J\t\u0010?\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u000e\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b\u0018\u0010\u0019R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR$\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0018\u0010\f\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001cR\u0016\u0010\u0002\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u001c\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010!R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00168\u0016X\u0097\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010!R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u001c\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010#R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010!¨\u0006B"}, d2 = {"Lcom/avito/android/remote/model/inn/items/VerificationSelectItem;", "Lcom/avito/android/remote/model/inn/items/VerificationInnItem;", "id", "", "hiddenIf", "", "", "title", "options", "", "Lcom/avito/android/remote/model/inn/items/VerificationSelectItem$Option;", "value", "hint", "Lcom/avito/android/remote/model/text/AttributedText;", BeduinCartItemModel.DISABLED_STRING, "error", ChannelContext.Item.PLACEHOLDER, "validations", "Lcom/avito/android/remote/model/inn/validation/VerificationValidation;", TooltipAttribute.ATTRIBUTE_TYPE, "Lcom/avito/android/remote/model/inn/items/VerificationSelectItem$Tooltip;", BeduinPromoBlockModel.SERIALIZED_NAME_STYLE, "Lcom/avito/android/remote/model/inn/items/VerificationInnItem$Style;", "(Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lcom/avito/android/remote/model/text/AttributedText;Ljava/lang/Boolean;Lcom/avito/android/remote/model/text/AttributedText;Ljava/lang/String;Ljava/util/List;Lcom/avito/android/remote/model/inn/items/VerificationSelectItem$Tooltip;Lcom/avito/android/remote/model/inn/items/VerificationInnItem$Style;)V", "getDisabled", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getError", "()Lcom/avito/android/remote/model/text/AttributedText;", "getHiddenIf", "()Ljava/util/Map;", "getHint", "getId", "()Ljava/lang/String;", "getOptions", "()Ljava/util/List;", "getPlaceholder", "getStyle", "()Lcom/avito/android/remote/model/inn/items/VerificationInnItem$Style;", "getTitle", "getTooltip", "()Lcom/avito/android/remote/model/inn/items/VerificationSelectItem$Tooltip;", "getValidations", "getValue", "component1", "component10", "component11", "component12", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lcom/avito/android/remote/model/text/AttributedText;Ljava/lang/Boolean;Lcom/avito/android/remote/model/text/AttributedText;Ljava/lang/String;Ljava/util/List;Lcom/avito/android/remote/model/inn/items/VerificationSelectItem$Tooltip;Lcom/avito/android/remote/model/inn/items/VerificationInnItem$Style;)Lcom/avito/android/remote/model/inn/items/VerificationSelectItem;", "equals", PluralsKeys.OTHER, "", "hashCode", "", "toString", "Option", "Tooltip", "_avito-discouraged_avito-api_verification"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class VerificationSelectItem implements VerificationInnItem {

    @c(BeduinCartItemModel.DISABLED_STRING)
    @l
    private final Boolean disabled;

    @c("error")
    @l
    private final AttributedText error;

    @c("hiddenIf")
    @l
    private final Map<String, Boolean> hiddenIf;

    @c("hint")
    @l
    private final AttributedText hint;

    @c("id")
    @k
    private final String id;

    @c("options")
    @k
    private final List<Option> options;

    @c(ChannelContext.Item.PLACEHOLDER)
    @l
    private final String placeholder;

    @c(BeduinPromoBlockModel.SERIALIZED_NAME_STYLE)
    @l
    private final VerificationInnItem.Style style;

    @c("title")
    @l
    private final String title;

    @c(TooltipAttribute.ATTRIBUTE_TYPE)
    @l
    private final Tooltip tooltip;

    @c("validations")
    @k
    private final List<VerificationValidation> validations;

    @c("value")
    @l
    private final String value;

    /* compiled from: VerificationSelectItem.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/avito/android/remote/model/inn/items/VerificationSelectItem$Option;", "", "type", "", "value", "(Ljava/lang/String;Ljava/lang/String;)V", "getType", "()Ljava/lang/String;", "getValue", "component1", "component2", "copy", "equals", "", PluralsKeys.OTHER, "hashCode", "", "toString", "_avito-discouraged_avito-api_verification"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Option {

        @c("type")
        @k
        private final String type;

        @c("value")
        @k
        private final String value;

        public Option(@k String str, @k String str2) {
            this.type = str;
            this.value = str2;
        }

        public static /* synthetic */ Option copy$default(Option option, String str, String str2, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = option.type;
            }
            if ((i12 & 2) != 0) {
                str2 = option.value;
            }
            return option.copy(str, str2);
        }

        @k
        /* renamed from: component1, reason: from getter */
        public final String getType() {
            return this.type;
        }

        @k
        /* renamed from: component2, reason: from getter */
        public final String getValue() {
            return this.value;
        }

        @k
        public final Option copy(@k String type, @k String value) {
            return new Option(type, value);
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Option)) {
                return false;
            }
            Option option = (Option) other;
            return L.f(this.type, option.type) && L.f(this.value, option.value);
        }

        @k
        public final String getType() {
            return this.type;
        }

        @k
        public final String getValue() {
            return this.value;
        }

        public int hashCode() {
            return this.value.hashCode() + (this.type.hashCode() * 31);
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("Option(type=");
            sb2.append(this.type);
            sb2.append(", value=");
            return C22026a.c(sb2, this.value, ')');
        }
    }

    /* compiled from: VerificationSelectItem.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u000b\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\u000b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/avito/android/remote/model/inn/items/VerificationSelectItem$Tooltip;", "", "title", "", "body", "(Ljava/lang/String;Ljava/lang/String;)V", "getBody", "()Ljava/lang/String;", "getTitle", "component1", "component2", "copy", "equals", "", PluralsKeys.OTHER, "hashCode", "", "toString", "_avito-discouraged_avito-api_verification"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Tooltip {

        @c("body")
        @l
        private final String body;

        @c("title")
        @l
        private final String title;

        public Tooltip(@l String str, @l String str2) {
            this.title = str;
            this.body = str2;
        }

        public static /* synthetic */ Tooltip copy$default(Tooltip tooltip, String str, String str2, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = tooltip.title;
            }
            if ((i12 & 2) != 0) {
                str2 = tooltip.body;
            }
            return tooltip.copy(str, str2);
        }

        @l
        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        @l
        /* renamed from: component2, reason: from getter */
        public final String getBody() {
            return this.body;
        }

        @k
        public final Tooltip copy(@l String title, @l String body) {
            return new Tooltip(title, body);
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Tooltip)) {
                return false;
            }
            Tooltip tooltip = (Tooltip) other;
            return L.f(this.title, tooltip.title) && L.f(this.body, tooltip.body);
        }

        @l
        public final String getBody() {
            return this.body;
        }

        @l
        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            String str = this.title;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.body;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("Tooltip(title=");
            sb2.append(this.title);
            sb2.append(", body=");
            return C22026a.c(sb2, this.body, ')');
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public VerificationSelectItem(@k String str, @l Map<String, Boolean> map, @l String str2, @k List<Option> list, @l String str3, @l AttributedText attributedText, @l Boolean bool, @l AttributedText attributedText2, @l String str4, @k List<? extends VerificationValidation> list2, @l Tooltip tooltip, @l VerificationInnItem.Style style) {
        this.id = str;
        this.hiddenIf = map;
        this.title = str2;
        this.options = list;
        this.value = str3;
        this.hint = attributedText;
        this.disabled = bool;
        this.error = attributedText2;
        this.placeholder = str4;
        this.validations = list2;
        this.tooltip = tooltip;
        this.style = style;
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @k
    public final List<VerificationValidation> component10() {
        return this.validations;
    }

    @l
    /* renamed from: component11, reason: from getter */
    public final Tooltip getTooltip() {
        return this.tooltip;
    }

    @l
    /* renamed from: component12, reason: from getter */
    public final VerificationInnItem.Style getStyle() {
        return this.style;
    }

    @l
    public final Map<String, Boolean> component2() {
        return this.hiddenIf;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @k
    public final List<Option> component4() {
        return this.options;
    }

    @l
    /* renamed from: component5, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    @l
    /* renamed from: component6, reason: from getter */
    public final AttributedText getHint() {
        return this.hint;
    }

    @l
    /* renamed from: component7, reason: from getter */
    public final Boolean getDisabled() {
        return this.disabled;
    }

    @l
    /* renamed from: component8, reason: from getter */
    public final AttributedText getError() {
        return this.error;
    }

    @l
    /* renamed from: component9, reason: from getter */
    public final String getPlaceholder() {
        return this.placeholder;
    }

    @k
    public final VerificationSelectItem copy(@k String id2, @l Map<String, Boolean> hiddenIf, @l String title, @k List<Option> options, @l String value, @l AttributedText hint, @l Boolean disabled, @l AttributedText error, @l String placeholder, @k List<? extends VerificationValidation> validations, @l Tooltip tooltip, @l VerificationInnItem.Style style) {
        return new VerificationSelectItem(id2, hiddenIf, title, options, value, hint, disabled, error, placeholder, validations, tooltip, style);
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VerificationSelectItem)) {
            return false;
        }
        VerificationSelectItem verificationSelectItem = (VerificationSelectItem) other;
        return L.f(this.id, verificationSelectItem.id) && L.f(this.hiddenIf, verificationSelectItem.hiddenIf) && L.f(this.title, verificationSelectItem.title) && L.f(this.options, verificationSelectItem.options) && L.f(this.value, verificationSelectItem.value) && L.f(this.hint, verificationSelectItem.hint) && L.f(this.disabled, verificationSelectItem.disabled) && L.f(this.error, verificationSelectItem.error) && L.f(this.placeholder, verificationSelectItem.placeholder) && L.f(this.validations, verificationSelectItem.validations) && L.f(this.tooltip, verificationSelectItem.tooltip) && L.f(this.style, verificationSelectItem.style);
    }

    @l
    public final Boolean getDisabled() {
        return this.disabled;
    }

    @l
    public final AttributedText getError() {
        return this.error;
    }

    @l
    public final Map<String, Boolean> getHiddenIf() {
        return this.hiddenIf;
    }

    @l
    public final AttributedText getHint() {
        return this.hint;
    }

    @Override // com.avito.android.remote.model.inn.items.VerificationInnItem
    @k
    public String getId() {
        return this.id;
    }

    @k
    public final List<Option> getOptions() {
        return this.options;
    }

    @l
    public final String getPlaceholder() {
        return this.placeholder;
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
    public final Tooltip getTooltip() {
        return this.tooltip;
    }

    @k
    public final List<VerificationValidation> getValidations() {
        return this.validations;
    }

    @l
    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        int iHashCode = this.id.hashCode() * 31;
        Map<String, Boolean> map = this.hiddenIf;
        int iHashCode2 = (iHashCode + (map == null ? 0 : map.hashCode())) * 31;
        String str = this.title;
        int iE2 = H.e((iHashCode2 + (str == null ? 0 : str.hashCode())) * 31, 31, this.options);
        String str2 = this.value;
        int iHashCode3 = (iE2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        AttributedText attributedText = this.hint;
        int iHashCode4 = (iHashCode3 + (attributedText == null ? 0 : attributedText.hashCode())) * 31;
        Boolean bool = this.disabled;
        int iHashCode5 = (iHashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        AttributedText attributedText2 = this.error;
        int iHashCode6 = (iHashCode5 + (attributedText2 == null ? 0 : attributedText2.hashCode())) * 31;
        String str3 = this.placeholder;
        int iE3 = H.e((iHashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.validations);
        Tooltip tooltip = this.tooltip;
        int iHashCode7 = (iE3 + (tooltip == null ? 0 : tooltip.hashCode())) * 31;
        VerificationInnItem.Style style = this.style;
        return iHashCode7 + (style != null ? style.hashCode() : 0);
    }

    @k
    public String toString() {
        return "VerificationSelectItem(id=" + this.id + ", hiddenIf=" + this.hiddenIf + ", title=" + this.title + ", options=" + this.options + ", value=" + this.value + ", hint=" + this.hint + ", disabled=" + this.disabled + ", error=" + this.error + ", placeholder=" + this.placeholder + ", validations=" + this.validations + ", tooltip=" + this.tooltip + ", style=" + this.style + ')';
    }

    public /* synthetic */ VerificationSelectItem(String str, Map map, String str2, List list, String str3, AttributedText attributedText, Boolean bool, AttributedText attributedText2, String str4, List list2, Tooltip tooltip, VerificationInnItem.Style style, int i12, C42822w c42822w) {
        this(str, map, str2, list, str3, attributedText, bool, attributedText2, str4, list2, tooltip, (i12 & 2048) != 0 ? null : style);
    }
}
