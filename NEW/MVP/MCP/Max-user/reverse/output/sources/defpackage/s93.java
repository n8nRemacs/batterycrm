package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.LatLng;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class s93 extends l4 {
    public static final Parcelable.Creator<s93> CREATOR = new wci(19);
    public float X;
    public boolean Y;
    public boolean Z;
    public LatLng a;
    public double b;
    public float c;
    public int d;
    public int o;
    public ArrayList s0;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iK = a9j.k(parcel, 20293);
        a9j.f(parcel, 2, this.a, i);
        double d = this.b;
        a9j.m(parcel, 3, 8);
        parcel.writeDouble(d);
        float f = this.c;
        a9j.m(parcel, 4, 4);
        parcel.writeFloat(f);
        int i2 = this.d;
        a9j.m(parcel, 5, 4);
        parcel.writeInt(i2);
        int i3 = this.o;
        a9j.m(parcel, 6, 4);
        parcel.writeInt(i3);
        float f2 = this.X;
        a9j.m(parcel, 7, 4);
        parcel.writeFloat(f2);
        boolean z = this.Y;
        a9j.m(parcel, 8, 4);
        parcel.writeInt(z ? 1 : 0);
        boolean z2 = this.Z;
        a9j.m(parcel, 9, 4);
        parcel.writeInt(z2 ? 1 : 0);
        a9j.j(parcel, this.s0, 10);
        a9j.l(parcel, iK);
    }
}
