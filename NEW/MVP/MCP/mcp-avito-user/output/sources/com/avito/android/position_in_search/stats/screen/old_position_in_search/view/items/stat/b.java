package com.avito.android.position_in_search.stats.screen.old_position_in_search.view.items.stat;

import TV0.g;
import Y41.p;
import Y61.k;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: StatDescriptionItemBlueprint.kt */
@P
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/view/items/stat/b;", "LTV0/b;", "Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/view/items/stat/e;", "Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/view/items/stat/a;", "<init>", "()V", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class b implements TV0.b<e, com.avito.android.position_in_search.stats.screen.old_position_in_search.view.items.stat.a> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final d f221191a = new d();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final g.a<com.avito.konveyor.adapter.b> f221192b = new g.a<>(R.layout.position_in_search_stats_item_stat_desc, a.f221193l);

    /* compiled from: StatDescriptionItemBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/view/items/stat/e;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/view/items/stat/e;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements p<ViewGroup, View, e> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f221193l = new a();

        public a() {
            super(2);
        }

        @Override // Y41.p
        public final e invoke(ViewGroup viewGroup, View view) {
            return new e(view);
        }
    }

    @Inject
    public b() {
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f221191a;
    }

    @Override // TV0.b
    @k
    public final g.a<com.avito.konveyor.adapter.b> b() {
        return this.f221192b;
    }

    @Override // TV0.b
    @k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@k TV0.a aVar) {
        return aVar instanceof com.avito.android.position_in_search.stats.screen.old_position_in_search.view.items.stat.a;
    }
}
