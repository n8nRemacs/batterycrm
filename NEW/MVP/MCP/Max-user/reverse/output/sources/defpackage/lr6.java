package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class lr6 extends mc7 {
    public static final Parcelable.Creator<lr6> CREATOR = new wf4(20);
    public final String b;
    public final String c;
    public final String d;
    public final byte[] o;

    public lr6(String str, byte[] bArr, String str2, String str3) {
        super("GEOB");
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.o = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && lr6.class == obj.getClass()) {
            lr6 lr6Var = (lr6) obj;
            if (xxg.a(this.b, lr6Var.b) && xxg.a(this.c, lr6Var.c) && xxg.a(this.d, lr6Var.d) && Arrays.equals(this.o, lr6Var.o)) {
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
        return Arrays.hashCode(this.o) + ((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    @Override // defpackage.mc7
    public final String toString() {
        String str = this.a;
        int iF = u45.f(36, str);
        String str2 = this.b;
        int iF2 = u45.f(iF, str2);
        String str3 = this.c;
        int iF3 = u45.f(iF2, str3);
        String str4 = this.d;
        StringBuilder sb = new StringBuilder(u45.f(iF3, str4));
        sb.append(str);
        sb.append(": mimeType=");
        sb.append(str2);
        sb.append(", filename=");
        return ctd.j(sb, str3, ", description=", str4);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeByteArray(this.o);
    }

    public lr6(Parcel parcel) {
        super("GEOB");
        String string = parcel.readString();
        int i = xxg.a;
        this.b = string;
        this.c = parcel.readString();
        this.d = parcel.readString();
        this.o = parcel.createByteArray();
    }
}
