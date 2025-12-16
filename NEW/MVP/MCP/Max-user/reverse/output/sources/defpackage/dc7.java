package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class dc7 implements qy9 {
    public static final Parcelable.Creator<dc7> CREATOR = new wf4(24);
    public final int X;
    public final int a;
    public final String b;
    public final String c;
    public final String d;
    public final boolean o;

    public dc7(int i, int i2, String str, String str2, String str3, boolean z) {
        fsi.b(i2 == -1 || i2 > 0);
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.o = z;
        this.X = i2;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:71:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.dc7 a(java.util.Map r13) throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 265
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dc7.a(java.util.Map):dc7");
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && dc7.class == obj.getClass()) {
            dc7 dc7Var = (dc7) obj;
            if (this.a == dc7Var.a && xxg.a(this.b, dc7Var.b) && xxg.a(this.c, dc7Var.c) && xxg.a(this.d, dc7Var.d) && this.o == dc7Var.o && this.X == dc7Var.X) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = (527 + this.a) * 31;
        String str = this.b;
        int iHashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.c;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.d;
        return ((((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + (this.o ? 1 : 0)) * 31) + this.X;
    }

    @Override // defpackage.qy9
    public final void p(t19 t19Var) {
        String str = this.c;
        if (str != null) {
            t19Var.E = str;
        }
        String str2 = this.b;
        if (str2 != null) {
            t19Var.C = str2;
        }
    }

    public final String toString() {
        String str = this.c;
        int iF = u45.f(80, str);
        String str2 = this.b;
        StringBuilder sb = new StringBuilder(u45.f(iF, str2));
        sb.append("IcyHeaders: name=\"");
        sb.append(str);
        sb.append("\", genre=\"");
        sb.append(str2);
        sb.append("\", bitrate=");
        sb.append(this.a);
        sb.append(", metadataInterval=");
        sb.append(this.X);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        int i2 = xxg.a;
        parcel.writeInt(this.o ? 1 : 0);
        parcel.writeInt(this.X);
    }

    public dc7(Parcel parcel) {
        this.a = parcel.readInt();
        this.b = parcel.readString();
        this.c = parcel.readString();
        this.d = parcel.readString();
        int i = xxg.a;
        this.o = parcel.readInt() != 0;
        this.X = parcel.readInt();
    }
}
