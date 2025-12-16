package com.yandex.metrica.impl.ob;

import com.android.billingclient.api.SkuDetails;

/* renamed from: com.yandex.metrica.impl.ob.e, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38764e {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final C38764e f380418a = new C38764e();

    private C38764e() {
    }

    private final int b(SkuDetails skuDetails) {
        if (skuDetails.getFreeTrialPeriod().length() == 0) {
            return skuDetails.getIntroductoryPriceCycles();
        }
        return 1;
    }

    private final com.yandex.metrica.billing_interface.c c(SkuDetails skuDetails) {
        return skuDetails.getFreeTrialPeriod().length() == 0 ? com.yandex.metrica.billing_interface.c.a(skuDetails.getIntroductoryPricePeriod()) : com.yandex.metrica.billing_interface.c.a(skuDetails.getFreeTrialPeriod());
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002f  */
    @Y61.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final T21.b a(@Y61.k com.android.billingclient.api.PurchaseHistoryRecord r21, @Y61.k com.android.billingclient.api.SkuDetails r22, @Y61.l com.android.billingclient.api.Purchase r23) {
        /*
            r20 = this;
            r0 = r20
            r1 = r22
            T21.b r19 = new T21.b
            java.lang.String r2 = r22.getType()
            int r3 = r2.hashCode()
            r4 = 3541555(0x360a33, float:4.962776E-39)
            if (r3 == r4) goto L24
            r4 = 100343516(0x5fb1edc, float:2.3615263E-35)
            if (r3 == r4) goto L19
            goto L2f
        L19:
            java.lang.String r3 = "inapp"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L2f
            com.yandex.metrica.billing_interface.e r2 = com.yandex.metrica.billing_interface.e.f377619b
            goto L31
        L24:
            java.lang.String r3 = "subs"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L2f
            com.yandex.metrica.billing_interface.e r2 = com.yandex.metrica.billing_interface.e.f377620c
            goto L31
        L2f:
            com.yandex.metrica.billing_interface.e r2 = com.yandex.metrica.billing_interface.e.f377621d
        L31:
            java.lang.String r3 = r22.getSku()
            int r4 = r21.getQuantity()
            long r5 = r22.getPriceAmountMicros()
            java.lang.String r7 = r22.getPriceCurrencyCode()
            long r8 = r0.a(r1)
            com.yandex.metrica.billing_interface.c r10 = r0.c(r1)
            int r11 = r0.b(r1)
            java.lang.String r1 = r22.getSubscriptionPeriod()
            com.yandex.metrica.billing_interface.c r12 = com.yandex.metrica.billing_interface.c.a(r1)
            java.lang.String r13 = r21.getSignature()
            java.lang.String r14 = r21.getPurchaseToken()
            long r15 = r21.getPurchaseTime()
            if (r23 == 0) goto L6a
            boolean r1 = r23.isAutoRenewing()
        L67:
            r17 = r1
            goto L6c
        L6a:
            r1 = 0
            goto L67
        L6c:
            if (r23 == 0) goto L77
            java.lang.String r1 = r23.getOriginalJson()
            if (r1 == 0) goto L77
        L74:
            r18 = r1
            goto L7a
        L77:
            java.lang.String r1 = "{}"
            goto L74
        L7a:
            r1 = r19
            r1.<init>(r2, r3, r4, r5, r7, r8, r10, r11, r12, r13, r14, r15, r17, r18)
            return r19
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.ob.C38764e.a(com.android.billingclient.api.PurchaseHistoryRecord, com.android.billingclient.api.SkuDetails, com.android.billingclient.api.Purchase):T21.b");
    }

    private final long a(SkuDetails skuDetails) {
        if (skuDetails.getFreeTrialPeriod().length() == 0) {
            return skuDetails.getIntroductoryPriceAmountMicros();
        }
        return 0L;
    }
}
