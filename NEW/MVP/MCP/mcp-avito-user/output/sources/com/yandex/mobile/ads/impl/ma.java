package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.yandex.metrica.IIdentifierCallback;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.collections.C42745f0;

/* loaded from: classes8.dex */
public final class ma implements IIdentifierCallback {

    /* renamed from: g, reason: collision with root package name */
    @Deprecated
    private static final long f387888g = TimeUnit.SECONDS.toMillis(30);

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    @Deprecated
    private static final List<String> f387889h = C42745f0.U("yandex_mobile_metrica_get_ad_url", "yandex_mobile_metrica_uuid", "yandex_mobile_metrica_device_id");

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    private final ha f387890a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    private final la f387891b;

    /* renamed from: e, reason: collision with root package name */
    private boolean f387894e;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    private final Handler f387892c = new Handler(Looper.getMainLooper());

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    private final ia f387893d = new ia();

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    private final Object f387895f = new Object();

    public static final class a extends kotlin.jvm.internal.N implements Y41.a<kotlin.G0> {
        public a() {
            super(0);
        }

        @Override // Y41.a
        public final kotlin.G0 invoke() {
            ma.c(ma.this);
            ma.this.f387893d.getClass();
            ia.a();
            ma.b(ma.this);
            return kotlin.G0.f406611a;
        }
    }

    public ma(@Y61.k ha haVar, @Y61.k la laVar) {
        this.f387890a = haVar;
        this.f387891b = laVar;
    }

    public static final void c(ma maVar) {
        synchronized (maVar.f387895f) {
            maVar.f387892c.removeCallbacksAndMessages(null);
            maVar.f387894e = false;
            kotlin.G0 g02 = kotlin.G0.f406611a;
        }
    }

    @Override // com.yandex.metrica.IIdentifierCallback
    public final void onReceive(@Y61.l Map<String, String> map) {
        synchronized (this.f387895f) {
            this.f387892c.removeCallbacksAndMessages(null);
            this.f387894e = false;
            kotlin.G0 g02 = kotlin.G0.f406611a;
        }
        if (map == null) {
            this.f387893d.getClass();
            this.f387891b.a();
        } else {
            this.f387891b.a(new ka(map.get("yandex_mobile_metrica_get_ad_url"), map.get("yandex_mobile_metrica_device_id"), map.get("yandex_mobile_metrica_uuid")));
        }
    }

    @Override // com.yandex.metrica.IIdentifierCallback
    public final void onRequestError(@Y61.k IIdentifierCallback.Reason reason) {
        synchronized (this.f387895f) {
            this.f387892c.removeCallbacksAndMessages(null);
            this.f387894e = false;
            kotlin.G0 g02 = kotlin.G0.f406611a;
        }
        this.f387893d.a(reason);
        this.f387891b.a();
    }

    public static final void b(ma maVar) {
        maVar.f387891b.a();
    }

    public final void a(@Y61.k Context context, @Y61.k j20 j20Var) {
        boolean z12;
        this.f387891b.a(j20Var);
        try {
            synchronized (this.f387895f) {
                try {
                    if (this.f387894e) {
                        z12 = false;
                    } else {
                        z12 = true;
                        this.f387894e = true;
                    }
                    kotlin.G0 g02 = kotlin.G0.f406611a;
                } finally {
                }
            }
            if (z12) {
                a();
                ha haVar = this.f387890a;
                List<String> list = f387889h;
                haVar.getClass();
                ha.a(context, this, list);
            }
        } catch (Throwable unused) {
            synchronized (this.f387895f) {
                this.f387892c.removeCallbacksAndMessages(null);
                this.f387894e = false;
                kotlin.G0 g03 = kotlin.G0.f406611a;
            }
        }
    }

    private final void a() {
        this.f387892c.postDelayed(new I(1, new a()), f387888g);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Y41.a aVar) {
        aVar.invoke();
    }
}
