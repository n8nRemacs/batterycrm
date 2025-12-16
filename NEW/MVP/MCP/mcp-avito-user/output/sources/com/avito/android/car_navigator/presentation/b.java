package com.avito.android.car_navigator.presentation;

import Am.InterfaceC13051a;
import Y41.l;
import android.webkit.JavascriptInterface;
import com.avito.android.car_navigator.presentation.k;
import com.avito.android.webview.models.WebViewInnerEventDeserializer;
import com.google.gson.Gson;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: CarNavigatorWebViewController.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\b\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002H\u0007¢\u0006\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/avito/android/car_navigator/presentation/b;", "", "", "message", "Lkotlin/G0;", "postMessage", "(Ljava/lang/String;)V", "payload", "clickstreamEvent", "_avito_car-navigator_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
final class b {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC13051a f115241a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final l<k, G0> f115242b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Gson f115243c;

    /* JADX WARN: Multi-variable type inference failed */
    public b(@Y61.k InterfaceC13051a interfaceC13051a, @Y61.k l<? super k, G0> lVar) {
        this.f115241a = interfaceC13051a;
        this.f115242b = lVar;
        com.google.gson.d dVar = new com.google.gson.d();
        dVar.b(HP0.b.class, new WebViewInnerEventDeserializer());
        this.f115243c = dVar.a();
    }

    @JavascriptInterface
    public final void clickstreamEvent(@Y61.l String payload) {
        this.f115241a.b((HP0.b) this.f115243c.d(HP0.b.class, payload));
    }

    @JavascriptInterface
    public final void postMessage(@Y61.k String message) {
        int iHashCode = message.hashCode();
        l<k, G0> lVar = this.f115242b;
        if (iHashCode == -1691294436) {
            if (message.equals("closeAndRefresh")) {
                lVar.invoke(k.a.f115265a);
                return;
            }
            return;
        }
        if (iHashCode != 3015911) {
            if (iHashCode != 94756344 || !message.equals("close")) {
                return;
            }
        } else if (!message.equals("back")) {
            return;
        }
        lVar.invoke(k.b.f115266a);
    }
}
