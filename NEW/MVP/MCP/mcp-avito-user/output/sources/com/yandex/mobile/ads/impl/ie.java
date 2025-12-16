package com.yandex.mobile.ads.impl;

import android.annotation.SuppressLint;
import android.content.Context;
import com.yandex.mobile.ads.base.AdResponse;
import com.yandex.mobile.ads.base.SizeInfo;
import com.yandex.mobile.ads.impl.j00;

@SuppressLint({"ViewConstructor"})
/* loaded from: classes8.dex */
public final class ie extends j00 {

    /* renamed from: n, reason: collision with root package name */
    @j.N
    private final SizeInfo f386475n;

    /* renamed from: o, reason: collision with root package name */
    @j.P
    private SizeInfo f386476o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f386477p;

    /* renamed from: q, reason: collision with root package name */
    @j.k0
    final int f386478q;

    /* renamed from: r, reason: collision with root package name */
    @j.k0
    int f386479r;

    public ie(@j.N Context context, @j.N AdResponse adResponse, @j.N n2 n2Var, @j.N SizeInfo sizeInfo) {
        super(context, adResponse, n2Var);
        this.f386477p = true;
        this.f386475n = sizeInfo;
        if (l()) {
            this.f386478q = sizeInfo.c(context);
            this.f386479r = sizeInfo.a(context);
        } else {
            this.f386478q = adResponse.q() == 0 ? sizeInfo.c(context) : adResponse.q();
            this.f386479r = adResponse.d();
        }
        a(this.f386478q, this.f386479r);
    }

    private void a(int i12, int i13) {
        this.f386476o = new SizeInfo(i12, i13, this.f386475n.d());
    }

    @Override // com.yandex.mobile.ads.impl.j00
    public final void b(int i12, String str) {
        if (this.f386734k.d() != 0) {
            i12 = this.f386734k.d();
        }
        this.f386479r = i12;
        super.b(i12, str);
    }

    @Override // com.yandex.mobile.ads.impl.j00, com.yandex.mobile.ads.impl.nr0, com.yandex.mobile.ads.impl.jf
    public final String c() {
        String strE;
        StringBuilder sb2 = new StringBuilder();
        String strL = "";
        if (this.f386734k.M()) {
            int i12 = this.f386478q;
            String str = jl1.f386914a;
            strE = androidx.camera.camera2.internal.G.e(i12, "<body style='width:", "px;'>");
        } else {
            strE = "";
        }
        sb2.append(strE);
        Context context = getContext();
        int iC2 = this.f386475n.c(context);
        int iA2 = this.f386475n.a(context);
        if (l()) {
            String str2 = jl1.f386914a;
            strL = androidx.appcompat.app.r.l(iC2, iA2, "\n<style>ytag.container { width:", "px; height:", "px; }</style>\n");
        }
        sb2.append(strL);
        sb2.append(super.c());
        return sb2.toString();
    }

    @Override // com.yandex.mobile.ads.impl.nr0
    public final void h() {
        if (this.f386477p) {
            a(this.f386478q, this.f386479r);
            boolean z12 = i7.a(getContext(), this.f386476o, this.f386475n) || this.f386734k.G();
            q00 q00Var = this.f388355f;
            if (q00Var != null) {
                if (z12) {
                    q00Var.a(this, i());
                } else {
                    Context context = getContext();
                    int iC2 = this.f386475n.c(context);
                    int iA2 = this.f386475n.a(context);
                    SizeInfo sizeInfo = this.f386476o;
                    int iE2 = sizeInfo != null ? sizeInfo.e() : 0;
                    SizeInfo sizeInfo2 = this.f386476o;
                    w2 w2VarA = i5.a(iC2, iA2, iE2, sizeInfo2 != null ? sizeInfo2.c() : 0, rj1.c(context), rj1.b(context));
                    h70.a(w2VarA.c(), new Object[0]);
                    this.f388355f.a(w2VarA);
                }
            }
            this.f386477p = false;
        }
    }

    @j.P
    public final SizeInfo k() {
        return this.f386476o;
    }

    @j.k0
    public final boolean l() {
        Context context = getContext();
        return j() && this.f386734k.q() == 0 && this.f386734k.d() == 0 && this.f386475n.c(context) > 0 && this.f386475n.a(context) > 0;
    }

    @Override // com.yandex.mobile.ads.impl.j00
    @SuppressLint({"AddJavascriptInterface"})
    public final void c(@j.N Context context) {
        addJavascriptInterface(new j00.a(context), "AdPerformActionsJSI");
    }
}
