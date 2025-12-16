package com.avito.android.webview;

import HP0.a;
import android.webkit.JavascriptInterface;
import com.avito.android.remote.model.text.TooltipAttribute;
import com.avito.android.webview.models.WebViewInnerEventDeserializer;
import com.avito.android.webview.u;
import com.google.gson.Gson;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: WebViewPresenter.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J'\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\r\u0010\u0006J\u0019\u0010\u000f\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002H\u0007¢\u0006\u0004\b\u000f\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/avito/android/webview/d;", "", "", "message", "Lkotlin/G0;", "postMessage", "(Ljava/lang/String;)V", "title", "subTitle", TooltipAttribute.PARAM_DEEP_LINK, "share", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "text", "copy", "payload", "clickstreamEvent", "_avito_webview_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.webview.d, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C36151d {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final FP0.a f329537a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Y41.l<HP0.a, G0> f329538b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Gson f329539c;

    /* JADX WARN: Multi-variable type inference failed */
    public C36151d(@Y61.k FP0.a aVar, @Y61.k Y41.l<? super HP0.a, G0> lVar) {
        this.f329537a = aVar;
        this.f329538b = lVar;
        com.google.gson.d dVar = new com.google.gson.d();
        dVar.b(HP0.b.class, new WebViewInnerEventDeserializer());
        this.f329539c = dVar.a();
    }

    @JavascriptInterface
    public final void clickstreamEvent(@Y61.l String payload) {
        this.f329537a.b((HP0.b) this.f329539c.d(HP0.b.class, payload));
    }

    @JavascriptInterface
    public final void copy(@Y61.k String text) {
        ((u.b) this.f329538b).invoke(new a.c(text));
    }

    @JavascriptInterface
    public final void postMessage(@Y61.k String message) {
        int iHashCode = message.hashCode();
        Y41.l<HP0.a, G0> lVar = this.f329538b;
        if (iHashCode == -1691294436) {
            if (message.equals("closeAndRefresh")) {
                lVar.invoke(a.C0406a.f7080a);
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
        lVar.invoke(a.b.f7081a);
    }

    @JavascriptInterface
    public final void share(@Y61.k String title, @Y61.k String subTitle, @Y61.k String uri) {
        ((u.b) this.f329538b).invoke(new a.d(title, subTitle, uri));
    }
}
