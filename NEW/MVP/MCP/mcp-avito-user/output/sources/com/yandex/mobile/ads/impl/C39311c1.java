package com.yandex.mobile.ads.impl;

import android.app.Activity;
import android.os.Bundle;
import android.os.ResultReceiver;

/* renamed from: com.yandex.mobile.ads.impl.c1, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C39311c1 implements InterfaceC39377x0 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final Activity f384147a;

    /* renamed from: b, reason: collision with root package name */
    @j.P
    private final ResultReceiver f384148b;

    public C39311c1(@j.N Activity activity, @j.P ResultReceiver resultReceiver) {
        this.f384147a = activity;
        this.f384148b = resultReceiver;
    }

    public final void a(int i12) {
        try {
            this.f384147a.setRequestedOrientation(i12);
        } catch (Exception unused) {
        }
    }

    public final void a(int i12, @j.P Bundle bundle) {
        ResultReceiver resultReceiver = this.f384148b;
        if (resultReceiver != null) {
            resultReceiver.send(i12, bundle);
        }
    }

    public final void a() {
        this.f384147a.finish();
    }
}
