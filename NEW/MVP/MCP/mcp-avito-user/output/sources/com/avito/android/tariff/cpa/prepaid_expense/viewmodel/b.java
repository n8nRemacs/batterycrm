package com.avito.android.tariff.cpa.prepaid_expense.viewmodel;

import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.ButtonAction;
import java.util.ArrayList;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: PublicationAdvanceConverter.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/tariff/cpa/prepaid_expense/viewmodel/b;", "Lcom/avito/android/tariff/cpa/prepaid_expense/viewmodel/a;", "<init>", "()V", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class b implements InterfaceC35206a {
    @Inject
    public b() {
    }

    @Override // com.avito.android.tariff.cpa.prepaid_expense.viewmodel.InterfaceC35206a
    @Y61.k
    public final com.avito.android.tariff.cpa.prepaid_expense.ui.c a(@Y61.k bC0.j jVar) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new com.avito.android.tariff.cpa.prepaid_expense.items.header.a(jVar.getTitle(), jVar.getDescription()));
        arrayList.add(new com.avito.android.tariff.cpa.prepaid_expense.items.advance_Info.a("advance_info_item", String.valueOf(jVar.getAdvanceInfo().getValue()), jVar.getAdvanceInfo().getMinValueMessage(), jVar.getAdvanceInfo().getPlaceholder(), jVar.getAdvanceInfo().getValue() >= jVar.getAdvanceInfo().getMinValue()));
        bC0.i extraInfo = jVar.getExtraInfo();
        if (extraInfo != null) {
            arrayList.add(new com.avito.android.tariff.cpa.prepaid_expense.items.extra_info.a(extraInfo.getTitle(), extraInfo.getDescription()));
        }
        ButtonAction button = jVar.getButton();
        int value = jVar.getAdvanceInfo().getValue();
        int minValue = jVar.getAdvanceInfo().getMinValue();
        String context = jVar.getContext();
        bC0.e confirmInfo = jVar.getConfirmInfo();
        return new com.avito.android.tariff.cpa.prepaid_expense.ui.c(arrayList, button, value, minValue, context, new com.avito.android.tariff.cpa.prepaid_expense.ui.a(confirmInfo.getTitle(), confirmInfo.getDescription(), confirmInfo.getConfirmButton(), confirmInfo.getCancelButton()));
    }
}
