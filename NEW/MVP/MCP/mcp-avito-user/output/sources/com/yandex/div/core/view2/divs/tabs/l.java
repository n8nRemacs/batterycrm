package com.yandex.div.core.view2.divs.tabs;

import androidx.viewpager.widget.ViewPager;
import com.yandex.div.core.InterfaceC37915j;
import com.yandex.div.core.view2.C38029k;
import com.yandex.div.core.view2.X;
import com.yandex.div.core.view2.divs.C37931a;
import com.yandex.div.core.view2.divs.C37955g;
import com.yandex.div.internal.widget.tabs.d;
import com.yandex.div.internal.widget.tabs.o;
import com.yandex.div.internal.widget.tabs.z;
import com.yandex.div2.AbstractC38330g;
import com.yandex.div2.DivAction;
import com.yandex.div2.DivTabs;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: DivTabsEventManager.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/div/core/view2/divs/tabs/l;", "Landroidx/viewpager/widget/ViewPager$i;", "Lcom/yandex/div/internal/widget/tabs/d$c;", "Lcom/yandex/div2/DivAction;", "a", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class l implements ViewPager.i, d.c<DivAction> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final C38029k f368807b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final C37955g f368808c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final InterfaceC37915j f368809d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final X f368810e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final z f368811f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public DivTabs f368812g;

    /* renamed from: h, reason: collision with root package name */
    public int f368813h = -1;

    /* compiled from: DivTabsEventManager.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/yandex/div/core/view2/divs/tabs/l$a;", "", "<init>", "()V", "", "NO_POSITION", "I", "", "TAG", "Ljava/lang/String;", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
    }

    public l(@Y61.k C38029k c38029k, @Y61.k C37955g c37955g, @Y61.k InterfaceC37915j interfaceC37915j, @Y61.k X x12, @Y61.k z zVar, @Y61.k DivTabs divTabs) {
        this.f368807b = c38029k;
        this.f368808c = c37955g;
        this.f368809d = interfaceC37915j;
        this.f368810e = x12;
        this.f368811f = zVar;
        this.f368812g = divTabs;
    }

    public final void a(int i12) {
        int i13 = this.f368813h;
        if (i12 == i13) {
            return;
        }
        X x12 = this.f368810e;
        C38029k c38029k = this.f368807b;
        z zVar = this.f368811f;
        if (i13 != -1) {
            AbstractC38330g abstractC38330g = this.f368812g.f372050o.get(i13).f372126a;
            x12.d(c38029k, null, abstractC38330g, C37931a.u(abstractC38330g.a()));
            c38029k.A(zVar.getViewPager());
        }
        DivTabs.f fVar = this.f368812g.f372050o.get(i12);
        o viewPager = zVar.getViewPager();
        AbstractC38330g abstractC38330g2 = fVar.f372126a;
        x12.d(c38029k, viewPager, abstractC38330g2, C37931a.u(abstractC38330g2.a()));
        c38029k.k(zVar.getViewPager(), fVar.f372126a);
        this.f368813h = i12;
    }

    @Override // androidx.viewpager.widget.ViewPager.i
    public final void b(int i12) {
        this.f368809d.getClass();
        InterfaceC37915j interfaceC37915j = InterfaceC37915j.f367563a;
        a(i12);
    }

    @Override // androidx.viewpager.widget.ViewPager.i
    public final void c(int i12) {
    }

    @Override // androidx.viewpager.widget.ViewPager.i
    public final void h(int i12, float f12, int i13) {
    }
}
