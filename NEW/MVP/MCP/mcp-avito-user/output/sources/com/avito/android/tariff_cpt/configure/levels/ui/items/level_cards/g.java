package com.avito.android.tariff_cpt.configure.levels.ui.items.level_cards;

import Y41.p;
import android.os.Bundle;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import java.util.List;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: TariffCptConfigureLevelsCardsPresenter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/tariff_cpt/configure/levels/ui/items/level_cards/g;", "Lcom/avito/android/tariff_cpt/configure/levels/ui/items/level_cards/f;", "_avito_tariff-cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class g implements f {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final p<DeepLink, Long, G0> f297952b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Y41.l<DeepLink, G0> f297953c;

    @Inject
    public g(@Y61.k Y41.l lVar, @Y61.k p pVar) {
        this.f297952b = pVar;
        this.f297953c = lVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        i iVar = (i) eVar;
        iVar.g6(((d) aVar).f297950c);
        iVar.g1(this.f297953c);
        iVar.hc(this.f297952b);
    }

    @Override // TV0.f
    public final void g2(TV0.e eVar, TV0.a aVar, int i12, List list) {
        i iVar = (i) eVar;
        d dVar = (d) aVar;
        Object obj = null;
        for (Object obj2 : list) {
            if (obj2 instanceof Bundle) {
                obj = obj2;
            }
        }
        Bundle bundle = (Bundle) (obj instanceof Bundle ? obj : null);
        if (bundle != null && bundle.getBoolean("payload_cpt_level_cards_change")) {
            iVar.g6(dVar.f297950c);
            return;
        }
        iVar.g6(dVar.f297950c);
        iVar.g1(this.f297953c);
        iVar.hc(this.f297952b);
    }
}
