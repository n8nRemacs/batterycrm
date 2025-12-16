package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public final class h26 extends xhd implements e26 {
    public static final Parcelable.Creator<h26> CREATOR = new wf4(12);
    public float X;
    public int Y;
    public float Z;
    public float o;
    public int s0;
    public int t0;
    public int u0;
    public int v0;
    public boolean w0;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(this.o);
        parcel.writeFloat(this.X);
        parcel.writeInt(this.Y);
        parcel.writeFloat(this.Z);
        parcel.writeInt(this.s0);
        parcel.writeInt(this.t0);
        parcel.writeInt(this.u0);
        parcel.writeInt(this.v0);
        parcel.writeByte(this.w0 ? (byte) 1 : (byte) 0);
        parcel.writeInt(((ViewGroup.MarginLayoutParams) this).bottomMargin);
        parcel.writeInt(((ViewGroup.MarginLayoutParams) this).leftMargin);
        parcel.writeInt(((ViewGroup.MarginLayoutParams) this).rightMargin);
        parcel.writeInt(((ViewGroup.MarginLayoutParams) this).topMargin);
        parcel.writeInt(((ViewGroup.MarginLayoutParams) this).height);
        parcel.writeInt(((ViewGroup.MarginLayoutParams) this).width);
    }
}
