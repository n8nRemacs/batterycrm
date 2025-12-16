package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class taa implements Parcelable {
    public static final Parcelable.Creator<taa> CREATOR = new pq8(14);
    public final int a;
    public final boolean b;
    public final boolean c;

    public taa(saa saaVar) {
        this.a = saaVar.a;
        this.b = saaVar.b;
        this.c = saaVar.c;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeByte(this.b ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.c ? (byte) 1 : (byte) 0);
    }

    public taa(Parcel parcel) {
        this.a = parcel.readInt();
        this.b = parcel.readByte() != 0;
        this.c = parcel.readByte() != 0;
    }
}
