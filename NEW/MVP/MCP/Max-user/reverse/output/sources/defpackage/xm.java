package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class xm extends mc7 {
    public static final Parcelable.Creator<xm> CREATOR = new e8(2);
    public final String b;
    public final String c;
    public final int d;
    public final byte[] o;

    public xm(String str, String str2, int i, byte[] bArr) {
        super("APIC");
        this.b = str;
        this.c = str2;
        this.d = i;
        this.o = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && xm.class == obj.getClass()) {
            xm xmVar = (xm) obj;
            if (this.d == xmVar.d && xxg.a(this.b, xmVar.b) && xxg.a(this.c, xmVar.c) && Arrays.equals(this.o, xmVar.o)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = (527 + this.d) * 31;
        String str = this.b;
        int iHashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.c;
        return Arrays.hashCode(this.o) + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    @Override // defpackage.qy9
    public final void p(t19 t19Var) {
        t19Var.a(this.d, this.o);
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
        sb.append(": mimeType=");
        sb.append(str2);
        sb.append(", description=");
        sb.append(str3);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeInt(this.d);
        parcel.writeByteArray(this.o);
    }

    public xm(Parcel parcel) {
        super("APIC");
        String string = parcel.readString();
        int i = xxg.a;
        this.b = string;
        this.c = parcel.readString();
        this.d = parcel.readInt();
        this.o = parcel.createByteArray();
    }
}
