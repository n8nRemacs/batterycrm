package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/* loaded from: classes.dex */
public class egg {
    public static final egg F = new egg(new cgg());
    public static final String G;
    public static final String H;
    public static final String I;
    public static final String J;
    public static final String K;
    public static final String L;
    public static final String M;
    public static final String N;
    public static final String O;
    public static final String P;
    public static final String Q;
    public static final String R;
    public static final String S;
    public static final String T;
    public static final String U;
    public static final String V;
    public static final String W;
    public static final String X;
    public static final String Y;
    public static final String Z;
    public static final String a0;
    public static final String b0;
    public static final String c0;
    public static final String d0;
    public static final String e0;
    public static final String f0;
    public static final String g0;
    public static final String h0;
    public static final String i0;
    public static final String j0;
    public static final String k0;
    public static final String l0;
    public static final String m0;
    public static final String n0;
    public final boolean A;
    public final boolean B;
    public final boolean C;
    public final ah7 D;
    public final hh7 E;
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;
    public final boolean k;
    public final boolean l;
    public final wg7 m;
    public final wg7 n;
    public final int o;
    public final wg7 p;
    public final int q;
    public final int r;
    public final int s;
    public final wg7 t;
    public final agg u;
    public final wg7 v;
    public final int w;
    public final boolean x;
    public final int y;
    public final boolean z;

    static {
        String str = zxg.a;
        G = Integer.toString(1, 36);
        H = Integer.toString(2, 36);
        I = Integer.toString(3, 36);
        J = Integer.toString(4, 36);
        K = Integer.toString(5, 36);
        L = Integer.toString(6, 36);
        M = Integer.toString(7, 36);
        N = Integer.toString(8, 36);
        O = Integer.toString(9, 36);
        P = Integer.toString(10, 36);
        Q = Integer.toString(11, 36);
        R = Integer.toString(12, 36);
        S = Integer.toString(13, 36);
        T = Integer.toString(14, 36);
        U = Integer.toString(15, 36);
        V = Integer.toString(16, 36);
        W = Integer.toString(17, 36);
        X = Integer.toString(18, 36);
        Y = Integer.toString(19, 36);
        Z = Integer.toString(20, 36);
        a0 = Integer.toString(21, 36);
        b0 = Integer.toString(22, 36);
        c0 = Integer.toString(23, 36);
        d0 = Integer.toString(24, 36);
        e0 = Integer.toString(25, 36);
        f0 = Integer.toString(26, 36);
        g0 = Integer.toString(27, 36);
        h0 = Integer.toString(28, 36);
        i0 = Integer.toString(29, 36);
        j0 = Integer.toString(30, 36);
        k0 = Integer.toString(31, 36);
        l0 = Integer.toString(32, 36);
        m0 = Integer.toString(33, 36);
        n0 = Integer.toString(34, 36);
    }

    public egg(cgg cggVar) {
        this.a = cggVar.a;
        this.b = cggVar.b;
        this.c = cggVar.c;
        this.d = cggVar.d;
        this.e = cggVar.e;
        this.f = cggVar.f;
        this.g = cggVar.g;
        this.h = cggVar.h;
        this.i = cggVar.i;
        this.j = cggVar.j;
        this.k = cggVar.k;
        this.l = cggVar.l;
        this.m = cggVar.m;
        this.n = cggVar.n;
        this.o = cggVar.o;
        this.p = cggVar.p;
        this.q = cggVar.q;
        this.r = cggVar.r;
        this.s = cggVar.s;
        this.t = cggVar.t;
        this.u = cggVar.u;
        this.v = cggVar.v;
        this.w = cggVar.w;
        this.x = cggVar.x;
        this.y = cggVar.y;
        this.z = cggVar.z;
        this.A = cggVar.A;
        this.B = cggVar.B;
        this.C = cggVar.C;
        this.D = ah7.a(cggVar.D);
        this.E = hh7.j(cggVar.E);
    }

