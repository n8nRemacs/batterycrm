package com.avito.android.hotel_booking.select_radio.konveyor.radio;

import Y41.l;
import Y61.k;
import com.avito.android.hotel_booking.Insight;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: SelectRadioPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/hotel_booking/select_radio/konveyor/radio/f;", "LTV0/f;", "Lcom/avito/android/hotel_booking/select_radio/konveyor/radio/h;", "Lcom/avito/android/hotel_booking/select_radio/konveyor/radio/c;", "_avito_hotel-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class f implements TV0.f<h, c> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final l<TI.a, G0> f164013b;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public f(@k l<? super TI.a, G0> lVar) {
        this.f164013b = lVar;
    }

    @Override // TV0.d
    public final /* bridge */ /* synthetic */ void O5(TV0.e eVar, TV0.a aVar, int i12) {
        k((h) eVar, (c) aVar);
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
            k(hVar, cVar);
            return;
        }
        Boolean bool = dVar.f164010a;
        if (bool != null) {
            hVar.setSelected(bool.booleanValue());
        }
        hVar.a(new e(this, cVar));
    }

    public final void k(@k h hVar, @k c cVar) {
        hVar.uU();
        List<Insight> list = cVar.f164009e;
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                hVar.fp((Insight) it.next());
            }
        }
        hVar.setSelected(cVar.f164008d);
        hVar.a(new e(this, cVar));
    }
}
