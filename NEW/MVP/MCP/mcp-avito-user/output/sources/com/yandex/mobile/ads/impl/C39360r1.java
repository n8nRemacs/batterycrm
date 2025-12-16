package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.C39358q1;

/* renamed from: com.yandex.mobile.ads.impl.r1, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C39360r1 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    private final C39355p1 f389356a;

    public C39360r1(@Y61.k Context context, @Y61.k C39355p1 c39355p1) {
        this.f389356a = c39355p1;
    }

    public final void a(@Y61.l Boolean bool) {
        if (bool != null) {
            this.f389356a.a(new C39346m1(System.currentTimeMillis(), bool.booleanValue()));
        }
    }

    public /* synthetic */ C39360r1(Context context) {
        this(context, C39358q1.a.a(context).c());
    }
}
