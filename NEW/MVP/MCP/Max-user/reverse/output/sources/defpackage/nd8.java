package defpackage;

import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class nd8 implements Parcelable {
    public static final Parcelable.Creator<nd8> CREATOR = new f18(25);
    public final String X;
    public final int Y;
    public final Rect Z;
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final int d;
    public final String o;
    public final float[] s0;
    public final boolean t0;
    public final int u0;
    public final int v0;

    public nd8(rs0 rs0Var) {
        this.a = true;
        this.b = rs0Var.c;
        this.c = true;
        this.d = 0;
        this.o = (String) rs0Var.d;
        this.X = (String) rs0Var.e;
        this.Y = rs0Var.b;
        this.Z = null;
        this.s0 = null;
        this.t0 = true;
        this.u0 = 0;
        this.v0 = 0;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeByte(this.a ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.b ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.c ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.d);
        parcel.writeString(this.o);
        parcel.writeString(this.X);
        parcel.writeInt(this.Y);
        parcel.writeParcelable(this.Z, i);
        parcel.writeFloatArray(this.s0);
        parcel.writeByte(this.t0 ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.u0);
        parcel.writeInt(this.v0);
    }

    public nd8(Parcel parcel) {
        this.a = parcel.readByte() != 0;
        this.b = parcel.readByte() != 0;
        this.c = parcel.readByte() != 0;
        this.d = parcel.readInt();
        this.o = parcel.readString();
        this.X = parcel.readString();
        this.Y = parcel.readInt();
        this.Z = (Rect) parcel.readParcelable(Rect.class.getClassLoader());
        this.s0 = parcel.createFloatArray();
        this.t0 = parcel.readByte() != 0;
        this.u0 = parcel.readInt();
        this.v0 = parcel.readInt();
    }
}
