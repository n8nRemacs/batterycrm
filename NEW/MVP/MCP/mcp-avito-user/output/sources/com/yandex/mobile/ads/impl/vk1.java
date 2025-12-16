package com.yandex.mobile.ads.impl;

import android.view.View;

/* loaded from: classes8.dex */
public final class vk1 {

    /* renamed from: a, reason: collision with root package name */
    private final int f390905a;

    /* renamed from: b, reason: collision with root package name */
    private final int f390906b;

    public vk1(int i12, int i13) {
        this.f390905a = i12;
        this.f390906b = i13;
    }

    public final void a(@j.N View view, boolean z12) {
        view.setBackground(androidx.core.content.d.getDrawable(view.getContext(), z12 ? this.f390905a : this.f390906b));
    }
}
