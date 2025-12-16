package com.avito.android.autoteka.presentation.waitingForPayment.mvi;

import com.avito.android.arch.mvi.u;
import com.avito.android.autoteka.items.fullScreenError.waitingForPaymentError.WaitingForPaymentErrorItem;
import com.avito.android.autoteka.items.waitingForPaymentResponseItem.WaitingForPaymentResponseItem;
import com.avito.android.autoteka.presentation.waitingForPayment.mvi.entity.AutotekaWaitingForPaymentInternalAction;
import com.avito.android.autoteka.presentation.waitingForPayment.mvi.entity.AutotekaWaitingForPaymentState;
import com.avito.android.remote.autoteka.generated.api.get_step_order_status_api.GetStepOrderStatusApiResponse;
import com.avito.android.remote.error.ApiError;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: AutotekaWaitingForPaymentReducer.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/autoteka/presentation/waitingForPayment/mvi/k;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/autoteka/presentation/waitingForPayment/mvi/entity/AutotekaWaitingForPaymentInternalAction;", "Lcom/avito/android/autoteka/presentation/waitingForPayment/mvi/entity/AutotekaWaitingForPaymentState;", "<init>", "()V", "_avito_autoteka_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class k implements u<AutotekaWaitingForPaymentInternalAction, AutotekaWaitingForPaymentState> {

    /* compiled from: AutotekaWaitingForPaymentReducer.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f97913a;

        static {
            int[] iArr = new int[GetStepOrderStatusApiResponse.Status.values().length];
            try {
                iArr[GetStepOrderStatusApiResponse.Status.Completed.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f97913a = iArr;
        }
    }

    @Inject
    public k() {
    }

    @Override // com.avito.android.arch.mvi.u
    public final AutotekaWaitingForPaymentState a(AutotekaWaitingForPaymentInternalAction autotekaWaitingForPaymentInternalAction, AutotekaWaitingForPaymentState autotekaWaitingForPaymentState) {
        AutotekaWaitingForPaymentInternalAction autotekaWaitingForPaymentInternalAction2 = autotekaWaitingForPaymentInternalAction;
        AutotekaWaitingForPaymentState autotekaWaitingForPaymentState2 = autotekaWaitingForPaymentState;
        if (autotekaWaitingForPaymentInternalAction2 instanceof AutotekaWaitingForPaymentInternalAction.Response) {
            WaitingForPaymentResponseItem waitingForPaymentResponseItem = ((AutotekaWaitingForPaymentInternalAction.Response) autotekaWaitingForPaymentInternalAction2).f97890b;
            return a.f97913a[waitingForPaymentResponseItem.f97047e.ordinal()] == 1 ? autotekaWaitingForPaymentState2 : new AutotekaWaitingForPaymentState.Response(waitingForPaymentResponseItem);
        }
        if (autotekaWaitingForPaymentInternalAction2 instanceof AutotekaWaitingForPaymentInternalAction.Loading) {
            AutotekaWaitingForPaymentState.f97891c.getClass();
            return new AutotekaWaitingForPaymentState.Waiting(AutotekaWaitingForPaymentState.f97892d);
        }
        if (!(autotekaWaitingForPaymentInternalAction2 instanceof AutotekaWaitingForPaymentInternalAction.Error)) {
            return autotekaWaitingForPaymentState2;
        }
        ApiError apiError = ((AutotekaWaitingForPaymentInternalAction.Error) autotekaWaitingForPaymentInternalAction2).f97885b;
        return new AutotekaWaitingForPaymentState.Error(new WaitingForPaymentErrorItem(null, com.avito.android.autoteka.helpers.j.c(apiError), com.avito.android.autoteka.helpers.j.b(apiError), com.avito.android.autoteka.helpers.j.a(apiError), 1, null), apiError);
    }
}
