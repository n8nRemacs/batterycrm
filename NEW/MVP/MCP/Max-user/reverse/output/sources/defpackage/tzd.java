package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class tzd extends uzd {
    public static final Parcelable.Creator<tzd> CREATOR = new wcb(28);
    public final lf4 a;
    public final boolean b;
    public final Parcelable c;

    public tzd(lf4 lf4Var, boolean z, Parcelable parcelable) {
        this.a = lf4Var;
        this.b = z;
        this.c = parcelable;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tzd)) {
            return false;
        }
        tzd tzdVar = (tzd) obj;
        return fni.a(this.a, tzdVar.a) && this.b == tzdVar.b && fni.a(this.c, tzdVar.c);
    }

    public final int hashCode() {
        int iB = a9h.b(this.a.hashCode() * 31, 31, this.b);
        Parcelable parcelable = this.c;
        return iB + (parcelable == null ? 0 : parcelable.hashCode());
    }

    public final String toString() {
        return "DelayedAttrs(sendTime=" + this.a + ", notifySender=" + this.b + ", input=" + this.c + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.a.writeToParcel(parcel, i);
        parcel.writeInt(this.b ? 1 : 0);
        parcel.writeParcelable(this.c, i);
    }
}
