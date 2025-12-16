package com.yandex.div.core.view2.divs;

import androidx.viewpager2.widget.ViewPager2;
import com.yandex.div.core.view2.C38029k;
import com.yandex.div2.DivAction;
import com.yandex.div2.DivPager;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42754k;

/* compiled from: PagerSelectedActionsDispatcher.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/yandex/div/core/view2/divs/E2;", "", "a", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class E2 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final C38029k f368050a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final DivPager f368051b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final C37955g f368052c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public ViewPager2.i f368053d;

    /* compiled from: PagerSelectedActionsDispatcher.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/div/core/view2/divs/E2$a;", "Landroidx/viewpager2/widget/ViewPager2$i;", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public final class a extends ViewPager2.i {

        /* renamed from: d, reason: collision with root package name */
        public int f368054d = -1;

        /* renamed from: e, reason: collision with root package name */
        @Y61.k
        public final C42754k<Integer> f368055e = new C42754k<>();

        public a() {
        }

        public final void a() {
            while (true) {
                C42754k<Integer> c42754k = this.f368055e;
                if (c42754k.isEmpty()) {
                    return;
                }
                int iIntValue = c42754k.removeFirst().intValue();
                int i12 = com.yandex.div.internal.p.f370124a;
                E2 e22 = E2.this;
                List<DivAction> listQ = e22.f368051b.f371819o.get(iIntValue).a().q();
                if (listQ != null) {
                    e22.f368050a.m(new F2(listQ, e22));
                }
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.i
        public final void onPageScrollStateChanged(int i12) {
            if (i12 == 0) {
                a();
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.i
        public final void onPageSelected(int i12) {
            int i13 = com.yandex.div.internal.p.f370124a;
            if (this.f368054d == i12) {
                return;
            }
            this.f368055e.add(Integer.valueOf(i12));
            if (this.f368054d == -1) {
                a();
            }
            this.f368054d = i12;
        }
    }

    public E2(@Y61.k C38029k c38029k, @Y61.k DivPager divPager, @Y61.k C37955g c37955g) {
        this.f368050a = c38029k;
        this.f368051b = divPager;
        this.f368052c = c37955g;
    }
}
