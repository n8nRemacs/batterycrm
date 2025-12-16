package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public abstract class gqd implements Parcelable {
    public static final Parcelable.Creator<gqd> CREATOR = new wci(15);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        kci kciVar = (kci) this;
        parcel.writeParcelable(kciVar.a, 0);
        parcel.writeInt(kciVar.b ? 1 : 0);
    }
}
