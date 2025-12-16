package com.avito.android.category.widget;

import Oi0.C14700d;
import android.content.res.Resources;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.category.element.CategoryWidgetElementItem;
import com.avito.android.util.I5;
import com.avito.android.util.L0;
import com.jakewharton.rxbinding4.view.C37722i;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.observers.y;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: CategoryWidgetItemViewImpl.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/category/widget/i;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/category/widget/h;", "a", "_avito_bx-content_widget_category_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class i extends com.avito.konveyor.adapter.b implements h {

    /* renamed from: p, reason: collision with root package name */
    @Y61.k
    public static final a f116756p = new a(null);

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final View f116757b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.konveyor.adapter.h f116758c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final e f116759d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final L0 f116760e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final TextView f116761f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final RecyclerView f116762g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final LinearLayoutManager f116763h;

    /* renamed from: i, reason: collision with root package name */
    public final int f116764i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final ArrayList f116765j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final UV0.c<CategoryWidgetElementItem> f116766k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.l
    public y f116767l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.l
    public g f116768m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.lib.util.recycler_wrap_height_calculator.c f116769n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.l
    public io.reactivex.rxjava3.internal.observers.m f116770o;

    /* compiled from: CategoryWidgetItemViewImpl.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/category/widget/i$a;", "", "<init>", "()V", "", "BIG_TABLET_WIDTH_DP", "I", "_avito_bx-content_widget_category_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public i(@Y61.k View view, @Y61.k com.avito.konveyor.adapter.h hVar, @Y61.k C14700d c14700d, @Y61.k e eVar, @Y61.k L0 l02, @Y61.k com.avito.android.category.element.e eVar2) {
        super(view);
        this.f116757b = view;
        this.f116758c = hVar;
        this.f116759d = eVar;
        this.f116760e = l02;
        View viewFindViewById = view.findViewById(R.id.category_top_title);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f116761f = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.category_recycler);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        }
        RecyclerView recyclerView = (RecyclerView) viewFindViewById2;
        this.f116762g = recyclerView;
        view.getContext();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(0, false);
        this.f116763h = linearLayoutManager;
        this.f116764i = view.getResources().getDimensionPixelOffset(R.dimen.serp_vertical_content_horizontal_padding);
        ArrayList arrayList = new ArrayList();
        this.f116765j = arrayList;
        this.f116766k = new UV0.c<>(arrayList);
        this.f116769n = new com.avito.android.lib.util.recycler_wrap_height_calculator.c();
        c14700d.setHasStableIds(true);
        recyclerView.setLayoutManager(linearLayoutManager);
        Resources resources = view.getResources();
        IO.d dVar = new IO.d(0, 0, 0, 0, 0, 0, 63, null);
        IO.d.c(dVar, eVar2, resources.getDimensionPixelSize(R.dimen.serp_vertical_category_item_side_half_padding), resources.getDimensionPixelSize(R.dimen.serp_vertical_category_item_side_half_padding), resources.getDimensionPixelSize(R.dimen.serp_vertical_category_item_side_padding), resources.getDimensionPixelSize(R.dimen.serp_vertical_category_item_side_padding));
        recyclerView.l(dVar, -1);
        recyclerView.setHasFixedSize(true);
        recyclerView.setNestedScrollingEnabled(false);
        recyclerView.setScrollingTouchSlop(1);
        recyclerView.setAdapter(c14700d);
    }

    public final void B80() {
        Object tag = this.f116757b.getTag();
        if (tag instanceof String) {
            f116756p.getClass();
            int iA2 = this.f116760e.a();
            LinearLayoutManager linearLayoutManager = this.f116763h;
            e eVar = this.f116759d;
            if (iA2 >= 768) {
                eVar.Q0(Math.max(linearLayoutManager.K1(), linearLayoutManager.M1()), (String) tag);
                return;
            }
            int iK1 = linearLayoutManager.K1();
            int iM1 = linearLayoutManager.M1();
            int iH1 = linearLayoutManager.H1();
            int iL1 = linearLayoutManager.L1();
            String str = (String) tag;
            if (iH1 > -1) {
                iK1 = iH1;
            }
            if (iL1 > -1) {
                iM1 = iL1;
            }
            eVar.Q0(Math.max(iK1, iM1), str);
        }
    }

    @Override // com.avito.android.category.widget.h
    public final void W0(int i12) {
        this.f116763h.b2(i12, this.f116764i);
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        io.reactivex.rxjava3.internal.observers.m mVar = this.f116770o;
        if (mVar != null) {
            DisposableHelper.a(mVar);
        }
        y yVar = this.f116767l;
        if (yVar != null) {
            DisposableHelper.a(yVar);
        }
    }

    @Override // com.avito.android.category.widget.h
    public final void s(@Y61.k String str) {
        this.f116757b.setTag(str);
    }

    @Override // com.avito.android.category.widget.h
    public final void s1(@Y61.k List<CategoryWidgetElementItem> list) {
        this.f116758c.f338510e = this.f116766k;
        g gVar = new g();
        g gVar2 = this.f116768m;
        if (gVar2 != null) {
            gVar2.b(null);
        }
        RecyclerView recyclerView = this.f116762g;
        recyclerView.setOnFlingListener(null);
        recyclerView.s();
        recyclerView.o(new k(this));
        gVar.b(recyclerView);
        this.f116768m = gVar;
        y yVar = this.f116767l;
        if (yVar != null) {
            DisposableHelper.a(yVar);
        }
        this.f116767l = (y) C37722i.d(recyclerView).z0(1L).t0(new j(this));
        ArrayList arrayList = this.f116765j;
        arrayList.clear();
        arrayList.addAll(list);
        io.reactivex.rxjava3.internal.observers.m mVar = this.f116770o;
        if (mVar != null) {
            DisposableHelper.a(mVar);
        }
        this.f116770o = (io.reactivex.rxjava3.internal.observers.m) com.avito.android.lib.util.recycler_wrap_height_calculator.c.a(this.f116769n, this.f116762g, null, null, null, 30).x(new l(this), m.f116774b);
    }

    @Override // com.avito.android.category.widget.h
    public final void x40(@Y61.l String str, @Y61.k com.avito.android.body_condition.h hVar) {
        TextView textView = this.f116761f;
        I5.a(textView, str, false);
        textView.setOnClickListener(hVar);
    }
}
