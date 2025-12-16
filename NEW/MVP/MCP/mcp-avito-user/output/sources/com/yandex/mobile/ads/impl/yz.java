package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.yandex.mobile.ads.base.AdResponse;
import com.yandex.mobile.ads.base.AdResultReceiver;

/* loaded from: classes8.dex */
public abstract class yz extends ne<String> implements q2 {

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    private final AdResultReceiver f392111d;

    public yz(@Y61.k Context context, @Y61.k AdResponse<String> adResponse, @Y61.k AdResultReceiver adResultReceiver) {
        super(context, adResponse);
        this.f392111d = adResultReceiver;
        adResultReceiver.a(this);
    }

    public synchronized void f() {
        this.f392111d.a(null);
    }

    @Y61.k
    public final AdResultReceiver g() {
        return this.f392111d;
    }

    public yz(@Y61.k Context context, @Y61.k AdResponse<String> adResponse) {
        this(context, adResponse, new AdResultReceiver(new Handler(Looper.getMainLooper())));
    }
}
