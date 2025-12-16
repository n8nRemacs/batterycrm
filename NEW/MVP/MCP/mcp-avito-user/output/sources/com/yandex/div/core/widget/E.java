package com.yandex.div.core.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.core.view.C22829k0;
import androidx.core.view.C22833m0;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import java.util.Iterator;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;

/* compiled from: ViewPager2Wrapper.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0007\b\u0010\u0018\u00002\u00020\u0001J\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\f\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR$\u0010\u0013\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Lcom/yandex/div/core/widget/E;", "Landroid/widget/FrameLayout;", "Landroidx/recyclerview/widget/RecyclerView$t;", "viewPool", "Lkotlin/G0;", "setRecycledViewPool", "(Landroidx/recyclerview/widget/RecyclerView$t;)V", "Landroidx/viewpager2/widget/ViewPager2;", "b", "Landroidx/viewpager2/widget/ViewPager2;", "getViewPager", "()Landroidx/viewpager2/widget/ViewPager2;", "viewPager", "", "value", "getOrientation", "()I", "setOrientation", "(I)V", "orientation", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public class E extends FrameLayout {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    public final ViewPager2 viewPager;

    /* compiled from: ViewPager2Wrapper.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/recyclerview/widget/RecyclerView;", "Lkotlin/G0;", "invoke", "(Landroidx/recyclerview/widget/RecyclerView;)V", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends N implements Y41.l<RecyclerView, G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f369243l = new a();

        public a() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(RecyclerView recyclerView) {
            RecyclerView recyclerView2 = recyclerView;
            recyclerView2.getRecycledViewPool().a();
            Iterator<View> it = new C22829k0(recyclerView2).iterator();
            while (true) {
                C22833m0 c22833m0 = (C22833m0) it;
                if (!c22833m0.hasNext()) {
                    return G0.f406611a;
                }
                View view = (View) c22833m0.next();
                view.setTranslationX(0.0f);
                view.setTranslationY(0.0f);
            }
        }
    }

    /* compiled from: ViewPager2Wrapper.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/recyclerview/widget/RecyclerView;", "Lkotlin/G0;", "invoke", "(Landroidx/recyclerview/widget/RecyclerView;)V", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends N implements Y41.l<RecyclerView, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ RecyclerView.t f369244l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(RecyclerView.t tVar) {
            super(1);
            this.f369244l = tVar;
        }

        @Override // Y41.l
        public final G0 invoke(RecyclerView recyclerView) {
            recyclerView.setRecycledViewPool(this.f369244l);
            return G0.f406611a;
        }
    }

    public /* synthetic */ E(Context context, AttributeSet attributeSet, int i12, int i13, C42822w c42822w) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i12);
    }

    public final int getOrientation() {
        return getViewPager().getOrientation();
    }

    @Y61.k
    public ViewPager2 getViewPager() {
        return this.viewPager;
    }

    public final void setOrientation(int i12) {
        if (getViewPager().getOrientation() == i12) {
            return;
        }
        getViewPager().setOrientation(i12);
        a aVar = a.f369243l;
        View childAt = getViewPager().getChildAt(0);
        RecyclerView recyclerView = childAt instanceof RecyclerView ? (RecyclerView) childAt : null;
        if (recyclerView == null) {
            return;
        }
        aVar.invoke(recyclerView);
    }

    public final void setRecycledViewPool(@Y61.k RecyclerView.t viewPool) {
        b bVar = new b(viewPool);
        View childAt = getViewPager().getChildAt(0);
        RecyclerView recyclerView = childAt instanceof RecyclerView ? (RecyclerView) childAt : null;
        if (recyclerView == null) {
            return;
        }
        bVar.invoke(recyclerView);
    }

    @X41.j
    public E(@Y61.k Context context, @Y61.l AttributeSet attributeSet, int i12) {
        super(context, attributeSet, i12);
        ViewPager2 viewPager2 = new ViewPager2(context);
        viewPager2.setDescendantFocusability(393216);
        this.viewPager = viewPager2;
        super.addView(getViewPager());
    }
}
