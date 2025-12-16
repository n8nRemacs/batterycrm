package W80;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.position_in_search.stats.screen.old_position_in_search.domain.model.PositionInfoButton;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: PositionInfoState.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LW80/c;", "", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class c {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f17777a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final PositionInfoButton f17778b;

    public c(@k String str, @k PositionInfoButton positionInfoButton) {
        this.f17777a = str;
        this.f17778b = positionInfoButton;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return L.f(this.f17777a, cVar.f17777a) && L.f(this.f17778b, cVar.f17778b);
    }

    public final int hashCode() {
        return this.f17778b.hashCode() + (this.f17777a.hashCode() * 31);
    }

    @k
    public final String toString() {
        return "PositionInfoButtonBlock(buttonId=" + this.f17777a + ", button=" + this.f17778b + ')';
    }
}
