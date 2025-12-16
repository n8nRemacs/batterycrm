package com.avito.android.str_calendar.seller.calandar_parameters.mvi;

import Gy0.c;
import Gy0.e;
import androidx.compose.runtime.internal.P;
import com.avito.android.category_parameters.ParameterElement;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.remote.model.StrSellerCalendarParameters;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.L;

/* compiled from: StrCalendarParametersViewStateBuilder.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_calendar/seller/calandar_parameters/mvi/w;", "Lcom/avito/android/str_calendar/seller/calandar_parameters/mvi/v;", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class w implements v {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final k f287456a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.str_calendar.seller.calandar_parameters.t f287457b;

    @Inject
    public w(@Y61.k k kVar, @Y61.k com.avito.android.str_calendar.seller.calandar_parameters.t tVar) {
        this.f287456a = kVar;
        this.f287457b = tVar;
    }

    @Override // com.avito.android.str_calendar.seller.calandar_parameters.mvi.v
    @Y61.k
    public final Gy0.e a(@Y61.k Gy0.e eVar) {
        e.b.C0389b c0389b = e.b.C0389b.f6896a;
        e.b bVar = eVar.f6879f;
        if (!L.f(bVar, c0389b)) {
            if (L.f(bVar, e.b.c.f6897a)) {
                return Gy0.e.a(eVar, null, null, null, null, null, null, null, false, false, null, null, null, null, false, false, null, null, c.d.f6849d, 524287);
            }
            if (L.f(bVar, e.b.a.f6895a)) {
                return Gy0.e.a(eVar, null, null, null, null, null, null, null, false, false, null, null, null, null, false, false, null, null, c.C0387c.f6848d, 524287);
            }
            throw new NoWhenBranchMatchedException();
        }
        StrSellerCalendarParameters strSellerCalendarParameters = eVar.f6875b;
        if (strSellerCalendarParameters == null) {
            return Gy0.e.a(eVar, null, null, null, null, null, null, null, false, false, null, null, null, null, false, false, null, null, c.C0387c.f6848d, 524287);
        }
        List<com.avito.conveyor_item.a> listE = this.f287456a.e(eVar.f6876c);
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(listE);
        arrayList.add(new com.avito.android.str_calendar.seller.calandar_parameters.items.disclaimer.a(null, strSellerCalendarParameters.getDisclaimer(), 1, null));
        return Gy0.e.a(eVar, null, null, null, null, null, null, null, false, false, null, null, null, null, false, false, null, null, new c.b(arrayList), 524287);
    }

    @Override // com.avito.android.str_calendar.seller.calandar_parameters.mvi.v
    @Y61.k
    public final Gy0.e b(@Y61.k Gy0.e eVar) {
        List list;
        PrintableText printableTextE = this.f287457b.e(eVar.f6886m, eVar.f6887n);
        ParameterElement.C.b bVar = eVar.f6880g;
        if (bVar == null || (list = bVar.f117236E) == null) {
            list = C42784z0.f406748b;
        }
        eVar.f6893t.getClass();
        return Gy0.e.a(eVar, null, null, null, null, null, null, null, false, false, null, null, null, null, false, false, null, new Gy0.b(printableTextE, eVar.f6882i, eVar.f6883j, list), null, 786431);
    }
}
