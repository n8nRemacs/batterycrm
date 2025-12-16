package com.avito.android.hotel_booking.konveyor.input;

import com.avito.android.hotel_booking.konveyor.input.BookingFormInputState;
import java.util.List;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: BookingFormInputPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/hotel_booking/konveyor/input/h;", "LTV0/f;", "Lcom/avito/android/hotel_booking/konveyor/input/k;", "Lcom/avito/android/hotel_booking/konveyor/input/c;", "_avito_hotel-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class h implements TV0.f<k, c> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Y41.l<RI.b, G0> f163689b;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public h(@Y61.k Y41.l<? super RI.b, G0> lVar) {
        this.f163689b = lVar;
    }

    public static void O(k kVar, c cVar) {
        Integer num = cVar.f163678i;
        if (num != null && num.intValue() == 1) {
            kVar.h0();
            return;
        }
        Integer num2 = cVar.f163678i;
        Integer num3 = cVar.f163677h;
        if (num3 == null && num2 == null) {
            kVar.h0();
        } else {
            kVar.J1(num3 != null ? num3.intValue() : 1, num2 != null ? num2.intValue() : Integer.MAX_VALUE);
        }
    }

    @Override // TV0.d
    public final /* bridge */ /* synthetic */ void O5(TV0.e eVar, TV0.a aVar, int i12) {
        k((k) eVar, (c) aVar);
    }

    @Override // TV0.f
    public final void g2(TV0.e eVar, TV0.a aVar, int i12, List list) {
        k kVar = (k) eVar;
        c cVar = (c) aVar;
        Object obj = null;
        for (Object obj2 : list) {
            if (obj2 instanceof d) {
                obj = obj2;
            }
        }
        d dVar = (d) (obj instanceof d ? obj : null);
        if (dVar == null) {
            k(kVar, cVar);
            return;
        }
        String str = dVar.f163679a;
        if (str != null) {
            kVar.setHint(str);
        }
        BookingFormInputState bookingFormInputState = dVar.f163680b;
        if (bookingFormInputState != null) {
            if (bookingFormInputState instanceof BookingFormInputState.Normal) {
                kVar.G();
            } else if (bookingFormInputState instanceof BookingFormInputState.Error) {
                kVar.G1(((BookingFormInputState.Error) bookingFormInputState).f163665b);
            }
        }
        Boolean bool = dVar.f163681c;
        if (bool != null) {
            kVar.setEnabled(bool.booleanValue());
        }
        O(kVar, cVar);
        kVar.s5(new e(this, cVar));
        kVar.o0(new g(kVar, this, cVar));
    }

    public final void k(@Y61.k k kVar, @Y61.k c cVar) {
        kVar.v3(cVar.f163675f);
        kVar.setText(cVar.f163672c);
        kVar.setHint(cVar.f163674e);
        kVar.setEnabled(cVar.f163673d);
        BookingFormInputState bookingFormInputState = cVar.f163676g;
        if (bookingFormInputState instanceof BookingFormInputState.Normal) {
            kVar.G();
        } else if (bookingFormInputState instanceof BookingFormInputState.Error) {
            kVar.G1(((BookingFormInputState.Error) bookingFormInputState).f163665b);
        }
        O(kVar, cVar);
        kVar.s5(new e(this, cVar));
        kVar.o0(new g(kVar, this, cVar));
    }
}
