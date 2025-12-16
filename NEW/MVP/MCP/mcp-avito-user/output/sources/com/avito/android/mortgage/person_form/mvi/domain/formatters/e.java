package com.avito.android.mortgage.person_form.mvi.domain.formatters;

import Y61.k;
import androidx.compose.runtime.internal.P;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.text.C43066x;

/* compiled from: MortgagePhoneFormatter.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/mortgage/person_form/mvi/domain/formatters/e;", "Lcom/avito/android/mortgage/person_form/mvi/domain/formatters/d;", "<init>", "()V", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class e implements d {
    @Inject
    public e() {
    }

    @Override // com.avito.android.mortgage.person_form.mvi.domain.formatters.d
    @k
    public final String a(@k String str) {
        return str.length() == 0 ? str : "7".concat(str);
    }

    @Override // com.avito.android.mortgage.person_form.mvi.domain.formatters.d
    @k
    public final String b(@k String str) {
        return str.length() == 0 ? str : C43066x.U("7", str);
    }
}
