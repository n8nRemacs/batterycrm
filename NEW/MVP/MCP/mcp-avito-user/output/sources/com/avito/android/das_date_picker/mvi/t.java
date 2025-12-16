package com.avito.android.das_date_picker.mvi;

import com.avito.android.das_date_picker.mvi.entity.DasCalendarInternalAction;
import com.avito.android.das_date_picker.mvi.entity.DasCalendarState;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: DasCalendarReducer.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/das_date_picker/mvi/t;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/das_date_picker/mvi/entity/DasCalendarInternalAction;", "Lcom/avito/android/das_date_picker/mvi/entity/DasCalendarState;", "_avito_das-date-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class t implements com.avito.android.arch.mvi.u<DasCalendarInternalAction, DasCalendarState> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final v f132459b;

    @Inject
    public t(@Y61.k v vVar) {
        this.f132459b = vVar;
    }

    @Override // com.avito.android.arch.mvi.u
    public final DasCalendarState a(DasCalendarInternalAction dasCalendarInternalAction, DasCalendarState dasCalendarState) {
        DasCalendarInternalAction dasCalendarInternalAction2 = dasCalendarInternalAction;
        DasCalendarState dasCalendarState2 = dasCalendarState;
        boolean z12 = dasCalendarInternalAction2 instanceof DasCalendarInternalAction.Init;
        v vVar = this.f132459b;
        if (z12) {
            return vVar.a(new s(dasCalendarInternalAction2, dasCalendarState2));
        }
        if (dasCalendarInternalAction2 instanceof DasCalendarInternalAction.DayClick) {
            return vVar.c(DasCalendarState.a(dasCalendarState2, null, ((DasCalendarInternalAction.DayClick) dasCalendarInternalAction2).f132374b, null, null, null, null, null, null, 253));
        }
        if (!(dasCalendarInternalAction2 instanceof DasCalendarInternalAction.ShowCalendarContent)) {
            return dasCalendarInternalAction2 instanceof DasCalendarInternalAction.ShowLoading ? vVar.b(DasCalendarState.a(dasCalendarState2, null, null, null, null, null, null, DasCalendarState.Companion.LoadingState.f132392b, null, 191)) : dasCalendarState2;
        }
        DasCalendarInternalAction.ShowCalendarContent showCalendarContent = (DasCalendarInternalAction.ShowCalendarContent) dasCalendarInternalAction2;
        return vVar.b(DasCalendarState.a(dasCalendarState2, null, null, null, null, showCalendarContent.f132380c, showCalendarContent.f132379b, DasCalendarState.Companion.LoadingState.f132393c, null, 143));
    }
}
