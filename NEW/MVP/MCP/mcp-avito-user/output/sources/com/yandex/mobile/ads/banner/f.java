package com.yandex.mobile.ads.banner;

import android.content.Context;
import android.view.ViewGroup;
import com.yandex.mobile.ads.base.AdResponse;
import com.yandex.mobile.ads.base.SizeInfo;
import com.yandex.mobile.ads.common.AdImpressionData;
import com.yandex.mobile.ads.impl.a4;
import com.yandex.mobile.ads.impl.e00;
import com.yandex.mobile.ads.impl.fe;
import com.yandex.mobile.ads.impl.fj1;
import com.yandex.mobile.ads.impl.ih1;
import com.yandex.mobile.ads.impl.ko1;
import com.yandex.mobile.ads.impl.o41;
import com.yandex.mobile.ads.impl.rd;
import com.yandex.mobile.ads.impl.rj1;
import com.yandex.mobile.ads.impl.sd;
import com.yandex.mobile.ads.impl.ud;
import j.N;
import j.P;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes8.dex */
public final class f extends k implements fe {

    /* renamed from: A, reason: collision with root package name */
    @N
    private final e f382518A;

    /* renamed from: B, reason: collision with root package name */
    @N
    private final ih1 f382519B;

    /* renamed from: C, reason: collision with root package name */
    @N
    private final rd f382520C;

    /* renamed from: D, reason: collision with root package name */
    @N
    private final e00 f382521D;

    /* renamed from: E, reason: collision with root package name */
    @N
    private final h f382522E;

    /* renamed from: F, reason: collision with root package name */
    @N
    private final sd f382523F;

    /* renamed from: G, reason: collision with root package name */
    @P
    private ud f382524G;

    /* renamed from: H, reason: collision with root package name */
    @P
    private ud f382525H;

    public f(@N Context context, @N ko1 ko1Var, @N h hVar, @N e eVar, @N a4 a4Var) {
        super(context, hVar, a4Var);
        this.f382518A = eVar;
        this.f382522E = hVar;
        a(hVar);
        this.f382523F = new sd();
        this.f382519B = new ih1();
        this.f382520C = new rd(ko1Var);
        e00 e00Var = new e00();
        this.f382521D = e00Var;
        eVar.a(e00Var);
    }

    @Override // com.yandex.mobile.ads.impl.fe
    public final void a(@P AdImpressionData adImpressionData) {
        this.f382518A.b(adImpressionData);
    }

    @Override // com.yandex.mobile.ads.banner.k, com.yandex.mobile.ads.impl.re
    public final void c() {
        super.c();
        this.f382518A.a((BannerAdEventListener) null);
        fj1.a(this.f382522E, true);
        this.f382522E.setVisibility(8);
        h hVar = this.f382522E;
        int i12 = rj1.f389556b;
        if (hVar != null) {
            try {
                if (hVar.getParent() instanceof ViewGroup) {
                    ((ViewGroup) hVar.getParent()).removeView(hVar);
                }
            } catch (Exception unused) {
            }
            try {
                hVar.removeAllViews();
            } catch (Exception unused2) {
            }
        }
    }

    @Override // com.yandex.mobile.ads.impl.fe
    public final void onLeftApplication() {
        this.f382518A.e();
    }

    @Override // com.yandex.mobile.ads.impl.fe
    public final void onReturnedToApplication() {
        this.f382518A.f();
    }

    @Override // com.yandex.mobile.ads.impl.re
    public final void p() {
        super.p();
        ud udVar = this.f382524G;
        if (udVar != this.f382525H) {
            Iterator it = new HashSet(Arrays.asList(udVar)).iterator();
            while (it.hasNext()) {
                ud udVar2 = (ud) it.next();
                if (udVar2 != null) {
                    udVar2.a(this.f389494b);
                }
            }
            this.f382524G = this.f382525H;
        }
        SizeInfo sizeInfoN = d().n();
        if (!(2 == (sizeInfoN != null ? sizeInfoN.d() : 0)) || this.f382522E.getLayoutParams() == null) {
            return;
        }
        this.f382522E.getLayoutParams().height = -2;
    }

    public final boolean v() {
        AdResponse<String> adResponseG = g();
        SizeInfo sizeInfoF = adResponseG != null ? adResponseG.F() : null;
        if (sizeInfoF == null) {
            return false;
        }
        SizeInfo sizeInfoN = this.f389498f.n();
        AdResponse<T> adResponse = this.f389512t;
        return (adResponse == 0 || sizeInfoN == null) ? false : o41.a(this.f389494b, adResponse, sizeInfoF, this.f382523F, sizeInfoN);
    }

    public final void w() {
        Iterator it = new HashSet(Arrays.asList(this.f382524G, this.f382525H)).iterator();
        while (it.hasNext()) {
            ud udVar = (ud) it.next();
            if (udVar != null) {
                udVar.a(this.f389494b);
            }
        }
        c();
        f.class.toString();
    }

    @N
    public final h x() {
        return this.f382522E;
    }

    @N
    public final ih1 y() {
        return this.f382519B;
    }

    public final void a(@P BannerAdEventListener bannerAdEventListener) {
        a(this.f382518A);
        this.f382518A.a(bannerAdEventListener);
    }

    @Override // com.yandex.mobile.ads.impl.re
    public final void a(@N AdResponse<String> adResponse) {
        super.a((AdResponse) adResponse);
        this.f382521D.a(adResponse);
        ud udVarA = this.f382520C.a(adResponse).a(this);
        this.f382525H = udVarA;
        udVarA.a(this.f389494b, adResponse);
    }

    private static void a(@N h hVar) {
        hVar.setHorizontalScrollBarEnabled(false);
        hVar.setVerticalScrollBarEnabled(false);
        hVar.setVisibility(8);
        hVar.setBackgroundColor(0);
    }
}
