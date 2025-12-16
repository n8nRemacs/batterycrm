package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.common.AdImpressionData;
import java.util.Iterator;
import java.util.WeakHashMap;

/* loaded from: classes8.dex */
final class he0 {

    /* renamed from: a, reason: collision with root package name */
    private final WeakHashMap<com.yandex.mobile.ads.nativeads.k, Object> f386117a = new WeakHashMap<>();

    public final void a(@j.N com.yandex.mobile.ads.nativeads.k kVar) {
        this.f386117a.put(kVar, null);
    }

    public final void b() {
        Iterator<com.yandex.mobile.ads.nativeads.k> it = this.f386117a.keySet().iterator();
        while (it.hasNext()) {
            it.next().c();
        }
    }

    public final void c() {
        Iterator<com.yandex.mobile.ads.nativeads.k> it = this.f386117a.keySet().iterator();
        while (it.hasNext()) {
            it.next().d();
        }
    }

    public final void d() {
        Iterator<com.yandex.mobile.ads.nativeads.k> it = this.f386117a.keySet().iterator();
        while (it.hasNext()) {
            it.next().e();
        }
    }

    public final void a() {
        Iterator<com.yandex.mobile.ads.nativeads.k> it = this.f386117a.keySet().iterator();
        while (it.hasNext()) {
            it.next().b();
        }
    }

    public final void a(@j.P AdImpressionData adImpressionData) {
        Iterator<com.yandex.mobile.ads.nativeads.k> it = this.f386117a.keySet().iterator();
        while (it.hasNext()) {
            it.next().a(adImpressionData);
        }
    }
}
