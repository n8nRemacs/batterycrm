package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.adjust.sdk.Constants;

/* loaded from: classes8.dex */
final class y20 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f391897a;

    public y20(@j.N Context context) {
        this.f391897a = context.getApplicationContext();
    }

    @j.N
    public final String a(int i12, int i13) {
        Context context = this.f391897a;
        int i14 = rj1.f389556b;
        int iRound = Math.round(i12 / context.getResources().getDisplayMetrics().density);
        int iRound2 = Math.round(i13 / this.f391897a.getResources().getDisplayMetrics().density);
        return (iRound >= 320 || iRound2 >= 240) ? Constants.LARGE : (iRound >= 160 || iRound2 >= 160) ? "medium" : Constants.SMALL;
    }
}
