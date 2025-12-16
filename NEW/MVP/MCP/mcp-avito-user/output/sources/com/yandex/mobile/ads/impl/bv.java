package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.base.tracker.interaction.model.FalseClick;

/* loaded from: classes8.dex */
final class bv {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final x6 f384074a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final FalseClick f384075b;

    public bv(@j.N Context context, @j.N n2 n2Var, @j.N FalseClick falseClick) {
        this.f384074a = new x6(context, n2Var);
        this.f384075b = falseClick;
    }

    public final void a(long j12) {
        if (j12 <= this.f384075b.c()) {
            this.f384074a.a(this.f384075b.d());
        }
    }
}
