package Hi;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import androidx.compose.runtime.F3;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: BeduinV2PageComposeState.kt */
@F3
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LHi/d;", "", "a", "_design-modules_beduin-v2-page_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class d {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final a f7616b = new a(null);

    /* renamed from: c, reason: collision with root package name */
    @k
    public static final d f7617c = new d(C42784z0.f406748b);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final List<e> f7618a;

    /* compiled from: BeduinV2PageComposeState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LHi/d$a;", "", "<init>", "()V", "_design-modules_beduin-v2-page_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public d(@k List<? extends e> list) {
        this.f7618a = list;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && L.f(this.f7618a, ((d) obj).f7618a);
    }

    public final int hashCode() {
        return this.f7618a.hashCode();
    }

    @k
    public final String toString() {
        return H.p(new StringBuilder("BeduinV2PageComposeState(detachedComponents="), this.f7618a, ')');
    }
}
