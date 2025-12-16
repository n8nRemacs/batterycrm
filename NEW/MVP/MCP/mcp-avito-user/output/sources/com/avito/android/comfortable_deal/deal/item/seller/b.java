package com.avito.android.comfortable_deal.deal.item.seller;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SellerItem.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/comfortable_deal/deal/item/seller/b;", "", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final List<String> f121478a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final String f121479b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f121480c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final a f121481d;

    public b(@k List<String> list, @l String str, @l String str2, @l a aVar) {
        this.f121478a = list;
        this.f121479b = str;
        this.f121480c = str2;
        this.f121481d = aVar;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return L.f(this.f121478a, bVar.f121478a) && L.f(this.f121479b, bVar.f121479b) && L.f(this.f121480c, bVar.f121480c) && L.f(this.f121481d, bVar.f121481d);
    }

    public final int hashCode() {
        int iHashCode = this.f121478a.hashCode() * 31;
        String str = this.f121479b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f121480c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        a aVar = this.f121481d;
        return iHashCode3 + (aVar != null ? aVar.hashCode() : 0);
    }

    @k
    public final String toString() {
        return "GeoReference(colors=" + this.f121478a + ", content=" + this.f121479b + ", after=" + this.f121480c + ", afterWithIcon=" + this.f121481d + ')';
    }
}
