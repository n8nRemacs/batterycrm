package com.yandex.mobile.ads.impl;

import android.content.Context;

/* loaded from: classes8.dex */
public final class x70 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    private final xv0 f391571a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f391572b;

    public x70(@Y61.k Context context, @Y61.k xv0 xv0Var) {
        this.f391571a = xv0Var;
        this.f391572b = context.getApplicationContext();
    }

    @Y61.k
    public final w70 a(@Y61.k q70 q70Var) {
        return new w70(this.f391572b, q70Var, this.f391571a);
    }

    public /* synthetic */ x70(Context context) {
        this(context, new xv0());
    }
}
