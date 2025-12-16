package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class sa2 extends mc7 {
    public static final Parcelable.Creator<sa2> CREATOR = new e8(16);
    public final mc7[] X;
    public final String b;
    public final boolean c;
    public final boolean d;
    public final String[] o;

    public sa2(String str, boolean z, boolean z2, String[] strArr, mc7[] mc7VarArr) {
        super("CTOC");
        this.b = str;
        this.c = z;
        this.d = z2;
        this.o = strArr;
        this.X = mc7VarArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && sa2.class == obj.getClass()) {
            sa2 sa2Var = (sa2) obj;
            if (this.c == sa2Var.c && this.d == sa2Var.d && xxg.a(this.b, sa2Var.b) && Arrays.equals(this.o, sa2Var.o) && Arrays.equals(this.X, sa2Var.X)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = (((527 + (this.c ? 1 : 0)) * 31) + (this.d ? 1 : 0)) * 31;
        String str = this.b;
        return i + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        parcel.writeByte(this.c ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.d ? (byte) 1 : (byte) 0);
        parcel.writeStringArray(this.o);
        mc7[] mc7VarArr = this.X;
        parcel.writeInt(mc7VarArr.length);
        for (mc7 mc7Var : mc7VarArr) {
            parcel.writeParcelable(mc7Var, 0);
        }
    }

    public sa2(Parcel parcel) {
        super("CTOC");
        String string = parcel.readString();
        int i = xxg.a;
        this.b = string;
        this.c = parcel.readByte() != 0;
        this.d = parcel.readByte() != 0;
        this.o = parcel.createStringArray();
        int i2 = parcel.readInt();
        this.X = new mc7[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            this.X[i3] = (mc7) parcel.readParcelable(mc7.class.getClassLoader());
        }
    }
}
