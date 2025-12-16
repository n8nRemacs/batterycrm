package com.avito.android.cpx_promo_geo.screens.cpx_promo_geo.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.cpx_promo_geo.screens.cpx_promo_geo.mvi.entity.CpxPromoGeoInternalAction;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: CpxPromoGeoBootstrap.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/cpx_promo_geo/screens/cpx_promo_geo/mvi/h;", "Lcom/avito/android/arch/mvi/b;", "Lcom/avito/android/cpx_promo_geo/screens/cpx_promo_geo/mvi/entity/CpxPromoGeoInternalAction;", "_avito_cpx-promo-geo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class h implements com.avito.android.arch.mvi.b<CpxPromoGeoInternalAction> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.cpx_promo_geo.screens.cpx_promo_geo.domain.b f127896a;

    @Inject
    public h(@Y61.k com.avito.android.cpx_promo_geo.screens.cpx_promo_geo.domain.b bVar) {
        this.f127896a = bVar;
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.k
    public final InterfaceC43160i<CpxPromoGeoInternalAction> a() {
        return this.f127896a.a(null, null, null, null);
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.l
    public final Object b(@Y61.k Continuation<? super G0> continuation) {
        return G0.f406611a;
    }
}
