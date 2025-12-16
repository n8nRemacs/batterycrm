package com.avito.android.position_in_search.stats.screen.old_position_in_search.view.items.competitors;

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

/* compiled from: CompetitorsItemBlueprint.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/view/items/competitors/c;", "LTV0/b;", "Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/view/items/competitors/g;", "Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/view/items/competitors/b;", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class c implements TV0.b<g, b> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final e f220966a = new e();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final g.a<g> f220967b;

    /* compiled from: CompetitorsItemBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/view/items/competitors/g;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/view/items/competitors/g;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements p<ViewGroup, View, g> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.util.text.a f220968l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(com.avito.android.util.text.a aVar) {
            super(2);
            this.f220968l = aVar;
        }

        @Override // Y41.p
        public final g invoke(ViewGroup viewGroup, View view) {
            return new g(view, this.f220968l);
        }
    }

    @Inject
    public c(@k com.avito.android.util.text.a aVar) {
        this.f220967b = new g.a<>(R.layout.position_in_search_stats_item_competitors, new a(aVar));
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f220966a;
    }

    @Override // TV0.b
    @k
    public final g.a<g> b() {
        return this.f220967b;
    }

    @Override // TV0.b
    @k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@k TV0.a aVar) {
        return aVar instanceof b;
    }
}
