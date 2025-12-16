package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class zea implements Parcelable, t98 {
    public static final Parcelable.Creator<zea> CREATOR = new pq8(16);
    public final long a;
    public final String b;
    public final int c;
    public final boolean d;

    public zea(long j, String str, int i, boolean z) {
        this.a = j;
        this.b = str;
        this.c = i;
        this.d = z;
    }

    public static zea x(zea zeaVar, boolean z) {
        long j = zeaVar.a;
        String str = zeaVar.b;
        int i = zeaVar.c;
        zeaVar.getClass();
        return new zea(j, str, i, z);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zea)) {
            return false;
        }
        zea zeaVar = (zea) obj;
        return this.a == zeaVar.a && fni.a(this.b, zeaVar.b) && this.c == zeaVar.c && this.d == zeaVar.d;
    }

    @Override // defpackage.t98
    public final long getItemId() {
        return this.a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + xrf.k(this.c, u45.e(Long.hashCode(this.a) * 31, 31, this.b), 31);
    }

    @Override // defpackage.t98
    public final int m() {
        return 1;
    }

    public final String toString() {
        StringBuilder sbN = ho7.n("NeuroAvatarModel(id=", this.a, ", url=", this.b);
        sbN.append(", categoryId=");
        sbN.append(this.c);
        sbN.append(", isSelected=");
        sbN.append(this.d);
        sbN.append(")");
        return sbN.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.a);
        parcel.writeString(this.b);
        parcel.writeInt(this.c);
        parcel.writeInt(this.d ? 1 : 0);
    }
}
