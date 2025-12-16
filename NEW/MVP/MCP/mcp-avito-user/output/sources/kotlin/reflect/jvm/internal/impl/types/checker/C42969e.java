package kotlin.reflect.jvm.internal.impl.types.checker;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;
import kotlin.reflect.jvm.internal.impl.types.H;
import kotlin.reflect.jvm.internal.impl.types.J0;
import kotlin.reflect.jvm.internal.impl.types.K;
import kotlin.reflect.jvm.internal.impl.types.P;
import kotlin.reflect.jvm.internal.impl.types.Q;
import kotlin.reflect.jvm.internal.impl.types.Y;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;

/* compiled from: IntersectionType.kt */
@s0
/* renamed from: kotlin.reflect.jvm.internal.impl.types.checker.e, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42969e {
    @Y61.k
    public static final J0 a(@Y61.k ArrayList arrayList) {
        Y y12;
        int size = arrayList.size();
        if (size == 0) {
            throw new IllegalStateException("Expected some types");
        }
        if (size == 1) {
            return (J0) C42745f0.u0(arrayList);
        }
        ArrayList arrayList2 = new ArrayList(C42745f0.q(arrayList, 10));
        Iterator it = arrayList.iterator();
        boolean z12 = false;
        boolean z13 = false;
        while (it.hasNext()) {
            J0 j02 = (J0) it.next();
            z12 = z12 || Q.a(j02);
            if (j02 instanceof Y) {
                y12 = (Y) j02;
            } else {
                if (!(j02 instanceof H)) {
                    throw new NoWhenBranchMatchedException();
                }
                j02.getClass();
                if (j02 instanceof kotlin.reflect.jvm.internal.impl.types.C) {
                    return j02;
                }
                y12 = ((H) j02).f410024c;
                z13 = true;
            }
            arrayList2.add(y12);
        }
        if (z12) {
            return kotlin.reflect.jvm.internal.impl.types.error.h.b(ErrorTypeKind.f410173y, arrayList.toString());
        }
        if (!z13) {
            return A.f410087a.b(arrayList2);
        }
        ArrayList arrayList3 = new ArrayList(C42745f0.q(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList3.add(K.b((J0) it2.next()));
        }
        A a12 = A.f410087a;
        return P.c(a12.b(arrayList2), a12.b(arrayList3));
    }
}
