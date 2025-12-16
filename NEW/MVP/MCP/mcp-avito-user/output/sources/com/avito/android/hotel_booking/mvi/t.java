package com.avito.android.hotel_booking.mvi;

import com.avito.android.util.A4;
import com.avito.android.util.R0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43137a0;
import kotlinx.coroutines.flow.C43175k;

/* compiled from: HotelBookingInteractor.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/hotel_booking/mvi/t;", "", "_avito_hotel-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final DI.c f163963a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.hotel_booking.domain.a f163964b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.hotel_booking.domain.g f163965c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final MI.a f163966d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final R0 f163967e;

    @Inject
    public t(@Y61.k DI.c cVar, @Y61.k com.avito.android.hotel_booking.domain.a aVar, @Y61.k com.avito.android.hotel_booking.domain.g gVar, @Y61.k MI.a aVar2, @Y61.k R0 r02) {
        this.f163963a = cVar;
        this.f163964b = aVar;
        this.f163965c = gVar;
        this.f163966d = aVar2;
        this.f163967e = r02;
    }

    public static final HashMap a(t tVar, List list) {
        tVar.getClass();
        List list2 = list;
        ArrayList arrayList = new ArrayList(C42745f0.q(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf(((Number) it.next()).intValue()));
        }
        A4.f318516a.getClass();
        return A4.f("childAges", arrayList);
    }

    @Y61.k
    public final C43137a0 b(@Y61.k String str, @Y61.l Integer num, @Y61.l List list, @Y61.l String str2, @Y61.l String str3, @Y61.l String str4, @Y61.l String str5, @Y61.k Map map, boolean z12) {
        return new C43137a0(new s(2, null), C43175k.I(this.f163967e.a(), C43175k.G(new r(this, list, str, num, str2, str3, str4, str5, map, z12, null))));
    }
}
