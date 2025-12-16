package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.view.View;

/* loaded from: classes8.dex */
final class hv implements InterfaceC39347n<gv> {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final qv f386216a;

    public hv(@j.N qv qvVar) {
        this.f386216a = qvVar;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC39347n
    public final void a(@j.N View view, @j.N AbstractC39344m abstractC39344m) {
        Context context = view.getContext();
        this.f386216a.a(context, (gv) abstractC39344m);
    }
}
