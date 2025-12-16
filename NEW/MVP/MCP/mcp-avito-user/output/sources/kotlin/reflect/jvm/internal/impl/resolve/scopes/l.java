package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: MemberScope.kt */
@s0
/* loaded from: classes8.dex */
public final class l {
    @Y61.l
    public static final HashSet a(@Y61.k Iterable iterable) {
        HashSet hashSet = new HashSet();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            Set<kotlin.reflect.jvm.internal.impl.name.f> setC = ((j) it.next()).c();
            if (setC == null) {
                return null;
            }
            C42745f0.h(setC, hashSet);
        }
        return hashSet;
    }
}
