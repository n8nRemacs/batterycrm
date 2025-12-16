package com.avito.android;

import android.content.Intent;
import com.avito.android.payment.ParametersTree;
import com.avito.android.payment.WebPaymentResourceProviderImpl;
import com.avito.android.payment.data.DialogInfo;
import com.avito.android.remote.model.payment.service.OrderItem;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;

/* compiled from: PaymentIntentFactory.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/w1;", "", "_avito_payment_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.w1, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public interface InterfaceC36134w1 {

    /* compiled from: PaymentIntentFactory.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.w1$a */
    public static final class a {
    }

    @Y61.k
    Intent a(@Y61.k Set<OrderItem> set, @Y61.l String str, @Y61.l String str2, @Y61.l String str3, @Y61.l Map<String, ? extends Object> map);

    @Y61.k
    Intent b(@Y61.k String str);

    @Y61.k
    Intent c(@Y61.k String str);

    @Y61.k
    Intent d(@Y61.k String str, @Y61.k String str2, @Y61.k ParametersTree parametersTree);

    @Y61.k
    Intent e(@Y61.k String str, @Y61.l String str2, @Y61.k List list);

    @Y61.k
    Intent f(@Y61.k String str, @Y61.k String str2);

    @Y61.k
    Intent g(@Y61.l String str);

    @Y61.k
    Intent h(@Y61.k String str);

    @Y61.k
    Intent i(@Y61.k ParametersTree parametersTree);

    @Y61.k
    Intent j(@Y61.k String str, @Y61.l String str2, @Y61.l DialogInfo dialogInfo, @Y61.l WebPaymentResourceProviderImpl webPaymentResourceProviderImpl, @Y61.l Map<String, ? extends Object> map);
}
