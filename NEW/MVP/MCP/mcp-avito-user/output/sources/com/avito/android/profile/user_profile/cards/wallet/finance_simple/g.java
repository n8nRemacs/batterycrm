package com.avito.android.profile.user_profile.cards.wallet.finance_simple;

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

/* compiled from: AvitoFinanceSimpleCardItemPresenter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile/user_profile/cards/wallet/finance_simple/g;", "Lcom/avito/android/profile/user_profile/cards/wallet/finance_simple/c;", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class g implements c {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final l<InterfaceC15503a, G0> f225713b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final InterfaceC28373a f225714c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final p f225715d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final N90.b f225716e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final Context f225717f;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public g(@k l<? super InterfaceC15503a, G0> lVar, @k InterfaceC28373a interfaceC28373a, @k p pVar, @k N90.b bVar, @k Context context) {
        this.f225713b = lVar;
        this.f225714c = interfaceC28373a;
        this.f225715d = pVar;
        this.f225716e = bVar;
        this.f225717f = context;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        com.avito.android.profile.user_profile.cards.wallet.finance_common.a aVar2 = (com.avito.android.profile.user_profile.cards.wallet.finance_common.a) eVar;
        CardItem.AvitoFinanceSimpleCardItem avitoFinanceSimpleCardItem = (CardItem.AvitoFinanceSimpleCardItem) aVar;
        AvitoFinanceBaseCard avitoFinanceBaseCard = avitoFinanceSimpleCardItem.f224337h;
        aVar2.r40(avitoFinanceSimpleCardItem.f224333d, avitoFinanceSimpleCardItem.f224334e, avitoFinanceBaseCard != null ? avitoFinanceBaseCard.getTitle() : null, avitoFinanceBaseCard != null ? avitoFinanceBaseCard.getSubtitle() : null, avitoFinanceBaseCard != null ? avitoFinanceBaseCard.getIcon() : null, avitoFinanceBaseCard != null ? avitoFinanceBaseCard.getBackground() : null);
        if (avitoFinanceSimpleCardItem.f224336g == null) {
            aVar2.Sr(true);
            aVar2.uy(false);
        } else {
            aVar2.Sr(false);
            aVar2.uy(true);
            aVar2.bH(new d(this, avitoFinanceSimpleCardItem));
        }
        aVar2.Kg(new e(this, avitoFinanceSimpleCardItem));
        aVar2.SA(new f(this, avitoFinanceSimpleCardItem));
        aVar2.As(false);
        String str = this.f225715d.f11258a;
        String strA = this.f225716e.a(avitoFinanceSimpleCardItem);
        Context context = this.f225717f;
        this.f225714c.c(new N90.h(y6.e(C35835l0.i(context).heightPixels), y6.e(C35835l0.i(context).widthPixels), str, strA));
    }
}
