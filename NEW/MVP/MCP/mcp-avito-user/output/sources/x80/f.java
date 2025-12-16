package X80;

import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import com.avito.android.position_in_search.stats.screen.old_position_in_search.domain.model.PositionInfoPeriod;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: PeriodInfoState.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LX80/f;", "", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class f {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f18699a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f18700b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final PositionInfoPeriod.b f18701c;

    public f(@Y61.k String str, boolean z12, @Y61.k PositionInfoPeriod.b bVar) {
        this.f18699a = str;
        this.f18700b = z12;
        this.f18701c = bVar;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return L.f(this.f18699a, fVar.f18699a) && this.f18700b == fVar.f18700b && L.f(this.f18701c, fVar.f18701c);
    }

    public final int hashCode() {
        return this.f18701c.hashCode() + r.i(this.f18699a.hashCode() * 31, 31, this.f18700b);
    }

    @Y61.k
    public final String toString() {
        return "PeriodInfoPositionBlock(blockId=" + this.f18699a + ", isLoading=" + this.f18700b + ", data=" + this.f18701c + ')';
    }
}
