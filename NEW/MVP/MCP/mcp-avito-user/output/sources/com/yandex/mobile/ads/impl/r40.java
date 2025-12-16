package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.instream.InstreamAdLoadListener;
import com.yandex.mobile.ads.instream.InstreamAdRequestConfiguration;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

@j.K
/* loaded from: classes8.dex */
public final class r40 implements t40 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    private final Context f389377a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    private final oa0 f389378b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    private final CopyOnWriteArrayList<s40> f389379c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    private final ma0 f389380d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    private InstreamAdLoadListener f389381e;

    public r40(@Y61.k Context context) {
        this.f389377a = context;
        oa0 oa0Var = new oa0(context);
        this.f389378b = oa0Var;
        this.f389379c = new CopyOnWriteArrayList<>();
        this.f389380d = new ma0();
        oa0Var.a();
    }

    public final void a(@Y61.l InstreamAdLoadListener instreamAdLoadListener) {
        this.f389378b.a();
        this.f389381e = instreamAdLoadListener;
        Iterator<T> it = this.f389379c.iterator();
        while (it.hasNext()) {
            ((s40) it.next()).a(instreamAdLoadListener);
        }
    }

    public final void a(@Y61.k InstreamAdRequestConfiguration instreamAdRequestConfiguration) {
        this.f389378b.a();
        this.f389380d.a(new H(20, this, instreamAdRequestConfiguration));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(r40 r40Var, InstreamAdRequestConfiguration instreamAdRequestConfiguration) {
        s40 s40Var = new s40(r40Var.f389377a, r40Var);
        r40Var.f389379c.add(s40Var);
        s40Var.a(r40Var.f389381e);
        s40Var.a(instreamAdRequestConfiguration);
    }

    @Override // com.yandex.mobile.ads.impl.t40
    public final void a(@Y61.k s40 s40Var) {
        this.f389378b.a();
        this.f389379c.remove(s40Var);
    }
}
