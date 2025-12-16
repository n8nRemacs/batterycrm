package androidx.media3.exoplayer.trackselection;

import android.util.Pair;
import androidx.media3.common.C23108t;
import androidx.media3.common.P;
import androidx.media3.common.Q;
import androidx.media3.common.V;
import androidx.media3.common.util.J;
import androidx.media3.common.util.M;
import androidx.media3.exoplayer.d0;
import androidx.media3.exoplayer.e0;
import androidx.media3.exoplayer.source.A;
import androidx.media3.exoplayer.source.Y;
import com.google.common.collect.AbstractC37401r1;
import j.k0;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Arrays;
import java.util.List;

/* compiled from: MappingTrackSelector.java */
@J
/* loaded from: classes.dex */
public abstract class m extends r {

    /* compiled from: MappingTrackSelector.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f50028a;

        /* renamed from: b, reason: collision with root package name */
        public final int[] f50029b;

        /* renamed from: c, reason: collision with root package name */
        public final Y[] f50030c;

        /* renamed from: d, reason: collision with root package name */
        public final int[] f50031d;

        /* renamed from: e, reason: collision with root package name */
        public final int[][][] f50032e;

        /* renamed from: f, reason: collision with root package name */
        public final Y f50033f;

        /* compiled from: MappingTrackSelector.java */
        @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
        @Documented
        @Retention(RetentionPolicy.SOURCE)
        /* renamed from: androidx.media3.exoplayer.trackselection.m$a$a, reason: collision with other inner class name */
        public @interface InterfaceC1839a {
        }

