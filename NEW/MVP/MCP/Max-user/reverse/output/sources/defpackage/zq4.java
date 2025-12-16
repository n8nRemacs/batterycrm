package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.RandomAccess;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class zq4 extends no8 {
    public static final ijb f = ijb.a(new o00(15));
    public static final ijb g = ijb.a(new o00(17));
    public final u1j d;
    public final AtomicReference e;

    public zq4(Context context, u1j u1jVar) {
        int i = mq4.Y0;
        mq4 mq4Var = new mq4(new oq4(context));
        this.d = u1jVar;
        this.e = new AtomicReference(mq4Var);
    }

    public static int b(gf6 gf6Var, String str, boolean z) {
        if (!TextUtils.isEmpty(str) && str.equals(gf6Var.c)) {
            return 4;
        }
        String strE = e(str);
        String strE2 = e(gf6Var.c);
        if (strE2 == null || strE == null) {
            return (z && strE2 == null) ? 1 : 0;
        }
        if (strE2.startsWith(strE) || strE.startsWith(strE2)) {
            return 3;
        }
        int i = xxg.a;
        return strE2.split("-", 2)[0].equals(strE.split("-", 2)[0]) ? 2 : 0;
    }

    public static boolean c(int i, boolean z) {
        int i2 = i & 7;
        if (i2 != 4) {
            return z && i2 == 3;
        }
        return true;
    }

    public static void d(SparseArray sparseArray, yfg yfgVar, int i) {
        if (yfgVar == null) {
            return;
        }
        int iG = wz9.g(yfgVar.a.c[0].v0);
        Pair pair = (Pair) sparseArray.get(iG);
        if (pair == null || ((yfg) pair.first).b.isEmpty()) {
            sparseArray.put(iG, Pair.create(yfgVar, Integer.valueOf(i)));
        }
    }

    public static String e(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, "und")) {
            return null;
        }
        return str;
    }

    public static Pair f(int i, lo8 lo8Var, int[][][] iArr, tq4 tq4Var, Comparator comparator) {
        int i2;
        RandomAccess randomAccessM;
        lo8 lo8Var2 = lo8Var;
        ArrayList arrayList = new ArrayList();
        int i3 = lo8Var2.a;
        int i4 = 0;
        while (i4 < i3) {
            if (i == lo8Var2.b[i4]) {
                mfg mfgVar = lo8Var2.c[i4];
                for (int i5 = 0; i5 < mfgVar.a; i5++) {
                    kfg kfgVarA = mfgVar.a(i5);
                    zjd zjdVarE = tq4Var.e(i4, kfgVarA, iArr[i4][i5]);
                    int i6 = kfgVarA.a;
                    boolean[] zArr = new boolean[i6];
                    int i7 = 0;
                    while (i7 < i6) {
                        vq4 vq4Var = (vq4) zjdVarE.get(i7);
                        int iA = vq4Var.a();
                        if (zArr[i7] || iA == 0) {
                            i2 = i3;
                        } else {
                            if (iA == 1) {
                                randomAccessM = wg7.m(vq4Var);
                            } else {
                                ArrayList arrayList2 = new ArrayList();
                                arrayList2.add(vq4Var);
                                int i8 = i7 + 1;
                                while (i8 < i6) {
                                    vq4 vq4Var2 = (vq4) zjdVarE.get(i8);
                                    int i9 = i3;
                                    if (vq4Var2.a() == 2 && vq4Var.c(vq4Var2)) {
                                        arrayList2.add(vq4Var2);
                                        zArr[i8] = true;
                                    }
                                    i8++;
                                    i3 = i9;
                                }
                                randomAccessM = arrayList2;
                            }
                            i2 = i3;
                            arrayList.add(randomAccessM);
                        }
                        i7++;
                        i3 = i2;
                    }
                }
            }
            i4++;
            lo8Var2 = lo8Var;
            i3 = i3;
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        List list = (List) Collections.max(arrayList, comparator);
        int[] iArr2 = new int[list.size()];
        for (int i10 = 0; i10 < list.size(); i10++) {
            iArr2[i10] = ((vq4) list.get(i10)).c;
        }
        vq4 vq4Var3 = (vq4) list.get(0);
        return Pair.create(new ym5(0, vq4Var3.b, iArr2), Integer.valueOf(vq4Var3.a));
    }

    public final oq4 a() {
        mq4 mq4Var = (mq4) this.e.get();
        mq4Var.getClass();
        return new oq4(mq4Var);
    }

    public final void g(oq4 oq4Var) {
        rm5 rm5Var;
        mq4 mq4Var = new mq4(oq4Var);
        if (((mq4) this.e.getAndSet(mq4Var)).equals(mq4Var) || (rm5Var = this.a) == null) {
            return;
        }
        rm5Var.Z.c(10);
    }
}
