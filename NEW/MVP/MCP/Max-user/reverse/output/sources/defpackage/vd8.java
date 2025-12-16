package defpackage;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class vd8 implements Parcelable {
    public static final Parcelable.Creator<vd8> CREATOR = new f18(27);
    public final Integer X;
    public final Long Y;
    public final int Z;
    public final long a;
    public final Uri b;
    public final String c;
    public final int d;
    public final long o;
    public final int s0;
    public final long t0;
    public final Uri u0;
    public final ud8 v0;

    public vd8(long j, Uri uri, String str, int i, long j2, Integer num, Long l, int i2, int i3, long j3, Uri uri2) {
        Object next;
        ud8 ud8Var;
        this.a = j;
        this.b = uri;
        this.c = str;
        this.d = i;
        this.o = j2;
        this.X = num;
        this.Y = l;
        this.Z = i2;
        this.s0 = i3;
        this.t0 = j3;
        this.u0 = uri2;
        f2 f2Var = new f2(0, uz9.w0);
        while (true) {
            if (!f2Var.hasNext()) {
                next = null;
                break;
            } else {
                next = f2Var.next();
                if (((uz9) next).a.equalsIgnoreCase(str)) {
                    break;
                }
            }
        }
        uz9 uz9Var = (uz9) next;
        switch ((uz9Var == null ? uz9.c : uz9Var).ordinal()) {
            case 1:
            case 2:
            case 5:
            case 6:
            case 7:
            case 8:
                ud8Var = ud8.b;
                break;
            case 3:
            default:
                ud8Var = ud8.a;
                break;
            case 4:
                ud8Var = ud8.c;
                break;
            case 9:
            case 10:
                ud8Var = ud8.d;
                break;
        }
        this.v0 = ud8Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vd8)) {
            return false;
        }
        vd8 vd8Var = (vd8) obj;
        return this.a == vd8Var.a && fni.a(this.b, vd8Var.b) && fni.a(this.c, vd8Var.c) && this.d == vd8Var.d && this.o == vd8Var.o && fni.a(this.X, vd8Var.X) && fni.a(this.Y, vd8Var.Y) && this.Z == vd8Var.Z && this.s0 == vd8Var.s0 && this.t0 == vd8Var.t0 && fni.a(this.u0, vd8Var.u0);
    }

    public final int hashCode() {
        int iA = a9h.a(xrf.k(this.d, u45.e((this.b.hashCode() + (Long.hashCode(this.a) * 31)) * 31, 31, this.c), 31), 31, this.o);
        Integer num = this.X;
        int iHashCode = (iA + (num == null ? 0 : num.hashCode())) * 31;
        Long l = this.Y;
        return this.u0.hashCode() + a9h.a(xrf.k(this.s0, xrf.k(this.Z, (iHashCode + (l != null ? l.hashCode() : 0)) * 31, 31), 31), 31, this.t0);
    }

    public final String toString() {
        String str = wqi.a() ? this.b : "*****";
        Object obj = wqi.a() ? this.u0 : "*****";
        StringBuilder sb = new StringBuilder("LocalMediaItem(id=");
        sb.append(this.a);
        sb.append(", uri=");
        sb.append(str);
        sb.append(", mimeType='");
        sb.append(this.c);
        sb.append("', albumId=");
        sb.append(this.d);
        az1.r(this.o, ", dateTaken=", ", orientation=", sb);
        sb.append(this.X);
        sb.append(", duration=");
        sb.append(this.Y);
        sb.append(", width=");
        hf3.g(sb, this.Z, ", height=", this.s0, ", size=");
        sb.append(this.t0);
        sb.append(", thumbnailUri=");
        sb.append(obj);
        sb.append(", type=");
        sb.append(this.v0);
        sb.append(")");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.a);
        parcel.writeParcelable(this.b, i);
        parcel.writeString(this.c);
        parcel.writeInt(this.d);
        parcel.writeLong(this.o);
        Integer num = this.X;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        Long l = this.Y;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        parcel.writeInt(this.Z);
        parcel.writeInt(this.s0);
        parcel.writeLong(this.t0);
        parcel.writeParcelable(this.u0, i);
    }

    public /* synthetic */ vd8(long j, Uri uri, String str, int i, long j2, Integer num, Long l, Uri uri2, int i2) {
        this(j, uri, str, i, j2, num, (i2 & 64) != 0 ? null : l, 0, 0, 0L, uri2);
    }
}