    public static egg b(Bundle bundle) {
        agg aggVar;
        zjd zjdVarI;
        cgg cggVar = new cgg();
        egg eggVar = F;
        cggVar.a = bundle.getInt(L, eggVar.a);
        cggVar.b = bundle.getInt(M, eggVar.b);
        cggVar.c = bundle.getInt(N, eggVar.c);
        cggVar.d = bundle.getInt(O, eggVar.d);
        cggVar.e = bundle.getInt(P, eggVar.e);
        cggVar.f = bundle.getInt(Q, eggVar.f);
        cggVar.g = bundle.getInt(R, eggVar.g);
        cggVar.h = bundle.getInt(S, eggVar.h);
        cggVar.i = bundle.getInt(T, eggVar.i);
        int i = bundle.getInt(U, eggVar.j);
        cggVar.j = i;
        cggVar.k = cggVar.i == Integer.MAX_VALUE && i == Integer.MAX_VALUE && bundle.getBoolean(m0, eggVar.k);
        cggVar.l = bundle.getBoolean(V, eggVar.l);
        String[] stringArray = bundle.getStringArray(W);
        String[] strArr = new String[0];
        if (stringArray == null) {
            stringArray = strArr;
        }
        cggVar.m = wg7.k(stringArray);
        String[] stringArray2 = bundle.getStringArray(l0);
        String[] strArr2 = new String[0];
        if (stringArray2 == null) {
            stringArray2 = strArr2;
        }
        cggVar.n = wg7.k(stringArray2);
        cggVar.o = bundle.getInt(e0, eggVar.o);
        String[] stringArray3 = bundle.getStringArray(G);
        String[] strArr3 = new String[0];
        if (stringArray3 == null) {
            stringArray3 = strArr3;
        }
        cggVar.p = cgg.e(stringArray3);
        cggVar.q = bundle.getInt(H, eggVar.q);
        cggVar.r = bundle.getInt(X, eggVar.r);
        cggVar.s = bundle.getInt(Y, eggVar.s);
        String[] stringArray4 = bundle.getStringArray(Z);
        String[] strArr4 = new String[0];
        if (stringArray4 == null) {
            stringArray4 = strArr4;
        }
        cggVar.t = wg7.k(stringArray4);
        Bundle bundle2 = bundle.getBundle(j0);
        if (bundle2 != null) {
            saa saaVar = new saa();
            String str = agg.e;
            agg aggVar2 = agg.d;
            saaVar.a = bundle2.getInt(str, aggVar2.a);
            saaVar.b = bundle2.getBoolean(agg.f, aggVar2.b);
            saaVar.c = bundle2.getBoolean(agg.g, aggVar2.c);
            aggVar = new agg(saaVar);
        } else {
            saa saaVar2 = new saa();
            agg aggVar3 = agg.d;
            saaVar2.a = bundle.getInt(g0, aggVar3.a);
            saaVar2.b = bundle.getBoolean(h0, aggVar3.b);
            saaVar2.c = bundle.getBoolean(i0, aggVar3.c);
            aggVar = new agg(saaVar2);
        }
        cggVar.u = aggVar;
        String[] stringArray5 = bundle.getStringArray(I);
        String[] strArr5 = new String[0];
        if (stringArray5 == null) {
            stringArray5 = strArr5;
        }
        cggVar.v = cgg.e(stringArray5);
        cggVar.w = bundle.getInt(J, eggVar.w);
        cggVar.x = cggVar.v.isEmpty() && cggVar.w == 0 && bundle.getBoolean(n0, eggVar.x);
        cggVar.y = bundle.getInt(f0, eggVar.y);
        cggVar.z = bundle.getBoolean(K, eggVar.z);
        cggVar.A = bundle.getBoolean(k0, eggVar.A);
        cggVar.B = bundle.getBoolean(a0, eggVar.B);
        cggVar.C = bundle.getBoolean(b0, eggVar.C);
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(c0);
        if (parcelableArrayList == null) {
            zjdVarI = zjd.o;
        } else {
            tg7 tg7VarI = wg7.i();
            for (int i2 = 0; i2 < parcelableArrayList.size(); i2++) {
                Bundle bundle3 = (Bundle) parcelableArrayList.get(i2);
                bundle3.getClass();
                Bundle bundle4 = bundle3.getBundle(xfg.c);
                bundle4.getClass();
                lfg lfgVarA = lfg.a(bundle4);
                int[] intArray = bundle3.getIntArray(xfg.d);
                intArray.getClass();
                tg7VarI.a(new xfg(lfgVarA, jni.a(intArray)));
            }
            zjdVarI = tg7VarI.i();
        }
        cggVar.D = new HashMap();
        for (int i3 = 0; i3 < zjdVarI.d; i3++) {
            xfg xfgVar = (xfg) zjdVarI.get(i3);
            cggVar.D.put(xfgVar.a, xfgVar);
        }
        int[] intArray2 = bundle.getIntArray(d0);
        int[] iArr = new int[0];
        if (intArray2 == null) {
            intArray2 = iArr;
        }
        cggVar.E = new HashSet();
        for (int i4 : intArray2) {
            cggVar.E.add(Integer.valueOf(i4));
        }
        return new egg(cggVar);
    }

