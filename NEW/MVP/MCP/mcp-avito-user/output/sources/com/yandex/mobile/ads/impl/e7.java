package com.yandex.mobile.ads.impl;

import android.view.View;
import com.yandex.mobile.ads.nativeads.C39386b;

/* loaded from: classes8.dex */
public final class e7 implements ej1 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final com.yandex.mobile.ads.nativeads.w f384794a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final C39386b f384795b;

    public e7(@j.N com.yandex.mobile.ads.nativeads.w wVar, @j.N C39386b c39386b) {
        this.f384794a = wVar;
        this.f384795b = c39386b;
    }

    @Override // com.yandex.mobile.ads.impl.ej1
    public final void a(@j.N View view, @j.N eb ebVar) {
    }

    @Override // com.yandex.mobile.ads.impl.ej1
    public final void a(@j.N eb ebVar, @j.N bj bjVar) {
        this.f384795b.a(ebVar, ebVar.a(), this.f384794a, bjVar);
    }
}
