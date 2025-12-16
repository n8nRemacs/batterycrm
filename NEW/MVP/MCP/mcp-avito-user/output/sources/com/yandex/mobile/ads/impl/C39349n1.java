package com.yandex.mobile.ads.impl;

import android.content.Context;

/* renamed from: com.yandex.mobile.ads.impl.n1, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C39349n1 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    private final C39363s1 f388127a;

    public C39349n1(@Y61.k Context context, @Y61.k C39363s1 c39363s1) {
        this.f388127a = c39363s1;
    }

    public final boolean a(@Y61.k C39346m1 c39346m1) {
        return c39346m1.a() + this.f388127a.a() < g91.a();
    }

    public /* synthetic */ C39349n1(Context context) {
        this(context, new C39363s1(context));
    }
}
