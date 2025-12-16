package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.fragment.app.a;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class ve0 implements Parcelable {
    public static final Parcelable.Creator<ve0> CREATOR = new e8(5);
    public final String X;
    public final int Y;
    public final int Z;
    public final int[] a;
    public final ArrayList b;
    public final int[] c;
    public final int[] d;
    public final int o;
    public final CharSequence s0;
    public final int t0;
    public final CharSequence u0;
    public final ArrayList v0;
    public final ArrayList w0;
    public final boolean x0;

    public ve0(ue0 ue0Var) {
        int size = ue0Var.a.size();
        this.a = new int[size * 6];
        if (!ue0Var.g) {
            throw new IllegalStateException("Not on back stack");
        }
        this.b = new ArrayList(size);
        this.c = new int[size];
        this.d = new int[size];
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            aj6 aj6Var = (aj6) ue0Var.a.get(i2);
            int i3 = i + 1;
            this.a[i] = aj6Var.a;
            ArrayList arrayList = this.b;
            a aVar = aj6Var.b;
            arrayList.add(aVar != null ? aVar.o : null);
            int[] iArr = this.a;
            iArr[i3] = aj6Var.c ? 1 : 0;
            iArr[i + 2] = aj6Var.d;
            iArr[i + 3] = aj6Var.e;
            int i4 = i + 5;
            iArr[i + 4] = aj6Var.f;
            i += 6;
            iArr[i4] = aj6Var.g;
            this.c[i2] = aj6Var.h.ordinal();
            this.d[i2] = aj6Var.i.ordinal();
        }
        this.o = ue0Var.f;
        this.X = ue0Var.h;
        this.Y = ue0Var.s;
        this.Z = ue0Var.i;
        this.s0 = ue0Var.j;
        this.t0 = ue0Var.k;
        this.u0 = ue0Var.l;
        this.v0 = ue0Var.m;
        this.w0 = ue0Var.n;
        this.x0 = ue0Var.o;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeIntArray(this.a);
        parcel.writeStringList(this.b);
        parcel.writeIntArray(this.c);
        parcel.writeIntArray(this.d);
        parcel.writeInt(this.o);
        parcel.writeString(this.X);
        parcel.writeInt(this.Y);
        parcel.writeInt(this.Z);
        TextUtils.writeToParcel(this.s0, parcel, 0);
        parcel.writeInt(this.t0);
        TextUtils.writeToParcel(this.u0, parcel, 0);
        parcel.writeStringList(this.v0);
        parcel.writeStringList(this.w0);
        parcel.writeInt(this.x0 ? 1 : 0);
    }

    public ve0(Parcel parcel) {
        this.a = parcel.createIntArray();
        this.b = parcel.createStringArrayList();
        this.c = parcel.createIntArray();
        this.d = parcel.createIntArray();
        this.o = parcel.readInt();
        this.X = parcel.readString();
        this.Y = parcel.readInt();
        this.Z = parcel.readInt();
        Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
        this.s0 = (CharSequence) creator.createFromParcel(parcel);
        this.t0 = parcel.readInt();
        this.u0 = (CharSequence) creator.createFromParcel(parcel);
        this.v0 = parcel.createStringArrayList();
        this.w0 = parcel.createStringArrayList();
        this.x0 = parcel.readInt() != 0;
    }
}
