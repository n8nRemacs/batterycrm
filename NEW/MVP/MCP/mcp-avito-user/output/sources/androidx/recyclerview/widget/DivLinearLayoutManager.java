package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.div.core.view2.C38029k;
import com.yandex.div.core.view2.divs.gallery.a;
import com.yandex.div2.AbstractC38330g;
import com.yandex.div2.DivGallery;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: DivLinearLayoutManager.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Landroidx/recyclerview/widget/DivLinearLayoutManager;", "Landroidx/recyclerview/widget/LinearLayoutManager;", "Lcom/yandex/div/core/view2/divs/gallery/c;", "a", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes10.dex */
public final class DivLinearLayoutManager extends LinearLayoutManager implements com.yandex.div.core.view2.divs.gallery.c {

    /* renamed from: G, reason: collision with root package name */
    @Y61.k
    public final C38029k f53654G;

    /* renamed from: H, reason: collision with root package name */
    @Y61.k
    public final RecyclerView f53655H;

    /* renamed from: I, reason: collision with root package name */
    @Y61.k
    public final DivGallery f53656I;

    /* renamed from: J, reason: collision with root package name */
    @Y61.k
    public final HashSet<View> f53657J;

    /* compiled from: DivLinearLayoutManager.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/recyclerview/widget/DivLinearLayoutManager$a;", "Landroidx/recyclerview/widget/RecyclerView$n;", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class a extends RecyclerView.n {

        /* renamed from: f, reason: collision with root package name */
        public int f53658f;

        /* renamed from: g, reason: collision with root package name */
        public int f53659g;

