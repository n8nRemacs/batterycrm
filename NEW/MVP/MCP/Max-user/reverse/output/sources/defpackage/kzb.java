package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class kzb implements qy9 {
    public static final Parcelable.Creator<kzb> CREATOR = new wcb(10);
    public final int X;
    public final int Y;
    public final byte[] Z;
    public final int a;
    public final String b;
    public final String c;
    public final int d;
    public final int o;

    public kzb(int i, String str, String str2, int i2, int i3, int i4, int i5, byte[] bArr) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = i2;
        this.o = i3;
        this.X = i4;
        this.Y = i5;
        this.Z = bArr;
    }

    public static kzb a(qyg qygVar) {
        int iF = qygVar.f();
        String strQ = qygVar.q(qygVar.f(), mb2.a);
        String strQ2 = qygVar.q(qygVar.f(), mb2.c);
        int iF2 = qygVar.f();
        int iF3 = qygVar.f();
        int iF4 = qygVar.f();
        int iF5 = qygVar.f();
        int iF6 = qygVar.f();
        byte[] bArr = new byte[iF6];
        qygVar.e(0, bArr, iF6);
        return new kzb(iF, strQ, strQ2, iF2, iF3, iF4, iF5, bArr);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && kzb.class == obj.getClass()) {
            kzb kzbVar = (kzb) obj;
            if (this.a == kzbVar.a && this.b.equals(kzbVar.b) && this.c.equals(kzbVar.c) && this.d == kzbVar.d && this.o == kzbVar.o && this.X == kzbVar.X && this.Y == kzbVar.Y && Arrays.equals(this.Z, kzbVar.Z)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.Z) + ((((((((u45.e(u45.e((527 + this.a) * 31, 31, this.b), 31, this.c) + this.d) * 31) + this.o) * 31) + this.X) * 31) + this.Y) * 31);
    }

    @Override // defpackage.qy9
    public final void p(t19 t19Var) {
        t19Var.a(this.a, this.Z);
    }

    public final String toString() {
        String str = this.b;
        int iF = u45.f(32, str);
        String str2 = this.c;
        StringBuilder sb = new StringBuilder(u45.f(iF, str2));
        sb.append("Picture: mimeType=");
        sb.append(str);
        sb.append(", description=");
        sb.append(str2);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeInt(this.d);
        parcel.writeInt(this.o);
        parcel.writeInt(this.X);
        parcel.writeInt(this.Y);
        parcel.writeByteArray(this.Z);
    }

    public kzb(Parcel parcel) {
        this.a = parcel.readInt();
        String string = parcel.readString();
        int i = xxg.a;
        this.b = string;
        this.c = parcel.readString();
        this.d = parcel.readInt();
        this.o = parcel.readInt();
        this.X = parcel.readInt();
        this.Y = parcel.readInt();
        this.Z = parcel.createByteArray();
    }
}
