package com.avito.android.user_advert.advert.items.geo_references;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: GeoReferenceItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_advert/advert/items/geo_references/a;", "Lcom/avito/conveyor_item/a;", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class a implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f309447b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final List<String> f309448c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f309449d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final String f309450e;

    public a(@k String str, @k List<String> list, @l String str2, @l String str3) {
        this.f309447b = str;
        this.f309448c = list;
        this.f309449d = str2;
        this.f309450e = str3;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f309447b, aVar.f309447b) && L.f(this.f309448c, aVar.f309448c) && L.f(this.f309449d, aVar.f309449d) && L.f(this.f309450e, aVar.f309450e);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF250003b() {
        return getF310044b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF309261b() {
        return this.f309447b;
    }

    public final int hashCode() {
        int iE2 = H.e(this.f309447b.hashCode() * 31, 31, this.f309448c);
        String str = this.f309449d;
        int iHashCode = (iE2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f309450e;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("GeoReferenceItem(stringId=");
        sb2.append(this.f309447b);
        sb2.append(", colors=");
        sb2.append(this.f309448c);
        sb2.append(", content=");
        sb2.append(this.f309449d);
        sb2.append(", after=");
        return C22026a.c(sb2, this.f309450e, ')');
    }
}
