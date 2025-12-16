package com.yandex.mobile.ads.impl;

import android.util.Pair;
import com.yandex.mobile.ads.embedded.guava.collect.p;
import com.yandex.mobile.ads.impl.jd0;
import com.yandex.mobile.ads.impl.sa1;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes8.dex */
public abstract class db0 extends ca1 {

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final int f384556a;

        /* renamed from: b, reason: collision with root package name */
        private final int[] f384557b;

        /* renamed from: c, reason: collision with root package name */
        private final w91[] f384558c;

        /* renamed from: d, reason: collision with root package name */
        private final int[] f384559d;

        /* renamed from: e, reason: collision with root package name */
        private final int[][][] f384560e;

        /* renamed from: f, reason: collision with root package name */
        private final w91 f384561f;

        @j.k0
        public a(int[] iArr, w91[] w91VarArr, int[] iArr2, int[][][] iArr3, w91 w91Var) {
            this.f384557b = iArr;
            this.f384558c = w91VarArr;
            this.f384560e = iArr3;
            this.f384559d = iArr2;
            this.f384561f = w91Var;
            this.f384556a = iArr.length;
        }

        public final int a() {
            return this.f384556a;
        }

        public final w91 b(int i12) {
            return this.f384558c[i12];
        }

        public final int a(int i12) {
            return this.f384557b[i12];
        }

        public final w91 b() {
            return this.f384561f;
        }

        public final int a(int i12, int i13, int i14) {
            return this.f384560e[i12][i13][i14] & 7;
        }

