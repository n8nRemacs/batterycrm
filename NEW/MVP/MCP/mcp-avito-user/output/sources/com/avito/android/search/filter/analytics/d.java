package com.avito.android.search.filter.analytics;

import Bp0.C13174a;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.provider.clickstream.TreeClickStreamParent;
import com.avito.android.remote.model.SearchParams;
import com.avito.android.remote.model.SerpDisplayType;
import com.avito.android.search.filter.FilterAnalyticsData;
import com.avito.android.suggest_locations.OpenEventFromBlock;
import com.avito.android.util.InterfaceC35745a5;
import io.reactivex.rxjava3.core.z;
import io.reactivex.rxjava3.internal.operators.observable.C41948f0;
import io.reactivex.rxjava3.internal.operators.observable.C41986s0;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import kc.C42666a;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: FilterAnalyticsInteractor.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/search/filter/analytics/d;", "Lcom/avito/android/search/filter/analytics/c;", "_avito_search_filter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class d implements c {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f262637a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final SearchParams f262638b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.analytics.provider.e f262639c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final FilterAnalyticsData f262640d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f262641e;

    /* renamed from: f, reason: collision with root package name */
    public final long f262642f;

    /* compiled from: FilterAnalyticsInteractor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/search/filter/analytics/g;", "kotlin.jvm.PlatformType", "it", "Lkotlin/G0;", "accept", "(Lcom/avito/android/search/filter/analytics/g;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T> implements l41.g {
        public a() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            d.this.f262637a.c((g) obj);
        }
    }

    @Inject
    public d(@Y61.k InterfaceC28373a interfaceC28373a, @Y61.l SearchParams searchParams, @Y61.k com.avito.android.analytics.provider.e eVar, @Y61.l FilterAnalyticsData filterAnalyticsData, @Y61.k InterfaceC35745a5 interfaceC35745a5) {
        this.f262637a = interfaceC28373a;
        this.f262638b = searchParams;
        this.f262639c = eVar;
        this.f262640d = filterAnalyticsData;
        this.f262641e = interfaceC35745a5;
        this.f262642f = eVar.a();
    }

    @Override // com.avito.android.search.filter.analytics.c
    public final void a(@Y61.l String str) {
        this.f262637a.c(new j(str));
    }

    @Override // com.avito.android.search.filter.analytics.c
    public final void b(@Y61.l String str) {
        if (str != null) {
            this.f262637a.c(new k(str, null, 2, null));
        }
    }

    @Override // com.avito.android.search.filter.analytics.c
    public final int c() {
        FilterAnalyticsData filterAnalyticsData = this.f262640d;
        if ((filterAnalyticsData != null ? filterAnalyticsData.f261807c : null) == null) {
            OpenEventFromBlock[] openEventFromBlockArr = OpenEventFromBlock.f292117b;
            return 0;
        }
        OpenEventFromBlock[] openEventFromBlockArr2 = OpenEventFromBlock.f292117b;
        return 13;
    }

    @Override // com.avito.android.search.filter.analytics.c
    public final void d(@Y61.k Map<String, String> map) {
        C41948f0 c41948f0W = z.W(new VH0.c(map, 28));
        InterfaceC35745a5 interfaceC35745a5 = this.f262641e;
        new C41986s0(c41948f0W.x0(interfaceC35745a5.a()).j0(interfaceC35745a5.e()).K(new a())).r().u();
    }

    @Override // com.avito.android.search.filter.analytics.c
    public final void e() {
        this.f262637a.c(new Bp0.b());
    }

    @Override // com.avito.android.search.filter.analytics.c
    public final void f(boolean z12) {
        String str;
        long jA2 = this.f262639c.a();
        FilterAnalyticsData filterAnalyticsData = this.f262640d;
        if (filterAnalyticsData == null || (str = filterAnalyticsData.f261809e) == null) {
            str = "FILTERS";
        }
        this.f262637a.c(new com.avito.android.search.filter.analytics.a(jA2, new TreeClickStreamParent(this.f262642f, str, null, null), z12));
    }

    @Override // com.avito.android.search.filter.analytics.c
    @Y61.l
    public final String g() {
        FilterAnalyticsData filterAnalyticsData = this.f262640d;
        if (filterAnalyticsData != null) {
            return filterAnalyticsData.f261807c;
        }
        return null;
    }

    @Override // com.avito.android.search.filter.analytics.c
    public final void h(@Y61.k Map<String, ? extends Object> map) {
        this.f262637a.c(new C13174a(map));
    }

    @Override // com.avito.android.search.filter.analytics.c
    public final void i(@Y61.k String str, @Y61.l String str2, @Y61.l String str3) {
        this.f262637a.c(new l(str, str2, str3));
    }

    @Override // com.avito.android.search.filter.analytics.c
    public final void j(@Y61.l String str) {
        this.f262637a.c(new i(str));
    }

    @Override // com.avito.android.search.filter.analytics.c
    public final void k(@Y61.l String str, @Y61.k String str2, @Y61.k String str3, @Y61.k List<String> list, @Y61.k List<String> list2, @Y61.k String str4, @Y61.l String str5) {
        FilterAnalyticsData filterAnalyticsData = this.f262640d;
        this.f262637a.c(new h(str, str2, str3, list, list2, str4, str5, filterAnalyticsData != null ? filterAnalyticsData.f261807c : null, filterAnalyticsData != null ? filterAnalyticsData.f261809e : null));
    }

    @Override // com.avito.android.search.filter.analytics.c
    public final void l() {
        String str;
        FilterAnalyticsData.Source source;
        long jA2 = this.f262639c.a();
        FilterAnalyticsData filterAnalyticsData = this.f262640d;
        if (filterAnalyticsData == null || (str = filterAnalyticsData.f261809e) == null) {
            str = "FILTERS";
        }
        TreeClickStreamParent treeClickStreamParent = new TreeClickStreamParent(this.f262642f, str, null, null);
        SearchParams searchParams = this.f262638b;
        this.f262637a.c(new C42666a(jA2, treeClickStreamParent, searchParams != null ? searchParams.getLocationId() : null, searchParams != null ? searchParams.getCategoryId() : null, filterAnalyticsData != null ? filterAnalyticsData.f261808d : null, filterAnalyticsData != null ? filterAnalyticsData.f261807c : null, (filterAnalyticsData == null || (source = filterAnalyticsData.f261806b) == null) ? null : source.f261818b, searchParams != null ? searchParams.getShopId() : null, searchParams != null ? searchParams.getClarifyIconType() : null, filterAnalyticsData != null ? filterAnalyticsData.f261809e : null));
    }

    @Override // com.avito.android.search.filter.analytics.c
    public final void m(@Y61.k SerpDisplayType serpDisplayType, @Y61.l String str) {
        this.f262637a.c(new b(serpDisplayType, str));
    }
}
