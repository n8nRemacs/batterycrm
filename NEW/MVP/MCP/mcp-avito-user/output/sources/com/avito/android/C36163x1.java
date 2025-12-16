package com.avito.android;

import android.app.Application;
import android.content.ComponentName;
import android.content.Intent;
import com.avito.android.payment.ParametersTree;
import com.avito.android.payment.WebPaymentResourceProviderImpl;
import com.avito.android.payment.data.DialogInfo;
import com.avito.android.payment.form.PaymentGenericFormActivity;
import com.avito.android.payment.form.status.PaymentStatusFormActivity;
import com.avito.android.payment.processing.PaymentProcessingActivity;
import com.avito.android.payment.webview.WebPaymentOpenParams;
import com.avito.android.payment.webview.mvi.WebPaymentMviActivity;
import com.avito.android.remote.model.payment.service.OrderItem;
import com.avito.android.util.C35961v3;
import com.squareup.anvil.annotations.ContributesBinding;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;

/* compiled from: PaymentIntentFactoryImpl.kt */
@kotlin.jvm.internal.s0
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/x1;", "Lcom/avito/android/w1;", "_avito_payment_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.x1, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public class C36163x1 implements InterfaceC36134w1 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Application f331338a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final A1 f331339b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final v60.d f331340c;

    @Inject
    public C36163x1(@Y61.k Application application, @Y61.k A1 a12, @Y61.k v60.d dVar) {
        this.f331338a = application;
        this.f331339b = a12;
        this.f331340c = dVar;
    }

    @Override // com.avito.android.InterfaceC36134w1
    @Y61.k
    public final Intent a(@Y61.k Set<OrderItem> set, @Y61.l String str, @Y61.l String str2, @Y61.l String str3, @Y61.l Map<String, ? extends Object> map) {
        return this.f331339b.a(set, str, str2, str3, map);
    }

    @Override // com.avito.android.InterfaceC36134w1
    @Y61.k
    public final Intent b(@Y61.k String str) {
        return new Intent(this.f331338a, (Class<?>) PaymentProcessingActivity.class).putExtra("PaymentProcessingActivity_order_id", str);
    }

    @Override // com.avito.android.InterfaceC36134w1
    @Y61.k
    public final Intent c(@Y61.k String str) {
        ComponentName componentName = com.avito.android.payment.n.f214770a;
        Intent intent = new Intent();
        intent.setComponent(com.avito.android.payment.n.f214770a);
        intent.putExtra("ru.sberbank.mobile.extra.EXTRA_ORDER_UUID", str);
        return intent;
    }

    @Override // com.avito.android.InterfaceC36134w1
    @Y61.k
    public final Intent d(@Y61.k String str, @Y61.k String str2, @Y61.k ParametersTree parametersTree) {
        return new Intent(this.f331338a, (Class<?>) PaymentProcessingActivity.class).putExtra("PaymentProcessingActivity_session_id", str).putExtra("PaymentProcessingActivity_method_signature", str2).putExtra("PaymentProcessingActivity_parameters", parametersTree);
    }

    @Override // com.avito.android.InterfaceC36134w1
    @Y61.k
    public final Intent e(@Y61.k String str, @Y61.l String str2, @Y61.k List list) {
        List list2 = list;
        ArrayList arrayList = new ArrayList(C42745f0.q(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(new OrderItem((String) it.next(), str));
        }
        return this.f331339b.a(C42745f0.P0(arrayList), str2, null, null, null);
    }

    @Override // com.avito.android.InterfaceC36134w1
    @Y61.k
    public final Intent f(@Y61.k String str, @Y61.k String str2) {
        return new Intent(this.f331338a, (Class<?>) PaymentGenericFormActivity.class).putExtra("PaymentGenericFormActivity_session_id", str).putExtra("PaymentGenericFormActivity_method_signature", str2);
    }

    @Override // com.avito.android.InterfaceC36134w1
    @Y61.k
    public final Intent g(@Y61.l String str) {
        return this.f331339b.b(str);
    }

    @Override // com.avito.android.InterfaceC36134w1
    @Y61.k
    public final Intent h(@Y61.k String str) {
        return new Intent(this.f331338a, (Class<?>) PaymentStatusFormActivity.class).putExtra("PaymentStatusFormActivity_order_id", str);
    }

    @Override // com.avito.android.InterfaceC36134w1
    @Y61.k
    public final Intent i(@Y61.k ParametersTree parametersTree) {
        return this.f331339b.c(parametersTree);
    }

    @Override // com.avito.android.InterfaceC36134w1
    @Y61.k
    public final Intent j(@Y61.k String str, @Y61.l String str2, @Y61.l DialogInfo dialogInfo, @Y61.l WebPaymentResourceProviderImpl webPaymentResourceProviderImpl, @Y61.l Map<String, ? extends Object> map) {
        if (str2 == null) {
            str2 = "";
        }
        String str3 = str2;
        v60.d dVar = this.f331340c;
        dVar.getClass();
        Intent intent = new Intent(dVar.f440465a, (Class<?>) WebPaymentMviActivity.class);
        C35961v3.b(intent, new WebPaymentOpenParams(str, str3, dialogInfo, webPaymentResourceProviderImpl, map));
        return intent;
    }
}
