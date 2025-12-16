package com.yandex.mobile.ads.impl;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.yandex.mobile.ads.base.AdResultReceiver;
import java.lang.ref.WeakReference;

/* loaded from: classes8.dex */
public final class w3 implements q2 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final AdResultReceiver f391266a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final WeakReference<com.yandex.mobile.ads.nativeads.k> f391267b;

    public w3(@j.N com.yandex.mobile.ads.nativeads.k kVar) {
        this.f391267b = new WeakReference<>(kVar);
        AdResultReceiver adResultReceiver = new AdResultReceiver(new Handler(Looper.getMainLooper()));
        this.f391266a = adResultReceiver;
        adResultReceiver.a(this);
    }

    @j.N
    public final AdResultReceiver a() {
        return this.f391266a;
    }

    @Override // com.yandex.mobile.ads.impl.q2
    public final void onReceiveResult(int i12, @j.P Bundle bundle) {
        com.yandex.mobile.ads.nativeads.k kVar = this.f391267b.get();
        if (kVar != null) {
            if (i12 == 19) {
                kVar.g();
            }
            if (i12 == 20) {
                kVar.f();
                return;
            }
            switch (i12) {
                case 6:
                    kVar.e();
                    break;
                case 7:
                    kVar.d();
                    break;
                case 8:
                    kVar.c();
                    break;
                case 9:
                    kVar.b();
                    break;
            }
        }
    }
}
