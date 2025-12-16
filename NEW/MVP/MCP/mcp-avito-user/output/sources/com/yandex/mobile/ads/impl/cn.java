package com.yandex.mobile.ads.impl;

import android.content.Context;

/* loaded from: classes8.dex */
public final class cn {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final Context f384346a;

    public cn(@j.N Context context) {
        this.f384346a = context.getApplicationContext();
    }

    public final boolean a() {
        return (this.f384346a.getResources().getConfiguration().uiMode & 48) == 32;
    }
}
