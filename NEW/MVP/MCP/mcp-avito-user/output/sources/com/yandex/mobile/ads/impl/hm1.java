package com.yandex.mobile.ads.impl;

import android.content.Context;
import java.util.List;

/* loaded from: classes8.dex */
public final class hm1 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final Context f386172a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final cd1 f386173b;

    /* renamed from: c, reason: collision with root package name */
    private int f386174c;

    public hm1(@j.N Context context, @j.N cd1 cd1Var) {
        this.f386172a = context.getApplicationContext();
        this.f386173b = cd1Var;
    }

    public final void a(@j.N Context context, @j.N List<ne1> list, @j.N yy0<List<ne1>> yy0Var) {
        int i12 = this.f386174c + 1;
        this.f386174c = i12;
        if (i12 <= 5) {
            new im1(this.f386172a, this.f386173b).a(context, list, yy0Var);
        } else {
            yy0Var.a(ye1.b("Maximum count of VAST wrapper requests exceeded."));
        }
    }
}
