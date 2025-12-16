package ww;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.screens.mvi.q;
import com.avito.android.remote.model.SearchParams;
import com.avito.android.remote.model.search.InlineFilterValue;
import com.avito.android.search.filter.ParametersTreeWithAdditionalImpl;
import com.avito.android.util.P2;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import ww.d;

/* compiled from: BigFiltersState.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lww/c;", "Lcom/avito/android/analytics/screens/mvi/q;", "a", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: ww.c, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final /* data */ class C49692c extends q {

    /* renamed from: i, reason: collision with root package name */
    @k
    public static final a f441874i = new a(null);

    /* renamed from: j, reason: collision with root package name */
    @k
    public static final C49692c f441875j = new C49692c(null, new SearchParams(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, 1, null), new ParametersTreeWithAdditionalImpl(C42784z0.f406748b, null), new InlineFilterValue.InlineFilterDeveloperDevelopmentValue(null, null, null), false, P2.c.f318721a, d.b.f441884a);

    /* renamed from: b, reason: collision with root package name */
    @l
    public final SearchParams f441876b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final SearchParams f441877c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final ParametersTreeWithAdditionalImpl f441878d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final InlineFilterValue.InlineFilterDeveloperDevelopmentValue f441879e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f441880f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final P2<Integer> f441881g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final d f441882h;

    /* compiled from: BigFiltersState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lww/c$a;", "", "<init>", "()V", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ww.c$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C49692c(@l SearchParams searchParams, @k SearchParams searchParams2, @k ParametersTreeWithAdditionalImpl parametersTreeWithAdditionalImpl, @k InlineFilterValue.InlineFilterDeveloperDevelopmentValue inlineFilterDeveloperDevelopmentValue, boolean z12, @k P2<? super Integer> p22, @k d dVar) {
        this.f441876b = searchParams;
        this.f441877c = searchParams2;
        this.f441878d = parametersTreeWithAdditionalImpl;
        this.f441879e = inlineFilterDeveloperDevelopmentValue;
        this.f441880f = z12;
        this.f441881g = p22;
        this.f441882h = dVar;
    }

    public static C49692c a(C49692c c49692c, SearchParams searchParams, SearchParams searchParams2, ParametersTreeWithAdditionalImpl parametersTreeWithAdditionalImpl, InlineFilterValue.InlineFilterDeveloperDevelopmentValue inlineFilterDeveloperDevelopmentValue, P2 p22, d dVar, int i12) {
        if ((i12 & 1) != 0) {
            searchParams = c49692c.f441876b;
        }
        SearchParams searchParams3 = searchParams;
        if ((i12 & 2) != 0) {
            searchParams2 = c49692c.f441877c;
        }
        SearchParams searchParams4 = searchParams2;
        if ((i12 & 4) != 0) {
            parametersTreeWithAdditionalImpl = c49692c.f441878d;
        }
        ParametersTreeWithAdditionalImpl parametersTreeWithAdditionalImpl2 = parametersTreeWithAdditionalImpl;
        if ((i12 & 8) != 0) {
            inlineFilterDeveloperDevelopmentValue = c49692c.f441879e;
        }
        InlineFilterValue.InlineFilterDeveloperDevelopmentValue inlineFilterDeveloperDevelopmentValue2 = inlineFilterDeveloperDevelopmentValue;
        boolean z12 = c49692c.f441880f;
        if ((i12 & 32) != 0) {
            p22 = c49692c.f441881g;
        }
        P2 p23 = p22;
        if ((i12 & 64) != 0) {
            dVar = c49692c.f441882h;
        }
        c49692c.getClass();
        return new C49692c(searchParams3, searchParams4, parametersTreeWithAdditionalImpl2, inlineFilterDeveloperDevelopmentValue2, z12, p23, dVar);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C49692c)) {
            return false;
        }
        C49692c c49692c = (C49692c) obj;
        return L.f(this.f441876b, c49692c.f441876b) && L.f(this.f441877c, c49692c.f441877c) && L.f(this.f441878d, c49692c.f441878d) && L.f(this.f441879e, c49692c.f441879e) && this.f441880f == c49692c.f441880f && L.f(this.f441881g, c49692c.f441881g) && L.f(this.f441882h, c49692c.f441882h);
    }

    public final int hashCode() {
        SearchParams searchParams = this.f441876b;
        return this.f441882h.hashCode() + ((this.f441881g.hashCode() + r.i((this.f441879e.hashCode() + ((this.f441878d.hashCode() + ((this.f441877c.hashCode() + ((searchParams == null ? 0 : searchParams.hashCode()) * 31)) * 31)) * 31)) * 31, 31, this.f441880f)) * 31);
    }

    @k
    public final String toString() {
        return "BigFiltersState(initSearchParams=" + this.f441876b + ", lastRequestSearchParams=" + this.f441877c + ", parametersTreeWithAdditional=" + this.f441878d + ", selectedDeveloperDevelopment=" + this.f441879e + ", screenShownAnalyticsEventWasSent=" + this.f441880f + ", searchResultCountLoading=" + this.f441881g + ", viewState=" + this.f441882h + ')';
    }
}
