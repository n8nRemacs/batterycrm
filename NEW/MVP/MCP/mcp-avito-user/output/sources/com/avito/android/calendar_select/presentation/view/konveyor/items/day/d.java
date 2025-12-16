package com.avito.android.calendar_select.presentation.view.konveyor.items.day;

import Y41.l;
import Y61.k;
import java.time.LocalDate;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: DayItemPresenter.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/calendar_select/presentation/view/konveyor/items/day/d;", "LTV0/d;", "Lcom/avito/android/calendar_select/presentation/view/konveyor/items/day/e;", "Lcom/avito/android/calendar_select/presentation/view/konveyor/items/day/a;", "_avito_calendar-select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class d implements TV0.d<e, a> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final l<LocalDate, G0> f113520b;

    /* JADX WARN: Multi-variable type inference failed */
    public d(@k l<? super LocalDate, G0> lVar) {
        this.f113520b = lVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        a aVar2 = (a) aVar;
        ((e) eVar).rt(aVar2.f113513c, aVar2.f113514d, this.f113520b, aVar2.f113515e);
    }
}
