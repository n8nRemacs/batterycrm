package com.yandex.div.core.view2.divs.gallery;

import Y61.k;
import Y61.l;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.yandex.div.core.view2.C38029k;
import com.yandex.div.core.view2.divs.C37931a;
import com.yandex.div.core.view2.divs.gallery.a;
import com.yandex.div.internal.n;
import com.yandex.div2.AbstractC38330g;
import com.yandex.div2.DivGallery;
import com.yandex.div2.K5;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: DivGridLayoutManager.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/yandex/div/core/view2/divs/gallery/DivGridLayoutManager;", "Landroidx/recyclerview/widget/StaggeredGridLayoutManager;", "Lcom/yandex/div/core/view2/divs/gallery/c;", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class DivGridLayoutManager extends StaggeredGridLayoutManager implements c {

    /* renamed from: N, reason: collision with root package name */
    @k
    public final C38029k f368412N;

    /* renamed from: O, reason: collision with root package name */
    @k
    public final RecyclerView f368413O;

    /* renamed from: P, reason: collision with root package name */
    @k
    public final DivGallery f368414P;

    /* renamed from: Q, reason: collision with root package name */
    @k
    public final HashSet<View> f368415Q;

    public /* synthetic */ DivGridLayoutManager(C38029k c38029k, RecyclerView recyclerView, DivGallery divGallery, int i12, int i13, C42822w c42822w) {
        this(c38029k, recyclerView, divGallery, (i13 & 8) != 0 ? 0 : i12);
    }

    @Override // com.yandex.div.core.view2.divs.gallery.c
    public final int A(@k View view) {
        return RecyclerView.m.t0(view);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final void C0(@k View view, int i12, int i13, int i14, int i15) {
        b(view, i12, i13, i14, i15, false);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final void H0(@k RecyclerView recyclerView) {
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

    @Override // androidx.recyclerview.widget.StaggeredGridLayoutManager, androidx.recyclerview.widget.RecyclerView.m
    public final void I0(@k RecyclerView recyclerView, @k RecyclerView.u uVar) {
        super.I0(recyclerView, uVar);
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

    @Override // androidx.recyclerview.widget.StaggeredGridLayoutManager, androidx.recyclerview.widget.RecyclerView.m
    public final void V0(@l RecyclerView.z zVar) {
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
    @k
    /* renamed from: a, reason: from getter */
    public final DivGallery getF368414P() {
        return this.f368414P;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final void c1(@k RecyclerView.u uVar) {
        RecyclerView f368413o = getF368413O();
        int childCount = f368413o.getChildCount();
        if (childCount > 0) {
            int i12 = 0;
            while (true) {
                int i13 = i12 + 1;
                r(f368413o.getChildAt(i12), true);
                if (i13 >= childCount) {
                    break;
                } else {
                    i12 = i13;
                }
            }
        }
        super.c1(uVar);
    }

    @Override // com.yandex.div.core.view2.divs.gallery.c
    public final int f() {
        int iO02 = o0();
        int[] iArr = new int[iO02];
        H1(iArr);
        if (iO02 != 0) {
            return iArr[0];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final void f1(@k View view) {
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

    public final int g2() {
        return C37931a.o(this.f368414P.f371519q.a(this.f368412N.getExpressionResolver()), this.f368413O.getResources().getDisplayMetrics());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final int getPaddingBottom() {
        return super.getPaddingBottom() - (g2() / 2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final int getPaddingLeft() {
        return super.getPaddingLeft() - (g2() / 2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final int getPaddingRight() {
        return super.getPaddingRight() - (g2() / 2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final int getPaddingTop() {
        return super.getPaddingTop() - (g2() / 2);
    }

    @Override // com.yandex.div.core.view2.divs.gallery.c
    @k
    /* renamed from: getView, reason: from getter */
    public final RecyclerView getF368413O() {
        return this.f368413O;
    }

    @Override // com.yandex.div.core.view2.divs.gallery.c
    /* renamed from: h, reason: from getter */
    public final HashSet getF368415Q() {
        return this.f368415Q;
    }

    @Override // com.yandex.div.core.view2.divs.gallery.c
    public final void j(@k View view, int i12, int i13, int i14, int i15) {
        super.C0(view, i12, i13, i14, i15);
    }

    @Override // com.yandex.div.core.view2.divs.gallery.c
    @k
    public final List<AbstractC38330g> k() {
        RecyclerView.Adapter adapter = this.f368413O.getAdapter();
        a.C10874a c10874a = adapter instanceof a.C10874a ? (a.C10874a) adapter : null;
        ArrayList arrayList = c10874a != null ? c10874a.f368845d : null;
        return arrayList == null ? this.f368414P.f371520r : arrayList;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final int k0(@k View view) {
        boolean z12 = this.f368414P.f371520r.get(RecyclerView.m.t0(view)).a().getF374831r() instanceof K5.c;
        int iG2 = 0;
        boolean z13 = this.f53918r > 1;
        int iK02 = super.k0(view);
        if (z12 && z13) {
            iG2 = g2();
        }
        return iK02 + iG2;
    }

    @Override // com.yandex.div.core.view2.divs.gallery.c
    public final int l() {
        int iO02 = o0();
        int[] iArr = new int[iO02];
        I1(iArr);
        if (iO02 != 0) {
            return iArr[iO02 - 1];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final int l0(@k View view) {
        boolean z12 = this.f368414P.f371520r.get(RecyclerView.m.t0(view)).a().getF374813I() instanceof K5.c;
        int iG2 = 0;
        boolean z13 = this.f53918r > 1;
        int iL02 = super.l0(view);
        if (z12 && z13) {
            iG2 = g2();
        }
        return iL02 + iG2;
    }

    @Override // com.yandex.div.core.view2.divs.gallery.c
    public final int n() {
        return this.f53922v;
    }

    @Override // com.yandex.div.core.view2.divs.gallery.c
    public final void v(int i12) {
        z(i12, 0);
    }

    @Override // com.yandex.div.core.view2.divs.gallery.c
    @k
    /* renamed from: w, reason: from getter */
    public final C38029k getF368412N() {
        return this.f368412N;
    }

    @Override // com.yandex.div.core.view2.divs.gallery.c
    public final int width() {
        return this.f53850p;
    }

    @Override // com.yandex.div.core.view2.divs.gallery.c
    public final void y(int i12, int i13) {
        z(i12, i13);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public DivGridLayoutManager(@k C38029k c38029k, @k RecyclerView recyclerView, @k DivGallery divGallery, int i12) {
        Long lA2;
        int i13;
        com.yandex.div.json.expressions.b<Long> bVar = divGallery.f371509g;
        int i14 = 1;
        if (bVar != null && (lA2 = bVar.a(c38029k.getExpressionResolver())) != null) {
            long jLongValue = lA2.longValue();
            long j12 = jLongValue >> 31;
            if (j12 == 0 || j12 == -1) {
                i13 = (int) jLongValue;
            } else {
                int i15 = n.f370123a;
                i13 = jLongValue > 0 ? Integer.MAX_VALUE : BeduinInputModel.MIN_TEXT_VERSION;
            }
            i14 = i13;
        }
        super(i14, i12);
        this.f368412N = c38029k;
        this.f368413O = recyclerView;
        this.f368414P = divGallery;
        this.f368415Q = new HashSet<>();
    }
}
