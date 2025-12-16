package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.common.AdRequestConfiguration;
import com.yandex.mobile.ads.common.AdRequestError;
import com.yandex.mobile.ads.interstitial.InterstitialAd;
import com.yandex.mobile.ads.interstitial.InterstitialAdLoadListener;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes8.dex */
public final class rh implements u70 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    private final Context f389531a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    private final oa0 f389532b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    private final ma0 f389533c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    private final com.yandex.mobile.ads.common.a f389534d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    private final t70 f389535e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    private final su0<AdRequestConfiguration, InterstitialAd> f389536f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    private final CopyOnWriteArrayList<s70> f389537g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    private InterstitialAdLoadListener f389538h;

    public final class b implements InterstitialAdLoadListener {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        private final AdRequestConfiguration f389541a;

        public b(AdRequestConfiguration adRequestConfiguration) {
            this.f389541a = adRequestConfiguration;
        }

        @Override // com.yandex.mobile.ads.interstitial.InterstitialAdLoadListener
        public final void onAdFailedToLoad(@Y61.k AdRequestError adRequestError) {
            InterstitialAdLoadListener interstitialAdLoadListener = rh.this.f389538h;
            if (interstitialAdLoadListener != null) {
                interstitialAdLoadListener.onAdFailedToLoad(adRequestError);
            }
        }

        @Override // com.yandex.mobile.ads.interstitial.InterstitialAdLoadListener
        public final void onAdLoaded(@Y61.k InterstitialAd interstitialAd) {
            InterstitialAdLoadListener interstitialAdLoadListener = rh.this.f389538h;
            if (interstitialAdLoadListener != null) {
                interstitialAdLoadListener.onAdLoaded(interstitialAd);
            }
            rh rhVar = rh.this;
            AdRequestConfiguration adRequestConfiguration = this.f389541a;
            rh.a(rhVar, adRequestConfiguration, rhVar.new a(adRequestConfiguration));
        }
    }

    @X41.j
    public rh(@Y61.k Context context, @Y61.k ko1 ko1Var, @Y61.k oa0 oa0Var, @Y61.k ma0 ma0Var, @Y61.k com.yandex.mobile.ads.common.a aVar, @Y61.k t70 t70Var, @Y61.k su0<AdRequestConfiguration, InterstitialAd> su0Var) {
        this.f389531a = context;
        this.f389532b = oa0Var;
        this.f389533c = ma0Var;
        this.f389534d = aVar;
        this.f389535e = t70Var;
        this.f389536f = su0Var;
        this.f389537g = new CopyOnWriteArrayList<>();
    }

    @Override // com.yandex.mobile.ads.impl.v3
    public final void a(rx rxVar) {
        s70 s70Var = (s70) rxVar;
        if (this.f389538h == null) {
            h70.c("InterstitialAdLoader. InterstitialAdLoadListener is null on finished ad loading. Please, keep active listener until ad loading finished or use cancelLoading().", new Object[0]);
        }
        s70Var.a((InterstitialAdLoadListener) null);
        this.f389537g.remove(s70Var);
    }

    @Override // com.yandex.mobile.ads.impl.u70
    @j.K
    public final void a(@Y61.l InterstitialAdLoadListener interstitialAdLoadListener) {
        this.f389532b.a();
        this.f389538h = interstitialAdLoadListener;
    }

    @Override // com.yandex.mobile.ads.impl.u70
    @j.K
    public final void a(@Y61.k AdRequestConfiguration adRequestConfiguration) {
        this.f389532b.a();
        if (this.f389538h == null) {
            h70.c("InterstitialAdLoader. InterstitialAdLoadListener is null on loading start. Please, use setAdLoadListener before loading Ad.", new Object[0]);
        }
        this.f389533c.a(new H(21, this, adRequestConfiguration));
    }

    public /* synthetic */ rh(Context context, ko1 ko1Var) {
        this(context, ko1Var, new oa0(context), new ma0(), new com.yandex.mobile.ads.common.a(), new t70(ko1Var), new su0());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(rh rhVar, AdRequestConfiguration adRequestConfiguration) {
        InterstitialAd interstitialAdA = rhVar.f389536f.a(adRequestConfiguration);
        if (interstitialAdA != null) {
            InterstitialAdLoadListener interstitialAdLoadListener = rhVar.f389538h;
            if (interstitialAdLoadListener != null) {
                interstitialAdLoadListener.onAdLoaded(interstitialAdA);
            }
            a aVar = rhVar.new a(adRequestConfiguration);
            s70 s70VarA = rhVar.f389535e.a(rhVar.f389531a, rhVar);
            rhVar.f389537g.add(s70VarA);
            rhVar.f389534d.getClass();
            String strB = com.yandex.mobile.ads.common.a.b(adRequestConfiguration);
            rhVar.f389534d.getClass();
            g5 g5VarA = com.yandex.mobile.ads.common.a.a(adRequestConfiguration);
            s70VarA.a(strB);
            s70VarA.a((InterstitialAdLoadListener) aVar);
            s70VarA.b(g5VarA);
            return;
        }
        b bVar = rhVar.new b(adRequestConfiguration);
        s70 s70VarA2 = rhVar.f389535e.a(rhVar.f389531a, rhVar);
        rhVar.f389537g.add(s70VarA2);
        rhVar.f389534d.getClass();
        String strB2 = com.yandex.mobile.ads.common.a.b(adRequestConfiguration);
        rhVar.f389534d.getClass();
        g5 g5VarA2 = com.yandex.mobile.ads.common.a.a(adRequestConfiguration);
        s70VarA2.a(strB2);
        s70VarA2.a((InterstitialAdLoadListener) bVar);
        s70VarA2.b(g5VarA2);
    }

    public final class a implements InterstitialAdLoadListener {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        private final AdRequestConfiguration f389539a;

        public a(AdRequestConfiguration adRequestConfiguration) {
            this.f389539a = adRequestConfiguration;
        }

        @Override // com.yandex.mobile.ads.interstitial.InterstitialAdLoadListener
        public final void onAdLoaded(@Y61.k InterstitialAd interstitialAd) {
            rh.this.f389536f.a(this.f389539a, interstitialAd);
        }

        @Override // com.yandex.mobile.ads.interstitial.InterstitialAdLoadListener
        public final void onAdFailedToLoad(@Y61.k AdRequestError adRequestError) {
        }
    }

    public static final void a(rh rhVar, AdRequestConfiguration adRequestConfiguration, a aVar) {
        s70 s70VarA = rhVar.f389535e.a(rhVar.f389531a, rhVar);
        rhVar.f389537g.add(s70VarA);
        rhVar.f389534d.getClass();
        String strB = com.yandex.mobile.ads.common.a.b(adRequestConfiguration);
        rhVar.f389534d.getClass();
        g5 g5VarA = com.yandex.mobile.ads.common.a.a(adRequestConfiguration);
        s70VarA.a(strB);
        s70VarA.a((InterstitialAdLoadListener) aVar);
        s70VarA.b(g5VarA);
    }

    @Override // com.yandex.mobile.ads.impl.u70
    @j.K
    public final void a() {
        this.f389532b.a();
        this.f389533c.a();
        Iterator<s70> it = this.f389537g.iterator();
        while (it.hasNext()) {
            s70 next = it.next();
            next.a((InterstitialAdLoadListener) null);
            next.t();
        }
        this.f389537g.clear();
    }
}
