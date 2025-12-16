package defpackage;

import android.os.Bundle;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public final class lfg {
    public static final String f;
    public static final String g;
    public final int a;
    public final String b;
    public final int c;
    public final hf6[] d;
    public int e;

    static {
        String str = zxg.a;
        f = Integer.toString(0, 36);
        g = Integer.toString(1, 36);
    }

    public lfg(String str, hf6... hf6VarArr) {
        hsi.b(hf6VarArr.length > 0);
        this.b = str;
        this.d = hf6VarArr;
        this.a = hf6VarArr.length;
        int iH = xz9.h(hf6VarArr[0].n);
        this.c = iH == -1 ? xz9.h(hf6VarArr[0].m) : iH;
        String str2 = hf6VarArr[0].d;
        str2 = (str2 == null || str2.equals("und")) ? "" : str2;
        int i = hf6VarArr[0].f | 16384;
        for (int i2 = 1; i2 < hf6VarArr.length; i2++) {
            String str3 = hf6VarArr[i2].d;
            if (!str2.equals((str3 == null || str3.equals("und")) ? "" : str3)) {
                c("languages", i2, hf6VarArr[0].d, hf6VarArr[i2].d);
                return;
            } else {
                if (i != (hf6VarArr[i2].f | 16384)) {
                    c("role flags", i2, Integer.toBinaryString(hf6VarArr[0].f), Integer.toBinaryString(hf6VarArr[i2].f));
                    return;
                }
            }
        }
    }

    public static lfg a(Bundle bundle) {
        zjd zjdVarV;
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(f);
        if (parcelableArrayList == null) {
            t76 t76Var = wg7.b;
            zjdVarV = zjd.o;
        } else {
            zjdVarV = gw0.v(new o9g(2), parcelableArrayList);
        }
        return new lfg(bundle.getString(g, ""), (hf6[]) zjdVarV.toArray(new hf6[0]));
    }

    public static void c(String str, int i, String str2, String str3) {
        StringBuilder sbL = wy1.l("Different ", str, " combined in one TrackGroup: '", str2, "' (track 0) and '");
        sbL.append(str3);
        sbL.append("' (track ");
        sbL.append(i);
        sbL.append(")");
        a8i.h("TrackGroup", "", new IllegalStateException(sbL.toString()));
    }

    public final int b(hf6 hf6Var) {
        int i = 0;
        while (true) {
            hf6[] hf6VarArr = this.d;
            if (i >= hf6VarArr.length) {
                return -1;
            }
            if (hf6Var == hf6VarArr[i]) {
                return i;
            }
            i++;
        }
    }

    public final Bundle d() {
        Bundle bundle = new Bundle();
        hf6[] hf6VarArr = this.d;
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>(hf6VarArr.length);
        for (hf6 hf6Var : hf6VarArr) {
            List list = hf6Var.q;
            Bundle bundle2 = new Bundle();
            bundle2.putString(hf6.R, hf6Var.a);
            bundle2.putString(hf6.S, hf6Var.b);
            String str = hf6.w0;
            wg7<r08> wg7Var = hf6Var.c;
            ArrayList<? extends Parcelable> arrayList2 = new ArrayList<>(wg7Var.size());
            for (r08 r08Var : wg7Var) {
                r08Var.getClass();
                Bundle bundle3 = new Bundle();
                String str2 = r08Var.a;
                if (str2 != null) {
                    bundle3.putString(r08.c, str2);
                }
                bundle3.putString(r08.d, r08Var.b);
                arrayList2.add(bundle3);
            }
            bundle2.putParcelableArrayList(str, arrayList2);
            bundle2.putString(hf6.T, hf6Var.d);
            bundle2.putInt(hf6.U, hf6Var.e);
            bundle2.putInt(hf6.V, hf6Var.f);
            int i = hf6Var.g;
            if (i != hf6.Q.g) {
                bundle2.putInt(hf6.x0, i);
            }
            bundle2.putInt(hf6.W, hf6Var.h);
            bundle2.putInt(hf6.X, hf6Var.i);
            bundle2.putString(hf6.Y, hf6Var.k);
            bundle2.putString(hf6.Z, hf6Var.m);
            bundle2.putString(hf6.a0, hf6Var.n);
            bundle2.putInt(hf6.b0, hf6Var.o);
            for (int i2 = 0; i2 < list.size(); i2++) {
                bundle2.putByteArray(hf6.c0 + "_" + Integer.toString(i2, 36), (byte[]) list.get(i2));
            }
            bundle2.putParcelable(hf6.d0, hf6Var.r);
            bundle2.putLong(hf6.e0, hf6Var.s);
            bundle2.putInt(hf6.f0, hf6Var.u);
            bundle2.putInt(hf6.g0, hf6Var.v);
            bundle2.putInt(hf6.z0, hf6Var.w);
            bundle2.putInt(hf6.A0, hf6Var.x);
            bundle2.putFloat(hf6.h0, hf6Var.y);
            bundle2.putInt(hf6.i0, hf6Var.z);
            bundle2.putFloat(hf6.j0, hf6Var.A);
            bundle2.putByteArray(hf6.k0, hf6Var.B);
            bundle2.putInt(hf6.l0, hf6Var.C);
            gf3 gf3Var = hf6Var.D;
            if (gf3Var != null) {
                String str3 = hf6.m0;
                Bundle bundle4 = new Bundle();
                bundle4.putInt(gf3.j, gf3Var.a);
                bundle4.putInt(gf3.k, gf3Var.b);
                bundle4.putInt(gf3.l, gf3Var.c);
                bundle4.putByteArray(gf3.m, gf3Var.d);
                bundle4.putInt(gf3.n, gf3Var.e);
                bundle4.putInt(gf3.o, gf3Var.f);
                bundle2.putBundle(str3, bundle4);
            }
            bundle2.putInt(hf6.y0, hf6Var.E);
            bundle2.putInt(hf6.n0, hf6Var.F);
            bundle2.putInt(hf6.o0, hf6Var.G);
            bundle2.putInt(hf6.p0, hf6Var.H);
            bundle2.putInt(hf6.q0, hf6Var.I);
            bundle2.putInt(hf6.r0, hf6Var.J);
            bundle2.putInt(hf6.s0, hf6Var.K);
            bundle2.putInt(hf6.u0, hf6Var.M);
            bundle2.putInt(hf6.v0, hf6Var.N);
            bundle2.putInt(hf6.t0, hf6Var.O);
            arrayList.add(bundle2);
        }
        bundle.putParcelableArrayList(f, arrayList);
        bundle.putString(g, this.b);
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && lfg.class == obj.getClass()) {
            lfg lfgVar = (lfg) obj;
            if (this.b.equals(lfgVar.b) && Arrays.equals(this.d, lfgVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.e == 0) {
            this.e = Arrays.hashCode(this.d) + u45.e(527, 31, this.b);
        }
        return this.e;
    }

    public final String toString() {
        return this.b + ": " + Arrays.toString(this.d);
    }
}
