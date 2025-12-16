package com.yandex.mobile.ads.banner;

import com.yandex.mobile.ads.impl.l7;
import com.yandex.mobile.ads.impl.rj1;
import j.N;
import java.lang.ref.WeakReference;

/* loaded from: classes8.dex */
public final class c implements l7 {

    /* renamed from: a, reason: collision with root package name */
    @N
    private final WeakReference<h> f382510a;

    public c(@N h hVar) {
        this.f382510a = new WeakReference<>(hVar);
    }

    @Override // com.yandex.mobile.ads.impl.l7
    public final boolean a() {
        h hVar = this.f382510a.get();
        return hVar != null && rj1.b(hVar) >= 1;
    }

    @Override // com.yandex.mobile.ads.impl.l7
    public final boolean b() {
        h hVar = this.f382510a.get();
        return (hVar == null || rj1.d(hVar)) ? false : true;
    }
}
