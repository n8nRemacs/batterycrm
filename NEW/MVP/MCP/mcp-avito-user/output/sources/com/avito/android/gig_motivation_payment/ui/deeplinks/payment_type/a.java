package com.avito.android.gig_motivation_payment.ui.deeplinks.payment_type;

import Y61.k;
import android.os.Bundle;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.gig_motivation_payment.GigMotivationPaymentTypeDeeplink;
import com.avito.android.gig_motivation_payment.PaymentType;
import com.avito.android.util.R0;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.s0;
import rH.InterfaceC47543a;

/* compiled from: GigMotivationPaymentTypeDeeplinkHandler.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/gig_motivation_payment/ui/deeplinks/payment_type/a;", "Lcom/avito/android/deeplink_handler/handler/base/coroutines/a;", "Lcom/avito/android/gig_motivation_payment/GigMotivationPaymentTypeDeeplink;", "_avito_gig_motivation-payment_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class a extends com.avito.android.deeplink_handler.handler.base.coroutines.a<GigMotivationPaymentTypeDeeplink> {

    /* renamed from: g, reason: collision with root package name */
    @k
    public final a.g f160198g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final InterfaceC47543a f160199h;

    /* compiled from: GigMotivationPaymentTypeDeeplinkHandler.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.gig_motivation_payment.ui.deeplinks.payment_type.a$a, reason: collision with other inner class name */
    public /* synthetic */ class C4681a {
        static {
            int[] iArr = new int[PaymentType.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                PaymentType paymentType = PaymentType.f160087b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                PaymentType paymentType2 = PaymentType.f160087b;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    @Inject
    public a(@k R0 r02, @k a.g gVar, @k InterfaceC47543a interfaceC47543a) {
        super(r02);
        this.f160198g = gVar;
        this.f160199h = interfaceC47543a;
    }

    @Override // com.avito.android.deeplink_handler.handler.base.coroutines.a
    public final /* bridge */ /* synthetic */ Object m(DeepLink deepLink, String str, Bundle bundle, Continuation continuation) {
        return o((GigMotivationPaymentTypeDeeplink) deepLink, (ContinuationImpl) continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00eb A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(@Y61.k com.avito.android.gig_motivation_payment.GigMotivationPaymentTypeDeeplink r9, @Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r10) {
        /*
            Method dump skipped, instructions count: 245
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.gig_motivation_payment.ui.deeplinks.payment_type.a.o(com.avito.android.gig_motivation_payment.GigMotivationPaymentTypeDeeplink, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
