package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.yandex.mobile.ads.impl.nb0;

/* loaded from: classes8.dex */
public final class lb0 implements nb0 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final Context f387417a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final View f387418b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private final nb0.a f387419c = new nb0.a();

    /* renamed from: d, reason: collision with root package name */
    private final float f387420d;

    public lb0(@j.N View view, float f12) {
        this.f387417a = view.getContext().getApplicationContext();
        this.f387418b = view;
        this.f387420d = f12;
    }

    @Override // com.yandex.mobile.ads.impl.nb0
    @j.N
    public final nb0.a a(int i12, int i13) {
        int mode = View.MeasureSpec.getMode(i13);
        int size = View.MeasureSpec.getSize(i13);
        Context context = this.f387417a;
        int i14 = rj1.f389556b;
        int iRound = Math.round(context.getResources().getDisplayMetrics().heightPixels * this.f387420d);
        ViewGroup.LayoutParams layoutParams = this.f387418b.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            iRound = (iRound - marginLayoutParams.topMargin) - marginLayoutParams.bottomMargin;
        }
        int iMax = Math.max(Math.min(size, iRound), 0);
        nb0.a aVar = this.f387419c;
        aVar.f388198a = i12;
        aVar.f388199b = View.MeasureSpec.makeMeasureSpec(iMax, mode);
        return this.f387419c;
    }
}
