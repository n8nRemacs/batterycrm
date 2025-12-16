package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.os.Bundle;
import com.yandex.mobile.ads.base.AdResponse;

/* loaded from: classes8.dex */
public final class f01 extends fy<f01> {

    /* renamed from: w, reason: collision with root package name */
    @Y61.k
    private final aw0 f385152w;

    /* renamed from: x, reason: collision with root package name */
    @Y61.l
    private final r01 f385153x;

    public /* synthetic */ f01(Context context, AdResponse adResponse, n2 n2Var, lx lxVar) {
        aw0 aw0Var = new aw0();
        this(context, adResponse, n2Var, lxVar, aw0Var, new s01(aw0Var), new e00(), new ex());
    }

    public final void a(@Y61.k zv0 zv0Var) {
        a((ux) zv0Var);
        this.f385152w.a(zv0Var);
    }

    @Override // com.yandex.mobile.ads.impl.fy, com.yandex.mobile.ads.impl.ea1, com.yandex.mobile.ads.impl.q2
    public final void onReceiveResult(int i12, @Y61.l Bundle bundle) {
        if (i12 == 13) {
            p();
        } else {
            super.onReceiveResult(i12, bundle);
        }
    }

    public final void p() {
        r01 r01Var = this.f385153x;
        if (r01Var != null) {
            r01Var.a();
        }
    }

    public f01(@Y61.k Context context, @Y61.k AdResponse<String> adResponse, @Y61.k n2 n2Var, @Y61.k lx<f01> lxVar, @Y61.k aw0 aw0Var, @Y61.k s01 s01Var, @Y61.k e00 e00Var, @Y61.k ex exVar) {
        super(context, adResponse, n2Var, exVar, lxVar, new r3());
        this.f385152w = aw0Var;
        this.f385153x = s01Var.a(context, adResponse, n2Var);
        e00Var.a(adResponse);
    }

    @Override // com.yandex.mobile.ads.impl.fy
    public final fy m() {
        return this;
    }
}
