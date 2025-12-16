package com.avito.android.comfortable_deal.deal.item.seller;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import androidx.media3.common.C23088b;
import com.avito.android.deep_linking.links.DeepLink;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SellerItem.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/comfortable_deal/deal/item/seller/e;", "Lcom/avito/conveyor_item/a;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class e implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @l
    public final String f121486b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f121487c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f121488d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final String f121489e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final Object f121490f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final Object f121491g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final DeepLink f121492h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f121493i;

    public e(@l String str, @k String str2, @k String str3, @k String str4, @k List list, @k List list2, @l DeepLink deepLink, boolean z12) {
        this.f121486b = str;
        this.f121487c = str2;
        this.f121488d = str3;
        this.f121489e = str4;
        this.f121490f = list;
        this.f121491g = list2;
        this.f121492h = deepLink;
        this.f121493i = z12;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        eVar.getClass();
        return L.f(this.f121486b, eVar.f121486b) && L.f(this.f121487c, eVar.f121487c) && L.f(this.f121488d, eVar.f121488d) && L.f(this.f121489e, eVar.f121489e) && L.f(this.f121490f, eVar.f121490f) && L.f(this.f121491g, eVar.f121491g) && L.f(this.f121492h, eVar.f121492h) && this.f121493i == eVar.f121493i;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF80616b() {
        return 1247656915;
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId */
    public final String getF84868c() {
        return "seller_item";
    }

    public final int hashCode() {
        String str = this.f121486b;
        int iA2 = C23088b.a(C23088b.a(H.d(H.d(H.d((22658701 + (str == null ? 0 : str.hashCode())) * 31, 31, this.f121487c), 31, this.f121488d), 31, this.f121489e), 31, this.f121490f), 31, this.f121491g);
        DeepLink deepLink = this.f121492h;
        return Boolean.hashCode(this.f121493i) + ((iA2 + (deepLink != null ? deepLink.hashCode() : 0)) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SellerItem(stringId=seller_item, sellerItemId=");
        sb2.append(this.f121486b);
        sb2.append(", price=");
        sb2.append(this.f121487c);
        sb2.append(", title=");
        sb2.append(this.f121488d);
        sb2.append(", address=");
        sb2.append(this.f121489e);
        sb2.append(", geoReferences=");
        sb2.append(this.f121490f);
        sb2.append(", images=");
        sb2.append(this.f121491g);
        sb2.append(", deeplink=");
        sb2.append(this.f121492h);
        sb2.append(", isAverageMarketPrice=");
        return r.x(sb2, this.f121493i, ')');
    }
}
