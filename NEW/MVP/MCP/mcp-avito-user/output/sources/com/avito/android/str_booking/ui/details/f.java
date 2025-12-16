package com.avito.android.str_booking.ui.details;

import Y41.l;
import Y61.k;
import com.avito.android.str_booking.network.models.sections.DetailsContent;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: StrBookingDetailsPresenter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_booking/ui/details/f;", "Lcom/avito/android/str_booking/ui/details/d;", "_avito_str-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class f implements d {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final l<com.avito.android.str_booking.mvi.entity.a, G0> f286002b;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public f(@k l<? super com.avito.android.str_booking.mvi.entity.a, G0> lVar) {
        this.f286002b = lVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        h hVar = (h) eVar;
        DetailsContent detailsContent = ((c) aVar).f285999b;
        hVar.b(detailsContent != null ? detailsContent.getHeader() : null);
        hVar.D10(detailsContent, new e(this));
    }
}
