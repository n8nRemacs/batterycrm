package com.avito.android.user_address.map.domain;

import androidx.compose.foundation.H;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: UpdateAddressRequest.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_address/map/domain/c;", "", "_avito_user-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class c {

    /* renamed from: a, reason: collision with root package name */
    public final int f307582a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final String f307583b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f307584c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final aH0.g f307585d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final b f307586e;

    public c(int i12, @Y61.l String str, @Y61.k String str2, @Y61.l aH0.g gVar, @Y61.k b bVar) {
        this.f307582a = i12;
        this.f307583b = str;
        this.f307584c = str2;
        this.f307585d = gVar;
        this.f307586e = bVar;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f307582a == cVar.f307582a && L.f(null, null) && L.f(this.f307583b, cVar.f307583b) && this.f307584c.equals(cVar.f307584c) && this.f307585d.equals(cVar.f307585d) && this.f307586e.equals(cVar.f307586e);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f307582a) * 961;
        String str = this.f307583b;
        return this.f307586e.hashCode() + ((this.f307585d.hashCode() + H.d((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f307584c)) * 31);
    }

    @Y61.k
    public final String toString() {
        return "UpdateAddressRequest(addressId=" + this.f307582a + ", title=null, addressText=" + this.f307583b + ", addressType=" + this.f307584c + ", details=" + this.f307585d + ", geoPoint=" + this.f307586e + ')';
    }
}
