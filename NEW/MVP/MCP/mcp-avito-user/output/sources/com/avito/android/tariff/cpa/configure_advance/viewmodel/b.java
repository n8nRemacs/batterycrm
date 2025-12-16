package com.avito.android.tariff.cpa.configure_advance.viewmodel;

import androidx.compose.runtime.internal.P;
import bC0.C25495d;
import com.avito.android.remote.model.ButtonAction;
import java.util.ArrayList;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: ConfigureAdvanceConverter.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/tariff/cpa/configure_advance/viewmodel/b;", "Lcom/avito/android/tariff/cpa/configure_advance/viewmodel/a;", "<init>", "()V", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class b implements InterfaceC35205a {
    @Inject
    public b() {
    }

    @Override // com.avito.android.tariff.cpa.configure_advance.viewmodel.InterfaceC35205a
    @Y61.k
    public final com.avito.android.tariff.cpa.configure_advance.ui.c a(@Y61.k C25495d c25495d) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new com.avito.android.tariff.cpa.configure_advance.items.header.a(c25495d.getTitle(), c25495d.getDescription()));
        arrayList.add(new com.avito.android.tariff.cpa.configure_advance.items.advance_info.a("advance_info_item", String.valueOf(c25495d.getAdvanceInfo().getValue()), c25495d.getAdvanceInfo().getMinValueMessage(), c25495d.getAdvanceInfo().getPlaceholder(), c25495d.getAdvanceInfo().getValue() >= c25495d.getAdvanceInfo().getMinValue()));
        bC0.i extraInfo = c25495d.getExtraInfo();
        if (extraInfo != null) {
            arrayList.add(new com.avito.android.tariff.cpa.configure_advance.items.extra_info.a(extraInfo.getTitle(), extraInfo.getDescription()));
        }
        ButtonAction button = c25495d.getButton();
        int value = c25495d.getAdvanceInfo().getValue();
        int minValue = c25495d.getAdvanceInfo().getMinValue();
        bC0.e confirmInfo = c25495d.getConfirmInfo();
        return new com.avito.android.tariff.cpa.configure_advance.ui.c(arrayList, button, value, minValue, new com.avito.android.tariff.cpa.configure_advance.ui.a(confirmInfo.getTitle(), confirmInfo.getDescription(), confirmInfo.getConfirmButton(), confirmInfo.getCancelButton()));
    }
}
