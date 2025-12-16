package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.lazy.layout.C20712c0;
import androidx.compose.foundation.lazy.layout.C20725j;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.collections.C42784z0;

/* compiled from: LazyLayoutBeyondBoundsState.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.foundation.lazy.layout.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C20733n {
    @Y61.k
    public static final List<Integer> a(@Y61.k F f12, @Y61.k C20712c0 c20712c0, @Y61.k C20725j c20725j) {
        kotlin.ranges.l lVar;
        if (c20725j.f29438a.f38262d == 0 && c20712c0.f29399b.isEmpty()) {
            return C42784z0.f406748b;
        }
        ArrayList arrayList = new ArrayList();
        androidx.compose.runtime.collection.e<C20725j.a> eVar = c20725j.f29438a;
        if (eVar.f38262d != 0) {
            int i12 = eVar.f38262d;
            if (i12 == 0) {
                throw new NoSuchElementException("MutableVector is empty.");
            }
            C20725j.a[] aVarArr = eVar.f38260b;
            int i13 = aVarArr[0].f29439a;
            for (int i14 = 0; i14 < i12; i14++) {
                int i15 = aVarArr[i14].f29439a;
                if (i15 < i13) {
                    i13 = i15;
                }
            }
            if (i13 < 0) {
                androidx.compose.foundation.internal.e.a("negative minIndex");
            }
            int i16 = eVar.f38262d;
            if (i16 == 0) {
                throw new NoSuchElementException("MutableVector is empty.");
            }
            C20725j.a[] aVarArr2 = eVar.f38260b;
            int i17 = aVarArr2[0].f29440b;
            for (int i18 = 0; i18 < i16; i18++) {
                int i19 = aVarArr2[i18].f29440b;
                if (i19 > i17) {
                    i17 = i19;
                }
            }
            lVar = new kotlin.ranges.l(i13, Math.min(i17, f12.P() - 1), 1);
        } else {
            kotlin.ranges.l.f406912f.getClass();
            lVar = kotlin.ranges.l.f406913g;
        }
        int size = c20712c0.f29399b.size();
        for (int i22 = 0; i22 < size; i22++) {
            C20712c0.a aVar = (C20712c0.a) c20712c0.get(i22);
            int iA2 = G.a(aVar.getF29372c(), f12, aVar.getF29370a());
            int i23 = lVar.f406905b;
            if ((iA2 > lVar.f406906c || i23 > iA2) && iA2 >= 0 && iA2 < f12.P()) {
                arrayList.add(Integer.valueOf(iA2));
            }
        }
        int i24 = lVar.f406905b;
        int i25 = lVar.f406906c;
        if (i24 <= i25) {
            while (true) {
                arrayList.add(Integer.valueOf(i24));
                if (i24 == i25) {
                    break;
                }
                i24++;
            }
        }
        return arrayList;
    }
}
