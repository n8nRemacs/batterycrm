package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import ru.ok.android.onelog.impl.BuildConfig;

/* loaded from: classes2.dex */
public final class lcb extends ocb {
    public static final lcb b = new lcb(BuildConfig.MAX_TIME_TO_UPLOAD);
    public static final Parcelable.Creator<lcb> CREATOR = new pq8(21);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof lcb);
    }

    public final int hashCode() {
        return 1868500386;
    }

    public final String toString() {
        return "Indeterminate";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