        public a(@Y61.l ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f53658f = Integer.MAX_VALUE;
            this.f53659g = Integer.MAX_VALUE;
        }
    }

    public /* synthetic */ DivLinearLayoutManager(C38029k c38029k, RecyclerView recyclerView, DivGallery divGallery, int i12, int i13, C42822w c42822w) {
        this(c38029k, recyclerView, divGallery, (i13 & 8) != 0 ? 0 : i12);
    }

    @Override // com.yandex.div.core.view2.divs.gallery.c
    public final int A(@Y61.k View view) {
        return RecyclerView.m.t0(view);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final void C0(@Y61.k View view, int i12, int i13, int i14, int i15) {
        b(view, i12, i13, i14, i15, false);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final void D0(@Y61.k View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.DivLinearLayoutManager.DivRecyclerViewLayoutParams");
        }
        a aVar = (a) layoutParams;
        Rect rectZ = this.f53655H.Z(view);
        int i12 = com.yandex.div.core.view2.divs.gallery.c.i(this.f53850p, this.f53848n, rectZ.right + getPaddingRight() + getPaddingLeft() + ((ViewGroup.MarginLayoutParams) aVar).leftMargin + ((ViewGroup.MarginLayoutParams) aVar).rightMargin + rectZ.left, ((ViewGroup.MarginLayoutParams) aVar).width, aVar.f53659g, I());
        int i13 = com.yandex.div.core.view2.divs.gallery.c.i(this.f53851q, this.f53849o, getPaddingBottom() + getPaddingTop() + ((ViewGroup.MarginLayoutParams) aVar).topMargin + ((ViewGroup.MarginLayoutParams) aVar).bottomMargin + rectZ.top + rectZ.bottom, ((ViewGroup.MarginLayoutParams) aVar).height, aVar.f53658f, J());
        if (t1(view, i12, i13, aVar)) {
            view.measure(i12, i13);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final void H0(@Y61.k RecyclerView recyclerView) {
        int childCount = recyclerView.getChildCount();
        if (childCount <= 0) {
            return;
        }
        int i12 = 0;
        while (true) {
            int i13 = i12 + 1;
            r(recyclerView.getChildAt(i12), false);
            if (i13 >= childCount) {
                return;
            } else {
                i12 = i13;
            }
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.m
    public final void I0(@Y61.k RecyclerView recyclerView, @Y61.k RecyclerView.u uVar) {
        int childCount = recyclerView.getChildCount();
        if (childCount <= 0) {
            return;
        }
        int i12 = 0;
        while (true) {
            int i13 = i12 + 1;
            r(recyclerView.getChildAt(i12), true);
            if (i13 >= childCount) {
                return;
            } else {
                i12 = i13;
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final boolean K(@Y61.l RecyclerView.n nVar) {
        return nVar instanceof a;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.m
    public final void V0(@Y61.l RecyclerView.z zVar) {
        t();
        super.V0(zVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final void X(int i12) {
        super.X(i12);
        View viewC = C(i12);
        if (viewC == null) {
            return;
        }
        r(viewC, true);
    }

    @Override // com.yandex.div.core.view2.divs.gallery.c
    @Y61.k
    /* renamed from: a, reason: from getter */
    public final DivGallery getF368414P() {
        return this.f53656I;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.m
    @Y61.k
    public final RecyclerView.n a0() {
        a aVar = new a(-2, -2);
        aVar.f53658f = Integer.MAX_VALUE;
        aVar.f53659g = Integer.MAX_VALUE;
        return aVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    @Y61.k
    public final RecyclerView.n b0(@Y61.l Context context, @Y61.l AttributeSet attributeSet) {
        a aVar = new a(context, attributeSet);
        aVar.f53658f = Integer.MAX_VALUE;
        aVar.f53659g = Integer.MAX_VALUE;
        return aVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    @Y61.k
    public final RecyclerView.n c0(@Y61.l ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof a) {
            a aVar = (a) layoutParams;
            a aVar2 = new a((RecyclerView.n) aVar);
            aVar2.f53658f = Integer.MAX_VALUE;
            aVar2.f53659g = Integer.MAX_VALUE;
            aVar2.f53658f = aVar.f53658f;
            aVar2.f53659g = aVar.f53659g;
            return aVar2;
        }
        if (layoutParams instanceof RecyclerView.n) {
            a aVar3 = new a((RecyclerView.n) layoutParams);
            aVar3.f53658f = Integer.MAX_VALUE;
            aVar3.f53659g = Integer.MAX_VALUE;
            return aVar3;
        }
        if (layoutParams instanceof com.yandex.div.internal.widget.c) {
            return new a((ViewGroup.MarginLayoutParams) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new a((ViewGroup.MarginLayoutParams) layoutParams);
        }
        a aVar4 = new a(layoutParams);
        aVar4.f53658f = Integer.MAX_VALUE;
        aVar4.f53659g = Integer.MAX_VALUE;
        return aVar4;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final void c1(@Y61.k RecyclerView.u uVar) {
        RecyclerView f53655h = getF368413O();
        int childCount = f53655h.getChildCount();
        if (childCount > 0) {
            int i12 = 0;
            while (true) {
                int i13 = i12 + 1;
                r(f53655h.getChildAt(i12), true);
                if (i13 >= childCount) {
                    break;
                } else {
                    i12 = i13;
                }
            }
        }
        super.c1(uVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final void f1(@Y61.k View view) {
        super.f1(view);
        r(view, true);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final void g1(int i12) {
        super.g1(i12);
        View viewC = C(i12);
        if (viewC == null) {
            return;
        }
        r(viewC, true);
    }

    @Override // com.yandex.div.core.view2.divs.gallery.c
    @Y61.k
    /* renamed from: getView, reason: from getter */
    public final RecyclerView getF368413O() {
        return this.f53655H;
    }

    @Override // com.yandex.div.core.view2.divs.gallery.c
    /* renamed from: h, reason: from getter */
    public final HashSet getF368415Q() {
        return this.f53657J;
    }

    @Override // com.yandex.div.core.view2.divs.gallery.c
    public final void j(@Y61.k View view, int i12, int i13, int i14, int i15) {
        super.C0(view, i12, i13, i14, i15);
    }

    @Override // com.yandex.div.core.view2.divs.gallery.c
    @Y61.k
    public final List<AbstractC38330g> k() {
        RecyclerView.Adapter adapter = this.f53655H.getAdapter();
        a.C10874a c10874a = adapter instanceof a.C10874a ? (a.C10874a) adapter : null;
        ArrayList arrayList = c10874a != null ? c10874a.f368845d : null;
        return arrayList == null ? this.f53656I.f371520r : arrayList;
    }

    @Override // com.yandex.div.core.view2.divs.gallery.c
    public final int n() {
        return this.f53690r;
    }

    @Override // com.yandex.div.core.view2.divs.gallery.c
    public final void v(int i12) {
        z(i12, 0);
    }

    @Override // com.yandex.div.core.view2.divs.gallery.c
    @Y61.k
    /* renamed from: w, reason: from getter */
    public final C38029k getF368412N() {
        return this.f53654G;
    }

    @Override // com.yandex.div.core.view2.divs.gallery.c
    public final int width() {
        return this.f53850p;
    }

    @Override // com.yandex.div.core.view2.divs.gallery.c
    public final void y(int i12, int i13) {
        z(i12, i13);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DivLinearLayoutManager(@Y61.k C38029k c38029k, @Y61.k RecyclerView recyclerView, @Y61.k DivGallery divGallery, int i12) {
        super(i12, false);
        recyclerView.getContext();
        this.f53654G = c38029k;
        this.f53655H = recyclerView;
        this.f53656I = divGallery;
        this.f53657J = new HashSet<>();
    }
}
