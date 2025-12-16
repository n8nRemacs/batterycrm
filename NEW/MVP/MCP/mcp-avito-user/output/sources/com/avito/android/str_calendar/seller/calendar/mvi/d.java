package com.avito.android.str_calendar.seller.calendar.mvi;

import Hy0.C14050b;
import Jy0.InterfaceC14261a;
import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.a;
import com.avito.android.str_calendar.seller.calendar.mvi.entity.StrSellerCalendarInternalAction;
import com.avito.android.str_calendar.seller.calendar.mvi.entity.StrSellerCalendarState;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: StrSellerCalendarActor.kt */
@P
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/str_calendar/seller/calendar/mvi/d;", "Lcom/avito/android/arch/mvi/a;", "LJy0/a;", "Lcom/avito/android/str_calendar/seller/calendar/mvi/entity/StrSellerCalendarInternalAction;", "Lcom/avito/android/str_calendar/seller/calendar/mvi/entity/StrSellerCalendarState;", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class d implements com.avito.android.arch.mvi.a<InterfaceC14261a, StrSellerCalendarInternalAction, StrSellerCalendarState> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.str_calendar.seller.calendar.data.a f287679a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.str_calendar.seller.calendar.data.m f287680b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final C14050b f287681c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final Cy0.b f287682d;

    @Inject
    public d(@Y61.k com.avito.android.str_calendar.seller.calendar.data.a aVar, @Y61.k com.avito.android.str_calendar.seller.calendar.data.m mVar, @Y61.k C14050b c14050b, @Y61.k Cy0.b bVar) {
        this.f287679a = aVar;
        this.f287680b = mVar;
        this.f287681c = c14050b;
        this.f287682d = bVar;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<StrSellerCalendarInternalAction> b(InterfaceC14261a interfaceC14261a, StrSellerCalendarState strSellerCalendarState) {
        InterfaceC14261a interfaceC14261a2 = interfaceC14261a;
        StrSellerCalendarState strSellerCalendarState2 = strSellerCalendarState;
        if (interfaceC14261a2 instanceof InterfaceC14261a.C0547a) {
            return new C43210w(StrSellerCalendarInternalAction.ClearSelectedDates.f287697b);
        }
        if (interfaceC14261a2 instanceof InterfaceC14261a.b) {
            return new C43210w(StrSellerCalendarInternalAction.CloseScreen.f287700b);
        }
        if (interfaceC14261a2 instanceof InterfaceC14261a.c) {
            return C43175k.G(new a(strSellerCalendarState2, (InterfaceC14261a.c) interfaceC14261a2, null));
        }
        if (interfaceC14261a2 instanceof InterfaceC14261a.d) {
            return C43175k.G(new b(strSellerCalendarState2, this, null));
        }
        if (interfaceC14261a2 instanceof InterfaceC14261a.e) {
            return C43175k.G(new c(strSellerCalendarState2, null));
        }
        if (interfaceC14261a2 instanceof InterfaceC14261a.f) {
            return C43175k.N(new C43210w(StrSellerCalendarInternalAction.ClearSelectedDates.f287697b), this.f287679a.a(strSellerCalendarState2.f287721h, wy0.b.d(this.f287680b.a().getTime())));
        }
        throw new NoWhenBranchMatchedException();
    }
}
