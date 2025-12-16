package com.yandex.mobile.ads.impl;

import android.view.View;
import com.yandex.mobile.ads.impl.ri1;
import java.util.List;

/* loaded from: classes8.dex */
public final class ti1 implements ri1 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    private final ri1 f390208a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f390209b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f390210c;

    public ti1(@Y61.k zk zkVar) {
        this.f390208a = zkVar;
    }

    @Override // com.yandex.mobile.ads.impl.ri1
    public final void a() {
        this.f390208a.a();
    }

    @Override // com.yandex.mobile.ads.impl.ri1
    public final void b() {
        this.f390208a.b();
        k();
    }

    @Override // com.yandex.mobile.ads.impl.ri1
    public final void c() {
        this.f390208a.c();
    }

    @Override // com.yandex.mobile.ads.impl.ri1
    public final void d() {
        this.f390208a.d();
    }

    @Override // com.yandex.mobile.ads.impl.ri1
    public final void e() {
        this.f390208a.e();
        k();
    }

    @Override // com.yandex.mobile.ads.impl.ri1
    public final void f() {
        this.f390208a.f();
    }

    @Override // com.yandex.mobile.ads.impl.ri1
    public final void g() {
        this.f390208a.g();
        k();
    }

    @Override // com.yandex.mobile.ads.impl.ri1
    public final void h() {
        if (this.f390209b) {
            return;
        }
        this.f390209b = true;
        this.f390208a.h();
    }

    @Override // com.yandex.mobile.ads.impl.ri1
    public final void i() {
        this.f390208a.i();
    }

    @Override // com.yandex.mobile.ads.impl.ri1
    public final void j() {
        this.f390208a.j();
    }

    @Override // com.yandex.mobile.ads.impl.ri1
    public final void k() {
        this.f390208a.k();
        this.f390209b = false;
        this.f390210c = false;
    }

    @Override // com.yandex.mobile.ads.impl.ri1
    public final void l() {
        this.f390208a.l();
    }

    @Override // com.yandex.mobile.ads.impl.ri1
    public final void m() {
        this.f390208a.m();
        h();
        n();
    }

    @Override // com.yandex.mobile.ads.impl.ri1
    public final void n() {
        if (this.f390210c) {
            return;
        }
        this.f390210c = true;
        this.f390208a.n();
    }

    @Override // com.yandex.mobile.ads.impl.ri1
    public final void a(float f12) {
        this.f390208a.a(f12);
    }

    @Override // com.yandex.mobile.ads.impl.ri1
    public final void a(long j12) {
        this.f390208a.a(j12);
    }

    @Override // com.yandex.mobile.ads.impl.ri1
    public final void a(@Y61.k ri1.a aVar) {
        this.f390208a.a(aVar);
    }

    @Override // com.yandex.mobile.ads.impl.ri1
    public final void a(@Y61.k View view, @Y61.k List<df1> list) {
        this.f390208a.a(view, list);
        this.f390209b = false;
        this.f390210c = false;
    }

    @Override // com.yandex.mobile.ads.impl.ri1
    public final void a(@Y61.k String str) {
        this.f390208a.a(str);
        h();
        n();
    }

    @Override // com.yandex.mobile.ads.impl.ri1
    public final void a(@Y61.k cg1 cg1Var) {
        this.f390208a.a(cg1Var);
        k();
    }
}
