package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import com.google.android.gms.maps.model.LatLng;

/* loaded from: classes.dex */
public class mp8 extends l4 {
    public static final Parcelable.Creator<mp8> CREATOR = new k3j(1);
    public int A0;
    public String B0;
    public float C0;
    public boolean Y;
    public LatLng a;
    public String b;
    public String c;
    public xo0 d;
    public float x0;
    public View z0;
    public float o = 0.5f;
    public float X = 1.0f;
    public boolean Z = true;
    public boolean s0 = false;
    public float t0 = 0.0f;
    public float u0 = 0.5f;
    public float v0 = 0.0f;
    public float w0 = 1.0f;
    public int y0 = 0;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iK = a9j.k(parcel, 20293);
        a9j.f(parcel, 2, this.a, i);
        a9j.g(parcel, 3, this.b);
        a9j.g(parcel, 4, this.c);
        xo0 xo0Var = this.d;
        a9j.e(parcel, 5, xo0Var == null ? null : xo0Var.a.asBinder());
        float f = this.o;
        a9j.m(parcel, 6, 4);
        parcel.writeFloat(f);
        float f2 = this.X;
        a9j.m(parcel, 7, 4);
        parcel.writeFloat(f2);
        boolean z = this.Y;
        a9j.m(parcel, 8, 4);
        parcel.writeInt(z ? 1 : 0);
        boolean z2 = this.Z;
        a9j.m(parcel, 9, 4);
        parcel.writeInt(z2 ? 1 : 0);
        boolean z3 = this.s0;
        a9j.m(parcel, 10, 4);
        parcel.writeInt(z3 ? 1 : 0);
        float f3 = this.t0;
        a9j.m(parcel, 11, 4);
        parcel.writeFloat(f3);
        float f4 = this.u0;
        a9j.m(parcel, 12, 4);
        parcel.writeFloat(f4);
        float f5 = this.v0;
        a9j.m(parcel, 13, 4);
        parcel.writeFloat(f5);
        float f6 = this.w0;
        a9j.m(parcel, 14, 4);
        parcel.writeFloat(f6);
        float f7 = this.x0;
        a9j.m(parcel, 15, 4);
        parcel.writeFloat(f7);
        int i2 = this.y0;
        a9j.m(parcel, 17, 4);
        parcel.writeInt(i2);
        a9j.e(parcel, 18, new tqa(this.z0));
        int i3 = this.A0;
        a9j.m(parcel, 19, 4);
        parcel.writeInt(i3);
        a9j.g(parcel, 20, this.B0);
        float f8 = this.C0;
        a9j.m(parcel, 21, 4);
        parcel.writeFloat(f8);
        a9j.l(parcel, iK);
    }
}
