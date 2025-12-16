package com.avito.android.advert_stats.detail.tab.items.chart;

import TV0.g;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.R;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: StatsBarItemBlueprint.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert_stats/detail/tab/items/chart/e;", "LTV0/b;", "Lcom/avito/android/advert_stats/detail/tab/items/chart/h;", "Lcom/avito/android/advert_stats/detail/tab/items/chart/StatsBarItem;", "_avito_advert-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class e implements TV0.b<h, StatsBarItem> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final g f86300a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final g.a<j> f86301b = new g.a<>(R.layout.stats_bar_item, a.f86302l);

    /* compiled from: StatsBarItemBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/advert_stats/detail/tab/items/chart/j;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/advert_stats/detail/tab/items/chart/j;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.p<ViewGroup, View, j> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f86302l = new a();

        public a() {
            super(2);
        }

        @Override // Y41.p
        public final j invoke(ViewGroup viewGroup, View view) {
            return new j(view);
        }
    }

    public e(@Y61.k g gVar) {
        this.f86300a = gVar;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f86300a;
    }

    @Override // TV0.b
    @Y61.k
    public final g.a<j> b() {
        return this.f86301b;
    }

    @Override // TV0.b
    @Y61.k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@Y61.k TV0.a aVar) {
        return aVar instanceof StatsBarItem;
    }
}
