package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class edi extends l4 {
    public static final Parcelable.Creator<edi> CREATOR = new wci(7);
    public int a;
    public boolean b;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof edi)) {
            return false;
        }
        edi ediVar = (edi) obj;
        return this.a == ediVar.a && syi.c(Boolean.valueOf(this.b), Boolean.valueOf(ediVar.b));
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), Boolean.valueOf(this.b)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iK = a9j.k(parcel, 20293);
        int i2 = this.a;
        a9j.m(parcel, 2, 4);
        parcel.writeInt(i2);
        boolean z = this.b;
        a9j.m(parcel, 3, 4);
        parcel.writeInt(z ? 1 : 0);
        a9j.l(parcel, iK);
    }
}
