package com.avito.android.remote.model.inn.items;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import com.avito.android.beduin.common.component.cart_item.BeduinCartItemModel;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.inn.items.VerificationInnItem;
import com.avito.android.remote.model.text.AttributedText;
import com.google.gson.annotations.c;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: VerificationCheckboxItem.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BU\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0002\u0010\u000eJ\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\u0017\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u001f\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0010J\u0010\u0010 \u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0010J\u000b\u0010!\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\rHÆ\u0003Jj\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0016\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\rHÆ\u0001¢\u0006\u0002\u0010$J\u0013\u0010%\u001a\u00020\u00062\b\u0010&\u001a\u0004\u0018\u00010'HÖ\u0003J\t\u0010(\u001a\u00020)HÖ\u0001J\t\u0010*\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010R\u0018\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R$\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0002\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0018\u0010\f\u001a\u0004\u0018\u00010\r8\u0016X\u0097\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0017R\u001a\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u001b\u0010\u0010¨\u0006+"}, d2 = {"Lcom/avito/android/remote/model/inn/items/VerificationCheckboxItem;", "Lcom/avito/android/remote/model/inn/items/VerificationInnItem;", "id", "", "hiddenIf", "", "", "title", "value", BeduinCartItemModel.DISABLED_STRING, "error", "Lcom/avito/android/remote/model/text/AttributedText;", BeduinPromoBlockModel.SERIALIZED_NAME_STYLE, "Lcom/avito/android/remote/model/inn/items/VerificationInnItem$Style;", "(Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/inn/items/VerificationInnItem$Style;)V", "getDisabled", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getError", "()Lcom/avito/android/remote/model/text/AttributedText;", "getHiddenIf", "()Ljava/util/Map;", "getId", "()Ljava/lang/String;", "getStyle", "()Lcom/avito/android/remote/model/inn/items/VerificationInnItem$Style;", "getTitle", "getValue", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/inn/items/VerificationInnItem$Style;)Lcom/avito/android/remote/model/inn/items/VerificationCheckboxItem;", "equals", PluralsKeys.OTHER, "", "hashCode", "", "toString", "_avito-discouraged_avito-api_verification"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class VerificationCheckboxItem implements VerificationInnItem {

    @c(BeduinCartItemModel.DISABLED_STRING)
    @l
    private final Boolean disabled;

    @c("error")
    @l
    private final AttributedText error;

    @c("hiddenIf")
    @l
    private final Map<String, Boolean> hiddenIf;

    @c("id")
    @k
    private final String id;

    @c(BeduinPromoBlockModel.SERIALIZED_NAME_STYLE)
    @l
    private final VerificationInnItem.Style style;

    @c("title")
    @k
    private final String title;

    @c("value")
    @l
    private final Boolean value;

    public VerificationCheckboxItem(@k String str, @l Map<String, Boolean> map, @k String str2, @l Boolean bool, @l Boolean bool2, @l AttributedText attributedText, @l VerificationInnItem.Style style) {
        this.id = str;
        this.hiddenIf = map;
        this.title = str2;
        this.value = bool;
        this.disabled = bool2;
        this.error = attributedText;
        this.style = style;
    }

    public static /* synthetic */ VerificationCheckboxItem copy$default(VerificationCheckboxItem verificationCheckboxItem, String str, Map map, String str2, Boolean bool, Boolean bool2, AttributedText attributedText, VerificationInnItem.Style style, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = verificationCheckboxItem.id;
        }
        if ((i12 & 2) != 0) {
            map = verificationCheckboxItem.hiddenIf;
        }
        Map map2 = map;
        if ((i12 & 4) != 0) {
            str2 = verificationCheckboxItem.title;
        }
        String str3 = str2;
        if ((i12 & 8) != 0) {
            bool = verificationCheckboxItem.value;
        }
        Boolean bool3 = bool;
        if ((i12 & 16) != 0) {
            bool2 = verificationCheckboxItem.disabled;
        }
        Boolean bool4 = bool2;
        if ((i12 & 32) != 0) {
            attributedText = verificationCheckboxItem.error;
        }
        AttributedText attributedText2 = attributedText;
        if ((i12 & 64) != 0) {
            style = verificationCheckboxItem.style;
        }
        return verificationCheckboxItem.copy(str, map2, str3, bool3, bool4, attributedText2, style);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
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
    public final Boolean getValue() {
        return this.value;
    }

    @l
    /* renamed from: component5, reason: from getter */
    public final Boolean getDisabled() {
        return this.disabled;
    }

    @l
    /* renamed from: component6, reason: from getter */
    public final AttributedText getError() {
        return this.error;
    }

    @l
    /* renamed from: component7, reason: from getter */
    public final VerificationInnItem.Style getStyle() {
        return this.style;
    }

    @k
    public final VerificationCheckboxItem copy(@k String id2, @l Map<String, Boolean> hiddenIf, @k String title, @l Boolean value, @l Boolean disabled, @l AttributedText error, @l VerificationInnItem.Style style) {
        return new VerificationCheckboxItem(id2, hiddenIf, title, value, disabled, error, style);
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VerificationCheckboxItem)) {
            return false;
        }
        VerificationCheckboxItem verificationCheckboxItem = (VerificationCheckboxItem) other;
        return L.f(this.id, verificationCheckboxItem.id) && L.f(this.hiddenIf, verificationCheckboxItem.hiddenIf) && L.f(this.title, verificationCheckboxItem.title) && L.f(this.value, verificationCheckboxItem.value) && L.f(this.disabled, verificationCheckboxItem.disabled) && L.f(this.error, verificationCheckboxItem.error) && L.f(this.style, verificationCheckboxItem.style);
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

    @k
    public final String getTitle() {
        return this.title;
    }

    @l
    public final Boolean getValue() {
        return this.value;
    }

    public int hashCode() {
        int iHashCode = this.id.hashCode() * 31;
        Map<String, Boolean> map = this.hiddenIf;
        int iD2 = H.d((iHashCode + (map == null ? 0 : map.hashCode())) * 31, 31, this.title);
        Boolean bool = this.value;
        int iHashCode2 = (iD2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.disabled;
        int iHashCode3 = (iHashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        AttributedText attributedText = this.error;
        int iHashCode4 = (iHashCode3 + (attributedText == null ? 0 : attributedText.hashCode())) * 31;
        VerificationInnItem.Style style = this.style;
        return iHashCode4 + (style != null ? style.hashCode() : 0);
    }

    @k
    public String toString() {
        return "VerificationCheckboxItem(id=" + this.id + ", hiddenIf=" + this.hiddenIf + ", title=" + this.title + ", value=" + this.value + ", disabled=" + this.disabled + ", error=" + this.error + ", style=" + this.style + ')';
    }

    public /* synthetic */ VerificationCheckboxItem(String str, Map map, String str2, Boolean bool, Boolean bool2, AttributedText attributedText, VerificationInnItem.Style style, int i12, C42822w c42822w) {
        this(str, map, str2, bool, bool2, attributedText, (i12 & 64) != 0 ? null : style);
    }
}
