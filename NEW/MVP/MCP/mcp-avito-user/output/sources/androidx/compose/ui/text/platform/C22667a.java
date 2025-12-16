package androidx.compose.ui.text.platform;

import android.graphics.Typeface;
import android.os.Build;
import android.text.SpannableString;
import android.text.style.BackgroundColorSpan;
import android.text.style.ScaleXSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TtsSpan;
import android.text.style.TypefaceSpan;
import android.text.style.URLSpan;
import android.text.style.UnderlineSpan;
import androidx.annotation.RestrictTo;
import androidx.compose.ui.graphics.V;
import androidx.compose.ui.text.A0;
import androidx.compose.ui.text.B0;
import androidx.compose.ui.text.C;
import androidx.compose.ui.text.C22602e;
import androidx.compose.ui.text.C22662l;
import androidx.compose.ui.text.InterfaceC22677y;
import androidx.compose.ui.text.e0;
import androidx.compose.ui.text.font.C22605a0;
import androidx.compose.ui.text.font.C22617k;
import androidx.compose.ui.text.font.E;
import androidx.compose.ui.text.font.Z;
import androidx.compose.ui.text.font.i0;
import androidx.compose.ui.text.z0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.s0;

/* compiled from: AndroidAccessibilitySpannableString.android.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui-text_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.ui.text.platform.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C22667a {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [kotlin.collections.z0] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.util.ArrayList] */
    @InterfaceC22677y
    @Y61.k
    @RestrictTo
    public static final SpannableString a(@Y61.k C22602e c22602e, @Y61.k androidx.compose.ui.unit.d dVar, @Y61.k E.b bVar, @Y61.k C c12) {
        Collection arrayList;
        int i12;
        C42784z0 c42784z0;
        int i13;
        int i14;
        int i15;
        String str = c22602e.f42127c;
        SpannableString spannableString = new SpannableString(str);
        ArrayList arrayList2 = c22602e.f42128d;
        if (arrayList2 != null) {
            int size = arrayList2.size();
            for (int i16 = 0; i16 < size; i16++) {
                C22602e.C1684e c1684e = (C22602e.C1684e) arrayList2.get(i16);
                e0 e0VarA = e0.a((e0) c1684e.f42138a, null, 65503);
                long f42633b = e0VarA.f42142a.getF42633b();
                int i17 = c1684e.f42139b;
                int i18 = c1684e.f42140c;
                androidx.compose.ui.text.platform.extensions.d.c(spannableString, f42633b, i17, i18);
                androidx.compose.ui.text.platform.extensions.d.d(spannableString, e0VarA.fontSize, dVar, i17, i18);
                Z z12 = e0VarA.fontStyle;
                androidx.compose.ui.text.font.e0 e0Var = e0VarA.fontWeight;
                if (e0Var == null && z12 == null) {
                    i14 = i18;
                } else {
                    if (e0Var == null) {
                        androidx.compose.ui.text.font.e0.f42240c.getClass();
                        e0Var = androidx.compose.ui.text.font.e0.f42247j;
                    }
                    if (z12 != null) {
                        i13 = z12.f42219a;
                    } else {
                        Z.f42217b.getClass();
                        i13 = 0;
                    }
                    StyleSpan styleSpan = new StyleSpan(C22617k.a(e0Var, i13));
                    i14 = i18;
                    spannableString.setSpan(styleSpan, i17, i14, 33);
                }
                E e12 = e0VarA.fontFamily;
                if (e12 != null) {
                    if (e12 instanceof i0) {
                        spannableString.setSpan(new TypefaceSpan(((i0) e12).f42265h), i17, i14, 33);
                    } else if (Build.VERSION.SDK_INT >= 28) {
                        C22605a0 c22605a0 = e0VarA.fontSynthesis;
                        if (c22605a0 != null) {
                            i15 = c22605a0.f42227a;
                        } else {
                            C22605a0.f42223b.getClass();
                            i15 = C22605a0.f42226e;
                        }
                        Typeface typeface = (Typeface) E.b.b(bVar, e12, null, 0, i15, 6).getF42167b();
                        r.f42583a.getClass();
                        spannableString.setSpan(r.a(typeface), i17, i14, 33);
                    }
                }
                androidx.compose.ui.text.style.j jVar = e0VarA.background;
                if (jVar != null) {
                    androidx.compose.ui.text.style.j.f42684b.getClass();
                    if (jVar.a(androidx.compose.ui.text.style.j.f42686d)) {
                        spannableString.setSpan(new UnderlineSpan(), i17, i14, 33);
                    }
                    if (jVar.a(androidx.compose.ui.text.style.j.f42687e)) {
                        spannableString.setSpan(new StrikethroughSpan(), i17, i14, 33);
                    }
                }
                androidx.compose.ui.text.style.n nVar = e0VarA.textGeometricTransform;
                if (nVar != null) {
                    spannableString.setSpan(new ScaleXSpan(nVar.f42704a), i17, i14, 33);
                }
                androidx.compose.ui.text.platform.extensions.d.e(spannableString, e0VarA.localeList, i17, i14);
                long j12 = e0VarA.f42153l;
                if (j12 != 16) {
                    androidx.compose.ui.text.platform.extensions.d.f(spannableString, new BackgroundColorSpan(V.j(j12)), i17, i14);
                }
            }
        }
        int length = str.length();
        List<C22602e.C1684e<? extends C22602e.a>> list = c22602e.f42126b;
        if (list != null) {
            arrayList = new ArrayList(list.size());
            int size2 = list.size();
            for (int i19 = 0; i19 < size2; i19++) {
                C22602e.C1684e<? extends C22602e.a> c1684e2 = list.get(i19);
                C22602e.C1684e<? extends C22602e.a> c1684e3 = c1684e2;
                if ((c1684e3.f42138a instanceof z0) && C22662l.c(0, length, c1684e3.f42139b, c1684e3.f42140c)) {
                    arrayList.add(c1684e2);
                }
            }
        } else {
            arrayList = C42784z0.f406748b;
        }
        int size3 = arrayList.size();
        for (int i22 = 0; i22 < size3; i22++) {
            C22602e.C1684e c1684e4 = (C22602e.C1684e) arrayList.get(i22);
            z0 z0Var = (z0) c1684e4.f42138a;
            if (!(z0Var instanceof B0)) {
                throw new NoWhenBranchMatchedException();
            }
            spannableString.setSpan(new TtsSpan.VerbatimBuilder(((B0) z0Var).f41902a).build(), c1684e4.f42139b, c1684e4.f42140c, 33);
        }
        int length2 = str.length();
        if (list != null) {
            ?? arrayList3 = new ArrayList(list.size());
            int size4 = list.size();
            for (int i23 = 0; i23 < size4; i23++) {
                C22602e.C1684e<? extends C22602e.a> c1684e5 = list.get(i23);
                C22602e.C1684e<? extends C22602e.a> c1684e6 = c1684e5;
                if ((c1684e6.f42138a instanceof A0) && C22662l.c(0, length2, c1684e6.f42139b, c1684e6.f42140c)) {
                    arrayList3.add(c1684e5);
                }
            }
            i12 = 0;
            c42784z0 = arrayList3;
        } else {
            i12 = 0;
            c42784z0 = C42784z0.f406748b;
        }
        int size5 = c42784z0.size();
        for (int i24 = i12; i24 < size5; i24++) {
            C22602e.C1684e c1684e7 = (C22602e.C1684e) c42784z0.get(i24);
            A0 a02 = (A0) c1684e7.f42138a;
            WeakHashMap<A0, URLSpan> weakHashMap = c12.f42545a;
            URLSpan uRLSpan = weakHashMap.get(a02);
            if (uRLSpan == null) {
                uRLSpan = new URLSpan(a02.f41901a);
                weakHashMap.put(a02, uRLSpan);
            }
            spannableString.setSpan(uRLSpan, c1684e7.f42139b, c1684e7.f42140c, 33);
        }
        List listB = c22602e.b(str.length());
        int size6 = listB.size();
        while (i12 < size6) {
            C22602e.C1684e<androidx.compose.ui.text.C> c1684e8 = (C22602e.C1684e) listB.get(i12);
            int i25 = c1684e8.f42139b;
            int i26 = c1684e8.f42140c;
            if (i25 != i26) {
                androidx.compose.ui.text.C c13 = c1684e8.f42138a;
                androidx.compose.ui.text.C c14 = c13;
                if ((c14 instanceof C.b) && ((C.b) c14).f41908c == null) {
                    C.b bVar2 = (C.b) c13;
                    C22602e.C1684e<C.b> c1684e9 = new C22602e.C1684e<>(i25, i26, bVar2);
                    WeakHashMap<C22602e.C1684e<C.b>, URLSpan> weakHashMap2 = c12.f42546b;
                    URLSpan uRLSpan2 = weakHashMap2.get(c1684e9);
                    if (uRLSpan2 == null) {
                        uRLSpan2 = new URLSpan(bVar2.f41906a);
                        weakHashMap2.put(c1684e9, uRLSpan2);
                    }
                    spannableString.setSpan(uRLSpan2, i25, i26, 33);
                } else {
                    WeakHashMap<C22602e.C1684e<androidx.compose.ui.text.C>, s> weakHashMap3 = c12.f42547c;
                    s sVar = weakHashMap3.get(c1684e8);
                    if (sVar == null) {
                        sVar = new s(c14);
                        weakHashMap3.put(c1684e8, sVar);
                    }
                    spannableString.setSpan(sVar, i25, i26, 33);
                }
            }
            i12++;
        }
        return spannableString;
    }
}
