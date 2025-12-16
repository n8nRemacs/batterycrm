package com.avito.android.remote.model.inn.items;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import com.avito.android.actions_sheet.a;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.inn.items.VerificationInnItem;
import com.avito.android.remote.model.text.AttributedText;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: VerificationBannerItem.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\tHÆ\u0003J?\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cHÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0002\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0018\u0010\b\u001a\u0004\u0018\u00010\t8\u0016X\u0097\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006 "}, d2 = {"Lcom/avito/android/remote/model/inn/items/VerificationBannerItem;", "Lcom/avito/android/remote/model/inn/items/VerificationInnItem;", "id", "", "text", "Lcom/avito/android/remote/model/text/AttributedText;", "preset", "backgroundColor", BeduinPromoBlockModel.SERIALIZED_NAME_STYLE, "Lcom/avito/android/remote/model/inn/items/VerificationInnItem$Style;", "(Ljava/lang/String;Lcom/avito/android/remote/model/text/AttributedText;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/inn/items/VerificationInnItem$Style;)V", "getBackgroundColor", "()Ljava/lang/String;", "getId", "getPreset", "getStyle", "()Lcom/avito/android/remote/model/inn/items/VerificationInnItem$Style;", "getText", "()Lcom/avito/android/remote/model/text/AttributedText;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", PluralsKeys.OTHER, "", "hashCode", "", "toString", "_avito-discouraged_avito-api_verification"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class VerificationBannerItem implements VerificationInnItem {

    @c("backgroundColor")
    @l
    private final String backgroundColor;

    @c("id")
    @k
    private final String id;

    @c("preset")
    @k
    private final String preset;

    @c(BeduinPromoBlockModel.SERIALIZED_NAME_STYLE)
    @l
    private final VerificationInnItem.Style style;

    @c("text")
    @k
    private final AttributedText text;

    public VerificationBannerItem(@k String str, @k AttributedText attributedText, @k String str2, @l String str3, @l VerificationInnItem.Style style) {
        this.id = str;
        this.text = attributedText;
        this.preset = str2;
        this.backgroundColor = str3;
        this.style = style;
    }

    public static /* synthetic */ VerificationBannerItem copy$default(VerificationBannerItem verificationBannerItem, String str, AttributedText attributedText, String str2, String str3, VerificationInnItem.Style style, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = verificationBannerItem.id;
        }
        if ((i12 & 2) != 0) {
            attributedText = verificationBannerItem.text;
        }
        AttributedText attributedText2 = attributedText;
        if ((i12 & 4) != 0) {
            str2 = verificationBannerItem.preset;
        }
        String str4 = str2;
        if ((i12 & 8) != 0) {
            str3 = verificationBannerItem.backgroundColor;
        }
        String str5 = str3;
        if ((i12 & 16) != 0) {
            style = verificationBannerItem.style;
        }
        return verificationBannerItem.copy(str, attributedText2, str4, str5, style);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @k
    /* renamed from: component2, reason: from getter */
    public final AttributedText getText() {
        return this.text;
    }

    @k
    /* renamed from: component3, reason: from getter */
    public final String getPreset() {
        return this.preset;
    }

    @l
    /* renamed from: component4, reason: from getter */
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    @l
    /* renamed from: component5, reason: from getter */
    public final VerificationInnItem.Style getStyle() {
        return this.style;
    }

    @k
    public final VerificationBannerItem copy(@k String id2, @k AttributedText text, @k String preset, @l String backgroundColor, @l VerificationInnItem.Style style) {
        return new VerificationBannerItem(id2, text, preset, backgroundColor, style);
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VerificationBannerItem)) {
            return false;
        }
        VerificationBannerItem verificationBannerItem = (VerificationBannerItem) other;
        return L.f(this.id, verificationBannerItem.id) && L.f(this.text, verificationBannerItem.text) && L.f(this.preset, verificationBannerItem.preset) && L.f(this.backgroundColor, verificationBannerItem.backgroundColor) && L.f(this.style, verificationBannerItem.style);
    }

    @l
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    @Override // com.avito.android.remote.model.inn.items.VerificationInnItem
    @k
    public String getId() {
        return this.id;
    }

    @k
    public final String getPreset() {
        return this.preset;
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

    public int hashCode() {
        int iD2 = H.d(a.b(this.id.hashCode() * 31, 31, this.text), 31, this.preset);
        String str = this.backgroundColor;
        int iHashCode = (iD2 + (str == null ? 0 : str.hashCode())) * 31;
        VerificationInnItem.Style style = this.style;
        return iHashCode + (style != null ? style.hashCode() : 0);
    }

    @k
    public String toString() {
        return "VerificationBannerItem(id=" + this.id + ", text=" + this.text + ", preset=" + this.preset + ", backgroundColor=" + this.backgroundColor + ", style=" + this.style + ')';
    }

    public /* synthetic */ VerificationBannerItem(String str, AttributedText attributedText, String str2, String str3, VerificationInnItem.Style style, int i12, C42822w c42822w) {
        this(str, attributedText, str2, str3, (i12 & 16) != 0 ? null : style);
    }
}
