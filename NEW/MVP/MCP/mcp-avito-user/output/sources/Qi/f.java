package qI;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.category_parameters.AddressParameter;
import kotlin.Metadata;

/* compiled from: Coordinates.kt */
@P
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"LqI/f;", "", "", "latitude", "longitude", "<init>", "(DD)V", "D", "a", "()D", "b", "_avito_historical-suggests_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class f {

    @com.google.gson.annotations.c("lat")
    private final double latitude;

    @com.google.gson.annotations.c(AddressParameter.Value.LNG)
    private final double longitude;

    public f(double d12, double d13) {
        this.latitude = d12;
        this.longitude = d13;
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
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return Double.compare(this.latitude, fVar.latitude) == 0 && Double.compare(this.longitude, fVar.longitude) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.longitude) + (Double.hashCode(this.latitude) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Coordinates(latitude=");
        sb2.append(this.latitude);
        sb2.append(", longitude=");
        return androidx.compose.ui.graphics.colorspace.e.o(sb2, this.longitude, ')');
    }
}
