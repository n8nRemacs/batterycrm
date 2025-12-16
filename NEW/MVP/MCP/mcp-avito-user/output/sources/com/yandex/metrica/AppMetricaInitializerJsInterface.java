package com.yandex.metrica;

import android.webkit.JavascriptInterface;
import com.yandex.metrica.impl.ob.Uf;
import j.N;

/* loaded from: classes7.dex */
public class AppMetricaInitializerJsInterface {

    /* renamed from: a, reason: collision with root package name */
    @N
    public final Uf f377491a;

    public AppMetricaInitializerJsInterface(@N Uf uf2) {
        this.f377491a = uf2;
    }

    @JavascriptInterface
    public void init(String str) {
        this.f377491a.c(str);
    }
}
