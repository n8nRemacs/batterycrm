package oE0;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import com.avito.android.util.C35755b0;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;

/* compiled from: ShowTicketEvent.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LoE0/b;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_ticket-view_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: oE0.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final /* data */ class C44632b implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    public final long f419634b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f419635c;

    public C44632b(long j12) {
        this.f419634b = j12;
        this.f419635c = new ParametrizedClickStreamEvent(11118, 1, C35755b0.c(P0.g(new Q("from_page", "main"), new Q("reward_platform_entry_point_ticket_count", String.valueOf(j12)))), null, 8, null);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C44632b) && this.f419634b == ((C44632b) obj).f419634b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF327516b() {
        return this.f419635c.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @k
    public final Map<String, Object> getParams() {
        return this.f419635c.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF327517c() {
        return this.f419635c.f90248c;
    }

    public final int hashCode() {
        return Long.hashCode(this.f419634b);
    }

    @k
    public final String toString() {
        return r.u(new StringBuilder("ShowTicketEvent(tickets="), this.f419634b, ')');
    }
}
