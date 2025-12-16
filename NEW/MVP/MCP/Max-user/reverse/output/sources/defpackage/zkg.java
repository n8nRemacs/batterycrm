package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class zkg implements Parcelable {
    public static final Parcelable.Creator<zkg> CREATOR = new z6e(28);
    public static final zkg d = new zkg(1, Integer.MAX_VALUE, Integer.MAX_VALUE);
    public final int a;
    public final int b;
    public final int c;

    public zkg(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeInt(this.b);
        parcel.writeInt(this.c);
    }
}
