package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class ec9 implements Parcelable {
    public static final Parcelable.Creator<ec9> CREATOR = new pq8(8);
    public final int a;
    public final s5g b;
    public final hoe c;
    public final Integer d;
    public final foe o;

    public /* synthetic */ ec9(int i, n5g n5gVar, Integer num) {
        this(i, n5gVar, hoe.a, num, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ec9)) {
            return false;
        }
        ec9 ec9Var = (ec9) obj;
        return this.a == ec9Var.a && fni.a(this.b, ec9Var.b) && this.c == ec9Var.c && fni.a(this.d, ec9Var.d) && fni.a(this.o, ec9Var.o);
    }

    public final int hashCode() {
        int iHashCode = (this.c.hashCode() + xc0.d(Integer.hashCode(this.a) * 31, 31, this.b)) * 31;
        Integer num = this.d;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        foe foeVar = this.o;
        return iHashCode2 + (foeVar != null ? foeVar.hashCode() : 0);
    }

    public final String toString() {
        return "MemberListAction(id=" + this.a + ", text=" + this.b + ", type=" + this.c + ", startIconRes=" + this.d + ", endViewType=" + this.o + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iIntValue;
        parcel.writeInt(this.a);
        parcel.writeParcelable(this.b, i);
        parcel.writeString(this.c.name());
        Integer num = this.d;
        if (num == null) {
            iIntValue = 0;
        } else {
            parcel.writeInt(1);
            iIntValue = num.intValue();
        }
        parcel.writeInt(iIntValue);
        parcel.writeParcelable(this.o, i);
    }

    public ec9(int i, s5g s5gVar, hoe hoeVar, Integer num, foe foeVar) {
        this.a = i;
        this.b = s5gVar;
        this.c = hoeVar;
        this.d = num;
        this.o = foeVar;
    }
}
