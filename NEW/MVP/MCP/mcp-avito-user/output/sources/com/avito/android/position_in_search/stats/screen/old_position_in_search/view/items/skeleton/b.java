package com.avito.android.position_in_search.stats.screen.old_position_in_search.view.items.skeleton;

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
import kotlin.reflect.n;

/* compiled from: SkeletonItemBlueprint.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/view/items/skeleton/b;", "LTV0/b;", "Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/view/items/skeleton/e;", "Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/view/items/skeleton/a;", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class b implements TV0.b<e, com.avito.android.position_in_search.stats.screen.old_position_in_search.view.items.skeleton.a> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final KO.a f221151a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final d f221152b = new d();

    /* renamed from: c, reason: collision with root package name */
    @k
    public final g.a<com.avito.konveyor.adapter.b> f221153c = new g.a<>(R.layout.position_in_search_stats_item_skeleton, new a());

    /* compiled from: SkeletonItemBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/view/items/skeleton/e;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/view/items/skeleton/e;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements p<ViewGroup, View, e> {
        public a() {
            super(2);
        }

        @Override // Y41.p
        public final e invoke(ViewGroup viewGroup, View view) {
            KO.a aVar = b.this.f221151a;
            n<Object> nVar = KO.a.f9442h[3];
            return new e(view, ((Boolean) aVar.f9446e.a().invoke()).booleanValue());
        }
    }

    @Inject
    public b(@k KO.a aVar) {
        this.f221151a = aVar;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f221152b;
    }

    @Override // TV0.b
    @k
    public final g.a<com.avito.konveyor.adapter.b> b() {
        return this.f221153c;
    }

    @Override // TV0.b
    @k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@k TV0.a aVar) {
        return aVar instanceof com.avito.android.position_in_search.stats.screen.old_position_in_search.view.items.skeleton.a;
    }
}
