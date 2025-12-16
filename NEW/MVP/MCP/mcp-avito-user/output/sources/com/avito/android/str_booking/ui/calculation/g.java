package com.avito.android.str_booking.ui.calculation;

import com.avito.android.analytics.InterfaceC28373a;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: StrBookingCalculationPresenter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_booking/ui/calculation/g;", "Lcom/avito/android/str_booking/ui/calculation/e;", "_avito_str-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class g implements e {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f285968b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Y41.l<com.avito.android.str_booking.mvi.entity.a, G0> f285969c;

    @Inject
    public g(@Y61.k Y41.l lVar, @Y61.k InterfaceC28373a interfaceC28373a) {
        this.f285968b = interfaceC28373a;
        this.f285969c = lVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        i iVar = (i) eVar;
        d dVar = (d) aVar;
        iVar.Qo(dVar, this.f285969c);
        iVar.y80(new f(dVar, this));
        a aVar2 = dVar.f285964f;
        if (aVar2 != null) {
            iVar.nx(aVar2);
            return;
        }
        n nVar = dVar.f285963e;
        if (nVar != null) {
            iVar.mT(nVar);
        } else {
            iVar.Uv();
        }
    }
}
