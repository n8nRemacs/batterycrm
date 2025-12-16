package com.avito.android.advert_stats.detail.tab.items.chart;

import TV0.g;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.R;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: StatsPeriodItemBlueprint.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert_stats/detail/tab/items/chart/l;", "LTV0/b;", "Lcom/avito/android/advert_stats/detail/tab/items/chart/b;", "Lcom/avito/android/advert_stats/detail/tab/items/chart/StatsPeriodItem;", "_avito_advert-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class l implements TV0.b<b, StatsPeriodItem> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final m f86325a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.konveyor.adapter.a f86326b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.konveyor.a f86327c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final g.a<c> f86328d = new g.a<>(R.layout.week_item, new a());

    /* compiled from: StatsPeriodItemBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/advert_stats/detail/tab/items/chart/c;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/advert_stats/detail/tab/items/chart/c;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.p<ViewGroup, View, c> {
        public a() {
            super(2);
        }

        @Override // Y41.p
        public final c invoke(ViewGroup viewGroup, View view) {
            l lVar = l.this;
            return new c(view, lVar.f86327c, lVar.f86326b);
        }
    }

    public l(@Y61.k m mVar, @Y61.k com.avito.konveyor.adapter.a aVar, @Y61.k com.avito.konveyor.a aVar2) {
        this.f86325a = mVar;
        this.f86326b = aVar;
        this.f86327c = aVar2;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f86325a;
    }

    @Override // TV0.b
    @Y61.k
    public final g.a<c> b() {
        return this.f86328d;
    }

    @Override // TV0.b
    @Y61.k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@Y61.k TV0.a aVar) {
        return aVar instanceof StatsPeriodItem;
    }
}
