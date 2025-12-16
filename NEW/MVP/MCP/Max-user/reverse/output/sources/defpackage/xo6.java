package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class xo6 implements Parcelable {
    public static final Parcelable.Creator<xo6> CREATOR = new wf4(19);
    public static final xo6 u0 = new xo6(true, true, true, false, hd5.a, false, false, false);
    public final boolean X;
    public final boolean Y;
    public final boolean Z;
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final List o;
    public final boolean s0;
    public final boolean t0;

    public xo6(boolean z, boolean z2, boolean z3, boolean z4, List list, boolean z5, boolean z6, boolean z7) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.o = list;
        this.X = z5;
        this.Y = z6;
        this.Z = z7;
        this.s0 = !z2;
        this.t0 = !z7;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xo6)) {
            return false;
        }
        xo6 xo6Var = (xo6) obj;
        return this.a == xo6Var.a && this.b == xo6Var.b && this.c == xo6Var.c && this.d == xo6Var.d && fni.a(this.o, xo6Var.o) && this.X == xo6Var.X && this.Y == xo6Var.Y && this.Z == xo6Var.Z;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.Z) + a9h.b(a9h.b(xrf.l(this.o, a9h.b(a9h.b(a9h.b(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31), 31, this.X), 31, this.Y);
    }

    public final String toString() {
        StringBuilder sbP = ho7.p("GalleryMode(needCameraView=", this.a, ", useVideos=", this.b, ", multiSelectionEnabled=");
        az1.t(", isMessageEdit=", ", selectedItems=", sbP, this.c, this.d);
        sbP.append(this.o);
        sbP.append(", profileCreation=");
        sbP.append(this.X);
        sbP.append(", useTopInset=");
        sbP.append(this.Y);
        sbP.append(", fromQrScanner=");
        sbP.append(this.Z);
        sbP.append(")");
        return sbP.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a ? 1 : 0);
        parcel.writeInt(this.b ? 1 : 0);
        parcel.writeInt(this.c ? 1 : 0);
        parcel.writeInt(this.d ? 1 : 0);
        List list = this.o;
        parcel.writeInt(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            parcel.writeParcelable((Parcelable) it.next(), i);
        }
        parcel.writeInt(this.X ? 1 : 0);
        parcel.writeInt(this.Y ? 1 : 0);
        parcel.writeInt(this.Z ? 1 : 0);
    }
}
