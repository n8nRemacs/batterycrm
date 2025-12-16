package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.common.AdRequestConfiguration;
import com.yandex.mobile.ads.rewarded.RewardedAdLoadListener;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes8.dex */
public final class gf implements j01 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    private final Context f385732a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    private final oa0 f385733b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    private final ma0 f385734c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    private final com.yandex.mobile.ads.common.a f385735d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    private final i01 f385736e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    private final CopyOnWriteArrayList<h01> f385737f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    private RewardedAdLoadListener f385738g;

    @X41.j
    public gf(@Y61.k Context context, @Y61.k ko1 ko1Var, @Y61.k oa0 oa0Var, @Y61.k ma0 ma0Var, @Y61.k com.yandex.mobile.ads.common.a aVar, @Y61.k i01 i01Var) {
        this.f385732a = context;
        this.f385733b = oa0Var;
        this.f385734c = ma0Var;
        this.f385735d = aVar;
        this.f385736e = i01Var;
        this.f385737f = new CopyOnWriteArrayList<>();
    }

    @Override // com.yandex.mobile.ads.impl.v3
    public final void a(rx rxVar) {
        h01 h01Var = (h01) rxVar;
        if (this.f385738g == null) {
            h70.c("RewardedAdLoader. RewardedAdLoadListener is null on finished ad loading. Please, keep active listener until ad loading finished or use cancelLoading().", new Object[0]);
        }
        h01Var.a((RewardedAdLoadListener) null);
        this.f385737f.remove(h01Var);
    }

    @Override // com.yandex.mobile.ads.impl.j01
    @j.K
    public final void a(@Y61.l RewardedAdLoadListener rewardedAdLoadListener) {
        this.f385733b.a();
        this.f385738g = rewardedAdLoadListener;
        Iterator<h01> it = this.f385737f.iterator();
        while (it.hasNext()) {
            it.next().a(rewardedAdLoadListener);
        }
    }

    public /* synthetic */ gf(Context context, ko1 ko1Var) {
        this(context, ko1Var, new oa0(context), new ma0(), new com.yandex.mobile.ads.common.a(), new i01(ko1Var));
    }

    @Override // com.yandex.mobile.ads.impl.j01
    @j.K
    public final void a(@Y61.k AdRequestConfiguration adRequestConfiguration) {
        this.f385733b.a();
        if (this.f385738g == null) {
            h70.c("RewardedAdLoader. RewardedAdLoadListener is on loading start. Please, use setAdLoadListener before loading Ad.", new Object[0]);
        }
        this.f385734c.a(new H(13, this, adRequestConfiguration));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(gf gfVar, AdRequestConfiguration adRequestConfiguration) {
        h01 h01VarA = gfVar.f385736e.a(gfVar.f385732a, gfVar);
        gfVar.f385737f.add(h01VarA);
        gfVar.f385735d.getClass();
        String strB = com.yandex.mobile.ads.common.a.b(adRequestConfiguration);
        gfVar.f385735d.getClass();
        g5 g5VarA = com.yandex.mobile.ads.common.a.a(adRequestConfiguration);
        h01VarA.a(strB);
        h01VarA.a(gfVar.f385738g);
        h01VarA.b(g5VarA);
    }

    @Override // com.yandex.mobile.ads.impl.j01
    @j.K
    public final void a() {
        this.f385733b.a();
        this.f385734c.a();
        Iterator<h01> it = this.f385737f.iterator();
        while (it.hasNext()) {
            h01 next = it.next();
            next.a((RewardedAdLoadListener) null);
            next.t();
        }
        this.f385737f.clear();
    }
}
