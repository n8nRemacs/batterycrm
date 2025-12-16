package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class bvb implements Parcelable {
    public static final Parcelable.Creator<bvb> CREATOR = new wcb(9);
    public final boolean X;
    public final boolean Y;
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean o;

    public bvb(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.o = z5;
        this.X = z6;
        this.Y = z7;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bvb)) {
            return false;
        }
        bvb bvbVar = (bvb) obj;
        return this.a == bvbVar.a && this.b == bvbVar.b && this.c == bvbVar.c && this.d == bvbVar.d && this.o == bvbVar.o && this.X == bvbVar.X && this.Y == bvbVar.Y;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.Y) + a9h.b(a9h.b(a9h.b(a9h.b(a9h.b(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.o), 31, this.X);
    }

    public final String toString() {
        StringBuilder sbP = ho7.p("PhotoEditorViewState(redoVisible=", this.a, ", undoVisible=", this.b, ", clearVisible=");
        az1.t(", drawStickerVisible=", ", drawStickerEnabled=", sbP, this.c, this.d);
        az1.t(", doneEnabled=", ", isRegularSending=", sbP, this.o, this.X);
        return az1.k(sbP, this.Y, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a ? 1 : 0);
        parcel.writeInt(this.b ? 1 : 0);
        parcel.writeInt(this.c ? 1 : 0);
        parcel.writeInt(this.d ? 1 : 0);
        parcel.writeInt(this.o ? 1 : 0);
        parcel.writeInt(this.X ? 1 : 0);
        parcel.writeInt(this.Y ? 1 : 0);
    }
}
