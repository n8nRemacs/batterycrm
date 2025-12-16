package com.avito.android.str_booking.ui.item_info;

import Y41.l;
import Y61.k;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: StrBookingItemInfoPresenter.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/str_booking/ui/item_info/e;", "LTV0/d;", "Lcom/avito/android/str_booking/ui/item_info/g;", "Lcom/avito/android/str_booking/ui/item_info/c;", "_avito_str-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class e implements TV0.d<g, c> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final l<com.avito.android.str_booking.mvi.entity.a, G0> f286084b;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public e(@k l<? super com.avito.android.str_booking.mvi.entity.a, G0> lVar) {
        this.f286084b = lVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        g gVar = (g) eVar;
        gVar.jS((c) aVar);
        gVar.qq(new d(this));
    }
}
