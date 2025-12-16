package TV;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: SearchSubscriptionEvent.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"LTV/e;", "", "<init>", "()V", "a", "b", "LTV/e$a;", "LTV/e$b;", "_avito-discouraged_avito-libs_saved-searches"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public abstract class e {

    /* compiled from: SearchSubscriptionEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LTV/e$a;", "LTV/e;", "_avito-discouraged_avito-libs_saved-searches"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a extends e {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f15684a;

        public a(@k String str) {
            super(null);
            this.f15684a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && L.f(this.f15684a, ((a) obj).f15684a);
        }

        public final int hashCode() {
            return this.f15684a.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("SubscriptionCreated(filterId="), this.f15684a, ')');
        }
    }

    /* compiled from: SearchSubscriptionEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LTV/e$b;", "LTV/e;", "_avito-discouraged_avito-libs_saved-searches"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b extends e {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final String f15685a;

        public b(@l String str) {
            super(null);
            this.f15685a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && L.f(this.f15685a, ((b) obj).f15685a);
        }

        public final int hashCode() {
            String str = this.f15685a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("SubscriptionRemoved(filterId="), this.f15685a, ')');
        }
    }

    public /* synthetic */ e(C42822w c42822w) {
        this();
    }

    public e() {
    }
}
