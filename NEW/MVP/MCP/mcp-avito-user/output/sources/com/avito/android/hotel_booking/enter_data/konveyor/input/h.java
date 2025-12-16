package com.avito.android.hotel_booking.enter_data.konveyor.input;

import com.avito.android.hotel_booking.enter_data.konveyor.input.j;
import java.util.List;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: EnterDataInputPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/hotel_booking/enter_data/konveyor/input/h;", "LTV0/f;", "Lcom/avito/android/hotel_booking/enter_data/konveyor/input/k;", "Lcom/avito/android/hotel_booking/enter_data/konveyor/input/c;", "_avito_hotel-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class h implements TV0.f<k, c> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Y41.l<QI.a, G0> f163522b;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public h(@Y61.k Y41.l<? super QI.a, G0> lVar) {
        this.f163522b = lVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        k kVar = (k) eVar;
        c cVar = (c) aVar;
        kVar.setText(cVar.f163510e);
        kVar.setHint(cVar.f163511f);
        j jVar = cVar.f163512g;
        if (jVar instanceof j.b) {
            kVar.G();
        } else if (jVar instanceof j.a) {
            kVar.G1(((j.a) jVar).f163524a);
        }
        kVar.s5(new e(this, cVar));
        kVar.o0(new g(kVar, this, cVar));
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
            kVar.setText(cVar.f163510e);
            kVar.setHint(cVar.f163511f);
            j jVar = cVar.f163512g;
            if (jVar instanceof j.b) {
                kVar.G();
            } else if (jVar instanceof j.a) {
                kVar.G1(((j.a) jVar).f163524a);
            }
            kVar.s5(new e(this, cVar));
            kVar.o0(new g(kVar, this, cVar));
            return;
        }
        String str = dVar.f163513a;
        if (str != null) {
            kVar.setHint(str);
        }
        j jVar2 = dVar.f163514b;
        if (jVar2 != null) {
            if (jVar2 instanceof j.b) {
                kVar.G();
            } else if (jVar2 instanceof j.a) {
                kVar.G1(((j.a) jVar2).f163524a);
            }
        }
        kVar.s5(new e(this, cVar));
        kVar.o0(new g(kVar, this, cVar));
    }
}
