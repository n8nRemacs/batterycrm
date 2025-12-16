package X80;

import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.position_in_search.stats.screen.old_position_in_search.domain.model.PeriodSortDirection;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: PeriodInfoState.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LX80/i;", "", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class i {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f18706a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f18707b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final PeriodSortDirection f18708c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final DeepLink f18709d;

    public i(@Y61.k String str, @Y61.k String str2, @Y61.k PeriodSortDirection periodSortDirection, @Y61.k DeepLink deepLink) {
        this.f18706a = str;
        this.f18707b = str2;
        this.f18708c = periodSortDirection;
        this.f18709d = deepLink;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return L.f(this.f18706a, iVar.f18706a) && L.f(this.f18707b, iVar.f18707b) && this.f18708c == iVar.f18708c && L.f(this.f18709d, iVar.f18709d);
    }

    public final int hashCode() {
        return this.f18709d.hashCode() + ((this.f18708c.hashCode() + H.d(this.f18706a.hashCode() * 31, 31, this.f18707b)) * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PeriodInfoSortingControl(title=");
        sb2.append(this.f18706a);
        sb2.append(", slug=");
        sb2.append(this.f18707b);
        sb2.append(", sortDirection=");
        sb2.append(this.f18708c);
        sb2.append(", deepLink=");
        return com.avito.android.actions_sheet.a.v(sb2, this.f18709d, ')');
    }
}
