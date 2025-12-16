package com.yandex.div.core.view2.divs;

import androidx.viewpager2.widget.ViewPager2;
import com.yandex.div.core.view2.divs.C37991q1;
import kotlin.Metadata;

/* compiled from: View.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, d2 = {"Lkotlin/G0;", "<anonymous>", "()V", "androidx/core/view/v0"}, k = 3, mv = {1, 5, 1})
/* renamed from: com.yandex.div.core.view2.divs.r1, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class RunnableC37993r1 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Y41.l f368693b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ViewPager2 f368694c;

    public RunnableC37993r1(ViewPager2 viewPager2, Y41.l lVar, ViewPager2 viewPager22) {
        this.f368693b = lVar;
        this.f368694c = viewPager22;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ((C37991q1.h) this.f368693b).invoke(Integer.valueOf(this.f368694c.getWidth()));
    }
}
