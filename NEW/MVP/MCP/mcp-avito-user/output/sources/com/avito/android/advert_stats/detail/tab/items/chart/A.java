package com.avito.android.advert_stats.detail.tab.items.chart;

import android.content.res.Resources;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: StatsPlotView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert_stats/detail/tab/items/chart/A;", "Lcom/avito/android/advert_stats/detail/tab/items/chart/z;", "Lcom/avito/konveyor/adapter/b;", "_avito_advert-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class A extends com.avito.konveyor.adapter.b implements z {

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ int f86266n = 0;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.konveyor.adapter.a f86267b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final r f86268c;

    /* renamed from: d, reason: collision with root package name */
    public final RecyclerView f86269d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final LinearLayoutManager f86270e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public Y41.l<? super Boolean, G0> f86271f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public Y41.l<? super Integer, G0> f86272g;

    /* renamed from: h, reason: collision with root package name */
    public int f86273h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f86274i;

    /* renamed from: j, reason: collision with root package name */
    public int f86275j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f86276k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public ib.e f86277l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final a f86278m;

    /* compiled from: StatsPlotView.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/advert_stats/detail/tab/items/chart/A$a", "Landroidx/recyclerview/widget/RecyclerView$r;", "_avito_advert-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a extends RecyclerView.r {
        public a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.r
        public final void i(int i12, @Y61.k RecyclerView recyclerView) {
            Y41.l<? super Boolean, G0> lVar;
            A a12 = A.this;
            a12.f86275j = i12;
            LinearLayoutManager linearLayoutManager = a12.f86270e;
            boolean z12 = linearLayoutManager.H1() == 0 || linearLayoutManager.H1() == linearLayoutManager.o0() - 1;
            if (i12 != 0) {
                if (i12 != 1) {
                    return;
                }
                if (z12 && a12.f86274i) {
                    return;
                }
                Y41.l<? super Boolean, G0> lVar2 = a12.f86271f;
                if (lVar2 != null) {
                    ((w) lVar2).invoke(Boolean.FALSE);
                }
                a12.f86276k = false;
                return;
            }
            if (!a12.f86274i && (lVar = a12.f86271f) != null) {
                ((w) lVar).invoke(Boolean.TRUE);
            }
            int iM1 = linearLayoutManager.M1();
            View viewZ = linearLayoutManager.Z(iM1);
            if ((viewZ != null ? viewZ.getRight() : -1) < a12.f86269d.getWidth() / 2) {
                iM1--;
            }
            if (!a12.f86276k) {
                Y41.l<? super Integer, G0> lVar3 = a12.f86272g;
                if (lVar3 != null) {
                    ((v) lVar3).invoke(Integer.valueOf(iM1));
                }
                a12.f86276k = true;
            }
            a12.f86274i = true;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.r
        public final void k(@Y61.k RecyclerView recyclerView, int i12, int i13) {
            int i14 = A.f86266n;
            A a12 = A.this;
            a12.getClass();
            View viewZ = a12.f86270e.Z(a12.f86270e.K1());
            if (viewZ == null) {
                return;
            }
            int left = viewZ.getLeft();
            int i15 = a12.f86273h;
            boolean z12 = left != i15 && i15 >= 0;
            if (z12 && a12.f86275j == 1) {
                Y41.l<? super Boolean, G0> lVar = a12.f86271f;
                if (lVar != null) {
                    lVar.invoke(Boolean.FALSE);
                }
                a12.f86276k = false;
            }
            a12.f86273h = left;
            a12.f86274i = !z12;
        }
    }

    /* compiled from: StatsPlotView.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/advert_stats/detail/tab/items/chart/A$b", "Lcom/avito/android/advert_stats/item/x;", "_avito_advert-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b implements com.avito.android.advert_stats.item.x {
        public b() {
        }

        @Override // com.avito.android.advert_stats.item.x
        public final void a(int i12) {
            A a12 = A.this;
            if (a12.f86276k) {
                return;
            }
            Y41.l<? super Integer, G0> lVar = a12.f86272g;
            if (lVar != null) {
                ((v) lVar).invoke(Integer.valueOf(i12));
            }
            a12.f86276k = true;
        }
    }

    public A(@Y61.k View view, @Y61.k com.avito.konveyor.a aVar, @Y61.k com.avito.konveyor.adapter.a aVar2, @Y61.k r rVar) {
        super(view);
        this.f86267b = aVar2;
        this.f86268c = rVar;
        b bVar = new b();
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.period_recycler_item);
        this.f86269d = recyclerView;
        this.f86270e = (LinearLayoutManager) recyclerView.getLayoutManager();
        com.avito.android.advert_stats.item.y yVar = new com.avito.android.advert_stats.item.y(bVar);
        this.f86273h = -1;
        this.f86276k = true;
        this.f86277l = B80(false);
        this.f86278m = new a();
        recyclerView.setItemAnimator(null);
        recyclerView.setAdapter(new com.avito.konveyor.adapter.j(aVar2, aVar));
        yVar.b(recyclerView);
    }

    public final ib.e B80(boolean z12) throws Resources.NotFoundException {
        RecyclerView recyclerView = this.f86269d;
        return new ib.e(recyclerView.getContext(), this.f86268c.a(), z12, Integer.valueOf(recyclerView.getContext().getResources().getDimensionPixelSize(R.dimen.divider_bottom_padding)));
    }

    @Override // com.avito.android.advert_stats.detail.tab.items.chart.z
    public final void Gb(@Y61.k Y41.l<? super Boolean, G0> lVar) {
        this.f86271f = lVar;
    }

    @Override // com.avito.android.advert_stats.detail.tab.items.chart.z
    public final void N(int i12) {
        RecyclerView recyclerView = this.f86269d;
        recyclerView.getLayoutParams().height = i12;
        recyclerView.requestLayout();
    }

    @Override // com.avito.android.advert_stats.detail.tab.items.chart.z
    public final void P4(int i12) {
        if (this.f86276k) {
            this.f86270e.b2(i12, this.f86268c.a());
        }
    }

    @Override // com.avito.android.advert_stats.detail.tab.items.chart.z
    public final void id(@Y61.k List<StatsPeriodItem> list, boolean z12) throws Resources.NotFoundException {
        RecyclerView recyclerView = this.f86269d;
        a aVar = this.f86278m;
        recyclerView.v0(aVar);
        recyclerView.o(aVar);
        recyclerView.r0(this.f86277l);
        ib.e eVarB80 = B80(z12);
        this.f86277l = eVarB80;
        recyclerView.l(eVarB80, -1);
        this.f86267b.c(new UV0.c(list));
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        if (adapter != null) {
            adapter.notifyDataSetChanged();
        }
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        this.f86269d.v0(this.f86278m);
    }

    @Override // com.avito.android.advert_stats.detail.tab.items.chart.z
    public final void ld(@Y61.k Y41.l<? super Integer, G0> lVar) {
        this.f86272g = lVar;
    }
}
