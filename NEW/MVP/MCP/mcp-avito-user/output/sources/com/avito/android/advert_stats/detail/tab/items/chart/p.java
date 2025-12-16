package com.avito.android.advert_stats.detail.tab.items.chart;

import TV0.g;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.R;
import com.avito.android.advert_stats.detail.di.C28304e;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: StatsPlotBlueprint.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert_stats/detail/tab/items/chart/p;", "LTV0/b;", "Lcom/avito/android/advert_stats/detail/tab/items/chart/z;", "Lcom/avito/android/advert_stats/detail/tab/items/chart/StatsPlotItem;", "_avito_advert-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class p implements TV0.b<z, StatsPlotItem> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final u f86330a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.konveyor.a f86331b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.konveyor.adapter.a f86332c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final g.a<A> f86333d;

    /* compiled from: StatsPlotBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/advert_stats/detail/tab/items/chart/A;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/advert_stats/detail/tab/items/chart/A;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.p<ViewGroup, View, A> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ r f86335m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(r rVar) {
            super(2);
            this.f86335m = rVar;
        }

        @Override // Y41.p
        public final A invoke(ViewGroup viewGroup, View view) {
            p pVar = p.this;
            return new A(view, pVar.f86331b, pVar.f86332c, this.f86335m);
        }
    }

    @Inject
    public p(@Y61.k u uVar, @C28304e.a @Y61.k com.avito.konveyor.a aVar, @C28304e.b @Y61.k com.avito.konveyor.adapter.a aVar2, @Y61.k r rVar) {
        this.f86330a = uVar;
        this.f86331b = aVar;
        this.f86332c = aVar2;
        this.f86333d = new g.a<>(R.layout.advert_charts_item, new a(rVar));
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f86330a;
    }

    @Override // TV0.b
    @Y61.k
    public final g.a<A> b() {
        return this.f86333d;
    }

    @Override // TV0.b
    @Y61.k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@Y61.k TV0.a aVar) {
        return aVar instanceof StatsPlotItem;
    }
}
