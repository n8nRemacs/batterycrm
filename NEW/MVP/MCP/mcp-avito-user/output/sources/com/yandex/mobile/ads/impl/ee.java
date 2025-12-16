package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.view.ViewTreeObserver;
import com.yandex.mobile.ads.base.AdResponse;
import kotlin.collections.C42745f0;

/* loaded from: classes8.dex */
public final class ee {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    private final yd f384912a;

    public ee(@Y61.k yd ydVar) {
        this.f384912a = ydVar;
    }

    @Y61.k
    public final de a(@Y61.k Context context, @Y61.k AdResponse adResponse, @Y61.k com.yandex.mobile.ads.nativeads.u uVar, @Y61.k com.yandex.mobile.ads.banner.h hVar, @Y61.k sl0 sl0Var, @Y61.k ViewTreeObserver.OnPreDrawListener onPreDrawListener) {
        xd xdVarA = this.f384912a.a(context, uVar);
        return new de(new ce(context, hVar, C42745f0.V(xdVarA != null ? xdVarA.a(context, adResponse, uVar, sl0Var) : null), onPreDrawListener));
    }

    public /* synthetic */ ee() {
        this(new yd());
    }
}
