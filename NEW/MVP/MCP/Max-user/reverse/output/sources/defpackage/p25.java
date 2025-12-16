package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class p25 implements Parcelable {
    public static final Parcelable.Creator<p25> CREATOR = new wf4(3);
    public final long a;
    public final long b;

    public p25(Parcel parcel) {
        long j = parcel.readLong();
        long j2 = parcel.readLong();
        hsi.b(j >= 0);
        hsi.b(j2 >= 0 || j2 == -1);
        this.a = j;
        this.b = j2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof p25)) {
            return false;
        }
        p25 p25Var = (p25) obj;
        return this.a == p25Var.a && this.b == p25Var.b;
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
