package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.base.tracker.interaction.model.FalseClick;
import com.yandex.mobile.ads.impl.ky0;

/* renamed from: com.yandex.mobile.ads.impl.a0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C39302a0 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final Context f383363a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final n2 f383364b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private final InterfaceC39306b0 f383365c;

    /* renamed from: d, reason: collision with root package name */
    @j.P
    private C39382z f383366d;

    /* renamed from: e, reason: collision with root package name */
    @j.P
    private ky0.a f383367e;

    public C39302a0(@j.N Context context, @j.N n2 n2Var, @j.N InterfaceC39306b0 interfaceC39306b0) {
        Context applicationContext = context.getApplicationContext();
        this.f383363a = applicationContext;
        this.f383364b = n2Var;
        this.f383365c = interfaceC39306b0;
        this.f383366d = new C39382z(applicationContext, n2Var, interfaceC39306b0, null);
    }

    public final void a(@j.P FalseClick falseClick) {
        this.f383366d = new C39382z(this.f383363a, this.f383364b, this.f383365c, falseClick);
        ky0.a aVar = this.f383367e;
        if (aVar != null) {
            a(aVar);
        }
    }

    public final void b() {
        C39382z c39382z = this.f383366d;
        if (c39382z != null) {
            c39382z.b();
        }
    }

    public final void c() {
        C39382z c39382z = this.f383366d;
        if (c39382z != null) {
            c39382z.c();
        }
    }

    public final void d() {
        C39382z c39382z = this.f383366d;
        if (c39382z != null) {
            c39382z.e();
        }
    }

    public final void e() {
        C39382z c39382z = this.f383366d;
        if (c39382z != null) {
            c39382z.f();
        }
    }

    public final void f() {
        C39382z c39382z = this.f383366d;
        if (c39382z != null) {
            c39382z.g();
        }
    }

    public final void a() {
        C39382z c39382z = this.f383366d;
        if (c39382z != null) {
            c39382z.a();
        }
    }

    public final void a(@j.N ky0.a aVar) {
        this.f383367e = aVar;
        C39382z c39382z = this.f383366d;
        if (c39382z != null) {
            c39382z.a(aVar);
        }
    }
}
