package W80;

import W80.d;
import Y61.k;
import Y61.l;
import com.avito.android.position_in_search.stats.screen.old_position_in_search.domain.model.PositionInfoBanner;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: PositionInfoState.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_position-in-search_stats_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class i {
    @l
    public static final PositionInfoBanner a(@k h hVar, @k String str) {
        PositionInfoBanner positionInfoBanner;
        d.a aVarB = b(hVar.f17799e);
        if (aVarB == null || (positionInfoBanner = aVarB.f17780b) == null || !L.f(positionInfoBanner.f220414a, str)) {
            return null;
        }
        return positionInfoBanner;
    }

    @l
    public static final d.a b(@k d dVar) {
        if (dVar instanceof d.a) {
            return (d.a) dVar;
        }
        return null;
    }
}
