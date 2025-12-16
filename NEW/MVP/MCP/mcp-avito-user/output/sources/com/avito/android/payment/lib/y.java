package com.avito.android.payment.lib;

import androidx.view.C23038g0;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.NoMatchLink;
import com.avito.android.deep_linking.links.PaymentStatusLink;
import com.avito.android.payment.ModalState;
import com.avito.android.remote.error.ApiError;
import com.avito.android.remote.model.payment.generic.PaymentGenericResult;
import com.avito.android.util.P2;
import kotlin.Metadata;
import kotlin.Q;

/* compiled from: PaymentMethodsViewModel.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u00062\u001e\u0010\u0005\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lkotlin/Q;", "Lcom/avito/android/util/P2;", "Lcom/avito/android/remote/model/payment/generic/PaymentGenericResult;", "", "Lcom/avito/android/remote/model/payment/PaymentMethod;", "<name for destructuring parameter 0>", "Lkotlin/G0;", "accept", "(Lkotlin/Q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class y<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t f214767b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f214768c;

    public y(t tVar, String str) {
        this.f214767b = tVar;
        this.f214768c = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // l41.g
    public final void accept(Object obj) {
        P2 p22 = (P2) ((Q) obj).f406619b;
        t tVar = this.f214767b;
        boolean z12 = p22 instanceof P2.b;
        C23038g0<Boolean> c23038g0 = tVar.f214722j0;
        if (!z12) {
            if (p22 instanceof P2.c) {
                c23038g0.setValue(Boolean.TRUE);
                return;
            } else {
                if (p22 instanceof P2.a) {
                    c23038g0.setValue(Boolean.FALSE);
                    C23038g0<ModalState> c23038g02 = tVar.f214713a0;
                    ApiError apiError = ((P2.a) p22).f318719a;
                    c23038g02.setValue(new ModalState.b(apiError, apiError.getF244063c()));
                    return;
                }
                return;
            }
        }
        T t12 = ((P2.b) p22).f318720a;
        if (((PaymentGenericResult) t12) instanceof PaymentGenericResult.Ok) {
            String uri = ((PaymentGenericResult.Ok) t12).getUri();
            DeepLink deepLinkB = tVar.f214702P.b(uri);
            if (deepLinkB instanceof PaymentStatusLink) {
                PaymentStatusLink paymentStatusLink = (PaymentStatusLink) deepLinkB;
                if (paymentStatusLink.f133572c) {
                    tVar.ke(1, this.f214768c, paymentStatusLink.f133571b, uri);
                    return;
                }
            }
            if (deepLinkB instanceof NoMatchLink) {
                tVar.f214711Y.setValue(uri);
                c23038g0.setValue(Boolean.FALSE);
            } else {
                tVar.f214710X.setValue(deepLinkB);
                c23038g0.setValue(Boolean.FALSE);
            }
        }
    }
}
