package androidx.media3.container;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.common.Metadata;
import androidx.media3.common.util.J;
import com.google.common.primitives.n;
import j.P;

@J
/* loaded from: classes.dex */
public final class CreationTime implements Metadata.Entry {
    public static final Parcelable.Creator<CreationTime> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final long f48110b;

    public class a implements Parcelable.Creator<CreationTime> {
        @Override // android.os.Parcelable.Creator
        public final CreationTime createFromParcel(Parcel parcel) {
            return new CreationTime(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        public final CreationTime[] newArray(int i12) {
            return new CreationTime[i12];
        }
    }

    public CreationTime(long j12) {
        this.f48110b = j12;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@P Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CreationTime) {
            return this.f48110b == ((CreationTime) obj).f48110b;
        }
        return false;
    }

    public final int hashCode() {
        return n.b(this.f48110b);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Creation time: ");
        long j12 = this.f48110b;
        sb2.append(j12 == -2082844800000L ? "unset" : Long.valueOf(j12));
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i12) {
        parcel.writeLong(this.f48110b);
    }

    public CreationTime(Parcel parcel, a aVar) {
        this.f48110b = parcel.readLong();
    }
}
