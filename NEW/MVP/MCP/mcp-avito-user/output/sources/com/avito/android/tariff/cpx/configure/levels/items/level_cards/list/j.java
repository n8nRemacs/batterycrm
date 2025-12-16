package com.avito.android.tariff.cpx.configure.levels.items.level_cards.list;

import Y41.p;
import android.os.Bundle;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.ButtonAction;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: LevelCardPresenter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/tariff/cpx/configure/levels/items/level_cards/list/j;", "Lcom/avito/android/tariff/cpx/configure/levels/items/level_cards/list/g;", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class j implements g {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final p<DeepLink, Long, G0> f296179b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Y41.l<DeepLink, G0> f296180c;

    public j(@Y61.k Y41.l lVar, @Y61.k p pVar) {
        this.f296179b = pVar;
        this.f296180c = lVar;
    }

    @Override // TV0.d
    public final /* bridge */ /* synthetic */ void O5(TV0.e eVar, TV0.a aVar, int i12) {
        k((e) eVar, (d) aVar);
    }

    @Override // TV0.f
    public final void g2(TV0.e eVar, TV0.a aVar, int i12, List list) {
        e eVar2 = (e) eVar;
        d dVar = (d) aVar;
        Object obj = null;
        for (Object obj2 : list) {
            if (obj2 instanceof Bundle) {
                obj = obj2;
            }
        }
        Bundle bundle = (Bundle) (obj instanceof Bundle ? obj : null);
        if (bundle == null || !bundle.containsKey("payload_cpx_level_card_loading")) {
            k(eVar2, dVar);
        } else {
            eVar2.setLoading(bundle.getBoolean("payload_cpx_level_card_loading"));
        }
    }

    public final void k(@Y61.k e eVar, @Y61.k d dVar) {
        DeepLink deepLink;
        DeepLink deeplink;
        eVar.r(dVar.f296161c);
        ButtonAction buttonAction = dVar.f296162d;
        eVar.Ad(buttonAction != null ? buttonAction.isEnabled() : null);
        eVar.mb(buttonAction != null ? buttonAction.getTitle() : null);
        eVar.n1(dVar.f296163e);
        l lVar = dVar.f296164f;
        eVar.nK(lVar);
        eVar.setLoading(dVar.f296165g);
        if (buttonAction != null && (deeplink = buttonAction.getDeeplink()) != null) {
            eVar.Y(new h(this, deeplink, dVar));
        }
        if (lVar == null || (deepLink = lVar.f296183c) == null) {
            return;
        }
        eVar.rd(new i(this, deepLink));
    }
}
