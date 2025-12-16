package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class xih extends l4 {
    public static final Parcelable.Creator<xih> CREATOR = new wci(12);
    public final LatLng a;
    public final LatLng b;
    public final LatLng c;
    public final LatLng d;
    public final LatLngBounds o;

    public xih(LatLng latLng, LatLng latLng2, LatLng latLng3, LatLng latLng4, LatLngBounds latLngBounds) {
        this.a = latLng;
        this.b = latLng2;
        this.c = latLng3;
        this.d = latLng4;
        this.o = latLngBounds;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xih)) {
            return false;
        }
        xih xihVar = (xih) obj;
        return this.a.equals(xihVar.a) && this.b.equals(xihVar.b) && this.c.equals(xihVar.c) && this.d.equals(xihVar.d) && this.o.equals(xihVar.o);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d, this.o});
    }

    public final String toString() {
        h79 h79Var = new h79(this);
        h79Var.t(this.a, "nearLeft");
        h79Var.t(this.b, "nearRight");
        h79Var.t(this.c, "farLeft");
        h79Var.t(this.d, "farRight");
        h79Var.t(this.o, "latLngBounds");
        return h79Var.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iK = a9j.k(parcel, 20293);
        a9j.f(parcel, 2, this.a, i);
        a9j.f(parcel, 3, this.b, i);
        a9j.f(parcel, 4, this.c, i);
        a9j.f(parcel, 5, this.d, i);
        a9j.f(parcel, 6, this.o, i);
        a9j.l(parcel, iK);
    }
}
