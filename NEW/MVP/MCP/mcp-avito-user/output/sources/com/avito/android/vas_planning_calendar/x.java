package com.avito.android.vas_planning_calendar;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.ActivityC22955m;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.view.InterfaceC23040h0;
import com.avito.android.R;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.util.L0;
import com.avito.konveyor.exception.BlueprintNotSupportedException;
import eM0.C40023b;
import kotlin.InterfaceC43072x;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: PlanCalendarView.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/vas_planning_calendar/x;", "Lcom/avito/android/vas_planning_calendar/l;", "_avito_vas-planning_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class x implements InterfaceC36078l {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.lib.design.bottom_sheet.d f322735a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final L0 f322736b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final View f322737c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.progress_overlay.l f322738d;

    /* renamed from: e, reason: collision with root package name */
    public final View f322739e;

    /* renamed from: f, reason: collision with root package name */
    public final RecyclerView f322740f;

    /* renamed from: g, reason: collision with root package name */
    public final com.avito.konveyor.a f322741g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c f322742h;

    /* compiled from: PlanCalendarView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements InterfaceC23040h0, kotlin.jvm.internal.D {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ N f322743b;

        /* JADX WARN: Multi-variable type inference failed */
        public a(Y41.l lVar) {
            this.f322743b = (N) lVar;
        }

        public final boolean equals(@Y61.l Object obj) {
            if ((obj instanceof InterfaceC23040h0) && (obj instanceof kotlin.jvm.internal.D)) {
                return this.f322743b.equals(((kotlin.jvm.internal.D) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.D
        @Y61.k
        public final InterfaceC43072x<?> getFunctionDelegate() {
            return this.f322743b;
        }

        public final int hashCode() {
            return this.f322743b.hashCode();
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [Y41.l, kotlin.jvm.internal.N] */
        @Override // androidx.view.InterfaceC23040h0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f322743b.invoke(obj);
        }
    }

    public x(@Y61.k InterfaceC28373a interfaceC28373a, @Y61.k com.avito.konveyor.adapter.a aVar, @Y61.k com.avito.konveyor.a aVar2, @Y61.k com.avito.android.lib.design.bottom_sheet.d dVar, @Y61.k ActivityC22955m activityC22955m, @Y61.k L0 l02) throws BlueprintNotSupportedException {
        this.f322735a = dVar;
        this.f322736b = l02;
        View viewFindViewById = dVar.findViewById(R.id.plan_calendar_content);
        this.f322737c = viewFindViewById;
        this.f322738d = new com.avito.android.progress_overlay.l((ViewGroup) viewFindViewById.findViewById(R.id.content_holder), 0, interfaceC28373a, 0, 0, 26, null);
        this.f322739e = viewFindViewById.findViewById(R.id.button);
        this.f322742h = new com.jakewharton.rxrelay3.c();
        this.f322741g = aVar2;
        RecyclerView recyclerView = (RecyclerView) viewFindViewById.findViewById(R.id.recycler_view);
        this.f322740f = recyclerView;
        recyclerView.setAdapter(new com.avito.konveyor.adapter.j(aVar, aVar2));
        RecyclerView recyclerView2 = this.f322740f;
        RecyclerView.t recycledViewPool = (recyclerView2 == null ? null : recyclerView2).getRecycledViewPool();
        int iY2 = aVar2.Y(com.avito.android.vas_planning_calendar.view.konveyor.items.month.b.class);
        RecyclerView recyclerView3 = this.f322740f;
        recycledViewPool.e(iY2, (recyclerView3 == null ? null : recyclerView3).getResources().getInteger(R.integer.plan_calendar_max_recycled_views_count_month_item));
        RecyclerView recyclerView4 = this.f322740f;
        RecyclerView.t recycledViewPool2 = (recyclerView4 == null ? null : recyclerView4).getRecycledViewPool();
        com.avito.konveyor.a aVar3 = this.f322741g;
        int iY3 = (aVar3 == null ? null : aVar3).Y(com.avito.android.vas_planning_calendar.view.konveyor.items.day.b.class);
        RecyclerView recyclerView5 = this.f322740f;
        recycledViewPool2.e(iY3, (recyclerView5 == null ? null : recyclerView5).getResources().getInteger(R.integer.plan_calendar_max_recycled_views_count_day_item));
        RecyclerView recyclerView6 = this.f322740f;
        RecyclerView.t recycledViewPool3 = (recyclerView6 == null ? null : recyclerView6).getRecycledViewPool();
        int iY4 = aVar2.Y(com.avito.android.vas_planning_calendar.view.konveyor.items.empty.b.class);
        RecyclerView recyclerView7 = this.f322740f;
        recycledViewPool3.e(iY4, (recyclerView7 == null ? null : recyclerView7).getResources().getInteger(R.integer.plan_calendar_max_recycled_views_count_empty_item));
        w wVar = new w(aVar, this);
        RecyclerView recyclerView8 = this.f322740f;
        recyclerView8 = recyclerView8 == null ? null : recyclerView8;
        viewFindViewById.getContext();
        GridLayoutManager gridLayoutManager = new GridLayoutManager(7);
        gridLayoutManager.f53667M = wVar;
        recyclerView8.setLayoutManager(gridLayoutManager);
        RecyclerView recyclerView9 = this.f322740f;
        RecyclerView recyclerView10 = recyclerView9 == null ? null : recyclerView9;
        Context context = (recyclerView9 == null ? null : recyclerView9).getContext();
        recyclerView10.l(new C40023b(new v(2, wVar, GridLayoutManager.c.class, "getSpanIndex", "getSpanIndex(II)I", 0), context.getResources().getDimensionPixelSize(R.dimen.plan_calendar_recycler_view_horizontal_padding), context.getResources().getDimensionPixelSize(R.dimen.plan_calendar_recycler_view_day_horizontal_padding), context.getResources().getDimensionPixelSize(R.dimen.plan_calendar_recycler_view_day_vertical_margin)), -1);
        RecyclerView recyclerView11 = this.f322740f;
        (recyclerView11 == null ? null : recyclerView11).setItemAnimator(null);
    }
}
