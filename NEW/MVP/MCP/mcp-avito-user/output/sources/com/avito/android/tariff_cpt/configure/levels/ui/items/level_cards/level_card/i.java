package com.avito.android.tariff_cpt.configure.levels.ui.items.level_cards.level_card;

import Y41.l;
import Y41.p;
import Y61.k;
import android.os.Bundle;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.lib.design.docking_badge.DockingBadgeItem;
import com.avito.android.tariff_cpt.configure.levels.ui.items.level_cards.level_card.c;
import com.avito.android.util.O2;
import iC0.C41267a;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: TariffCptConfigureLevelsCardPresenter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/tariff_cpt/configure/levels/ui/items/level_cards/level_card/i;", "Lcom/avito/android/tariff_cpt/configure/levels/ui/items/level_cards/level_card/f;", "_avito_tariff-cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class i implements f {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final p<DeepLink, Long, G0> f297996b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final l<DeepLink, G0> f297997c;

    public i(@k l lVar, @k p pVar) {
        this.f297996b = pVar;
        this.f297997c = lVar;
    }

    @Override // TV0.d
    public final /* bridge */ /* synthetic */ void O5(TV0.e eVar, TV0.a aVar, int i12) {
        k((d) eVar, (c) aVar);
    }

    @Override // TV0.f
    public final void g2(TV0.e eVar, TV0.a aVar, int i12, List list) {
        d dVar = (d) eVar;
        c cVar = (c) aVar;
        Object obj = null;
        for (Object obj2 : list) {
            if (obj2 instanceof Bundle) {
                obj = obj2;
            }
        }
        Bundle bundle = (Bundle) (obj instanceof Bundle ? obj : null);
        if (bundle == null || !bundle.containsKey("payload_tariff_cpt_configure_levels_card_loading")) {
            k(dVar, cVar);
        } else {
            dVar.setLoading(bundle.getBoolean("payload_tariff_cpt_configure_levels_card_loading"));
        }
    }

    public final void k(@k d dVar, @k c cVar) {
        DeepLink deepLink;
        DeepLink deepLink2;
        dVar.r(cVar.f297966c);
        C41267a c41267a = cVar.f297967d;
        dVar.Ad(c41267a != null ? c41267a.f398439d : null);
        dVar.mb(c41267a != null ? c41267a.f398436a : null);
        dVar.n1(cVar.f297968e);
        c.C9103c c9103c = cVar.f297969f;
        dVar.m00(c9103c);
        List<DockingBadgeItem> list = cVar.f297971h;
        dVar.t0(list);
        dVar.kV(O2.a(list) ? null : cVar.f297970g);
        dVar.setLoading(cVar.f297972i);
        if (c41267a != null && (deepLink2 = c41267a.f398437b) != null) {
            dVar.Y(new g(this, deepLink2, cVar));
        }
        if (c9103c == null || (deepLink = c9103c.f297979c) == null) {
            return;
        }
        dVar.rd(new h(this, deepLink));
    }
}
