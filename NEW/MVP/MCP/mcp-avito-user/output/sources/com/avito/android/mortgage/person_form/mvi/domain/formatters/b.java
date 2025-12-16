package com.avito.android.mortgage.person_form.mvi.domain.formatters;

import Y61.k;
import androidx.compose.runtime.internal.P;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.text.C43066x;

/* compiled from: MortgageDateFormatter.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/mortgage/person_form/mvi/domain/formatters/b;", "Lcom/avito/android/mortgage/person_form/mvi/domain/formatters/a;", "<init>", "()V", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class b implements a {
    @Inject
    public b() {
    }

    @Override // com.avito.android.mortgage.person_form.mvi.domain.formatters.a
    @k
    public final String a(@k String str) {
        return str.length() == 0 ? "" : C42745f0.O(C42745f0.q0(C43066x.f0(str, new String[]{"."}, 0, 6)), "-", null, null, null, 62);
    }

    @Override // com.avito.android.mortgage.person_form.mvi.domain.formatters.a
    @k
    public final String b(@k String str) {
        return str.length() == 0 ? "" : C42745f0.O(C42745f0.q0(C43066x.f0(str, new String[]{"-"}, 0, 6)), ".", null, null, null, 62);
    }
}
