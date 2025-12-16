package com.avito.android.publish.slots.address_from_profile.publish_item;

import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import kl0.C42712c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: PublishAddressViewItem.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/slots/address_from_profile/publish_item/k;", "Lcom/avito/conveyor_item/a;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class k implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f242922b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final String f242923c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final String f242924d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final String f242925e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final C42712c f242926f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f242927g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f242928h;

    public k(@Y61.k String str, @Y61.l String str2, @Y61.k String str3, @Y61.k String str4, @Y61.k C42712c c42712c, boolean z12, boolean z13) {
        this.f242922b = str;
        this.f242923c = str2;
        this.f242924d = str3;
        this.f242925e = str4;
        this.f242926f = c42712c;
        this.f242927g = z12;
        this.f242928h = z13;
    }

    public static k a(k kVar, boolean z12, boolean z13, int i12) {
        String str = kVar.f242922b;
        String str2 = kVar.f242923c;
        String str3 = kVar.f242924d;
        String str4 = kVar.f242925e;
        C42712c c42712c = kVar.f242926f;
        if ((i12 & 32) != 0) {
            z12 = kVar.f242927g;
        }
        boolean z14 = z12;
        if ((i12 & 64) != 0) {
            z13 = kVar.f242928h;
        }
        kVar.getClass();
        return new k(str, str2, str3, str4, c42712c, z14, z13);
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return L.f(this.f242922b, kVar.f242922b) && L.f(this.f242923c, kVar.f242923c) && L.f(this.f242924d, kVar.f242924d) && L.f(this.f242925e, kVar.f242925e) && L.f(this.f242926f, kVar.f242926f) && this.f242927g == kVar.f242927g && this.f242928h == kVar.f242928h;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF207369c() {
        return getF242922b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId, reason: from getter */
    public final String getF242922b() {
        return this.f242922b;
    }

    public final int hashCode() {
        int iHashCode = this.f242922b.hashCode() * 31;
        String str = this.f242923c;
        return Boolean.hashCode(this.f242928h) + androidx.appcompat.app.r.i((this.f242926f.hashCode() + H.d(H.d((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f242924d), 31, this.f242925e)) * 31, 31, this.f242927g);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AddressListViewItem(stringId=");
        sb2.append(this.f242922b);
        sb2.append(", house=");
        sb2.append(this.f242923c);
        sb2.append(", location=");
        sb2.append(this.f242924d);
        sb2.append(", name=");
        sb2.append(this.f242925e);
        sb2.append(", value=");
        sb2.append(this.f242926f);
        sb2.append(", withError=");
        sb2.append(this.f242927g);
        sb2.append(", isSelected=");
        return androidx.appcompat.app.r.x(sb2, this.f242928h, ')');
    }
}
