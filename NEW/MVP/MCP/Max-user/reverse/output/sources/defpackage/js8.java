package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class js8 implements qy9 {
    public static final Parcelable.Creator<js8> CREATOR = new pq8(1);
    public final String a;
    public final byte[] b;
    public final int c;
    public final int d;

    public js8(byte[] bArr, int i, int i2, String str) {
        this.a = str;
        this.b = bArr;
        this.c = i;
        this.d = i2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && js8.class == obj.getClass()) {
            js8 js8Var = (js8) obj;
            if (this.a.equals(js8Var.a) && Arrays.equals(this.b, js8Var.b) && this.c == js8Var.c && this.d == js8Var.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((Arrays.hashCode(this.b) + u45.e(527, 31, this.a)) * 31) + this.c) * 31) + this.d;
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.a);
        return strValueOf.length() != 0 ? "mdta: key=".concat(strValueOf) : new String("mdta: key=");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeByteArray(this.b);
        parcel.writeInt(this.c);
        parcel.writeInt(this.d);
    }

    public js8(Parcel parcel) {
        String string = parcel.readString();
        int i = xxg.a;
        this.a = string;
        this.b = parcel.createByteArray();
        this.c = parcel.readInt();
        this.d = parcel.readInt();
    }
}
