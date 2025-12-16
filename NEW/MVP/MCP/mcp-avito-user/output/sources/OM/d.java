package Om;

import Pm.C14807b;
import Pm.C14809d;
import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.P0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: CartBundlesState.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LOm/d;", "", "a", "_avito_cart-bundles_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class d {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Map<C14809d, C14807b> f12508a;

    /* compiled from: CartBundlesState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LOm/d$a;", "", "<init>", "()V", "_avito_cart-bundles_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        new a(null);
        new d(0 == true ? 1 : 0, 1, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public d() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && L.f(this.f12508a, ((d) obj).f12508a);
    }

    public final int hashCode() {
        return this.f12508a.hashCode();
    }

    @k
    public final String toString() {
        return r.w(new StringBuilder("CartBundlesState(bundleInfo="), this.f12508a, ')');
    }

    public d(@k Map<C14809d, C14807b> map) {
        this.f12508a = map;
    }

    public /* synthetic */ d(Map map, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? P0.c() : map);
    }
}
