package com.avito.android.advert_details_items.price_hint;

import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.InterfaceC28373a;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: PriceHintPresenter.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert_details_items/price_hint/h;", "Lcom/avito/android/advert_details_items/price_hint/f;", "_avito_advert-details-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class h implements f {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final a f85369b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f85370c;

    @Inject
    public h(@Y61.k a aVar, @Y61.k InterfaceC28373a interfaceC28373a) {
        this.f85369b = aVar;
        this.f85370c = interfaceC28373a;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        j jVar = (j) eVar;
        jVar.ox();
        jVar.du(new g(this, jVar, ((PriceHintItem) aVar).f85357d));
    }
}
