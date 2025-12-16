package com.avito.android.delivery_tarifikator.presentation.konveyor.item.regioninfo;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: RegionInfoItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/delivery_tarifikator/presentation/konveyor/item/regioninfo/c;", "Lcom/avito/conveyor_item/a;", "_avito_delivery-tarifikator_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class c implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f135390b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f135391c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f135392d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final String f135393e;

    public c(@k String str, @k String str2, @k String str3, @k String str4) {
        this.f135390b = str;
        this.f135391c = str2;
        this.f135392d = str3;
        this.f135393e = str4;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return L.f(this.f135390b, cVar.f135390b) && L.f(this.f135391c, cVar.f135391c) && L.f(this.f135392d, cVar.f135392d) && L.f(this.f135393e, cVar.f135393e);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF83798f() {
        return getF135390b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF135390b() {
        return this.f135390b;
    }

    public final int hashCode() {
        return this.f135393e.hashCode() + H.d(H.d(this.f135390b.hashCode() * 31, 31, this.f135391c), 31, this.f135392d);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RegionInfoItem(stringId=");
        sb2.append(this.f135390b);
        sb2.append(", regionName=");
        sb2.append(this.f135391c);
        sb2.append(", locationsInfo=");
        sb2.append(this.f135392d);
        sb2.append(", enabledLocationsInfo=");
        return C22026a.c(sb2, this.f135393e, ')');
    }
}
