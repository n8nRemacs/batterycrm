package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class ilf implements Comparable, Parcelable {
    public static final Parcelable.Creator<ilf> CREATOR = new z6e(21);
    public static final String X;
    public static final String d;
    public static final String o;
    public final int a;
    public final int b;
    public final int c;

    static {
        String str = zxg.a;
        d = Integer.toString(0, 36);
        o = Integer.toString(1, 36);
        X = Integer.toString(2, 36);
    }

    public ilf(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        ilf ilfVar = (ilf) obj;
        int i = this.a - ilfVar.a;
        if (i != 0) {
            return i;
        }
        int i2 = this.b - ilfVar.b;
        return i2 == 0 ? this.c - ilfVar.c : i2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ilf.class == obj.getClass()) {
            ilf ilfVar = (ilf) obj;
            if (this.a == ilfVar.a && this.b == ilfVar.b && this.c == ilfVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((this.a * 31) + this.b) * 31) + this.c;
    }

    public final String toString() {
        return this.a + "." + this.b + "." + this.c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeInt(this.b);
        parcel.writeInt(this.c);
    }

    public ilf(Parcel parcel) {
        this.a = parcel.readInt();
        this.b = parcel.readInt();
        this.c = parcel.readInt();
    }
}
