package kotlin.reflect.jvm.internal.impl.types;

import kotlin.NoWhenBranchMatchedException;

/* compiled from: TypeWithEnhancement.kt */
@kotlin.jvm.internal.s0
/* loaded from: classes8.dex */
public final class I0 {
    /* JADX WARN: Multi-variable type inference failed */
    @Y61.l
    public static final O a(@Y61.k O o12) {
        if (o12 instanceof H0) {
            return ((H0) o12).L();
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Y61.k
    public static final J0 b(@Y61.k J0 j02, @Y61.l O o12) {
        if (j02 instanceof H0) {
            return b(((H0) j02).n0(), o12);
        }
        if (o12 == null || o12.equals(j02)) {
            return j02;
        }
        if (j02 instanceof Y) {
            return new C42962b0((Y) j02, o12);
        }
        if (j02 instanceof H) {
            return new J((H) j02, o12);
        }
        throw new NoWhenBranchMatchedException();
    }
}
