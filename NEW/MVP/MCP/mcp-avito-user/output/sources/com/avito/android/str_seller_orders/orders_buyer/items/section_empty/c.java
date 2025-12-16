package com.avito.android.str_seller_orders.orders_buyer.items.section_empty;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SectionEmptyItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_seller_orders/orders_buyer/items/section_empty/c;", "Lcom/avito/conveyor_item/a;", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class c implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @l
    public final String f289055b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f289056c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final DeepLink f289057d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final String f289058e;

    public c(@l String str, @l String str2, @l DeepLink deepLink, @k String str3) {
        this.f289055b = str;
        this.f289056c = str2;
        this.f289057d = deepLink;
        this.f289058e = str3;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return L.f(this.f289055b, cVar.f289055b) && L.f(this.f289056c, cVar.f289056c) && L.f(this.f289057d, cVar.f289057d) && L.f(this.f289058e, cVar.f289058e);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF268996b() {
        return getF289007d().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF289007d() {
        return this.f289058e;
    }

    public final int hashCode() {
        String str = this.f289055b;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f289056c;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        DeepLink deepLink = this.f289057d;
        return this.f289058e.hashCode() + ((iHashCode2 + (deepLink != null ? deepLink.hashCode() : 0)) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SectionEmptyItem(description=");
        sb2.append(this.f289055b);
        sb2.append(", buttonText=");
        sb2.append(this.f289056c);
        sb2.append(", deeplink=");
        sb2.append(this.f289057d);
        sb2.append(", stringId=");
        return C22026a.c(sb2, this.f289058e, ')');
    }
}
