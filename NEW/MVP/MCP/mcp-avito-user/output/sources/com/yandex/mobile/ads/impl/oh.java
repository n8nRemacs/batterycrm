package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.appopenad.AppOpenAd;
import com.yandex.mobile.ads.appopenad.AppOpenAdLoadListener;
import com.yandex.mobile.ads.common.AdRequestConfiguration;
import com.yandex.mobile.ads.common.AdRequestError;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

@j.K
/* loaded from: classes8.dex */
public final class oh implements va {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    private final Context f388522a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    private final oa0 f388523b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    private final ma0 f388524c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    private final com.yandex.mobile.ads.common.a f388525d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    private final xa f388526e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    private final su0<AdRequestConfiguration, AppOpenAd> f388527f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    private final CopyOnWriteArrayList<ua> f388528g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    private AppOpenAdLoadListener f388529h;

    public final class b implements AppOpenAdLoadListener {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        private final AdRequestConfiguration f388532a;

        public b(AdRequestConfiguration adRequestConfiguration) {
            this.f388532a = adRequestConfiguration;
        }

        @Override // com.yandex.mobile.ads.appopenad.AppOpenAdLoadListener
        public final void onAdFailedToLoad(@Y61.k AdRequestError adRequestError) {
            AppOpenAdLoadListener appOpenAdLoadListener = oh.this.f388529h;
            if (appOpenAdLoadListener != null) {
                appOpenAdLoadListener.onAdFailedToLoad(adRequestError);
            }
        }

        @Override // com.yandex.mobile.ads.appopenad.AppOpenAdLoadListener
        public final void onAdLoaded(@Y61.k AppOpenAd appOpenAd) {
            AppOpenAdLoadListener appOpenAdLoadListener = oh.this.f388529h;
            if (appOpenAdLoadListener != null) {
                appOpenAdLoadListener.onAdLoaded(appOpenAd);
            }
            oh ohVar = oh.this;
            AdRequestConfiguration adRequestConfiguration = this.f388532a;
            oh.a(ohVar, adRequestConfiguration, ohVar.new a(adRequestConfiguration));
        }
    }

    @X41.j
    public oh(@Y61.k Context context, @Y61.k ko1 ko1Var, @Y61.k oa0 oa0Var, @Y61.k ma0 ma0Var, @Y61.k com.yandex.mobile.ads.common.a aVar, @Y61.k xa xaVar, @Y61.k su0<AdRequestConfiguration, AppOpenAd> su0Var) {
        this.f388522a = context;
        this.f388523b = oa0Var;
        this.f388524c = ma0Var;
        this.f388525d = aVar;
        this.f388526e = xaVar;
        this.f388527f = su0Var;
        this.f388528g = new CopyOnWriteArrayList<>();
    }

    @Override // com.yandex.mobile.ads.impl.v3
    public final void a(rx rxVar) {
        ua uaVar = (ua) rxVar;
        if (this.f388529h == null) {
            h70.c("AppOpenAdLoader. AppOpenAdLoadListener is null on finished ad loading. Please, keep active listener until ad loading finished or use cancelLoading().", new Object[0]);
        }
        uaVar.a((AppOpenAdLoadListener) null);
        this.f388528g.remove(uaVar);
    }

    @Override // com.yandex.mobile.ads.impl.va
    @j.K
    public final void a(@Y61.l AppOpenAdLoadListener appOpenAdLoadListener) {
        this.f388523b.a();
        this.f388529h = appOpenAdLoadListener;
    }

    @Override // com.yandex.mobile.ads.impl.va
    @j.K
    public final void a(@Y61.k AdRequestConfiguration adRequestConfiguration) {
        this.f388523b.a();
        if (this.f388529h == null) {
            h70.c("AppOpenAdLoader. AppOpenAdLoadListener is null on loading start. Please, use setAdLoadListener before loading Ad.", new Object[0]);
        }
        this.f388524c.a(new H(18, this, adRequestConfiguration));
    }

    public /* synthetic */ oh(Context context, ko1 ko1Var) {
        this(context, ko1Var, new oa0(context), new ma0(), new com.yandex.mobile.ads.common.a(), new xa(ko1Var), new su0());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(oh ohVar, AdRequestConfiguration adRequestConfiguration) {
        AppOpenAd appOpenAdA = ohVar.f388527f.a(adRequestConfiguration);
        if (appOpenAdA != null) {
            AppOpenAdLoadListener appOpenAdLoadListener = ohVar.f388529h;
            if (appOpenAdLoadListener != null) {
                appOpenAdLoadListener.onAdLoaded(appOpenAdA);
            }
            a aVar = ohVar.new a(adRequestConfiguration);
            ua uaVarA = ohVar.f388526e.a(ohVar.f388522a, ohVar);
            ohVar.f388528g.add(uaVarA);
            ohVar.f388525d.getClass();
            String strB = com.yandex.mobile.ads.common.a.b(adRequestConfiguration);
            ohVar.f388525d.getClass();
            g5 g5VarA = com.yandex.mobile.ads.common.a.a(adRequestConfiguration);
            uaVarA.a(strB);
            uaVarA.a((AppOpenAdLoadListener) aVar);
            uaVarA.b(g5VarA);
            return;
        }
        b bVar = ohVar.new b(adRequestConfiguration);
        ua uaVarA2 = ohVar.f388526e.a(ohVar.f388522a, ohVar);
        ohVar.f388528g.add(uaVarA2);
        ohVar.f388525d.getClass();
        String strB2 = com.yandex.mobile.ads.common.a.b(adRequestConfiguration);
        ohVar.f388525d.getClass();
        g5 g5VarA2 = com.yandex.mobile.ads.common.a.a(adRequestConfiguration);
        uaVarA2.a(strB2);
        uaVarA2.a((AppOpenAdLoadListener) bVar);
        uaVarA2.b(g5VarA2);
    }

    public final class a implements AppOpenAdLoadListener {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        private final AdRequestConfiguration f388530a;

        public a(AdRequestConfiguration adRequestConfiguration) {
            this.f388530a = adRequestConfiguration;
        }

        @Override // com.yandex.mobile.ads.appopenad.AppOpenAdLoadListener
        public final void onAdLoaded(@Y61.k AppOpenAd appOpenAd) {
            oh.this.f388527f.a(this.f388530a, appOpenAd);
        }

        @Override // com.yandex.mobile.ads.appopenad.AppOpenAdLoadListener
        public final void onAdFailedToLoad(@Y61.k AdRequestError adRequestError) {
        }
    }

    public static final void a(oh ohVar, AdRequestConfiguration adRequestConfiguration, a aVar) {
        ua uaVarA = ohVar.f388526e.a(ohVar.f388522a, ohVar);
        ohVar.f388528g.add(uaVarA);
        ohVar.f388525d.getClass();
        String strB = com.yandex.mobile.ads.common.a.b(adRequestConfiguration);
        ohVar.f388525d.getClass();
        g5 g5VarA = com.yandex.mobile.ads.common.a.a(adRequestConfiguration);
        uaVarA.a(strB);
        uaVarA.a((AppOpenAdLoadListener) aVar);
        uaVarA.b(g5VarA);
    }

    @Override // com.yandex.mobile.ads.impl.va
    @j.K
    public final void a() {
        this.f388523b.a();
        this.f388524c.a();
        Iterator<ua> it = this.f388528g.iterator();
        while (it.hasNext()) {
            ua next = it.next();
            next.a((AppOpenAdLoadListener) null);
            next.t();
        }
        this.f388528g.clear();
    }
}
