package com.yandex.mobile.ads.impl;

import android.view.View;
import java.util.Collections;
import java.util.List;

/* loaded from: classes8.dex */
public final class lo0 implements yi1 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final xi1 f387588a;

    public lo0(@j.N xi1 xi1Var) {
        this.f387588a = xi1Var;
    }

    @Override // com.yandex.mobile.ads.impl.yi1
    @j.N
    public final List<df1> a() {
        return Collections.emptyList();
    }

    @Override // com.yandex.mobile.ads.impl.yi1
    @j.P
    public final View getView() {
        return this.f387588a.b();
    }
}
