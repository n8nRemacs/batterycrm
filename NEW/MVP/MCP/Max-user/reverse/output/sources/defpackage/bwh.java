package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class bwh implements Parcelable {
    public static final Parcelable.Creator<bwh> CREATOR = new obh(4);
    public final boolean X;
    public final boolean Y;
    public final String a;
    public final boolean b;
    public final String c;
    public final int d;
    public final boolean o;

    public bwh(int i, String str, String str2, boolean z, boolean z2, boolean z3, boolean z4) {
        this.a = str;
        this.b = z;
        this.c = str2;
        this.d = i;
        this.o = z2;
        this.X = z3;
        this.Y = z4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bwh)) {
            return false;
        }
        bwh bwhVar = (bwh) obj;
        return fni.a(this.a, bwhVar.a) && this.b == bwhVar.b && fni.a(this.c, bwhVar.c) && this.d == bwhVar.d && this.o == bwhVar.o && this.X == bwhVar.X && this.Y == bwhVar.Y;
    }

    public final int hashCode() {
        int iB = a9h.b(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return Boolean.hashCode(this.Y) + a9h.b(a9h.b(utb.k(this.d, (iB + (str == null ? 0 : str.hashCode())) * 31, 31), 31, this.o), 31, this.X);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WebAppRootViewStateParc(title=");
        sb.append(this.a);
        sb.append(", isVerified=");
        sb.append(this.b);
        sb.append(", url=");
        sb.append(this.c);
        sb.append(", loadingState=");
        int i = this.d;
        sb.append(i != 1 ? i != 2 ? i != 3 ? "null" : "ERROR" : "WEB_VIEW" : "LOADING");
        sb.append(", showBackButton=");
        az1.t(", needShowCloseConfirmationDialog=", ", isBrightnessMaximized=", sb, this.o, this.X);
        return az1.k(sb, this.Y, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        parcel.writeString(this.a);
        parcel.writeInt(this.b ? 1 : 0);
        parcel.writeString(this.c);
        int i2 = this.d;
        if (i2 == 1) {
            str = "LOADING";
        } else if (i2 == 2) {
            str = "WEB_VIEW";
        } else {
            if (i2 != 3) {
                throw null;
            }
            str = "ERROR";
        }
        parcel.writeString(str);
        parcel.writeInt(this.o ? 1 : 0);
        parcel.writeInt(this.X ? 1 : 0);
        parcel.writeInt(this.Y ? 1 : 0);
    }
}
