package Hw;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.developments_agency_search.analytics.SearchFiltersSource;
import com.avito.android.developments_agency_search.analytics.SearchType;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: LocationGroupAnalyticsEvents.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LHw/f;", "", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class f {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final SearchType f7836a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f7837b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f7838c;

    /* renamed from: d, reason: collision with root package name */
    public final int f7839d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final SearchFiltersSource f7840e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final String f7841f;

    public f(@k SearchType searchType, @k String str, boolean z12, int i12, @k SearchFiltersSource searchFiltersSource, @k String str2) {
        this.f7836a = searchType;
        this.f7837b = str;
        this.f7838c = z12;
        this.f7839d = i12;
        this.f7840e = searchFiltersSource;
        this.f7841f = str2;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f7836a == fVar.f7836a && L.f(this.f7837b, fVar.f7837b) && this.f7838c == fVar.f7838c && this.f7839d == fVar.f7839d && this.f7840e == fVar.f7840e && L.f(this.f7841f, fVar.f7841f);
    }

    public final int hashCode() {
        return this.f7841f.hashCode() + ((this.f7840e.hashCode() + r.e(this.f7839d, r.i(H.d(this.f7836a.hashCode() * 31, 31, this.f7837b), 31, this.f7838c), 31)) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("LocationGroupsAnalyticsData(searchType=");
        sb2.append(this.f7836a);
        sb2.append(", sortType=");
        sb2.append(this.f7837b);
        sb2.append(", isHiddenCommission=");
        sb2.append(this.f7838c);
        sb2.append(", searchPageNumber=");
        sb2.append(this.f7839d);
        sb2.append(", filtersSource=");
        sb2.append(this.f7840e);
        sb2.append(", fromPage=");
        return C22026a.c(sb2, this.f7841f, ')');
    }
}
