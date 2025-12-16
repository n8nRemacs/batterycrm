package com.avito.android.payment.form;

import com.avito.android.payment.ParametersTree;
import com.avito.android.remote.model.PretendResult;
import com.avito.android.remote.model.payment.form.PaymentGenericFormResult;
import com.avito.android.util.Kundle;
import com.avito.android.util.P2;
import kotlin.Metadata;

/* compiled from: PaymentGenericFormInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/payment/form/f;", "", "_avito_payment_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.payment.form.f, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public interface InterfaceC33003f {
    @Y61.k
    io.reactivex.rxjava3.core.z<PretendResult> a(@Y61.k ParametersTree parametersTree);

    @Y61.k
    io.reactivex.rxjava3.core.z<P2<PaymentGenericFormResult>> b();

    @Y61.k
    Kundle d0();
}
