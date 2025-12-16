package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class eg3 extends mc7 {
    public static final Parcelable.Creator<eg3> CREATOR = new e8(23);
    public final String b;
    public final String c;
    public final String d;

    public eg3(String str, String str2, String str3) {
        super("COMM");
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && eg3.class == obj.getClass()) {
            eg3 eg3Var = (eg3) obj;
            if (xxg.a(this.c, eg3Var.c) && xxg.a(this.b, eg3Var.b) && xxg.a(this.d, eg3Var.d)) {
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
        int iF = u45.f(25, str);
        String str2 = this.b;
        int iF2 = u45.f(iF, str2);
        String str3 = this.c;
        StringBuilder sb = new StringBuilder(u45.f(iF2, str3));
        sb.append(str);
        sb.append(": language=");
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

    public eg3(Parcel parcel) {
        super("COMM");
        String string = parcel.readString();
        int i = xxg.a;
        this.b = string;
        this.c = parcel.readString();
        this.d = parcel.readString();
    }
}
