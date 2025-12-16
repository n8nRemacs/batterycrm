package P20;

import Y61.k;
import Y61.l;
import androidx.compose.ui.graphics.colorspace.e;
import kotlin.Metadata;

/* compiled from: MultiGeoAddress.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"LP20/b;", "", "", "longitude", "latitude", "<init>", "(DD)V", "D", "b", "()D", "a", "_avito_multigeo-flow_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class b {

    @com.google.gson.annotations.c("latitude")
    private final double latitude;

    @com.google.gson.annotations.c("longitude")
    private final double longitude;

    public b(double d12, double d13) {
        this.longitude = d12;
        this.latitude = d13;
    }

    /* renamed from: a, reason: from getter */
    public final double getLatitude() {
        return this.latitude;
    }

    /* renamed from: b, reason: from getter */
    public final double getLongitude() {
        return this.longitude;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Double.compare(this.longitude, bVar.longitude) == 0 && Double.compare(this.latitude, bVar.latitude) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.latitude) + (Double.hashCode(this.longitude) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("MultiGeoCoordinate(longitude=");
        sb2.append(this.longitude);
        sb2.append(", latitude=");
        return e.o(sb2, this.latitude, ')');
    }
}
