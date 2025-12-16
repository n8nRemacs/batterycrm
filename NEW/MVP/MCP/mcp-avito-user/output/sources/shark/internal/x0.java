package shark.internal;

import kotlin.Metadata;

/* compiled from: ObjectDominators.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lshark/internal/x0;", "", "<init>", "()V", "a", "shark"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class x0 {

    /* compiled from: ObjectDominators.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lshark/internal/x0$a;", "", "shark"}, k = 1, mv = {1, 4, 1})
    public static final /* data */ class a {
        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            ((a) obj).getClass();
            return kotlin.jvm.internal.L.f(null, null);
        }

        public final int hashCode() {
            return 0;
        }

        @Y61.k
        public final String toString() {
            return "DominatorNode(shallowSize=0, retainedSize=0, retainedCount=0, dominatedObjectIds=null)";
        }
    }
}
