package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.base.AdResponse;
import com.yandex.mobile.ads.impl.mt;

/* loaded from: classes8.dex */
public final class ot {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final Context f388635a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final n2 f388636b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private final AdResponse f388637c;

    public ot(@j.N Context context, @j.N AdResponse adResponse, @j.N n2 n2Var) {
        this.f388635a = context.getApplicationContext();
        this.f388636b = n2Var;
        this.f388637c = adResponse;
    }

    @j.N
    public final du a() {
        return new du(new mt.b(this.f388635a).a(), new nd0(this.f388635a), new yh1(this.f388635a, this.f388637c, this.f388636b));
    }
}
