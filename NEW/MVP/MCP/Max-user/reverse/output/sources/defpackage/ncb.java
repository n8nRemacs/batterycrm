package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import ru.ok.android.externcalls.analytics.internal.upload.MultiFileUploader;

/* loaded from: classes2.dex */
public final class ncb extends ocb {
    public static final ncb b = new ncb(MultiFileUploader.UPLOAD_NEXT_INTERVAL);
    public static final Parcelable.Creator<ncb> CREATOR = new pq8(23);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof ncb);
    }

    public final int hashCode() {
        return -950206676;
    }

    public final String toString() {
        return "Timer";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
