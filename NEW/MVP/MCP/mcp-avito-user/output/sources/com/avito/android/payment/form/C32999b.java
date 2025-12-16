package com.avito.android.payment.form;

import com.avito.android.remote.model.category_parameters.base.ParameterSlot;
import java.util.Collections;
import java.util.List;
import kotlin.Metadata;

/* compiled from: DelegateItemConverter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/payment/form/b;", "Lcom/avito/android/payment/form/c;", "_avito_payment_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.payment.form.b, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C32999b implements InterfaceC33000c {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.category_parameters.a f214353a;

    public C32999b(@Y61.k com.avito.android.category_parameters.a aVar) {
        this.f214353a = aVar;
    }

    @Override // com.avito.android.payment.form.InterfaceC33000c
    @Y61.k
    public final List<TV0.a> a(@Y61.k ParameterSlot parameterSlot) {
        return com.avito.android.category_parameters.a.c(this.f214353a, new UV0.c(Collections.singletonList(parameterSlot)), null, null, null, 30);
    }
}
