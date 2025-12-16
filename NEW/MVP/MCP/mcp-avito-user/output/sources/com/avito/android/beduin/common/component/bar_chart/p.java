package com.avito.android.beduin.common.component.bar_chart;

import Kh.C14314a;
import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.beduin.common.component.bar_chart.column.BarChartColumnItem;
import com.avito.android.beduin_shared.model.action.custom.BeduinScrollPosition;
import com.avito.android.util.C35976x4;
import com.avito.konveyor.a;
import com.avito.konveyor.exception.BlueprintCollisionException;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import kotlin.ranges.s;

/* compiled from: BeduinBarChartView.kt */
@s0
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u0014H\u0007¢\u0006\u0004\b\u0016\u0010\u0017J0\u0010\u001e\u001a\u00020\u00072!\u0010\u001d\u001a\u001d\u0012\u0013\u0012\u00110\u0019¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u001c\u0012\u0004\u0012\u00020\u00070\u0018¢\u0006\u0004\b\u001e\u0010\u001fJ\u001b\u0010!\u001a\u00020\u00072\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00070 ¢\u0006\u0004\b!\u0010\"R\u0017\u0010(\u001a\u00020#8\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'¨\u0006)"}, d2 = {"Lcom/avito/android/beduin/common/component/bar_chart/p;", "Landroid/widget/FrameLayout;", "Lkotlin/ranges/l;", "getVisibleItemRange", "()Lkotlin/ranges/l;", "", "height", "Lkotlin/G0;", "setHeight", "(I)V", "LKh/a;", "decorator", "setSpacing", "(LKh/a;)V", "LKh/c;", "setVerticalAxis", "(LKh/c;)V", "LKh/b;", "setDetailsValue", "(LKh/b;)V", "Lcom/avito/android/beduin/common/component/bar_chart/a;", "dataProvider", "setDataProvider", "(Lcom/avito/android/beduin/common/component/bar_chart/a;)V", "Lkotlin/Function1;", "Lcom/avito/android/beduin/common/component/bar_chart/column/BarChartColumnItem;", "Lkotlin/S;", "name", "item", "listener", "setOnClickListener", "(LY41/l;)V", "Lkotlin/Function0;", "setOnScrollListener", "(LY41/a;)V", "Lcom/avito/konveyor/adapter/d;", "k", "Lcom/avito/konveyor/adapter/d;", "getListAdapter", "()Lcom/avito/konveyor/adapter/d;", "listAdapter", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class p extends FrameLayout {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final RecyclerView f100746b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public C14314a f100747c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public Kh.c f100748d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public Kh.b f100749e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public a f100750f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public Y41.l<? super BarChartColumnItem, G0> f100751g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public Y41.a<G0> f100752h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.beduin.view.recyclerview.g f100753i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final LinearLayoutManager f100754j;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    public final com.avito.konveyor.adapter.d listAdapter;

    public p(Context context, AttributeSet attributeSet, int i12, int i13, C42822w c42822w) throws BlueprintCollisionException {
        super(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i12);
        this.f100753i = new com.avito.android.beduin.view.recyclerview.g(context, BeduinScrollPosition.f105283f, null, 4, null);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(0, false);
        linearLayoutManager.d2(true);
        this.f100754j = linearLayoutManager;
        LayoutInflater.from(context).inflate(R.layout.beduin_bar_chart_view, (ViewGroup) this, true);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.rv_bar_chart);
        this.f100746b = recyclerView;
        com.avito.android.beduin.common.component.bar_chart.column.e eVar = new com.avito.android.beduin.common.component.bar_chart.column.e(new n(this), new o(this));
        a.C10493a c10493a = new a.C10493a();
        c10493a.b(new com.avito.android.beduin.common.component.bar_chart.column.a(eVar));
        com.avito.konveyor.a aVarA = c10493a.a();
        com.avito.konveyor.adapter.d dVar = new com.avito.konveyor.adapter.d(new com.avito.konveyor.adapter.h(aVarA, aVarA, null, 4, null), aVarA, new com.avito.android.beduin.common.component.bar_chart.column.b());
        this.listAdapter = dVar;
        recyclerView.setLayoutManager(linearLayoutManager);
        C35976x4.a(recyclerView);
        recyclerView.setAdapter(dVar);
        recyclerView.o(new m(this));
    }

    private final kotlin.ranges.l getVisibleItemRange() {
        LinearLayoutManager linearLayoutManager = this.f100754j;
        return s.r(linearLayoutManager.H1() + 1, linearLayoutManager.L1());
    }

    public final void a(int i12, boolean z12) {
        kotlin.ranges.l visibleItemRange = getVisibleItemRange();
        int i13 = visibleItemRange.f406905b;
        if (i12 > visibleItemRange.f406906c || i13 > i12 || z12) {
            LinearLayoutManager linearLayoutManager = this.f100754j;
            if (z12) {
                linearLayoutManager.b2(i12, getMeasuredWidth() / 2);
                return;
            }
            com.avito.android.beduin.view.recyclerview.g gVar = this.f100753i;
            gVar.f53878a = i12;
            linearLayoutManager.x1(gVar);
        }
    }

    @Y61.k
    public final com.avito.konveyor.adapter.d getListAdapter() {
        return this.listAdapter;
    }

    @SuppressLint({"NotifyDataSetChanged"})
    public final void setDataProvider(@Y61.k a dataProvider) {
        this.f100750f = dataProvider;
        RecyclerView.Adapter adapter = this.f100746b.getAdapter();
        if (adapter != null) {
            adapter.notifyDataSetChanged();
        }
    }

    public final void setDetailsValue(@Y61.l Kh.b decorator) {
        Kh.c cVar = this.f100748d;
        RecyclerView recyclerView = this.f100746b;
        if (cVar != null) {
            recyclerView.r0(cVar);
        }
        Kh.b bVar = this.f100749e;
        if (bVar != null) {
            recyclerView.r0(bVar);
        }
        this.f100749e = decorator;
        if (decorator != null) {
            recyclerView.l(decorator, -1);
        }
        Kh.c cVar2 = this.f100748d;
        if (cVar2 != null) {
            recyclerView.l(cVar2, -1);
        }
    }

    public final void setHeight(int height) {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams.height = height;
        setLayoutParams(layoutParams);
    }

    public final void setOnClickListener(@Y61.k Y41.l<? super BarChartColumnItem, G0> listener) {
        this.f100751g = listener;
    }

    public final void setOnScrollListener(@Y61.k Y41.a<G0> listener) {
        this.f100752h = listener;
    }

    public final void setSpacing(@Y61.k C14314a decorator) {
        C14314a c14314a = this.f100747c;
        RecyclerView recyclerView = this.f100746b;
        if (c14314a != null) {
            recyclerView.r0(c14314a);
        }
        this.f100747c = decorator;
        recyclerView.l(decorator, -1);
    }

    public final void setVerticalAxis(@Y61.k Kh.c decorator) {
        Kh.c cVar = this.f100748d;
        RecyclerView recyclerView = this.f100746b;
        if (cVar != null) {
            recyclerView.r0(cVar);
        }
        this.f100748d = decorator;
        recyclerView.l(decorator, -1);
    }
}
