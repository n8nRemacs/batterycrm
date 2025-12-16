package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.widget.FrameLayout;
import com.yandex.mobile.ads.base.AdResponse;
import com.yandex.mobile.ads.nativeads.CustomizableMediaView;

/* loaded from: classes8.dex */
public final class be0 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final AdResponse<?> f383931a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final vn0 f383932b = new vn0();

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private final ko0 f383933c = new ko0();

    /* renamed from: d, reason: collision with root package name */
    @j.N
    private final mi1 f383934d = new mi1();

    /* renamed from: e, reason: collision with root package name */
    @j.N
    private final com.yandex.mobile.ads.nativeads.e f383935e = new com.yandex.mobile.ads.nativeads.e();

    /* renamed from: f, reason: collision with root package name */
    @j.N
    private final fo0 f383936f = new fo0();

    public be0(@j.N AdResponse<?> adResponse) {
        this.f383931a = adResponse;
    }

    @j.N
    public final ao1 a(@j.N CustomizableMediaView customizableMediaView, @j.N n2 n2Var, @j.N n30 n30Var, @j.N sn0 sn0Var, @j.N cm0 cm0Var) {
        Context context = customizableMediaView.getContext();
        int iA2 = this.f383936f.a(customizableMediaView);
        this.f383932b.getClass();
        oh1 oh1VarA = vn0.a(iA2);
        this.f383935e.getClass();
        ho0 ho0VarA = this.f383933c.a(context, oh1VarA, com.yandex.mobile.ads.nativeads.e.a(customizableMediaView));
        this.f383934d.getClass();
        customizableMediaView.removeAllViews();
        customizableMediaView.addView(ho0VarA, new FrameLayout.LayoutParams(-1, -1));
        return new ao1(customizableMediaView, new xi1(ho0VarA, oh1VarA, n2Var, this.f383931a, n30Var, sn0Var, cm0Var), n2Var);
    }
}
