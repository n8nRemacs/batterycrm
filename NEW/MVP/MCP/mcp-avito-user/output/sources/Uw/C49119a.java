package uw;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.developments_agency_search.analytics.SearchType;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: BigFiltersAnalyticsEvents.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Luw/a;", "", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: uw.a, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final /* data */ class C49119a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final SearchType f440326a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f440327b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f440328c;

    /* renamed from: d, reason: collision with root package name */
    public final int f440329d;

    public C49119a(@k SearchType searchType, @k String str, boolean z12, int i12) {
        this.f440326a = searchType;
        this.f440327b = str;
        this.f440328c = z12;
        this.f440329d = i12;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C49119a)) {
            return false;
        }
        C49119a c49119a = (C49119a) obj;
        return this.f440326a == c49119a.f440326a && L.f(this.f440327b, c49119a.f440327b) && this.f440328c == c49119a.f440328c && this.f440329d == c49119a.f440329d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f440329d) + r.i(H.d(this.f440326a.hashCode() * 31, 31, this.f440327b), 31, this.f440328c);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BigFiltersAnalyticsData(searchType=");
        sb2.append(this.f440326a);
        sb2.append(", sortType=");
        sb2.append(this.f440327b);
        sb2.append(", isHiddenCommission=");
        sb2.append(this.f440328c);
        sb2.append(", searchPageNumber=");
        return r.t(sb2, this.f440329d, ')');
    }
}
