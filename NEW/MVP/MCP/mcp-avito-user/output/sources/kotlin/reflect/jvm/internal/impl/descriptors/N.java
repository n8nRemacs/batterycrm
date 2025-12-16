package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.ArrayList;

/* compiled from: PackageFragmentProvider.kt */
/* loaded from: classes8.dex */
public final class N {
    public static final void a(@Y61.k L l12, @Y61.k kotlin.reflect.jvm.internal.impl.name.c cVar, @Y61.k ArrayList arrayList) {
        if (l12 instanceof O) {
            ((O) l12).c(cVar, arrayList);
        } else {
            arrayList.addAll(l12.a(cVar));
        }
    }

    public static final boolean b(@Y61.k L l12, @Y61.k kotlin.reflect.jvm.internal.impl.name.c cVar) {
        if (l12 instanceof O) {
            return ((O) l12).b(cVar);
        }
        ArrayList arrayList = new ArrayList();
        a(l12, cVar, arrayList);
        return arrayList.isEmpty();
    }
}
