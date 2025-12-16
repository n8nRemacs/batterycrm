package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.a;

/* loaded from: classes.dex */
public final class xi6 implements Parcelable {
    public static final Parcelable.Creator<xi6> CREATOR = new wf4(16);
    public final int X;
    public final String Y;
    public final boolean Z;
    public final String a;
    public final String b;
    public final boolean c;
    public final boolean d;
    public final int o;
    public final boolean s0;
    public final boolean t0;
    public final boolean u0;
    public final int v0;
    public final String w0;
    public final int x0;
    public final boolean y0;

    public xi6(a aVar) {
        this.a = aVar.getClass().getName();
        this.b = aVar.o;
        this.c = aVar.x0;
        this.d = aVar.z0;
        this.o = aVar.H0;
        this.X = aVar.I0;
        this.Y = aVar.J0;
        this.Z = aVar.M0;
        this.s0 = aVar.v0;
        this.t0 = aVar.L0;
        this.u0 = aVar.K0;
        this.v0 = aVar.Z0.ordinal();
        this.w0 = aVar.Z;
        this.x0 = aVar.s0;
        this.y0 = aVar.U0;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentState{");
        sb.append(this.a);
        sb.append(" (");
        sb.append(this.b);
        sb.append(")}:");
        if (this.c) {
            sb.append(" fromLayout");
        }
        if (this.d) {
            sb.append(" dynamicContainer");
        }
        int i = this.X;
        if (i != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(i));
        }
        String str = this.Y;
        if (str != null && !str.isEmpty()) {
            sb.append(" tag=");
            sb.append(str);
        }
        if (this.Z) {
            sb.append(" retainInstance");
        }
        if (this.s0) {
            sb.append(" removing");
        }
        if (this.t0) {
            sb.append(" detached");
        }
        if (this.u0) {
            sb.append(" hidden");
        }
        String str2 = this.w0;
        if (str2 != null) {
            sb.append(" targetWho=");
            sb.append(str2);
            sb.append(" targetRequestCode=");
            sb.append(this.x0);
        }
        if (this.y0) {
            sb.append(" userVisibleHint");
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeInt(this.c ? 1 : 0);
        parcel.writeInt(this.d ? 1 : 0);
        parcel.writeInt(this.o);
        parcel.writeInt(this.X);
        parcel.writeString(this.Y);
        parcel.writeInt(this.Z ? 1 : 0);
        parcel.writeInt(this.s0 ? 1 : 0);
        parcel.writeInt(this.t0 ? 1 : 0);
        parcel.writeInt(this.u0 ? 1 : 0);
        parcel.writeInt(this.v0);
        parcel.writeString(this.w0);
        parcel.writeInt(this.x0);
        parcel.writeInt(this.y0 ? 1 : 0);
    }

    public xi6(Parcel parcel) {
        this.a = parcel.readString();
        this.b = parcel.readString();
        this.c = parcel.readInt() != 0;
        this.d = parcel.readInt() != 0;
        this.o = parcel.readInt();
        this.X = parcel.readInt();
        this.Y = parcel.readString();
        this.Z = parcel.readInt() != 0;
        this.s0 = parcel.readInt() != 0;
        this.t0 = parcel.readInt() != 0;
        this.u0 = parcel.readInt() != 0;
        this.v0 = parcel.readInt();
        this.w0 = parcel.readString();
        this.x0 = parcel.readInt();
        this.y0 = parcel.readInt() != 0;
    }
}
