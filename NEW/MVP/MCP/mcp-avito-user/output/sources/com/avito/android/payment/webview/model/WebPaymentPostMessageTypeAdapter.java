package com.avito.android.payment.webview.model;

import Y61.k;
import com.avito.android.payment.webview.model.a;
import com.avito.android.remote.parse.adapter.RuntimeTypeAdapter;
import java.util.Collections;
import java.util.Map;
import kotlin.Metadata;

/* compiled from: WebPaymentPostMessageTypeAdapter.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/payment/webview/model/WebPaymentPostMessageTypeAdapter;", "Lcom/avito/android/remote/parse/adapter/RuntimeTypeAdapter;", "Lcom/avito/android/payment/webview/model/a;", "<init>", "()V", "_avito_payment_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class WebPaymentPostMessageTypeAdapter extends RuntimeTypeAdapter<a> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Map<String, Class<a.C6439a>> f214825a;

    public WebPaymentPostMessageTypeAdapter() {
        super(null, "result", null, 5, null);
        this.f214825a = Collections.singletonMap("web-payment-redirect", a.C6439a.class);
    }

    @Override // com.avito.android.remote.parse.adapter.RuntimeTypeAdapter
    @k
    public final Map<String, Class<a.C6439a>> getMapping() {
        return this.f214825a;
    }
}
