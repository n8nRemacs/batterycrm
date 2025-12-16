package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class ui6 implements Parcelable {
    public static final Parcelable.Creator<ui6> CREATOR = new wf4(15);
    public ArrayList X;
    public ArrayList Y;
    public ArrayList Z;
    public ArrayList a;
    public ArrayList b;
    public ve0[] c;
    public int d;
    public String o;

    public ui6(Parcel parcel) {
        this.o = null;
        this.X = new ArrayList();
        this.Y = new ArrayList();
        this.a = parcel.createStringArrayList();
        this.b = parcel.createStringArrayList();
        this.c = (ve0[]) parcel.createTypedArray(ve0.CREATOR);
        this.d = parcel.readInt();
        this.o = parcel.readString();
        this.X = parcel.createStringArrayList();
        this.Y = parcel.createTypedArrayList(we0.CREATOR);
        this.Z = parcel.createTypedArrayList(oi6.CREATOR);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.a);
        parcel.writeStringList(this.b);
        parcel.writeTypedArray(this.c, i);
        parcel.writeInt(this.d);
        parcel.writeString(this.o);
        parcel.writeStringList(this.X);
        parcel.writeTypedList(this.Y);
        parcel.writeTypedList(this.Z);
    }
}
