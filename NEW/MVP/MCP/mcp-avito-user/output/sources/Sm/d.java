package SM;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import com.avito.android.analytics.screens.mvi.q;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ImportantAddressesSelectionState.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LSM/d;", "Lcom/avito/android/analytics/screens/mvi/q;", "a", "_avito_important-addresses-selection_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class d extends q {

    /* renamed from: c, reason: collision with root package name */
    @k
    public static final a f14932c = new a(null);

    /* renamed from: d, reason: collision with root package name */
    @k
    public static final d f14933d = new d(C42784z0.f406748b);

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Object f14934b;

    /* compiled from: ImportantAddressesSelectionState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LSM/d$a;", "", "<init>", "()V", "_avito_important-addresses-selection_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public d(@k List<? extends com.avito.conveyor_item.a> list) {
        this.f14934b = list;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && L.f(this.f14934b, ((d) obj).f14934b);
    }

    public final int hashCode() {
        return this.f14934b.hashCode();
    }

    @k
    public final String toString() {
        return H.n(new StringBuilder("ImportantAddressesSelectionViewState(items="), this.f14934b, ')');
    }
}
