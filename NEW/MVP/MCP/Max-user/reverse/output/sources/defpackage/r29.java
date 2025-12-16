package defpackage;

import android.content.Context;
import android.graphics.Point;
import android.media.AudioManager;
import android.media.Spatializer;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import android.view.accessibility.CaptioningManager;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;

/* loaded from: classes.dex */
public final class r29 {
    public final Object a;
    public final Object b;
    public final jxd[] c;
    public boolean d;
    public boolean e;
    public boolean f;
    public u29 g;
    public boolean h;
    public final boolean[] i;
    public final tk0[] j;
    public final oo8 k;
    public final y87 l;
    public r29 m;
    public nfg n;
    public ggg o;
    public long p;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [bc3] */
    public r29(tk0[] tk0VarArr, long j, oo8 oo8Var, ri4 ri4Var, y87 y87Var, u29 u29Var, ggg gggVar) {
        this.j = tk0VarArr;
        this.p = j;
        this.k = oo8Var;
        this.l = y87Var;
        d99 d99Var = u29Var.a;
        this.b = d99Var.a;
        this.g = u29Var;
        this.n = nfg.d;
        this.o = gggVar;
        this.c = new jxd[tk0VarArr.length];
        this.i = new boolean[tk0VarArr.length];
        long j2 = u29Var.b;
        long j3 = u29Var.d;
        boolean z = u29Var.f;
        y87Var.getClass();
        Object obj = d99Var.a;
        int i = l0.g;
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        d99 d99VarA = d99Var.a(pair.second);
        z99 z99Var = (z99) ((HashMap) y87Var.c).get(obj2);
        z99Var.getClass();
        ((HashSet) y87Var.j).add(z99Var);
        x99 x99Var = (x99) ((HashMap) y87Var.d).get(z99Var);
        if (x99Var != null) {
            x99Var.a.f(x99Var.b);
        }
        z99Var.c.add(d99VarA);
        pp8 pp8VarE = z99Var.a.c(d99VarA, ri4Var, j2);
        ((IdentityHashMap) y87Var.h).put(pp8VarE, z99Var);
        y87Var.h();
        this.a = j3 != -9223372036854775807L ? new bc3(pp8VarE, !z, 0L, j3) : pp8VarE;
    }

    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, p29] */
    public final long a(ggg gggVar, long j, boolean z, boolean[] zArr) {
        tk0[] tk0VarArr;
        jxd[] jxdVarArr;
        int i = 0;
        while (true) {
            boolean z2 = true;
            if (i >= gggVar.b) {
                break;
            }
            if (z || !gggVar.R(this.o, i)) {
                z2 = false;
            }
            this.i[i] = z2;
            i++;
        }
        int i2 = 0;
        while (true) {
            tk0VarArr = this.j;
            int length = tk0VarArr.length;
            jxdVarArr = this.c;
            if (i2 >= length) {
                break;
            }
            if (tk0VarArr[i2].b == -2) {
                jxdVarArr[i2] = null;
            }
            i2++;
        }
        b();
        this.o = gggVar;
        c();
        long jM = this.a.m((bn5[]) gggVar.o, this.i, this.c, zArr, j);
        for (int i3 = 0; i3 < tk0VarArr.length; i3++) {
            if (tk0VarArr[i3].b == -2 && this.o.S(i3)) {
                jxdVarArr[i3] = new nd5();
            }
        }
        this.f = false;
        for (int i4 = 0; i4 < jxdVarArr.length; i4++) {
            if (jxdVarArr[i4] != null) {
                hsi.g(gggVar.S(i4));
                if (tk0VarArr[i4].b != -2) {
                    this.f = true;
                }
            } else {
                hsi.g(((bn5[]) gggVar.o)[i4] == null);
            }
        }
        return jM;
    }

    public final void b() {
        if (this.m != null) {
            return;
        }
        int i = 0;
        while (true) {
            ggg gggVar = this.o;
            if (i >= gggVar.b) {
                return;
            }
            boolean zS = gggVar.S(i);
            bn5 bn5Var = ((bn5[]) this.o.o)[i];
            if (zS && bn5Var != null) {
                bn5Var.h();
            }
            i++;
        }
    }

    public final void c() {
        if (this.m != null) {
            return;
        }
        int i = 0;
        while (true) {
            ggg gggVar = this.o;
            if (i >= gggVar.b) {
                return;
            }
            boolean zS = gggVar.S(i);
            bn5 bn5Var = ((bn5[]) this.o.o)[i];
            if (zS && bn5Var != null) {
                bn5Var.e();
            }
            i++;
        }
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, jee] */
    public final long d() {
        if (!this.e) {
            return this.g.b;
        }
        long jO = this.f ? this.a.o() : Long.MIN_VALUE;
        return jO == Long.MIN_VALUE ? this.g.e : jO;
    }

    public final long e() {
        return this.g.b + this.p;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, p29] */
    public final void f(float f, s9g s9gVar, boolean z) throws NumberFormatException {
        this.e = true;
        this.n = this.a.l();
        ggg gggVarJ = j(f, s9gVar, z);
        u29 u29Var = this.g;
        long jMax = u29Var.b;
        long j = u29Var.e;
        if (j != -9223372036854775807L && jMax >= j) {
            jMax = Math.max(0L, j - 1);
        }
        long jA = a(gggVarJ, jMax, false, new boolean[this.j.length]);
        long j2 = this.p;
        u29 u29Var2 = this.g;
        this.p = (u29Var2.b - jA) + j2;
        this.g = u29Var2.b(jA);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, jee] */
    public final boolean g() {
        if (this.e) {
            return !this.f || this.a.o() == Long.MIN_VALUE;
        }
        return false;
    }

    public final boolean h() {
        if (this.e) {
            return g() || d() - this.g.b >= -9223372036854775807L;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, p29] */
    public final void i() {
        b();
        ?? r0 = this.a;
        try {
            boolean z = r0 instanceof bc3;
            y87 y87Var = this.l;
            if (z) {
                y87Var.s(((bc3) r0).a);
            } else {
                y87Var.s(r0);
            }
        } catch (RuntimeException e) {
            a8i.h("MediaPeriodHolder", "Period release failed.", e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v72 */
    public final ggg j(float f, s9g s9gVar, boolean z) throws NumberFormatException {
        nq4 nq4Var;
        boolean z2;
        String str;
        Point pointY;
        lfg lfgVar;
        int[] iArr;
        Pair pairI;
        String languageTag;
        CaptioningManager captioningManager;
        Locale locale;
        Pair pairI2;
        boolean z3;
        zjd zjdVarM;
        double[] dArr;
        long[][] jArr;
        int[][][] iArr2;
        lfg lfgVar2;
        int i;
        agg aggVar;
        int i2;
        Object zm5Var;
        agg aggVar2;
        int i3;
        Context context;
        int[] iArr3;
        oo8 oo8Var = this.k;
        tk0[] tk0VarArr = this.j;
        nfg nfgVar = this.n;
        oo8Var.getClass();
        int i4 = 1;
        int[] iArr4 = new int[tk0VarArr.length + 1];
        int length = tk0VarArr.length + 1;
        lfg[][] lfgVarArr = new lfg[length][];
        int[][][] iArr5 = new int[tk0VarArr.length + 1][][];
        for (int i5 = 0; i5 < length; i5++) {
            int i6 = nfgVar.a;
            lfgVarArr[i5] = new lfg[i6];
            iArr5[i5] = new int[i6][];
        }
        int length2 = tk0VarArr.length;
        int[] iArr6 = new int[length2];
        for (int i7 = 0; i7 < length2; i7++) {
            iArr6[i7] = tk0VarArr[i7].A();
        }
        int i8 = 0;
        while (i8 < nfgVar.a) {
            lfg lfgVarA = nfgVar.a(i8);
            int i9 = lfgVarA.c == 5 ? i4 : 0;
            int length3 = tk0VarArr.length;
            int i10 = i4;
            int i11 = 0;
            int i12 = 0;
            while (i11 < tk0VarArr.length) {
                tk0 tk0Var = tk0VarArr[i11];
                oo8 oo8Var2 = oo8Var;
                nfg nfgVar2 = nfgVar;
                int i13 = i4;
                int iMax = 0;
                for (int i14 = 0; i14 < lfgVarA.a; i14++) {
                    iMax = Math.max(iMax, tk0Var.z(lfgVarA.d[i14]) & 7);
                }
                int i15 = iArr4[i11] == 0 ? i13 : 0;
                if (iMax > i12 || (iMax == i12 && i9 != 0 && i10 == 0 && i15 != 0)) {
                    i12 = iMax;
                    i10 = i15;
                    length3 = i11;
                }
                i11++;
                i4 = i13;
                oo8Var = oo8Var2;
                nfgVar = nfgVar2;
            }
            oo8 oo8Var3 = oo8Var;
            nfg nfgVar3 = nfgVar;
            int i16 = i4;
            if (length3 == tk0VarArr.length) {
                iArr3 = new int[lfgVarA.a];
            } else {
                tk0 tk0Var2 = tk0VarArr[length3];
                int[] iArr7 = new int[lfgVarA.a];
                for (int i17 = 0; i17 < lfgVarA.a; i17++) {
                    iArr7[i17] = tk0Var2.z(lfgVarA.d[i17]);
                }
                iArr3 = iArr7;
            }
            int i18 = iArr4[length3];
            lfgVarArr[length3][i18] = lfgVarA;
            iArr5[length3][i18] = iArr3;
            iArr4[length3] = i18 + 1;
            i8++;
            i4 = i16;
            oo8Var = oo8Var3;
            nfgVar = nfgVar3;
        }
        oo8 oo8Var4 = oo8Var;
        int i19 = i4;
        nfg[] nfgVarArr = new nfg[tk0VarArr.length];
        String[] strArr = new String[tk0VarArr.length];
        int[] iArr8 = new int[tk0VarArr.length];
        for (int i20 = 0; i20 < tk0VarArr.length; i20++) {
            int i21 = iArr4[i20];
            nfgVarArr[i20] = new nfg((lfg[]) zxg.W(i21, lfgVarArr[i20]));
            iArr5[i20] = (int[][]) zxg.W(i21, iArr5[i20]);
            strArr[i20] = tk0VarArr[i20].h();
            iArr8[i20] = tk0VarArr[i20].b;
        }
        mo8 mo8Var = new mo8(iArr8, nfgVarArr, iArr6, iArr5, new nfg((lfg[]) zxg.W(iArr4[tk0VarArr.length], lfgVarArr[tk0VarArr.length])));
        ar4 ar4Var = (ar4) oo8Var4;
        synchronized (ar4Var.c) {
            ar4Var.g = Thread.currentThread();
            nq4Var = ar4Var.f;
        }
        if (ar4Var.j == null && (context = ar4Var.d) != null) {
            ar4Var.j = Boolean.valueOf(zxg.Q(context));
        }
        Pair pairI3 = null;
        if (nq4Var.s0 && Build.VERSION.SDK_INT >= 32 && ar4Var.h == null) {
            Context context2 = ar4Var.d;
            Boolean bool = ar4Var.j;
            dl6 dl6Var = new dl6();
            AudioManager audioManagerA = context2 == null ? null : j40.a(context2);
            if (audioManagerA == null || (bool != null && bool.booleanValue())) {
                dl6Var.b = null;
                dl6Var.a = false;
                dl6Var.c = null;
                dl6Var.d = null;
            } else {
                Spatializer spatializer = audioManagerA.getSpatializer();
                dl6Var.b = spatializer;
                dl6Var.a = spatializer.getImmersiveAudioLevel() != 0 ? i19 : 0;
                qq4 qq4Var = new qq4(ar4Var);
                dl6Var.d = qq4Var;
                Looper looperMyLooper = Looper.myLooper();
                hsi.h(looperMyLooper);
                Handler handler = new Handler(looperMyLooper);
                dl6Var.c = handler;
                spatializer.addOnSpatializerStateChangedListener(new fv1(i19, handler), qq4Var);
            }
            ar4Var.h = dl6Var;
        }
        int i22 = mo8Var.a;
        Context context3 = ar4Var.d;
        zm5[] zm5VarArr = new zm5[i22];
        int i23 = 0;
        while (true) {
            if (i23 >= mo8Var.a) {
                z2 = false;
                break;
            }
            if (2 == iArr8[i23] && nfgVarArr[i23].a > 0) {
                z2 = true;
                break;
            }
            i23++;
        }
        Pair pairI4 = ar4.i(1, mo8Var, iArr5, new yi4(ar4Var, nq4Var, z2, iArr6), new o00(22));
        if (pairI4 != null) {
            zm5VarArr[((Integer) pairI4.second).intValue()] = (zm5) pairI4.first;
        }
        if (pairI4 == null) {
            str = null;
        } else {
            zm5 zm5Var2 = (zm5) pairI4.first;
            str = zm5Var2.a.d[zm5Var2.b[0]].d;
        }
        agg aggVar3 = nq4Var.u;
        if (aggVar3.a == 2) {
            lfgVar = null;
        } else {
            if (!nq4Var.k || context3 == null) {
                pointY = null;
                lfgVar = null;
            } else {
                pointY = zxg.y(context3);
                lfgVar = null;
            }
            pairI3 = ar4.i(2, mo8Var, iArr5, new ol(nq4Var, str, iArr6, pointY), new o00(20));
        }
        int i24 = 4;
        if ((nq4Var.A || pairI3 == null) && aggVar3.a != 2) {
            iArr = iArr8;
            pairI = ar4.i(4, mo8Var, iArr5, new cq4(nq4Var), new o00(18));
        } else {
            iArr = iArr8;
            pairI = lfgVar;
        }
        if (pairI != 0) {
            zm5VarArr[((Integer) pairI.second).intValue()] = (zm5) pairI.first;
        } else if (pairI3 != null) {
            zm5VarArr[((Integer) pairI3.second).intValue()] = (zm5) pairI3.first;
        }
        int i25 = 24;
        int i26 = 3;
        if (aggVar3.a == 2) {
            pairI2 = lfgVar;
        } else {
            if (!nq4Var.x || context3 == null || (captioningManager = (CaptioningManager) context3.getSystemService("captioning")) == null || !captioningManager.isEnabled() || (locale = captioningManager.getLocale()) == null) {
                languageTag = lfgVar;
            } else {
                String str2 = zxg.a;
                languageTag = locale.toLanguageTag();
            }
            pairI2 = ar4.i(3, mo8Var, iArr5, new nl(nq4Var, str, languageTag), new o00(i25));
        }
        if (pairI2 != 0) {
            zm5VarArr[((Integer) pairI2.second).intValue()] = (zm5) pairI2.first;
        }
        int i27 = 0;
        while (i27 < i22) {
            int i28 = iArr[i27];
            if (i28 == 2 || i28 == 1 || i28 == i26 || i28 == i24) {
                i = i27;
                aggVar = aggVar3;
                i2 = i25;
            } else {
                nfg nfgVar4 = nfgVarArr[i27];
                int[][] iArr9 = iArr5[i27];
                i2 = i25;
                if (aggVar3.a == 2) {
                    i = i27;
                    aggVar = aggVar3;
                } else {
                    lfg lfgVar3 = lfgVar;
                    lfg lfgVar4 = lfgVar3;
                    int i29 = 0;
                    int i30 = 0;
                    while (i29 < nfgVar4.a) {
                        lfg lfgVarA2 = nfgVar4.a(i29);
                        int[] iArr10 = iArr9[i29];
                        int i31 = i27;
                        nfg nfgVar5 = nfgVar4;
                        kq4 kq4Var = lfgVar4;
                        int i32 = i30;
                        lfg lfgVar5 = lfgVar3;
                        int i33 = 0;
                        while (i33 < lfgVarA2.a) {
                            int[][] iArr11 = iArr9;
                            if (tk0.k(iArr10[i33], nq4Var.t0)) {
                                aggVar2 = aggVar3;
                                kq4 kq4Var2 = new kq4(iArr10[i33], lfgVarA2.d[i33]);
                                if (kq4Var != 0) {
                                    i3 = i29;
                                    if (cj3.a.d(kq4Var2.b, kq4Var.b).d(kq4Var2.a, kq4Var.a).f() > 0) {
                                    }
                                } else {
                                    i3 = i29;
                                }
                                kq4Var = kq4Var2;
                                i32 = i33;
                                lfgVar5 = lfgVarA2;
                            } else {
                                aggVar2 = aggVar3;
                                i3 = i29;
                            }
                            i33++;
                            iArr9 = iArr11;
                            aggVar3 = aggVar2;
                            i29 = i3;
                            kq4Var = kq4Var;
                        }
                        i29++;
                        lfgVar3 = lfgVar5;
                        i30 = i32;
                        nfgVar4 = nfgVar5;
                        lfgVar4 = kq4Var;
                        i27 = i31;
                    }
                    i = i27;
                    aggVar = aggVar3;
                    if (lfgVar3 != null) {
                        zm5Var = new zm5(0, lfgVar3, new int[]{i30});
                    }
                    zm5VarArr[i] = zm5Var;
                }
                zm5Var = lfgVar;
                zm5VarArr[i] = zm5Var;
            }
            i27 = i + 1;
            i25 = i2;
            aggVar3 = aggVar;
            i26 = 3;
            i24 = 4;
        }
        int i34 = mo8Var.a;
        nfg[] nfgVarArr2 = mo8Var.c;
        HashMap map = new HashMap();
        for (int i35 = 0; i35 < i34; i35++) {
            ar4.c(nfgVarArr2[i35], nq4Var, map);
        }
        ar4.c(mo8Var.f, nq4Var, map);
        for (int i36 = 0; i36 < i34; i36++) {
            xfg xfgVar = (xfg) map.get(Integer.valueOf(mo8Var.b[i36]));
            if (xfgVar != null) {
                lfg lfgVar6 = xfgVar.a;
                wg7 wg7Var = xfgVar.b;
                zm5VarArr[i36] = (wg7Var.isEmpty() || nfgVarArr2[i36].b(lfgVar6) == -1) ? lfgVar : new zm5(0, lfgVar6, jni.i(wg7Var));
            }
        }
        int i37 = mo8Var.a;
        for (int i38 = 0; i38 < i37; i38++) {
            nfg nfgVar6 = mo8Var.c[i38];
            Map map2 = (Map) nq4Var.v0.get(i38);
            if (map2 != null && map2.containsKey(nfgVar6)) {
                Map map3 = (Map) nq4Var.v0.get(i38);
                if (map3 != null && map3.get(nfgVar6) != null) {
                    throw new ClassCastException();
                }
                zm5VarArr[i38] = lfgVar;
            }
        }
        for (int i39 = 0; i39 < i22; i39++) {
            int i40 = mo8Var.b[i39];
            if (nq4Var.w0.get(i39) || nq4Var.E.contains(Integer.valueOf(i40))) {
                zm5VarArr[i39] = lfgVar;
            }
        }
        r8j r8jVar = ar4Var.e;
        dh0 dh0Var = ar4Var.b;
        hsi.h(dh0Var);
        r8jVar.getClass();
        ArrayList arrayList = new ArrayList();
        int i41 = 0;
        while (i41 < zm5VarArr.length) {
            zm5 zm5Var3 = zm5VarArr[i41];
            if (zm5Var3 == 0 || zm5Var3.b.length <= 1) {
                lfgVar2 = lfgVar;
                arrayList.add(lfgVar2);
            } else {
                tg7 tg7VarI = wg7.i();
                tg7VarI.a(new c9(0L, 0L));
                arrayList.add(tg7VarI);
                lfgVar2 = lfgVar;
            }
            i41++;
            lfgVar = lfgVar2;
        }
        int length4 = zm5VarArr.length;
        long[][] jArr2 = new long[length4][];
        for (int i42 = 0; i42 < zm5VarArr.length; i42++) {
            zm5 zm5Var4 = zm5VarArr[i42];
            if (zm5Var4 == 0) {
                jArr2[i42] = new long[0];
            } else {
                int[] iArr12 = zm5Var4.b;
                jArr2[i42] = new long[iArr12.length];
                int i43 = 0;
                while (i43 < iArr12.length) {
                    int[] iArr13 = iArr12;
                    long j = zm5Var4.a.d[iArr12[i43]].j;
                    long[] jArr3 = jArr2[i42];
                    if (j == -1) {
                        j = 0;
                    }
                    jArr3[i43] = j;
                    i43++;
                    iArr12 = iArr13;
                }
                Arrays.sort(jArr2[i42]);
            }
        }
        int[] iArr14 = new int[length4];
        long[] jArr4 = new long[length4];
        for (int i44 = 0; i44 < length4; i44++) {
            long[] jArr5 = jArr2[i44];
            jArr4[i44] = jArr5.length == 0 ? 0L : jArr5[0];
        }
        e9.v(arrayList, jArr4);
        u4j.a(2, "expectedValuesPerKey");
        TreeMap treeMap = new TreeMap(yca.b);
        x6a x6aVar = new x6a();
        y6a y6aVar = new y6a(treeMap);
        y6aVar.X = x6aVar;
        int i45 = 0;
        while (i45 < length4) {
            long[] jArr6 = jArr2[i45];
            int i46 = length4;
            int[] iArr15 = iArr14;
            if (jArr6.length <= 1) {
                iArr2 = iArr5;
                jArr = jArr2;
            } else {
                int length5 = jArr6.length;
                double[] dArr2 = new double[length5];
                int i47 = 0;
                while (true) {
                    long[] jArr7 = jArr2[i45];
                    dArr = dArr2;
                    double dLog = 0.0d;
                    if (i47 >= jArr7.length) {
                        break;
                    }
                    int[][][] iArr16 = iArr5;
                    long[][] jArr8 = jArr2;
                    long j2 = jArr7[i47];
                    if (j2 != -1) {
                        dLog = Math.log(j2);
                    }
                    dArr[i47] = dLog;
                    i47++;
                    iArr5 = iArr16;
                    dArr2 = dArr;
                    jArr2 = jArr8;
                }
                int[][][] iArr17 = iArr5;
                jArr = jArr2;
                int i48 = length5 - 1;
                double d = dArr[i48] - dArr[0];
                int i49 = 0;
                while (i49 < i48) {
                    double d2 = dArr[i49];
                    i49++;
                    int i50 = i48;
                    y6aVar.f(Double.valueOf(d == 0.0d ? 1.0d : (((d2 + dArr[i49]) * 0.5d) - dArr[0]) / d), Integer.valueOf(i45));
                    i48 = i50;
                    iArr17 = iArr17;
                }
                iArr2 = iArr17;
            }
            i45++;
            length4 = i46;
            iArr14 = iArr15;
            jArr2 = jArr;
            iArr5 = iArr2;
        }
        int[] iArr18 = iArr14;
        int[][][] iArr19 = iArr5;
        long[][] jArr9 = jArr2;
        wg7 wg7VarJ = wg7.j(y6aVar.g());
        for (int i51 = 0; i51 < wg7VarJ.size(); i51++) {
            int iIntValue = ((Integer) wg7VarJ.get(i51)).intValue();
            int i52 = iArr18[iIntValue] + 1;
            iArr18[iIntValue] = i52;
            jArr4[iIntValue] = jArr9[iIntValue][i52];
            e9.v(arrayList, jArr4);
        }
        for (int i53 = 0; i53 < zm5VarArr.length; i53++) {
            if (arrayList.get(i53) != null) {
                jArr4[i53] = jArr4[i53] * 2;
            }
        }
        e9.v(arrayList, jArr4);
        tg7 tg7VarI2 = wg7.i();
        for (int i54 = 0; i54 < arrayList.size(); i54++) {
            tg7 tg7Var = (tg7) arrayList.get(i54);
            tg7VarI2.a(tg7Var == null ? zjd.o : tg7Var.i());
        }
        zjd zjdVarI = tg7VarI2.i();
        bn5[] bn5VarArr = new bn5[zm5VarArr.length];
        for (int i55 = 0; i55 < zm5VarArr.length; i55++) {
            zm5 zm5Var5 = zm5VarArr[i55];
            if (zm5Var5 != 0) {
                lfg lfgVar7 = zm5Var5.a;
                int[] iArr20 = zm5Var5.b;
                if (iArr20.length != 0) {
                    bn5VarArr[i55] = iArr20.length == 1 ? new n16(lfgVar7, new int[]{iArr20[0]}) : r8jVar.c(lfgVar7, iArr20, dh0Var, (wg7) zjdVarI.get(i55));
                }
            }
        }
        kld[] kldVarArr = new kld[i22];
        for (int i56 = 0; i56 < i22; i56++) {
            kldVarArr[i56] = (nq4Var.w0.get(i56) || nq4Var.E.contains(Integer.valueOf(mo8Var.b[i56])) || (mo8Var.b[i56] != -2 && bn5VarArr[i56] == null)) ? null : kld.c;
        }
        if (nq4Var.u.a != 0) {
            int i57 = 0;
            int i58 = 0;
            int i59 = -1;
            while (true) {
                if (i57 < mo8Var.a) {
                    int i60 = mo8Var.b[i57];
                    bn5 bn5Var = bn5VarArr[i57];
                    if (i60 != 1 && bn5Var != null) {
                        break;
                    }
                    if (i60 == 1 && bn5Var != null && bn5Var.length() == 1) {
                        if (ar4.h(nq4Var, iArr19[i57][mo8Var.c[i57].b(bn5Var.a())][bn5Var.f(0)], bn5Var.j())) {
                            i58++;
                            i59 = i57;
                        }
                    }
                    i57++;
                } else if (i58 == 1) {
                    int i61 = nq4Var.u.b ? 1 : 2;
                    kld kldVar = kldVarArr[i59];
                    kldVarArr[i59] = new kld(i61, kldVar != null && kldVar.b);
                }
            }
        }
        Pair pairCreate = Pair.create(kldVarArr, bn5VarArr);
        bn5[] bn5VarArr2 = (bn5[]) pairCreate.second;
        List[] listArr = new List[bn5VarArr2.length];
        for (int i62 = 0; i62 < bn5VarArr2.length; i62++) {
            bn5 bn5Var2 = bn5VarArr2[i62];
            if (bn5Var2 != null) {
                zjdVarM = wg7.m(bn5Var2);
            } else {
                t76 t76Var = wg7.b;
                zjdVarM = zjd.o;
            }
            listArr[i62] = zjdVarM;
        }
        tg7 tg7Var2 = new tg7(4);
        int i63 = 0;
        while (true) {
            int i64 = mo8Var.a;
            nfg[] nfgVarArr3 = mo8Var.c;
            if (i63 >= i64) {
                break;
            }
            nfg nfgVar7 = nfgVarArr3[i63];
            List list = listArr[i63];
            int i65 = 0;
            while (i65 < nfgVar7.a) {
                lfg lfgVarA3 = nfgVar7.a(i65);
                int i66 = nfgVarArr3[i63].a(i65).a;
                int[] iArr21 = new int[i66];
                int i67 = 0;
                int i68 = 0;
                while (i67 < i66) {
                    List[] listArr2 = listArr;
                    if ((mo8Var.e[i63][i65][i67] & 7) == 4) {
                        iArr21[i68] = i67;
                        i68++;
                    }
                    i67++;
                    listArr = listArr2;
                }
                List[] listArr3 = listArr;
                int[] iArrCopyOf = Arrays.copyOf(iArr21, i68);
                int i69 = i63;
                int iMin = 16;
                String str3 = null;
                int i70 = 0;
                boolean z4 = false;
                int i71 = 0;
                while (i70 < iArrCopyOf.length) {
                    String str4 = nfgVarArr3[i69].a(i65).d[iArrCopyOf[i70]].n;
                    int i72 = i71 + 1;
                    if (i71 == 0) {
                        str3 = str4;
                    } else {
                        z4 = (!Objects.equals(str3, str4)) | z4;
                    }
                    iMin = Math.min(iMin, mo8Var.e[i69][i65][i70] & 24);
                    i70++;
                    i71 = i72;
                }
                if (z4) {
                    iMin = Math.min(iMin, mo8Var.d[i69]);
                }
                boolean z5 = iMin != 0;
                int i73 = lfgVarA3.a;
                int[] iArr22 = new int[i73];
                boolean[] zArr = new boolean[i73];
                for (int i74 = 0; i74 < lfgVarA3.a; i74++) {
                    iArr22[i74] = mo8Var.e[i69][i65][i74] & 7;
                    int i75 = 0;
                    while (true) {
                        if (i75 >= list.size()) {
                            z3 = false;
                            break;
                        }
                        bn5 bn5Var3 = (bn5) list.get(i75);
                        if (bn5Var3.a().equals(lfgVarA3) && bn5Var3.p(i74) != -1) {
                            z3 = true;
                            break;
                        }
                        i75++;
                    }
                    zArr[i74] = z3;
                }
                tg7Var2.a(new jgg(lfgVarA3, z5, iArr22, zArr));
                i65++;
                listArr = listArr3;
                i63 = i69;
            }
            i63++;
        }
        nfg nfgVar8 = mo8Var.f;
        for (int i76 = 0; i76 < nfgVar8.a; i76++) {
            lfg lfgVarA4 = nfgVar8.a(i76);
            int[] iArr23 = new int[lfgVarA4.a];
            Arrays.fill(iArr23, 0);
            tg7Var2.a(new jgg(lfgVarA4, false, iArr23, new boolean[lfgVarA4.a]));
        }
        ggg gggVar = new ggg((kld[]) pairCreate.first, (bn5[]) pairCreate.second, new kgg(tg7Var2.i()), mo8Var);
        for (int i77 = 0; i77 < gggVar.b; i77++) {
            if (gggVar.S(i77)) {
                hsi.g(((bn5[]) gggVar.o)[i77] != null || this.j[i77].b == -2);
            } else {
                hsi.g(((bn5[]) gggVar.o)[i77] == null);
            }
        }
        for (bn5 bn5Var4 : (bn5[]) gggVar.o) {
            if (bn5Var4 != null) {
                bn5Var4.l(f);
                bn5Var4.c(z);
            }
        }
        return gggVar;
    }

    public final void k() {
        Object obj = this.a;
        if (obj instanceof bc3) {
            long j = this.g.d;
            if (j == -9223372036854775807L) {
                j = Long.MIN_VALUE;
            }
            bc3 bc3Var = (bc3) obj;
            bc3Var.o = 0L;
            bc3Var.X = j;
        }
    }
}
