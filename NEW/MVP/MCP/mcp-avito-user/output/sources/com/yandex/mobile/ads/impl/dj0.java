package com.yandex.mobile.ads.impl;

import android.view.View;
import androidx.viewpager2.widget.ViewPager2;
import java.util.List;

/* loaded from: classes8.dex */
public final class dj0 extends bj1<ViewPager2, List<? extends b30>> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    private final w20 f384621b;

    public dj0(@Y61.k ViewPager2 viewPager2, @Y61.k w20 w20Var) {
        super(viewPager2);
        this.f384621b = w20Var;
    }

    @Override // com.yandex.mobile.ads.impl.bj1
    public final boolean a(View view, List<? extends b30> list) {
        return ((ViewPager2) view).getAdapter() instanceof zi0;
    }

    @Override // com.yandex.mobile.ads.impl.bj1
    public final void b(View view, List<? extends b30> list) {
        ((ViewPager2) view).setAdapter(new zi0(this.f384621b, list));
    }
}
