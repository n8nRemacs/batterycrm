package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.base.AdResponse;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes8.dex */
public final class b80 implements wp {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final a80 f383815a;

    public b80(@j.N InterfaceC39377x0 interfaceC39377x0, int i12) {
        this.f383815a = new a80(interfaceC39377x0, i12);
    }

    @Override // com.yandex.mobile.ads.impl.wp
    @j.N
    public final ArrayList a(@j.N Context context, @j.N AdResponse adResponse, @j.N com.yandex.mobile.ads.nativeads.u uVar, @j.N pl plVar, @j.N C39362s0 c39362s0, @j.N pn pnVar, @j.N k2 k2Var, @j.N o01 o01Var, @j.N f91 f91Var, @j.N qq qqVar, @j.P vq vqVar) {
        ak akVarA = new y70(adResponse, c39362s0, plVar).a(new bk0(), pnVar, f91Var);
        ArrayList arrayList = new ArrayList();
        List listAsList = Arrays.asList(new du0(akVarA), new r80(akVarA), new q80(akVarA));
        zq zqVarA = this.f383815a.a(context, adResponse, uVar, c39362s0, plVar, k2Var, pnVar, qqVar, f91Var, vqVar);
        if (zqVarA != null) {
            arrayList.add(zqVarA);
        }
        arrayList.addAll(listAsList);
        return arrayList;
    }
}
