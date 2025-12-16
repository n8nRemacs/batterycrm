package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.instream.InstreamAdLoadListener;
import com.yandex.mobile.ads.instream.InstreamAdRequestConfiguration;
import java.util.Map;

/* loaded from: classes8.dex */
public final class s40 implements d50 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    private final t40 f389780a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    private final a4 f389781b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    private final e50 f389782c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    private final kf1 f389783d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    private final c50 f389784e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    private final kk1 f389785f;

    public s40(@Y61.k Context context, @Y61.k t40 t40Var) {
        this.f389780a = t40Var;
        a4 a4Var = new a4();
        this.f389781b = a4Var;
        e50 e50Var = new e50(context, a4Var, this);
        this.f389782c = e50Var;
        kf1 kf1Var = new kf1(context, a4Var);
        this.f389783d = kf1Var;
        this.f389784e = new c50(context, kf1Var, e50Var);
        this.f389785f = new kk1();
    }

    public final void a(@Y61.k InstreamAdRequestConfiguration instreamAdRequestConfiguration) {
        kk1 kk1Var = this.f389785f;
        String categoryId = instreamAdRequestConfiguration.getCategoryId();
        String pageId = instreamAdRequestConfiguration.getPageId();
        Map<String, String> parameters = instreamAdRequestConfiguration.getParameters();
        kk1Var.getClass();
        jk1 jk1VarA = kk1.a(categoryId, pageId, parameters);
        this.f389782c.a(jk1VarA);
        this.f389781b.b(z3.f392163c);
        this.f389783d.a(jk1VarA, this.f389784e);
    }

    public final void a(@Y61.l InstreamAdLoadListener instreamAdLoadListener) {
        this.f389782c.a(instreamAdLoadListener);
    }

    @Override // com.yandex.mobile.ads.impl.d50
    public final void a() {
        this.f389780a.a(this);
    }
}