        @k0
        public a(int[] iArr, Y[] yArr, int[] iArr2, int[][][] iArr3, Y y12) {
            this.f50029b = iArr;
            this.f50030c = yArr;
            this.f50032e = iArr3;
            this.f50031d = iArr2;
            this.f50033f = y12;
            this.f50028a = iArr.length;
        }
    }

    @Override // androidx.media3.exoplayer.trackselection.r
    public final s f(d0[] d0VarArr, Y y12, A.b bVar, P p12) {
        int[][][] iArr;
        boolean z12;
        C23108t[] c23108tArr;
        int i12;
        int[] iArr2;
        Y y13 = y12;
        boolean z13 = true;
        int[] iArr3 = new int[d0VarArr.length + 1];
        int length = d0VarArr.length + 1;
        Q[][] qArr = new Q[length][];
        int[][][] iArr4 = new int[d0VarArr.length + 1][][];
        for (int i13 = 0; i13 < length; i13++) {
            int i14 = y13.f49708b;
            qArr[i13] = new Q[i14];
            iArr4[i13] = new int[i14][];
        }
        int length2 = d0VarArr.length;
        int[] iArr5 = new int[length2];
        for (int i15 = 0; i15 < length2; i15++) {
            iArr5[i15] = d0VarArr[i15].f();
        }
        int i16 = 0;
        while (i16 < y13.f49708b) {
            Q qA2 = y13.a(i16);
            boolean z14 = qA2.f47441d == 5 ? z13 : false;
            int length3 = d0VarArr.length;
            boolean z15 = z13;
            int i17 = 0;
            int i18 = 0;
            while (true) {
                int length4 = d0VarArr.length;
                c23108tArr = qA2.f47442e;
                i12 = qA2.f47439b;
                if (i17 >= length4) {
                    break;
                }
                d0 d0Var = d0VarArr[i17];
                int[] iArr6 = iArr5;
                int i19 = 0;
                int iMax = 0;
                while (i19 < i12) {
                    iMax = Math.max(iMax, d0Var.i(c23108tArr[i19]) & 7);
                    i19++;
                    i16 = i16;
                }
                int i22 = i16;
                boolean z16 = iArr3[i17] == 0;
                if (iMax > i18 || (iMax == i18 && z14 && !z15 && z16)) {
                    z15 = z16;
                    length3 = i17;
                    i18 = iMax;
                }
                i17++;
                iArr5 = iArr6;
                i16 = i22;
            }
            int i23 = i16;
            int[] iArr7 = iArr5;
            if (length3 == d0VarArr.length) {
                iArr2 = new int[i12];
            } else {
                d0 d0Var2 = d0VarArr[length3];
                int[] iArr8 = new int[i12];
                for (int i24 = 0; i24 < i12; i24++) {
                    iArr8[i24] = d0Var2.i(c23108tArr[i24]);
                }
                iArr2 = iArr8;
            }
            int i25 = iArr3[length3];
            qArr[length3][i25] = qA2;
            iArr4[length3][i25] = iArr2;
            iArr3[length3] = i25 + 1;
            i16 = i23 + 1;
            y13 = y12;
            iArr5 = iArr7;
            z13 = true;
        }
        int[] iArr9 = iArr5;
        Y[] yArr = new Y[d0VarArr.length];
        String[] strArr = new String[d0VarArr.length];
        int[] iArr10 = new int[d0VarArr.length];
        for (int i26 = 0; i26 < d0VarArr.length; i26++) {
            int i27 = iArr3[i26];
            yArr[i26] = new Y((Q[]) M.H(i27, qArr[i26]));
            iArr4[i26] = (int[][]) M.H(i27, iArr4[i26]);
            strArr[i26] = d0VarArr[i26].getName();
            iArr10[i26] = d0VarArr[i26].m();
        }
        a aVar = new a(iArr10, yArr, iArr9, iArr4, new Y((Q[]) M.H(iArr3[d0VarArr.length], qArr[d0VarArr.length])));
        Pair<e0[], k[]> pairI = i(aVar, iArr4, iArr9, bVar, p12);
        o[] oVarArr = (o[]) pairI.second;
        List[] listArr = new List[oVarArr.length];
        for (int i28 = 0; i28 < oVarArr.length; i28++) {
            o oVar = oVarArr[i28];
            listArr[i28] = oVar != null ? AbstractC37401r1.E(oVar) : AbstractC37401r1.C();
        }
        AbstractC37401r1.a aVar2 = new AbstractC37401r1.a();
        for (int i29 = 0; i29 < aVar.f50028a; i29++) {
            Y[] yArr2 = aVar.f50030c;
            Y y14 = yArr2[i29];
            List list = listArr[i29];
            int i32 = 0;
            while (i32 < y14.f49708b) {
                Q qA3 = y14.a(i32);
                int i33 = yArr2[i29].a(i32).f47439b;
                int[] iArr11 = new int[i33];
                int i34 = 0;
                int i35 = 0;
                while (true) {
                    iArr = aVar.f50032e;
                    if (i34 >= i33) {
                        break;
                    }
                    if ((iArr[i29][i32][i34] & 7) == 4) {
                        iArr11[i35] = i34;
                        i35++;
                    }
                    i34++;
                }
                int[] iArrCopyOf = Arrays.copyOf(iArr11, i35);
                int iMin = 16;
                String str = null;
                List[] listArr2 = listArr;
                int i36 = 0;
                boolean z17 = false;
                int i37 = 0;
                while (i36 < iArrCopyOf.length) {
                    Y y15 = y14;
                    String str2 = yArr2[i29].a(i32).f47442e[iArrCopyOf[i36]].f47757m;
                    int i38 = i37 + 1;
                    if (i37 == 0) {
                        str = str2;
                    } else {
                        z17 |= !M.a(str, str2);
                    }
                    iMin = Math.min(iMin, iArr[i29][i32][i36] & 24);
                    i36++;
                    i37 = i38;
                    y14 = y15;
                }
                Y y16 = y14;
                if (z17) {
                    iMin = Math.min(iMin, aVar.f50031d[i29]);
                }
                boolean z18 = iMin != 0;
                int i39 = qA3.f47439b;
                int[] iArr12 = new int[i39];
                boolean[] zArr = new boolean[i39];
                for (int i42 = 0; i42 < qA3.f47439b; i42++) {
                    iArr12[i42] = iArr[i29][i32][i42] & 7;
                    int i43 = 0;
                    while (true) {
                        if (i43 >= list.size()) {
                            z12 = false;
                            break;
                        }
                        o oVar2 = (o) list.get(i43);
                        if (oVar2.i().equals(qA3) && oVar2.h(i42) != -1) {
                            z12 = true;
                            break;
                        }
                        i43++;
                    }
                    zArr[i42] = z12;
                }
                aVar2.g(new V.a(qA3, z18, iArr12, zArr));
                i32++;
                y14 = y16;
                listArr = listArr2;
            }
        }
        int i44 = 0;
        while (true) {
            Y y17 = aVar.f50033f;
            if (i44 >= y17.f49708b) {
                return new s((e0[]) pairI.first, (k[]) pairI.second, new V(aVar2.i()), aVar);
            }
            Q qA4 = y17.a(i44);
            int[] iArr13 = new int[qA4.f47439b];
            Arrays.fill(iArr13, 0);
            aVar2.g(new V.a(qA4, false, iArr13, new boolean[qA4.f47439b]));
            i44++;
        }
    }

    public abstract Pair<e0[], k[]> i(a aVar, int[][][] iArr, int[] iArr2, A.b bVar, P p12);

    @Override // androidx.media3.exoplayer.trackselection.r
    public final void d(@j.P a aVar) {
    }
}
