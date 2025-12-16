package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class hd9 implements Parcelable {
    public static final Parcelable.Creator<hd9> CREATOR = new pq8(9);
    public final long a;
    public final br2 b;
    public final boolean c;
    public final Integer d;

    public /* synthetic */ hd9(long j, br2 br2Var, int i) {
        this(j, br2Var, true, (i & 8) != 0 ? null : 10);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hd9)) {
            return false;
        }
        hd9 hd9Var = (hd9) obj;
        return this.a == hd9Var.a && this.b == hd9Var.b && this.c == hd9Var.c && fni.a(this.d, hd9Var.d);
    }

    public final int hashCode() {
        int iB = a9h.b((this.b.hashCode() + (Long.hashCode(this.a) * 31)) * 31, 31, this.c);
        Integer num = this.d;
        return iB + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        return "MembersListArgs(chatId=" + this.a + ", chatMemberType=" + this.b + ", isLongClickEnabled=" + this.c + ", memberLimit=" + this.d + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.a);
        parcel.writeString(this.b.name());
        parcel.writeInt(this.c ? 1 : 0);
        Integer num = this.d;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
    }

    public hd9(long j, br2 br2Var, boolean z, Integer num) {
        this.a = j;
        this.b = br2Var;
        this.c = z;
        this.d = num;
    }
}
