package com.avito.android.loyalty.ui.items.text_item;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: LoyaltyTextItem.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/loyalty/ui/items/text_item/a;", "Lcom/avito/conveyor_item/a;", "_avito_loyalty_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class a implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f183745b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final AttributedText f183746c;

    public a(@k String str, @k AttributedText attributedText) {
        this.f183745b = str;
        this.f183746c = attributedText;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f183745b, aVar.f183745b) && L.f(this.f183746c, aVar.f183746c);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF82706b() {
        return getF440286b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF440286b() {
        return this.f183745b;
    }

    public final int hashCode() {
        return this.f183746c.hashCode() + (this.f183745b.hashCode() * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("LoyaltyTextItem(stringId=");
        sb2.append(this.f183745b);
        sb2.append(", text=");
        return com.avito.android.actions_sheet.a.w(sb2, this.f183746c, ')');
    }
}
