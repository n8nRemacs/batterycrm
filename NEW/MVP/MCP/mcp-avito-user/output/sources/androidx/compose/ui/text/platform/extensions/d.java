package androidx.compose.ui.text.platform.extensions;

import Y41.r;
import Y61.k;
import Y61.l;
import android.graphics.Typeface;
import android.os.LocaleList;
import android.text.Spannable;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.LocaleSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.ScaleXSpan;
import androidx.compose.ui.graphics.J;
import androidx.compose.ui.graphics.V;
import androidx.compose.ui.graphics.d1;
import androidx.compose.ui.graphics.f1;
import androidx.compose.ui.graphics.k1;
import androidx.compose.ui.text.C22602e;
import androidx.compose.ui.text.C22662l;
import androidx.compose.ui.text.X;
import androidx.compose.ui.text.font.C22605a0;
import androidx.compose.ui.text.font.E;
import androidx.compose.ui.text.font.Z;
import androidx.compose.ui.text.font.e0;
import androidx.compose.ui.text.style.j;
import androidx.compose.ui.text.style.m;
import androidx.compose.ui.text.style.n;
import androidx.compose.ui.text.x0;
import androidx.compose.ui.unit.A;
import androidx.compose.ui.unit.y;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import x0.C49711a;

/* compiled from: SpannableExtensions.android.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui-text_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class d {
    public static final float a(long j12, float f12, androidx.compose.ui.unit.d dVar) {
        y.f42874b.getClass();
        if (y.b(j12, y.f42876d)) {
            return f12;
        }
        long jC2 = y.c(j12);
        A.a aVar = A.f42832b;
        aVar.getClass();
        if (A.b(jC2, A.f42833c)) {
            return dVar.A0(j12);
        }
        aVar.getClass();
        if (A.b(jC2, A.f42834d)) {
            return y.d(j12) * f12;
        }
        return Float.NaN;
    }

    public static final float b(long j12, float f12, androidx.compose.ui.unit.d dVar) {
        float fD2;
        long jC2 = y.c(j12);
        A.f42832b.getClass();
        if (A.b(jC2, A.f42833c)) {
            if (dVar.getF40390d() <= 1.05d) {
                return dVar.A0(j12);
            }
            fD2 = y.d(j12) / y.d(dVar.o(f12));
        } else {
            if (!A.b(jC2, A.f42834d)) {
                return Float.NaN;
            }
            fD2 = y.d(j12);
        }
        return fD2 * f12;
    }

    public static final void c(@k Spannable spannable, long j12, int i12, int i13) {
        if (j12 != 16) {
            f(spannable, new ForegroundColorSpan(V.j(j12)), i12, i13);
        }
    }

    public static final void d(@k Spannable spannable, long j12, @k androidx.compose.ui.unit.d dVar, int i12, int i13) {
        long jC2 = y.c(j12);
        A.a aVar = A.f42832b;
        aVar.getClass();
        if (A.b(jC2, A.f42833c)) {
            f(spannable, new AbsoluteSizeSpan(kotlin.math.b.b(dVar.A0(j12)), false), i12, i13);
            return;
        }
        aVar.getClass();
        if (A.b(jC2, A.f42834d)) {
            f(spannable, new RelativeSizeSpan(y.d(j12)), i12, i13);
        }
    }

    public static final void e(@k Spannable spannable, @l z0.f fVar, int i12, int i13) {
        if (fVar != null) {
            a.f42551a.getClass();
            ArrayList arrayList = new ArrayList(C42745f0.q(fVar, 10));
            Iterator<z0.e> it = fVar.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().f443675a);
            }
            Locale[] localeArr = (Locale[]) arrayList.toArray(new Locale[0]);
            f(spannable, new LocaleSpan(new LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length))), i12, i13);
        }
    }

    public static final void f(@k Spannable spannable, @k Object obj, int i12, int i13) {
        spannable.setSpan(obj, i12, i13, 33);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void g(@k Spannable spannable, @k x0 x0Var, @k List<? extends C22602e.C1684e<? extends C22602e.a>> list, @k androidx.compose.ui.unit.d dVar, @k r<? super E, ? super e0, ? super Z, ? super C22605a0, ? extends Typeface> rVar) {
        ArrayList arrayList;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        ArrayList arrayList2 = new ArrayList(list.size());
        List<? extends C22602e.C1684e<? extends C22602e.a>> list2 = list;
        int size = list2.size();
        int i18 = 0;
        for (int i19 = 0; i19 < size; i19++) {
            C22602e.C1684e<? extends C22602e.a> c1684e = list.get(i19);
            T t12 = c1684e.f42138a;
            if (t12 instanceof androidx.compose.ui.text.e0) {
                androidx.compose.ui.text.e0 e0Var = (androidx.compose.ui.text.e0) t12;
                if (e0Var.fontFamily != null || e0Var.fontStyle != null || e0Var.fontWeight != null || ((androidx.compose.ui.text.e0) t12).fontSynthesis != null) {
                    arrayList2.add(c1684e);
                }
            }
        }
        androidx.compose.ui.text.e0 e0Var2 = x0Var.f42739a;
        E e12 = e0Var2.fontFamily;
        androidx.compose.ui.text.e0 e0Var3 = ((e12 != null || e0Var2.fontStyle != null || e0Var2.fontWeight != null) || e0Var2.fontSynthesis != null) ? new androidx.compose.ui.text.e0(0L, 0L, e0Var2.fontWeight, e0Var2.fontStyle, e0Var2.fontSynthesis, e12, (String) null, 0L, (androidx.compose.ui.text.style.a) null, (n) null, (z0.f) null, 0L, (j) null, (f1) null, (X) null, (androidx.compose.ui.graphics.drawscope.j) null, 65475, (C42822w) null) : null;
        c cVar = new c(spannable, rVar);
        if (arrayList2.size() > 1) {
            int size2 = arrayList2.size();
            int i22 = size2 * 2;
            int[] iArr = new int[i22];
            int size3 = arrayList2.size();
            for (int i23 = 0; i23 < size3; i23++) {
                C22602e.C1684e c1684e2 = (C22602e.C1684e) arrayList2.get(i23);
                iArr[i23] = c1684e2.f42139b;
                iArr[i23 + size2] = c1684e2.f42140c;
            }
            if (i22 > 1) {
                Arrays.sort(iArr);
            }
            if (i22 == 0) {
                throw new NoSuchElementException("Array is empty.");
            }
            int i24 = iArr[0];
            int i25 = 0;
            while (i25 < i22) {
                int i26 = iArr[i25];
                if (i26 == i24) {
                    arrayList = arrayList2;
                } else {
                    int size4 = arrayList2.size();
                    androidx.compose.ui.text.e0 e0Var4 = e0Var3;
                    int i27 = i18;
                    while (i27 < size4) {
                        C22602e.C1684e c1684e3 = (C22602e.C1684e) arrayList2.get(i27);
                        int i28 = c1684e3.f42139b;
                        ArrayList arrayList3 = arrayList2;
                        int i29 = c1684e3.f42140c;
                        if (i28 != i29 && C22662l.c(i24, i26, i28, i29)) {
                            androidx.compose.ui.text.e0 e0VarD = (androidx.compose.ui.text.e0) c1684e3.f42138a;
                            if (e0Var4 != null) {
                                e0VarD = e0Var4.d(e0VarD);
                            }
                            e0Var4 = e0VarD;
                        }
                        i27++;
                        arrayList2 = arrayList3;
                    }
                    arrayList = arrayList2;
                    if (e0Var4 != null) {
                        cVar.invoke(e0Var4, Integer.valueOf(i24), Integer.valueOf(i26));
                    }
                    i24 = i26;
                }
                i25++;
                arrayList2 = arrayList;
                i18 = 0;
            }
        } else if (!arrayList2.isEmpty()) {
            androidx.compose.ui.text.e0 e0VarD2 = (androidx.compose.ui.text.e0) ((C22602e.C1684e) arrayList2.get(0)).f42138a;
            if (e0Var3 != null) {
                e0VarD2 = e0Var3.d(e0VarD2);
            }
            cVar.invoke(e0VarD2, Integer.valueOf(((C22602e.C1684e) arrayList2.get(0)).f42139b), Integer.valueOf(((C22602e.C1684e) arrayList2.get(0)).f42140c));
        }
        int size5 = list2.size();
        boolean z12 = false;
        for (int i32 = 0; i32 < size5; i32++) {
            C22602e.C1684e<? extends C22602e.a> c1684e4 = list.get(i32);
            if ((c1684e4.f42138a instanceof androidx.compose.ui.text.e0) && (i14 = c1684e4.f42139b) >= 0 && i14 < spannable.length() && (i15 = c1684e4.f42140c) > i14 && i15 <= spannable.length()) {
                androidx.compose.ui.text.e0 e0Var5 = (androidx.compose.ui.text.e0) c1684e4.f42138a;
                androidx.compose.ui.text.style.a aVar = e0Var5.baselineShift;
                if (aVar != null) {
                    spannable.setSpan(new C49711a(aVar.f42630a), i14, i15, 33);
                }
                m mVar = e0Var5.f42142a;
                c(spannable, mVar.getF42633b(), i14, i15);
                J jC2 = mVar.c();
                float f42632c = mVar.getF42632c();
                if (jC2 != null) {
                    if (jC2 instanceof k1) {
                        c(spannable, ((k1) jC2).f39547b, i14, i15);
                    } else {
                        spannable.setSpan(new androidx.compose.ui.text.platform.style.e((d1) jC2, f42632c), i14, i15, 33);
                    }
                }
                j jVar = e0Var5.background;
                if (jVar != null) {
                    j.f42684b.getClass();
                    spannable.setSpan(new x0.n(jVar.a(j.f42686d), jVar.a(j.f42687e)), i14, i15, 33);
                }
                d(spannable, e0Var5.fontSize, dVar, i14, i15);
                String str = e0Var5.fontFeatureSettings;
                if (str != null) {
                    spannable.setSpan(new x0.b(str), i14, i15, 33);
                }
                n nVar = e0Var5.textGeometricTransform;
                if (nVar != null) {
                    spannable.setSpan(new ScaleXSpan(nVar.f42704a), i14, i15, 33);
                    spannable.setSpan(new x0.m(nVar.f42705b), i14, i15, 33);
                }
                e(spannable, e0Var5.localeList, i14, i15);
                long j12 = e0Var5.f42153l;
                if (j12 != 16) {
                    f(spannable, new BackgroundColorSpan(V.j(j12)), i14, i15);
                }
                f1 f1Var = e0Var5.shadow;
                if (f1Var != null) {
                    int iJ2 = V.j(f1Var.f39510a);
                    long j13 = f1Var.f39511b;
                    float fIntBitsToFloat = Float.intBitsToFloat((int) (j13 >> 32));
                    float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j13 & 4294967295L));
                    float f12 = f1Var.f39512c;
                    if (f12 == 0.0f) {
                        f12 = Float.MIN_VALUE;
                    }
                    x0.l lVar = new x0.l(fIntBitsToFloat, fIntBitsToFloat2, f12, iJ2);
                    i17 = i14;
                    i16 = 33;
                    spannable.setSpan(lVar, i17, i15, 33);
                } else {
                    i16 = 33;
                    i17 = i14;
                }
                androidx.compose.ui.graphics.drawscope.j jVar2 = e0Var5.drawStyle;
                if (jVar2 != null) {
                    spannable.setSpan(new androidx.compose.ui.text.platform.style.c(jVar2), i17, i15, i16);
                }
                long jC3 = y.c(e0Var5.letterSpacing);
                A.f42832b.getClass();
                if (A.b(jC3, A.f42833c) || A.b(y.c(e0Var5.letterSpacing), A.f42834d)) {
                    z12 = true;
                }
            }
        }
        if (z12) {
            int size6 = list2.size();
            for (int i33 = 0; i33 < size6; i33++) {
                C22602e.C1684e<? extends C22602e.a> c1684e5 = list.get(i33);
                C22602e.a aVar2 = (C22602e.a) c1684e5.f42138a;
                if ((aVar2 instanceof androidx.compose.ui.text.e0) && (i12 = c1684e5.f42139b) >= 0 && i12 < spannable.length() && (i13 = c1684e5.f42140c) > i12 && i13 <= spannable.length()) {
                    long j14 = ((androidx.compose.ui.text.e0) aVar2).letterSpacing;
                    long jC4 = y.c(j14);
                    A.f42832b.getClass();
                    Object fVar = A.b(jC4, A.f42833c) ? new x0.f(dVar.A0(j14)) : A.b(jC4, A.f42834d) ? new x0.e(y.d(j14)) : null;
                    if (fVar != null) {
                        spannable.setSpan(fVar, i12, i13, 33);
                    }
                }
            }
        }
    }
}
