package androidx.compose.foundation.lazy.layout;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;

/* compiled from: LazyLayoutMeasuredItem.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class U {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final androidx.camera.core.impl.r0 f29364a = new androidx.camera.core.impl.r0(1);

    @Y61.k
    public static final List a(int i12, int i13, @Y61.k ArrayList arrayList, @Y61.k List list) {
        if (arrayList.isEmpty()) {
            return C42784z0.f406748b;
        }
        ArrayList arrayList2 = new ArrayList(list);
        int size = arrayList.size();
        for (int i14 = 0; i14 < size; i14++) {
            T t12 = (T) arrayList.get(i14);
            int f29645a = t12.getF29645a();
            if (i12 <= f29645a && f29645a <= i13) {
                arrayList2.add(t12);
            }
        }
        C42745f0.z0(arrayList2, f29364a);
        return arrayList2;
    }
}
