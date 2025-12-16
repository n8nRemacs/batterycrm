package com.avito.android.widget_filters.ui.items.dates;

import android.os.Bundle;
import com.avito.android.str_calendar.booking_calendar.StrBookingCalendarFragment;
import com.avito.android.str_calendar.booking_calendar.model.StrBookingCalendarInitParameters;
import com.avito.android.str_calendar.booking_calendar.model.StrBookingCalendarScreenConfig;
import com.avito.android.str_calendar.common.models.SelectedDateRange;
import java.util.Date;
import java.util.List;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: WidgetFiltersDatesWidgetPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/widget_filters/ui/items/dates/i;", "LTV0/f;", "Lcom/avito/android/widget_filters/ui/items/dates/k;", "Lcom/avito/android/widget_filters/ui/items/dates/e;", "_avito_widget-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class i implements TV0.f<k, e> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Y41.l<OP0.a, G0> f330380b;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public i(@Y61.k Y41.l<? super OP0.a, G0> lVar) {
        this.f330380b = lVar;
    }

    public static StrBookingCalendarFragment k(e eVar) {
        new StrBookingCalendarFragment.b();
        NP0.g gVar = eVar.f330376f;
        SelectedDateRange selectedDateRange = gVar != null ? gVar.f11451h : null;
        Date date = gVar != null ? gVar.f11452i : null;
        Date date2 = gVar != null ? gVar.f11453j : null;
        boolean z12 = gVar != null ? gVar.f11454k : false;
        StrBookingCalendarScreenConfig.WidgetFilter widgetFilter = new StrBookingCalendarScreenConfig.WidgetFilter(false, false, 3, null);
        Bundle bundle = new Bundle();
        bundle.putParcelable("extra_init_parameters", new StrBookingCalendarInitParameters(null, selectedDateRange, date, date2, z12, null, null, null, null, widgetFilter));
        StrBookingCalendarFragment strBookingCalendarFragment = new StrBookingCalendarFragment();
        strBookingCalendarFragment.setArguments(bundle);
        return strBookingCalendarFragment;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        k kVar = (k) eVar;
        e eVar2 = (e) aVar;
        StrBookingCalendarFragment strBookingCalendarFragmentK = k(eVar2);
        kVar.v2(eVar2.f330373c);
        kVar.KQ(eVar2.f330374d);
        kVar.vY(eVar2.f330375e, strBookingCalendarFragmentK);
        kVar.ZD(new f(this));
        kVar.ic(new g(this));
        kVar.p6(new h(this));
    }

    @Override // TV0.f
    public final void g2(TV0.e eVar, TV0.a aVar, int i12, List list) {
        k kVar = (k) eVar;
        e eVar2 = (e) aVar;
        Object obj = null;
        for (Object obj2 : list) {
            if (obj2 instanceof b) {
                obj = obj2;
            }
        }
        b bVar = (b) (obj instanceof b ? obj : null);
        if (bVar == null) {
            StrBookingCalendarFragment strBookingCalendarFragmentK = k(eVar2);
            kVar.v2(eVar2.f330373c);
            kVar.KQ(eVar2.f330374d);
            kVar.vY(eVar2.f330375e, strBookingCalendarFragmentK);
            kVar.ZD(new f(this));
            kVar.ic(new g(this));
            kVar.p6(new h(this));
            return;
        }
        StrBookingCalendarFragment strBookingCalendarFragmentK2 = k(eVar2);
        com.avito.android.widget_filters.ui.items.d dVar = bVar.f330363a;
        if (dVar != null) {
            kVar.v2(dVar);
        }
        a aVar2 = bVar.f330364b;
        if (aVar2 != null) {
            kVar.KQ(aVar2);
        }
        Boolean bool = bVar.f330365c;
        if (bool != null) {
            kVar.vY(bool.booleanValue(), strBookingCalendarFragmentK2);
        }
        kVar.ZD(new f(this));
        kVar.ic(new g(this));
        kVar.p6(new h(this));
    }
}
