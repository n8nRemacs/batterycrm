package com.yandex.mobile.ads.impl;

import android.R;
import android.content.Context;
import android.view.Window;
import android.widget.RelativeLayout;
import com.yandex.mobile.ads.base.AdResponse;
import okhttp3.internal.http2.Http2Connection;

/* renamed from: com.yandex.mobile.ads.impl.y0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C39380y0 implements InterfaceC39348n0, pl {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final Context f391864a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final InterfaceC39377x0 f391865b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private final Window f391866c;

    /* renamed from: d, reason: collision with root package name */
    @j.N
    private final com.yandex.mobile.ads.nativeads.u f391867d;

    /* renamed from: e, reason: collision with root package name */
    @j.N
    private final ey f391868e;

    /* renamed from: f, reason: collision with root package name */
    @j.N
    private final fx f391869f;

    public C39380y0(@j.N Context context, @j.N RelativeLayout relativeLayout, @j.N Window window, @j.N com.yandex.mobile.ads.nativeads.u uVar, @j.N AdResponse adResponse, @j.N C39311c1 c39311c1, @j.N C39362s0 c39362s0, int i12) {
        this.f391864a = context;
        this.f391866c = window;
        this.f391865b = c39311c1;
        this.f391867d = uVar;
        this.f391868e = new jy(context, adResponse, relativeLayout, this, c39362s0, i12, c39311c1, 0).a(context, uVar, this);
        this.f391869f = new fx(context);
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC39348n0
    public final void a() {
        ((C39311c1) this.f391865b).a(2, null);
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC39348n0
    public final void b() {
        ((C39311c1) this.f391865b).a(3, null);
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC39348n0
    public final void c() {
        this.f391868e.c();
        ((C39311c1) this.f391865b).a(0, null);
        ((C39311c1) this.f391865b).a(5, null);
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC39348n0
    public final void d() {
        this.f391868e.invalidate();
    }

    @Override // com.yandex.mobile.ads.impl.pl
    public final void e() {
        ((C39311c1) this.f391865b).a();
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC39348n0
    public final boolean f() {
        return this.f391869f.a();
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC39348n0
    public final void g() {
        ((C39311c1) this.f391865b).a(this.f391864a.getResources().getConfiguration().orientation == 1 ? 7 : 6);
        this.f391866c.requestFeature(1);
        this.f391866c.addFlags(1024);
        this.f391866c.addFlags(Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE);
        if (h7.a(28)) {
            this.f391866c.setBackgroundDrawableResource(R.color.transparent);
            this.f391866c.getAttributes().layoutInDisplayCutoutMode = 1;
        }
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC39348n0
    public final void onAdClosed() {
        this.f391867d.destroy();
        ((C39311c1) this.f391865b).a(4, null);
    }
}
