package com.avito.android.autoteka.presentation.waitingForPayment.mvi;

import Uf.b;
import com.avito.android.arch.mvi.t;
import com.avito.android.autoteka.deeplinks.AutotekaDirectPurchaseLink;
import com.avito.android.autoteka.deeplinks.AutotekaReportGenerationLink;
import com.avito.android.autoteka.deeplinks.DirectPurchaseDetails;
import com.avito.android.autoteka.deeplinks.ReportGenerationDetails;
import com.avito.android.autoteka.deeplinks.WaitingForPaymentDetails;
import com.avito.android.autoteka.items.waitingForPaymentResponseItem.WaitingForPaymentResponseItem;
import com.avito.android.autoteka.presentation.waitingForPayment.mvi.entity.AutotekaWaitingForPaymentInternalAction;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.remote.autoteka.generated.api.get_step_order_status_api.GetStepOrderStatusApiResponse;
import com.avito.android.remote.autoteka.model.AutotekaAction;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: AutotekaWaitingForPaymentOneTimeEventProducer.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/autoteka/presentation/waitingForPayment/mvi/i;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/autoteka/presentation/waitingForPayment/mvi/entity/AutotekaWaitingForPaymentInternalAction;", "LUf/b;", "_avito_autoteka_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class i implements t<AutotekaWaitingForPaymentInternalAction, Uf.b> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final WaitingForPaymentDetails f97908b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f97909c;

    /* compiled from: AutotekaWaitingForPaymentOneTimeEventProducer.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f97910a;

        static {
            int[] iArr = new int[GetStepOrderStatusApiResponse.Status.values().length];
            try {
                iArr[GetStepOrderStatusApiResponse.Status.Completed.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f97910a = iArr;
        }
    }

    @Inject
    public i(@Y61.k WaitingForPaymentDetails waitingForPaymentDetails, @Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar) {
        this.f97908b = waitingForPaymentDetails;
        this.f97909c = aVar;
    }

    @Override // com.avito.android.arch.mvi.t
    public final Uf.b b(AutotekaWaitingForPaymentInternalAction autotekaWaitingForPaymentInternalAction) {
        AutotekaWaitingForPaymentInternalAction autotekaWaitingForPaymentInternalAction2 = autotekaWaitingForPaymentInternalAction;
        if (autotekaWaitingForPaymentInternalAction2 instanceof AutotekaWaitingForPaymentInternalAction.OpenAuthScreen) {
            return b.C1134b.f16539a;
        }
        if (autotekaWaitingForPaymentInternalAction2 instanceof AutotekaWaitingForPaymentInternalAction.CloseScreen) {
            return b.a.f16538a;
        }
        if (autotekaWaitingForPaymentInternalAction2 instanceof AutotekaWaitingForPaymentInternalAction.Response) {
            WaitingForPaymentResponseItem waitingForPaymentResponseItem = ((AutotekaWaitingForPaymentInternalAction.Response) autotekaWaitingForPaymentInternalAction2).f97890b;
            if (a.f97910a[waitingForPaymentResponseItem.f97047e.ordinal()] == 1) {
                com.avito.android.deeplink_handler.handler.composite.a aVar = this.f97909c;
                String str = waitingForPaymentResponseItem.f97048f;
                if (str != null) {
                    b.a.a(aVar, new AutotekaReportGenerationLink(new ReportGenerationDetails(str, this.f97908b.getAutotekaX(), null)), null, null, 6);
                    b.a aVar2 = b.a.f16538a;
                    if (aVar2 != null) {
                        return aVar2;
                    }
                }
                WaitingForPaymentResponseItem.DirectPurchase directPurchase = waitingForPaymentResponseItem.f97049g;
                if (directPurchase != null) {
                    AutotekaAction autotekaAction = directPurchase.f97051c;
                    DirectPurchaseDetails.Button button = autotekaAction != null ? new DirectPurchaseDetails.Button(autotekaAction.getText(), autotekaAction.getDeepLink()) : null;
                    AutotekaAction autotekaAction2 = directPurchase.f97052d;
                    b.a.a(aVar, new AutotekaDirectPurchaseLink(new DirectPurchaseDetails(directPurchase.f97053e, directPurchase.f97050b, button, autotekaAction2 != null ? new DirectPurchaseDetails.Button(autotekaAction2.getText(), autotekaAction2.getDeepLink()) : null)), null, null, 6);
                    return b.a.f16538a;
                }
            }
        } else if (autotekaWaitingForPaymentInternalAction2 instanceof AutotekaWaitingForPaymentInternalAction.OpenDeepLink) {
            return new b.c(((AutotekaWaitingForPaymentInternalAction.OpenDeepLink) autotekaWaitingForPaymentInternalAction2).f97889b);
        }
        return null;
    }
}
