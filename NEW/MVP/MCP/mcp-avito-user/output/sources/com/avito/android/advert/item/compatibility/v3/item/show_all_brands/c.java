package com.avito.android.advert.item.compatibility.v3.item.show_all_brands;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.advert.item.spare_parts.data.SparePartsGroup;
import com.avito.conveyor_item.a;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ShowAllBrandsItem.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/compatibility/v3/item/show_all_brands/c;", "Lcom/avito/android/advert/item/compatibility/v3/item/show_all_brands/d;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class c implements d {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f74447b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final SparePartsGroup f74448c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f74449d;

    public c(String str, SparePartsGroup sparePartsGroup, String str2, int i12, C42822w c42822w) {
        this.f74447b = (i12 & 1) != 0 ? UUID.randomUUID().toString() : str;
        this.f74448c = sparePartsGroup;
        this.f74449d = str2;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return L.f(this.f74447b, cVar.f74447b) && L.f(this.f74448c, cVar.f74448c) && L.f(this.f74449d, cVar.f74449d);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF83733q() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF285028b() {
        return this.f74447b;
    }

    @Override // com.avito.android.advert.item.compatibility.v3.item.show_all_brands.d
    @l
    /* renamed from: getText, reason: from getter */
    public final String getF74462d() {
        return this.f74449d;
    }

    public final int hashCode() {
        int iHashCode = (this.f74448c.hashCode() + (this.f74447b.hashCode() * 31)) * 31;
        String str = this.f74449d;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @Override // com.avito.android.advert.item.compatibility.v3.item.show_all_brands.d
    @k
    /* renamed from: p, reason: from getter */
    public final SparePartsGroup getF74461c() {
        return this.f74448c;
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ShowAllBrandsItem(stringId=");
        sb2.append(this.f74447b);
        sb2.append(", group=");
        sb2.append(this.f74448c);
        sb2.append(", text=");
        return C22026a.c(sb2, this.f74449d, ')');
    }
}
