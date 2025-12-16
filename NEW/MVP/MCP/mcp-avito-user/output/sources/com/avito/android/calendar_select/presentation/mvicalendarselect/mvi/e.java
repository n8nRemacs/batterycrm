package com.avito.android.calendar_select.presentation.mvicalendarselect.mvi;

import com.avito.android.calendar_select.CalendarSettings;
import com.avito.android.calendar_select.presentation.mvicalendarselect.mvi.entity.CalendarSelectInternalAction;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: CalendarSelectBootstrap.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/calendar_select/presentation/mvicalendarselect/mvi/e;", "Lcom/avito/android/arch/mvi/b;", "Lcom/avito/android/calendar_select/presentation/mvicalendarselect/mvi/entity/CalendarSelectInternalAction;", "_avito_calendar-select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class e implements com.avito.android.arch.mvi.b<CalendarSelectInternalAction> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final CalendarSettings f113415a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.calendar_select.domain.e f113416b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.calendar_select.presentation.view.data.g f113417c;

    @Inject
    public e(@Y61.k CalendarSettings calendarSettings, @Y61.k com.avito.android.calendar_select.domain.e eVar, @Y61.k com.avito.android.calendar_select.presentation.view.data.g gVar) {
        this.f113415a = calendarSettings;
        this.f113416b = eVar;
        this.f113417c = gVar;
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.k
    public final InterfaceC43160i<CalendarSelectInternalAction> a() {
        CalendarSettings calendarSettings = this.f113415a;
        if (calendarSettings.f113319h != null) {
            return this.f113416b.a(CalendarSelectInternalAction.LoadingType.f113432b);
        }
        com.avito.android.calendar_select.presentation.view.data.m mVarA = this.f113417c.a(calendarSettings);
        CalendarSettings.Button button = calendarSettings.f113318g;
        String str = button != null ? button.f113323b : null;
        String str2 = calendarSettings.f113322k;
        return new C43210w(new CalendarSelectInternalAction.InitCalendar(mVarA, calendarSettings.f113316e, str, str2 != null ? Xl.b.a(str2) : null));
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.l
    public final Object b(@Y61.k Continuation<? super G0> continuation) {
        return G0.f406611a;
    }
}
