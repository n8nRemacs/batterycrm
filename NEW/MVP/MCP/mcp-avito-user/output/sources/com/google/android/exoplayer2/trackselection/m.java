package com.google.android.exoplayer2.trackselection;

import android.util.Pair;
import com.google.android.exoplayer2.I;
import com.google.android.exoplayer2.i0;
import com.google.android.exoplayer2.j0;
import com.google.android.exoplayer2.s0;
import com.google.android.exoplayer2.source.V;
import com.google.android.exoplayer2.source.W;
import com.google.android.exoplayer2.source.y;
import com.google.android.exoplayer2.t0;
import com.google.android.exoplayer2.util.U;
import com.google.common.collect.AbstractC37401r1;
import j.P;
import j.k0;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Arrays;
import java.util.List;

/* compiled from: MappingTrackSelector.java */
/* loaded from: classes6.dex */
public abstract class m extends t {

    /* compiled from: MappingTrackSelector.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f347270a;

        /* renamed from: b, reason: collision with root package name */
        public final int[] f347271b;

        /* renamed from: c, reason: collision with root package name */
        public final W[] f347272c;

        /* renamed from: d, reason: collision with root package name */
        public final int[] f347273d;

        /* renamed from: e, reason: collision with root package name */
        public final int[][][] f347274e;

        /* renamed from: f, reason: collision with root package name */
        public final W f347275f;

        /* compiled from: MappingTrackSelector.java */
        @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
        @Documented
        @Retention(RetentionPolicy.SOURCE)
        /* renamed from: com.google.android.exoplayer2.trackselection.m$a$a, reason: collision with other inner class name */
        public @interface InterfaceC10608a {
        }

