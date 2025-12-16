package T0;

import androidx.annotation.RestrictTo;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: Cbor.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"LT0/e;", "", "<init>", "()V", "a", "b", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@RestrictTo
/* loaded from: classes.dex */
public final class e {

    /* compiled from: Cbor.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LT0/e$a;", "", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class a {
        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            ((a) obj).getClass();
            return true;
        }

        public final int hashCode() {
            return Integer.hashCode(0) + (Long.hashCode(0L) * 31);
        }

        @Y61.k
        public final String toString() {
            return "Arg(arg=0, len=0)";
        }
    }

    /* compiled from: Cbor.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LT0/e$b;", "", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class b {
        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            ((b) obj).getClass();
            return L.f(null, null);
        }

        public final int hashCode() {
            throw null;
        }

        @Y61.k
        public final String toString() {
            return "Item(item=null, len=0)";
        }
    }
}
