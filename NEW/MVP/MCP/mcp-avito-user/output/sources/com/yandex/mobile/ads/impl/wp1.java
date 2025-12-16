package com.yandex.mobile.ads.impl;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.webkit.WebView;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public final class wp1 {
    private wp1() {
    }

    public static void a(WebView webView) {
        a(webView, "finishSession", new Object[0]);
    }

    public static void b(WebView webView) {
        a(webView, "publishImpressionEvent", new Object[0]);
    }

    public static void a(WebView webView, float f12) {
        a(webView, "setDeviceVolume", Float.valueOf(f12));
    }

    public static void b(WebView webView, String str) {
        a(webView, "setState", str);
    }

    public static void a(WebView webView, String str) {
        a(webView, "setNativeViewHierarchy", str);
    }

    public static void b(WebView webView, @j.N JSONObject jSONObject) {
        a(webView, "publishLoadedEvent", jSONObject);
    }

    public static void a(WebView webView, String str, JSONObject jSONObject) {
        if (jSONObject != null) {
            a(webView, "publishMediaEvent", str, jSONObject);
        } else {
            a(webView, "publishMediaEvent", str);
        }
    }

    public static void a(WebView webView, String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        a(webView, "startSession", str, jSONObject, jSONObject2, jSONObject3);
    }

    public static void a(WebView webView, JSONObject jSONObject) {
        a(webView, "init", jSONObject);
    }

    @j.k0
    public static void a(WebView webView, String str, Object... objArr) {
        String string;
        if (webView != null) {
            StringBuilder sb2 = new StringBuilder(128);
            sb2.append("javascript: if(window.omidBridge!==undefined){omidBridge.");
            sb2.append(str);
            sb2.append("(");
            if (objArr.length > 0) {
                for (Object obj : objArr) {
                    if (obj == null) {
                        string = "\"\"";
                    } else {
                        if (obj instanceof String) {
                            string = obj.toString();
                            if (!string.startsWith("{")) {
                                sb2.append('\"');
                                sb2.append(string);
                                sb2.append('\"');
                            }
                        } else {
                            sb2.append(obj);
                        }
                        sb2.append(",");
                    }
                    sb2.append(string);
                    sb2.append(",");
                }
                sb2.setLength(sb2.length() - 1);
            }
            sb2.append(")}");
            String string2 = sb2.toString();
            Handler handler = webView.getHandler();
            if (handler == null || Looper.myLooper() == handler.getLooper()) {
                webView.loadUrl(string2);
                return;
            } else {
                handler.post(new vp1(webView, string2));
                return;
            }
        }
        String strA = up1.a("The WebView is null for ", str);
        if (bp1.f384020a.booleanValue()) {
            TextUtils.isEmpty(strA);
        }
    }
}
