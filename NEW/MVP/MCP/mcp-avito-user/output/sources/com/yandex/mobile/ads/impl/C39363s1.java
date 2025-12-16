package com.yandex.mobile.ads.impl;

import android.content.Context;
import java.util.concurrent.TimeUnit;

/* renamed from: com.yandex.mobile.ads.impl.s1, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C39363s1 {

    /* renamed from: c, reason: collision with root package name */
    private static final long f389741c = TimeUnit.HOURS.toMillis(1);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    private final q21 f389742a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    private final Context f389743b;

    public C39363s1(@Y61.k Context context, @Y61.k q21 q21Var) {
        this.f389742a = q21Var;
        this.f389743b = context.getApplicationContext();
    }

    public final long a() {
        v11 v11VarA = this.f389742a.a(this.f389743b);
        Long lA2 = v11VarA != null ? v11VarA.a() : null;
        return lA2 != null ? lA2.longValue() : f389741c;
    }

    public /* synthetic */ C39363s1(Context context) {
        this(context, q21.b());
    }
}
