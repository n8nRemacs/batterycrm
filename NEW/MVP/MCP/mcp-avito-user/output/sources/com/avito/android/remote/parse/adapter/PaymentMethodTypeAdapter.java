package com.avito.android.remote.parse.adapter;

import com.avito.android.remote.model.payment.PaymentMethod;
import java.lang.reflect.Type;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.P0;

/* compiled from: PaymentMethodTypeAdapter.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/remote/parse/adapter/PaymentMethodTypeAdapter;", "Lcom/avito/android/remote/parse/adapter/RuntimeTypeAdapter;", "Lcom/avito/android/remote/model/payment/PaymentMethod;", "<init>", "()V", "_avito-discouraged_avito-api_payment"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class PaymentMethodTypeAdapter extends RuntimeTypeAdapter<PaymentMethod> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Object f254203a;

    public PaymentMethodTypeAdapter() {
        super(null, null, null, 7, null);
        this.f254203a = P0.g(new kotlin.Q("button", PaymentMethod.SelectableMethod.class), new kotlin.Q("method", PaymentMethod.SelectableMethod.class));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map<java.lang.String, java.lang.reflect.Type>] */
    @Override // com.avito.android.remote.parse.adapter.RuntimeTypeAdapter
    @Y61.k
    public final Map<String, Type> getMapping() {
        return this.f254203a;
    }
}
