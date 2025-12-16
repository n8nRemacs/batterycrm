package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class tp7 implements Parcelable {
    public static final Parcelable.Creator<tp7> CREATOR = new wf4(29);
    public final String a;
    public final String b;
    public final int c;
    public final long d;

    public /* synthetic */ tp7(int i, int i2, long j, String str, String str2) {
        this((i2 & 4) != 0 ? 0 : i, (i2 & 8) != 0 ? 0L : j, (i2 & 1) != 0 ? null : str, (i2 & 2) != 0 ? null : str2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tp7)) {
            return false;
        }
        tp7 tp7Var = (tp7) obj;
        return fni.a(this.a, tp7Var.a) && fni.a(this.b, tp7Var.b) && this.c == tp7Var.c && this.d == tp7Var.d;
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        return Long.hashCode(this.d) + xrf.k(this.c, (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31, 31);
    }

    public final String toString() {
        StringBuilder sbL = wy1.l("EmailData(email=", this.a, ", prevEmail=", this.b, ", emailCodeLength=");
        sbL.append(this.c);
        sbL.append(", durationTimerForResend=");
        sbL.append(this.d);
        sbL.append(")");
        return sbL.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeInt(this.c);
        parcel.writeLong(this.d);
    }

    public tp7(int i, long j, String str, String str2) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = j;
    }
}
