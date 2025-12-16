package com.avito.android.hotel_booking.select_single_value.konveyor.checkmark;

import Y41.l;
import Y61.k;
import java.util.List;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: CheckmarkPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/hotel_booking/select_single_value/konveyor/checkmark/f;", "LTV0/f;", "Lcom/avito/android/hotel_booking/select_single_value/konveyor/checkmark/h;", "Lcom/avito/android/hotel_booking/select_single_value/konveyor/checkmark/c;", "_avito_hotel-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class f implements TV0.f<h, c> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final l<VI.a, G0> f164091b;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public f(@k l<? super VI.a, G0> lVar) {
        this.f164091b = lVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        h hVar = (h) eVar;
        c cVar = (c) aVar;
        hVar.setTitle(cVar.f164083d);
        hVar.f(cVar.f164084e);
        boolean z12 = cVar.f164085f;
        hVar.setChecked(z12);
        if (z12) {
            hVar.a(null);
        } else {
            hVar.a(new e(this, cVar));
        }
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
        if (!(obj instanceof d)) {
            obj = null;
        }
        d dVar = (d) obj;
        if (dVar == null) {
            hVar.setTitle(cVar.f164083d);
            hVar.f(cVar.f164084e);
            boolean z12 = cVar.f164085f;
            hVar.setChecked(z12);
            if (z12) {
                hVar.a(null);
                return;
            } else {
                hVar.a(new e(this, cVar));
                return;
            }
        }
        String str = dVar.f164086a;
        if (str != null) {
            hVar.setTitle(str);
        }
        String str2 = dVar.f164087b;
        if (str2 != null) {
            hVar.f(str2);
        }
        Boolean bool = dVar.f164088c;
        if (bool != null) {
            hVar.setChecked(bool.booleanValue());
        }
        if (cVar.f164085f) {
            hVar.a(null);
        } else {
            hVar.a(new e(this, cVar));
        }
    }
}
