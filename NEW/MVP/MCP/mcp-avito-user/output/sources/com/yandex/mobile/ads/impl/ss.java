package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.view.View;

/* loaded from: classes8.dex */
public final class ss {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    private final dq f390020a = new dq();

    public final boolean a(@Y61.k View view, int i12, int i13, int i14, int i15) {
        int i16 = i14 - i12;
        int i17 = i15 - i13;
        dq dqVar = this.f390020a;
        Context context = view.getContext();
        dqVar.getClass();
        int iA2 = dq.a(context, 144.0f);
        dq dqVar2 = this.f390020a;
        Context context2 = view.getContext();
        dqVar2.getClass();
        return i16 >= iA2 && i17 >= dq.a(context2, 96.0f);
    }
}
