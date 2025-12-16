package com.yandex.mobile.ads.impl;

import java.lang.ref.WeakReference;

/* loaded from: classes8.dex */
public final class sw implements tw {

    /* renamed from: a, reason: collision with root package name */
    @j.P
    private WeakReference<tw> f390041a;

    @Override // com.yandex.mobile.ads.impl.tw
    public final void a() {
        tw twVar;
        WeakReference<tw> weakReference = this.f390041a;
        if (weakReference == null || (twVar = weakReference.get()) == null) {
            return;
        }
        twVar.a();
    }

    public final void a(@j.N tw twVar) {
        this.f390041a = new WeakReference<>(twVar);
    }
}
