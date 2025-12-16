package Ts;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import com.avito.android.analytics.screens.mvi.q;
import com.avito.android.crm_candidates.view.list_items.inline_filters.JobCrmInlineFilterItem;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: JobCrmInlineFiltersState.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LTs/c;", "Lcom/avito/android/analytics/screens/mvi/q;", "_avito_job_crm-candidates_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class c extends q {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final List<JobCrmInlineFilterItem> f15962b;

    public c() {
        this(null, 1, null);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && L.f(this.f15962b, ((c) obj).f15962b);
    }

    public final int hashCode() {
        return this.f15962b.hashCode();
    }

    @k
    public final String toString() {
        return H.p(new StringBuilder("JobCrmInlineFiltersState(filtersList="), this.f15962b, ')');
    }

    public c(@k List<JobCrmInlineFilterItem> list) {
        this.f15962b = list;
    }

    public c(List list, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? C42784z0.f406748b : list);
    }
}
