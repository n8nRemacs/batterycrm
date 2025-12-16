package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.net.Uri;

/* loaded from: classes8.dex */
public final class u4 implements qq {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    private final p31 f390443a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f390444b;

    public u4(@Y61.k Context context, @Y61.k p31 p31Var) {
        this.f390443a = p31Var;
        this.f390444b = fv.a(context);
    }

    @Override // com.yandex.mobile.ads.impl.qq
    public final boolean a(@Y61.k Uri uri) {
        if (!this.f390444b || !kotlin.jvm.internal.L.f(uri.getHost(), "showNextAd")) {
            return false;
        }
        this.f390443a.a();
        return true;
    }
}
