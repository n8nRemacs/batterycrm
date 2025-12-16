package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public class vof implements Parcelable {
    public static final uof CREATOR = new uof();
    public final String a;

    public vof(String str) {
        this.a = str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
    }

    public vof(Parcel parcel) {
        this(parcel.readString());
    }
}
