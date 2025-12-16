package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.yandex.mobile.ads.base.AdResponse;
import com.yandex.mobile.ads.base.AdResultReceiver;
import com.yandex.mobile.ads.impl.C39357q0;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes8.dex */
public final class qn1 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final Context f389256a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final n2 f389257b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private final AdResponse<String> f389258c;

    /* renamed from: d, reason: collision with root package name */
    @j.N
    private final String f389259d;

    /* renamed from: e, reason: collision with root package name */
    @j.N
    private final wx f389260e;

    /* renamed from: f, reason: collision with root package name */
    @j.N
    private final qx f389261f;

    /* renamed from: g, reason: collision with root package name */
    @j.N
    private final tx f389262g;

    /* renamed from: h, reason: collision with root package name */
    @j.N
    private final gx f389263h;

    /* renamed from: i, reason: collision with root package name */
    @j.N
    private final px f389264i;

    /* renamed from: j, reason: collision with root package name */
    @j.N
    private final vl f389265j;

    /* renamed from: k, reason: collision with root package name */
    @j.N
    private final jx f389266k;

    /* renamed from: l, reason: collision with root package name */
    @j.N
    private final View f389267l;

    /* renamed from: m, reason: collision with root package name */
    @j.N
    private final qn f389268m;

    /* renamed from: n, reason: collision with root package name */
    @j.N
    private final AdResultReceiver f389269n;

    /* renamed from: o, reason: collision with root package name */
    @j.N
    private final zx f389270o;

    public qn1(@j.N Context context, @j.N ko1 ko1Var, @j.N n2 n2Var, @j.N AdResponse<String> adResponse, @j.N String str) {
        Context applicationContext = context.getApplicationContext();
        this.f389256a = applicationContext;
        this.f389257b = n2Var;
        this.f389258c = adResponse;
        this.f389259d = str;
        this.f389268m = new rn(context, rz0.a(adResponse)).a();
        AdResultReceiver adResultReceiver = new AdResultReceiver(new Handler(Looper.getMainLooper()));
        this.f389269n = adResultReceiver;
        ko1Var.getClass();
        this.f389270o = new zx(ko1.a(), 0);
        wx wxVarB = b();
        this.f389260e = wxVarB;
        qx qxVar = new qx(applicationContext, ko1Var, n2Var, adResponse, adResultReceiver);
        this.f389261f = qxVar;
        this.f389262g = new tx(applicationContext, n2Var, adResponse, adResultReceiver);
        gx gxVar = new gx();
        this.f389263h = gxVar;
        this.f389264i = c();
        vl vlVarA = a();
        this.f389265j = vlVarA;
        jx jxVar = new jx(vlVarA);
        this.f389266k = jxVar;
        gxVar.a(jxVar);
        qxVar.a(jxVar);
        this.f389267l = vlVarA.a(wxVarB, adResponse);
    }

    @j.N
    private vl a() {
        boolean zA2 = uh0.a(this.f389259d);
        FrameLayout frameLayoutA = b6.a(this.f389256a);
        frameLayoutA.setOnClickListener(new nj(this.f389263h, this.f389264i, this.f389268m));
        return new wl().a(frameLayoutA, this.f389258c, this.f389268m, zA2, this.f389258c.K());
    }

    @j.N
    private wx b() {
        return new xx().a(this.f389256a, this.f389258c, this.f389257b);
    }

    @j.N
    private px c() {
        boolean zA2 = uh0.a(this.f389259d);
        m00.a().getClass();
        l00 l00VarA = m00.a(zA2);
        wx wxVar = this.f389260e;
        qx qxVar = this.f389261f;
        tx txVar = this.f389262g;
        return l00VarA.a(wxVar, qxVar, txVar, this.f389263h, txVar);
    }

    public final void d() {
        this.f389263h.a((pl) null);
        this.f389261f.a((ul) null);
        this.f389264i.invalidate();
        this.f389265j.d();
    }

    @j.N
    public final ix e() {
        return this.f389266k.a();
    }

    public final void f() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        this.f389265j.b();
        wx wxVar = this.f389260e;
        wxVar.getClass();
        int i12 = g7.f385602b;
        try {
            WebView.class.getDeclaredMethod("onPause", new Class[0]).invoke(wxVar, new Object[0]);
        } catch (Exception unused) {
        }
        wx.class.toString();
    }

    public final void g() {
        this.f389264i.a(this.f389259d);
    }

    public final void h() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        wx wxVar = this.f389260e;
        wxVar.getClass();
        int i12 = g7.f385602b;
        try {
            WebView.class.getDeclaredMethod("onResume", new Class[0]).invoke(wxVar, new Object[0]);
        } catch (Exception unused) {
        }
        wx.class.toString();
        this.f389265j.a();
    }

    public final void a(@j.P pl plVar) {
        this.f389263h.a(plVar);
    }

    public final void a(@j.P ul ulVar) {
        this.f389261f.a(ulVar);
    }

    public final void a(@j.N Context context, @j.P AdResultReceiver adResultReceiver) {
        C39357q0 c39357q0 = new C39357q0(new C39357q0.a(this.f389258c).a(this));
        this.f389269n.a(adResultReceiver);
        this.f389270o.a(context, c39357q0, this.f389269n);
    }

    public final void a(@j.N RelativeLayout relativeLayout) {
        this.f389265j.a(relativeLayout);
        relativeLayout.addView(this.f389267l);
        this.f389265j.c();
    }
}
