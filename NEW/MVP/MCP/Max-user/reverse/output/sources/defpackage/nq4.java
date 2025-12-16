package defpackage;

import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import java.util.ArrayList;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes.dex */
public final class nq4 extends egg {
    public static final String A0;
    public static final String B0;
    public static final String C0;
    public static final String D0;
    public static final String E0;
    public static final String F0;
    public static final String G0;
    public static final String H0;
    public static final String I0;
    public static final String J0;
    public static final String K0;
    public static final String L0;
    public static final String M0;
    public static final String N0;
    public static final String O0;
    public static final String P0;
    public static final String Q0;
    public static final nq4 x0 = new nq4(new lq4());
    public static final String y0;
    public static final String z0;
    public final boolean o0;
    public final boolean p0;
    public final boolean q0;
    public final boolean r0;
    public final boolean s0;
    public final boolean t0;
    public final boolean u0;
    public final SparseArray v0;
    public final SparseBooleanArray w0;

    static {
        String str = zxg.a;
        y0 = Integer.toString(1000, 36);
        z0 = Integer.toString(1001, 36);
        A0 = Integer.toString(1002, 36);
        B0 = Integer.toString(1003, 36);
        C0 = Integer.toString(1004, 36);
        D0 = Integer.toString(1005, 36);
        E0 = Integer.toString(1006, 36);
        F0 = Integer.toString(1007, 36);
        G0 = Integer.toString(1008, 36);
        H0 = Integer.toString(1009, 36);
        I0 = Integer.toString(1010, 36);
        J0 = Integer.toString(1011, 36);
        K0 = Integer.toString(1012, 36);
        L0 = Integer.toString(1013, 36);
        M0 = Integer.toString(1014, 36);
        N0 = Integer.toString(1015, 36);
        O0 = Integer.toString(1016, 36);
        P0 = Integer.toString(1017, 36);
        Q0 = Integer.toString(1018, 36);
    }

    public nq4(lq4 lq4Var) {
        super(lq4Var);
        this.o0 = lq4Var.F;
        this.p0 = lq4Var.G;
        this.q0 = lq4Var.H;
        this.r0 = lq4Var.I;
        this.s0 = lq4Var.J;
        this.t0 = lq4Var.K;
        this.u0 = lq4Var.L;
        this.v0 = lq4Var.M;
        this.w0 = lq4Var.N;
    }

    @Override // defpackage.egg
    public final cgg a() {
        return new lq4(this);
    }

    @Override // defpackage.egg
    public final Bundle c() {
        Bundle bundleC = super.c();
        bundleC.putBoolean(y0, this.o0);
        bundleC.putBoolean(z0, false);
        bundleC.putBoolean(A0, this.p0);
        bundleC.putBoolean(M0, false);
        bundleC.putBoolean(B0, this.q0);
        bundleC.putBoolean(C0, false);
        bundleC.putBoolean(D0, false);
        bundleC.putBoolean(E0, false);
        bundleC.putBoolean(N0, false);
        bundleC.putBoolean(Q0, this.r0);
        bundleC.putBoolean(O0, this.s0);
        bundleC.putBoolean(F0, this.t0);
        bundleC.putBoolean(G0, false);
        bundleC.putBoolean(H0, this.u0);
        bundleC.putBoolean(P0, false);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        SparseArray sparseArray = new SparseArray();
        int i = 0;
        while (true) {
            SparseArray sparseArray2 = this.v0;
            if (i >= sparseArray2.size()) {
                SparseBooleanArray sparseBooleanArray = this.w0;
                int[] iArr = new int[sparseBooleanArray.size()];
                for (int i2 = 0; i2 < sparseBooleanArray.size(); i2++) {
                    iArr[i2] = sparseBooleanArray.keyAt(i2);
                }
                bundleC.putIntArray(L0, iArr);
                return bundleC;
            }
            int iKeyAt = sparseArray2.keyAt(i);
            for (Map.Entry entry : ((Map) sparseArray2.valueAt(i)).entrySet()) {
                if (entry.getValue() != null) {
                    throw new ClassCastException();
                }
                arrayList2.add((nfg) entry.getKey());
                arrayList.add(Integer.valueOf(iKeyAt));
            }
            bundleC.putIntArray(I0, jni.i(arrayList));
            bundleC.putParcelableArrayList(J0, gw0.D(arrayList2, new dm4(7)));
            SparseArray<? extends Parcelable> sparseArray3 = new SparseArray<>(sparseArray.size());
            if (sparseArray.size() > 0) {
                sparseArray.keyAt(0);
                u45.r(sparseArray.valueAt(0));
                throw null;
            }
            bundleC.putSparseParcelableArray(K0, sparseArray3);
            i++;
        }
    }

    @Override // defpackage.egg
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && nq4.class == obj.getClass()) {
            nq4 nq4Var = (nq4) obj;
            if (super.equals(nq4Var) && this.o0 == nq4Var.o0 && this.p0 == nq4Var.p0 && this.q0 == nq4Var.q0 && this.r0 == nq4Var.r0 && this.s0 == nq4Var.s0 && this.t0 == nq4Var.t0 && this.u0 == nq4Var.u0) {
                SparseBooleanArray sparseBooleanArray = nq4Var.w0;
                SparseBooleanArray sparseBooleanArray2 = this.w0;
                int size = sparseBooleanArray2.size();
                if (sparseBooleanArray.size() == size) {
                    int i = 0;
                    while (true) {
                        if (i >= size) {
                            SparseArray sparseArray = nq4Var.v0;
                            SparseArray sparseArray2 = this.v0;
                            int size2 = sparseArray2.size();
                            if (sparseArray.size() == size2) {
                                for (int i2 = 0; i2 < size2; i2++) {
                                    int iIndexOfKey = sparseArray.indexOfKey(sparseArray2.keyAt(i2));
                                    if (iIndexOfKey >= 0) {
                                        Map map = (Map) sparseArray2.valueAt(i2);
                                        Map map2 = (Map) sparseArray.valueAt(iIndexOfKey);
                                        if (map2.size() == map.size()) {
                                            for (Map.Entry entry : map.entrySet()) {
                                                nfg nfgVar = (nfg) entry.getKey();
                                                if (!map2.containsKey(nfgVar) || !Objects.equals(entry.getValue(), map2.get(nfgVar))) {
                                                }
                                            }
                                        }
                                    }
                                }
                                return true;
                            }
                        } else {
                            if (sparseBooleanArray.indexOfKey(sparseBooleanArray2.keyAt(i)) < 0) {
                                break;
                            }
                            i++;
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // defpackage.egg
    public final int hashCode() {
        return (((((((((((((((super.hashCode() + 31) * 31) + (this.o0 ? 1 : 0)) * 961) + (this.p0 ? 1 : 0)) * 961) + (this.q0 ? 1 : 0)) * 28629151) + (this.r0 ? 1 : 0)) * 31) + (this.s0 ? 1 : 0)) * 31) + (this.t0 ? 1 : 0)) * 961) + (this.u0 ? 1 : 0)) * 31;
    }
}
