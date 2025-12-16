package com.avito.android.calendar_select.presentation.mvicalendarselect.mvi;

import Rl.c;
import com.avito.android.R;
import com.avito.android.arch.mvi.u;
import com.avito.android.calendar_select.CalendarSelectionType;
import com.avito.android.calendar_select.presentation.mvicalendarselect.mvi.entity.CalendarSelectInternalAction;
import com.avito.android.error.z;
import com.avito.android.util.O2;
import java.time.LocalDate;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: CalendarSelectReducer.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0006B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/avito/android/calendar_select/presentation/mvicalendarselect/mvi/l;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/calendar_select/presentation/mvicalendarselect/mvi/entity/CalendarSelectInternalAction;", "LRl/c;", "<init>", "()V", "a", "_avito_calendar-select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class l implements u<CalendarSelectInternalAction, Rl.c> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public com.avito.android.calendar_select.presentation.view.data.m f113450b;

    /* compiled from: CalendarSelectReducer.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/calendar_select/presentation/mvicalendarselect/mvi/l$a;", "", "<init>", "()V", "", "RANGE_SELECTED_DATES_SIZE", "I", "_avito_calendar-select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
    }

    @Inject
    public l() {
    }

    public static c.d b(com.avito.android.calendar_select.presentation.view.data.m mVar, String str, String str2, LocalDate localDate) {
        boolean z12;
        List<LocalDate> listC = mVar.c();
        boolean z13 = !listC.isEmpty();
        if (mVar.d() == CalendarSelectionType.f113307c) {
            z12 = listC.size() == 2;
        } else {
            z12 = z13;
        }
        return new c.d(com.avito.android.printable_text.a.b(R.string.calendar_select_title, str), com.avito.android.printable_text.a.b(R.string.calendar_select_button_title, str2), z12, z13, mVar.b(), localDate != null ? Integer.valueOf(mVar.g(localDate)) : null, mVar.c());
    }

    @Override // com.avito.android.arch.mvi.u
    public final Rl.c a(CalendarSelectInternalAction calendarSelectInternalAction, Rl.c cVar) {
        List listB;
        List listB2;
        CalendarSelectInternalAction calendarSelectInternalAction2 = calendarSelectInternalAction;
        Rl.c cVar2 = cVar;
        if (calendarSelectInternalAction2 instanceof CalendarSelectInternalAction.CalendarLoadFailed) {
            this.f113450b = null;
            return new c.b(com.avito.android.printable_text.a.b(R.string.calendar_select_loading_error, z.j(((CalendarSelectInternalAction.CalendarLoadFailed) calendarSelectInternalAction2).f113418b)));
        }
        if (calendarSelectInternalAction2 instanceof CalendarSelectInternalAction.CalendarLoadSuccess) {
            CalendarSelectInternalAction.CalendarLoadSuccess calendarLoadSuccess = (CalendarSelectInternalAction.CalendarLoadSuccess) calendarSelectInternalAction2;
            com.avito.android.calendar_select.presentation.view.data.m mVar = calendarLoadSuccess.f113419b;
            this.f113450b = mVar;
            return b(mVar, calendarLoadSuccess.f113420c, calendarLoadSuccess.f113421d, calendarLoadSuccess.f113422e);
        }
        if (calendarSelectInternalAction2 instanceof CalendarSelectInternalAction.LoadingStarted) {
            return c.C0974c.f14595d;
        }
        if (calendarSelectInternalAction2 instanceof CalendarSelectInternalAction.InitCalendar) {
            CalendarSelectInternalAction.InitCalendar initCalendar = (CalendarSelectInternalAction.InitCalendar) calendarSelectInternalAction2;
            com.avito.android.calendar_select.presentation.view.data.m mVar2 = initCalendar.f113427b;
            this.f113450b = mVar2;
            return b(mVar2, initCalendar.f113428c, initCalendar.f113429d, initCalendar.f113430e);
        }
        boolean zA2 = false;
        if (calendarSelectInternalAction2.equals(CalendarSelectInternalAction.ClearSelectedDates.f113423b)) {
            c.d dVar = (c.d) (cVar2 instanceof c.d ? cVar2 : null);
            if (dVar == null) {
                return cVar2;
            }
            com.avito.android.calendar_select.presentation.view.data.m mVar3 = this.f113450b;
            if (mVar3 != null) {
                mVar3.e();
            }
            com.avito.android.calendar_select.presentation.view.data.m mVar4 = this.f113450b;
            if (mVar4 == null || (listB2 = mVar4.b()) == null) {
                listB2 = C42784z0.f406748b;
            }
            return c.d.a(dVar, false, false, listB2, C42784z0.f406748b);
        }
        if (!(calendarSelectInternalAction2 instanceof CalendarSelectInternalAction.DatePicked)) {
            return cVar2;
        }
        c.d dVar2 = (c.d) (!(cVar2 instanceof c.d) ? null : cVar2);
        if (dVar2 == null) {
            return cVar2;
        }
        com.avito.android.calendar_select.presentation.view.data.m mVar5 = this.f113450b;
        if (mVar5 != null) {
            mVar5.f(((CalendarSelectInternalAction.DatePicked) calendarSelectInternalAction2).f113425b);
        }
        com.avito.android.calendar_select.presentation.view.data.m mVar6 = this.f113450b;
        List<LocalDate> listC = mVar6 != null ? mVar6.c() : null;
        com.avito.android.calendar_select.presentation.view.data.m mVar7 = this.f113450b;
        if ((mVar7 != null ? mVar7.d() : null) != CalendarSelectionType.f113307c) {
            zA2 = O2.a(listC);
        } else if (listC != null && listC.size() == 2) {
            zA2 = true;
        }
        boolean zA3 = O2.a(listC);
        com.avito.android.calendar_select.presentation.view.data.m mVar8 = this.f113450b;
        if (mVar8 == null || (listB = mVar8.b()) == null) {
            listB = C42784z0.f406748b;
        }
        if (listC == null) {
            listC = C42784z0.f406748b;
        }
        return c.d.a(dVar2, zA2, zA3, listB, listC);
    }
}
