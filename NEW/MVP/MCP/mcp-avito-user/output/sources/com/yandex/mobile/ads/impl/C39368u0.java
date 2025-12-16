package com.yandex.mobile.ads.impl;

import android.R;
import android.content.Context;
import android.os.Bundle;
import android.view.Window;
import android.widget.RelativeLayout;
import com.yandex.mobile.ads.base.AdResponse;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import okhttp3.internal.http2.Http2Connection;

/* renamed from: com.yandex.mobile.ads.impl.u0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C39368u0 implements InterfaceC39348n0, pl {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final RelativeLayout f390342a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final AdResponse<String> f390343b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private final Window f390344c;

    /* renamed from: d, reason: collision with root package name */
    @j.N
    private final InterfaceC39377x0 f390345d;

    /* renamed from: e, reason: collision with root package name */
    @j.N
    private final qn1 f390346e;

    /* renamed from: f, reason: collision with root package name */
    @j.N
    private final er0 f390347f;

    /* renamed from: g, reason: collision with root package name */
    @j.N
    private final fx f390348g;

    public C39368u0(@j.N Context context, @j.N RelativeLayout relativeLayout, @j.N C39311c1 c39311c1, @j.N Window window, @j.N ox oxVar) {
        this.f390342a = relativeLayout;
        this.f390344c = window;
        this.f390345d = c39311c1;
        AdResponse<String> adResponseA = oxVar.a();
        this.f390343b = adResponseA;
        qn1 qn1VarB = oxVar.b();
        this.f390346e = qn1VarB;
        qn1VarB.a(this);
        this.f390347f = new er0(context, adResponseA, c39311c1);
        this.f390348g = new fx(context);
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC39348n0
    public final void a() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        ((C39311c1) this.f390345d).a(2, null);
        this.f390346e.h();
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC39348n0
    public final void b() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        ((C39311c1) this.f390345d).a(3, null);
        this.f390346e.f();
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC39348n0
    public final void c() {
        this.f390346e.a(this.f390342a);
        Bundle bundle = new Bundle();
        bundle.putSerializable("extra_tracking_parameters", (Serializable) this.f390346e.e().a());
        ((C39311c1) this.f390345d).a(0, bundle);
        ((C39311c1) this.f390345d).a(5, null);
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC39348n0
    public final void d() {
        this.f390346e.d();
    }

    @Override // com.yandex.mobile.ads.impl.pl
    public final void e() {
        ((C39311c1) this.f390345d).a();
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC39348n0
    public final boolean f() {
        return this.f390348g.a() && !(this.f390346e.e().b() && this.f390343b.I());
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC39348n0
    public final void g() {
        this.f390344c.requestFeature(1);
        this.f390344c.addFlags(1024);
        this.f390344c.addFlags(Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE);
        if (h7.a(28)) {
            this.f390344c.setBackgroundDrawableResource(R.color.black);
            this.f390344c.getAttributes().layoutInDisplayCutoutMode = 1;
        }
        this.f390347f.a();
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC39348n0
    public final void onAdClosed() {
        ((C39311c1) this.f390345d).a(4, null);
    }
}
