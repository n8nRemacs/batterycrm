package com.yandex.mobile.ads.impl;

import android.app.Activity;
import android.content.Context;
import com.yandex.mobile.ads.appopenad.AppOpenAd;
import com.yandex.mobile.ads.appopenad.AppOpenAdEventListener;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes8.dex */
public final class ya implements AppOpenAd {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    private final sa f391976a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    private final vv0 f391977b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    private final oa0 f391978c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    private final ma0 f391979d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    private final AtomicBoolean f391980e;

    public ya(@Y61.k Context context, @Y61.k sa saVar, @Y61.k vv0 vv0Var, @Y61.k oa0 oa0Var, @Y61.k ma0 ma0Var) {
        this.f391976a = saVar;
        this.f391977b = vv0Var;
        this.f391978c = oa0Var;
        this.f391979d = ma0Var;
        this.f391980e = new AtomicBoolean(false);
        saVar.a(vv0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(ya yaVar, Activity activity) {
        if (yaVar.f391980e.getAndSet(true)) {
            yaVar.f391977b.a(a5.f383408a);
        } else {
            yaVar.f391976a.a(activity);
        }
    }

    @Override // com.yandex.mobile.ads.appopenad.AppOpenAd
    public final void setAdEventListener(@Y61.l AppOpenAdEventListener appOpenAdEventListener) {
        this.f391978c.a();
        this.f391977b.a(appOpenAdEventListener);
    }

    @Override // com.yandex.mobile.ads.appopenad.AppOpenAd
    public final void show(@Y61.k Activity activity) {
        this.f391978c.a();
        this.f391979d.a(new A2(4, this, activity));
    }

    public /* synthetic */ ya(Context context, sa saVar) {
        this(context, saVar, new vv0(), new oa0(context), new ma0());
    }
}