    public cgg a() {
        cgg cggVar = new cgg();
        cggVar.d(this);
        return cggVar;
    }

    public Bundle c() {
        Bundle bundle = new Bundle();
        bundle.putInt(L, this.a);
        bundle.putInt(M, this.b);
        bundle.putInt(N, this.c);
        bundle.putInt(O, this.d);
        bundle.putInt(P, this.e);
        bundle.putInt(Q, this.f);
        bundle.putInt(R, this.g);
        bundle.putInt(S, this.h);
        bundle.putInt(T, this.i);
        bundle.putInt(U, this.j);
        bundle.putBoolean(m0, this.k);
        bundle.putBoolean(V, this.l);
        bundle.putStringArray(W, (String[]) this.m.toArray(new String[0]));
        bundle.putStringArray(l0, (String[]) this.n.toArray(new String[0]));
        bundle.putInt(e0, this.o);
        bundle.putStringArray(G, (String[]) this.p.toArray(new String[0]));
        bundle.putInt(H, this.q);
        bundle.putInt(X, this.r);
        bundle.putInt(Y, this.s);
        bundle.putStringArray(Z, (String[]) this.t.toArray(new String[0]));
        bundle.putStringArray(I, (String[]) this.v.toArray(new String[0]));
        bundle.putInt(J, this.w);
        bundle.putBoolean(n0, this.x);
        bundle.putInt(f0, this.y);
        bundle.putBoolean(K, this.z);
        agg aggVar = this.u;
        bundle.putInt(g0, aggVar.a);
        bundle.putBoolean(h0, aggVar.b);
        bundle.putBoolean(i0, aggVar.c);
        aggVar.getClass();
        Bundle bundle2 = new Bundle();
        bundle2.putInt(agg.e, aggVar.a);
        bundle2.putBoolean(agg.f, aggVar.b);
        bundle2.putBoolean(agg.g, aggVar.c);
        bundle.putBundle(j0, bundle2);
        bundle.putBoolean(k0, this.A);
        bundle.putBoolean(a0, this.B);
        bundle.putBoolean(b0, this.C);
        bundle.putParcelableArrayList(c0, gw0.D(this.D.values(), new o9g(7)));
        bundle.putIntArray(d0, jni.i(this.E));
        return bundle;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            egg eggVar = (egg) obj;
            if (this.a == eggVar.a && this.b == eggVar.b && this.c == eggVar.c && this.d == eggVar.d && this.e == eggVar.e && this.f == eggVar.f && this.g == eggVar.g && this.h == eggVar.h && this.l == eggVar.l && this.i == eggVar.i && this.j == eggVar.j && this.k == eggVar.k && this.m.equals(eggVar.m) && this.n.equals(eggVar.n) && this.o == eggVar.o && this.p.equals(eggVar.p) && this.q == eggVar.q && this.r == eggVar.r && this.s == eggVar.s && this.t.equals(eggVar.t) && this.u.equals(eggVar.u) && this.v.equals(eggVar.v) && this.w == eggVar.w && this.x == eggVar.x && this.y == eggVar.y && this.z == eggVar.z && this.A == eggVar.A && this.B == eggVar.B && this.C == eggVar.C) {
                ah7 ah7Var = eggVar.D;
                ah7 ah7Var2 = this.D;
                ah7Var2.getClass();
                if (nsi.b(ah7Var2, ah7Var) && this.E.equals(eggVar.E)) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        return this.E.hashCode() + ((this.D.hashCode() + ((((((((((((((((this.v.hashCode() + ((this.u.hashCode() + ((this.t.hashCode() + ((((((((this.p.hashCode() + ((((this.n.hashCode() + ((this.m.hashCode() + ((((((((((((((((((((((((this.a + 31) * 31) + this.b) * 31) + this.c) * 31) + this.d) * 31) + this.e) * 31) + this.f) * 31) + this.g) * 31) + this.h) * 31) + (this.l ? 1 : 0)) * 31) + this.i) * 31) + this.j) * 31) + (this.k ? 1 : 0)) * 31)) * 31)) * 31) + this.o) * 31)) * 31) + this.q) * 31) + this.r) * 31) + this.s) * 31)) * 31)) * 31)) * 31) + this.w) * 31) + (this.x ? 1 : 0)) * 31) + this.y) * 31) + (this.z ? 1 : 0)) * 31) + (this.A ? 1 : 0)) * 31) + (this.B ? 1 : 0)) * 31) + (this.C ? 1 : 0)) * 31)) * 31);
    }
}
