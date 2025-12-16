package ru.cyberity.input.tools;

import Y61.k;
import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Z;

/* compiled from: ResultExtensions.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a.\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00010\u0001H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0004"}, d2 = {"V", "Lkotlin/Z;", "a", "(Ljava/lang/Object;)Ljava/lang/Object;", "cyberity-mobile-sdk-internal-core_release"}, k = 2, mv = {1, 7, 1})
/* loaded from: classes9.dex */
public final class b {
    @k
    public static final <V> Object a(@k Object obj) {
        int i12 = Z.f406624c;
        boolean z12 = obj instanceof Z.b;
        if (!z12) {
            C42729a0.b(obj);
            return ((Z) obj).f406625b;
        }
        if (z12) {
            return new Z.b(Z.b(obj));
        }
        throw new NoWhenBranchMatchedException();
    }
}
