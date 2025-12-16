package com.yandex.mobile.ads.impl;

import android.content.Context;
import java.util.List;

/* loaded from: classes8.dex */
public final class jd1 implements yy0<List<ne1>> {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final C39366t1 f386843a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final yy0<p60> f386844b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private final q60 f386845c;

    public jd1(@j.N Context context, @j.N C39366t1 c39366t1, @j.N yy0<p60> yy0Var) {
        this.f386843a = c39366t1;
        this.f386844b = yy0Var;
        this.f386845c = new q60(context);
    }

    @Override // com.yandex.mobile.ads.impl.yy0
    public final void a(@j.N List<ne1> list) {
        p60 p60VarA = this.f386845c.a(this.f386843a, list);
        if (p60VarA != null) {
            this.f386844b.a((yy0<p60>) p60VarA);
        } else {
            this.f386844b.a(ye1.b("Failed to parse ad break"));
        }
    }

    @Override // com.yandex.mobile.ads.impl.yy0
    public final void a(@j.N ye1 ye1Var) {
        this.f386844b.a(ye1Var);
    }
}
