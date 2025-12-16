package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class r9f implements Parcelable {
    public static final Parcelable.Creator<r9f> CREATOR = new z6e(18);
    public int[] X;
    public ArrayList Y;
    public boolean Z;
    public int a;
    public int b;
    public int c;
    public int[] d;
    public int o;
    public boolean s0;
    public boolean t0;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeInt(this.b);
        parcel.writeInt(this.c);
        if (this.c > 0) {
            parcel.writeIntArray(this.d);
        }
        parcel.writeInt(this.o);
        if (this.o > 0) {
            parcel.writeIntArray(this.X);
        }
        parcel.writeInt(this.Z ? 1 : 0);
        parcel.writeInt(this.s0 ? 1 : 0);
        parcel.writeInt(this.t0 ? 1 : 0);
        parcel.writeList(this.Y);
    }
}
