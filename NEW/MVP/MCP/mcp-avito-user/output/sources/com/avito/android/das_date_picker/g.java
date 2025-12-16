package com.avito.android.das_date_picker;

import Y61.k;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.lib.design.button.Button;
import com.avito.android.progress_overlay.l;
import eu.C40157a;
import kotlin.Metadata;

/* compiled from: DasCalendarViewHolder.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/das_date_picker/g;", "", "_avito_das-date-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Toolbar f132305a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final TextView f132306b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final l f132307c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final RecyclerView f132308d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final Button f132309e;

    public g(@k View view, @k com.avito.konveyor.a aVar, @k com.avito.konveyor.adapter.a aVar2, @k com.avito.konveyor.adapter.d dVar) {
        Toolbar toolbar = (Toolbar) view.findViewById(R.id.toolbar);
        toolbar.setNavigationIcon(R.drawable.ic_close_24_black);
        this.f132305a = toolbar;
        this.f132306b = (TextView) toolbar.findViewById(R.id.clear_button);
        this.f132307c = new l((ViewGroup) view.findViewById(R.id.content_holder), 0, null, 0, 0, 30, null);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.recycler_view);
        recyclerView.setAdapter(dVar);
        recyclerView.getRecycledViewPool().e(aVar.Y(com.avito.android.das_date_picker.items.month.b.class), recyclerView.getResources().getInteger(R.integer.das_max_recycled_views_count_month_item));
        recyclerView.getRecycledViewPool().e(aVar.Y(com.avito.android.das_date_picker.items.day.b.class), recyclerView.getResources().getInteger(R.integer.das_max_recycled_views_count_day_item));
        recyclerView.getRecycledViewPool().e(aVar.Y(com.avito.android.das_date_picker.items.empty.b.class), recyclerView.getResources().getInteger(R.integer.das_max_recycled_views_count_empty_item));
        f fVar = new f(aVar2, aVar);
        recyclerView.getContext();
        GridLayoutManager gridLayoutManager = new GridLayoutManager(7);
        gridLayoutManager.f53667M = fVar;
        recyclerView.setLayoutManager(gridLayoutManager);
        Context context = view.getContext();
        recyclerView.l(new C40157a(new e(2, fVar, GridLayoutManager.c.class, "getSpanIndex", "getSpanIndex(II)I", 0), context.getResources().getDimensionPixelSize(R.dimen.das_calendar_recycler_view_horizontal_padding), context.getResources().getDimensionPixelSize(R.dimen.das_calendar_recycler_view_day_horizontal_padding), context.getResources().getDimensionPixelSize(R.dimen.das_calendar_recycler_view_day_vertical_margin)), -1);
        recyclerView.setItemAnimator(null);
        this.f132308d = recyclerView;
        this.f132309e = (Button) view.findViewById(R.id.button_select);
    }
}
