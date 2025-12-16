package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.common.AdRequestConfiguration;
import com.yandex.mobile.ads.interstitial.InterstitialAdLoadListener;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes8.dex */
public final class bf implements u70 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    private final Context f383938a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    private final oa0 f383939b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    private final ma0 f383940c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    private final com.yandex.mobile.ads.common.a f383941d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    private final t70 f383942e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    private final CopyOnWriteArrayList<s70> f383943f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    private InterstitialAdLoadListener f383944g;

    @X41.j
    public bf(@Y61.k Context context, @Y61.k ko1 ko1Var, @Y61.k oa0 oa0Var, @Y61.k ma0 ma0Var, @Y61.k com.yandex.mobile.ads.common.a aVar, @Y61.k t70 t70Var) {
        this.f383938a = context;
        this.f383939b = oa0Var;
        this.f383940c = ma0Var;
        this.f383941d = aVar;
        this.f383942e = t70Var;
        this.f383943f = new CopyOnWriteArrayList<>();
    }

    @Override // com.yandex.mobile.ads.impl.v3
    public final void a(rx rxVar) {
        s70 s70Var = (s70) rxVar;
        if (this.f383944g == null) {
            h70.c("InterstitialAdLoader. InterstitialAdLoadListener is null on finished ad loading. Please, keep active listener until ad loading finished or use cancelLoading().", new Object[0]);
        }
        s70Var.a((InterstitialAdLoadListener) null);
        this.f383943f.remove(s70Var);
    }

    @Override // com.yandex.mobile.ads.impl.u70
    @j.K
    public final void a(@Y61.l InterstitialAdLoadListener interstitialAdLoadListener) {
        this.f383939b.a();
        this.f383944g = interstitialAdLoadListener;
        Iterator<s70> it = this.f383943f.iterator();
        while (it.hasNext()) {
            it.next().a(interstitialAdLoadListener);
        }
    }

    public /* synthetic */ bf(Context context, ko1 ko1Var) {
        this(context, ko1Var, new oa0(context), new ma0(), new com.yandex.mobile.ads.common.a(), new t70(ko1Var));
    }

    @Override // com.yandex.mobile.ads.impl.u70
    @j.K
    public final void a(@Y61.k AdRequestConfiguration adRequestConfiguration) {
        this.f383939b.a();
        if (this.f383944g == null) {
            h70.c("InterstitialAdLoader. InterstitialAdLoadListener is null on loading start. Please, use setAdLoadListener before loading Ad.", new Object[0]);
        }
        this.f383940c.a(new H(7, this, adRequestConfiguration));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(bf bfVar, AdRequestConfiguration adRequestConfiguration) {
        s70 s70VarA = bfVar.f383942e.a(bfVar.f383938a, bfVar);
        bfVar.f383943f.add(s70VarA);
        bfVar.f383941d.getClass();
        String strB = com.yandex.mobile.ads.common.a.b(adRequestConfiguration);
        bfVar.f383941d.getClass();
        g5 g5VarA = com.yandex.mobile.ads.common.a.a(adRequestConfiguration);
        s70VarA.a(strB);
        s70VarA.a(bfVar.f383944g);
        s70VarA.b(g5VarA);
    }

    @Override // com.yandex.mobile.ads.impl.u70
    @j.K
    public final void a() {
        this.f383939b.a();
        this.f383940c.a();
        Iterator<s70> it = this.f383943f.iterator();
        while (it.hasNext()) {
            s70 next = it.next();
            next.a((InterstitialAdLoadListener) null);
            next.t();
        }
        this.f383943f.clear();
    }
}
