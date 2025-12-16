package com.avito.android.remote.model.inn.items;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.publish.drafts.LocalPublishState;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.inn.items.VerificationInnItem;
import com.google.gson.annotations.c;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: VerificationDisclosureItem.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0002\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\u0017\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00010\tHÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u000bHÆ\u0003JQ\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0016\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00032\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bHÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u00062\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eHÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR$\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0002\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0018\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0016X\u0097\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012¨\u0006\""}, d2 = {"Lcom/avito/android/remote/model/inn/items/VerificationDisclosureItem;", "Lcom/avito/android/remote/model/inn/items/VerificationInnItem;", "id", "", "hiddenIf", "", "", "title", LocalPublishState.FIELDS, "", BeduinPromoBlockModel.SERIALIZED_NAME_STYLE, "Lcom/avito/android/remote/model/inn/items/VerificationInnItem$Style;", "(Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/util/List;Lcom/avito/android/remote/model/inn/items/VerificationInnItem$Style;)V", "getFields", "()Ljava/util/List;", "getHiddenIf", "()Ljava/util/Map;", "getId", "()Ljava/lang/String;", "getStyle", "()Lcom/avito/android/remote/model/inn/items/VerificationInnItem$Style;", "getTitle", "component1", "component2", "component3", "component4", "component5", "copy", "equals", PluralsKeys.OTHER, "", "hashCode", "", "toString", "_avito-discouraged_avito-api_verification"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class VerificationDisclosureItem implements VerificationInnItem {

    @c(LocalPublishState.FIELDS)
    @k
    private final List<VerificationInnItem> fields;

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

    /* JADX WARN: Multi-variable type inference failed */
    public VerificationDisclosureItem(@k String str, @l Map<String, Boolean> map, @k String str2, @k List<? extends VerificationInnItem> list, @l VerificationInnItem.Style style) {
        this.id = str;
        this.hiddenIf = map;
        this.title = str2;
        this.fields = list;
        this.style = style;
    }

    public static /* synthetic */ VerificationDisclosureItem copy$default(VerificationDisclosureItem verificationDisclosureItem, String str, Map map, String str2, List list, VerificationInnItem.Style style, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = verificationDisclosureItem.id;
        }
        if ((i12 & 2) != 0) {
            map = verificationDisclosureItem.hiddenIf;
        }
        Map map2 = map;
        if ((i12 & 4) != 0) {
            str2 = verificationDisclosureItem.title;
        }
        String str3 = str2;
        if ((i12 & 8) != 0) {
            list = verificationDisclosureItem.fields;
        }
        List list2 = list;
        if ((i12 & 16) != 0) {
            style = verificationDisclosureItem.style;
        }
        return verificationDisclosureItem.copy(str, map2, str3, list2, style);
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

    @k
    public final List<VerificationInnItem> component4() {
        return this.fields;
    }

    @l
    /* renamed from: component5, reason: from getter */
    public final VerificationInnItem.Style getStyle() {
        return this.style;
    }

    @k
    public final VerificationDisclosureItem copy(@k String id2, @l Map<String, Boolean> hiddenIf, @k String title, @k List<? extends VerificationInnItem> fields, @l VerificationInnItem.Style style) {
        return new VerificationDisclosureItem(id2, hiddenIf, title, fields, style);
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VerificationDisclosureItem)) {
            return false;
        }
        VerificationDisclosureItem verificationDisclosureItem = (VerificationDisclosureItem) other;
        return L.f(this.id, verificationDisclosureItem.id) && L.f(this.hiddenIf, verificationDisclosureItem.hiddenIf) && L.f(this.title, verificationDisclosureItem.title) && L.f(this.fields, verificationDisclosureItem.fields) && L.f(this.style, verificationDisclosureItem.style);
    }

    @k
    public final List<VerificationInnItem> getFields() {
        return this.fields;
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

    public int hashCode() {
        int iHashCode = this.id.hashCode() * 31;
        Map<String, Boolean> map = this.hiddenIf;
        int iE2 = H.e(H.d((iHashCode + (map == null ? 0 : map.hashCode())) * 31, 31, this.title), 31, this.fields);
        VerificationInnItem.Style style = this.style;
        return iE2 + (style != null ? style.hashCode() : 0);
    }

    @k
    public String toString() {
        return "VerificationDisclosureItem(id=" + this.id + ", hiddenIf=" + this.hiddenIf + ", title=" + this.title + ", fields=" + this.fields + ", style=" + this.style + ')';
    }

    public /* synthetic */ VerificationDisclosureItem(String str, Map map, String str2, List list, VerificationInnItem.Style style, int i12, C42822w c42822w) {
        this(str, map, str2, list, (i12 & 16) != 0 ? null : style);
    }
}
