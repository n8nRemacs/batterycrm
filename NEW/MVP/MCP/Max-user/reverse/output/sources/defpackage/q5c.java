package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Pair;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class q5c extends l4 {
    public static final Parcelable.Creator<q5c> CREATOR = new k3j(3);
    public final boolean X;
    public final boolean Y;
    public final x42 Z;
    public final List a;
    public float b;
    public int c;
    public final float d;
    public final boolean o;
    public final x42 s0;
    public int t0;
    public final List u0;
    public final List v0;

    public q5c() {
        this.b = 10.0f;
        this.c = -16777216;
        this.d = 0.0f;
        this.o = true;
        this.X = false;
        this.Y = false;
        this.Z = new uw0();
        this.s0 = new uw0();
        this.t0 = 0;
        this.u0 = null;
        this.v0 = new ArrayList();
        this.a = new ArrayList();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iK = a9j.k(parcel, 20293);
        a9j.j(parcel, this.a, 2);
        float f = this.b;
        a9j.m(parcel, 3, 4);
        parcel.writeFloat(f);
        int i2 = this.c;
        a9j.m(parcel, 4, 4);
        parcel.writeInt(i2);
        a9j.m(parcel, 5, 4);
        parcel.writeFloat(this.d);
        a9j.m(parcel, 6, 4);
        parcel.writeInt(this.o ? 1 : 0);
        a9j.m(parcel, 7, 4);
        parcel.writeInt(this.X ? 1 : 0);
        a9j.m(parcel, 8, 4);
        parcel.writeInt(this.Y ? 1 : 0);
        a9j.f(parcel, 9, this.Z.b(), i);
        a9j.f(parcel, 10, this.s0.b(), i);
        int i3 = this.t0;
        a9j.m(parcel, 11, 4);
        parcel.writeInt(i3);
        a9j.j(parcel, this.u0, 12);
        List<pnf> list = this.v0;
        ArrayList arrayList = new ArrayList(list.size());
        for (pnf pnfVar : list) {
            mnf mnfVar = pnfVar.a;
            float f2 = mnfVar.a;
            Pair pair = new Pair(Integer.valueOf(mnfVar.b), Integer.valueOf(mnfVar.c));
            arrayList.add(new pnf(new mnf(this.b, ((Integer) pair.first).intValue(), ((Integer) pair.second).intValue(), this.o, mnfVar.o), pnfVar.b));
        }
        a9j.j(parcel, arrayList, 13);
        a9j.l(parcel, iK);
    }

    public q5c(ArrayList arrayList, float f, int i, float f2, boolean z, boolean z2, boolean z3, x42 x42Var, x42 x42Var2, int i2, ArrayList arrayList2, ArrayList arrayList3) {
        this.b = 10.0f;
        this.c = -16777216;
        this.d = 0.0f;
        this.o = true;
        this.X = false;
        this.Y = false;
        this.Z = new uw0();
        this.s0 = new uw0();
        this.t0 = 0;
        this.u0 = null;
        this.v0 = new ArrayList();
        this.a = arrayList;
        this.b = f;
        this.c = i;
        this.d = f2;
        this.o = z;
        this.X = z2;
        this.Y = z3;
        if (x42Var != null) {
            this.Z = x42Var;
        }
        if (x42Var2 != null) {
            this.s0 = x42Var2;
        }
        this.t0 = i2;
        this.u0 = arrayList2;
        if (arrayList3 != null) {
            this.v0 = arrayList3;
        }
    }
}
