package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class en extends f0 {
    public static final Parcelable.Creator<en> CREATOR = new e0(1);
    public float X;
    public boolean Y;
    public boolean c;
    public boolean d;
    public int o;

    public en(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.c = parcel.readByte() != 0;
        this.d = parcel.readByte() != 0;
        this.o = parcel.readInt();
        this.X = parcel.readFloat();
        this.Y = parcel.readByte() != 0;
    }

    @Override // defpackage.f0, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeByte(this.c ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.d ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.o);
        parcel.writeFloat(this.X);
        parcel.writeByte(this.Y ? (byte) 1 : (byte) 0);
    }
}
