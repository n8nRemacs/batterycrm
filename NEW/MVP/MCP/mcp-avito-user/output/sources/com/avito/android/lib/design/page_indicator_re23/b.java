package com.avito.android.lib.design.page_indicator_re23;

import Y61.k;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import kotlin.Metadata;
import rV.InterfaceC47597a;
import rV.h;
import rV.j;

/* compiled from: PageIndicatorRe23Ext.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\f\b\u0000\u0010\u0001\"\u00020\u00002\u00020\u0000*\f\b\u0000\u0010\u0003\"\u00020\u00022\u00020\u0002*\f\b\u0000\u0010\u0005\"\u00020\u00042\u00020\u0004¨\u0006\u0006"}, d2 = {"Landroid/graphics/drawable/GradientDrawable;", "DotDrawable", "Landroid/view/ViewGroup$MarginLayoutParams;", "DotLayoutParams", "Landroid/widget/ImageView;", "DotView", "_design-modules_components"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class b {
    public static void a(PageIndicatorRe23 pageIndicatorRe23, RecyclerView recyclerView) {
        InterfaceC47597a<?> attachDelegate$_design_modules_components = pageIndicatorRe23.getAttachDelegate$_design_modules_components();
        if (attachDelegate$_design_modules_components != null) {
            attachDelegate$_design_modules_components.a();
        }
        h hVar = new h(pageIndicatorRe23.getPageIndicatorCallback$_design_modules_components());
        hVar.b(recyclerView);
        pageIndicatorRe23.setAttachDelegate$_design_modules_components(hVar);
        pageIndicatorRe23.setSelectedIndexListener$_design_modules_components(null);
    }

    public static final void b(@k PageIndicatorRe23 pageIndicatorRe23, @k ViewPager viewPager) {
        InterfaceC47597a<?> attachDelegate$_design_modules_components = pageIndicatorRe23.getAttachDelegate$_design_modules_components();
        if (attachDelegate$_design_modules_components != null) {
            attachDelegate$_design_modules_components.a();
        }
        j jVar = new j(pageIndicatorRe23.getPageIndicatorCallback$_design_modules_components());
        jVar.b(viewPager);
        pageIndicatorRe23.setAttachDelegate$_design_modules_components(jVar);
    }

    public static final void c(@k PageIndicatorRe23 pageIndicatorRe23) {
        InterfaceC47597a<?> attachDelegate$_design_modules_components = pageIndicatorRe23.getAttachDelegate$_design_modules_components();
        if (attachDelegate$_design_modules_components != null) {
            attachDelegate$_design_modules_components.a();
        }
        pageIndicatorRe23.setAttachDelegate$_design_modules_components(null);
        pageIndicatorRe23.setSelectedIndexListener$_design_modules_components(null);
    }
}
