package com.avito.android.remote.model.inn.items;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.inn.items.VerificationInnItem;
import com.google.gson.annotations.c;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: VerificationInnInfoItem.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0002\u0010\fJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\u0017\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0016J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u000bHÆ\u0003J^\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0016\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bHÆ\u0001¢\u0006\u0002\u0010\u001fJ\u0013\u0010 \u001a\u00020\u00062\b\u0010!\u001a\u0004\u0018\u00010\"HÖ\u0003J\t\u0010#\u001a\u00020$HÖ\u0001J\t\u0010%\u001a\u00020\u0003HÖ\u0001R$\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0002\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0018\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0016X\u0097\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u001a\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0015\u0010\u0016¨\u0006&"}, d2 = {"Lcom/avito/android/remote/model/inn/items/VerificationInnInfoItem;", "Lcom/avito/android/remote/model/inn/items/VerificationInnItem;", "id", "", "hiddenIf", "", "", "title", "value", "withButton", BeduinPromoBlockModel.SERIALIZED_NAME_STYLE, "Lcom/avito/android/remote/model/inn/items/VerificationInnItem$Style;", "(Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lcom/avito/android/remote/model/inn/items/VerificationInnItem$Style;)V", "getHiddenIf", "()Ljava/util/Map;", "getId", "()Ljava/lang/String;", "getStyle", "()Lcom/avito/android/remote/model/inn/items/VerificationInnItem$Style;", "getTitle", "getValue", "getWithButton", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lcom/avito/android/remote/model/inn/items/VerificationInnItem$Style;)Lcom/avito/android/remote/model/inn/items/VerificationInnInfoItem;", "equals", PluralsKeys.OTHER, "", "hashCode", "", "toString", "_avito-discouraged_avito-api_verification"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class VerificationInnInfoItem implements VerificationInnItem {

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
    private final String value;

    @c("withButton")
    @l
    private final Boolean withButton;

    public VerificationInnInfoItem(@k String str, @l Map<String, Boolean> map, @k String str2, @l String str3, @l Boolean bool, @l VerificationInnItem.Style style) {
        this.id = str;
        this.hiddenIf = map;
        this.title = str2;
        this.value = str3;
        this.withButton = bool;
        this.style = style;
    }

    public static /* synthetic */ VerificationInnInfoItem copy$default(VerificationInnInfoItem verificationInnInfoItem, String str, Map map, String str2, String str3, Boolean bool, VerificationInnItem.Style style, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = verificationInnInfoItem.id;
        }
        if ((i12 & 2) != 0) {
            map = verificationInnInfoItem.hiddenIf;
        }
        Map map2 = map;
        if ((i12 & 4) != 0) {
            str2 = verificationInnInfoItem.title;
        }
        String str4 = str2;
        if ((i12 & 8) != 0) {
            str3 = verificationInnInfoItem.value;
        }
        String str5 = str3;
        if ((i12 & 16) != 0) {
            bool = verificationInnInfoItem.withButton;
        }
        Boolean bool2 = bool;
        if ((i12 & 32) != 0) {
            style = verificationInnInfoItem.style;
        }
        return verificationInnInfoItem.copy(str, map2, str4, str5, bool2, style);
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
    public final String getValue() {
        return this.value;
    }

    @l
    /* renamed from: component5, reason: from getter */
    public final Boolean getWithButton() {
        return this.withButton;
    }

    @l
    /* renamed from: component6, reason: from getter */
    public final VerificationInnItem.Style getStyle() {
        return this.style;
    }

    @k
    public final VerificationInnInfoItem copy(@k String id2, @l Map<String, Boolean> hiddenIf, @k String title, @l String value, @l Boolean withButton, @l VerificationInnItem.Style style) {
        return new VerificationInnInfoItem(id2, hiddenIf, title, value, withButton, style);
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VerificationInnInfoItem)) {
            return false;
        }
        VerificationInnInfoItem verificationInnInfoItem = (VerificationInnInfoItem) other;
        return L.f(this.id, verificationInnInfoItem.id) && L.f(this.hiddenIf, verificationInnInfoItem.hiddenIf) && L.f(this.title, verificationInnInfoItem.title) && L.f(this.value, verificationInnInfoItem.value) && L.f(this.withButton, verificationInnInfoItem.withButton) && L.f(this.style, verificationInnInfoItem.style);
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
    public final String getValue() {
        return this.value;
    }

    @l
    public final Boolean getWithButton() {
        return this.withButton;
    }

    public int hashCode() {
        int iHashCode = this.id.hashCode() * 31;
        Map<String, Boolean> map = this.hiddenIf;
        int iD2 = H.d((iHashCode + (map == null ? 0 : map.hashCode())) * 31, 31, this.title);
        String str = this.value;
        int iHashCode2 = (iD2 + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.withButton;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        VerificationInnItem.Style style = this.style;
        return iHashCode3 + (style != null ? style.hashCode() : 0);
    }

    @k
    public String toString() {
        return "VerificationInnInfoItem(id=" + this.id + ", hiddenIf=" + this.hiddenIf + ", title=" + this.title + ", value=" + this.value + ", withButton=" + this.withButton + ", style=" + this.style + ')';
    }

    public /* synthetic */ VerificationInnInfoItem(String str, Map map, String str2, String str3, Boolean bool, VerificationInnItem.Style style, int i12, C42822w c42822w) {
        this(str, map, str2, str3, bool, (i12 & 32) != 0 ? null : style);
    }
}
