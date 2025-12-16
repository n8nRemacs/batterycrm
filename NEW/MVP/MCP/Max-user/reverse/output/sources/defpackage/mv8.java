package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class mv8 implements Parcelable {
    public static final Parcelable.Creator<mv8> CREATOR = new pq8(2);
    public final int a;
    public final wy8 b;

    public mv8(Parcel parcel) {
        this.a = parcel.readInt();
        this.b = wy8.CREATOR.createFromParcel(parcel);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "MediaItem{mFlags=" + this.a + ", mDescription=" + this.b + '}';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        this.b.writeToParcel(parcel, i);
    }
}
