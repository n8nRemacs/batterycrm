package com.avito.android.user_advert.advert.items.availableStocks;

import Y61.k;
import Y61.l;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AvailableStocksItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_advert/advert/items/availableStocks/a;", "Lcom/avito/conveyor_item/a;", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class a implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f309261b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final AttributedText f309262c;

    public a(@k String str, @k AttributedText attributedText) {
        this.f309261b = str;
        this.f309262c = attributedText;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f309261b, aVar.f309261b) && L.f(this.f309262c, aVar.f309262c);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF250003b() {
        return getF309261b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF309261b() {
        return this.f309261b;
    }

    public final int hashCode() {
        return this.f309262c.hashCode() + (this.f309261b.hashCode() * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AvailableStocksItem(stringId=");
        sb2.append(this.f309261b);
        sb2.append(", text=");
        return com.avito.android.actions_sheet.a.w(sb2, this.f309262c, ')');
    }
}
