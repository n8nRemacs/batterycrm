package OE;

import Y61.k;
import Y61.l;
import com.avito.android.analytics.screens.mvi.q;
import com.avito.android.forceupdate.domain.dto.UpdateSource;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ForceUpdateRootState.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LOE/c;", "Lcom/avito/android/analytics/screens/mvi/q;", "a", "_avito_force-update_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class c extends q {

    /* renamed from: c, reason: collision with root package name */
    @k
    public static final a f12095c = new a(null);

    /* renamed from: d, reason: collision with root package name */
    @k
    public static final c f12096d = new c(UpdateSource.Official.f158466b);

    /* renamed from: b, reason: collision with root package name */
    @k
    public final UpdateSource f12097b;

    /* compiled from: ForceUpdateRootState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LOE/c$a;", "", "<init>", "()V", "_avito_force-update_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public c(@k UpdateSource updateSource) {
        this.f12097b = updateSource;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && L.f(this.f12097b, ((c) obj).f12097b);
    }

    public final int hashCode() {
        return this.f12097b.hashCode();
    }

    @k
    public final String toString() {
        return "ForceUpdateRootState(updateSource=" + this.f12097b + ')';
    }
}
