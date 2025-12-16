package com.avito.android.payment.lib;

import com.avito.android.remote.model.payment.PaymentMethodTypeKt;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import ru.avito.component.payments.method.PaymentLabel;

/* compiled from: PaymentMethodsViewModel.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_payment-lib_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class C {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:31)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:60)
     */
    public static final PaymentLabel a(String str) {
        switch (str.hashCode()) {
            case -1890579396:
                if (str.equals(PaymentMethodTypeKt.PAYMENT_METHOD_TYPE_QIWI_WALLET)) {
                    return PaymentLabel.f430380o;
                }
                break;
            case -1659384968:
                if (str.equals(PaymentMethodTypeKt.PAYMENT_METHOD_TYPE_SBERBANK)) {
                    return PaymentLabel.f430373h;
                }
                break;
            case -1352291591:
                if (str.equals(PaymentMethodTypeKt.PAYMENT_METHOD_TYPE_CREDIT)) {
                    return PaymentLabel.f430372g;
                }
                break;
            case -795192327:
                if (str.equals(PaymentMethodTypeKt.PAYMENT_METHOD_TYPE_WALLET)) {
                    return PaymentLabel.f430376k;
                }
                break;
            case 108118:
                if (str.equals(PaymentMethodTypeKt.PAYMENT_METHOD_TYPE_MIR)) {
                    return PaymentLabel.f430377l;
                }
                break;
            case 114009:
                if (str.equals(PaymentMethodTypeKt.PAYMENT_METHOD_TYPE_SMS)) {
                    return PaymentLabel.f430375j;
                }
                break;
            case 3046160:
                if (str.equals(PaymentMethodTypeKt.PAYMENT_METHOD_TYPE_CARD)) {
                    return PaymentLabel.f430370e;
                }
                break;
            case 3046195:
                if (str.equals(PaymentMethodTypeKt.PAYMENT_METHOD_TYPE_CASH)) {
                    return PaymentLabel.f430371f;
                }
                break;
            case 3619905:
                if (str.equals(PaymentMethodTypeKt.PAYMENT_METHOD_TYPE_VISA)) {
                    return PaymentLabel.f430369d;
                }
                break;
            case 178883556:
                if (str.equals(PaymentMethodTypeKt.PAYMENT_METHOD_TYPE_YANDEX_MONEY)) {
                    return PaymentLabel.f430378m;
                }
                break;
            case 1174445979:
                if (str.equals(PaymentMethodTypeKt.PAYMENT_METHOD_TYPE_MASTERCARD)) {
                    return PaymentLabel.f430368c;
                }
                break;
            case 1640813068:
                if (str.equals(PaymentMethodTypeKt.PAYMENT_METHOD_TYPE_YOO_MONEY)) {
                    return PaymentLabel.f430379n;
                }
                break;
            case 1827356236:
                if (str.equals(PaymentMethodTypeKt.PAYMENT_METHOD_TYPE_SBERBANK_APP)) {
                    return PaymentLabel.f430374i;
                }
                break;
        }
        return PaymentLabel.f430381p;
    }
}
