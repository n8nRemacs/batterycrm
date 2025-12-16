package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.base.AdResponse;
import java.util.ArrayList;

/* loaded from: classes8.dex */
public final class u01 implements wp {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final q01 f390411a;

    public u01(@j.N InterfaceC39377x0 interfaceC39377x0, int i12) {
        this.f390411a = new q01(interfaceC39377x0, i12);
    }

    @Override // com.yandex.mobile.ads.impl.wp
    @j.N
    public final ArrayList a(@j.N Context context, @j.N AdResponse adResponse, @j.N com.yandex.mobile.ads.nativeads.u uVar, @j.N pl plVar, @j.N C39362s0 c39362s0, @j.N pn pnVar, @j.N k2 k2Var, @j.N o01 o01Var, @j.N f91 f91Var, @j.N qq qqVar, @j.P vq vqVar) {
        ArrayList arrayList = new ArrayList();
        zq zqVarA = this.f390411a.a(context, adResponse, uVar, c39362s0, k2Var, o01Var, f91Var, qqVar, vqVar);
        if (zqVarA != null) {
            arrayList.add(zqVarA);
        }
        return arrayList;
    }
}
