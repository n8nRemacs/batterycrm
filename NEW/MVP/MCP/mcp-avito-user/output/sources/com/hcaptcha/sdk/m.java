package com.hcaptcha.sdk;

import android.os.Handler;
import android.webkit.JavascriptInterface;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import j.P;
import java.io.Serializable;
import java.util.Locale;
import lombok.NonNull;

/* loaded from: classes7.dex */
class m implements Serializable {

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final transient Handler f363111b;

    /* renamed from: c, reason: collision with root package name */
    @P
    public final String f363112c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final transient t f363113d;

    public m(@NonNull Handler handler, @NonNull HCaptchaConfig hCaptchaConfig, @NonNull t tVar) {
        String strC;
        this.f363111b = handler;
        this.f363113d = tVar;
        try {
            strC = new ObjectMapper().c(hCaptchaConfig);
        } catch (JsonProcessingException unused) {
            strC = null;
        }
        this.f363112c = strC;
    }

    @JavascriptInterface
    @P
    public String getConfig() {
        return this.f363112c;
    }

    @JavascriptInterface
    public void onError(int i12) {
        Object[] objArr = {Integer.valueOf(i12)};
        if (n.f363114a) {
            String.format(Locale.getDefault(), "JSInterface.onError %d", objArr);
        }
        for (HCaptchaError hCaptchaError : HCaptchaError.values()) {
            if (hCaptchaError.f363080b == i12) {
                this.f363111b.post(new k(this, hCaptchaError, 1));
                return;
            }
        }
        throw new RuntimeException(AK.c.g(i12, "Unsupported error id: "));
    }

    @JavascriptInterface
    public void onLoaded() {
        this.f363111b.post(new l(this.f363113d, 1));
    }

    @JavascriptInterface
    public void onOpen() {
        this.f363111b.post(new l(this.f363113d, 0));
    }

    @JavascriptInterface
    public void onPass(String str) {
        this.f363111b.post(new k(this, str, 0));
    }
}
