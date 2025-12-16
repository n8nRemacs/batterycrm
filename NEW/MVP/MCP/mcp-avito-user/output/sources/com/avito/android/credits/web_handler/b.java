package com.avito.android.credits.web_handler;

import Y61.k;
import Y61.l;
import android.net.Uri;
import com.avito.android.credits.di.m;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;

/* compiled from: HomeCreditWebAnalyticsHandler.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/credits/web_handler/b;", "Lcom/avito/android/credits/web_handler/f;", "_avito_credits_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class b extends f {

    /* renamed from: d, reason: collision with root package name */
    @l
    public String f129059d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final String f129060e;

    @Inject
    public b(@m @l String str, @k com.avito.android.credits.web_logger.c cVar) {
        this.f129059d = str;
        this.f129063a.add(cVar);
        this.f129060e = "HomeCreditAnalytics";
    }

    @Override // com.avito.android.credits.web_handler.f
    @org.intellij.lang.annotations.d
    @k
    /* renamed from: c */
    public final String getF129062e() {
        Uri uri;
        StringBuilder sb2 = new StringBuilder("\n(function () {\n    if (!window.androidPostMessageListenerAdded) {\n        window.androidPostMessageListenerAdded = true;\n\n        function receiveMessage(event) {\n            if (event.origin === '");
        String str = this.f129059d;
        String str2 = null;
        if (str != null) {
            if (str.length() == 0) {
                str = null;
            }
            if (str != null && (uri = Uri.parse(str)) != null) {
                str2 = uri.getScheme() + "://" + uri.getAuthority();
            }
        }
        sb2.append(str2);
        sb2.append("' && event.data) {\n                let msg;\n                if (typeof event.data === 'string') {\n                    try {\n                        msg = JSON.parse(event.data);\n                    } catch (error) {\n                        console.error('Error parsing JSON:', error);\n                        return;\n                    }\n                } else {\n                    msg = event.data;\n                }\n                if (msg.type !== undefined) {\n                    AndroidAnalytics.receiveMessage(msg.type, JSON.stringify(msg.result), event.data);\n                }\n            }\n        }\n\n        window.addEventListener('message', receiveMessage, false);\n    }\n})();\n        ");
        return C43066x.E0(sb2.toString());
    }

    @Override // com.avito.android.credits.web_handler.f
    @k
    /* renamed from: d, reason: from getter */
    public final String getF129060e() {
        return this.f129060e;
    }

    @Override // com.avito.android.credits.web_handler.f
    public final void e(@l String str) {
        this.f129059d = str;
    }
}
