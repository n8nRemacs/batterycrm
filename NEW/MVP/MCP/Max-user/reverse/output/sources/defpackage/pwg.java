package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class pwg extends mc7 {
    public static final Parcelable.Creator<pwg> CREATOR = new z6e(29);
    public final String b;
    public final String c;

    public pwg(String str, String str2, String str3) {
        super(str);
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && pwg.class == obj.getClass()) {
            pwg pwgVar = (pwg) obj;
            if (this.a.equals(pwgVar.a) && xxg.a(this.b, pwgVar.b) && xxg.a(this.c, pwgVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iE = u45.e(527, 31, this.a);
        String str = this.b;
        int iHashCode = (iE + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.c;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // defpackage.mc7
    public final String toString() {
        String str = this.a;
        int iF = u45.f(6, str);
        String str2 = this.c;
        StringBuilder sb = new StringBuilder(u45.f(iF, str2));
        sb.append(str);
        sb.append(": url=");
        sb.append(str2);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public pwg(Parcel parcel) {
        String string = parcel.readString();
        int i = xxg.a;
        super(string);
        this.b = parcel.readString();
        this.c = parcel.readString();
    }
}
