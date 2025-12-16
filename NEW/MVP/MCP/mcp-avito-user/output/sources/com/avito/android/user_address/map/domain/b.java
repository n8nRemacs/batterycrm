package com.avito.android.user_address.map.domain;

import kotlin.Metadata;

/* compiled from: LocationPickerGeoPoint.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_address/map/domain/b;", "", "_avito_user-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class b {

    /* renamed from: a, reason: collision with root package name */
    public final double f307580a;

    /* renamed from: b, reason: collision with root package name */
    public final double f307581b;

    public b(double d12, double d13) {
        this.f307580a = d12;
        this.f307581b = d13;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Double.compare(this.f307580a, bVar.f307580a) == 0 && Double.compare(this.f307581b, bVar.f307581b) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.f307581b) + (Double.hashCode(this.f307580a) * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("LocationPickerGeoPoint(lat=");
        sb2.append(this.f307580a);
        sb2.append(", lng=");
        return androidx.compose.ui.graphics.colorspace.e.o(sb2, this.f307581b, ')');
    }
}
