package com.avito.android.profile.user_profile.cards.wallet.finance_split_bonuses;

import N90.p;
import Ua0.InterfaceC15503a;
import Y41.l;
import Y61.k;
import android.content.Context;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.profile.user_profile.cards.CardItem;
import com.avito.android.remote.model.AvitoFinanceBaseCard;
import com.avito.android.util.C35835l0;
import com.avito.android.util.y6;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: AvitoFinanceSplitBonusesCardItemPresenter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile/user_profile/cards/wallet/finance_split_bonuses/i;", "Lcom/avito/android/profile/user_profile/cards/wallet/finance_split_bonuses/c;", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class i implements c {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final l<InterfaceC15503a, G0> f225737b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final InterfaceC28373a f225738c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final p f225739d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final N90.b f225740e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final Context f225741f;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public i(@k l<? super InterfaceC15503a, G0> lVar, @k InterfaceC28373a interfaceC28373a, @k p pVar, @k N90.b bVar, @k Context context) {
        this.f225737b = lVar;
        this.f225738c = interfaceC28373a;
        this.f225739d = pVar;
        this.f225740e = bVar;
        this.f225741f = context;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        com.avito.android.profile.user_profile.cards.wallet.finance_common.a aVar2 = (com.avito.android.profile.user_profile.cards.wallet.finance_common.a) eVar;
        CardItem.AvitoFinanceSplitBonusesCardItem avitoFinanceSplitBonusesCardItem = (CardItem.AvitoFinanceSplitBonusesCardItem) aVar;
        AvitoFinanceBaseCard avitoFinanceBaseCard = avitoFinanceSplitBonusesCardItem.f224347j;
        aVar2.r40(avitoFinanceSplitBonusesCardItem.f224341d, null, avitoFinanceBaseCard != null ? avitoFinanceBaseCard.getTitle() : null, avitoFinanceBaseCard != null ? avitoFinanceBaseCard.getSubtitle() : null, avitoFinanceBaseCard != null ? avitoFinanceBaseCard.getIcon() : null, avitoFinanceBaseCard != null ? avitoFinanceBaseCard.getBackground() : null);
        aVar2.Sr(false);
        if (avitoFinanceSplitBonusesCardItem.f224346i == null) {
            aVar2.uy(false);
        } else {
            aVar2.uy(true);
            aVar2.bH(new d(this, avitoFinanceSplitBonusesCardItem));
        }
        aVar2.Kg(new e(this, avitoFinanceSplitBonusesCardItem));
        aVar2.SA(new f(this, avitoFinanceSplitBonusesCardItem));
        aVar2.As(true);
        AvitoFinanceBaseCard avitoFinanceBaseCard2 = avitoFinanceSplitBonusesCardItem.f224348k;
        aVar2.tK(avitoFinanceSplitBonusesCardItem.f224342e, avitoFinanceBaseCard2 != null ? avitoFinanceBaseCard2.getTitle() : null, avitoFinanceBaseCard2 != null ? avitoFinanceBaseCard2.getSubtitle() : null, avitoFinanceBaseCard2 != null ? avitoFinanceBaseCard2.getIcon() : null, avitoFinanceBaseCard2 != null ? avitoFinanceBaseCard2.getBackground() : null);
        aVar2.Dk(new g(this, avitoFinanceSplitBonusesCardItem));
        AvitoFinanceBaseCard avitoFinanceBaseCard3 = avitoFinanceSplitBonusesCardItem.f224349l;
        aVar2.Ag(false, avitoFinanceBaseCard3 != null ? avitoFinanceBaseCard3.getTitle() : null, avitoFinanceBaseCard3 != null ? avitoFinanceBaseCard3.getSubtitle() : null, avitoFinanceBaseCard3 != null ? avitoFinanceBaseCard3.getIcon() : null, avitoFinanceBaseCard3 != null ? avitoFinanceBaseCard3.getBackground() : null);
        aVar2.vP(new h(this, avitoFinanceSplitBonusesCardItem));
        String str = this.f225739d.f11258a;
        String strA = this.f225740e.a(avitoFinanceSplitBonusesCardItem);
        Context context = this.f225741f;
        this.f225738c.c(new N90.h(y6.e(C35835l0.i(context).heightPixels), y6.e(C35835l0.i(context).widthPixels), str, strA));
    }
}
