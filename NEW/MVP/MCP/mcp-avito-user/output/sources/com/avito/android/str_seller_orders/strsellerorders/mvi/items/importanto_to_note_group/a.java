package com.avito.android.str_seller_orders.strsellerorders.mvi.items.importanto_to_note_group;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ImportantToNoteGroupItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_seller_orders/strsellerorders/mvi/items/importanto_to_note_group/a;", "Lcom/avito/conveyor_item/a;", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class a implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f289977b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f289978c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f289979d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final AttributedText f289980e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final AttributedText f289981f;

    public a(@k String str, @k String str2, @l String str3, @l AttributedText attributedText, @l AttributedText attributedText2) {
        this.f289977b = str;
        this.f289978c = str2;
        this.f289979d = str3;
        this.f289980e = attributedText;
        this.f289981f = attributedText2;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f289977b, aVar.f289977b) && L.f(this.f289978c, aVar.f289978c) && L.f(this.f289979d, aVar.f289979d) && L.f(this.f289980e, aVar.f289980e) && L.f(this.f289981f, aVar.f289981f);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF189215e() {
        return getF289468c().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF289468c() {
        return this.f289977b;
    }

    public final int hashCode() {
        int iD2 = H.d(this.f289977b.hashCode() * 31, 31, this.f289978c);
        String str = this.f289979d;
        int iHashCode = (iD2 + (str == null ? 0 : str.hashCode())) * 31;
        AttributedText attributedText = this.f289980e;
        int iHashCode2 = (iHashCode + (attributedText == null ? 0 : attributedText.hashCode())) * 31;
        AttributedText attributedText2 = this.f289981f;
        return iHashCode2 + (attributedText2 != null ? attributedText2.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ImportantToNoteGroupItem(stringId=");
        sb2.append(this.f289977b);
        sb2.append(", groupId=");
        sb2.append(this.f289978c);
        sb2.append(", iconName=");
        sb2.append(this.f289979d);
        sb2.append(", title=");
        sb2.append(this.f289980e);
        sb2.append(", subtitle=");
        return com.avito.android.actions_sheet.a.w(sb2, this.f289981f, ')');
    }
}
