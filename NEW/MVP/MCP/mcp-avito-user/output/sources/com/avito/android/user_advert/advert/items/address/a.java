package com.avito.android.user_advert.advert.items.address;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import com.avito.android.remote.model.Coordinates;
import com.avito.android.remote.model.GeoReference;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AddressItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_advert/advert/items/address/a;", "Lcom/avito/conveyor_item/a;", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class a implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f309062b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f309063c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f309064d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final Coordinates f309065e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final List<GeoReference> f309066f;

    public a(@k Coordinates coordinates, @k String str, @k String str2, @k String str3, @l List list) {
        this.f309062b = str;
        this.f309063c = str2;
        this.f309064d = str3;
        this.f309065e = coordinates;
        this.f309066f = list;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f309062b, aVar.f309062b) && L.f(this.f309063c, aVar.f309063c) && L.f(this.f309064d, aVar.f309064d) && L.f(this.f309065e, aVar.f309065e) && L.f(this.f309066f, aVar.f309066f);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF322725b() {
        return getF309062b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF309062b() {
        return this.f309062b;
    }

    public final int hashCode() {
        int iHashCode = (this.f309065e.hashCode() + H.d(H.d(this.f309062b.hashCode() * 31, 31, this.f309063c), 31, this.f309064d)) * 31;
        List<GeoReference> list = this.f309066f;
        return iHashCode + (list == null ? 0 : list.hashCode());
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AddressItem(stringId=");
        sb2.append(this.f309062b);
        sb2.append(", address=");
        sb2.append(this.f309063c);
        sb2.append(", advertTitle=");
        sb2.append(this.f309064d);
        sb2.append(", coordinates=");
        sb2.append(this.f309065e);
        sb2.append(", geoReferences=");
        return H.p(sb2, this.f309066f, ')');
    }
}
