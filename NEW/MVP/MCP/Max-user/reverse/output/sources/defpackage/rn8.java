package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class rn8 implements Parcelable {
    public static final Parcelable.Creator<rn8> CREATOR = new f18(29);
    public final qn8 a;

    public rn8(qn8 qn8Var) {
        this.a = qn8Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        qn8 qn8Var = this.a;
        parcel.writeByte(qn8Var == null ? (byte) 1 : (byte) 0);
        if (qn8Var != null) {
            parcel.writeDouble(qn8Var.a);
            parcel.writeDouble(qn8Var.b);
            parcel.writeByte(qn8Var.c ? (byte) 1 : (byte) 0);
            parcel.writeByte(qn8Var.d ? (byte) 1 : (byte) 0);
            parcel.writeByte(qn8Var.e ? (byte) 1 : (byte) 0);
            parcel.writeInt(qn8Var.f);
            parcel.writeFloat(qn8Var.g);
            parcel.writeFloat(qn8Var.h);
            parcel.writeFloat(qn8Var.i);
        }
    }

    public rn8(Parcel parcel) {
        if (parcel.readByte() == 1) {
            this.a = null;
            return;
        }
        qn8 qn8Var = new qn8();
        qn8Var.a = parcel.readDouble();
        qn8Var.b = parcel.readDouble();
        qn8Var.c = parcel.readByte() == 1;
        qn8Var.d = parcel.readByte() == 1;
        qn8Var.e = parcel.readByte() == 1;
        qn8Var.f = parcel.readInt();
        qn8Var.g = parcel.readFloat();
        qn8Var.h = parcel.readFloat();
        qn8Var.i = parcel.readFloat();
        this.a = new qn8(qn8Var);
    }
}
