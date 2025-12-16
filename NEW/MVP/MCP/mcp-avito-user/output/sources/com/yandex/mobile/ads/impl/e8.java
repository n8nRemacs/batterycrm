package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.view.View;
import com.yandex.mobile.ads.impl.nb0;

/* loaded from: classes8.dex */
public final class e8 implements nb0 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final Context f384812a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final cq f384813b = new cq();

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private final dq f384814c = new dq();

    public e8(@j.N Context context) {
        this.f384812a = context.getApplicationContext();
    }

    @Override // com.yandex.mobile.ads.impl.nb0
    @j.N
    public final nb0.a a(int i12, int i13) {
        int size = View.MeasureSpec.getSize(i12);
        int mode = View.MeasureSpec.getMode(i12);
        int size2 = View.MeasureSpec.getSize(i13);
        int mode2 = View.MeasureSpec.getMode(i12);
        if (mode != 0) {
            Context context = this.f384812a;
            int i14 = rj1.f389556b;
            int iMin = context.getResources().getDisplayMetrics().widthPixels;
            dq dqVar = this.f384814c;
            Context context2 = this.f384812a;
            dqVar.getClass();
            int iA2 = dq.a(context2, 420.0f);
            int i15 = this.f384812a.getResources().getConfiguration().orientation;
            if (this.f384813b.a(this.f384812a) != 1 || i15 != 1) {
                iMin = Math.min(iMin, iA2);
            }
            i12 = View.MeasureSpec.makeMeasureSpec(Math.min(iMin, size), 1073741824);
        }
        if (mode2 != 0) {
            Context context3 = this.f384812a;
            int i16 = rj1.f389556b;
            int i17 = context3.getResources().getDisplayMetrics().heightPixels;
            dq dqVar2 = this.f384814c;
            Context context4 = this.f384812a;
            dqVar2.getClass();
            i13 = View.MeasureSpec.makeMeasureSpec(Math.min(Math.min(i17, dq.a(context4, 350.0f)), size2), 1073741824);
        }
        nb0.a aVar = new nb0.a();
        aVar.f388199b = i13;
        aVar.f388198a = i12;
        return aVar;
    }
}
