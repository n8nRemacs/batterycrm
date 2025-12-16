package com.avito.android.autoteka.presentation.payment.mvi;

import Nf.b;
import com.avito.android.R;
import com.avito.android.autoteka.deeplinks.AutotekaPreviewSearchDetails;
import com.avito.android.autoteka.deeplinks.AutotekaPreviewSearchLink;
import com.avito.android.autoteka.deeplinks.PaymentDetails;
import com.avito.android.autoteka.helpers.l;
import com.avito.android.autoteka.presentation.payment.mvi.entity.AutotekaPaymentInternalAction;
import com.avito.android.component.toast.f;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.remote.error.ApiError;
import java.io.Serializable;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: AutotekaPaymentOneTimeEventProducer.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/autoteka/presentation/payment/mvi/s;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/autoteka/presentation/payment/mvi/entity/AutotekaPaymentInternalAction;", "LNf/b;", "a", "_avito_autoteka_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class s implements com.avito.android.arch.mvi.t<AutotekaPaymentInternalAction, Nf.b> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final PaymentDetails f97517b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f97518c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deep_linking.x f97519d;

    /* compiled from: AutotekaPaymentOneTimeEventProducer.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/avito/android/autoteka/presentation/payment/mvi/s$a;", "", "<init>", "()V", "", "ERROR_KEY", "Ljava/lang/String;", "PREVIEW_NOT_AVAILABLE", "_avito_autoteka_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
    }

    @Inject
    public s(@Y61.k PaymentDetails paymentDetails, @Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar, @Y61.k com.avito.android.deep_linking.x xVar) {
        this.f97517b = paymentDetails;
        this.f97518c = aVar;
        this.f97519d = xVar;
    }

    @Override // com.avito.android.arch.mvi.t
    public final Nf.b b(AutotekaPaymentInternalAction autotekaPaymentInternalAction) {
        AutotekaPaymentInternalAction autotekaPaymentInternalAction2 = autotekaPaymentInternalAction;
        boolean z12 = autotekaPaymentInternalAction2 instanceof AutotekaPaymentInternalAction.OpenPayment;
        com.avito.android.deeplink_handler.handler.composite.a aVar = this.f97518c;
        if (z12) {
            b.a.a(aVar, this.f97519d.b(((AutotekaPaymentInternalAction.OpenPayment) autotekaPaymentInternalAction2).f97447b), "req_key_payment_session_screen", null, 4);
            return null;
        }
        if (autotekaPaymentInternalAction2 instanceof AutotekaPaymentInternalAction.CloseScreenSuccessfully) {
            return b.a.f11692a;
        }
        if (autotekaPaymentInternalAction2 instanceof AutotekaPaymentInternalAction.ShowPaymentFailedToast) {
            com.avito.android.autoteka.helpers.l.f96668a.getClass();
            f.c.f125255c.getClass();
            return new b.g(new l.a(0, null, f.c.a.b(), com.avito.android.printable_text.b.c(R.string.autoteka_payment_failed_for_toast, new Serializable[0]), 3, null));
        }
        if (autotekaPaymentInternalAction2 instanceof AutotekaPaymentInternalAction.OrderItemError) {
            ApiError apiError = ((AutotekaPaymentInternalAction.OrderItemError) autotekaPaymentInternalAction2).f97449b;
            if (apiError instanceof ApiError.Unauthorized) {
                return b.C0754b.f11693a;
            }
            com.avito.android.autoteka.helpers.l.f96668a.getClass();
            return new b.g(com.avito.android.autoteka.helpers.l.a(apiError));
        }
        boolean z13 = autotekaPaymentInternalAction2 instanceof AutotekaPaymentInternalAction.Error;
        PaymentDetails paymentDetails = this.f97517b;
        if (z13) {
            ApiError apiError2 = ((AutotekaPaymentInternalAction.Error) autotekaPaymentInternalAction2).f97439b;
            if (!(apiError2 instanceof ApiError.IncorrectData) || !L.f(((ApiError.IncorrectData) apiError2).c().get("errorCode"), "previewBySearchKeyNotAvailable")) {
                return null;
            }
            b.a.a(aVar, new AutotekaPreviewSearchLink(new AutotekaPreviewSearchDetails(paymentDetails.getSearchKey(), null, null, null, false, false)), null, null, 6);
            return b.a.f11692a;
        }
        if (autotekaPaymentInternalAction2 instanceof AutotekaPaymentInternalAction.OpenAuthScreen) {
            return b.C0754b.f11693a;
        }
        if (autotekaPaymentInternalAction2 instanceof AutotekaPaymentInternalAction.ToastError) {
            ApiError apiError3 = ((AutotekaPaymentInternalAction.ToastError) autotekaPaymentInternalAction2).f97455b;
            if (apiError3 instanceof ApiError.Unauthorized) {
                return b.C0754b.f11693a;
            }
            com.avito.android.autoteka.helpers.l.f96668a.getClass();
            return new b.g(com.avito.android.autoteka.helpers.l.a(apiError3));
        }
        if (autotekaPaymentInternalAction2 instanceof AutotekaPaymentInternalAction.OpenLicenseAgreement) {
            return new b.d(((AutotekaPaymentInternalAction.OpenLicenseAgreement) autotekaPaymentInternalAction2).f97446b);
        }
        if (autotekaPaymentInternalAction2 instanceof AutotekaPaymentInternalAction.OpenConfirmEmail) {
            return new b.c(((AutotekaPaymentInternalAction.OpenConfirmEmail) autotekaPaymentInternalAction2).f97445b);
        }
        if (autotekaPaymentInternalAction2 instanceof AutotekaPaymentInternalAction.OpenPreviewSearch) {
            b.a.a(aVar, new AutotekaPreviewSearchLink(new AutotekaPreviewSearchDetails(paymentDetails.getSearchKey(), null, null, null, false, false)), null, null, 6);
            return b.a.f11692a;
        }
        if ((autotekaPaymentInternalAction2 instanceof AutotekaPaymentInternalAction.ShowDiscountTooltip) && ((AutotekaPaymentInternalAction.ShowDiscountTooltip) autotekaPaymentInternalAction2).f97452b) {
            return b.f.f11696a;
        }
        return null;
    }
}
