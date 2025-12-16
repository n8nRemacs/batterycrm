package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class pqc implements Parcelable {
    public static final Parcelable.Creator<pqc> CREATOR = new wcb(20);
    public final String X;
    public final long Y;
    public final qs2 Z;
    public final long a;
    public final String b;
    public final long c;
    public final Long d;
    public final long o;

    public pqc(long j, String str, long j2, Long l, long j3, String str2, long j4, qs2 qs2Var) {
        this.a = j;
        this.b = str;
        this.c = j2;
        this.d = l;
        this.o = j3;
        this.X = str2;
        this.Y = j4;
        this.Z = qs2Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pqc)) {
            return false;
        }
        pqc pqcVar = (pqc) obj;
        return this.a == pqcVar.a && fni.a(this.b, pqcVar.b) && this.c == pqcVar.c && fni.a(this.d, pqcVar.d) && this.o == pqcVar.o && fni.a(this.X, pqcVar.X) && this.Y == pqcVar.Y && this.Z == pqcVar.Z;
    }

    public final int hashCode() {
        int iHashCode = Long.hashCode(this.a) * 31;
        String str = this.b;
        int iA = a9h.a((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c);
        Long l = this.d;
        int iA2 = a9h.a((iA + (l == null ? 0 : l.hashCode())) * 31, 31, this.o);
        String str2 = this.X;
        return this.Z.hashCode() + a9h.a((iA2 + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.Y);
    }

    public final String toString() {
        StringBuilder sbN = ho7.n("PushInfo(pushId=", this.a, ", eventKey=", this.b);
        az1.r(this.c, ", chatServerId=", ", chatId=", sbN);
        sbN.append(this.d);
        sbN.append(", messageServerId=");
        sbN.append(this.o);
        sbN.append(", pushType=");
        sbN.append(this.X);
        sbN.append(", createdTime=");
        sbN.append(this.Y);
        sbN.append(", chatType=");
        sbN.append(this.Z);
        sbN.append(")");
        return sbN.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.a);
        parcel.writeString(this.b);
        parcel.writeLong(this.c);
        Long l = this.d;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        parcel.writeLong(this.o);
        parcel.writeString(this.X);
        parcel.writeLong(this.Y);
        this.Z.writeToParcel(parcel, i);
    }
}
