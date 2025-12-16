package vW;

import kotlin.Metadata;

/* compiled from: RadiusWidgetUpdate.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LvW/s;", "", "_avito_location-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class s {

    /* renamed from: a, reason: collision with root package name */
    public final double f440815a;

    /* renamed from: b, reason: collision with root package name */
    public final long f440816b;

    public s(double d12, long j12) {
        this.f440815a = d12;
        this.f440816b = j12;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return Double.compare(this.f440815a, sVar.f440815a) == 0 && this.f440816b == sVar.f440816b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f440816b) + (Double.hashCode(this.f440815a) * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RadiusWidgetUpdate(distance=");
        sb2.append(this.f440815a);
        sb2.append(", distanceInMeters=");
        return androidx.appcompat.app.r.u(sb2, this.f440816b, ')');
    }
}
