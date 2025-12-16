package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;

/* loaded from: classes.dex */
public final class j67 implements Parcelable {
    public static final Parcelable.Creator<j67> CREATOR = new wf4(23);
    public final String X;
    public final int a;
    public final int b;
    public final String c;
    public final String d;
    public final String o;

    public j67(String str, int i, int i2, String str2, String str3, String str4) {
        this.a = i;
        this.b = i2;
        this.c = str;
        this.d = str2;
        this.o = str3;
        this.X = str4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && j67.class == obj.getClass()) {
            j67 j67Var = (j67) obj;
            if (this.a == j67Var.a && this.b == j67Var.b && TextUtils.equals(this.c, j67Var.c) && TextUtils.equals(this.d, j67Var.d) && TextUtils.equals(this.o, j67Var.o) && TextUtils.equals(this.X, j67Var.X)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = ((this.a * 31) + this.b) * 31;
        String str = this.c;
        int iHashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.d;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.o;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.X;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeInt(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeString(this.o);
        parcel.writeString(this.X);
    }

    public j67(Parcel parcel) {
        this.a = parcel.readInt();
        this.b = parcel.readInt();
        this.c = parcel.readString();
        this.d = parcel.readString();
        this.o = parcel.readString();
        this.X = parcel.readString();
    }
}
