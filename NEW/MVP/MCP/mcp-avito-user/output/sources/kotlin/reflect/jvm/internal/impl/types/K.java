package kotlin.reflect.jvm.internal.impl.types;

import kotlin.NoWhenBranchMatchedException;

/* compiled from: flexibleTypes.kt */
@kotlin.jvm.internal.s0
/* loaded from: classes8.dex */
public final class K {
    @Y61.k
    public static final Y a(@Y61.k O o12) {
        J0 j0K0 = o12.K0();
        if (j0K0 instanceof H) {
            return ((H) j0K0).f410024c;
        }
        if (j0K0 instanceof Y) {
            return (Y) j0K0;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Y61.k
    public static final Y b(@Y61.k O o12) {
        J0 j0K0 = o12.K0();
        if (j0K0 instanceof H) {
            return ((H) j0K0).f410025d;
        }
        if (j0K0 instanceof Y) {
            return (Y) j0K0;
        }
        throw new NoWhenBranchMatchedException();
    }
}
