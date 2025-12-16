package w51;

import Y61.k;
import Y61.l;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.s0;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.j;
import kotlin.reflect.jvm.internal.impl.utils.f;

/* compiled from: scopeUtils.kt */
@s0
/* renamed from: w51.a, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49448a {
    /* JADX WARN: Multi-variable type inference failed */
    @l
    public static final <T> Collection<T> a(@l Collection<? extends T> collection, @k Collection<? extends T> collection2) {
        if (collection2.isEmpty()) {
            return collection;
        }
        if (collection == 0) {
            return collection2;
        }
        if (collection instanceof LinkedHashSet) {
            ((LinkedHashSet) collection).addAll(collection2);
            return collection;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(collection);
        linkedHashSet.addAll(collection2);
        return linkedHashSet;
    }

    @k
    public static final f b(@k ArrayList arrayList) {
        f fVar = new f();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            j jVar = (j) next;
            if (jVar != null && jVar != j.c.f409687b) {
                fVar.add(next);
            }
        }
        return fVar;
    }
}
