package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class q2a implements qy9 {
    public static final Parcelable.Creator<q2a> CREATOR = new pq8(13);
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final long o;

    public q2a(long j, long j2, long j3, long j4, long j5) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.o = j5;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && q2a.class == obj.getClass()) {
            q2a q2aVar = (q2a) obj;
            if (this.a == q2aVar.a && this.b == q2aVar.b && this.c == q2aVar.c && this.d == q2aVar.d && this.o == q2aVar.o) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return fsi.g(this.o) + ((fsi.g(this.d) + ((fsi.g(this.c) + ((fsi.g(this.b) + ((fsi.g(this.a) + 527) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(218);
        sb.append("Motion photo metadata: photoStartPosition=");
        sb.append(this.a);
        sb.append(", photoSize=");
        sb.append(this.b);
        az1.r(this.c, ", photoPresentationTimestampUs=", ", videoStartPosition=", sb);
        sb.append(this.d);
        sb.append(", videoSize=");
        sb.append(this.o);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.a);
        parcel.writeLong(this.b);
        parcel.writeLong(this.c);
        parcel.writeLong(this.d);
        parcel.writeLong(this.o);
    }

    public q2a(Parcel parcel) {
        this.a = parcel.readLong();
        this.b = parcel.readLong();
        this.c = parcel.readLong();
        this.d = parcel.readLong();
        this.o = parcel.readLong();
    }
}
