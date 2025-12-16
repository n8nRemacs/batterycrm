package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class b9g extends z7f {
    public static final Parcelable.Creator<b9g> CREATOR = new z6e(25);
    public final long a;
    public final long b;

    public b9g(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public static long a(long j, qyg qygVar) {
        long jS = qygVar.s();
        if ((128 & jS) != 0) {
            return 8589934591L & ((((jS & 1) << 32) | qygVar.t()) + j);
        }
        return -9223372036854775807L;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.a);
        parcel.writeLong(this.b);
    }
}
