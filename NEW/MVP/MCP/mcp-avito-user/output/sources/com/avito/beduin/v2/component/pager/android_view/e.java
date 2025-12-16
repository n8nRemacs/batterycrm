package com.avito.beduin.v2.component.pager.android_view;

import Y61.k;
import Y61.l;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.RunnableC22211b;
import androidx.core.view.A0;
import androidx.core.view.C22823h0;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.avito.beduin.v2.component.common.Orientation;
import com.avito.beduin.v2.component.pager.android_view.b;
import com.avito.beduin.v2.component.scroll_container.state.d;
import com.avito.beduin.v2.engine.component.InterfaceC36249i;
import com.avito.beduin.v2.render.android_view.A;
import com.avito.beduin.v2.render.android_view.AbstractC36333c;
import com.avito.beduin.v2.render.android_view.M;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.L;

/* compiled from: PagerComponent.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/beduin/v2/component/pager/android_view/e;", "Lcom/avito/beduin/v2/render/android_view/c;", "Lcom/avito/beduin/v2/component/scroll_container/state/d;", "Landroidx/viewpager2/widget/ViewPager2;", "android-view_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class e extends AbstractC36333c<com.avito.beduin.v2.component.scroll_container.state.d, ViewPager2> {

    /* renamed from: m, reason: collision with root package name */
    @k
    public final A f336134m;

    /* renamed from: n, reason: collision with root package name */
    @k
    public final Orientation f336135n;

    /* renamed from: o, reason: collision with root package name */
    public b f336136o;

    /* renamed from: p, reason: collision with root package name */
    @l
    public InterfaceC36249i f336137p;

    /* renamed from: q, reason: collision with root package name */
    @l
    public Y41.l<? super Integer, G0> f336138q;

    /* compiled from: PagerComponent.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[Orientation.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                Orientation orientation = Orientation.f335659b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public e(@k A a12, @k Orientation orientation) {
        super(null, 1, 0 == true ? 1 : 0);
        this.f336134m = a12;
        this.f336135n = orientation;
    }

    @Override // com.avito.beduin.v2.render.android_view.AbstractC36333c
    public final void l(View view, com.avito.beduin.v2.theme.k kVar, com.avito.beduin.v2.component.scroll_container.state.d dVar) {
        final ViewPager2 viewPager2 = (ViewPager2) view;
        com.avito.beduin.v2.component.scroll_container.state.d dVar2 = dVar;
        ET0.b bVar = dVar2.f336198f;
        final int iB2 = ET0.d.b(viewPager2.getResources(), bVar != null ? bVar.f4017b : 0);
        final int iB3 = ET0.d.b(viewPager2.getResources(), bVar != null ? bVar.f4016a : 0);
        final int iB4 = ET0.d.b(viewPager2.getResources(), bVar != null ? bVar.f4019d : 0);
        final int iB5 = ET0.d.b(viewPager2.getResources(), bVar != null ? bVar.f4018c : 0);
        final int iB6 = ET0.d.b(viewPager2.getResources(), dVar2.f336196d.intValue());
        boolean zF2 = L.f(this.f336137p, k());
        b bVar2 = this.f336136o;
        if (bVar2 == null) {
            bVar2 = null;
        }
        f fVar = new f(viewPager2, dVar2, zF2);
        bVar2.f336117g = kVar;
        bVar2.f336119i = iB3;
        bVar2.f336120j = iB2;
        bVar2.f336121k = iB4;
        bVar2.f336122l = iB5;
        b.a aVar = bVar2.f336116f;
        aVar.f335700d = aVar.f335699c;
        aVar.f335699c = kVar;
        ArrayList arrayList = new ArrayList();
        Iterator it = dVar2.f336193a.f4014b.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (((d.a) next).f336205b.f336209d) {
                arrayList.add(next);
            }
        }
        bVar2.l(arrayList, new RunnableC22211b(14, fVar));
        viewPager2.setOffscreenPageLimit(3);
        Orientation orientation = Orientation.f335659b;
        Orientation orientation2 = this.f336135n;
        if (orientation2 == orientation) {
            viewPager2.setPageTransformer(new ViewPager2.l() { // from class: com.avito.beduin.v2.component.pager.android_view.c
                @Override // androidx.viewpager2.widget.ViewPager2.l
                public final void a(View view2, float f12) {
                    int i12 = (iB3 + iB2) - iB6;
                    WeakHashMap<View, A0> weakHashMap = C22823h0.f45055a;
                    if (viewPager2.getLayoutDirection() == 1) {
                        view2.setTranslationX(i12 * f12);
                    } else {
                        view2.setTranslationX((-i12) * f12);
                    }
                }
            });
        } else if (orientation2 == Orientation.f335660c) {
            viewPager2.setPageTransformer(new ViewPager2.l() { // from class: com.avito.beduin.v2.component.pager.android_view.d
                @Override // androidx.viewpager2.widget.ViewPager2.l
                public final void a(View view2, float f12) {
                    view2.setTranslationY((-((iB4 + iB5) - iB6)) * f12);
                }
            });
        }
        viewPager2.setBackgroundColor(t(dVar2.f336194b));
        Y41.l<Integer, G0> lVar = dVar2.f336195c;
        this.f336138q = lVar != null ? new g(lVar) : null;
        M.a(viewPager2, dVar2.f336200h);
        this.f336137p = k();
    }

    @Override // com.avito.beduin.v2.render.android_view.AbstractC36333c
    public final View n(ViewGroup viewGroup) {
        int i12;
        b.a aVar = new b.a();
        A a12 = this.f336134m;
        this.f336136o = new b(a12, aVar);
        ViewPager2 viewPager2 = new ViewPager2(viewGroup.getContext());
        int iOrdinal = this.f336135n.ordinal();
        if (iOrdinal != 0) {
            i12 = 1;
            if (iOrdinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
        } else {
            i12 = 0;
        }
        viewPager2.setOrientation(i12);
        b bVar = this.f336136o;
        if (bVar == null) {
            bVar = null;
        }
        viewPager2.setAdapter(bVar);
        View childAt = viewPager2.getChildAt(0);
        RecyclerView recyclerView = childAt instanceof RecyclerView ? (RecyclerView) childAt : null;
        if (recyclerView != null && a12.f337909e.f57087a) {
            recyclerView.addOnLayoutChangeListener(new ET0.j(0));
            ET0.l.a(recyclerView);
        }
        viewPager2.e(new h(this));
        C22823h0.J(viewPager2.getChildAt(0), false);
        return viewPager2;
    }
}
