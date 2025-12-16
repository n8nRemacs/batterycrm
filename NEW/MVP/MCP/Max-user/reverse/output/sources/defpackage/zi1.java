package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class zi1 implements Parcelable {
    public static final Parcelable.Creator<zi1> CREATOR = new e8(11);
    public static final zi1 c = new zi1(0, 0);
    public final long a;
    public final int b;

    public zi1(long j, int i) {
        this.a = j;
        this.b = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zi1)) {
            return false;
        }
        zi1 zi1Var = (zi1) obj;
        return this.a == zi1Var.a && this.b == zi1Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return this.a + ":" + this.b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.a);
        parcel.writeInt(this.b);
    }
}
