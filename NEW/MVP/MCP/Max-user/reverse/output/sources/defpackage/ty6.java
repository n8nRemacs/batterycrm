package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;

/* loaded from: classes.dex */
public final class ty6 extends l4 {
    public static final Parcelable.Creator<ty6> CREATOR = new wci(24);
    public float X;
    public float Y;
    public boolean Z;
    public xo0 a;
    public LatLng b;
    public float c;
    public float d;
    public LatLngBounds o;
    public float s0;
    public float t0;
    public float u0;
    public boolean v0;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iK = a9j.k(parcel, 20293);
        a9j.e(parcel, 2, this.a.a.asBinder());
        a9j.f(parcel, 3, this.b, i);
        float f = this.c;
        a9j.m(parcel, 4, 4);
        parcel.writeFloat(f);
        float f2 = this.d;
        a9j.m(parcel, 5, 4);
        parcel.writeFloat(f2);
        a9j.f(parcel, 6, this.o, i);
        float f3 = this.X;
        a9j.m(parcel, 7, 4);
        parcel.writeFloat(f3);
        float f4 = this.Y;
        a9j.m(parcel, 8, 4);
        parcel.writeFloat(f4);
        boolean z = this.Z;
        a9j.m(parcel, 9, 4);
        parcel.writeInt(z ? 1 : 0);
        float f5 = this.s0;
        a9j.m(parcel, 10, 4);
        parcel.writeFloat(f5);
        float f6 = this.t0;
        a9j.m(parcel, 11, 4);
        parcel.writeFloat(f6);
        float f7 = this.u0;
        a9j.m(parcel, 12, 4);
        parcel.writeFloat(f7);
        boolean z2 = this.v0;
        a9j.m(parcel, 13, 4);
        parcel.writeInt(z2 ? 1 : 0);
        a9j.l(parcel, iK);
    }
}
