package com.avito.android.advert.item.compatibility.v3.item.brand_compatibility;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.advert.item.spare_parts.data.SparePartsGroup;
import com.avito.conveyor_item.a;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: BrandCompatibilityItem.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/compatibility/v3/item/brand_compatibility/c;", "Lcom/avito/android/advert/item/compatibility/v3/item/brand_compatibility/d;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class c implements d {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f74428b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final SparePartsGroup f74429c;

    public c(String str, SparePartsGroup sparePartsGroup, int i12, C42822w c42822w) {
        this.f74428b = (i12 & 1) != 0 ? UUID.randomUUID().toString() : str;
        this.f74429c = sparePartsGroup;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return L.f(this.f74428b, cVar.f74428b) && L.f(this.f74429c, cVar.f74429c);
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
        return this.f74428b;
    }

    public final int hashCode() {
        return this.f74429c.hashCode() + (this.f74428b.hashCode() * 31);
    }

    @Override // com.avito.android.advert.item.compatibility.v3.item.brand_compatibility.d
    @k
    /* renamed from: p, reason: from getter */
    public final SparePartsGroup getF74429c() {
        return this.f74429c;
    }

    @k
    public final String toString() {
        return "BrandCompatibilityItem(stringId=" + this.f74428b + ", group=" + this.f74429c + ')';
    }
}
