package com.my.target;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.webkit.WebView;
import android.widget.FrameLayout;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.my.target.C37782e;
import com.my.target.G;
import e11.C39848C;
import e11.C39875i0;
import e11.C39877j;
import e11.C39898q;
import e11.C39924z;
import e11.ViewOnClickListenerC39891n1;
import java.util.ArrayList;

/* loaded from: classes7.dex */
public class A0 implements C37782e.a, G {

    /* renamed from: b, reason: collision with root package name */
    @j.N
    public final C37782e f364314b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    public final e11.r f364315c;

    /* renamed from: d, reason: collision with root package name */
    @j.N
    public final FrameLayout f364316d;

    /* renamed from: e, reason: collision with root package name */
    @j.N
    public final Handler f364317e = new Handler(Looper.getMainLooper());

    /* renamed from: f, reason: collision with root package name */
    @j.N
    public final C39875i0 f364318f;

    /* renamed from: g, reason: collision with root package name */
    @j.P
    public c f364319g;

    /* renamed from: h, reason: collision with root package name */
    @j.P
    public b f364320h;

    /* renamed from: i, reason: collision with root package name */
    @j.P
    public G.a f364321i;

    /* renamed from: j, reason: collision with root package name */
    @j.P
    public C39848C f364322j;

    /* renamed from: k, reason: collision with root package name */
    @j.P
    public D f364323k;

    public static class a implements View.OnClickListener {

        /* renamed from: b, reason: collision with root package name */
        @j.N
        public final A0 f364324b;

        public a(@j.N A0 a02) {
            this.f364324b = a02;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            G.a aVar = this.f364324b.f364321i;
            if (aVar != null) {
                aVar.a();
            }
        }
    }

    public static class b implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        @j.N
        public final A0 f364325b;

        public b(@j.N A0 a02) {
            this.f364325b = a02;
        }

        @Override // java.lang.Runnable
        public final void run() {
            A0 a02 = this.f364325b;
            G.a aVar = a02.f364321i;
            if (aVar != null) {
                aVar.b(a02.f364316d.getContext());
            }
        }
    }

    public static class c implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        @j.N
        public final e11.r f364326b;

        public c(@j.N e11.r rVar) {
            this.f364326b = rVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f364326b.setVisibility(0);
        }
    }

    public A0(@j.N Context context) {
        C37782e c37782e = new C37782e(context);
        this.f364314b = c37782e;
        e11.r rVar = new e11.r(context);
        this.f364315c = rVar;
        FrameLayout frameLayout = new FrameLayout(context);
        this.f364316d = frameLayout;
        rVar.setContentDescription("Close");
        C39924z.m(rVar, "close_button");
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 8388613;
        rVar.setVisibility(8);
        rVar.setLayoutParams(layoutParams);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
        layoutParams2.gravity = 1;
        c37782e.setLayoutParams(layoutParams2);
        frameLayout.addView(c37782e);
        if (rVar.getParent() == null) {
            frameLayout.addView(rVar);
        }
        Bitmap bitmapA = C39898q.a(new C39924z(context).a(28));
        if (bitmapA != null) {
            rVar.a(bitmapA, false);
        }
        C39875i0 c39875i0 = new C39875i0(context);
        this.f364318f = c39875i0;
        int iC2 = C39924z.c(10, context);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams3.setMargins(iC2, iC2, iC2, iC2);
        frameLayout.addView(c39875i0, layoutParams3);
    }

    @Override // com.my.target.C37782e.a
    public final void a(@j.N WebView webView) {
        G.a aVar = this.f364321i;
        if (aVar != null) {
            aVar.a(webView);
        }
    }

    @Override // com.my.target.C37782e.a
    public final void b(@j.N String str) {
        G.a aVar = this.f364321i;
        if (aVar != null) {
            aVar.f(this.f364322j, str, this.f364316d.getContext());
        }
    }

    @Override // com.my.target.i1
    public final void destroy() {
        C37782e c37782e = this.f364314b;
        WebView webView = c37782e.getWebView();
        if (webView != null) {
            webView.evaluateJavascript("window.playerDestroy && window.playerDestroy();", null);
        }
        this.f364316d.removeView(c37782e);
        c37782e.a(0);
    }

    @Override // com.my.target.G
    public final void f(@j.N C39848C c39848c) {
        this.f364322j = c39848c;
        C37782e c37782e = this.f364314b;
        c37782e.setBannerWebViewListener(this);
        String str = c39848c.f394290L;
        if (str == null) {
            G.a aVar = this.f364321i;
            if (aVar != null) {
                aVar.c();
                return;
            }
            return;
        }
        c37782e.setData(str);
        c37782e.setForceMediaPlayback(c39848c.f394292N);
        com.my.target.common.models.b bVar = c39848c.f394741H;
        e11.r rVar = this.f364315c;
        if (bVar != null) {
            rVar.a(bVar.a(), false);
        }
        rVar.setOnClickListener(new a(this));
        float f12 = c39848c.f394742I;
        Handler handler = this.f364317e;
        if (f12 > 0.0f) {
            c cVar = new c(rVar);
            this.f364319g = cVar;
            handler.removeCallbacks(cVar);
            System.currentTimeMillis();
            handler.postDelayed(this.f364319g, (long) (f12 * 1000.0f));
        } else {
            rVar.setVisibility(0);
        }
        float f13 = c39848c.f394291M;
        if (f13 > 0.0f) {
            b bVar2 = new b(this);
            this.f364320h = bVar2;
            handler.removeCallbacks(bVar2);
            System.currentTimeMillis();
            handler.postDelayed(this.f364320h, ((long) f13) * 1000);
        }
        C37788h c37788h = c39848c.f394698D;
        C39875i0 c39875i0 = this.f364318f;
        if (c37788h == null) {
            c39875i0.setVisibility(8);
        } else {
            c39875i0.setImageBitmap(c37788h.f364851a.a());
            c39875i0.setOnClickListener(new ViewOnClickListenerC39891n1(this));
            ArrayList arrayList = c37788h.f364853c;
            if (arrayList != null) {
                D d12 = new D(arrayList, new C39877j());
                this.f364323k = d12;
                d12.f364362e = new C37824z0(this, c39848c);
            }
        }
        G.a aVar2 = this.f364321i;
        if (aVar2 != null) {
            aVar2.b(c39848c, this.f364316d);
        }
    }

    @Override // com.my.target.i1
    @j.P
    public final View getCloseButton() {
        return this.f364315c;
    }

    @Override // com.my.target.G
    public final void h(@j.P G.a aVar) {
        this.f364321i = aVar;
    }

    @Override // com.my.target.i1
    @j.N
    public final View j() {
        return this.f364316d;
    }

    @Override // com.my.target.C37782e.a
    public final void a(@j.N String str) {
        G.a aVar = this.f364321i;
        if (aVar != null) {
            aVar.c();
        }
    }

    @Override // com.my.target.C37782e.a
    @TargetApi(AvailableCode.ERROR_NO_ACTIVITY)
    public final void c() {
    }
}
