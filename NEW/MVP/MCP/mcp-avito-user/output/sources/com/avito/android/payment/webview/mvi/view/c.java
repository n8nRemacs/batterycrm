package com.avito.android.payment.webview.mvi.view;

import Y41.l;
import Y61.k;
import android.webkit.JavascriptInterface;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: WebPaymentPostMessageReceiver.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/payment/webview/mvi/view/c;", "", "", "message", "Lkotlin/G0;", "postMessage", "(Ljava/lang/String;)V", "_avito_payment_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final l<String, G0> f214938a;

    /* JADX WARN: Multi-variable type inference failed */
    public c(@k l<? super String, G0> lVar) {
        this.f214938a = lVar;
    }

    @JavascriptInterface
    public final void postMessage(@Y61.l String message) {
        if (message != null) {
            this.f214938a.invoke(message);
        }
    }
}
