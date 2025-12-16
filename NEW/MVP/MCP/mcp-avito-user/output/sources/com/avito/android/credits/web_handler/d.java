package com.avito.android.credits.web_handler;

import Y61.k;
import Y61.l;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: TinkoffWebAnalyticsHandler.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/credits/web_handler/d;", "Lcom/avito/android/credits/web_handler/f;", "_avito_credits_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class d extends f {

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f129061d;

    /* renamed from: e, reason: collision with root package name */
    @org.intellij.lang.annotations.d
    @k
    public final String f129062e;

    @Inject
    public d(@k com.avito.android.credits.web_logger.e eVar) {
        this.f129063a.add(eVar);
        this.f129061d = "TinkoffAnalytics";
        this.f129062e = " \n        (function() {\n            function receiveMessage(event) {\n                if (event.origin === 'https://www.tinkoff.ru' && event.data && typeof event.data === 'string') {\n                    const msg = JSON.parse(event.data);\n                    if (msg.type !== undefined && msg.result !== undefined) {\n                        AndroidAnalytics.receiveMessage(msg.type, JSON.stringify(msg.result), event.data);\n                    }\n                }\n            }\n            window.addEventListener('message', receiveMessage, false);\n        })()\n    ";
    }

    @Override // com.avito.android.credits.web_handler.f
    @k
    /* renamed from: c, reason: from getter */
    public final String getF129062e() {
        return this.f129062e;
    }

    @Override // com.avito.android.credits.web_handler.f
    @k
    /* renamed from: d, reason: from getter */
    public final String getF129061d() {
        return this.f129061d;
    }

    @Override // com.avito.android.credits.web_handler.f
    public final void e(@l String str) {
    }
}
