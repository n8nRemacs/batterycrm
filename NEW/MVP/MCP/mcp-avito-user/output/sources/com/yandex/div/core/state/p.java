package com.yandex.div.core.state;

import androidx.viewpager2.widget.ViewPager2;
import kotlin.Metadata;

/* compiled from: UpdateStateChangePageCallback.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/div/core/state/p;", "Landroidx/viewpager2/widget/ViewPager2$i;", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class p extends ViewPager2.i {

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final String f367673d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final k f367674e;

    public p(@Y61.k String str, @Y61.k k kVar) {
        this.f367673d = str;
        this.f367674e = kVar;
    }

    @Override // androidx.viewpager2.widget.ViewPager2.i
    public final void onPageSelected(int i12) {
        super.onPageSelected(i12);
        this.f367674e.f367667b.put(this.f367673d, new m(i12));
    }
}
