package com.avito.android.checkout.ui.items.header;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CheckoutHeaderItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/checkout/ui/items/header/a;", "Lcom/avito/conveyor_item/a;", "_avito_checkout_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class a implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f118398b;

    public a(@k String str) {
        this.f118398b = str;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        aVar.getClass();
        return L.f(this.f118398b, aVar.f118398b);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF113526b() {
        return 1139510726;
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId */
    public final String getF115873b() {
        return "key_checkout_header";
    }

    public final int hashCode() {
        return this.f118398b.hashCode() + 965094138;
    }

    @k
    public final String toString() {
        return C22026a.c(new StringBuilder("CheckoutHeaderItem(stringId=key_checkout_header, title="), this.f118398b, ')');
    }
}
