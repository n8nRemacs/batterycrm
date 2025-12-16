package com.yandex.metrica;

import android.webkit.JavascriptInterface;
import com.yandex.metrica.impl.ob.Uf;
import j.N;

/* loaded from: classes7.dex */
public class AppMetricaJsInterface {

    /* renamed from: a, reason: collision with root package name */
    @N
    public final Uf f377492a;

    public AppMetricaJsInterface(@N Uf uf2) {
        this.f377492a = uf2;
    }

    @JavascriptInterface
    public void reportEvent(String str, String str2) {
        this.f377492a.c(str, str2);
    }
}
