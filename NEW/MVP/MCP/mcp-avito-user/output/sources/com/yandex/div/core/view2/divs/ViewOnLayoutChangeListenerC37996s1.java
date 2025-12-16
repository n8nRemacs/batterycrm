package com.yandex.div.core.view2.divs;

import android.view.View;
import androidx.viewpager2.widget.ViewPager2;
import com.yandex.div.core.InterfaceC37911f;
import kotlin.Metadata;

/* compiled from: DivPagerBinder.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/yandex/div/core/view2/divs/s1;", "Lcom/yandex/div/core/f;", "Landroid/view/View$OnLayoutChangeListener;", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* renamed from: com.yandex.div.core.view2.divs.s1, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class ViewOnLayoutChangeListenerC37996s1 implements InterfaceC37911f, View.OnLayoutChangeListener {

    /* renamed from: b, reason: collision with root package name */
    public int f368706b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ViewPager2 f368707c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Y41.l<Object, kotlin.G0> f368708d;

    public ViewOnLayoutChangeListenerC37996s1(ViewPager2 viewPager2, Y41.l lVar) {
        this.f368707c = viewPager2;
        this.f368708d = lVar;
        this.f368706b = viewPager2.getWidth();
        viewPager2.addOnLayoutChangeListener(this);
        androidx.core.view.P.b(viewPager2, new RunnableC37993r1(viewPager2, lVar, viewPager2));
    }

    @Override // java.lang.AutoCloseable, java.io.Closeable
    public final void close() {
        this.f368707c.removeOnLayoutChangeListener(this);
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(@Y61.k View view, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19) {
        int width = view.getWidth();
        if (this.f368706b == width) {
            return;
        }
        this.f368706b = width;
        this.f368708d.invoke(Integer.valueOf(width));
    }
}