        public final int a(int i12, int i13) {
            int i14 = this.f384558c[i12].a(i13).f390831a;
            int[] iArr = new int[i14];
            int i15 = 0;
            int i16 = 0;
            for (int i17 = 0; i17 < i14; i17++) {
                if (a(i12, i13, i17) == 4) {
                    iArr[i16] = i17;
                    i16++;
                }
            }
            int[] iArrCopyOf = Arrays.copyOf(iArr, i16);
            int iMin = 16;
            int i18 = 0;
            String str = null;
            boolean z12 = false;
            while (i15 < iArrCopyOf.length) {
                String str2 = this.f384558c[i12].a(i13).a(iArrCopyOf[i15]).f391181l;
                int i19 = i18 + 1;
                if (i18 == 0) {
                    str = str2;
                } else {
                    z12 |= !pc1.a(str, str2);
                }
                iMin = Math.min(iMin, this.f384560e[i12][i13][i15] & 24);
                i15++;
                i18 = i19;
            }
            return z12 ? Math.min(iMin, this.f384559d[i12]) : iMin;
        }
    }

    public abstract Pair a(a aVar, int[][][] iArr, int[] iArr2);

    @Override // com.yandex.mobile.ads.impl.ca1
    public final void a(@j.P Object obj) {
    }

    @Override // com.yandex.mobile.ads.impl.ca1
    public final da1 a(vx0[] vx0VarArr, w91 w91Var, jd0.b bVar, i91 i91Var) {
        boolean z12;
        int[] iArr;
        w91 w91Var2 = w91Var;
        boolean z13 = true;
        int[] iArr2 = new int[vx0VarArr.length + 1];
        int length = vx0VarArr.length + 1;
        v91[][] v91VarArr = new v91[length][];
        int[][][] iArr3 = new int[vx0VarArr.length + 1][][];
        for (int i12 = 0; i12 < length; i12++) {
            int i13 = w91Var2.f391354a;
            v91VarArr[i12] = new v91[i13];
            iArr3[i12] = new int[i13][];
        }
        int length2 = vx0VarArr.length;
        int[] iArr4 = new int[length2];
        for (int i14 = 0; i14 < length2; i14++) {
            iArr4[i14] = vx0VarArr[i14].f();
        }
        int i15 = 0;
        while (i15 < w91Var2.f391354a) {
            v91 v91VarA = w91Var2.a(i15);
            boolean z14 = v91VarA.f390833c == 5 ? z13 : false;
            int length3 = vx0VarArr.length;
            boolean z15 = z13;
            int i16 = 0;
            for (int i17 = 0; i17 < vx0VarArr.length; i17++) {
                vx0 vx0Var = vx0VarArr[i17];
                int iMax = 0;
                for (int i18 = 0; i18 < v91VarA.f390831a; i18++) {
                    iMax = Math.max(iMax, vx0Var.a(v91VarA.a(i18)) & 7);
                }
                boolean z16 = iArr2[i17] == 0;
                if (iMax > i16 || (iMax == i16 && z14 && !z15 && z16)) {
                    z15 = z16;
                    i16 = iMax;
                    length3 = i17;
                }
            }
            if (length3 == vx0VarArr.length) {
                iArr = new int[v91VarA.f390831a];
            } else {
                vx0 vx0Var2 = vx0VarArr[length3];
                int[] iArr5 = new int[v91VarA.f390831a];
                for (int i19 = 0; i19 < v91VarA.f390831a; i19++) {
                    iArr5[i19] = vx0Var2.a(v91VarA.a(i19));
                }
                iArr = iArr5;
            }
            int i22 = iArr2[length3];
            v91VarArr[length3][i22] = v91VarA;
            iArr3[length3][i22] = iArr;
            iArr2[length3] = i22 + 1;
            i15++;
            z13 = true;
            w91Var2 = w91Var;
        }
        boolean z17 = z13;
        w91[] w91VarArr = new w91[vx0VarArr.length];
        String[] strArr = new String[vx0VarArr.length];
        int[] iArr6 = new int[vx0VarArr.length];
        for (int i23 = 0; i23 < vx0VarArr.length; i23++) {
            int i24 = iArr2[i23];
            w91VarArr[i23] = new w91((v91[]) pc1.a(i24, v91VarArr[i23]));
            iArr3[i23] = (int[][]) pc1.a(i24, iArr3[i23]);
            strArr[i23] = vx0VarArr[i23].getName();
            iArr6[i23] = ((ff) vx0VarArr[i23]).m();
        }
        a aVar = new a(iArr6, w91VarArr, iArr4, iArr3, new w91((v91[]) pc1.a(iArr2[vx0VarArr.length], v91VarArr[vx0VarArr.length])));
        Pair pairA = a(aVar, iArr3, iArr4);
        z91[] z91VarArr = (z91[]) pairA.second;
        List[] listArr = new List[z91VarArr.length];
        for (int i25 = 0; i25 < z91VarArr.length; i25++) {
            z91 z91Var = z91VarArr[i25];
            listArr[i25] = z91Var != null ? com.yandex.mobile.ads.embedded.guava.collect.p.a(z91Var) : com.yandex.mobile.ads.embedded.guava.collect.p.i();
        }
        p.a aVar2 = new p.a();
        int i26 = 0;
        while (i26 < aVar.a()) {
            w91 w91VarB = aVar.b(i26);
            List list = listArr[i26];
            int i27 = 0;
            while (i27 < w91VarB.f391354a) {
                v91 v91VarA2 = w91VarB.a(i27);
                boolean z18 = aVar.a(i26, i27) != 0 ? z17 : false;
                int i28 = v91VarA2.f390831a;
                int[] iArr7 = new int[i28];
                boolean[] zArr = new boolean[i28];
                for (int i29 = 0; i29 < v91VarA2.f390831a; i29++) {
                    iArr7[i29] = aVar.a(i26, i27, i29);
                    int i32 = 0;
                    while (true) {
                        if (i32 >= list.size()) {
                            z12 = false;
                            break;
                        }
                        z91 z91Var2 = (z91) list.get(i32);
                        if (z91Var2.a().equals(v91VarA2) && z91Var2.c(i29) != -1) {
                            z12 = true;
                            break;
                        }
                        i32++;
                    }
                    zArr[i29] = z12;
                }
                aVar2.b(new sa1.a(v91VarA2, z18, iArr7, zArr));
                i27++;
                z17 = true;
            }
            i26++;
            z17 = true;
        }
        w91 w91VarB2 = aVar.b();
        for (int i33 = 0; i33 < w91VarB2.f391354a; i33++) {
            v91 v91VarA3 = w91VarB2.a(i33);
            int[] iArr8 = new int[v91VarA3.f390831a];
            Arrays.fill(iArr8, 0);
            aVar2.b(new sa1.a(v91VarA3, false, iArr8, new boolean[v91VarA3.f390831a]));
        }
        return new da1((wx0[]) pairA.first, (cu[]) pairA.second, new sa1(aVar2.a()), aVar);
    }
}