        @k0
        public a(int[] iArr, W[] wArr, int[] iArr2, int[][][] iArr3, W w12) {
            this.f347271b = iArr;
            this.f347272c = wArr;
            this.f347274e = iArr3;
            this.f347273d = iArr2;
            this.f347275f = w12;
            this.f347270a = iArr.length;
        }
    }

    @Override // com.google.android.exoplayer2.trackselection.t
    public final u d(i0[] i0VarArr, W w12, y.b bVar, s0 s0Var) {
        int[][][] iArr;
        boolean z12;
        I[] iArr2;
        int i12;
        int[] iArr3;
        W w13 = w12;
        boolean z13 = true;
        int[] iArr4 = new int[i0VarArr.length + 1];
        int length = i0VarArr.length + 1;
        V[][] vArr = new V[length][];
        int[][][] iArr5 = new int[i0VarArr.length + 1][][];
        for (int i13 = 0; i13 < length; i13++) {
            int i14 = w13.f346155b;
            vArr[i13] = new V[i14];
            iArr5[i13] = new int[i14][];
        }
        int length2 = i0VarArr.length;
        int[] iArr6 = new int[length2];
        for (int i15 = 0; i15 < length2; i15++) {
            iArr6[i15] = i0VarArr[i15].f();
        }
        int i16 = 0;
        while (i16 < w13.f346155b) {
            V vA2 = w13.a(i16);
            boolean z14 = vA2.f346150d == 5 ? z13 : false;
            int length3 = i0VarArr.length;
            boolean z15 = z13;
            int i17 = 0;
            int i18 = 0;
            while (true) {
                int length4 = i0VarArr.length;
                iArr2 = vA2.f346151e;
                i12 = vA2.f346148b;
                if (i17 >= length4) {
                    break;
                }
                i0 i0Var = i0VarArr[i17];
                int[] iArr7 = iArr6;
                int i19 = 0;
                int iMax = 0;
                while (i19 < i12) {
                    iMax = Math.max(iMax, i0Var.y(iArr2[i19]) & 7);
                    i19++;
                    i16 = i16;
                }
                int i22 = i16;
                boolean z16 = iArr4[i17] == 0;
                if (iMax > i18 || (iMax == i18 && z14 && !z15 && z16)) {
                    z15 = z16;
                    length3 = i17;
                    i18 = iMax;
                }
                i17++;
                iArr6 = iArr7;
                i16 = i22;
            }
            int i23 = i16;
            int[] iArr8 = iArr6;
            if (length3 == i0VarArr.length) {
                iArr3 = new int[i12];
            } else {
                i0 i0Var2 = i0VarArr[length3];
                int[] iArr9 = new int[i12];
                for (int i24 = 0; i24 < i12; i24++) {
                    iArr9[i24] = i0Var2.y(iArr2[i24]);
                }
                iArr3 = iArr9;
            }
            int i25 = iArr4[length3];
            vArr[length3][i25] = vA2;
            iArr5[length3][i25] = iArr3;
            iArr4[length3] = i25 + 1;
            i16 = i23 + 1;
            w13 = w12;
            iArr6 = iArr8;
            z13 = true;
        }
        int[] iArr10 = iArr6;
        W[] wArr = new W[i0VarArr.length];
        String[] strArr = new String[i0VarArr.length];
        int[] iArr11 = new int[i0VarArr.length];
        for (int i26 = 0; i26 < i0VarArr.length; i26++) {
            int i27 = iArr4[i26];
            wArr[i26] = new W((V[]) U.J(i27, vArr[i26]));
            iArr5[i26] = (int[][]) U.J(i27, iArr5[i26]);
            strArr[i26] = i0VarArr[i26].getName();
            iArr11[i26] = i0VarArr[i26].m();
        }
        a aVar = new a(iArr11, wArr, iArr10, iArr5, new W((V[]) U.J(iArr4[i0VarArr.length], vArr[i0VarArr.length])));
        Pair<j0[], k[]> pairG = g(aVar, iArr5, iArr10, bVar, s0Var);
        o[] oVarArr = (o[]) pairG.second;
        List[] listArr = new List[oVarArr.length];
        for (int i28 = 0; i28 < oVarArr.length; i28++) {
            o oVar = oVarArr[i28];
            listArr[i28] = oVar != null ? AbstractC37401r1.E(oVar) : AbstractC37401r1.C();
        }
        AbstractC37401r1.a aVar2 = new AbstractC37401r1.a();
        for (int i29 = 0; i29 < aVar.f347270a; i29++) {
            W[] wArr2 = aVar.f347272c;
            W w14 = wArr2[i29];
            List list = listArr[i29];
            int i32 = 0;
            while (i32 < w14.f346155b) {
                V vA3 = w14.a(i32);
                int i33 = wArr2[i29].a(i32).f346148b;
                int[] iArr12 = new int[i33];
                int i34 = 0;
                int i35 = 0;
                while (true) {
                    iArr = aVar.f347274e;
                    if (i34 >= i33) {
                        break;
                    }
                    if ((iArr[i29][i32][i34] & 7) == 4) {
                        iArr12[i35] = i34;
                        i35++;
                    }
                    i34++;
                }
                int[] iArrCopyOf = Arrays.copyOf(iArr12, i35);
                int iMin = 16;
                String str = null;
                List[] listArr2 = listArr;
                int i36 = 0;
                boolean z17 = false;
                int i37 = 0;
                while (i36 < iArrCopyOf.length) {
                    W w15 = w14;
                    String str2 = wArr2[i29].a(i32).f346151e[iArrCopyOf[i36]].f343476m;
                    int i38 = i37 + 1;
                    if (i37 == 0) {
                        str = str2;
                    } else {
                        z17 |= !U.a(str, str2);
                    }
                    iMin = Math.min(iMin, iArr[i29][i32][i36] & 24);
                    i36++;
                    i37 = i38;
                    w14 = w15;
                }
                W w16 = w14;
                if (z17) {
                    iMin = Math.min(iMin, aVar.f347273d[i29]);
                }
                boolean z18 = iMin != 0;
                int i39 = vA3.f346148b;
                int[] iArr13 = new int[i39];
                boolean[] zArr = new boolean[i39];
                for (int i42 = 0; i42 < vA3.f346148b; i42++) {
                    iArr13[i42] = iArr[i29][i32][i42] & 7;
                    int i43 = 0;
                    while (true) {
                        if (i43 >= list.size()) {
                            z12 = false;
                            break;
                        }
                        o oVar2 = (o) list.get(i43);
                        if (oVar2.i().equals(vA3) && oVar2.h(i42) != -1) {
                            z12 = true;
                            break;
                        }
                        i43++;
                    }
                    zArr[i42] = z12;
                }
                aVar2.g(new t0.a(vA3, z18, iArr13, zArr));
                i32++;
                w14 = w16;
                listArr = listArr2;
            }
        }
        int i44 = 0;
        while (true) {
            W w17 = aVar.f347275f;
            if (i44 >= w17.f346155b) {
                return new u((j0[]) pairG.first, (k[]) pairG.second, new t0(aVar2.i()), aVar);
            }
            V vA4 = w17.a(i44);
            int[] iArr14 = new int[vA4.f346148b];
            Arrays.fill(iArr14, 0);
            aVar2.g(new t0.a(vA4, false, iArr14, new boolean[vA4.f346148b]));
            i44++;
        }
    }

    public abstract Pair<j0[], k[]> g(a aVar, int[][][] iArr, int[] iArr2, y.b bVar, s0 s0Var);

    @Override // com.google.android.exoplayer2.trackselection.t
    public final void b(@P a aVar) {
    }
}
