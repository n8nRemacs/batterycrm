package com.avito.android.remote.model.inn.items;

import Y61.k;
import Y61.l;
import com.avito.android.actions_sheet.a;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.inn.items.VerificationInnItem;
import com.avito.android.remote.model.text.AttributedText;
import com.google.gson.annotations.c;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: VerificationTextItem.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B]\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0016\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0002\u0010\u000eJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\u0017\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J\t\u0010\u001c\u001a\u00020\bHÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\rHÆ\u0003Je\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0016\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\rHÆ\u0001J\u0013\u0010\"\u001a\u00020\u00062\b\u0010#\u001a\u0004\u0018\u00010$HÖ\u0003J\t\u0010%\u001a\u00020&HÖ\u0001J\t\u0010'\u001a\u00020\u0003HÖ\u0001R$\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0002\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0018\u0010\f\u001a\u0004\u0018\u00010\r8\u0016X\u0097\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0012R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0012R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0012¨\u0006("}, d2 = {"Lcom/avito/android/remote/model/inn/items/VerificationTextItem;", "Lcom/avito/android/remote/model/inn/items/VerificationInnItem;", "id", "", "hiddenIf", "", "", "text", "Lcom/avito/android/remote/model/text/AttributedText;", "value", "textStyle", "textColor", BeduinPromoBlockModel.SERIALIZED_NAME_STYLE, "Lcom/avito/android/remote/model/inn/items/VerificationInnItem$Style;", "(Ljava/lang/String;Ljava/util/Map;Lcom/avito/android/remote/model/text/AttributedText;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/inn/items/VerificationInnItem$Style;)V", "getHiddenIf", "()Ljava/util/Map;", "getId", "()Ljava/lang/String;", "getStyle", "()Lcom/avito/android/remote/model/inn/items/VerificationInnItem$Style;", "getText", "()Lcom/avito/android/remote/model/text/AttributedText;", "getTextColor", "getTextStyle", "getValue", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", PluralsKeys.OTHER, "", "hashCode", "", "toString", "_avito-discouraged_avito-api_verification"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class VerificationTextItem implements VerificationInnItem {

    @c("hiddenIf")
    @l
    private final Map<String, Boolean> hiddenIf;

    @c("id")
    @k
    private final String id;

    @c(BeduinPromoBlockModel.SERIALIZED_NAME_STYLE)
    @l
    private final VerificationInnItem.Style style;

    @c("text")
    @k
    private final AttributedText text;

    @c("textColor")
    @l
    private final String textColor;

    @c("textStyle")
    @l
    private final String textStyle;

    @c("value")
    @l
    private final String value;

    public VerificationTextItem(@k String str, @l Map<String, Boolean> map, @k AttributedText attributedText, @l String str2, @l String str3, @l String str4, @l VerificationInnItem.Style style) {
        this.id = str;
        this.hiddenIf = map;
        this.text = attributedText;
        this.value = str2;
        this.textStyle = str3;
        this.textColor = str4;
        this.style = style;
    }

    public static /* synthetic */ VerificationTextItem copy$default(VerificationTextItem verificationTextItem, String str, Map map, AttributedText attributedText, String str2, String str3, String str4, VerificationInnItem.Style style, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = verificationTextItem.id;
        }
        if ((i12 & 2) != 0) {
            map = verificationTextItem.hiddenIf;
        }
        Map map2 = map;
        if ((i12 & 4) != 0) {
            attributedText = verificationTextItem.text;
        }
        AttributedText attributedText2 = attributedText;
        if ((i12 & 8) != 0) {
            str2 = verificationTextItem.value;
        }
        String str5 = str2;
        if ((i12 & 16) != 0) {
            str3 = verificationTextItem.textStyle;
        }
        String str6 = str3;
        if ((i12 & 32) != 0) {
            str4 = verificationTextItem.textColor;
        }
        String str7 = str4;
        if ((i12 & 64) != 0) {
            style = verificationTextItem.style;
        }
        return verificationTextItem.copy(str, map2, attributedText2, str5, str6, str7, style);
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
    public final AttributedText getText() {
        return this.text;
    }

    @l
    /* renamed from: component4, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    @l
    /* renamed from: component5, reason: from getter */
    public final String getTextStyle() {
        return this.textStyle;
    }

    @l
    /* renamed from: component6, reason: from getter */
    public final String getTextColor() {
        return this.textColor;
    }

    @l
    /* renamed from: component7, reason: from getter */
    public final VerificationInnItem.Style getStyle() {
        return this.style;
    }

    @k
    public final VerificationTextItem copy(@k String id2, @l Map<String, Boolean> hiddenIf, @k AttributedText text, @l String value, @l String textStyle, @l String textColor, @l VerificationInnItem.Style style) {
        return new VerificationTextItem(id2, hiddenIf, text, value, textStyle, textColor, style);
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VerificationTextItem)) {
            return false;
        }
        VerificationTextItem verificationTextItem = (VerificationTextItem) other;
        return L.f(this.id, verificationTextItem.id) && L.f(this.hiddenIf, verificationTextItem.hiddenIf) && L.f(this.text, verificationTextItem.text) && L.f(this.value, verificationTextItem.value) && L.f(this.textStyle, verificationTextItem.textStyle) && L.f(this.textColor, verificationTextItem.textColor) && L.f(this.style, verificationTextItem.style);
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
    public final AttributedText getText() {
        return this.text;
    }

    @l
    public final String getTextColor() {
        return this.textColor;
    }

    @l
    public final String getTextStyle() {
        return this.textStyle;
    }

    @l
    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        int iHashCode = this.id.hashCode() * 31;
        Map<String, Boolean> map = this.hiddenIf;
        int iB2 = a.b((iHashCode + (map == null ? 0 : map.hashCode())) * 31, 31, this.text);
        String str = this.value;
        int iHashCode2 = (iB2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.textStyle;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.textColor;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        VerificationInnItem.Style style = this.style;
        return iHashCode4 + (style != null ? style.hashCode() : 0);
    }

    @k
    public String toString() {
        return "VerificationTextItem(id=" + this.id + ", hiddenIf=" + this.hiddenIf + ", text=" + this.text + ", value=" + this.value + ", textStyle=" + this.textStyle + ", textColor=" + this.textColor + ", style=" + this.style + ')';
    }

    public /* synthetic */ VerificationTextItem(String str, Map map, AttributedText attributedText, String str2, String str3, String str4, VerificationInnItem.Style style, int i12, C42822w c42822w) {
        this(str, (i12 & 2) != 0 ? null : map, attributedText, (i12 & 8) != 0 ? null : str2, (i12 & 16) != 0 ? null : str3, (i12 & 32) != 0 ? null : str4, (i12 & 64) != 0 ? null : style);
    }
}
