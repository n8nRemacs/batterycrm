package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import ru.ok.android.onelog.impl.BuildConfig;

/* loaded from: classes.dex */
public final class z08 extends l4 {
    public static final Parcelable.Creator<z08> CREATOR = new obh(24);
    public final long a;
    public final int b;
    public final boolean c;
    public final cki d;

    public z08(long j, int i, boolean z, cki ckiVar) {
        this.a = j;
        this.b = i;
        this.c = z;
        this.d = ckiVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof z08)) {
            return false;
        }
        z08 z08Var = (z08) obj;
        return this.a == z08Var.a && this.b == z08Var.b && this.c == z08Var.c && syi.c(this.d, z08Var.d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.a), Integer.valueOf(this.b), Boolean.valueOf(this.c)});
    }

    public final String toString() {
        String str;
        StringBuilder sbM = az1.m("LastLocationRequest[");
        long j = this.a;
        if (j != BuildConfig.MAX_TIME_TO_UPLOAD) {
            sbM.append("maxAge=");
            wki.a(j, sbM);
        }
        int i = this.b;
        if (i != 0) {
            sbM.append(", ");
            if (i == 0) {
                str = "GRANULARITY_PERMISSION_LEVEL";
            } else if (i == 1) {
                str = "GRANULARITY_COARSE";
            } else {
                if (i != 2) {
                    throw new IllegalArgumentException();
                }
                str = "GRANULARITY_FINE";
            }
            sbM.append(str);
        }
        if (this.c) {
            sbM.append(", bypass");
        }
        cki ckiVar = this.d;
        if (ckiVar != null) {
            sbM.append(", impersonation=");
            sbM.append(ckiVar);
        }
        sbM.append(']');
        return sbM.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iK = a9j.k(parcel, 20293);
        a9j.m(parcel, 1, 8);
        parcel.writeLong(this.a);
        a9j.m(parcel, 2, 4);
        parcel.writeInt(this.b);
        a9j.m(parcel, 3, 4);
        parcel.writeInt(this.c ? 1 : 0);
        a9j.f(parcel, 5, this.d, i);
        a9j.l(parcel, iK);
    }
}
