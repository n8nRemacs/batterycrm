package com.avito.android.credits.utils;

import Y61.l;
import kotlin.Metadata;

/* compiled from: AnnuityCreditCalculator.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/credits/utils/c;", "Lcom/avito/android/credits/utils/a;", "<init>", "()V", "_avito_credits_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class c implements a {
    @Override // com.avito.android.credits.utils.a
    @l
    public final Integer a(float f12, int i12, int i13) {
        if (i13 <= 0) {
            return null;
        }
        if (f12 > 0.0f) {
            double d12 = f12 / 1200.0d;
            double d13 = 1;
            return Integer.valueOf((int) Math.ceil((i12 * d12) / (d13 - Math.pow(d12 + d13, -i13))));
        }
        if (f12 == 0.0f) {
            return Integer.valueOf((int) Math.ceil(i12 / i13));
        }
        return null;
    }
}
