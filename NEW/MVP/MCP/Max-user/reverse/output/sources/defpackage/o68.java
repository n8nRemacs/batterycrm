package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class o68 implements w68, u68 {
    public static final Parcelable.Creator<o68> CREATOR = new f18(17);
    public final long a;
    public final long b;
    public final boolean c;
    public final Long d;
    public final String o;

    public /* synthetic */ o68(long j, long j2, Long l, String str, int i) {
        this(j, (i & 2) != 0 ? 0L : j2, false, (i & 8) != 0 ? null : l, str);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // defpackage.w68, defpackage.u68
    public final String n() {
        return this.o;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.a);
        parcel.writeLong(this.b);
        parcel.writeInt(this.c ? 1 : 0);
        Long l = this.d;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        parcel.writeString(this.o);
    }

    public o68(long j, long j2, boolean z, Long l, String str) {
        this.a = j;
        this.b = j2;
        this.c = z;
        this.d = l;
        this.o = str;
    }
}
