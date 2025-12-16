package com.yandex.mobile.ads.impl;

import android.view.View;
import com.yandex.mobile.ads.impl.ri1;
import com.yandex.mobile.ads.impl.si1;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes8.dex */
public final class rm implements si1 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    private final im f389570a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    private final pi1 f389571b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    private final jh1 f389572c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    private final w60 f389573d = new w60(new jm());

    /* renamed from: e, reason: collision with root package name */
    private boolean f389574e;

    public rm(@Y61.k im imVar, @Y61.k pi1 pi1Var, @Y61.k jh1 jh1Var) {
        this.f389570a = imVar;
        this.f389571b = pi1Var;
        this.f389572c = jh1Var;
    }

    @Override // com.yandex.mobile.ads.impl.ri1
    public final void a(float f12) {
    }

    @Override // com.yandex.mobile.ads.impl.ri1
    public final void b() {
        this.f389571b.a(this.f389570a, "complete");
    }

    @Override // com.yandex.mobile.ads.impl.ri1
    public final void c() {
        this.f389571b.a(this.f389570a, "resume");
    }

    @Override // com.yandex.mobile.ads.impl.ri1
    public final void d() {
        this.f389571b.a(this.f389570a, "pause");
    }

    @Override // com.yandex.mobile.ads.impl.ri1
    public final void e() {
        this.f389571b.a(this.f389570a, "skip");
    }

    @Override // com.yandex.mobile.ads.impl.ri1
    public final void h() {
        this.f389571b.a(this.f389570a, "creativeView");
    }

    @Override // com.yandex.mobile.ads.impl.ri1
    public final void i() {
        this.f389571b.a(new om().a(this.f389570a), "creativeRenderingStart");
    }

    @Override // com.yandex.mobile.ads.impl.ri1
    public final void k() {
        this.f389574e = false;
    }

    @Override // com.yandex.mobile.ads.impl.ri1
    public final void l() {
        this.f389571b.a(this.f389570a, "mute");
    }

    @Override // com.yandex.mobile.ads.impl.ri1
    public final void m() {
        if (!this.f389574e) {
            this.f389574e = true;
            this.f389571b.a(this.f389570a, "start");
        }
        this.f389571b.a(this.f389570a, "clickTracking");
    }

    @Override // com.yandex.mobile.ads.impl.ri1
    public final void a(@Y61.k View view, @Y61.k List<df1> list) {
        si1.a.a(view, list);
    }

    @Override // com.yandex.mobile.ads.impl.ri1
    public final void a(@Y61.k cg1 cg1Var) {
        si1.a.a(cg1Var);
    }

    @Override // com.yandex.mobile.ads.impl.ri1
    public final void a(@Y61.k ri1.a aVar) {
        String str;
        int iOrdinal = aVar.ordinal();
        if (iOrdinal == 0) {
            str = "firstQuartile";
        } else if (iOrdinal == 1) {
            str = "midpoint";
        } else {
            if (iOrdinal != 2) {
                throw new NoWhenBranchMatchedException();
            }
            str = "thirdQuartile";
        }
        this.f389571b.a(this.f389570a, str);
    }

    @Override // com.yandex.mobile.ads.impl.ri1
    public final void a() {
        this.f389571b.a(this.f389570a, "unmute");
    }

    @Override // com.yandex.mobile.ads.impl.ri1
    public final void a(@Y61.k String str) {
        if (!this.f389574e) {
            this.f389574e = true;
            this.f389571b.a(this.f389570a, "start");
        }
        this.f389572c.a((List<String>) this.f389573d.a(this.f389570a, str).b(), (Map<String, String>) null);
    }

    @Override // com.yandex.mobile.ads.impl.ri1
    public final void a(long j12) {
        if (this.f389574e) {
            return;
        }
        this.f389574e = true;
        this.f389571b.a(this.f389570a, "start");
    }

    @Override // com.yandex.mobile.ads.impl.ri1
    public final void f() {
    }

    @Override // com.yandex.mobile.ads.impl.ri1
    public final void g() {
    }

    @Override // com.yandex.mobile.ads.impl.ri1
    public final void j() {
    }

    @Override // com.yandex.mobile.ads.impl.ri1
    public final void n() {
    }
}
