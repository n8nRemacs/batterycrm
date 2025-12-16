package com.avito.android.advert_core.pp_recall_promo;

import com.avito.android.di.module.InterfaceC30174s;
import com.avito.konveyor.item_visibility_tracker.b;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: PpRecallPromoInstantItemFilter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert_core/pp_recall_promo/p;", "LWV0/a;", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class p extends WV0.a {

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final Yo.p f84002e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final String f84003f;

    @Inject
    public p(@Y61.k Yo.p pVar, @Y61.k @InterfaceC30174s String str) {
        super(true, true, 0.001f, 1L);
        this.f84002e = pVar;
        this.f84003f = str;
    }

    @Override // WV0.a
    public final boolean a(@Y61.k b.InterfaceC10495b interfaceC10495b) {
        return interfaceC10495b instanceof AdvertDetailsPpRecallPromoItem;
    }

    @Override // WV0.a
    public final void b(int i12, @Y61.k b.InterfaceC10495b interfaceC10495b) {
        this.f84002e.f(this.f84003f, "re_item_buyer", "after_description", "rre_trx_item_buyer_2024_v1");
    }
}
