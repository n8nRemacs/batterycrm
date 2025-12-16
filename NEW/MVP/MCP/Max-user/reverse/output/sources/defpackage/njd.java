package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class njd implements Parcelable {
    public static final Parcelable.Creator<njd> CREATOR = new wcb(23);
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final Long o;

    public njd(Long l, String str, String str2, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.o = l;
    }

    public static njd a(njd njdVar, Long l) {
        String str = njdVar.a;
        String str2 = njdVar.b;
        String str3 = njdVar.c;
        String str4 = njdVar.d;
        njdVar.getClass();
        return new njd(l, str, str2, str3, str4);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof njd)) {
            return false;
        }
        njd njdVar = (njd) obj;
        return fni.a(this.a, njdVar.a) && fni.a(this.b, njdVar.b) && fni.a(this.c, njdVar.c) && fni.a(this.d, njdVar.d) && fni.a(this.o, njdVar.o);
    }

    public final int hashCode() {
        int iE = u45.e(u45.e(u45.e(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
        Long l = this.o;
        return iE + (l == null ? 0 : l.hashCode());
    }

    public final String toString() {
        StringBuilder sbL = wy1.l("RegistrationData(token=", this.a, ", phone=", this.b, ", name=");
        ho7.r(sbL, this.c, ", surname=", this.d, ", photoId=");
        sbL.append(this.o);
        sbL.append(")");
        return sbL.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        Long l = this.o;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
    }
}
