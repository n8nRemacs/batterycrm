package com.my.tracker.obfuscated;

import android.content.Intent;
import android.net.Uri;

/* renamed from: com.my.tracker.obfuscated.s, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37844s {

    /* renamed from: a, reason: collision with root package name */
    private final C37848w f365777a;

    private C37844s(C37848w c37848w) {
        this.f365777a = c37848w;
    }

    public static C37844s a(C37848w c37848w) {
        return new C37844s(c37848w);
    }

    public String a(Intent intent) {
        e2.a("DeeplinkHandler: handling deeplink");
        if (intent == null) {
            e2.a("DeeplinkHandler: intent is null");
            return null;
        }
        try {
            Uri data = intent.getData();
            if (data == null) {
                e2.a("DeeplinkHandler: intent data is null");
                return null;
            }
            e2.a("DeeplinkHandler: intent data: " + data);
            String queryParameter = data.getQueryParameter("mt_deeplink");
            String queryParameter2 = data.getQueryParameter("mt_click_id");
            if (queryParameter != null) {
                e2.a("DeeplinkHandler: found mt_deeplink in intent");
            } else {
                e2.a("DeeplinkHandler: mt_deeplink not found in intent");
                queryParameter = data.toString();
            }
            e2.a("DeeplinkHandler: deeplink " + queryParameter);
            e2.a("DeeplinkHandler: clickId " + queryParameter2);
            this.f365777a.a(queryParameter, queryParameter2);
            return queryParameter;
        } catch (Throwable th2) {
            e2.b("DeeplinkHandler error: ", th2);
            return null;
        }
    }
}
