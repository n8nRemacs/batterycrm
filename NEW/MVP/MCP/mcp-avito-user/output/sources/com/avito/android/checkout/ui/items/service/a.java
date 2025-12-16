package com.avito.android.checkout.ui.items.service;

import Y61.l;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CheckoutServiceItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/checkout/ui/items/service/a;", "", "_avito_checkout_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f118483a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final String f118484b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final DeepLink f118485c;

    public a(@Y61.k String str, @l String str2, @Y61.k DeepLink deepLink) {
        this.f118483a = str;
        this.f118484b = str2;
        this.f118485c = deepLink;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f118483a, aVar.f118483a) && L.f(this.f118484b, aVar.f118484b) && L.f(this.f118485c, aVar.f118485c);
    }

    public final int hashCode() {
        int iHashCode = this.f118483a.hashCode() * 31;
        String str = this.f118484b;
        return this.f118485c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CheckoutServiceAction(icon=");
        sb2.append(this.f118483a);
        sb2.append(", color=");
        sb2.append(this.f118484b);
        sb2.append(", deeplink=");
        return com.avito.android.actions_sheet.a.v(sb2, this.f118485c, ')');
    }
}
