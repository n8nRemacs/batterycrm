package com.avito.android.comfortable_deal.deal.item.seller;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SellerItem.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/comfortable_deal/deal/item/seller/a;", "", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class a {

    /* renamed from: a, reason: collision with root package name */
    @l
    public final String f121476a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final String f121477b;

    public a(@l String str, @l String str2) {
        this.f121476a = str;
        this.f121477b = str2;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f121476a, aVar.f121476a) && L.f(this.f121477b, aVar.f121477b);
    }

    public final int hashCode() {
        String str = this.f121476a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f121477b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AfterWithIcon(iconName=");
        sb2.append(this.f121476a);
        sb2.append(", text=");
        return C22026a.c(sb2, this.f121477b, ')');
    }
}
