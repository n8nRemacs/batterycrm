package com.avito.android.str_calendar.booking_calendar;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.compose.runtime.internal.P;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.lib.design.button.Button;
import kotlin.Metadata;
import xy0.C50021a;

/* compiled from: StrBookingCalendarViewHolder.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_calendar/booking_calendar/m;", "", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Toolbar f286353a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final TextView f286354b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.progress_overlay.l f286355c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final RecyclerView f286356d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final LinearLayout f286357e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final Button f286358f;

    public m(@Y61.k View view, @Y61.k InterfaceC28373a interfaceC28373a, @Y61.k com.avito.konveyor.a aVar, @Y61.k com.avito.konveyor.adapter.a aVar2, @Y61.k com.avito.konveyor.adapter.d dVar) {
        Toolbar toolbar = (Toolbar) view.findViewById(R.id.toolbar);
        toolbar.setNavigationIcon(R.drawable.ic_close_24_black);
        this.f286353a = toolbar;
        this.f286354b = (TextView) toolbar.findViewById(R.id.clear_button);
        this.f286355c = new com.avito.android.progress_overlay.l((ViewGroup) view.findViewById(R.id.content_holder), 0, interfaceC28373a, 0, 0, 26, null);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.recycler_view);
        recyclerView.setAdapter(dVar);
        recyclerView.getRecycledViewPool().e(aVar.Y(com.avito.android.str_calendar.booking_calendar.items.month.b.class), recyclerView.getResources().getInteger(R.integer.max_recycled_views_count_month_item));
        recyclerView.getRecycledViewPool().e(aVar.Y(com.avito.android.str_calendar.booking_calendar.items.day.b.class), recyclerView.getResources().getInteger(R.integer.max_recycled_views_count_day_item));
        recyclerView.getRecycledViewPool().e(aVar.Y(com.avito.android.str_calendar.booking_calendar.items.empty.b.class), recyclerView.getResources().getInteger(R.integer.max_recycled_views_count_empty_item));
        l lVar = new l(aVar2, aVar);
        recyclerView.getContext();
        GridLayoutManager gridLayoutManager = new GridLayoutManager(7);
        gridLayoutManager.f53667M = lVar;
        recyclerView.setLayoutManager(gridLayoutManager);
        Context context = view.getContext();
        recyclerView.l(new C50021a(new k(2, lVar, GridLayoutManager.c.class, "getSpanIndex", "getSpanIndex(II)I", 0), context.getResources().getDimensionPixelSize(R.dimen.calendar_recycler_view_horizontal_padding), context.getResources().getDimensionPixelSize(R.dimen.calendar_recycler_view_day_horizontal_padding), context.getResources().getDimensionPixelSize(R.dimen.calendar_recycler_view_day_vertical_margin)), -1);
        recyclerView.setItemAnimator(null);
        this.f286356d = recyclerView;
        this.f286357e = (LinearLayout) view.findViewById(R.id.calendar_buttons_root);
        this.f286358f = (Button) view.findViewById(R.id.button_select);
    }
}
