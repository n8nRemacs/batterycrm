package com.avito.android.lib.design.tab_group.layout;

import androidx.viewpager.widget.ViewPager;
import androidx.viewpager2.widget.ViewPager2;
import com.avito.android.lib.design.tab_group.TabGroup;
import java.lang.ref.WeakReference;
import kotlin.Metadata;

/* compiled from: TabGroupLayoutViewPagerExt.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_design-modules_components"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class i {
    public static final void a(@Y61.k TabGroup tabGroup, @Y61.k ViewPager viewPager) {
        h hVar = new h(new j(new WeakReference(tabGroup)));
        viewPager.c(hVar);
        n nVar = new n(new l(viewPager));
        tabGroup.d(nVar);
        tabGroup.addOnAttachStateChangeListener(new f(viewPager, hVar, tabGroup, nVar));
        tabGroup.p(viewPager.getCurrentItem(), 0.0f, true, true);
    }

    public static final void b(@Y61.k TabGroup tabGroup, @Y61.k ViewPager2 viewPager2) {
        j jVar = new j(new WeakReference(tabGroup));
        viewPager2.e(jVar);
        n nVar = new n(new m(viewPager2));
        tabGroup.d(nVar);
        tabGroup.addOnAttachStateChangeListener(new g(viewPager2, jVar, tabGroup, nVar));
        tabGroup.p(viewPager2.getCurrentItem(), 0.0f, true, true);
    }
}
