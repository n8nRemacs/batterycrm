package com.avito.android.vas_planning_calendar.view.konveyor.items.day;

import Y61.k;
import java.util.Date;
import kotlin.Metadata;
import l41.g;

/* compiled from: DayItemPresenter.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/vas_planning_calendar/view/konveyor/items/day/d;", "LTV0/d;", "Lcom/avito/android/vas_planning_calendar/view/konveyor/items/day/e;", "Lcom/avito/android/vas_planning_calendar/view/konveyor/items/day/a;", "_avito_vas-planning_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class d implements TV0.d<e, a> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final g<Date> f322710b;

    public d(@k g<Date> gVar) {
        this.f322710b = gVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        a aVar2 = (a) aVar;
        ((e) eVar).Pr(aVar2.f322703c, aVar2.f322704d, this.f322710b, aVar2.f322705e);
    }
}
