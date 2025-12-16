package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.base.SizeInfo;

/* loaded from: classes8.dex */
final class cw {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final Context f384464a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final SizeInfo f384465b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private final InterfaceC39377x0 f384466c;

    public cw(@j.N Context context, @j.N SizeInfo sizeInfo, @j.N InterfaceC39377x0 interfaceC39377x0) {
        this.f384464a = context.getApplicationContext();
        this.f384465b = sizeInfo;
        this.f384466c = interfaceC39377x0;
    }

    public final void a() {
        int i12 = this.f384464a.getResources().getConfiguration().orientation;
        Context context = this.f384464a;
        SizeInfo sizeInfo = this.f384465b;
        boolean zB2 = i7.b(context, sizeInfo);
        boolean zA2 = i7.a(context, sizeInfo);
        int i13 = zB2 == zA2 ? -1 : (!zA2 ? 1 == i12 : 1 != i12) ? 6 : 7;
        if (-1 != i13) {
            ((C39311c1) this.f384466c).a(i13);
        }
    }
}
