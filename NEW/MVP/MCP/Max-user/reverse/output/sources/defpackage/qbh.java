package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class qbh extends rbh {
    public static final Parcelable.Creator<qbh> CREATOR = new obh(1);
    public final gsc a;

    public qbh(gsc gscVar) {
        this.a = gscVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a.name());
    }
}
