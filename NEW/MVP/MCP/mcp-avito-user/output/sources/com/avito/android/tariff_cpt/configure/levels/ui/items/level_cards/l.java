package com.avito.android.tariff_cpt.configure.levels.ui.items.level_cards;

import Y41.p;
import android.view.View;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.tariff_cpt.common.ui.StickyRecyclerView;
import com.avito.konveyor.a;
import com.avito.konveyor.exception.BlueprintCollisionException;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: TariffCptConfigureLevelsCardsView.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/tariff_cpt/configure/levels/ui/items/level_cards/l;", "Lcom/avito/android/tariff_cpt/configure/levels/ui/items/level_cards/i;", "Lcom/avito/konveyor/adapter/b;", "_avito_tariff-cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class l extends com.avito.konveyor.adapter.b implements i {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.util.text.a f297958b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.konveyor.adapter.d f297959c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public Y41.l<? super DeepLink, G0> f297960d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public p<? super DeepLink, ? super Long, G0> f297961e;

    public l(@Y61.k View view, @Y61.k com.avito.android.util.text.a aVar) throws BlueprintCollisionException {
        super(view);
        this.f297958b = aVar;
        com.avito.android.tariff_cpt.configure.levels.ui.items.level_cards.level_card.i iVar = new com.avito.android.tariff_cpt.configure.levels.ui.items.level_cards.level_card.i(new k(this), new j(this));
        a.C10493a c10493a = new a.C10493a();
        c10493a.b(new com.avito.android.tariff_cpt.configure.levels.ui.items.level_cards.level_card.b(iVar, aVar));
        com.avito.konveyor.a aVarA = c10493a.a();
        com.avito.konveyor.adapter.d dVar = new com.avito.konveyor.adapter.d(new com.avito.konveyor.adapter.h(aVarA, aVarA, null, 4, null), aVarA, new c());
        this.f297959c = dVar;
        StickyRecyclerView stickyRecyclerView = (StickyRecyclerView) view.findViewById(R.id.tariff_cpt_configure_levels_cards_recycler_view);
        stickyRecyclerView.setAdapter(dVar);
        stickyRecyclerView.l(new e(), -1);
    }

    @Override // com.avito.android.tariff_cpt.configure.levels.ui.items.level_cards.i
    public final void g1(@Y61.k Y41.l<? super DeepLink, G0> lVar) {
        this.f297960d = lVar;
    }

    @Override // com.avito.android.tariff_cpt.configure.levels.ui.items.level_cards.i
    public final void g6(@Y61.k List<com.avito.android.tariff_cpt.configure.levels.ui.items.level_cards.level_card.c> list) {
        this.f297959c.l(list, null);
    }

    @Override // com.avito.android.tariff_cpt.configure.levels.ui.items.level_cards.i
    public final void hc(@Y61.k p<? super DeepLink, ? super Long, G0> pVar) {
        this.f297961e = pVar;
    }
}
