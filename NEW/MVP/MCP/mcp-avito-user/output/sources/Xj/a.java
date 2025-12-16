package XJ;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import com.google.gson.annotations.c;
import kotlin.Metadata;

/* compiled from: GetMissedCallCounterRequest.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LXJ/a;", "", "a", "_avito_iac-calls-history_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface a {

    /* compiled from: GetMissedCallCounterRequest.kt */
    @P
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"LXJ/a$a;", "", "", "counter", "<init>", "(I)V", "I", "a", "()I", "_avito_iac-calls-history_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: XJ.a$a, reason: collision with other inner class name */
    public static final /* data */ class C1328a {

        @c("counter")
        private final int counter;

        public C1328a(int i12) {
            this.counter = i12;
        }

        /* renamed from: a, reason: from getter */
        public final int getCounter() {
            return this.counter;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C1328a) && this.counter == ((C1328a) obj).counter;
        }

        public final int hashCode() {
            return Integer.hashCode(this.counter);
        }

        @k
        public final String toString() {
            return r.t(new StringBuilder("Result(counter="), this.counter, ')');
        }
    }
}
