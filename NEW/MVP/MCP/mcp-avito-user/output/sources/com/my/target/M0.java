package com.my.target;

import android.R;
import android.annotation.TargetApi;
import android.content.Context;
import android.view.View;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.my.target.C37782e;
import com.my.target.S0;
import com.my.target.V;
import com.my.target.Y0;
import e11.C39911u1;
import e11.k2;
import java.lang.ref.WeakReference;

/* loaded from: classes7.dex */
public final class M0 implements V.a, C37782e.a {

    /* renamed from: b, reason: collision with root package name */
    @j.N
    public final C39911u1 f364463b;

    /* renamed from: c, reason: collision with root package name */
    @j.P
    public C37803o0 f364464c;

    /* renamed from: d, reason: collision with root package name */
    @j.P
    public WeakReference<V> f364465d;

    /* renamed from: e, reason: collision with root package name */
    @j.P
    public WeakReference<C37782e> f364466e;

    /* renamed from: f, reason: collision with root package name */
    @j.P
    public S0.a f364467f;

    /* renamed from: g, reason: collision with root package name */
    @j.P
    public Y0 f364468g;

    /* renamed from: h, reason: collision with root package name */
    @j.P
    public C37782e f364469h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f364470i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f364471j;

    public interface a {
    }

    public M0(@j.N C39911u1 c39911u1) {
        this.f364463b = c39911u1;
    }

    @Override // com.my.target.C37782e.a
    public final void a(@j.N WebView webView) {
        Y0 y02 = this.f364468g;
        if (y02 == null) {
            return;
        }
        y02.c(webView, new Y0.c[0]);
        this.f364468g.g();
    }

    @Override // com.my.target.C37782e.a
    public final void b(@j.N String str) {
        V v12;
        WeakReference<V> weakReference = this.f364465d;
        if (weakReference == null || (v12 = weakReference.get()) == null) {
            return;
        }
        S0.a aVar = this.f364467f;
        if (aVar != null) {
            Context context = v12.getContext();
            S0 s02 = aVar.f364596b;
            s02.c(this.f364463b, str, context);
            k2.a(context, s02.f364589d.f394702a.e("click"));
        }
        this.f364470i = true;
        if (v12.isShowing()) {
            v12.dismiss();
        }
    }

    @Override // com.my.target.V.a
    public final void d(@j.N V v12, @j.N FrameLayout frameLayout) {
        b1 b1Var = new b1(frameLayout.getContext());
        b1Var.setOnCloseListener(new com.avito.android.gig_shift_action.ui.a(26, this, v12));
        frameLayout.addView(b1Var, -1, -1);
        C37782e c37782e = new C37782e(frameLayout.getContext());
        this.f364469h = c37782e;
        c37782e.setVisibility(8);
        this.f364469h.setBannerWebViewListener(this);
        b1Var.addView(this.f364469h, new FrameLayout.LayoutParams(-1, -1));
        this.f364469h.setData(this.f364463b.f394852H);
        View progressBar = new ProgressBar(frameLayout.getContext(), null, R.attr.progressBarStyle);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        frameLayout.addView(progressBar, layoutParams);
        frameLayout.postDelayed(new com.vk.id.captcha.web.h(16, this, progressBar), 555L);
    }

    @Override // com.my.target.V.a
    public final void q() {
        WeakReference<V> weakReference = this.f364465d;
        if (weakReference != null) {
            V v12 = weakReference.get();
            if (!this.f364470i) {
                k2.a(v12.getContext(), this.f364463b.f394702a.e("closedByUser"));
            }
            this.f364465d.clear();
            this.f364465d = null;
        }
        C37803o0 c37803o0 = this.f364464c;
        if (c37803o0 != null) {
            c37803o0.f();
            this.f364464c = null;
        }
        WeakReference<C37782e> weakReference2 = this.f364466e;
        if (weakReference2 != null) {
            weakReference2.clear();
            this.f364466e = null;
        }
        Y0 y02 = this.f364468g;
        if (y02 != null) {
            y02.f();
        }
        C37782e c37782e = this.f364469h;
        if (c37782e != null) {
            c37782e.a(this.f364468g != null ? 7000 : 0);
        }
    }

    @Override // com.my.target.C37782e.a
    public final void a(@j.N String str) {
    }

    @Override // com.my.target.V.a
    public final void b(boolean z12) {
        C37782e c37782e;
        if (z12 == this.f364471j) {
            return;
        }
        this.f364471j = z12;
        C37803o0 c37803o0 = this.f364464c;
        if (c37803o0 == null) {
            return;
        }
        if (!z12) {
            c37803o0.f();
            return;
        }
        WeakReference<C37782e> weakReference = this.f364466e;
        if (weakReference == null || (c37782e = weakReference.get()) == null) {
            return;
        }
        this.f364464c.c(c37782e);
    }

    @Override // com.my.target.C37782e.a
    @TargetApi(AvailableCode.ERROR_NO_ACTIVITY)
    public final void c() {
    }
}
