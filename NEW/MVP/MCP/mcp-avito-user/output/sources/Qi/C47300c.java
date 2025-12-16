package qI;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AddressSuggestionJwt.kt */
@P
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\t\u001a\u0004\b\f\u0010\u000bR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"LqI/c;", "", "", "latitude", "longitude", "", "id", "<init>", "(Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;)V", "Ljava/lang/Double;", "b", "()Ljava/lang/Double;", "c", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "_avito_historical-suggests_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: qI.c, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final /* data */ class C47300c {

    @com.google.gson.annotations.c("addressId")
    @l
    private final String id;

    @com.google.gson.annotations.c("latitude")
    @l
    private final Double latitude;

    @com.google.gson.annotations.c("longitude")
    @l
    private final Double longitude;

    public C47300c(@l Double d12, @l Double d13, @l String str) {
        this.latitude = d12;
        this.longitude = d13;
        this.id = str;
    }

    @l
    /* renamed from: a, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @l
    /* renamed from: b, reason: from getter */
    public final Double getLatitude() {
        return this.latitude;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final Double getLongitude() {
        return this.longitude;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C47300c)) {
            return false;
        }
        C47300c c47300c = (C47300c) obj;
        return L.f(this.latitude, c47300c.latitude) && L.f(this.longitude, c47300c.longitude) && L.f(this.id, c47300c.id);
    }

    public final int hashCode() {
        Double d12 = this.latitude;
        int iHashCode = (d12 == null ? 0 : d12.hashCode()) * 31;
        Double d13 = this.longitude;
        int iHashCode2 = (iHashCode + (d13 == null ? 0 : d13.hashCode())) * 31;
        String str = this.id;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AddressSuggestionJwt(latitude=");
        sb2.append(this.latitude);
        sb2.append(", longitude=");
        sb2.append(this.longitude);
        sb2.append(", id=");
        return C22026a.c(sb2, this.id, ')');
    }
}
