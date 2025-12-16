package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.util.TypedValue;
import com.yandex.mobile.ads.base.AdResponse;

/* loaded from: classes8.dex */
public final class xx {

    /* renamed from: a, reason: collision with root package name */
    private final dq f391820a = new dq();

    @j.N
    public final wx a(@j.N Context context, @j.N AdResponse<String> adResponse, @j.N n2 n2Var) {
        Context applicationContext = context.getApplicationContext();
        wx wxVar = new wx(applicationContext, adResponse, n2Var);
        wxVar.setId(2);
        dq dqVar = this.f391820a;
        float fQ2 = adResponse.q();
        dqVar.getClass();
        int iRound = Math.round(TypedValue.applyDimension(1, fQ2, applicationContext.getResources().getDisplayMetrics()));
        dq dqVar2 = this.f391820a;
        float fD2 = adResponse.d();
        dqVar2.getClass();
        int iRound2 = Math.round(TypedValue.applyDimension(1, fD2, applicationContext.getResources().getDisplayMetrics()));
        if (iRound > 0 && iRound2 > 0) {
            wxVar.layout(0, 0, iRound, iRound2);
        }
        return wxVar;
    }
}
