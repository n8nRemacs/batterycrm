package kotlinx.coroutines;

import kotlin.Metadata;

/* compiled from: CompletionState.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlinx/coroutines/F;", "", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class F {
    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof F)) {
            return false;
        }
        ((F) obj).getClass();
        return kotlin.jvm.internal.L.f(null, null) && kotlin.jvm.internal.L.f(null, null);
    }

    public final int hashCode() {
        Object obj = null;
        obj.getClass();
        throw null;
    }

    @Y61.k
    public final String toString() {
        return androidx.appcompat.app.r.o(null, ", onCancellation=null)", new StringBuilder("CompletedWithCancellation(result="));
    }
}
