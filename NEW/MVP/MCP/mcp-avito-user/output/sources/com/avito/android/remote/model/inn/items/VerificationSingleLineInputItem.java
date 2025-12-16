package com.avito.android.remote.model.inn.items;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import com.avito.android.beduin.common.component.cart_item.BeduinCartItemModel;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.inn.formatter.VerificationFormatter;
import com.avito.android.remote.model.inn.items.VerificationInnItem;
import com.avito.android.remote.model.inn.validation.VerificationValidation;
import com.avito.android.remote.model.messenger.context.ChannelContext;
import com.avito.android.remote.model.text.AttributedText;
import com.google.gson.annotations.c;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: VerificationSingleLineInputItem.kt */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0083\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0015¢\u0006\u0002\u0010\u0016J\t\u0010+\u001a\u00020\u0003HÆ\u0003J\u0011\u0010,\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0015HÆ\u0003J\u0017\u0010.\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J\t\u0010/\u001a\u00020\u0003HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\rHÆ\u0003J\u0010\u00104\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0018J\u000b\u00105\u001a\u0004\u0018\u00010\u0010HÆ\u0003J \u0001\u00106\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0016\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00122\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÆ\u0001¢\u0006\u0002\u00107J\u0013\u00108\u001a\u00020\u00062\b\u00109\u001a\u0004\u0018\u00010:HÖ\u0003J\t\u0010;\u001a\u00020<HÖ\u0001J\t\u0010=\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u000e\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u0017\u0010\u0018R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0018\u0010\f\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR$\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0016\u0010\u0002\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0018\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010!R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00158\u0016X\u0097\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010!R\u001e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010!¨\u0006>"}, d2 = {"Lcom/avito/android/remote/model/inn/items/VerificationSingleLineInputItem;", "Lcom/avito/android/remote/model/inn/items/VerificationInnItem;", "id", "", "hiddenIf", "", "", "title", ChannelContext.Item.PLACEHOLDER, "value", "keyboardType", "Lcom/avito/android/remote/model/inn/items/VerificationInputKeyBoardType;", "formatter", "Lcom/avito/android/remote/model/inn/formatter/VerificationFormatter;", BeduinCartItemModel.DISABLED_STRING, "error", "Lcom/avito/android/remote/model/text/AttributedText;", "validations", "", "Lcom/avito/android/remote/model/inn/validation/VerificationValidation;", BeduinPromoBlockModel.SERIALIZED_NAME_STYLE, "Lcom/avito/android/remote/model/inn/items/VerificationInnItem$Style;", "(Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/inn/items/VerificationInputKeyBoardType;Lcom/avito/android/remote/model/inn/formatter/VerificationFormatter;Ljava/lang/Boolean;Lcom/avito/android/remote/model/text/AttributedText;Ljava/util/List;Lcom/avito/android/remote/model/inn/items/VerificationInnItem$Style;)V", "getDisabled", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getError", "()Lcom/avito/android/remote/model/text/AttributedText;", "getFormatter", "()Lcom/avito/android/remote/model/inn/formatter/VerificationFormatter;", "getHiddenIf", "()Ljava/util/Map;", "getId", "()Ljava/lang/String;", "getKeyboardType", "()Lcom/avito/android/remote/model/inn/items/VerificationInputKeyBoardType;", "getPlaceholder", "getStyle", "()Lcom/avito/android/remote/model/inn/items/VerificationInnItem$Style;", "getTitle", "getValidations", "()Ljava/util/List;", "getValue", "component1", "component10", "component11", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/inn/items/VerificationInputKeyBoardType;Lcom/avito/android/remote/model/inn/formatter/VerificationFormatter;Ljava/lang/Boolean;Lcom/avito/android/remote/model/text/AttributedText;Ljava/util/List;Lcom/avito/android/remote/model/inn/items/VerificationInnItem$Style;)Lcom/avito/android/remote/model/inn/items/VerificationSingleLineInputItem;", "equals", PluralsKeys.OTHER, "", "hashCode", "", "toString", "_avito-discouraged_avito-api_verification"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class VerificationSingleLineInputItem implements VerificationInnItem {

    @c(BeduinCartItemModel.DISABLED_STRING)
    @l
    private final Boolean disabled;

    @c("error")
    @l
    private final AttributedText error;

    @c("formatter")
    @l
    private final VerificationFormatter formatter;

    @c("hiddenIf")
    @l
    private final Map<String, Boolean> hiddenIf;

    @c("id")
    @k
    private final String id;

    @c("keyboardType")
    @l
    private final VerificationInputKeyBoardType keyboardType;

    @c(ChannelContext.Item.PLACEHOLDER)
    @l
    private final String placeholder;

    @c(BeduinPromoBlockModel.SERIALIZED_NAME_STYLE)
    @l
    private final VerificationInnItem.Style style;

    @c("title")
    @k
    private final String title;

    @c("validations")
    @l
    private final List<VerificationValidation> validations;

    @c("value")
    @l
    private final String value;

    /* JADX WARN: Multi-variable type inference failed */
    public VerificationSingleLineInputItem(@k String str, @l Map<String, Boolean> map, @k String str2, @l String str3, @l String str4, @l VerificationInputKeyBoardType verificationInputKeyBoardType, @l VerificationFormatter verificationFormatter, @l Boolean bool, @l AttributedText attributedText, @l List<? extends VerificationValidation> list, @l VerificationInnItem.Style style) {
        this.id = str;
        this.hiddenIf = map;
        this.title = str2;
        this.placeholder = str3;
        this.value = str4;
        this.keyboardType = verificationInputKeyBoardType;
        this.formatter = verificationFormatter;
        this.disabled = bool;
        this.error = attributedText;
        this.validations = list;
        this.style = style;
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @l
    public final List<VerificationValidation> component10() {
        return this.validations;
    }

    @l
    /* renamed from: component11, reason: from getter */
    public final VerificationInnItem.Style getStyle() {
        return this.style;
    }

    @l
    public final Map<String, Boolean> component2() {
        return this.hiddenIf;
    }

    @k
    /* renamed from: component3, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @l
    /* renamed from: component4, reason: from getter */
    public final String getPlaceholder() {
        return this.placeholder;
    }

    @l
    /* renamed from: component5, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    @l
    /* renamed from: component6, reason: from getter */
    public final VerificationInputKeyBoardType getKeyboardType() {
        return this.keyboardType;
    }

    @l
    /* renamed from: component7, reason: from getter */
    public final VerificationFormatter getFormatter() {
        return this.formatter;
    }

    @l
    /* renamed from: component8, reason: from getter */
    public final Boolean getDisabled() {
        return this.disabled;
    }

    @l
    /* renamed from: component9, reason: from getter */
    public final AttributedText getError() {
        return this.error;
    }

    @k
    public final VerificationSingleLineInputItem copy(@k String id2, @l Map<String, Boolean> hiddenIf, @k String title, @l String placeholder, @l String value, @l VerificationInputKeyBoardType keyboardType, @l VerificationFormatter formatter, @l Boolean disabled, @l AttributedText error, @l List<? extends VerificationValidation> validations, @l VerificationInnItem.Style style) {
        return new VerificationSingleLineInputItem(id2, hiddenIf, title, placeholder, value, keyboardType, formatter, disabled, error, validations, style);
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VerificationSingleLineInputItem)) {
            return false;
        }
        VerificationSingleLineInputItem verificationSingleLineInputItem = (VerificationSingleLineInputItem) other;
        return L.f(this.id, verificationSingleLineInputItem.id) && L.f(this.hiddenIf, verificationSingleLineInputItem.hiddenIf) && L.f(this.title, verificationSingleLineInputItem.title) && L.f(this.placeholder, verificationSingleLineInputItem.placeholder) && L.f(this.value, verificationSingleLineInputItem.value) && this.keyboardType == verificationSingleLineInputItem.keyboardType && L.f(this.formatter, verificationSingleLineInputItem.formatter) && L.f(this.disabled, verificationSingleLineInputItem.disabled) && L.f(this.error, verificationSingleLineInputItem.error) && L.f(this.validations, verificationSingleLineInputItem.validations) && L.f(this.style, verificationSingleLineInputItem.style);
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
    public final VerificationFormatter getFormatter() {
        return this.formatter;
    }

    @l
    public final Map<String, Boolean> getHiddenIf() {
        return this.hiddenIf;
    }

    @Override // com.avito.android.remote.model.inn.items.VerificationInnItem
    @k
    public String getId() {
        return this.id;
    }

    @l
    public final VerificationInputKeyBoardType getKeyboardType() {
        return this.keyboardType;
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

    @k
    public final String getTitle() {
        return this.title;
    }

    @l
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
        int iD2 = H.d((iHashCode + (map == null ? 0 : map.hashCode())) * 31, 31, this.title);
        String str = this.placeholder;
        int iHashCode2 = (iD2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.value;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        VerificationInputKeyBoardType verificationInputKeyBoardType = this.keyboardType;
        int iHashCode4 = (iHashCode3 + (verificationInputKeyBoardType == null ? 0 : verificationInputKeyBoardType.hashCode())) * 31;
        VerificationFormatter verificationFormatter = this.formatter;
        int iHashCode5 = (iHashCode4 + (verificationFormatter == null ? 0 : verificationFormatter.hashCode())) * 31;
        Boolean bool = this.disabled;
        int iHashCode6 = (iHashCode5 + (bool == null ? 0 : bool.hashCode())) * 31;
        AttributedText attributedText = this.error;
        int iHashCode7 = (iHashCode6 + (attributedText == null ? 0 : attributedText.hashCode())) * 31;
        List<VerificationValidation> list = this.validations;
        int iHashCode8 = (iHashCode7 + (list == null ? 0 : list.hashCode())) * 31;
        VerificationInnItem.Style style = this.style;
        return iHashCode8 + (style != null ? style.hashCode() : 0);
    }

    @k
    public String toString() {
        return "VerificationSingleLineInputItem(id=" + this.id + ", hiddenIf=" + this.hiddenIf + ", title=" + this.title + ", placeholder=" + this.placeholder + ", value=" + this.value + ", keyboardType=" + this.keyboardType + ", formatter=" + this.formatter + ", disabled=" + this.disabled + ", error=" + this.error + ", validations=" + this.validations + ", style=" + this.style + ')';
    }

    public /* synthetic */ VerificationSingleLineInputItem(String str, Map map, String str2, String str3, String str4, VerificationInputKeyBoardType verificationInputKeyBoardType, VerificationFormatter verificationFormatter, Boolean bool, AttributedText attributedText, List list, VerificationInnItem.Style style, int i12, C42822w c42822w) {
        this(str, map, str2, str3, str4, verificationInputKeyBoardType, verificationFormatter, bool, attributedText, list, (i12 & 1024) != 0 ? null : style);
    }
}
