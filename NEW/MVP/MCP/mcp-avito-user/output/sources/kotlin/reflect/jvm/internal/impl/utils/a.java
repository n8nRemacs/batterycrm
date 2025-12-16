package kotlin.reflect.jvm.internal.impl.utils;

import Y61.k;
import Y61.l;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.s0;

/* compiled from: collections.kt */
@s0
/* loaded from: classes8.dex */
public final class a {
    public static final void a(@k AbstractCollection abstractCollection, @l Object obj) {
        if (obj != null) {
            abstractCollection.add(obj);
        }
    }

    @k
    public static final <T> List<T> b(@k ArrayList<T> arrayList) {
        int size = arrayList.size();
        if (size == 0) {
            return C42784z0.f406748b;
        }
        if (size == 1) {
            return Collections.singletonList(C42745f0.E(arrayList));
        }
        arrayList.trimToSize();
        return arrayList;
    }
}
