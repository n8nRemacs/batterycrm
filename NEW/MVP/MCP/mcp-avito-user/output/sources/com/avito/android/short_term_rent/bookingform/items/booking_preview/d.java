package com.avito.android.short_term_rent.bookingform.items.booking_preview;

import com.avito.android.short_term_rent.bookingform.items.booking_preview.g;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.s0;

/* compiled from: AbsBookingPreviewPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/short_term_rent/bookingform/items/booking_preview/d;", "LTV0/f;", "Lcom/avito/android/short_term_rent/bookingform/items/booking_preview/m;", "Lcom/avito/android/short_term_rent/bookingform/items/booking_preview/BookingPreviewItem;", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class d implements TV0.f<m, BookingPreviewItem> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Y41.a<G0> f281455b;

    public d(@Y61.k Y41.a<G0> aVar) {
        this.f281455b = aVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        m mVar = (m) eVar;
        BookingPreviewItem bookingPreviewItem = (BookingPreviewItem) aVar;
        mVar.F(bookingPreviewItem.f281449d);
        mVar.z2(bookingPreviewItem.f281448c);
        mVar.S(new c(this));
    }

    @Override // TV0.f
    public final void g2(TV0.e eVar, TV0.a aVar, int i12, List list) {
        m mVar = (m) eVar;
        BookingPreviewItem bookingPreviewItem = (BookingPreviewItem) aVar;
        Object obj = null;
        for (Object obj2 : list) {
            if (obj2 instanceof List) {
                obj = obj2;
            }
        }
        List<g> list2 = (List) (obj instanceof List ? obj : null);
        if (list2 == null) {
            list2 = C42784z0.f406748b;
        }
        if (list2.isEmpty()) {
            mVar.F(bookingPreviewItem.f281449d);
            mVar.z2(bookingPreviewItem.f281448c);
            mVar.S(new c(this));
            return;
        }
        for (g gVar : list2) {
            if (gVar instanceof g.a) {
                mVar.z2(((g.a) gVar).f281458a);
            } else if (gVar instanceof g.c) {
                mVar.F(((g.c) gVar).f281459a);
            } else if (gVar instanceof g.b) {
                mVar.S(new b(this));
            }
        }
    }
}
