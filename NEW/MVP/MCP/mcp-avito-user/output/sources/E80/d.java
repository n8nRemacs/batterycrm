package e80;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import com.avito.android.analytics.screens.mvi.q;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: PhotoItemGroupSelectionState.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Le80/d;", "Lcom/avito/android/analytics/screens/mvi/q;", "a", "_avito_photo-list-view-group-selection_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class d extends q {

    /* renamed from: c, reason: collision with root package name */
    @k
    public static final a f394988c = new a(null);

    /* renamed from: d, reason: collision with root package name */
    @k
    public static final d f394989d = new d(C42784z0.f406748b);

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Object f394990b;

    /* compiled from: PhotoItemGroupSelectionState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Le80/d$a;", "", "<init>", "()V", "_avito_photo-list-view-group-selection_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public d(@k List<? extends com.avito.conveyor_item.a> list) {
        this.f394990b = list;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && L.f(this.f394990b, ((d) obj).f394990b);
    }

    public final int hashCode() {
        return this.f394990b.hashCode();
    }

    @k
    public final String toString() {
        return H.n(new StringBuilder("PhotoItemGroupSelectionViewState(items="), this.f394990b, ')');
    }
}
