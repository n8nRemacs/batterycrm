package com.avito.android.advert.item.leasing_calculator.formatters;

import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.LeasingCalculator;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: AdvertLeasingInputValidator.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert/item/leasing_calculator/formatters/e;", "Lcom/avito/android/advert/item/leasing_calculator/formatters/d;", "<init>", "()V", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class e implements d {
    @Inject
    public e() {
    }

    @Override // com.avito.android.advert.item.leasing_calculator.formatters.d
    public final boolean a(@Y61.l LeasingCalculator.LeasingInputTerm leasingInputTerm) {
        if (leasingInputTerm == null) {
            return true;
        }
        Long value = leasingInputTerm.getValue();
        Long min = leasingInputTerm.getMin();
        Long max = leasingInputTerm.getMax();
        if (min == null && max == null) {
            return true;
        }
        return value != null && (min == null || value.longValue() >= min.longValue()) && (max == null || value.longValue() <= max.longValue());
    }
}
