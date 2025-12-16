package kotlin.reflect.full;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.C42745f0;
import kotlin.reflect.jvm.internal.T;
import kotlin.reflect.jvm.internal.X;
import kotlin.reflect.jvm.internal.impl.types.E0;
import kotlin.reflect.jvm.internal.impl.types.O;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.utils.b;
import kotlin.reflect.r;

/* loaded from: classes8.dex */
class f implements b.d {
    static {
        new f();
    }

    @Override // kotlin.reflect.jvm.internal.impl.utils.b.d
    public final Iterable a(Object obj) {
        r rVar = (r) obj;
        kotlin.reflect.g f406862b = rVar.getF406862b();
        kotlin.reflect.d dVar = f406862b instanceof kotlin.reflect.d ? (kotlin.reflect.d) f406862b : null;
        if (dVar == null) {
            throw new X("Supertype not a class: " + rVar);
        }
        List<r> listC = dVar.C();
        if (rVar.D().isEmpty()) {
            return listC;
        }
        E0 e0D = E0.d(((T) rVar).f407060b);
        List<r> list = listC;
        ArrayList arrayList = new ArrayList(C42745f0.q(list, 10));
        for (r rVar2 : list) {
            O oJ2 = e0D.j(((T) rVar2).f407060b, Variance.f410069d);
            if (oJ2 == null) {
                throw new X("Type substitution failed: " + rVar2 + " (" + rVar + ')');
            }
            arrayList.add(new T(oJ2, null, 2, null));
        }
        return arrayList;
    }
}
