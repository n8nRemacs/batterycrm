package com.avito.android.tariff.cpa.info.ui.items.balance_info;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: BalanceInfoItem.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/tariff/cpa/info/ui/items/balance_info/b;", "Lcom/avito/conveyor_item/a;", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class b implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f294814b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f294815c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f294816d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final String f294817e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final a f294818f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f294819g;

    public b(@k String str, @k String str2, @k String str3, @l String str4, @l a aVar, boolean z12) {
        this.f294814b = str;
        this.f294815c = str2;
        this.f294816d = str3;
        this.f294817e = str4;
        this.f294818f = aVar;
        this.f294819g = z12;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return L.f(this.f294814b, bVar.f294814b) && L.f(this.f294815c, bVar.f294815c) && L.f(this.f294816d, bVar.f294816d) && L.f(this.f294817e, bVar.f294817e) && L.f(this.f294818f, bVar.f294818f) && this.f294819g == bVar.f294819g;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF268996b() {
        return getF294814b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF294814b() {
        return this.f294814b;
    }

    public final int hashCode() {
        int iD2 = H.d(H.d(this.f294814b.hashCode() * 31, 31, this.f294815c), 31, this.f294816d);
        String str = this.f294817e;
        int iHashCode = (iD2 + (str == null ? 0 : str.hashCode())) * 31;
        a aVar = this.f294818f;
        return Boolean.hashCode(this.f294819g) + ((iHashCode + (aVar != null ? aVar.hashCode() : 0)) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BalanceInfoItem(stringId=");
        sb2.append(this.f294814b);
        sb2.append(", title=");
        sb2.append(this.f294815c);
        sb2.append(", price=");
        sb2.append(this.f294816d);
        sb2.append(", buttonTitle=");
        sb2.append(this.f294817e);
        sb2.append(", bsData=");
        sb2.append(this.f294818f);
        sb2.append(", isProgress=");
        return r.x(sb2, this.f294819g, ')');
    }
}
