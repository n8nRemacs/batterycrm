package com.avito.android.cpx_promo_geo.screens.cpx_promo_geo.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.t;
import com.avito.android.cpx_promo_geo.screens.cpx_promo_geo.mvi.entity.CpxPromoGeoInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;
import ts.InterfaceC48708b;

/* compiled from: CpxPromoGeoOneTimeEventProducer.kt */
@P
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/cpx_promo_geo/screens/cpx_promo_geo/mvi/m;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/cpx_promo_geo/screens/cpx_promo_geo/mvi/entity/CpxPromoGeoInternalAction;", "Lts/b;", "<init>", "()V", "_avito_cpx-promo-geo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class m implements t<CpxPromoGeoInternalAction, InterfaceC48708b> {
    @Inject
    public m() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final InterfaceC48708b b(CpxPromoGeoInternalAction cpxPromoGeoInternalAction) {
        InterfaceC48708b cVar;
        CpxPromoGeoInternalAction cpxPromoGeoInternalAction2 = cpxPromoGeoInternalAction;
        if (cpxPromoGeoInternalAction2 instanceof CpxPromoGeoInternalAction.Back) {
            return InterfaceC48708b.a.f439487a;
        }
        if (cpxPromoGeoInternalAction2 instanceof CpxPromoGeoInternalAction.HandleDeeplink) {
            cVar = new InterfaceC48708b.C12685b(((CpxPromoGeoInternalAction.HandleDeeplink) cpxPromoGeoInternalAction2).f127885b);
        } else {
            if (!(cpxPromoGeoInternalAction2 instanceof CpxPromoGeoInternalAction.ShowToast)) {
                return null;
            }
            CpxPromoGeoInternalAction.ShowToast showToast = (CpxPromoGeoInternalAction.ShowToast) cpxPromoGeoInternalAction2;
            cVar = new InterfaceC48708b.c(showToast.f127890b, showToast.f127891c);
        }
        return cVar;
    }
}
