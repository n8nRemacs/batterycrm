package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class lsc implements Parcelable {
    public static final Parcelable.Creator<lsc> CREATOR = new wcb(21);
    public final isc a;

    public lsc(isc iscVar) {
        this.a = iscVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lsc) && fni.a(this.a, ((lsc) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "QualityParc(value=" + this.a + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        isc iscVar = this.a;
        parcel.writeString(iscVar.a.a);
        parcel.writeInt(iscVar.b);
        parcel.writeInt(iscVar.c);
        parcel.writeInt(iscVar.d);
        parcel.writeLong(iscVar.e);
        parcel.writeByte(iscVar.f ? (byte) 1 : (byte) 0);
    }
}
