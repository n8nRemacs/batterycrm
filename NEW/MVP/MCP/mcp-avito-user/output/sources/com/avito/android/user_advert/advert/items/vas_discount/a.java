package com.avito.android.user_advert.advert.items.vas_discount;

import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: VasDiscountDescriptionItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_advert/advert/items/vas_discount/a;", "Lcom/avito/conveyor_item/a;", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class a implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f310347b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final AttributedText f310348c;

    public a(@Y61.k String str, @Y61.k AttributedText attributedText) {
        this.f310347b = str;
        this.f310348c = attributedText;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f310347b, aVar.f310347b) && L.f(this.f310348c, aVar.f310348c);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF250003b() {
        return getF12159b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId, reason: from getter */
    public final String getF12159b() {
        return this.f310347b;
    }

    public final int hashCode() {
        return this.f310348c.hashCode() + (this.f310347b.hashCode() * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("VasDiscountDescriptionItem(stringId=");
        sb2.append(this.f310347b);
        sb2.append(", discountDescription=");
        return com.avito.android.actions_sheet.a.w(sb2, this.f310348c, ')');
    }
}
