package qI;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CoordsByAddressResult.kt */
@P
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0007B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"LqI/g;", "", "LqI/g$a;", "point", "<init>", "(LqI/g$a;)V", "LqI/g$a;", "a", "()LqI/g$a;", "_avito_historical-suggests_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class g {

    @com.google.gson.annotations.c("point")
    @k
    private final a point;

    /* compiled from: CoordsByAddressResult.kt */
    @P
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"LqI/g$a;", "", "", "latitude", "longitude", "<init>", "(DD)V", "D", "a", "()D", "b", "_avito_historical-suggests_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a {

        @com.google.gson.annotations.c("latitude")
        private final double latitude;

        @com.google.gson.annotations.c("longitude")
        private final double longitude;

        public a(double d12, double d13) {
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
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Double.compare(this.latitude, aVar.latitude) == 0 && Double.compare(this.longitude, aVar.longitude) == 0;
        }

        public final int hashCode() {
            return Double.hashCode(this.longitude) + (Double.hashCode(this.latitude) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Point(latitude=");
            sb2.append(this.latitude);
            sb2.append(", longitude=");
            return androidx.compose.ui.graphics.colorspace.e.o(sb2, this.longitude, ')');
        }
    }

    public g(@k a aVar) {
        this.point = aVar;
    }

    @k
    /* renamed from: a, reason: from getter */
    public final a getPoint() {
        return this.point;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g) && L.f(this.point, ((g) obj).point);
    }

    public final int hashCode() {
        return this.point.hashCode();
    }

    @k
    public final String toString() {
        return "CoordsByAddressResult(point=" + this.point + ')';
    }
}
