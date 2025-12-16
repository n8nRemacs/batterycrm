package com.avito.android.tariff.cpr.configure.advance.items.hints;

import Y61.k;
import android.view.View;
import android.widget.LinearLayout;
import androidx.compose.runtime.internal.P;
import androidx.viewpager2.widget.ViewPager2;
import com.avito.android.R;
import com.avito.android.lib.design.banner.Banner;
import com.avito.android.lib.design.page_indicator_re23.PageIndicatorRe23;
import com.avito.android.util.y6;
import java.util.ArrayList;
import kotlin.Metadata;
import rV.InterfaceC47597a;

/* compiled from: CprConfigureHintsItemView.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/tariff/cpr/configure/advance/items/hints/h;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/tariff/cpr/configure/advance/items/hints/g;", "_avito_tariff-cpr_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class h extends com.avito.konveyor.adapter.b implements g {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final i f295278b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final ViewPager2 f295279c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final PageIndicatorRe23 f295280d;

    public h(@k View view, @k i iVar) {
        super(view);
        this.f295278b = iVar;
        LinearLayout linearLayout = (LinearLayout) ((Banner) view.getRootView()).findViewById(R.id.hints_content);
        ViewPager2 viewPager2 = (ViewPager2) linearLayout.findViewById(R.id.pager_hints_scroll);
        this.f295279c = viewPager2;
        this.f295280d = (PageIndicatorRe23) linearLayout.findViewById(R.id.page_indicator);
        viewPager2.setAdapter(iVar);
        viewPager2.setPageTransformer(new androidx.viewpager2.widget.f(y6.b(40)));
    }

    @Override // com.avito.android.tariff.cpr.configure.advance.items.hints.g
    public final void lw(@k ArrayList arrayList) {
        this.f295278b.m(arrayList);
        PageIndicatorRe23 pageIndicatorRe23 = this.f295280d;
        InterfaceC47597a<?> attachDelegate$_design_modules_components = pageIndicatorRe23.getAttachDelegate$_design_modules_components();
        if (attachDelegate$_design_modules_components != null) {
            attachDelegate$_design_modules_components.a();
        }
        rV.i iVar = new rV.i(pageIndicatorRe23.getPageIndicatorCallback$_design_modules_components());
        iVar.b(this.f295279c);
        pageIndicatorRe23.setAttachDelegate$_design_modules_components(iVar);
    }
}
