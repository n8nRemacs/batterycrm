package com.avito.android.user_address.map.domain;

import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: AddNewAddressRequest.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_address/map/domain/a;", "", "_avito_user-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.l
    public final String f307574a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f307575b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f307576c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final b f307577d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final aH0.g f307578e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f307579f;

    public a(@Y61.l String str, @Y61.k String str2, @Y61.k String str3, @Y61.k b bVar, @Y61.l aH0.g gVar, boolean z12) {
        this.f307574a = str;
        this.f307575b = str2;
        this.f307576c = str3;
        this.f307577d = bVar;
        this.f307578e = gVar;
        this.f307579f = z12;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f307574a, aVar.f307574a) && L.f(this.f307575b, aVar.f307575b) && L.f(this.f307576c, aVar.f307576c) && L.f(this.f307577d, aVar.f307577d) && L.f(this.f307578e, aVar.f307578e) && this.f307579f == aVar.f307579f;
    }

    public final int hashCode() {
        String str = this.f307574a;
        int iHashCode = (this.f307577d.hashCode() + H.d(H.d((str == null ? 0 : str.hashCode()) * 31, 31, this.f307575b), 31, this.f307576c)) * 31;
        aH0.g gVar = this.f307578e;
        return Boolean.hashCode(this.f307579f) + ((iHashCode + (gVar != null ? gVar.hashCode() : 0)) * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AddNewAddressRequest(title=");
        sb2.append(this.f307574a);
        sb2.append(", type=");
        sb2.append(this.f307575b);
        sb2.append(", addressText=");
        sb2.append(this.f307576c);
        sb2.append(", geoPoint=");
        sb2.append(this.f307577d);
        sb2.append(", details=");
        sb2.append(this.f307578e);
        sb2.append(", realEstate=");
        return r.x(sb2, this.f307579f, ')');
    }

    public /* synthetic */ a(String str, String str2, String str3, b bVar, aH0.g gVar, boolean z12, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : str, str2, str3, bVar, (i12 & 16) != 0 ? null : gVar, (i12 & 32) != 0 ? false : z12);
    }
}
