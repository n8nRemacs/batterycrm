package com.yandex.div.internal.widget.tabs;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.core.view.C22823h0;
import androidx.core.view.C22829k0;
import androidx.core.view.C22833m0;
import com.avito.android.R;
import com.yandex.div.core.InterfaceC37911f;
import com.yandex.div.core.view2.divs.C37931a;
import com.yandex.div.core.view2.divs.widgets.C38010b;
import com.yandex.div.core.view2.divs.widgets.InterfaceC38013e;
import com.yandex.div.internal.widget.tabs.v;
import com.yandex.div2.DivTabs;
import com.yandex.div2.K;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: TabsLayout.kt */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0010\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003J\u0011\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R\u001e\u0010\f\u001a\u0006\u0012\u0002\b\u00030\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0012\u001a\u00020\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0018\u001a\u00020\u00138\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u001e\u001a\u00020\u00198\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR$\u0010&\u001a\u0004\u0018\u00010\u001f8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R$\u0010.\u001a\u0004\u0018\u00010'8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R \u00105\u001a\b\u0012\u0004\u0012\u0002000/8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\u0016\u00109\u001a\u0004\u0018\u0001068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b7\u00108¨\u0006:"}, d2 = {"Lcom/yandex/div/internal/widget/tabs/z;", "Landroid/widget/LinearLayout;", "Lcom/yandex/div/core/view2/divs/widgets/e;", "LF21/b;", "Lcom/yandex/div/core/view2/divs/widgets/b;", "getDivBorderDrawer", "()Lcom/yandex/div/core/view2/divs/widgets/b;", "Lcom/yandex/div/internal/widget/tabs/v;", "b", "Lcom/yandex/div/internal/widget/tabs/v;", "getTitleLayout", "()Lcom/yandex/div/internal/widget/tabs/v;", "titleLayout", "Landroid/view/View;", "c", "Landroid/view/View;", "getDivider", "()Landroid/view/View;", "divider", "Lcom/yandex/div/internal/widget/tabs/A;", "d", "Lcom/yandex/div/internal/widget/tabs/A;", "getPagerLayout", "()Lcom/yandex/div/internal/widget/tabs/A;", "pagerLayout", "Lcom/yandex/div/internal/widget/tabs/o;", "e", "Lcom/yandex/div/internal/widget/tabs/o;", "getViewPager", "()Lcom/yandex/div/internal/widget/tabs/o;", "viewPager", "Lcom/yandex/div/core/view2/divs/tabs/b;", "f", "Lcom/yandex/div/core/view2/divs/tabs/b;", "getDivTabsAdapter", "()Lcom/yandex/div/core/view2/divs/tabs/b;", "setDivTabsAdapter", "(Lcom/yandex/div/core/view2/divs/tabs/b;)V", "divTabsAdapter", "Lcom/yandex/div2/DivTabs;", "g", "Lcom/yandex/div2/DivTabs;", "getDiv", "()Lcom/yandex/div2/DivTabs;", "setDiv", "(Lcom/yandex/div2/DivTabs;)V", "div", "", "Lcom/yandex/div/core/f;", "i", "Ljava/util/List;", "getSubscriptions", "()Ljava/util/List;", "subscriptions", "Lcom/yandex/div2/K;", "getBorder", "()Lcom/yandex/div2/K;", "border", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public class z extends LinearLayout implements InterfaceC38013e, F21.b {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    public final v<?> titleLayout;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    public final View divider;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    public final A pagerLayout;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    public final o viewPager;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @Y61.l
    public com.yandex.div.core.view2.divs.tabs.b divTabsAdapter;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @Y61.l
    public DivTabs div;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public C38010b f370538h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final ArrayList f370539i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f370540j;

    public z(Context context, AttributeSet attributeSet, int i12, C42822w c42822w) throws Resources.NotFoundException {
        super(context, (i12 & 2) != 0 ? null : attributeSet);
        this.f370539i = new ArrayList();
        setId(R.id.div_tabs_block);
        setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        setOrientation(1);
        v<?> vVar = new v<>(context);
        vVar.f370519N = false;
        vVar.setTabMode(0);
        vVar.setTabIndicatorHeight(0);
        vVar.setOnTabSelectedListener(new u(vVar));
        com.yandex.div.internal.viewpool.e eVar = new com.yandex.div.internal.viewpool.e();
        eVar.a("TabTitlesLayoutView.TAB_HEADER", new v.b(vVar.getContext()), 0);
        vVar.f370515J = eVar;
        vVar.f370516K = "TabTitlesLayoutView.TAB_HEADER";
        vVar.setId(R.id.base_tabbed_title_container_scroller);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, getResources().getDimensionPixelSize(R.dimen.title_tab_title_height));
        layoutParams.gravity = 8388611;
        vVar.setLayoutParams(layoutParams);
        int dimensionPixelSize = vVar.getResources().getDimensionPixelSize(R.dimen.title_tab_title_margin_vertical);
        int dimensionPixelSize2 = vVar.getResources().getDimensionPixelSize(R.dimen.title_tab_title_margin_horizontal);
        vVar.setPadding(dimensionPixelSize2, dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize);
        vVar.setClipToPadding(false);
        this.titleLayout = vVar;
        View view = new View(context);
        view.setId(R.id.div_tabs_divider);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, getResources().getDimensionPixelSize(R.dimen.div_separator_delimiter_height));
        int dimensionPixelSize3 = getResources().getDimensionPixelSize(R.dimen.div_horizontal_padding);
        layoutParams2.leftMargin = dimensionPixelSize3;
        layoutParams2.rightMargin = dimensionPixelSize3;
        layoutParams2.topMargin = getResources().getDimensionPixelSize(R.dimen.title_tab_title_separator_margin_top);
        layoutParams2.bottomMargin = getResources().getDimensionPixelSize(R.dimen.title_tab_title_margin_vertical);
        view.setLayoutParams(layoutParams2);
        view.setBackgroundResource(R.color.div_separator_color);
        this.divider = view;
        o oVar = new o(context);
        oVar.setId(R.id.div_tabs_pager_container);
        oVar.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        oVar.setOverScrollMode(2);
        C22823h0.J(oVar, true);
        this.viewPager = oVar;
        A a12 = new A(context, null, 0, 6, null);
        a12.setId(R.id.div_tabs_container_helper);
        a12.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        a12.setCollapsiblePaddingBottom(0);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        frameLayout.setVisibility(8);
        a12.addView(getViewPager());
        a12.addView(frameLayout);
        this.pagerLayout = a12;
        addView(getTitleLayout());
        addView(getDivider());
        addView(getPagerLayout());
    }

    @Override // com.yandex.div.core.view2.divs.widgets.InterfaceC38013e
    public final void c(@Y61.k com.yandex.div.json.expressions.e eVar, @Y61.l K k12) {
        this.f370538h = C37931a.U(this, k12, eVar);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(@Y61.k Canvas canvas) {
        C38010b f370538h;
        Iterator<View> it = new C22829k0(this).iterator();
        while (true) {
            C22833m0 c22833m0 = (C22833m0) it;
            if (!c22833m0.hasNext()) {
                break;
            }
            KeyEvent.Callback callback = (View) c22833m0.next();
            InterfaceC38013e interfaceC38013e = callback instanceof InterfaceC38013e ? (InterfaceC38013e) callback : null;
            if (interfaceC38013e != null && (f370538h = interfaceC38013e.getF368981w()) != null) {
                f370538h.f(canvas);
            }
        }
        if (this.f370540j) {
            super.dispatchDraw(canvas);
            return;
        }
        C38010b c38010b = this.f370538h;
        if (c38010b == null) {
            super.dispatchDraw(canvas);
            return;
        }
        int iSave = canvas.save();
        try {
            c38010b.c(canvas);
            super.dispatchDraw(canvas);
            c38010b.d(canvas);
        } finally {
            canvas.restoreToCount(iSave);
        }
    }

    @Override // android.view.View
    public final void draw(@Y61.k Canvas canvas) {
        this.f370540j = true;
        C38010b c38010b = this.f370538h;
        if (c38010b != null) {
            int iSave = canvas.save();
            try {
                c38010b.c(canvas);
                super.draw(canvas);
                c38010b.d(canvas);
            } finally {
                canvas.restoreToCount(iSave);
            }
        } else {
            super.draw(canvas);
        }
        this.f370540j = false;
    }

    @Override // com.yandex.div.core.view2.divs.widgets.InterfaceC38013e
    @Y61.l
    public K getBorder() {
        C38010b c38010b = this.f370538h;
        if (c38010b == null) {
            return null;
        }
        return c38010b.f368881e;
    }

    @Y61.l
    public DivTabs getDiv() {
        return this.div;
    }

    @Override // com.yandex.div.core.view2.divs.widgets.InterfaceC38013e
    @Y61.l
    /* renamed from: getDivBorderDrawer, reason: from getter */
    public C38010b getF368981w() {
        return this.f370538h;
    }

    @Y61.l
    public com.yandex.div.core.view2.divs.tabs.b getDivTabsAdapter() {
        return this.divTabsAdapter;
    }

    @Y61.k
    public View getDivider() {
        return this.divider;
    }

    @Y61.k
    public A getPagerLayout() {
        return this.pagerLayout;
    }

    @Override // F21.b
    @Y61.k
    public List<InterfaceC37911f> getSubscriptions() {
        return this.f370539i;
    }

    @Y61.k
    public v<?> getTitleLayout() {
        return this.titleLayout;
    }

    @Y61.k
    public o getViewPager() {
        return this.viewPager;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i12, int i13, int i14, int i15) {
        super.onSizeChanged(i12, i13, i14, i15);
        C38010b c38010b = this.f370538h;
        if (c38010b == null) {
            return;
        }
        c38010b.m();
    }

    @Override // F21.b, com.yandex.div.core.view2.c0
    public final void release() {
        g();
        C38010b c38010b = this.f370538h;
        if (c38010b == null) {
            return;
        }
        c38010b.g();
    }

    public void setDiv(@Y61.l DivTabs divTabs) {
        this.div = divTabs;
    }

    public void setDivTabsAdapter(@Y61.l com.yandex.div.core.view2.divs.tabs.b bVar) {
        this.divTabsAdapter = bVar;
    }
}
