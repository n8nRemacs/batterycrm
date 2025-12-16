package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class lf8 implements Parcelable {
    public static final Parcelable.Creator<lf8> CREATOR = new f18(28);
    public final kf8 a;

    public lf8(kf8 kf8Var) {
        this.a = kf8Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        kf8 kf8Var = this.a;
        parcel.writeByte(kf8Var == null ? (byte) 1 : (byte) 0);
        if (kf8Var != null) {
            parcel.writeInt(az1.v(kf8Var.a));
            parcel.writeInt(az1.v(kf8Var.b));
            parcel.writeLong(kf8Var.e);
            parcel.writeByte(kf8Var.f ? (byte) 1 : (byte) 0);
            parcel.writeByte(kf8Var.c ? (byte) 1 : (byte) 0);
            parcel.writeByte(kf8Var.d ? (byte) 1 : (byte) 0);
            parcel.writeByte(kf8Var.g ? (byte) 1 : (byte) 0);
            parcel.writeByte(kf8Var.h ? (byte) 1 : (byte) 0);
            parcel.writeByte(kf8Var.i ? (byte) 1 : (byte) 0);
            parcel.writeByte(kf8Var.j ? (byte) 1 : (byte) 0);
            parcel.writeByte(kf8Var.k ? (byte) 1 : (byte) 0);
            parcel.writeLong(kf8Var.l);
            parcel.writeLong(kf8Var.m);
            parcel.writeLong(kf8Var.n);
            parcel.writeByte(kf8Var.o ? (byte) 1 : (byte) 0);
        }
    }

    public lf8(Parcel parcel) {
        if (parcel.readByte() == 1) {
            this.a = null;
            return;
        }
        jf8 jf8Var = new jf8();
        jf8Var.a = az1.y(2)[parcel.readInt()];
        jf8Var.b = az1.y(2)[parcel.readInt()];
        jf8Var.c = parcel.readByte() == 1;
        jf8Var.d = parcel.readByte() == 1;
        jf8Var.e = parcel.readLong();
        jf8Var.f = parcel.readByte() == 1;
        jf8Var.g = parcel.readByte() == 1;
        jf8Var.h = parcel.readByte() == 1;
        jf8Var.i = parcel.readByte() == 1;
        jf8Var.j = parcel.readByte() == 1;
        jf8Var.k = parcel.readByte() == 1;
        jf8Var.l = parcel.readLong();
        jf8Var.m = parcel.readLong();
        jf8Var.n = parcel.readLong();
        jf8Var.o = parcel.readByte() == 1;
        this.a = new kf8(jf8Var);
    }
}
