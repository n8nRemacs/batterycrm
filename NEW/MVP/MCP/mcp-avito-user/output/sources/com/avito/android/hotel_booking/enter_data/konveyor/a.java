package com.avito.android.hotel_booking.enter_data.konveyor;

import androidx.recyclerview.widget.C23424o;
import com.avito.android.hotel_booking.enter_data.konveyor.input.c;
import com.avito.android.hotel_booking.enter_data.konveyor.input.d;
import com.avito.android.hotel_booking.enter_data.konveyor.input.j;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: EnterDataCallback.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/hotel_booking/enter_data/konveyor/a;", "Landroidx/recyclerview/widget/o$f;", "LTV0/a;", "<init>", "()V", "_avito_hotel-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class a extends C23424o.f<TV0.a> {
    @Inject
    public a() {
    }

    @Override // androidx.recyclerview.widget.C23424o.f
    public final boolean a(TV0.a aVar, TV0.a aVar2) {
        return aVar.equals(aVar2);
    }

    @Override // androidx.recyclerview.widget.C23424o.f
    public final boolean b(TV0.a aVar, TV0.a aVar2) {
        TV0.a aVar3 = aVar;
        TV0.a aVar4 = aVar2;
        return aVar3.getF124056b() == aVar4.getF124056b() && aVar3.getClass().equals(aVar4.getClass());
    }

    @Override // androidx.recyclerview.widget.C23424o.f
    public final Object c(TV0.a aVar, TV0.a aVar2) {
        TV0.a aVar3 = aVar;
        TV0.a aVar4 = aVar2;
        if (!(aVar3 instanceof c) || !(aVar4 instanceof c)) {
            return null;
        }
        c cVar = (c) aVar4;
        c cVar2 = (c) aVar3;
        String str = cVar2.f163510e;
        String str2 = cVar.f163510e;
        if (L.f(str, str2)) {
            str2 = null;
        }
        String str3 = cVar2.f163511f;
        String str4 = cVar.f163511f;
        if (L.f(str3, str4)) {
            str4 = null;
        }
        j jVar = cVar2.f163512g;
        j jVar2 = cVar.f163512g;
        if (L.f(jVar, jVar2)) {
            jVar2 = null;
        }
        d dVar = new d(str2, str4, jVar2);
        if (str2 == null && str4 == null && jVar2 == null) {
            return null;
        }
        return dVar;
    }
}
