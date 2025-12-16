package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class qa2 extends mc7 {
    public static final Parcelable.Creator<qa2> CREATOR = new e8(15);
    public final long X;
    public final mc7[] Y;
    public final String b;
    public final int c;
    public final int d;
    public final long o;

    public qa2(String str, int i, int i2, long j, long j2, mc7[] mc7VarArr) {
        super("CHAP");
        this.b = str;
        this.c = i;
        this.d = i2;
        this.o = j;
        this.X = j2;
        this.Y = mc7VarArr;
    }

    @Override // defpackage.mc7, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && qa2.class == obj.getClass()) {
            qa2 qa2Var = (qa2) obj;
            if (this.c == qa2Var.c && this.d == qa2Var.d && this.o == qa2Var.o && this.X == qa2Var.X && xxg.a(this.b, qa2Var.b) && Arrays.equals(this.Y, qa2Var.Y)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = (((((((527 + this.c) * 31) + this.d) * 31) + ((int) this.o)) * 31) + ((int) this.X)) * 31;
        String str = this.b;
        return i + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        parcel.writeInt(this.c);
        parcel.writeInt(this.d);
        parcel.writeLong(this.o);
        parcel.writeLong(this.X);
        mc7[] mc7VarArr = this.Y;
        parcel.writeInt(mc7VarArr.length);
        for (mc7 mc7Var : mc7VarArr) {
            parcel.writeParcelable(mc7Var, 0);
        }
    }

    public qa2(Parcel parcel) {
        super("CHAP");
        String string = parcel.readString();
        int i = xxg.a;
        this.b = string;
        this.c = parcel.readInt();
        this.d = parcel.readInt();
        this.o = parcel.readLong();
        this.X = parcel.readLong();
        int i2 = parcel.readInt();
        this.Y = new mc7[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            this.Y[i3] = (mc7) parcel.readParcelable(mc7.class.getClassLoader());
        }
    }
}
