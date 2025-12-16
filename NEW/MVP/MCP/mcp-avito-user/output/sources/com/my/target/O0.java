package com.my.target;

import android.annotation.TargetApi;
import android.content.Context;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.FrameLayout;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.my.target.C37782e;
import com.my.target.C37799m0;
import com.my.target.C37818w0;
import com.my.target.ads.e;
import com.my.target.p1;
import e11.C39856c;
import e11.C39866f0;
import e11.C39901r0;

/* loaded from: classes7.dex */
public class O0 implements h1, C37782e.a {

    /* renamed from: b, reason: collision with root package name */
    @j.N
    public final C37782e f364515b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    public final C39856c f364516c;

    /* renamed from: d, reason: collision with root package name */
    @j.P
    public C37799m0.b f364517d;

    /* renamed from: e, reason: collision with root package name */
    @j.P
    public C37799m0.c f364518e;

    /* renamed from: f, reason: collision with root package name */
    @j.P
    public e11.G0 f364519f;

    public O0(@j.N Context context) {
        C37782e c37782e = new C37782e(context);
        C39856c c39856c = new C39856c(context);
        this.f364515b = c37782e;
        this.f364516c = c39856c;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 1;
        c39856c.addView(c37782e, 0);
        c37782e.setLayoutParams(layoutParams);
        c37782e.setBannerWebViewListener(this);
    }

    @Override // com.my.target.a1
    public final void a() {
    }

    @Override // com.my.target.h1
    public final void b(@j.P C37799m0.c cVar) {
        this.f364518e = cVar;
    }

    @Override // com.my.target.a1
    public final void c(@j.N e11.G0 g02) {
        C37818w0.a aVar;
        C37818w0.a aVar2;
        this.f364519f = g02;
        String str = g02.f394356H;
        if (str == null) {
            C37799m0.c cVar = this.f364518e;
            if (cVar == null || (aVar2 = cVar.f364941a.f364936k) == null) {
                return;
            }
            aVar2.d("failed to load, null html");
            return;
        }
        C37782e c37782e = this.f364515b;
        if (c37782e.getMeasuredHeight() == 0 || c37782e.getMeasuredWidth() == 0) {
            c37782e.setOnLayoutListener(new com.avito.android.gig_shift_action.ui.a(27, this, str));
        } else {
            c37782e.setData(str);
        }
        C37799m0.c cVar2 = this.f364518e;
        if (cVar2 == null || (aVar = cVar2.f364941a.f364936k) == null) {
            return;
        }
        aVar.c();
    }

    @Override // com.my.target.a1
    public final void e() {
        this.f364517d = null;
    }

    @Override // com.my.target.a1
    public final void f() {
        e11.G0 g02;
        C37799m0.b bVar = this.f364517d;
        if (bVar == null || (g02 = this.f364519f) == null) {
            return;
        }
        bVar.b(g02);
    }

    @Override // com.my.target.a1
    @j.N
    public final C39856c getView() {
        return this.f364516c;
    }

    @Override // com.my.target.a1
    public final void a(int i12) {
        this.f364518e = null;
        this.f364517d = null;
        C37782e c37782e = this.f364515b;
        if (c37782e.getParent() != null) {
            ((ViewGroup) c37782e.getParent()).removeView(c37782e);
        }
        c37782e.a(i12);
    }

    @Override // com.my.target.a1
    public final void b() {
    }

    @Override // com.my.target.C37782e.a
    public final void b(@j.N String str) {
        C37799m0.b bVar;
        e11.G0 g02 = this.f364519f;
        if (g02 == null || (bVar = this.f364517d) == null) {
            return;
        }
        bVar.c(g02, str);
    }

    @Override // com.my.target.C37782e.a
    public final void a(@j.N WebView webView) {
        C37799m0.b bVar = this.f364517d;
        if (bVar != null) {
            bVar.a(webView);
        }
    }

    @Override // com.my.target.C37782e.a
    public final void a(@j.N String str) {
    }

    @Override // com.my.target.a1
    public final void a(boolean z12) {
    }

    @Override // com.my.target.C37782e.a
    @TargetApi(AvailableCode.ERROR_NO_ACTIVITY)
    public final void c() {
        C37799m0.b bVar = this.f364517d;
        if (bVar == null) {
            return;
        }
        C39866f0 c39866f0 = new C39866f0("WebView error");
        c39866f0.f394595b = "WebView renderer crashed";
        e11.G0 g02 = this.f364519f;
        c39866f0.f394599f = g02 == null ? null : g02.f394356H;
        c39866f0.f394598e = g02 == null ? null : g02.f394726y;
        C37818w0.a aVar = bVar.f364940a.f364936k;
        if (aVar == null) {
            return;
        }
        C37818w0 c37818w0 = aVar.f365217a;
        com.my.target.ads.e eVar = c37818w0.f365205a;
        C39901r0 c39901r0 = c37818w0.f365206b;
        c39866f0.f394596c = c39901r0.f394772i;
        c39866f0.a(eVar.getContext());
        int i12 = c37818w0.f365216l + 1;
        c37818w0.f365216l = i12;
        if (i12 > 2) {
            c37818w0.d();
            e.c renderCrashListener = eVar.getRenderCrashListener();
            if (renderCrashListener != null) {
                renderCrashListener.a();
                return;
            }
            return;
        }
        p1.a aVar2 = c37818w0.f365209e;
        p1 p1VarA = aVar2.a();
        C37810s0 c37810s0 = new C37810s0(c39901r0, aVar2, null);
        c37810s0.f364679d = new com.my.target.ads.a(c37818w0, 14);
        c37810s0.a(p1VarA, c37818w0.f365205a.getContext());
    }
}
