package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class mi5 implements qy9 {
    public static final Parcelable.Creator<mi5> CREATOR;
    public static final gf6 Y;
    public static final gf6 Z;
    public int X;
    public final String a;
    public final String b;
    public final long c;
    public final long d;
    public final byte[] o;

    static {
        ef6 ef6Var = new ef6();
        ef6Var.k = "application/id3";
        Y = new gf6(ef6Var);
        ef6 ef6Var2 = new ef6();
        ef6Var2.k = "application/x-scte35";
        Z = new gf6(ef6Var2);
        CREATOR = new wf4(11);
    }

    public mi5(String str, String str2, long j, long j2, byte[] bArr) {
        this.a = str;
        this.b = str2;
        this.c = j;
        this.d = j2;
        this.o = bArr;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && mi5.class == obj.getClass()) {
            mi5 mi5Var = (mi5) obj;
            if (this.c == mi5Var.c && this.d == mi5Var.d && xxg.a(this.a, mi5Var.a) && xxg.a(this.b, mi5Var.b) && Arrays.equals(this.o, mi5Var.o)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.X == 0) {
            String str = this.a;
            int iHashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
            String str2 = this.b;
            int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            long j = this.c;
            int i = (iHashCode2 + ((int) (j ^ (j >>> 32)))) * 31;
            long j2 = this.d;
            this.X = Arrays.hashCode(this.o) + ((i + ((int) (j2 ^ (j2 >>> 32)))) * 31);
        }
        return this.X;
    }

    @Override // defpackage.qy9
    public final gf6 l() {
        String str = this.a;
        str.getClass();
        switch (str) {
            case "urn:scte:scte35:2014:bin":
                return Z;
            case "https://aomedia.org/emsg/ID3":
            case "https://developer.apple.com/streaming/emsg-id3":
                return Y;
            default:
                return null;
        }
    }

    @Override // defpackage.qy9
    public final byte[] o() {
        if (l() != null) {
            return this.o;
        }
        return null;
    }

    public final String toString() {
        String str = this.a;
        int iF = u45.f(79, str);
        String str2 = this.b;
        StringBuilder sb = new StringBuilder(u45.f(iF, str2));
        sb.append("EMSG: scheme=");
        sb.append(str);
        sb.append(", id=");
        sb.append(this.d);
        az1.r(this.c, ", durationMs=", ", value=", sb);
        sb.append(str2);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeLong(this.c);
        parcel.writeLong(this.d);
        parcel.writeByteArray(this.o);
    }

    public mi5(Parcel parcel) {
        String string = parcel.readString();
        int i = xxg.a;
        this.a = string;
        this.b = parcel.readString();
        this.c = parcel.readLong();
        this.d = parcel.readLong();
        this.o = parcel.createByteArray();
    }
}
