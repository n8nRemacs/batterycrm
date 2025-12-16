package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.base.AdResponse;
import com.yandex.mobile.ads.impl.ky0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes8.dex */
final class ol0 implements com.monetization.ads.mediation.nativeads.g {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final Context f388569a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final AdResponse<bl0> f388570b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private final ee0<com.monetization.ads.mediation.nativeads.f, com.monetization.ads.mediation.nativeads.g> f388571c;

    /* renamed from: d, reason: collision with root package name */
    @j.N
    private final WeakReference<com.yandex.mobile.ads.nativeads.o> f388572d;

    /* renamed from: e, reason: collision with root package name */
    @j.N
    private final he0 f388573e;

    /* renamed from: f, reason: collision with root package name */
    @j.N
    private final q20 f388574f;

    /* renamed from: g, reason: collision with root package name */
    @j.N
    private final me0 f388575g;

    /* renamed from: h, reason: collision with root package name */
    @j.N
    private final HashMap f388576h;

    /* renamed from: i, reason: collision with root package name */
    @j.N
    private final HashMap f388577i;

    /* renamed from: j, reason: collision with root package name */
    @j.N
    private final df0 f388578j;

    /* renamed from: k, reason: collision with root package name */
    @j.N
    private final cf0 f388579k;

    /* renamed from: l, reason: collision with root package name */
    @j.N
    private final m30 f388580l;

    /* renamed from: m, reason: collision with root package name */
    @j.N
    private final of0 f388581m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f388582n;

    public ol0(@j.N AdResponse<bl0> adResponse, @j.N com.yandex.mobile.ads.nativeads.o oVar, @j.N ee0<com.monetization.ads.mediation.nativeads.f, com.monetization.ads.mediation.nativeads.g> ee0Var) {
        HashMap map = new HashMap();
        this.f388576h = map;
        this.f388577i = new HashMap();
        Context contextH = oVar.h();
        Context applicationContext = contextH.getApplicationContext();
        this.f388569a = applicationContext;
        this.f388570b = adResponse;
        this.f388571c = ee0Var;
        this.f388572d = new WeakReference<>(oVar);
        this.f388573e = new he0();
        q20 q20Var = new q20(contextH);
        this.f388574f = q20Var;
        this.f388578j = new df0();
        cf0 cf0Var = new cf0(contextH);
        this.f388579k = cf0Var;
        this.f388575g = new me0(contextH, q20Var, cf0Var);
        this.f388580l = new m30(ee0Var);
        this.f388581m = new of0(applicationContext, ee0Var, map);
    }

    public final void onAdClicked() {
        this.f388571c.a(this.f388569a, this.f388576h);
        Context context = this.f388569a;
        ky0.b bVar = ky0.b.f387280A;
        ly0 ly0Var = new ly0(this.f388576h);
        ly0Var.b(bVar.a(), "event_type");
        ly0Var.b(this.f388577i, "ad_info");
        ly0Var.a(this.f388570b.c());
        Map<String, Object> mapR = this.f388570b.r();
        if (mapR != null) {
            ly0Var.a(mapR);
        }
        this.f388571c.a(context, ly0Var.a());
        this.f388573e.a();
    }

    public final void onAdClosed() {
        this.f388573e.b();
    }

    public final void onAdFailedToLoad(@j.N com.monetization.ads.mediation.base.a aVar) {
        com.yandex.mobile.ads.nativeads.o oVar = this.f388572d.get();
        if (oVar != null) {
            Context contextH = oVar.h();
            aVar.getClass();
            this.f388571c.b(contextH, new w2(0, null, null), this);
        }
    }

    public final void onAdImpression() {
        if (this.f388582n) {
            return;
        }
        this.f388582n = true;
        this.f388571c.b(this.f388569a, this.f388576h);
        Context context = this.f388569a;
        ky0.b bVar = ky0.b.f387322w;
        ly0 ly0Var = new ly0(this.f388576h);
        ly0Var.b(bVar.a(), "event_type");
        ly0Var.b(this.f388577i, "ad_info");
        ly0Var.a(this.f388570b.c());
        Map<String, Object> mapR = this.f388570b.r();
        if (mapR != null) {
            ly0Var.a(mapR);
        }
        this.f388571c.a(context, ly0Var.a());
        this.f388573e.a(this.f388580l.a());
    }

    public final void onAdLeftApplication() {
        this.f388573e.c();
    }

    public final void onAdOpened() {
        this.f388573e.d();
    }

    public final void onAppInstallAdLoaded(@j.N com.monetization.ads.mediation.nativeads.a aVar) {
        a(aVar, 2);
    }

    public final void onContentAdLoaded(@j.N com.monetization.ads.mediation.nativeads.a aVar) {
        a(aVar, 1);
    }

    private void a(@j.N com.monetization.ads.mediation.nativeads.a aVar, @j.N int i12) {
        com.yandex.mobile.ads.nativeads.o oVar = this.f388572d.get();
        if (oVar != null) {
            Context contextH = oVar.h();
            this.f388576h.put("native_ad_type", tz0.a(i12));
            this.f388571c.c(contextH, this.f388576h);
            HashMap map = new HashMap();
            aVar.b().getClass();
            map.put("title", null);
            this.f388577i.putAll(map);
            this.f388578j.getClass();
            com.monetization.ads.mediation.nativeads.b bVarB = aVar.b();
            ArrayList arrayList = new ArrayList();
            bVarB.getClass();
            arrayList.add(null);
            arrayList.add(null);
            arrayList.add(null);
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                com.monetization.ads.mediation.nativeads.c cVar = (com.monetization.ads.mediation.nativeads.c) it.next();
                if (cVar != null) {
                    arrayList2.add(cVar);
                }
            }
            this.f388574f.a(this.f388579k.b(arrayList2));
            this.f388575g.a(aVar, i12, arrayList2, new Y(this, aVar, oVar, 2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.monetization.ads.mediation.nativeads.a aVar, com.yandex.mobile.ads.nativeads.o oVar, AdResponse adResponse) {
        vf0 vf0Var = new vf0(aVar, this.f388581m);
        oVar.a((AdResponse<bl0>) adResponse, new ok0(new ie0(this.f388570b, this.f388571c.a()), new ge0(new nl0(this)), vf0Var, new if0(), new uf0()), new o7(this.f388571c).a());
    }
}
