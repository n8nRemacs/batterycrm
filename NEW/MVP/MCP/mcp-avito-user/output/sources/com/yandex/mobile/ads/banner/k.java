package com.yandex.mobile.ads.banner;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import com.yandex.mobile.ads.base.AdResponse;
import com.yandex.mobile.ads.impl.a4;
import com.yandex.mobile.ads.impl.b00;
import com.yandex.mobile.ads.impl.sj1;
import com.yandex.mobile.ads.impl.w2;
import com.yandex.mobile.ads.impl.y6;
import j.N;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes8.dex */
public abstract class k extends b00 implements sj1 {

    /* renamed from: w, reason: collision with root package name */
    private boolean f382535w;

    /* renamed from: x, reason: collision with root package name */
    @N
    private final c f382536x;

    /* renamed from: y, reason: collision with root package name */
    @N
    private final h f382537y;

    /* renamed from: z, reason: collision with root package name */
    @N
    private final Runnable f382538z;

    @SuppressLint({"VisibleForTests"})
    public k(@N Context context, @N h hVar, @N a4 a4Var) {
        super(context, y6.f391935b, a4Var);
        this.f382538z = new m(this, 3);
        this.f382535w = true;
        this.f382536x = new c(hVar);
        this.f382537y = hVar;
        hVar.addVisibilityChangeListener(this);
    }

    private void u() {
        this.f389493a.removeCallbacks(this.f382538z);
        AdResponse<String> adResponseG = g();
        if (adResponseG != null && adResponseG.L() && this.f382535w && !l() && this.f382536x.b()) {
            this.f389493a.postDelayed(this.f382538z, adResponseG.g());
        }
    }

    @Override // com.yandex.mobile.ads.impl.sj1
    public void a(int i12) {
        u();
    }

    @Override // com.yandex.mobile.ads.impl.re
    public void b(@N w2 w2Var) {
        super.b(w2Var);
        if (5 == w2Var.a() || 2 == w2Var.a()) {
            return;
        }
        u();
    }

    @Override // com.yandex.mobile.ads.impl.re
    public void c() {
        super.c();
        this.f382537y.removeVisibilityChangeListener(this);
        this.f382535w = false;
        this.f389493a.removeCallbacks(this.f382538z);
    }

    @Override // com.yandex.mobile.ads.impl.re
    public final void n() {
        super.n();
        u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void t() {
        b(f());
    }

    @Override // com.yandex.mobile.ads.impl.re, com.yandex.mobile.ads.impl.ns0.a
    public void a(@N Intent intent) {
        intent.getAction();
        u();
    }
}
