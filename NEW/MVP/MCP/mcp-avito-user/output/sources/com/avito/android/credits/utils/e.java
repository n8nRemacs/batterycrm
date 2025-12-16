package com.avito.android.credits.utils;

import Y41.l;
import Y61.k;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: AnnuityCreditCalculator.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/credits/utils/e;", "Lcom/avito/android/credits/utils/a;", "<init>", "()V", "_avito_credits_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class e implements com.avito.android.credits.utils.a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final l<Double, Integer> f129054a = a.f129055l;

    /* compiled from: AnnuityCreditCalculator.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "", "invoke", "(D)Ljava/lang/Integer;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a extends N implements l<Double, Integer> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f129055l = new a();

        public a() {
            super(1);
        }

        @Override // Y41.l
        public final Integer invoke(Double d12) {
            double dDoubleValue = d12.doubleValue();
            double d13 = 50;
            return Integer.valueOf((int) ((dDoubleValue - (dDoubleValue % d13)) + d13));
        }
    }

    @Override // com.avito.android.credits.utils.a
    @Y61.l
    public final Integer a(float f12, int i12, int i13) {
        if (i12 < 0 || i13 <= 0 || f12 < 0.0f) {
            return null;
        }
        l<Double, Integer> lVar = this.f129054a;
        if (f12 <= 0.0f) {
            if (f12 != 0.0f) {
                return null;
            }
            return (Integer) ((a) lVar).invoke(Double.valueOf(i12 / i13));
        }
        double d12 = f12 / 1200.0d;
        double d13 = 1;
        double d14 = d13 + d12;
        return (Integer) ((a) lVar).invoke(Double.valueOf(((i12 * d12) * d14) / (d13 - Math.pow(d14, -i13))));
    }
}
