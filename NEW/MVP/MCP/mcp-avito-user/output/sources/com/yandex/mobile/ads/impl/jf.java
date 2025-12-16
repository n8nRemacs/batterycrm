package com.yandex.mobile.ads.impl;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.adjust.sdk.Constants;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes8.dex */
public abstract class jf extends WebView {

    /* renamed from: a, reason: collision with root package name */
    @j.P
    HashMap f386848a;

    public jf(Context context) {
        super(context);
        f();
    }

    private void f() {
        WebSettings settings = getSettings();
        settings.setAllowFileAccess(false);
        if (h7.a(11)) {
            settings.setAllowContentAccess(false);
            if (h7.a(16)) {
                settings.setAllowFileAccessFromFileURLs(false);
                settings.setAllowUniversalAccessFromFileURLs(false);
            }
        }
    }

    public final void a(String str) {
        StringBuilder sbA = Cif.a(str);
        sbA.append(c());
        sbA.append("<body style='margin:0; padding:0;'>");
        loadDataWithBaseURL("https://yandex.ru", sbA.toString(), "text/html", Constants.ENCODING, null);
    }

    @Override // android.webkit.WebView
    @SuppressLint({"JavascriptInterface", "AddJavascriptInterface"})
    public final void addJavascriptInterface(Object obj, String str) {
        super.addJavascriptInterface(obj, str);
        if (this.f386848a == null) {
            this.f386848a = new HashMap();
        }
        this.f386848a.put(str, obj);
    }

    public String c() {
        return "";
    }

    @j.P
    public final Object d() {
        HashMap map = this.f386848a;
        if (map != null) {
            return map.get("AdPerformActionsJSI");
        }
        return null;
    }

    public void e() {
        int i12 = rj1.f389556b;
        try {
            if (getParent() instanceof ViewGroup) {
                ((ViewGroup) getParent()).removeView(this);
            }
        } catch (Exception unused) {
        }
        try {
            removeAllViews();
        } catch (Exception unused2) {
        }
        HashMap map = this.f386848a;
        if (map != null) {
            Iterator it = map.keySet().iterator();
            while (it.hasNext()) {
                removeJavascriptInterface((String) it.next());
            }
            this.f386848a.clear();
        }
        destroy();
        getClass().toString();
    }

    public final void g() {
        if (h7.a(11)) {
            getSettings().setDisplayZoomControls(false);
        }
    }

    @Override // android.webkit.WebView
    public final void removeJavascriptInterface(String str) {
        if (h7.a(11)) {
            super.removeJavascriptInterface(str);
        }
    }
}
