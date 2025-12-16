package com.yandex.mobile.ads.impl;

import android.view.View;
import java.util.Collections;
import java.util.List;

/* loaded from: classes8.dex */
public final class b70 implements yi1 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final l50 f383803a;

    public b70(@j.N l50 l50Var) {
        this.f383803a = l50Var;
    }

    @Override // com.yandex.mobile.ads.impl.yi1
    @j.N
    public final List<df1> a() {
        k50 k50VarA = this.f383803a.a();
        return k50VarA != null ? k50VarA.a() : Collections.emptyList();
    }

    @Override // com.yandex.mobile.ads.impl.yi1
    @j.P
    public final View getView() {
        k50 k50VarA = this.f383803a.a();
        if (k50VarA != null) {
            return k50VarA.b();
        }
        return null;
    }
}
