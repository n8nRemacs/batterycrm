package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Objects;

/* loaded from: classes.dex */
public final class mz0 implements Parcelable {
    public static final Parcelable.Creator<mz0> CREATOR = new e8(10);
    public final int X;
    public final int Y;
    public final g2a a;
    public final g2a b;
    public final uf4 c;
    public final g2a d;
    public final int o;

    public mz0(g2a g2aVar, g2a g2aVar2, uf4 uf4Var, g2a g2aVar3, int i) {
        Objects.requireNonNull(g2aVar, "start cannot be null");
        Objects.requireNonNull(g2aVar2, "end cannot be null");
        Objects.requireNonNull(uf4Var, "validator cannot be null");
        this.a = g2aVar;
        this.b = g2aVar2;
        this.d = g2aVar3;
        this.o = i;
        this.c = uf4Var;
        if (g2aVar3 != null && g2aVar.a.compareTo(g2aVar3.a) > 0) {
            throw new IllegalArgumentException("start Month cannot be after current Month");
        }
        if (g2aVar3 != null && g2aVar3.a.compareTo(g2aVar2.a) > 0) {
            throw new IllegalArgumentException("current Month cannot be after end Month");
        }
        if (i < 0 || i > vxg.c(null).getMaximum(7)) {
            throw new IllegalArgumentException("firstDayOfWeek is not valid");
        }
        this.Y = g2aVar.e(g2aVar2) + 1;
        this.X = (g2aVar2.c - g2aVar.c) + 1;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mz0)) {
            return false;
        }
        mz0 mz0Var = (mz0) obj;
        return this.a.equals(mz0Var.a) && this.b.equals(mz0Var.b) && Objects.equals(this.d, mz0Var.d) && this.o == mz0Var.o && this.c.equals(mz0Var.c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.d, Integer.valueOf(this.o), this.c});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, 0);
        parcel.writeParcelable(this.b, 0);
        parcel.writeParcelable(this.d, 0);
        parcel.writeParcelable(this.c, 0);
        parcel.writeInt(this.o);
    }
}
