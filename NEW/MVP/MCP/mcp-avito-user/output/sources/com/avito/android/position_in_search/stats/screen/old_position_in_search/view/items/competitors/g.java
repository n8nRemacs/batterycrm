package com.avito.android.position_in_search.stats.screen.old_position_in_search.view.items.competitors;

import Y41.l;
import Y61.k;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import androidx.constraintlayout.widget.Group;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.lib.design.badge.Badge;
import com.avito.android.lib.design.skeleton.shimmer.ShimmerLayout;
import com.avito.android.util.y6;
import com.avito.konveyor.a;
import com.avito.konveyor.adapter.h;
import com.avito.konveyor.adapter.j;
import com.avito.konveyor.exception.BlueprintCollisionException;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: CompetitorsItemView.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/view/items/competitors/g;", "Lcom/avito/konveyor/adapter/b;", "LTV0/e;", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class g extends com.avito.konveyor.adapter.b implements TV0.e {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.util.text.a f220970b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final ShimmerLayout f220971c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final Group f220972d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final TextView f220973e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final TextView f220974f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final Badge f220975g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final RecyclerView f220976h;

    /* renamed from: i, reason: collision with root package name */
    public final int f220977i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public N f220978j;

    /* renamed from: k, reason: collision with root package name */
    @k
    public final h f220979k;

    /* compiled from: CompetitorsItemView.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/deep_linking/links/DeepLink;", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/deep_linking/links/DeepLink;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements l<DeepLink, G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f220980l = new a();

        public a() {
            super(1);
        }

        @Override // Y41.l
        public final /* bridge */ /* synthetic */ G0 invoke(DeepLink deepLink) {
            return G0.f406611a;
        }
    }

    public g(@k View view, @k com.avito.android.util.text.a aVar) throws BlueprintCollisionException {
        super(view);
        this.f220970b = aVar;
        this.f220971c = (ShimmerLayout) view.findViewById(R.id.position_in_search_competitors_shimmer);
        this.f220972d = (Group) view.findViewById(R.id.position_in_search_competitors_content_group);
        this.f220973e = (TextView) view.findViewById(R.id.position_in_search_competitors_title);
        this.f220974f = (TextView) view.findViewById(R.id.position_in_search_competitors_description);
        this.f220975g = (Badge) view.findViewById(R.id.position_in_search_competitors_badge);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.position_in_search_competitors_items);
        this.f220976h = recyclerView;
        this.f220977i = y6.b(72);
        this.f220978j = a.f220980l;
        com.avito.android.position_in_search.stats.screen.old_position_in_search.view.items.competitors.item.a aVar2 = new com.avito.android.position_in_search.stats.screen.old_position_in_search.view.items.competitors.item.a(new com.avito.android.position_in_search.stats.screen.old_position_in_search.view.items.competitors.item.c(new f(this)));
        a.C10493a c10493a = new a.C10493a();
        c10493a.b(aVar2);
        com.avito.konveyor.a aVarA = c10493a.a();
        h hVar = new h(aVarA, aVarA, null, 4, null);
        this.f220979k = hVar;
        recyclerView.setAdapter(new j(hVar, aVarA));
        int i12 = recyclerView.getContext().getResources().getBoolean(R.bool.is_tablet) ? 3 : 2;
        view.getContext();
        GridLayoutManager gridLayoutManager = new GridLayoutManager(i12);
        recyclerView.setLayoutManager(gridLayoutManager);
        recyclerView.l(new com.avito.android.position_in_search.stats.screen.old_position_in_search.view.items.competitors.a(i12, gridLayoutManager.f53667M), -1);
    }
}
