package com.avito.android.lib.beduin_v2.component.webview;

import android.view.View;
import com.avito.android.lib.beduin_v2.component.webview.impl.e;
import dU0.InterfaceC39628a;
import kotlin.Metadata;
import org.json.JSONObject;

/* compiled from: WebViewComponent.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/lib/beduin_v2/component/webview/c;", "LPT0/a;", "Lcom/avito/android/lib/beduin_v2/component/webview/impl/e;", "Lcom/avito/beduin/v2/interaction/postmessage/flow/c;", "<init>", "()V", "_design-modules_beduin-v2_renderer_component_webview"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class c extends PT0.a<e, com.avito.beduin.v2.interaction.postmessage.flow.c> {
    public c() {
        super(com.avito.beduin.v2.interaction.postmessage.flow.c.class);
    }

    @Override // PT0.a
    public final void c(InterfaceC39628a interfaceC39628a, View view) {
        ((e) view).f175984b.evaluateJavascript("window.postMessage(" + new JSONObject(((com.avito.beduin.v2.interaction.postmessage.flow.c) interfaceC39628a).f337714a).toString().replace('\"', '\'') + ", '*')", null);
    }
}
