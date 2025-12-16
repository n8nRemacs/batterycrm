package com.avito.android;

import android.app.Application;
import android.content.Intent;
import com.avito.android.payment.ParametersTree;
import com.avito.android.payment.lib.PaymentActivity;
import com.avito.android.payment.lib.PaymentSessionType;
import com.avito.android.remote.model.payment.service.OrderItem;
import com.squareup.anvil.annotations.ContributesBinding;
import java.util.Map;
import java.util.Set;
import javax.inject.Inject;
import kotlin.Metadata;
import shark.AndroidResourceIdNames;

/* compiled from: PaymentLibIntentFactoryImpl.kt */
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/B1;", "Lcom/avito/android/A1;", "_avito_payment-lib_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class B1 implements A1 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Application f67183a;

    @Inject
    public B1(@Y61.k Application application) {
        this.f67183a = application;
    }

    @Override // com.avito.android.A1
    @Y61.k
    public final Intent a(@Y61.k Set<OrderItem> set, @Y61.l String str, @Y61.l String str2, @Y61.l String str3, @Y61.l Map<String, ? extends Object> map) {
        return new Intent(this.f67183a, (Class<?>) PaymentActivity.class).putExtra("EXTRA_PAYMENT_SESSION_TYPE", new PaymentSessionType.Services(set, str, str2, str3, map)).addFlags(AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR);
    }

    @Override // com.avito.android.A1
    @Y61.k
    public final Intent b(@Y61.l String str) {
        return new Intent(this.f67183a, (Class<?>) PaymentActivity.class).putExtra("EXTRA_PAYMENT_SESSION_TYPE", new PaymentSessionType.CPA(str)).addFlags(AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR);
    }

    @Override // com.avito.android.A1
    @Y61.k
    public final Intent c(@Y61.k ParametersTree parametersTree) {
        return new Intent(this.f67183a, (Class<?>) PaymentActivity.class).putExtra("EXTRA_PAYMENT_SESSION_TYPE", new PaymentSessionType.Wallet(parametersTree)).addFlags(AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR);
    }
}
