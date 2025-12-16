package com.avito.android.edit_address.adapter.location;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.conveyor_item.a;
import dy.InterfaceC39826b;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: HeaderItem.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/edit_address/adapter/location/a;", "Ldy/b;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class a implements InterfaceC39826b {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f145777b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f145778c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f145779d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final String f145780e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final String f145781f;

    public a(String str, String str2, boolean z12, String str3, String str4, int i12, C42822w c42822w) {
        str = (i12 & 1) != 0 ? "location_item" : str;
        z12 = (i12 & 4) != 0 ? false : z12;
        this.f145777b = str;
        this.f145778c = str2;
        this.f145779d = z12;
        this.f145780e = str3;
        this.f145781f = str4;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f145777b, aVar.f145777b) && L.f(this.f145778c, aVar.f145778c) && this.f145779d == aVar.f145779d && L.f(this.f145780e, aVar.f145780e) && L.f(this.f145781f, aVar.f145781f);
    }

    @Override // TV0.a
    public final long getId() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF145095b() {
        return this.f145777b;
    }

    public final int hashCode() {
        int iHashCode = this.f145777b.hashCode() * 31;
        String str = this.f145778c;
        int i12 = r.i((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f145779d);
        String str2 = this.f145780e;
        int iHashCode2 = (i12 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f145781f;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("HeaderItem(stringId=");
        sb2.append(this.f145777b);
        sb2.append(", locationName=");
        sb2.append(this.f145778c);
        sb2.append(", hasAddressError=");
        sb2.append(this.f145779d);
        sb2.append(", entrance=");
        sb2.append(this.f145780e);
        sb2.append(", comment=");
        return C22026a.c(sb2, this.f145781f, ')');
    }
}
