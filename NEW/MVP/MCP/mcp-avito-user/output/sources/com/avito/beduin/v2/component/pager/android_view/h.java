package com.avito.beduin.v2.component.pager.android_view;

import Y41.l;
import androidx.viewpager2.widget.ViewPager2;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: PagerComponent.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/beduin/v2/component/pager/android_view/h;", "Landroidx/viewpager2/widget/ViewPager2$i;", "android-view_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class h extends ViewPager2.i {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e f336143d;

    public h(e eVar) {
        this.f336143d = eVar;
    }

    @Override // androidx.viewpager2.widget.ViewPager2.i
    public final void onPageSelected(int i12) {
        l<? super Integer, G0> lVar = this.f336143d.f336138q;
        if (lVar != null) {
            lVar.invoke(Integer.valueOf(i12));
        }
    }
}
