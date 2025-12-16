package com.avito.android.tariff.cpx.configure.levels.items.level_cards;

import Y41.p;
import android.view.View;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.mnz_common.ui.StickyRecyclerView;
import com.avito.konveyor.a;
import com.avito.konveyor.exception.BlueprintCollisionException;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: LevelCardsView.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/tariff/cpx/configure/levels/items/level_cards/l;", "Lcom/avito/android/tariff/cpx/configure/levels/items/level_cards/i;", "Lcom/avito/konveyor/adapter/b;", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class l extends com.avito.konveyor.adapter.b implements i {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.konveyor.adapter.d f296152b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public Y41.l<? super DeepLink, G0> f296153c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public p<? super DeepLink, ? super Long, G0> f296154d;

    public l(@Y61.k View view) throws BlueprintCollisionException {
        super(view);
        com.avito.android.tariff.cpx.configure.levels.items.level_cards.list.j jVar = new com.avito.android.tariff.cpx.configure.levels.items.level_cards.list.j(new k(this), new j(this));
        a.C10493a c10493a = new a.C10493a();
        c10493a.b(new com.avito.android.tariff.cpx.configure.levels.items.level_cards.list.c(jVar));
        com.avito.konveyor.a aVarA = c10493a.a();
        com.avito.konveyor.adapter.d dVar = new com.avito.konveyor.adapter.d(new com.avito.konveyor.adapter.h(aVarA, aVarA, null, 4, null), aVarA, new a());
        this.f296152b = dVar;
        StickyRecyclerView stickyRecyclerView = (StickyRecyclerView) view.findViewById(R.id.level_cards_recycler_view);
        stickyRecyclerView.setAdapter(dVar);
        stickyRecyclerView.l(new e(), -1);
    }

    @Override // com.avito.android.tariff.cpx.configure.levels.items.level_cards.i
    public final void g1(@Y61.k Y41.l<? super DeepLink, G0> lVar) {
        this.f296153c = lVar;
    }

    @Override // com.avito.android.tariff.cpx.configure.levels.items.level_cards.i
    public final void g6(@Y61.k List<com.avito.android.tariff.cpx.configure.levels.items.level_cards.list.d> list) {
        this.f296152b.l(list, null);
    }

    @Override // com.avito.android.tariff.cpx.configure.levels.items.level_cards.i
    public final void hc(@Y61.k p<? super DeepLink, ? super Long, G0> pVar) {
        this.f296154d = pVar;
    }
}
