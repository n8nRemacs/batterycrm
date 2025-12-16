package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class gp7 extends mc7 {
    public static final Parcelable.Creator<gp7> CREATOR = new wf4(27);
    public final String b;
    public final String c;
    public final String d;

    public gp7(String str, String str2, String str3) {
        super("----");
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && gp7.class == obj.getClass()) {
            gp7 gp7Var = (gp7) obj;
            if (xxg.a(this.c, gp7Var.c) && xxg.a(this.b, gp7Var.b) && xxg.a(this.d, gp7Var.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.b;
        int iHashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.c;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.d;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // defpackage.mc7
    public final String toString() {
        String str = this.a;
        int iF = u45.f(23, str);
        String str2 = this.b;
        int iF2 = u45.f(iF, str2);
        String str3 = this.c;
        StringBuilder sb = new StringBuilder(u45.f(iF2, str3));
        sb.append(str);
        sb.append(": domain=");
        sb.append(str2);
        sb.append(", description=");
        sb.append(str3);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.d);
    }

    public gp7(Parcel parcel) {
        super("----");
        String string = parcel.readString();
        int i = xxg.a;
        this.b = string;
        this.c = parcel.readString();
        this.d = parcel.readString();
    }
}
