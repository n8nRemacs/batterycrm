package androidx.compose.foundation.lazy.layout;

import androidx.collection.C20247y0;
import androidx.compose.foundation.lazy.layout.N0;
import androidx.compose.ui.unit.q;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;

/* compiled from: LazyLayoutStickyItems.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class r0 {
    @Y61.k
    public static final List a(@Y61.l N0.a.C1593a c1593a, @Y61.k ArrayList arrayList, @Y61.k androidx.collection.F f12, int i12, int i13, int i14, int i15, @Y61.k Y41.l lVar) {
        C20247y0 c20247y0;
        int i16;
        long j12;
        int i17;
        Object obj;
        int i18;
        long j13;
        int i19;
        int i22 = 1;
        if (c1593a == null || arrayList.isEmpty() || f12.f25545b == 0) {
            return C42784z0.f406748b;
        }
        int f29645a = ((T) C42745f0.E(arrayList)).getF29645a();
        int i23 = -1;
        int i24 = 0;
        if (((T) C42745f0.Q(arrayList)).getF29645a() - f29645a < 0 || (i19 = f12.f25545b) == 0) {
            c20247y0 = androidx.collection.G.f25546a;
        } else {
            kotlin.ranges.l lVarR = kotlin.ranges.s.r(0, i19);
            int i25 = lVarR.f406905b;
            int i26 = lVarR.f406906c;
            int iA2 = -1;
            if (i25 <= i26) {
                while (f12.a(i25) <= f29645a) {
                    iA2 = f12.a(i25);
                    if (i25 == i26) {
                        break;
                    }
                    i25++;
                }
            }
            if (iA2 == -1) {
                c20247y0 = androidx.collection.G.f25546a;
            } else {
                C20247y0 c20247y02 = androidx.collection.G.f25546a;
                c20247y0 = new C20247y0(1, null);
                c20247y0.d(iA2);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        int i27 = 0;
        while (i27 < size) {
            Object obj2 = arrayList.get(i27);
            int f29645a2 = ((T) obj2).getF29645a();
            int[] iArr = f12.f25544a;
            int i28 = f12.f25545b;
            int i29 = i24;
            while (true) {
                if (i29 >= i28) {
                    break;
                }
                if (iArr[i29] == f29645a2) {
                    arrayList3.add(obj2);
                    break;
                }
                i29++;
            }
            i27++;
            i24 = 0;
        }
        int[] iArr2 = c20247y0.f25544a;
        int i32 = c20247y0.f25545b;
        int i33 = 0;
        while (i33 < i32) {
            int i34 = iArr2[i33];
            Iterator it = arrayList.iterator();
            int i35 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i35 = i23;
                    break;
                }
                if (((T) it.next()).getF29645a() == i34) {
                    break;
                }
                i35 += i22;
            }
            T t12 = i35 == i23 ? (T) lVar.invoke(Integer.valueOf(i34)) : (T) arrayList.remove(i35);
            int f29658n = t12.getF29658n();
            if (i35 == i23) {
                i16 = i32;
                i17 = BeduinInputModel.MIN_TEXT_VERSION;
            } else {
                long jO2 = t12.o(0);
                if (t12.getF29648d()) {
                    q.a aVar = androidx.compose.ui.unit.q.f42862b;
                    i16 = i32;
                    j12 = jO2 & 4294967295L;
                } else {
                    i16 = i32;
                    q.a aVar2 = androidx.compose.ui.unit.q.f42862b;
                    j12 = jO2 >> 32;
                }
                i17 = (int) j12;
            }
            int size2 = arrayList3.size();
            int i36 = 0;
            while (true) {
                if (i36 >= size2) {
                    obj = null;
                    break;
                }
                obj = arrayList3.get(i36);
                if (((T) obj).getF29645a() != i34) {
                    break;
                }
                i36++;
            }
            T t13 = (T) obj;
            if (t13 != null) {
                long jO3 = t13.o(0);
                if (t13.getF29648d()) {
                    q.a aVar3 = androidx.compose.ui.unit.q.f42862b;
                    j13 = jO3 & 4294967295L;
                } else {
                    q.a aVar4 = androidx.compose.ui.unit.q.f42862b;
                    j13 = jO3 >> 32;
                }
                i18 = (int) j13;
            } else {
                i18 = BeduinInputModel.MIN_TEXT_VERSION;
            }
            int iMax = i17 == Integer.MIN_VALUE ? -i12 : Math.max(-i12, i17);
            if (i18 != Integer.MIN_VALUE) {
                iMax = Math.min(iMax, i18 - f29658n);
            }
            t12.k();
            t12.c(iMax, 0, i14, i15);
            arrayList2.add(t12);
            i22 = 1;
            i33++;
            i32 = i16;
            i23 = -1;
        }
        return arrayList2;
    }
}
