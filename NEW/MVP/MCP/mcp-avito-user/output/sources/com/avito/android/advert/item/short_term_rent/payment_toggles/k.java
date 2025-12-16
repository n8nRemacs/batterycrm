package com.avito.android.advert.item.short_term_rent.payment_toggles;

import androidx.compose.runtime.internal.P;
import com.avito.android.advert.item.short_term_rent.payment_toggles.h;
import com.avito.android.advert.item.short_term_rent.payment_toggles.toggle.AdvertDetailsTravelPaymentToggleItem;
import com.avito.android.util.R0;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlinx.coroutines.N0;
import kotlinx.coroutines.U;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.internal.C43238h;

/* compiled from: AdvertDetailsTravelPaymentTogglesPresenter.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/short_term_rent/payment_toggles/k;", "Lcom/avito/android/advert/item/short_term_rent/payment_toggles/h;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class k implements h {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final h31.e<com.avito.konveyor.adapter.d> f80093b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f80094c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final h.a f80095d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final c f80096e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final R0 f80097f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public C43238h f80098g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public AdvertDetailsTravelPaymentTogglesItem f80099h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.l
    public N0 f80100i;

    @Inject
    public k(@d7.e @Y61.k h31.e<com.avito.konveyor.adapter.d> eVar, @Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar, @Y61.k h.a aVar2, @Y61.k c cVar, @Y61.k R0 r02) {
        this.f80093b = eVar;
        this.f80094c = aVar;
        this.f80095d = aVar2;
        this.f80096e = cVar;
        this.f80097f = r02;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        n nVar = (n) eVar;
        AdvertDetailsTravelPaymentTogglesItem advertDetailsTravelPaymentTogglesItem = (AdvertDetailsTravelPaymentTogglesItem) aVar;
        this.f80099h = advertDetailsTravelPaymentTogglesItem;
        nVar.w(advertDetailsTravelPaymentTogglesItem.f80075g);
        h31.e<com.avito.konveyor.adapter.d> eVar2 = this.f80093b;
        nVar.Wo(eVar2.get());
        nVar.Di(advertDetailsTravelPaymentTogglesItem.f80077i);
        List<AdvertDetailsTravelPaymentToggleItem> list = advertDetailsTravelPaymentTogglesItem.f80076h;
        if (list.size() == 1) {
            nVar.is();
        } else {
            nVar.Tt();
        }
        nVar.t(new i(advertDetailsTravelPaymentTogglesItem, nVar));
        eVar2.get().l(list, null);
    }

    @Override // com.avito.android.advert.item.short_term_rent.payment_toggles.h
    public final void i() {
        N0 n02 = this.f80100i;
        if (n02 != null) {
            n02.c(null);
        }
        C43238h c43238h = this.f80098g;
        if (c43238h != null) {
            U.b(c43238h, null);
        }
        this.f80100i = null;
        this.f80098g = null;
        C43238h c43238hA = U.a(this.f80097f.b());
        this.f80098g = c43238hA;
        N0 n03 = this.f80100i;
        if (n03 != null) {
            n03.c(null);
        }
        this.f80100i = C43175k.K(new C43197r1(new j(this, null), com.avito.android.arch.mvi.utils.h.d(this.f80096e.getActions(), 300L)), c43238hA);
    }

    @Override // com.avito.android.advert.item.short_term_rent.payment_toggles.h
    public final void onDestroyView() {
        N0 n02 = this.f80100i;
        if (n02 != null) {
            n02.c(null);
        }
        C43238h c43238h = this.f80098g;
        if (c43238h != null) {
            U.b(c43238h, null);
        }
        this.f80100i = null;
        this.f80098g = null;
    }
}
