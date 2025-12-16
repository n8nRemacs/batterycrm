package com.avito.beduin.v2.avito.component.date_picker.state;

import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.beduin.v2.avito.component.date_picker.state.AvitoDatePickerState;
import com.avito.beduin.v2.engine.component.AbstractC36250j;
import com.avito.beduin.v2.engine.component.G;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: AvitoDatePickerStateFactory.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/beduin/v2/engine/component/G;", "Lcom/avito/beduin/v2/avito/component/date_picker/state/AvitoDatePickerState;", "invoke", "(Lcom/avito/beduin/v2/engine/component/G;)Lcom/avito/beduin/v2/avito/component/date_picker/state/AvitoDatePickerState;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class e extends N implements Y41.l<G, AvitoDatePickerState> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ AbstractC36250j.b f334181l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(AbstractC36250j.b bVar) {
        super(1);
        this.f334181l = bVar;
    }

    @Override // Y41.l
    public final AvitoDatePickerState invoke(G g12) {
        G g13 = g12;
        AbstractC36250j.b bVar = this.f334181l;
        com.avito.beduin.v2.component.common.utils.a aVarA = com.avito.beduin.v2.component.common.utils.h.a(bVar);
        i iVar = i.f334185c;
        ET0.a aVarB = i.b(iVar, g13, "selectedDates");
        ET0.a aVarB2 = i.b(iVar, g13, "specialDates");
        ET0.a aVarB3 = i.b(iVar, g13, "disabledDates");
        ST0.d dVarC = i.c(iVar, g13, "initialMonthMillis");
        Integer numA = g13.a("countOfDisplayedMonths");
        AvitoDatePickerState.c cVar = (AvitoDatePickerState.c) g13.f(h.f334184l, "selectionType", "selectionType");
        Boolean boolC = g13.c("highlightWeekend");
        Boolean boolC2 = g13.c("enableBackgroundForDisabledDates");
        Boolean boolC3 = g13.c("isLoading");
        String string = g13.getString("disableDatesOption");
        return new AvitoDatePickerState(aVarB, aVarB2, aVarB3, dVarC, numA, cVar, boolC, boolC2, boolC3, string != null ? AvitoDatePickerState.DatePickerDisableDatesOption.valueOf(string) : null, i.c(iVar, g13, "initialDisplayedMonthMillis"), (Y41.l) g13.d(new b(bVar), "onSpecialDateClicked", "onSpecialDateClicked"), (Y41.l) g13.d(new d(bVar), "onSelectedDatesChange", "onSelectedDatesChange"), com.avito.beduin.v2.theme.h.c(g13, BeduinPromoBlockModel.SERIALIZED_NAME_STYLE, q.f334218b), aVarA.f335704b, aVarA.f335705c, aVarA.f335706d, aVarA.f335707e, aVarA.f335703a);
    }
}
