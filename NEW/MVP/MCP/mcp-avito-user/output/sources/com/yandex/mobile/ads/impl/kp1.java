package com.yandex.mobile.ads.impl;

import android.content.Context;

/* loaded from: classes8.dex */
public final class kp1 {

    /* renamed from: a, reason: collision with root package name */
    private boolean f387248a;

    public final boolean a() {
        return this.f387248a;
    }

    public final void a(Context context) {
        xp1.a(context, "Application Context cannot be null");
        if (this.f387248a) {
            return;
        }
        this.f387248a = true;
        cq1.a().a(context);
        ep1.a().a(context);
        gp1.a(context);
        qp1.a().a(context);
    }
}
