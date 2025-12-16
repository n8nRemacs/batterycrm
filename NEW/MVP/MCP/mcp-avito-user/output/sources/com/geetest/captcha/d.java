package com.geetest.captcha;

import android.webkit.ValueCallback;

/* loaded from: classes4.dex */
public final class d<T> implements ValueCallback<String> {

    /* renamed from: a, reason: collision with root package name */
    public static final d f342706a = new d();

    @Override // android.webkit.ValueCallback
    public void onReceiveValue(String str) {
        h0.f342732d.c("DialogController javascript:jsBridge.callback('showBox') return: " + str);
    }
}
