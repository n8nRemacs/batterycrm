package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class ffg implements Parcelable {
    public static final Parcelable.Creator<ffg> CREATOR = new z6e(27);
    public final int X;
    public final int Y;
    public final int Z;
    public final String a;
    public final String b;
    public final String c;
    public final int d;
    public final int o;
    public final int s0;

    public ffg(String str, String str2, String str3, int i, int i2, int i3, int i4, int i5, int i6) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = i;
        this.o = i2;
        this.X = i3;
        this.Y = i4;
        this.Z = i5;
        this.s0 = i6;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ffg.class == obj.getClass()) {
            ffg ffgVar = (ffg) obj;
            String str = ffgVar.c;
            String str2 = ffgVar.b;
            String str3 = ffgVar.a;
            if (this.d != ffgVar.d || this.o != ffgVar.o || this.X != ffgVar.X || this.Y != ffgVar.Y || this.Z != ffgVar.Z || this.s0 != ffgVar.s0) {
                return false;
            }
            String str4 = this.a;
            if (str4 == null ? str3 != null : !str4.equals(str3)) {
                return false;
            }
            String str5 = this.b;
            if (str5 == null ? str2 != null : !str5.equals(str2)) {
                return false;
            }
            String str6 = this.c;
            if (str6 != null) {
                return str6.equals(str);
            }
            if (str == null) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.c;
        return ((((((((((((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + this.d) * 31) + this.o) * 31) + this.X) * 31) + this.Y) * 31) + this.Z) * 31) + this.s0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Track{id='");
        sb.append(this.a);
        sb.append("', label='");
        sb.append(this.b);
        sb.append("', language='");
        sb.append(this.c);
        sb.append("', width=");
        sb.append(this.d);
        sb.append(", height=");
        sb.append(this.o);
        sb.append(", bitrate=");
        sb.append(this.X);
        sb.append(", rendererIndex=");
        sb.append(this.Y);
        sb.append(", groupIndex=");
        sb.append(this.Z);
        sb.append(", trackIndex=");
        return xc0.h(sb, this.s0, '}');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeInt(this.d);
        parcel.writeInt(this.o);
        parcel.writeInt(this.X);
        parcel.writeInt(this.Y);
        parcel.writeInt(this.Z);
        parcel.writeInt(this.s0);
    }

    public ffg(Parcel parcel) {
        this.a = parcel.readString();
        this.b = parcel.readString();
        this.c = parcel.readString();
        this.d = parcel.readInt();
        this.o = parcel.readInt();
        this.X = parcel.readInt();
        this.Y = parcel.readInt();
        this.Z = parcel.readInt();
        this.s0 = parcel.readInt();
    }
}
