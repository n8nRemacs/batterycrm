package com.avito.android.payment.webview.mvi.component;

import com.avito.android.arch.mvi.u;
import com.avito.android.payment.webview.mvi.entity.WebPaymentMviState;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import x60.b;

/* compiled from: WebPaymentMviReducer.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/payment/webview/mvi/component/o;", "Lcom/avito/android/arch/mvi/u;", "Lx60/b;", "Lcom/avito/android/payment/webview/mvi/entity/WebPaymentMviState;", "<init>", "()V", "_avito_payment_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class o implements u<x60.b, WebPaymentMviState> {
    @Inject
    public o() {
    }

    @Override // com.avito.android.arch.mvi.u
    public final WebPaymentMviState a(x60.b bVar, WebPaymentMviState webPaymentMviState) {
        x60.b bVar2 = bVar;
        WebPaymentMviState webPaymentMviState2 = webPaymentMviState;
        if (bVar2 instanceof b.C12846b) {
            return new WebPaymentMviState.Loading(0);
        }
        if (bVar2 instanceof b.f) {
            return new WebPaymentMviState.Error(((b.f) bVar2).f442233a);
        }
        if (bVar2 instanceof b.g) {
            if (webPaymentMviState2 instanceof WebPaymentMviState.Loading) {
                WebPaymentMviState.Loading loading = (WebPaymentMviState.Loading) webPaymentMviState2;
                if (loading.f214923d >= ((b.g) bVar2).f442234a) {
                    return loading;
                }
            }
            return new WebPaymentMviState.Loading(((b.g) bVar2).f442234a);
        }
        if (bVar2 instanceof b.e) {
            return WebPaymentMviState.Content.f214921d;
        }
        if (bVar2 instanceof b.a ? true : bVar2 instanceof b.c ? true : bVar2 instanceof b.d) {
            return webPaymentMviState2;
        }
        throw new NoWhenBranchMatchedException();
    }
}
