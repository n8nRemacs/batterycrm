package com.avito.android.beduin.common.component.payment_webview;

import android.net.Uri;
import androidx.camera.camera2.internal.G;
import com.yatatsu.powerwebview.PowerWebView;
import com.yatatsu.powerwebview.rx.PowerWebViewStateChangeEvent;
import kotlin.Metadata;

/* compiled from: WebPaymentPostMessagesHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/yatatsu/powerwebview/rx/PowerWebViewStateChangeEvent;", "it", "Lkotlin/G0;", "accept", "(Lcom/yatatsu/powerwebview/rx/PowerWebViewStateChangeEvent;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class A<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PowerWebView f101832b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ z f101833c;

    public A(PowerWebView powerWebView, z zVar) {
        this.f101832b = powerWebView;
        this.f101833c = zVar;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        if (((PowerWebViewStateChangeEvent) obj).f392937a == PowerWebViewStateChangeEvent.State.f392944c) {
            PowerWebView powerWebView = this.f101832b;
            Uri uri = Uri.parse(powerWebView.getUrl());
            String str = uri.getScheme() + "://" + uri.getAuthority();
            z zVar = this.f101833c;
            zVar.getClass();
            StringBuilder sb2 = new StringBuilder("\n        javascript: (function() {\n            function receiveMessage(event) {\n                if (event.origin === '");
            sb2.append(str);
            sb2.append("' && event.data) {\n                    if (event.data.");
            String str2 = zVar.f101909b;
            powerWebView.loadUrl(G.h(sb2, str2, " !== undefined) {\n                        WebPaymentPage.receiveMessage(event.data.", str2, ", event.data.message, JSON.stringify(event.data));\n                    }\n                }\n            }\n        window.addEventListener('message', receiveMessage, false);\n        })()\n    "));
        }
    }
}
