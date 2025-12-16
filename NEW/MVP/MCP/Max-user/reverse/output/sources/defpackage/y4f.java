package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Locale;

/* loaded from: classes.dex */
public final class y4f implements Parcelable {
    public static final Parcelable.Creator<y4f> CREATOR = new z6e(12);
    public final long a;
    public final long b;
    public final int c;

    public y4f(int i, long j, long j2) {
        fsi.b(j < j2);
        this.a = j;
        this.b = j2;
        this.c = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && y4f.class == obj.getClass()) {
            y4f y4fVar = (y4f) obj;
            if (this.a == y4fVar.a && this.b == y4fVar.b && this.c == y4fVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.a), Long.valueOf(this.b), Integer.valueOf(this.c)});
    }

    public final String toString() {
        int i = xxg.a;
        Locale locale = Locale.US;
        StringBuilder sbL = az1.l(this.a, "Segment: startTimeMs=", ", endTimeMs=");
        sbL.append(this.b);
        sbL.append(", speedDivisor=");
        sbL.append(this.c);
        return sbL.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.a);
        parcel.writeLong(this.b);
        parcel.writeInt(this.c);
    }
}
