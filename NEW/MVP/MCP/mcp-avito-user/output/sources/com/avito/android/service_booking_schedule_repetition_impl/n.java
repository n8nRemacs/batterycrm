package com.avito.android.service_booking_schedule_repetition_impl;

import Nt0.InterfaceC14610a;
import android.content.DialogInterface;
import com.avito.android.R;
import com.avito.android.lib.design.button.Button;
import com.avito.android.service_booking_calendar.view.day.d;
import com.avito.android.service_booking_schedule_repetition_impl.mvi.entity.ScheduleRepetitionState;
import com.avito.android.util.D6;
import com.avito.android.util.N0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kd0.C42670a;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ServiceBookingScheduleRepetitionSheet.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/service_booking_schedule_repetition_impl/mvi/entity/ScheduleRepetitionState;", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/service_booking_schedule_repetition_impl/mvi/entity/ScheduleRepetitionState;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class n extends N implements Y41.l<ScheduleRepetitionState, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ ServiceBookingScheduleRepetitionSheet f277749l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(ServiceBookingScheduleRepetitionSheet serviceBookingScheduleRepetitionSheet) {
        super(1);
        this.f277749l = serviceBookingScheduleRepetitionSheet;
    }

    /* JADX WARN: Type inference failed for: r0v22, types: [java.lang.Object, kotlin.C] */
    /* JADX WARN: Type inference failed for: r0v35, types: [java.lang.Object, kotlin.C] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.C] */
    @Override // Y41.l
    public final G0 invoke(ScheduleRepetitionState scheduleRepetitionState) {
        ScheduleRepetitionState scheduleRepetitionState2 = scheduleRepetitionState;
        ServiceBookingScheduleRepetitionSheet serviceBookingScheduleRepetitionSheet = this.f277749l;
        e eVar = serviceBookingScheduleRepetitionSheet.f277539l0;
        if (eVar == null) {
            eVar = null;
        }
        final m mVar = new m(1, (b) serviceBookingScheduleRepetitionSheet.f277538k0.getValue(), b.class, "accept", "accept(Ljava/lang/Object;)V", 0);
        eVar.getClass();
        boolean z12 = scheduleRepetitionState2.f277709b;
        ScheduleRepetitionState.Content content = scheduleRepetitionState2.f277711d;
        q qVar = eVar.f277592c;
        if (z12) {
            C42670a.d(qVar.f277753c);
            ((com.avito.android.service_booking_utils.save_schedule_modal.b) qVar.f277756f.f278392b.getValue()).setViewLoading(true);
        } else if (scheduleRepetitionState2.f277710c != null) {
            qVar.f277753c.c(null, new h(qVar, scheduleRepetitionState2, eVar));
            ((com.avito.android.service_booking_utils.save_schedule_modal.b) qVar.f277756f.f278392b.getValue()).setViewLoading(false);
        } else if (content != null) {
            qVar.f277753c.b();
            ((com.avito.android.service_booking_utils.save_schedule_modal.b) qVar.f277756f.f278392b.getValue()).setViewLoading(false);
            String string = qVar.f277752b.getString(R.string.sb_schedule_repetition_clear);
            com.avito.android.lib.design.bottom_sheet.d dVar = eVar.f277591b;
            dVar.L(content.f277715b, string, true, true);
            dVar.P(new i(mVar));
            List<com.avito.android.service_booking_calendar.a> list = content.f277714a;
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                com.avito.android.service_booking_calendar.a aVar = (com.avito.android.service_booking_calendar.a) obj;
                if ((aVar instanceof d.a) && ((d.a) aVar).f276190c.getF277639e()) {
                    arrayList.add(obj);
                }
            }
            dVar.x(arrayList.size() != 1);
            qVar.f277754d.setCalendarData(list);
            String str = content.f277716c;
            Button button = qVar.f277755e;
            button.setText(str);
            D6.G(button, !((Collection) content.f277718e).isEmpty());
            button.setOnClickListener(new com.avito.android.seller_promotions.b(11, mVar));
        }
        Boolean boolValueOf = Boolean.valueOf(scheduleRepetitionState2.f277712e.f277726b);
        final ScheduleRepetitionState.Content.SaveScheduleInfo saveScheduleInfo = content != null ? content.f277717d : null;
        if (!boolValueOf.equals(Boolean.TRUE) || saveScheduleInfo == null) {
            com.avito.android.lib.design.modal.a aVar2 = qVar.f277757g;
            if (aVar2 != null) {
                N0.a(aVar2);
            }
        } else {
            com.avito.android.lib.design.modal.a aVarC = qVar.f277757g;
            if (aVarC == null) {
                com.avito.android.service_booking_utils.save_schedule_modal.f fVar = qVar.f277756f;
                fVar.f278393c = saveScheduleInfo.f277719b;
                fVar.f278394d = saveScheduleInfo.f277720c;
                ScheduleRepetitionState.Content.SaveScheduleInfo.ActionButtonItem actionButtonItem = saveScheduleInfo.f277721d;
                fVar.a(actionButtonItem.f277724b, actionButtonItem.f277725c, new f(mVar));
                ScheduleRepetitionState.Content.SaveScheduleInfo.ActionButtonItem actionButtonItem2 = saveScheduleInfo.f277722e;
                fVar.b(actionButtonItem2.f277724b, actionButtonItem2.f277725c, new g(mVar));
                aVarC = fVar.c();
            }
            qVar.f277757g = aVarC;
            aVarC.setOnShowListener(new DialogInterface.OnShowListener() { // from class: com.avito.android.service_booking_schedule_repetition_impl.d
                @Override // android.content.DialogInterface.OnShowListener
                public final void onShow(DialogInterface dialogInterface) {
                    ((m) mVar).invoke(new InterfaceC14610a.f(saveScheduleInfo.f277723f));
                }
            });
            com.avito.android.lib.design.modal.a aVar3 = qVar.f277757g;
            if (aVar3 != null) {
                com.avito.android.lib.util.g.a(aVar3);
            }
        }
        return G0.f406611a;
    }
}
