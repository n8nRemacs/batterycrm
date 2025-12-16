package com.avito.android.checkout.ui.items.price;

import Y61.k;
import Y61.l;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CheckoutPriceItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/checkout/ui/items/price/j;", "", "_avito_checkout_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class j {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final AttributedText f118437a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final AttributedText f118438b;

    public j(@k AttributedText attributedText, @k AttributedText attributedText2) {
        this.f118437a = attributedText;
        this.f118438b = attributedText2;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return L.f(this.f118437a, jVar.f118437a) && L.f(this.f118438b, jVar.f118438b);
    }

    public final int hashCode() {
        return this.f118438b.hashCode() + (this.f118437a.hashCode() * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DropDownPriceItem(title=");
        sb2.append(this.f118437a);
        sb2.append(", price=");
        return com.avito.android.actions_sheet.a.w(sb2, this.f118438b, ')');
    }
}
