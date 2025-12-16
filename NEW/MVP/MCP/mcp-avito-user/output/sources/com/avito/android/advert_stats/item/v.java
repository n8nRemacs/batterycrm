package com.avito.android.advert_stats.item;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: PlotItemView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert_stats/item/v;", "Lcom/avito/android/advert_stats/item/u;", "Lcom/avito/konveyor/adapter/b;", "_avito_advert-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class v extends com.avito.konveyor.adapter.b implements u {

    /* renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ int f86811o = 0;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.konveyor.adapter.a f86812b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28333l f86813c;

    /* renamed from: d, reason: collision with root package name */
    public final RecyclerView f86814d;

    /* renamed from: e, reason: collision with root package name */
    public final DaysView f86815e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final LinearLayoutManager f86816f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public Y41.l<? super Boolean, G0> f86817g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public Y41.l<? super Integer, G0> f86818h;

    /* renamed from: i, reason: collision with root package name */
    public int f86819i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f86820j;

    /* renamed from: k, reason: collision with root package name */
    public int f86821k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f86822l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public ib.e f86823m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final a f86824n;

    /* compiled from: PlotItemView.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/advert_stats/item/v$a", "Landroidx/recyclerview/widget/RecyclerView$r;", "_avito_advert-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a extends RecyclerView.r {
        public a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.r
        public final void i(int i12, @Y61.k RecyclerView recyclerView) {
            Y41.l<? super Boolean, G0> lVar;
            v vVar = v.this;
            vVar.f86821k = i12;
            LinearLayoutManager linearLayoutManager = vVar.f86816f;
            boolean z12 = linearLayoutManager.H1() == 0 || linearLayoutManager.H1() == linearLayoutManager.o0() - 1;
            if (i12 != 0) {
                if (i12 != 1) {
                    return;
                }
                if (z12 && vVar.f86820j) {
                    return;
                }
                Y41.l<? super Boolean, G0> lVar2 = vVar.f86817g;
                if (lVar2 != null) {
                    ((r) lVar2).invoke(Boolean.FALSE);
                }
                vVar.f86822l = false;
                return;
            }
            if (!vVar.f86820j && (lVar = vVar.f86817g) != null) {
                ((r) lVar).invoke(Boolean.TRUE);
            }
            int iM1 = linearLayoutManager.M1();
            View viewZ = linearLayoutManager.Z(iM1);
            if ((viewZ != null ? viewZ.getRight() : -1) < vVar.f86814d.getWidth() / 2) {
                iM1--;
            }
            if (!vVar.f86822l) {
                Y41.l<? super Integer, G0> lVar3 = vVar.f86818h;
                if (lVar3 != null) {
                    ((C28338q) lVar3).invoke(Integer.valueOf(iM1));
                }
                vVar.f86822l = true;
            }
            vVar.f86820j = true;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.r
        public final void k(@Y61.k RecyclerView recyclerView, int i12, int i13) {
            int i14 = v.f86811o;
            v vVar = v.this;
            vVar.getClass();
            View viewZ = vVar.f86816f.Z(vVar.f86816f.K1());
            if (viewZ == null) {
                return;
            }
            int left = viewZ.getLeft();
            int i15 = vVar.f86819i;
            boolean z12 = left != i15 && i15 >= 0;
            if (z12 && vVar.f86821k == 1) {
                Y41.l<? super Boolean, G0> lVar = vVar.f86817g;
                if (lVar != null) {
                    lVar.invoke(Boolean.FALSE);
                }
                vVar.f86822l = false;
            }
            vVar.f86819i = left;
            vVar.f86820j = !z12;
        }
    }

    /* compiled from: PlotItemView.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/advert_stats/item/v$b", "Lcom/avito/android/advert_stats/item/x;", "_avito_advert-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b implements x {
        public b() {
        }

        @Override // com.avito.android.advert_stats.item.x
        public final void a(int i12) {
            v vVar = v.this;
            if (vVar.f86822l) {
                return;
            }
            Y41.l<? super Integer, G0> lVar = vVar.f86818h;
            if (lVar != null) {
                ((C28338q) lVar).invoke(Integer.valueOf(i12));
            }
            vVar.f86822l = true;
        }
    }

    public v(@Y61.k com.avito.konveyor.adapter.a aVar, @Y61.k View view, @Y61.k com.avito.konveyor.a aVar2, @Y61.k InterfaceC28333l interfaceC28333l) {
        super(view);
        this.f86812b = aVar;
        this.f86813c = interfaceC28333l;
        b bVar = new b();
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.week_recycler);
        this.f86814d = recyclerView;
        DaysView daysView = (DaysView) view.findViewById(R.id.days_view);
        this.f86815e = daysView;
        this.f86816f = (LinearLayoutManager) recyclerView.getLayoutManager();
        y yVar = new y(bVar);
        this.f86819i = -1;
        this.f86822l = true;
        this.f86823m = new ib.e(recyclerView.getContext(), interfaceC28333l.a(), false, null, 8, null);
        this.f86824n = new a();
        recyclerView.setItemAnimator(null);
        recyclerView.setAdapter(new com.avito.konveyor.adapter.j(aVar, aVar2));
        yVar.b(recyclerView);
        daysView.setDayWidth(interfaceC28333l.d());
        ((ViewGroup.MarginLayoutParams) daysView.getLayoutParams()).leftMargin = interfaceC28333l.a();
    }

    @Override // com.avito.android.advert_stats.item.u
    public final void Gb(@Y61.k Y41.l<? super Boolean, G0> lVar) {
        this.f86817g = lVar;
    }

    @Override // com.avito.android.advert_stats.item.u
    public final void N(int i12) {
        RecyclerView recyclerView = this.f86814d;
        recyclerView.getLayoutParams().height = i12;
        recyclerView.requestLayout();
    }

    @Override // com.avito.android.advert_stats.item.u
    public final void P4(int i12) {
        this.f86816f.b2(i12, this.f86813c.a());
    }

    @Override // com.avito.android.advert_stats.item.u
    public final void Zq() {
        DaysView daysView = this.f86815e;
        View childAt = daysView.getChildAt(daysView.f86686e);
        if (childAt != null) {
            ((TextView) childAt).setTextColor(daysView.f86683b);
            daysView.f86686e = -1;
        }
    }

    @Override // com.avito.android.advert_stats.item.u
    public final void id(@Y61.k List<O> list, boolean z12) {
        RecyclerView recyclerView = this.f86814d;
        a aVar = this.f86824n;
        recyclerView.v0(aVar);
        recyclerView.o(aVar);
        recyclerView.r0(this.f86823m);
        ib.e eVar = new ib.e(recyclerView.getContext(), this.f86813c.a(), z12, null, 8, null);
        this.f86823m = eVar;
        recyclerView.l(eVar, -1);
        this.f86812b.c(new UV0.c(list));
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        if (adapter != null) {
            adapter.notifyDataSetChanged();
        }
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        this.f86814d.v0(this.f86824n);
    }

    @Override // com.avito.android.advert_stats.item.u
    public final void ld(@Y61.k Y41.l<? super Integer, G0> lVar) {
        this.f86818h = lVar;
    }

    @Override // com.avito.android.advert_stats.item.u
    public final void mU(int i12, boolean z12) {
        DaysView daysView = this.f86815e;
        View childAt = daysView.getChildAt(daysView.f86686e);
        int i13 = daysView.f86683b;
        if (childAt != null) {
            ((TextView) childAt).setTextColor(i13);
        }
        View childAt2 = daysView.getChildAt(i12);
        if (childAt2 != null) {
            TextView textView = (TextView) childAt2;
            if (z12) {
                i13 = daysView.f86684c;
            }
            textView.setTextColor(i13);
        }
        if (!z12) {
            i12 = -1;
        }
        daysView.f86686e = i12;
    }
}
