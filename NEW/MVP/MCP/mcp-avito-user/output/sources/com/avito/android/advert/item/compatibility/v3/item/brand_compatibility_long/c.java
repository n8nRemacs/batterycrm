package com.avito.android.advert.item.compatibility.v3.item.brand_compatibility_long;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.advert.item.compatibility.v3.item.brand_compatibility.d;
import com.avito.android.advert.item.spare_parts.data.SparePartsGroup;
import com.avito.conveyor_item.a;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: BrandCompatibilityLongItem.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/compatibility/v3/item/brand_compatibility_long/c;", "Lcom/avito/android/advert/item/compatibility/v3/item/brand_compatibility/d;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class c implements d {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f74441b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final SparePartsGroup f74442c;

    public c(String str, SparePartsGroup sparePartsGroup, int i12, C42822w c42822w) {
        this.f74441b = (i12 & 1) != 0 ? UUID.randomUUID().toString() : str;
        this.f74442c = sparePartsGroup;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return L.f(this.f74441b, cVar.f74441b) && L.f(this.f74442c, cVar.f74442c);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF72531b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF72532c() {
        return this.f74441b;
    }

    public final int hashCode() {
        return this.f74442c.hashCode() + (this.f74441b.hashCode() * 31);
    }

    @Override // com.avito.android.advert.item.compatibility.v3.item.brand_compatibility.d
    @k
    /* renamed from: p, reason: from getter */
    public final SparePartsGroup getF74429c() {
        return this.f74442c;
    }

    @k
    public final String toString() {
        return "BrandCompatibilityLongItem(stringId=" + this.f74441b + ", group=" + this.f74442c + ')';
    }
}
