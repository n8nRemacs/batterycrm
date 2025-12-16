package com.avito.android.hotel_booking.enter_data.mvi;

import com.avito.android.hotel_booking.Group;
import com.avito.android.hotel_booking.Input;
import com.avito.android.hotel_booking.enter_data.konveyor.input.j;
import com.avito.android.hotel_booking.enter_data.mvi.entity.EnterDataInternalAction;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.util.y6;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42756l;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: EnterDataReducer.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/hotel_booking/enter_data/mvi/m;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/hotel_booking/enter_data/mvi/entity/EnterDataInternalAction;", "LQI/c;", "_avito_hotel-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class m implements com.avito.android.arch.mvi.u<EnterDataInternalAction, QI.c> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final s f163588b;

    @Inject
    public m(@Y61.k s sVar) {
        this.f163588b = sVar;
    }

    @Override // com.avito.android.arch.mvi.u
    public final QI.c a(EnterDataInternalAction enterDataInternalAction, QI.c cVar) {
        ArrayList arrayList;
        EnterDataInternalAction enterDataInternalAction2 = enterDataInternalAction;
        QI.c cVar2 = cVar;
        if (enterDataInternalAction2 instanceof EnterDataInternalAction.Init) {
            return QI.c.a(cVar2, null, ((EnterDataInternalAction.Init) enterDataInternalAction2).f163573b, null, false, null, 29);
        }
        if (!(enterDataInternalAction2 instanceof EnterDataInternalAction.Content)) {
            return enterDataInternalAction2 instanceof EnterDataInternalAction.UpdateGroups ? b(QI.c.a(cVar2, ((EnterDataInternalAction.UpdateGroups) enterDataInternalAction2).f163574b, null, null, false, null, 30)) : enterDataInternalAction2 instanceof EnterDataInternalAction.UpdateKeyboardVisibility ? b(QI.c.a(cVar2, null, null, null, ((EnterDataInternalAction.UpdateKeyboardVisibility) enterDataInternalAction2).f163575b, null, 23)) : cVar2;
        }
        List<Group> list = ((EnterDataInternalAction.Content) enterDataInternalAction2).f163572b;
        if (list != null) {
            List<Group> list2 = list;
            ArrayList arrayList2 = new ArrayList(C42745f0.q(list2, 10));
            int i12 = 0;
            for (Object obj : list2) {
                int i13 = i12 + 1;
                if (i12 < 0) {
                    C42745f0.H0();
                    throw null;
                }
                arrayList2.add(Group.a((Group) obj, "enter_data_group_id" + i12, null, 6));
                i12 = i13;
            }
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        return b(QI.c.a(cVar2, arrayList, null, arrayList, false, null, 26));
    }

    public final QI.c b(QI.c cVar) {
        this.f163588b.getClass();
        List<Group> list = cVar.f13665b;
        List<Group> list2 = list == null ? C42784z0.f406748b : list;
        ArrayList arrayList = new ArrayList();
        int i12 = 0;
        for (Object obj : list2) {
            int i13 = i12 + 1;
            if (i12 < 0) {
                C42745f0.H0();
                throw null;
            }
            Group group = (Group) obj;
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(new com.avito.android.hotel_booking.konveyor.spacing.c("enter_data_spacing_id", y6.b(i12 == 0 ? 16 : 34)));
            String title = group.getTitle();
            if (title == null) {
                title = "";
            }
            arrayList2.add(new com.avito.android.hotel_booking.enter_data.konveyor.text.c(title));
            arrayList2.add(new com.avito.android.hotel_booking.konveyor.spacing.c("enter_data_spacing_id", y6.b(12)));
            List<Input> listC = group.c();
            if (listC == null) {
                listC = C42784z0.f406748b;
            }
            ArrayList arrayList3 = new ArrayList();
            int i14 = 0;
            for (Object obj2 : listC) {
                int i15 = i14 + 1;
                if (i14 < 0) {
                    C42745f0.H0();
                    throw null;
                }
                Input input = (Input) obj2;
                com.avito.android.hotel_booking.konveyor.spacing.c cVar2 = i14 != 0 ? new com.avito.android.hotel_booking.konveyor.spacing.c("enter_data_spacing_id", y6.b(6)) : null;
                PrintableText printableText = input.f163267b;
                C42745f0.h(C42756l.B(new com.avito.conveyor_item.a[]{cVar2, new com.avito.android.hotel_booking.enter_data.konveyor.input.c("enter_data_input_id" + input.getId(), input.getId(), group.f163212b, input.getText(), input.getHint(), printableText != null ? new j.a(printableText) : j.b.f163525a)}), arrayList3);
                i14 = i15;
            }
            arrayList2.addAll(arrayList3);
            if (list != null && i13 == list.size()) {
                arrayList2.add(new com.avito.android.hotel_booking.konveyor.spacing.c("enter_data_spacing_id", y6.b(12)));
            }
            C42745f0.h(arrayList2, arrayList);
            i12 = i13;
        }
        boolean z12 = !L.f(list, cVar.f13667d);
        boolean z13 = true ^ cVar.f13668e;
        cVar.f13669f.getClass();
        return QI.c.a(cVar, null, null, null, false, new QI.d(arrayList, z12, z13), 15);
    }
}
