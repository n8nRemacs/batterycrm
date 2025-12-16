package com.avito.android.hotel_booking.konveyor.checkbox;

import Y41.l;
import Y61.k;
import java.util.List;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: BookingFormCheckboxPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/hotel_booking/konveyor/checkbox/f;", "LTV0/f;", "Lcom/avito/android/hotel_booking/konveyor/checkbox/h;", "Lcom/avito/android/hotel_booking/konveyor/checkbox/c;", "_avito_hotel-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class f implements TV0.f<h, c> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final l<RI.b, G0> f163642b;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public f(@k l<? super RI.b, G0> lVar) {
        this.f163642b = lVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        h hVar = (h) eVar;
        c cVar = (c) aVar;
        hVar.setTitle(cVar.f163634e);
        hVar.f(cVar.f163635f);
        hVar.setEnabled(cVar.f163633d);
        hVar.setChecked(cVar.f163632c);
        hVar.a(new e(this, cVar));
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
            hVar.setTitle(cVar.f163634e);
            hVar.f(cVar.f163635f);
            hVar.setEnabled(cVar.f163633d);
            hVar.setChecked(cVar.f163632c);
            hVar.a(new e(this, cVar));
            return;
        }
        String str = dVar.f163638c;
        if (str != null) {
            hVar.setTitle(str);
        }
        String str2 = dVar.f163639d;
        if (str2 != null) {
            hVar.f(str2);
        }
        Boolean bool = dVar.f163636a;
        if (bool != null) {
            hVar.setChecked(bool.booleanValue());
        }
        Boolean bool2 = dVar.f163637b;
        if (bool2 != null) {
            hVar.setEnabled(bool2.booleanValue());
        }
        hVar.a(new e(this, cVar));
    }
}
