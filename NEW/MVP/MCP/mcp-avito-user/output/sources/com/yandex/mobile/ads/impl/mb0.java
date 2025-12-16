package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.yandex.mobile.ads.impl.nb0;

/* loaded from: classes8.dex */
public final class mb0 implements nb0 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final Context f387899a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final nb0.a f387900b = new nb0.a();

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private final View f387901c;

    /* renamed from: d, reason: collision with root package name */
    private final float f387902d;

    public mb0(@j.N View view, float f12) {
        this.f387899a = view.getContext().getApplicationContext();
        this.f387901c = view;
        this.f387902d = f12;
    }

    @Override // com.yandex.mobile.ads.impl.nb0
    @j.N
    public final nb0.a a(int i12, int i13) {
        int mode = View.MeasureSpec.getMode(i12);
        int size = View.MeasureSpec.getSize(i12);
        Context context = this.f387899a;
        int i14 = rj1.f389556b;
        int iRound = Math.round(context.getResources().getDisplayMetrics().widthPixels * this.f387902d);
        ViewGroup.LayoutParams layoutParams = this.f387901c.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            iRound = (iRound - marginLayoutParams.leftMargin) - marginLayoutParams.rightMargin;
        }
        this.f387900b.f388198a = View.MeasureSpec.makeMeasureSpec(Math.max(Math.min(size, iRound), 0), mode);
        nb0.a aVar = this.f387900b;
        aVar.f388199b = i13;
        return aVar;
    }
}
