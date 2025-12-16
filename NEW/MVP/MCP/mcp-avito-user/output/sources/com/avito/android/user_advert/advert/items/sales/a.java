package com.avito.android.user_advert.advert.items.sales;

import Y61.k;
import Y61.l;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SaleInfoItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_advert/advert/items/sales/a;", "Lcom/avito/conveyor_item/a;", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class a implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f310092b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final AttributedText f310093c;

    public a(@k String str, @k AttributedText attributedText) {
        this.f310092b = str;
        this.f310093c = attributedText;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f310092b, aVar.f310092b) && L.f(this.f310093c, aVar.f310093c);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF250003b() {
        return getF309490b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF309490b() {
        return this.f310092b;
    }

    public final int hashCode() {
        return this.f310093c.hashCode() + (this.f310092b.hashCode() * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SaleInfoItem(stringId=");
        sb2.append(this.f310092b);
        sb2.append(", text=");
        return com.avito.android.actions_sheet.a.w(sb2, this.f310093c, ')');
    }
}
