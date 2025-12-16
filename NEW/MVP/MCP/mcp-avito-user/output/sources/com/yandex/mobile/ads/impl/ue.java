package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.appopenad.AppOpenAdLoadListener;
import com.yandex.mobile.ads.common.AdRequestConfiguration;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

@j.K
/* loaded from: classes8.dex */
public final class ue implements va {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    private final Context f390518a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    private final oa0 f390519b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    private final ma0 f390520c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    private final com.yandex.mobile.ads.common.a f390521d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    private final xa f390522e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    private final CopyOnWriteArrayList<ua> f390523f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    private AppOpenAdLoadListener f390524g;

    @X41.j
    public ue(@Y61.k Context context, @Y61.k ko1 ko1Var, @Y61.k oa0 oa0Var, @Y61.k ma0 ma0Var, @Y61.k com.yandex.mobile.ads.common.a aVar, @Y61.k xa xaVar) {
        this.f390518a = context;
        this.f390519b = oa0Var;
        this.f390520c = ma0Var;
        this.f390521d = aVar;
        this.f390522e = xaVar;
        this.f390523f = new CopyOnWriteArrayList<>();
        oa0Var.a();
    }

    @Override // com.yandex.mobile.ads.impl.v3
    public final void a(rx rxVar) {
        ua uaVar = (ua) rxVar;
        this.f390519b.a();
        uaVar.a((AppOpenAdLoadListener) null);
        this.f390523f.remove(uaVar);
    }

    @Override // com.yandex.mobile.ads.impl.va
    @j.K
    public final void a(@Y61.l AppOpenAdLoadListener appOpenAdLoadListener) {
        this.f390519b.a();
        this.f390524g = appOpenAdLoadListener;
        Iterator<ua> it = this.f390523f.iterator();
        while (it.hasNext()) {
            it.next().a(appOpenAdLoadListener);
        }
    }

    public /* synthetic */ ue(Context context, ko1 ko1Var) {
        this(context, ko1Var, new oa0(context), new ma0(), new com.yandex.mobile.ads.common.a(), new xa(ko1Var));
    }

    @Override // com.yandex.mobile.ads.impl.va
    @j.K
    public final void a(@Y61.k AdRequestConfiguration adRequestConfiguration) {
        this.f390519b.a();
        this.f390520c.a(new H(24, this, adRequestConfiguration));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(ue ueVar, AdRequestConfiguration adRequestConfiguration) {
        ua uaVarA = ueVar.f390522e.a(ueVar.f390518a, ueVar);
        ueVar.f390523f.add(uaVarA);
        ueVar.f390521d.getClass();
        String strB = com.yandex.mobile.ads.common.a.b(adRequestConfiguration);
        ueVar.f390521d.getClass();
        g5 g5VarA = com.yandex.mobile.ads.common.a.a(adRequestConfiguration);
        uaVarA.a(strB);
        uaVarA.a(ueVar.f390524g);
        uaVarA.b(g5VarA);
    }

    @Override // com.yandex.mobile.ads.impl.va
    @j.K
    public final void a() {
        this.f390519b.a();
        this.f390520c.a();
        Iterator<ua> it = this.f390523f.iterator();
        while (it.hasNext()) {
            ua next = it.next();
            next.a((AppOpenAdLoadListener) null);
            next.t();
        }
        this.f390523f.clear();
    }
}
