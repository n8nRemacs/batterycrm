package com.avito.android.tariff.cpa.prepaid_expense.viewmodel;

import androidx.compose.runtime.internal.P;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: PublicationAdvanceInteractor.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/tariff/cpa/prepaid_expense/viewmodel/h;", "Lcom/avito/android/tariff/cpa/prepaid_expense/viewmodel/g;", "<init>", "()V", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class h implements g {
    @Inject
    public h() {
    }

    @Override // com.avito.android.tariff.cpa.prepaid_expense.viewmodel.g
    public final boolean a(int i12, @Y61.l Integer num) {
        return num != null && num.intValue() >= i12;
    }
}
