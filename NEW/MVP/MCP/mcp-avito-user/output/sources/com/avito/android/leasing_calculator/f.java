package com.avito.android.leasing_calculator;

import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.text.C43066x;

/* compiled from: LeasingApplicationValidator.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/leasing_calculator/f;", "Lcom/avito/android/leasing_calculator/e;", "<init>", "()V", "_avito_leasing-calculator_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class f implements e {
    @Inject
    public f() {
    }

    @Override // com.avito.android.leasing_calculator.e
    public final boolean a(@Y61.l String str, @Y61.l String str2) {
        if (str != null && !C43066x.K(str) && str2 != null && !C43066x.K(str2)) {
            kotlin.ranges.l lVar = h.f175098a;
            int i12 = lVar.f406905b;
            int length = str.length();
            return i12 <= length && length <= lVar.f406906c && str2.length() == 10;
        }
        return false;
    }
}
