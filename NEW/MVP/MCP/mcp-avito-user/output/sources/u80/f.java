package u80;

import Y61.k;
import Y61.l;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: Dimension.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito-discouraged_avito-libs_photo-camera-common"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class f {
    @l
    public static final c a(@k ArrayList arrayList, @k c cVar, int i12) {
        float fB2 = b(cVar);
        Object next = null;
        if (fB2 == 0.0f || fB2 == Float.POSITIVE_INFINITY) {
            return null;
        }
        c cVar2 = new c(cVar.f439809a / i12, cVar.f439810b / i12);
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            c cVar3 = (c) obj;
            if (cVar3.f439810b >= cVar2.f439810b && cVar3.f439809a >= cVar2.f439809a) {
                arrayList2.add(obj);
            }
        }
        Iterator it = C42745f0.B0(arrayList2, new d()).iterator();
        if (it.hasNext()) {
            next = it.next();
            if (it.hasNext()) {
                float fAbs = Math.abs(b((c) next) - b(cVar));
                do {
                    Object next2 = it.next();
                    float fAbs2 = Math.abs(b((c) next2) - b(cVar));
                    if (Float.compare(fAbs, fAbs2) > 0) {
                        next = next2;
                        fAbs = fAbs2;
                    }
                } while (it.hasNext());
            }
        }
        return (c) next;
    }

    public static final float b(@k c cVar) {
        int i12 = cVar.f439809a;
        if (i12 != 0) {
            return cVar.f439810b / i12;
        }
        return Float.POSITIVE_INFINITY;
    }

    @k
    public static final c c(@k c cVar, float f12) {
        float fB2 = b(cVar) / f12;
        return new c((int) (cVar.f439809a * Math.max(1.0f, fB2)), (int) (cVar.f439810b * Math.max(1.0f, 1.0f / fB2)));
    }

    @k
    public static final c d(int i12, @k c cVar) {
        return (i12 == 90 || i12 == 270) ? new c(cVar.f439810b, cVar.f439809a) : cVar;
    }
}
