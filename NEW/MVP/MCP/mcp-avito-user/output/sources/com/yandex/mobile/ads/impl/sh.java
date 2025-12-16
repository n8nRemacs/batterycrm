package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.common.AdRequestConfiguration;
import com.yandex.mobile.ads.common.AdRequestError;
import com.yandex.mobile.ads.rewarded.RewardedAd;
import com.yandex.mobile.ads.rewarded.RewardedAdLoadListener;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes8.dex */
public final class sh implements j01 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    private final Context f389932a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    private final oa0 f389933b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    private final ma0 f389934c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    private final com.yandex.mobile.ads.common.a f389935d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    private final i01 f389936e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    private final su0<AdRequestConfiguration, RewardedAd> f389937f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    private final CopyOnWriteArrayList<h01> f389938g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    private RewardedAdLoadListener f389939h;

    public final class b implements RewardedAdLoadListener {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        private final AdRequestConfiguration f389942a;

        public b(AdRequestConfiguration adRequestConfiguration) {
            this.f389942a = adRequestConfiguration;
        }

        @Override // com.yandex.mobile.ads.rewarded.RewardedAdLoadListener
        public final void onAdFailedToLoad(@Y61.k AdRequestError adRequestError) {
            RewardedAdLoadListener rewardedAdLoadListener = sh.this.f389939h;
            if (rewardedAdLoadListener != null) {
                rewardedAdLoadListener.onAdFailedToLoad(adRequestError);
            }
        }

        @Override // com.yandex.mobile.ads.rewarded.RewardedAdLoadListener
        public final void onAdLoaded(@Y61.k RewardedAd rewardedAd) {
            RewardedAdLoadListener rewardedAdLoadListener = sh.this.f389939h;
            if (rewardedAdLoadListener != null) {
                rewardedAdLoadListener.onAdLoaded(rewardedAd);
            }
            sh shVar = sh.this;
            AdRequestConfiguration adRequestConfiguration = this.f389942a;
            sh.a(shVar, adRequestConfiguration, shVar.new a(adRequestConfiguration));
        }
    }

    @X41.j
    public sh(@Y61.k Context context, @Y61.k ko1 ko1Var, @Y61.k oa0 oa0Var, @Y61.k ma0 ma0Var, @Y61.k com.yandex.mobile.ads.common.a aVar, @Y61.k i01 i01Var, @Y61.k su0<AdRequestConfiguration, RewardedAd> su0Var) {
        this.f389932a = context;
        this.f389933b = oa0Var;
        this.f389934c = ma0Var;
        this.f389935d = aVar;
        this.f389936e = i01Var;
        this.f389937f = su0Var;
        this.f389938g = new CopyOnWriteArrayList<>();
    }

    @Override // com.yandex.mobile.ads.impl.v3
    public final void a(rx rxVar) {
        h01 h01Var = (h01) rxVar;
        if (this.f389939h == null) {
            h70.c("RewardedAdLoader. RewardedAdLoadListener is null on finished ad loading. Please, keep active listener until ad loading finished or use cancelLoading().", new Object[0]);
        }
        h01Var.a((RewardedAdLoadListener) null);
        this.f389938g.remove(h01Var);
    }

    @Override // com.yandex.mobile.ads.impl.j01
    @j.K
    public final void a(@Y61.l RewardedAdLoadListener rewardedAdLoadListener) {
        this.f389933b.a();
        this.f389939h = rewardedAdLoadListener;
    }

    @Override // com.yandex.mobile.ads.impl.j01
    @j.K
    public final void a(@Y61.k AdRequestConfiguration adRequestConfiguration) {
        this.f389933b.a();
        if (this.f389939h == null) {
            h70.c("RewardedAdLoader. RewardedAdLoadListener is on loading start. Please, use setAdLoadListener before loading Ad.", new Object[0]);
        }
        this.f389934c.a(new H(22, this, adRequestConfiguration));
    }

    public /* synthetic */ sh(Context context, ko1 ko1Var) {
        this(context, ko1Var, new oa0(context), new ma0(), new com.yandex.mobile.ads.common.a(), new i01(ko1Var), new su0());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(sh shVar, AdRequestConfiguration adRequestConfiguration) {
        RewardedAd rewardedAdA = shVar.f389937f.a(adRequestConfiguration);
        if (rewardedAdA != null) {
            RewardedAdLoadListener rewardedAdLoadListener = shVar.f389939h;
            if (rewardedAdLoadListener != null) {
                rewardedAdLoadListener.onAdLoaded(rewardedAdA);
            }
            a aVar = shVar.new a(adRequestConfiguration);
            h01 h01VarA = shVar.f389936e.a(shVar.f389932a, shVar);
            shVar.f389938g.add(h01VarA);
            shVar.f389935d.getClass();
            String strB = com.yandex.mobile.ads.common.a.b(adRequestConfiguration);
            shVar.f389935d.getClass();
            g5 g5VarA = com.yandex.mobile.ads.common.a.a(adRequestConfiguration);
            h01VarA.a(strB);
            h01VarA.a((RewardedAdLoadListener) aVar);
            h01VarA.b(g5VarA);
            return;
        }
        b bVar = shVar.new b(adRequestConfiguration);
        h01 h01VarA2 = shVar.f389936e.a(shVar.f389932a, shVar);
        shVar.f389938g.add(h01VarA2);
        shVar.f389935d.getClass();
        String strB2 = com.yandex.mobile.ads.common.a.b(adRequestConfiguration);
        shVar.f389935d.getClass();
        g5 g5VarA2 = com.yandex.mobile.ads.common.a.a(adRequestConfiguration);
        h01VarA2.a(strB2);
        h01VarA2.a((RewardedAdLoadListener) bVar);
        h01VarA2.b(g5VarA2);
    }

    public final class a implements RewardedAdLoadListener {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        private final AdRequestConfiguration f389940a;

        public a(AdRequestConfiguration adRequestConfiguration) {
            this.f389940a = adRequestConfiguration;
        }

        @Override // com.yandex.mobile.ads.rewarded.RewardedAdLoadListener
        public final void onAdLoaded(@Y61.k RewardedAd rewardedAd) {
            sh.this.f389937f.a(this.f389940a, rewardedAd);
        }

        @Override // com.yandex.mobile.ads.rewarded.RewardedAdLoadListener
        public final void onAdFailedToLoad(@Y61.k AdRequestError adRequestError) {
        }
    }

    public static final void a(sh shVar, AdRequestConfiguration adRequestConfiguration, a aVar) {
        h01 h01VarA = shVar.f389936e.a(shVar.f389932a, shVar);
        shVar.f389938g.add(h01VarA);
        shVar.f389935d.getClass();
        String strB = com.yandex.mobile.ads.common.a.b(adRequestConfiguration);
        shVar.f389935d.getClass();
        g5 g5VarA = com.yandex.mobile.ads.common.a.a(adRequestConfiguration);
        h01VarA.a(strB);
        h01VarA.a((RewardedAdLoadListener) aVar);
        h01VarA.b(g5VarA);
    }

    @Override // com.yandex.mobile.ads.impl.j01
    @j.K
    public final void a() {
        this.f389933b.a();
        this.f389934c.a();
        Iterator<h01> it = this.f389938g.iterator();
        while (it.hasNext()) {
            h01 next = it.next();
            next.a((RewardedAdLoadListener) null);
            next.t();
        }
        this.f389938g.clear();
    }
}
