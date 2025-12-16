package com.avito.android.advert_core.discount.item.discount;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.avito.android.advert_core.discount.item.AdvertDiscountItem;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: DiscountItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert_core/discount/item/discount/a;", "Lcom/avito/conveyor_item/a;", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class a implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f83362b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f83363c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f83364d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final String f83365e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final String f83366f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f83367g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f83368h;

    public a(String str, String str2, String str3, String str4, String str5, boolean z12, boolean z13, int i12, C42822w c42822w) {
        if ((i12 & 1) != 0) {
            AdvertDiscountItem[] advertDiscountItemArr = AdvertDiscountItem.f83348b;
            str = String.valueOf(2);
        }
        str4 = (i12 & 8) != 0 ? null : str4;
        str5 = (i12 & 16) != 0 ? null : str5;
        z12 = (i12 & 32) != 0 ? false : z12;
        z13 = (i12 & 64) != 0 ? false : z13;
        this.f83362b = str;
        this.f83363c = str2;
        this.f83364d = str3;
        this.f83365e = str4;
        this.f83366f = str5;
        this.f83367g = z12;
        this.f83368h = z13;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f83362b, aVar.f83362b) && L.f(this.f83363c, aVar.f83363c) && L.f(this.f83364d, aVar.f83364d) && L.f(this.f83365e, aVar.f83365e) && L.f(this.f83366f, aVar.f83366f) && this.f83367g == aVar.f83367g && this.f83368h == aVar.f83368h;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF83558b() {
        return getF73320d().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF73320d() {
        return this.f83362b;
    }

    public final int hashCode() {
        int iD2 = H.d(H.d(this.f83362b.hashCode() * 31, 31, this.f83363c), 31, this.f83364d);
        String str = this.f83365e;
        int iHashCode = (iD2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f83366f;
        return Boolean.hashCode(this.f83368h) + r.i((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.f83367g);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DiscountItem(stringId=");
        sb2.append(this.f83362b);
        sb2.append(", title=");
        sb2.append(this.f83363c);
        sb2.append(", value=");
        sb2.append(this.f83364d);
        sb2.append(", valueColorName=");
        sb2.append(this.f83365e);
        sb2.append(", description=");
        sb2.append(this.f83366f);
        sb2.append(", boldValue=");
        sb2.append(this.f83367g);
        sb2.append(", boldTitle=");
        return r.x(sb2, this.f83368h, ')');
    }
}
