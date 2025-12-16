package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.yandex.mobile.ads.impl.c50;
import com.yandex.mobile.ads.instream.InstreamAd;
import com.yandex.mobile.ads.instream.InstreamAdLoadListener;

/* loaded from: classes8.dex */
final class e50 implements c50.a {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final Handler f384759a = new Handler(Looper.getMainLooper());

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final a4 f384760b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private final d50 f384761c;

    /* renamed from: d, reason: collision with root package name */
    @j.N
    private final c4 f384762d;

    /* renamed from: e, reason: collision with root package name */
    @j.P
    private InstreamAdLoadListener f384763e;

    public e50(@j.N Context context, @j.N a4 a4Var, @j.N d50 d50Var) {
        this.f384760b = a4Var;
        this.f384761c = d50Var;
        this.f384762d = new c4(context, a4Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(String str) {
        InstreamAdLoadListener instreamAdLoadListener = this.f384763e;
        if (instreamAdLoadListener != null) {
            instreamAdLoadListener.onInstreamAdFailedToLoad(str);
        }
        this.f384761c.a();
    }

    public final void a(@j.N jk1 jk1Var) {
        this.f384762d.b(new e70(jk1Var));
    }

    @Override // com.yandex.mobile.ads.impl.c50.a
    public final void a(@j.N o60 o60Var) {
        y2.a(y6.f391940g.a());
        this.f384760b.a(z3.f392163c);
        this.f384762d.a();
        this.f384759a.post(new H(0, this, o60Var));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(InstreamAd instreamAd) {
        InstreamAdLoadListener instreamAdLoadListener = this.f384763e;
        if (instreamAdLoadListener != null) {
            instreamAdLoadListener.onInstreamAdLoaded(instreamAd);
        }
        this.f384761c.a();
    }

    @Override // com.yandex.mobile.ads.impl.c50.a
    public final void a(@j.N String str) {
        this.f384760b.a(z3.f392163c);
        this.f384762d.a(str);
        this.f384759a.post(new H(1, this, str));
    }

    public final void a(@j.P InstreamAdLoadListener instreamAdLoadListener) {
        this.f384763e = instreamAdLoadListener;
    }
}
