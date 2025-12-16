package com.avito.android.user_advert.advert.items.sales_contract;

import android.net.Uri;
import androidx.compose.foundation.H;
import androidx.media3.exoplayer.analytics.m;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.user_advert.event.SalesContractFromPage;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SalesContractItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_advert/advert/items/sales_contract/a;", "Lcom/avito/conveyor_item/a;", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class a implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f310100b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f310101c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final String f310102d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final String f310103e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final DeepLink f310104f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final Uri f310105g;

    public a(@Y61.k String str, @Y61.k String str2, @Y61.l String str3, @Y61.l String str4, @Y61.l DeepLink deepLink, @Y61.k Uri uri) {
        SalesContractFromPage salesContractFromPage = SalesContractFromPage.f311817b;
        this.f310100b = str;
        this.f310101c = str2;
        this.f310102d = str3;
        this.f310103e = str4;
        this.f310104f = deepLink;
        this.f310105g = uri;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (!L.f(this.f310100b, aVar.f310100b) || !L.f(this.f310101c, aVar.f310101c) || !L.f(this.f310102d, aVar.f310102d) || !L.f(this.f310103e, aVar.f310103e) || !L.f(this.f310104f, aVar.f310104f) || !this.f310105g.equals(aVar.f310105g)) {
            return false;
        }
        SalesContractFromPage salesContractFromPage = SalesContractFromPage.f311817b;
        return true;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF83595b() {
        return getF310100b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId, reason: from getter */
    public final String getF310100b() {
        return this.f310100b;
    }

    public final int hashCode() {
        int iD2 = H.d(this.f310100b.hashCode() * 31, 31, this.f310101c);
        String str = this.f310102d;
        int iHashCode = (iD2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f310103e;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        DeepLink deepLink = this.f310104f;
        return SalesContractFromPage.f311817b.hashCode() + m.e(this.f310105g, (iHashCode2 + (deepLink != null ? deepLink.hashCode() : 0)) * 31, 31);
    }

    @Y61.k
    public final String toString() {
        return "SalesContractItem(stringId=" + this.f310100b + ", advertId=" + this.f310101c + ", title=" + this.f310102d + ", linkText=" + this.f310103e + ", deepLink=" + this.f310104f + ", url=" + this.f310105g + ", fromPage=" + SalesContractFromPage.f311817b + ')';
    }
}
