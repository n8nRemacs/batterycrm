package com.avito.android.profile.user_profile.cards.wallet.finance_dynamic;

import Ua0.InterfaceC15503a;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import com.avito.android.deep_linking.x;
import com.avito.android.profile.user_profile.analytics.AvitoFinanceSensitiveDataEvent;
import com.avito.android.profile.user_profile.cards.CardItem;
import com.avito.android.remote.model.AvitoFinanceAction;
import com.avito.android.remote.model.AvitoFinanceButton;
import com.avito.android.remote.model.AvitoFinanceDynamicCard;
import com.avito.android.util.V2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.P0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: AvitoFinanceDynamicCardPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile/user_profile/cards/wallet/finance_dynamic/k;", "Lcom/avito/android/profile/user_profile/cards/wallet/finance_dynamic/c;", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class k implements c {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Y41.l<InterfaceC15503a, G0> f225697b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final x f225698c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f225699d;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public k(@Y61.k Y41.l<? super InterfaceC15503a, G0> lVar, @Y61.k x xVar, @Y61.k InterfaceC28373a interfaceC28373a) {
        this.f225697b = lVar;
        this.f225698c = xVar;
        this.f225699d = interfaceC28373a;
    }

    public static final void k(k kVar, AvitoFinanceAction avitoFinanceAction) {
        if (!(avitoFinanceAction instanceof AvitoFinanceAction.SendEvent)) {
            if (avitoFinanceAction instanceof AvitoFinanceAction.OpenDeeplink) {
                kVar.f225697b.invoke(new InterfaceC15503a.i(kVar.f225698c.b(((AvitoFinanceAction.OpenDeeplink) avitoFinanceAction).getUrl())));
                return;
            } else {
                V2.f318762a.d("Unknown action type: ", avitoFinanceAction.toString());
                return;
            }
        }
        AvitoFinanceAction.SendEvent sendEvent = (AvitoFinanceAction.SendEvent) avitoFinanceAction;
        Map<String, Object> params = sendEvent.getParams();
        if (params == null) {
            params = P0.c();
        }
        Map<String, Object> map = params;
        kVar.f225699d.c(map.isEmpty() ? new com.avito.android.analytics.provider.clickstream.b((int) sendEvent.getId(), (int) sendEvent.getVersion()) : L.f(sendEvent.getHasSensitiveData(), Boolean.TRUE) ? new AvitoFinanceSensitiveDataEvent((int) sendEvent.getId(), (int) sendEvent.getVersion(), map) : new ParametrizedClickStreamEvent((int) sendEvent.getId(), (int) sendEvent.getVersion(), map, null, 8, null));
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        com.avito.android.profile.user_profile.cards.wallet.finance_common.c cVar = (com.avito.android.profile.user_profile.cards.wallet.finance_common.c) eVar;
        CardItem.AvitoFinanceDynamicCardItem avitoFinanceDynamicCardItem = (CardItem.AvitoFinanceDynamicCardItem) aVar;
        ArrayList arrayList = avitoFinanceDynamicCardItem.f224329d;
        if (arrayList != null) {
            cVar.Oe(arrayList);
        }
        ArrayList arrayList2 = avitoFinanceDynamicCardItem.f224331f;
        if (arrayList2 != null) {
            cVar.yv(new g(this), arrayList2);
        }
        ArrayList arrayList3 = avitoFinanceDynamicCardItem.f224330e;
        if (arrayList3 != null) {
            cVar.bT(new h(this), arrayList3);
        }
        if (arrayList != null) {
            Iterator it = C42745f0.H(arrayList).iterator();
            while (it.hasNext()) {
                AvitoFinanceDynamicCard avitoFinanceDynamicCard = (AvitoFinanceDynamicCard) it.next();
                if (avitoFinanceDynamicCard.getOnSelect() != null) {
                    cVar.XP(new i(this));
                }
                AvitoFinanceButton button = avitoFinanceDynamicCard.getButton();
                if (button != null && button.getOnSelect() != null) {
                    cVar.nG(new j(this));
                }
            }
        }
    }
}
