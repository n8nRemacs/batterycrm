package com.yandex.mobile.ads.impl;

import android.content.Context;
import javax.net.ssl.SSLSocketFactory;

/* loaded from: classes8.dex */
public final class xg0 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final Context f391722a;

    public xg0(@j.N Context context) {
        this.f391722a = context.getApplicationContext();
    }

    @j.N
    public final wg0 a(@j.P SSLSocketFactory sSLSocketFactory) {
        return new wg0(this.f391722a, sSLSocketFactory);
    }
}
