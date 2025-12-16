package com.avito.android.hotel_booking.konveyor.select;

import Y41.l;
import Y61.k;
import com.avito.android.hotel_booking.konveyor.select.BookingFormSelectState;
import java.util.List;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: BookingFormSelectPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/hotel_booking/konveyor/select/f;", "LTV0/f;", "Lcom/avito/android/hotel_booking/konveyor/select/h;", "Lcom/avito/android/hotel_booking/konveyor/select/c;", "_avito_hotel-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class f implements TV0.f<h, c> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final l<RI.b, G0> f163770b;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public f(@k l<? super RI.b, G0> lVar) {
        this.f163770b = lVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        h hVar = (h) eVar;
        c cVar = (c) aVar;
        hVar.setText(cVar.f163762f);
        hVar.setHint(cVar.f163761e);
        hVar.setEnabled(cVar.f163759c);
        BookingFormSelectState bookingFormSelectState = cVar.f163760d;
        if (bookingFormSelectState instanceof BookingFormSelectState.Normal) {
            hVar.G();
        } else if (bookingFormSelectState instanceof BookingFormSelectState.Error) {
            hVar.G1(((BookingFormSelectState.Error) bookingFormSelectState).f163752b);
        }
        hVar.a(new e(cVar, this));
    }

    @Override // TV0.f
    public final void g2(TV0.e eVar, TV0.a aVar, int i12, List list) {
        h hVar = (h) eVar;
        c cVar = (c) aVar;
        Object obj = null;
        for (Object obj2 : list) {
            if (obj2 instanceof d) {
                obj = obj2;
            }
        }
        d dVar = (d) (obj instanceof d ? obj : null);
        if (dVar == null) {
            hVar.setText(cVar.f163762f);
            hVar.setHint(cVar.f163761e);
            hVar.setEnabled(cVar.f163759c);
            BookingFormSelectState bookingFormSelectState = cVar.f163760d;
            if (bookingFormSelectState instanceof BookingFormSelectState.Normal) {
                hVar.G();
            } else if (bookingFormSelectState instanceof BookingFormSelectState.Error) {
                hVar.G1(((BookingFormSelectState.Error) bookingFormSelectState).f163752b);
            }
            hVar.a(new e(cVar, this));
            return;
        }
        String str = dVar.f163764a;
        if (str != null) {
            hVar.setText(str);
        }
        String str2 = dVar.f163765b;
        if (str2 != null) {
            hVar.setHint(str2);
        }
        BookingFormSelectState bookingFormSelectState2 = dVar.f163766c;
        if (bookingFormSelectState2 != null) {
            if (bookingFormSelectState2 instanceof BookingFormSelectState.Normal) {
                hVar.G();
            } else if (bookingFormSelectState2 instanceof BookingFormSelectState.Error) {
                hVar.G1(((BookingFormSelectState.Error) bookingFormSelectState2).f163752b);
            }
        }
        Boolean bool = dVar.f163767d;
        if (bool != null) {
            hVar.setEnabled(bool.booleanValue());
        }
        hVar.a(new e(cVar, this));
    }
}
