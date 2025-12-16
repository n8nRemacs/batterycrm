package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class q1a extends mc7 {
    public static final Parcelable.Creator<q1a> CREATOR = new pq8(11);
    public final int[] X;
    public final int b;
    public final int c;
    public final int d;
    public final int[] o;

    public q1a(int i, int i2, int i3, int[] iArr, int[] iArr2) {
        super("MLLT");
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.o = iArr;
        this.X = iArr2;
    }

    @Override // defpackage.mc7, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && q1a.class == obj.getClass()) {
            q1a q1aVar = (q1a) obj;
            if (this.b == q1aVar.b && this.c == q1aVar.c && this.d == q1aVar.d && Arrays.equals(this.o, q1aVar.o) && Arrays.equals(this.X, q1aVar.X)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.X) + ((Arrays.hashCode(this.o) + ((((((527 + this.b) * 31) + this.c) * 31) + this.d) * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.b);
        parcel.writeInt(this.c);
        parcel.writeInt(this.d);
        parcel.writeIntArray(this.o);
        parcel.writeIntArray(this.X);
    }

    public q1a(Parcel parcel) {
        super("MLLT");
        this.b = parcel.readInt();
        this.c = parcel.readInt();
        this.d = parcel.readInt();
        int[] iArrCreateIntArray = parcel.createIntArray();
        int i = xxg.a;
        this.o = iArrCreateIntArray;
        this.X = parcel.createIntArray();
    }
}
