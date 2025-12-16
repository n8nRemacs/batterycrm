package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class q25 implements Parcelable {
    public static final Parcelable.Creator<q25> CREATOR = new wf4(4);
    public final long a;
    public final long b;

    public q25(Parcel parcel) {
        long j = parcel.readLong();
        long j2 = parcel.readLong();
        hsi.b(j2 >= 0 || j2 == -9223372036854775807L);
        this.a = j;
        this.b = j2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof q25)) {
            return false;
        }
        q25 q25Var = (q25) obj;
        return this.a == q25Var.a && this.b == q25Var.b;
    }

    public final int hashCode() {
        return (((int) this.a) * 961) + ((int) this.b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.a);
        parcel.writeLong(this.b);
    }
}
