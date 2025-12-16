package wf0;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.screens.mvi.q;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: SleepingPlacesState.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lwf0/d;", "Lcom/avito/android/analytics/screens/mvi/q;", "a", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class d extends q {

    /* renamed from: d, reason: collision with root package name */
    @k
    public static final a f441732d = new a(null);

    /* renamed from: e, reason: collision with root package name */
    @k
    public static final d f441733e = new d(C42784z0.f406748b, false);

    /* renamed from: b, reason: collision with root package name */
    @k
    public final List<com.avito.conveyor_item.a> f441734b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f441735c;

    /* compiled from: SleepingPlacesState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lwf0/d$a;", "", "<init>", "()V", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public d(@k List<? extends com.avito.conveyor_item.a> list, boolean z12) {
        this.f441734b = list;
        this.f441735c = z12;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return L.f(this.f441734b, dVar.f441734b) && this.f441735c == dVar.f441735c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f441735c) + (this.f441734b.hashCode() * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SleepingPlacesViewState(items=");
        sb2.append(this.f441734b);
        sb2.append(", chooseButtonEnabled=");
        return r.x(sb2, this.f441735c, ')');
    }
}
