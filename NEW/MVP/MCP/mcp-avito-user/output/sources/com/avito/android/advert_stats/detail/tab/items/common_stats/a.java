package com.avito.android.advert_stats.detail.tab.items.common_stats;

import TV0.g;
import Y41.p;
import Y61.k;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.R;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: CommonStatsBlueprint.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert_stats/detail/tab/items/common_stats/a;", "LTV0/b;", "Lcom/avito/android/advert_stats/detail/tab/items/common_stats/f;", "Lcom/avito/android/advert_stats/detail/tab/items/common_stats/CommonStatsItem;", "_avito_advert-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class a implements TV0.b<f, CommonStatsItem> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final c f86362a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.util.text.a f86363b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final g.a<h> f86364c = new g.a<>(R.layout.advert_stats_common_link, new C2574a());

    /* compiled from: CommonStatsBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/advert_stats/detail/tab/items/common_stats/h;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/advert_stats/detail/tab/items/common_stats/h;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.advert_stats.detail.tab.items.common_stats.a$a, reason: collision with other inner class name */
    public static final class C2574a extends N implements p<ViewGroup, View, h> {
        public C2574a() {
            super(2);
        }

        @Override // Y41.p
        public final h invoke(ViewGroup viewGroup, View view) {
            return new h(view, a.this.f86363b);
        }
    }

    @Inject
    public a(@k c cVar, @k com.avito.android.util.text.a aVar) {
        this.f86362a = cVar;
        this.f86363b = aVar;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f86362a;
    }

    @Override // TV0.b
    @k
    public final g.a<h> b() {
        return this.f86364c;
    }

    @Override // TV0.b
    @k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@k TV0.a aVar) {
        return aVar instanceof CommonStatsItem;
    }
}
