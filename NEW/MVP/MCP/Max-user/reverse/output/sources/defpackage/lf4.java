package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Calendar;

/* loaded from: classes2.dex */
public final class lf4 implements Parcelable {
    public static final Parcelable.Creator<lf4> CREATOR = new e8(28);
    public final xf4 a;
    public final t8g b;
    public final t8g c;

    public lf4(xf4 xf4Var, t8g t8gVar, t8g t8gVar2) {
        this.a = xf4Var;
        this.b = t8gVar;
        this.c = t8gVar2;
    }

    public static lf4 a(lf4 lf4Var, xf4 xf4Var, t8g t8gVar, t8g t8gVar2, int i) {
        if ((i & 1) != 0) {
            xf4Var = lf4Var.a;
        }
        if ((i & 2) != 0) {
            t8gVar = lf4Var.b;
        }
        if ((i & 4) != 0) {
            t8gVar2 = lf4Var.c;
        }
        return new lf4(xf4Var, t8gVar, t8gVar2);
    }

    public final long b() {
        Calendar calendar = Calendar.getInstance();
        xf4 xf4Var = this.a;
        calendar.set(1, xf4Var.d);
        calendar.set(2, xf4Var.c);
        calendar.set(5, xf4Var.b);
        calendar.set(11, this.b.a);
        calendar.set(12, this.c.a);
        calendar.set(13, 0);
        calendar.set(14, 0);
        wqi.c("DateTime", calendar.getTime().toString(), new Object[0]);
        return calendar.getTimeInMillis();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lf4)) {
            return false;
        }
        lf4 lf4Var = (lf4) obj;
        return fni.a(this.a, lf4Var.a) && fni.a(this.b, lf4Var.b) && fni.a(this.c, lf4Var.c);
    }

    public final int hashCode() {
        return Integer.hashCode(this.c.a) + xrf.k(this.b.a, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "DateTime(day=" + this.a + ", hour=" + this.b + ", minutes=" + this.c + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.a.writeToParcel(parcel, i);
        this.b.writeToParcel(parcel, i);
        this.c.writeToParcel(parcel, i);
    }
}
