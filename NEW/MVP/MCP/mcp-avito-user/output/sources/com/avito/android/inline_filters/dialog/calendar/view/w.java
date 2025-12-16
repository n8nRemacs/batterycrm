package com.avito.android.inline_filters.dialog.calendar.view;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.C23424o;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.view.C23038g0;
import androidx.view.InterfaceC22983P;
import androidx.view.InterfaceC23040h0;
import com.avito.android.R;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.component.snackbar.d;
import com.avito.android.inline_filters.dialog.calendar.view.x;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.chips.ui.Chips;
import com.avito.android.lib.design.chips.ui.g;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.util.C35835l0;
import com.avito.android.util.L0;
import com.avito.android.util.y6;
import com.avito.konveyor.exception.BlueprintNotSupportedException;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import xy0.C50021a;

/* compiled from: FiltersCalendarPickerView.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/inline_filters/dialog/calendar/view/w;", "Lcom/avito/android/inline_filters/dialog/calendar/view/k;", "_avito_inline-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class w implements k {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final View f171358a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC22983P f171359b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final L0 f171360c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.inline_filters.dialog.calendar.n f171361d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final String f171362e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.progress_overlay.l f171363f;

    /* renamed from: g, reason: collision with root package name */
    public final RecyclerView f171364g;

    /* renamed from: h, reason: collision with root package name */
    public final com.avito.konveyor.a f171365h;

    /* renamed from: i, reason: collision with root package name */
    public final Button f171366i;

    /* renamed from: j, reason: collision with root package name */
    public final Button f171367j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c f171368k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final Chips f171369l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final String f171370m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final String f171371n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.k
    public final String f171372o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c f171373p;

    public w(@Y61.k InterfaceC28373a interfaceC28373a, @Y61.k View view, @Y61.k com.avito.konveyor.adapter.a aVar, @Y61.k com.avito.konveyor.a aVar2, @Y61.k InterfaceC22983P interfaceC22983P, @Y61.k L0 l02, @Y61.k com.avito.android.inline_filters.dialog.calendar.n nVar, @Y61.l String str, boolean z12) throws BlueprintNotSupportedException, Resources.NotFoundException {
        this.f171358a = view;
        this.f171359b = interfaceC22983P;
        this.f171360c = l02;
        this.f171361d = nVar;
        this.f171362e = str;
        this.f171363f = new com.avito.android.progress_overlay.l((ViewGroup) view.findViewById(R.id.content_holder), 0, interfaceC28373a, 0, 0, 26, null);
        this.f171366i = (Button) view.findViewById(R.id.button_skip);
        Button button = (Button) view.findViewById(R.id.button_select);
        this.f171367j = button;
        com.jakewharton.rxrelay3.c cVar = new com.jakewharton.rxrelay3.c();
        this.f171368k = cVar;
        Chips chips = (Chips) view.findViewById(R.id.chips);
        this.f171369l = chips;
        this.f171370m = view.getResources().getString(R.string.filters_calendar_picker_skip);
        this.f171371n = view.getResources().getString(R.string.filters_calendar_picker_choose);
        String string = view.getResources().getString(R.string.filters_calendar_picker_apply);
        this.f171372o = string;
        this.f171373p = cVar;
        nVar.f171278d.setOnClickListener(new com.avito.android.guests_selector.items.children_add_button.g(8, new v(this)));
        this.f171365h = aVar2;
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.recycler_view);
        this.f171364g = recyclerView;
        recyclerView.setAdapter(new com.avito.konveyor.adapter.j(aVar, aVar2));
        RecyclerView recyclerView2 = this.f171364g;
        RecyclerView.t recycledViewPool = (recyclerView2 == null ? null : recyclerView2).getRecycledViewPool();
        int iY2 = aVar2.Y(com.avito.android.inline_filters.dialog.calendar.konveyor.items.month.b.class);
        RecyclerView recyclerView3 = this.f171364g;
        recycledViewPool.e(iY2, (recyclerView3 == null ? null : recyclerView3).getResources().getInteger(R.integer.max_recycled_views_count_month_item));
        RecyclerView recyclerView4 = this.f171364g;
        RecyclerView.t recycledViewPool2 = (recyclerView4 == null ? null : recyclerView4).getRecycledViewPool();
        int iY3 = aVar2.Y(com.avito.android.inline_filters.dialog.calendar.konveyor.items.day.b.class);
        RecyclerView recyclerView5 = this.f171364g;
        recycledViewPool2.e(iY3, (recyclerView5 == null ? null : recyclerView5).getResources().getInteger(R.integer.max_recycled_views_count_day_item));
        RecyclerView recyclerView6 = this.f171364g;
        RecyclerView.t recycledViewPool3 = (recyclerView6 == null ? null : recyclerView6).getRecycledViewPool();
        int iY4 = aVar2.Y(com.avito.android.inline_filters.dialog.calendar.konveyor.items.empty.b.class);
        RecyclerView recyclerView7 = this.f171364g;
        recycledViewPool3.e(iY4, (recyclerView7 == null ? null : recyclerView7).getResources().getInteger(R.integer.max_recycled_views_count_empty_item));
        u uVar = new u(aVar, this);
        RecyclerView recyclerView8 = this.f171364g;
        recyclerView8 = recyclerView8 == null ? null : recyclerView8;
        view.getContext();
        GridLayoutManager gridLayoutManager = new GridLayoutManager(7);
        gridLayoutManager.f53667M = uVar;
        recyclerView8.setLayoutManager(gridLayoutManager);
        RecyclerView recyclerView9 = this.f171364g;
        RecyclerView recyclerView10 = recyclerView9 == null ? null : recyclerView9;
        Context context = (recyclerView9 == null ? null : recyclerView9).getContext();
        recyclerView10.l(new C50021a(new t(2, uVar, GridLayoutManager.c.class, "getSpanIndex", "getSpanIndex(II)I", 0), context.getResources().getDimensionPixelSize(R.dimen.inline_filters_calendar_recycler_horizontal_padding), context.getResources().getDimensionPixelSize(R.dimen.inline_filters_calendar_recycler_day_horizontal_padding), context.getResources().getDimensionPixelSize(R.dimen.inline_filters_calendar_recycler_day_vertical_margin)), -1);
        RecyclerView recyclerView11 = this.f171364g;
        (recyclerView11 == null ? null : recyclerView11).setItemAnimator(null);
        chips.setVisibility(z12 ? 0 : 8);
        if (z12) {
            g.b bVar = com.avito.android.lib.design.chips.ui.g.f178794f;
            Context context2 = view.getContext();
            int iJ2 = C35835l0.j(R.attr.chipsOutlinedSmall, view.getContext());
            bVar.getClass();
            chips.setStyle(g.b.c(iJ2, context2));
            RecyclerView recyclerView12 = this.f171364g;
            RecyclerView recyclerView13 = recyclerView12 != null ? recyclerView12 : null;
            recyclerView13.setPadding(recyclerView13.getPaddingLeft(), recyclerView13.getPaddingTop(), recyclerView13.getPaddingRight(), y6.b(22));
        }
        button.setText(str != null ? str : string);
    }

    public final void a(@Y61.k com.avito.android.inline_filters.dialog.calendar.o oVar) {
        C23038g0 f9428j = oVar.getF9428J();
        final int i12 = 4;
        InterfaceC23040h0 interfaceC23040h0 = new InterfaceC23040h0(this) { // from class: com.avito.android.inline_filters.dialog.calendar.view.m

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ w f171347c;

            {
                this.f171347c = this;
            }

            @Override // androidx.view.InterfaceC23040h0
            public final void onChanged(Object obj) {
                switch (i12) {
                    case 0:
                        Runnable runnable = (Runnable) obj;
                        if (runnable != null) {
                            com.avito.android.progress_overlay.l lVar = this.f171347c.f171363f;
                            lVar.a("");
                            lVar.f231600j = new s(runnable);
                            break;
                        }
                        break;
                    case 1:
                        if (((G0) obj) != null) {
                            this.f171347c.f171363f.j();
                            break;
                        }
                        break;
                    case 2:
                        Boolean bool = (Boolean) obj;
                        if (bool != null) {
                            com.avito.android.inline_filters.dialog.calendar.n nVar = this.f171347c.f171361d;
                            boolean zBooleanValue = bool.booleanValue();
                            TextView textView = nVar.f171277c;
                            textView.setClickable(zBooleanValue);
                            Context context = nVar.f171275a;
                            textView.setTextColor(zBooleanValue ? C35835l0.d(R.attr.blue, context) : C35835l0.d(R.attr.gray28, context));
                            break;
                        }
                        break;
                    case 3:
                        if (((G0) obj) != null) {
                            this.f171347c.f171363f.k(null);
                            break;
                        }
                        break;
                    case 4:
                        C23424o.e eVar = (C23424o.e) obj;
                        if (eVar != null) {
                            RecyclerView recyclerView = this.f171347c.f171364g;
                            if (recyclerView == null) {
                                recyclerView = null;
                            }
                            RecyclerView.Adapter adapter = recyclerView.getAdapter();
                            if (adapter != null) {
                                eVar.b(adapter);
                                break;
                            }
                        }
                        break;
                    case 5:
                        Integer num = (Integer) obj;
                        if (num != null) {
                            w wVar = this.f171347c;
                            RecyclerView recyclerView2 = wVar.f171364g;
                            if (recyclerView2 == null) {
                                recyclerView2 = null;
                            }
                            ((GridLayoutManager) recyclerView2.getLayoutManager()).b2(num.intValue(), wVar.f171360c.d() / 4);
                            break;
                        }
                        break;
                    case 6:
                        PrintableText printableText = (PrintableText) obj;
                        if (printableText != null) {
                            com.avito.android.printable_text.a.c(this.f171347c.f171361d.f171276b, printableText);
                            break;
                        }
                        break;
                    default:
                        PrintableText printableText2 = (PrintableText) obj;
                        if (printableText2 != null) {
                            w wVar2 = this.f171347c;
                            d.a.b(com.avito.android.component.snackbar.d.f125235c, wVar2.f171358a, printableText2.k0(wVar2.f171358a.getContext()), -1, null, null, 0, null, null, 0, 0, 2040).b();
                            break;
                        }
                        break;
                }
            }
        };
        InterfaceC22983P interfaceC22983P = this.f171359b;
        f9428j.observe(interfaceC22983P, interfaceC23040h0);
        oVar.getF9429K().observe(interfaceC22983P, new x.a(new r(this, oVar.getF171303n0())));
        final int i13 = 1;
        oVar.getF9430L().observe(interfaceC22983P, new InterfaceC23040h0(this) { // from class: com.avito.android.inline_filters.dialog.calendar.view.m

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ w f171347c;

            {
                this.f171347c = this;
            }

            @Override // androidx.view.InterfaceC23040h0
            public final void onChanged(Object obj) {
                switch (i13) {
                    case 0:
                        Runnable runnable = (Runnable) obj;
                        if (runnable != null) {
                            com.avito.android.progress_overlay.l lVar = this.f171347c.f171363f;
                            lVar.a("");
                            lVar.f231600j = new s(runnable);
                            break;
                        }
                        break;
                    case 1:
                        if (((G0) obj) != null) {
                            this.f171347c.f171363f.j();
                            break;
                        }
                        break;
                    case 2:
                        Boolean bool = (Boolean) obj;
                        if (bool != null) {
                            com.avito.android.inline_filters.dialog.calendar.n nVar = this.f171347c.f171361d;
                            boolean zBooleanValue = bool.booleanValue();
                            TextView textView = nVar.f171277c;
                            textView.setClickable(zBooleanValue);
                            Context context = nVar.f171275a;
                            textView.setTextColor(zBooleanValue ? C35835l0.d(R.attr.blue, context) : C35835l0.d(R.attr.gray28, context));
                            break;
                        }
                        break;
                    case 3:
                        if (((G0) obj) != null) {
                            this.f171347c.f171363f.k(null);
                            break;
                        }
                        break;
                    case 4:
                        C23424o.e eVar = (C23424o.e) obj;
                        if (eVar != null) {
                            RecyclerView recyclerView = this.f171347c.f171364g;
                            if (recyclerView == null) {
                                recyclerView = null;
                            }
                            RecyclerView.Adapter adapter = recyclerView.getAdapter();
                            if (adapter != null) {
                                eVar.b(adapter);
                                break;
                            }
                        }
                        break;
                    case 5:
                        Integer num = (Integer) obj;
                        if (num != null) {
                            w wVar = this.f171347c;
                            RecyclerView recyclerView2 = wVar.f171364g;
                            if (recyclerView2 == null) {
                                recyclerView2 = null;
                            }
                            ((GridLayoutManager) recyclerView2.getLayoutManager()).b2(num.intValue(), wVar.f171360c.d() / 4);
                            break;
                        }
                        break;
                    case 6:
                        PrintableText printableText = (PrintableText) obj;
                        if (printableText != null) {
                            com.avito.android.printable_text.a.c(this.f171347c.f171361d.f171276b, printableText);
                            break;
                        }
                        break;
                    default:
                        PrintableText printableText2 = (PrintableText) obj;
                        if (printableText2 != null) {
                            w wVar2 = this.f171347c;
                            d.a.b(com.avito.android.component.snackbar.d.f125235c, wVar2.f171358a, printableText2.k0(wVar2.f171358a.getContext()), -1, null, null, 0, null, null, 0, 0, 2040).b();
                            break;
                        }
                        break;
                }
            }
        });
        final int i14 = 3;
        oVar.getF9431M().observe(interfaceC22983P, new InterfaceC23040h0(this) { // from class: com.avito.android.inline_filters.dialog.calendar.view.m

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ w f171347c;

            {
                this.f171347c = this;
            }

            @Override // androidx.view.InterfaceC23040h0
            public final void onChanged(Object obj) {
                switch (i14) {
                    case 0:
                        Runnable runnable = (Runnable) obj;
                        if (runnable != null) {
                            com.avito.android.progress_overlay.l lVar = this.f171347c.f171363f;
                            lVar.a("");
                            lVar.f231600j = new s(runnable);
                            break;
                        }
                        break;
                    case 1:
                        if (((G0) obj) != null) {
                            this.f171347c.f171363f.j();
                            break;
                        }
                        break;
                    case 2:
                        Boolean bool = (Boolean) obj;
                        if (bool != null) {
                            com.avito.android.inline_filters.dialog.calendar.n nVar = this.f171347c.f171361d;
                            boolean zBooleanValue = bool.booleanValue();
                            TextView textView = nVar.f171277c;
                            textView.setClickable(zBooleanValue);
                            Context context = nVar.f171275a;
                            textView.setTextColor(zBooleanValue ? C35835l0.d(R.attr.blue, context) : C35835l0.d(R.attr.gray28, context));
                            break;
                        }
                        break;
                    case 3:
                        if (((G0) obj) != null) {
                            this.f171347c.f171363f.k(null);
                            break;
                        }
                        break;
                    case 4:
                        C23424o.e eVar = (C23424o.e) obj;
                        if (eVar != null) {
                            RecyclerView recyclerView = this.f171347c.f171364g;
                            if (recyclerView == null) {
                                recyclerView = null;
                            }
                            RecyclerView.Adapter adapter = recyclerView.getAdapter();
                            if (adapter != null) {
                                eVar.b(adapter);
                                break;
                            }
                        }
                        break;
                    case 5:
                        Integer num = (Integer) obj;
                        if (num != null) {
                            w wVar = this.f171347c;
                            RecyclerView recyclerView2 = wVar.f171364g;
                            if (recyclerView2 == null) {
                                recyclerView2 = null;
                            }
                            ((GridLayoutManager) recyclerView2.getLayoutManager()).b2(num.intValue(), wVar.f171360c.d() / 4);
                            break;
                        }
                        break;
                    case 6:
                        PrintableText printableText = (PrintableText) obj;
                        if (printableText != null) {
                            com.avito.android.printable_text.a.c(this.f171347c.f171361d.f171276b, printableText);
                            break;
                        }
                        break;
                    default:
                        PrintableText printableText2 = (PrintableText) obj;
                        if (printableText2 != null) {
                            w wVar2 = this.f171347c;
                            d.a.b(com.avito.android.component.snackbar.d.f125235c, wVar2.f171358a, printableText2.k0(wVar2.f171358a.getContext()), -1, null, null, 0, null, null, 0, 0, 2040).b();
                            break;
                        }
                        break;
                }
            }
        });
        final int i15 = 7;
        oVar.getF9433O().observe(interfaceC22983P, new InterfaceC23040h0(this) { // from class: com.avito.android.inline_filters.dialog.calendar.view.m

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ w f171347c;

            {
                this.f171347c = this;
            }

            @Override // androidx.view.InterfaceC23040h0
            public final void onChanged(Object obj) {
                switch (i15) {
                    case 0:
                        Runnable runnable = (Runnable) obj;
                        if (runnable != null) {
                            com.avito.android.progress_overlay.l lVar = this.f171347c.f171363f;
                            lVar.a("");
                            lVar.f231600j = new s(runnable);
                            break;
                        }
                        break;
                    case 1:
                        if (((G0) obj) != null) {
                            this.f171347c.f171363f.j();
                            break;
                        }
                        break;
                    case 2:
                        Boolean bool = (Boolean) obj;
                        if (bool != null) {
                            com.avito.android.inline_filters.dialog.calendar.n nVar = this.f171347c.f171361d;
                            boolean zBooleanValue = bool.booleanValue();
                            TextView textView = nVar.f171277c;
                            textView.setClickable(zBooleanValue);
                            Context context = nVar.f171275a;
                            textView.setTextColor(zBooleanValue ? C35835l0.d(R.attr.blue, context) : C35835l0.d(R.attr.gray28, context));
                            break;
                        }
                        break;
                    case 3:
                        if (((G0) obj) != null) {
                            this.f171347c.f171363f.k(null);
                            break;
                        }
                        break;
                    case 4:
                        C23424o.e eVar = (C23424o.e) obj;
                        if (eVar != null) {
                            RecyclerView recyclerView = this.f171347c.f171364g;
                            if (recyclerView == null) {
                                recyclerView = null;
                            }
                            RecyclerView.Adapter adapter = recyclerView.getAdapter();
                            if (adapter != null) {
                                eVar.b(adapter);
                                break;
                            }
                        }
                        break;
                    case 5:
                        Integer num = (Integer) obj;
                        if (num != null) {
                            w wVar = this.f171347c;
                            RecyclerView recyclerView2 = wVar.f171364g;
                            if (recyclerView2 == null) {
                                recyclerView2 = null;
                            }
                            ((GridLayoutManager) recyclerView2.getLayoutManager()).b2(num.intValue(), wVar.f171360c.d() / 4);
                            break;
                        }
                        break;
                    case 6:
                        PrintableText printableText = (PrintableText) obj;
                        if (printableText != null) {
                            com.avito.android.printable_text.a.c(this.f171347c.f171361d.f171276b, printableText);
                            break;
                        }
                        break;
                    default:
                        PrintableText printableText2 = (PrintableText) obj;
                        if (printableText2 != null) {
                            w wVar2 = this.f171347c;
                            d.a.b(com.avito.android.component.snackbar.d.f125235c, wVar2.f171358a, printableText2.k0(wVar2.f171358a.getContext()), -1, null, null, 0, null, null, 0, 0, 2040).b();
                            break;
                        }
                        break;
                }
            }
        });
        final int i16 = 0;
        oVar.getF9432N().observe(interfaceC22983P, new InterfaceC23040h0(this) { // from class: com.avito.android.inline_filters.dialog.calendar.view.m

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ w f171347c;

            {
                this.f171347c = this;
            }

            @Override // androidx.view.InterfaceC23040h0
            public final void onChanged(Object obj) {
                switch (i16) {
                    case 0:
                        Runnable runnable = (Runnable) obj;
                        if (runnable != null) {
                            com.avito.android.progress_overlay.l lVar = this.f171347c.f171363f;
                            lVar.a("");
                            lVar.f231600j = new s(runnable);
                            break;
                        }
                        break;
                    case 1:
                        if (((G0) obj) != null) {
                            this.f171347c.f171363f.j();
                            break;
                        }
                        break;
                    case 2:
                        Boolean bool = (Boolean) obj;
                        if (bool != null) {
                            com.avito.android.inline_filters.dialog.calendar.n nVar = this.f171347c.f171361d;
                            boolean zBooleanValue = bool.booleanValue();
                            TextView textView = nVar.f171277c;
                            textView.setClickable(zBooleanValue);
                            Context context = nVar.f171275a;
                            textView.setTextColor(zBooleanValue ? C35835l0.d(R.attr.blue, context) : C35835l0.d(R.attr.gray28, context));
                            break;
                        }
                        break;
                    case 3:
                        if (((G0) obj) != null) {
                            this.f171347c.f171363f.k(null);
                            break;
                        }
                        break;
                    case 4:
                        C23424o.e eVar = (C23424o.e) obj;
                        if (eVar != null) {
                            RecyclerView recyclerView = this.f171347c.f171364g;
                            if (recyclerView == null) {
                                recyclerView = null;
                            }
                            RecyclerView.Adapter adapter = recyclerView.getAdapter();
                            if (adapter != null) {
                                eVar.b(adapter);
                                break;
                            }
                        }
                        break;
                    case 5:
                        Integer num = (Integer) obj;
                        if (num != null) {
                            w wVar = this.f171347c;
                            RecyclerView recyclerView2 = wVar.f171364g;
                            if (recyclerView2 == null) {
                                recyclerView2 = null;
                            }
                            ((GridLayoutManager) recyclerView2.getLayoutManager()).b2(num.intValue(), wVar.f171360c.d() / 4);
                            break;
                        }
                        break;
                    case 6:
                        PrintableText printableText = (PrintableText) obj;
                        if (printableText != null) {
                            com.avito.android.printable_text.a.c(this.f171347c.f171361d.f171276b, printableText);
                            break;
                        }
                        break;
                    default:
                        PrintableText printableText2 = (PrintableText) obj;
                        if (printableText2 != null) {
                            w wVar2 = this.f171347c;
                            d.a.b(com.avito.android.component.snackbar.d.f125235c, wVar2.f171358a, printableText2.k0(wVar2.f171358a.getContext()), -1, null, null, 0, null, null, 0, 0, 2040).b();
                            break;
                        }
                        break;
                }
            }
        });
        final int i17 = 2;
        oVar.getF171291b0().observe(interfaceC22983P, new InterfaceC23040h0(this) { // from class: com.avito.android.inline_filters.dialog.calendar.view.m

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ w f171347c;

            {
                this.f171347c = this;
            }

            @Override // androidx.view.InterfaceC23040h0
            public final void onChanged(Object obj) {
                switch (i17) {
                    case 0:
                        Runnable runnable = (Runnable) obj;
                        if (runnable != null) {
                            com.avito.android.progress_overlay.l lVar = this.f171347c.f171363f;
                            lVar.a("");
                            lVar.f231600j = new s(runnable);
                            break;
                        }
                        break;
                    case 1:
                        if (((G0) obj) != null) {
                            this.f171347c.f171363f.j();
                            break;
                        }
                        break;
                    case 2:
                        Boolean bool = (Boolean) obj;
                        if (bool != null) {
                            com.avito.android.inline_filters.dialog.calendar.n nVar = this.f171347c.f171361d;
                            boolean zBooleanValue = bool.booleanValue();
                            TextView textView = nVar.f171277c;
                            textView.setClickable(zBooleanValue);
                            Context context = nVar.f171275a;
                            textView.setTextColor(zBooleanValue ? C35835l0.d(R.attr.blue, context) : C35835l0.d(R.attr.gray28, context));
                            break;
                        }
                        break;
                    case 3:
                        if (((G0) obj) != null) {
                            this.f171347c.f171363f.k(null);
                            break;
                        }
                        break;
                    case 4:
                        C23424o.e eVar = (C23424o.e) obj;
                        if (eVar != null) {
                            RecyclerView recyclerView = this.f171347c.f171364g;
                            if (recyclerView == null) {
                                recyclerView = null;
                            }
                            RecyclerView.Adapter adapter = recyclerView.getAdapter();
                            if (adapter != null) {
                                eVar.b(adapter);
                                break;
                            }
                        }
                        break;
                    case 5:
                        Integer num = (Integer) obj;
                        if (num != null) {
                            w wVar = this.f171347c;
                            RecyclerView recyclerView2 = wVar.f171364g;
                            if (recyclerView2 == null) {
                                recyclerView2 = null;
                            }
                            ((GridLayoutManager) recyclerView2.getLayoutManager()).b2(num.intValue(), wVar.f171360c.d() / 4);
                            break;
                        }
                        break;
                    case 6:
                        PrintableText printableText = (PrintableText) obj;
                        if (printableText != null) {
                            com.avito.android.printable_text.a.c(this.f171347c.f171361d.f171276b, printableText);
                            break;
                        }
                        break;
                    default:
                        PrintableText printableText2 = (PrintableText) obj;
                        if (printableText2 != null) {
                            w wVar2 = this.f171347c;
                            d.a.b(com.avito.android.component.snackbar.d.f125235c, wVar2.f171358a, printableText2.k0(wVar2.f171358a.getContext()), -1, null, null, 0, null, null, 0, 0, 2040).b();
                            break;
                        }
                        break;
                }
            }
        });
        final int i18 = 6;
        oVar.getF171292c0().observe(interfaceC22983P, new InterfaceC23040h0(this) { // from class: com.avito.android.inline_filters.dialog.calendar.view.m

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ w f171347c;

            {
                this.f171347c = this;
            }

            @Override // androidx.view.InterfaceC23040h0
            public final void onChanged(Object obj) {
                switch (i18) {
                    case 0:
                        Runnable runnable = (Runnable) obj;
                        if (runnable != null) {
                            com.avito.android.progress_overlay.l lVar = this.f171347c.f171363f;
                            lVar.a("");
                            lVar.f231600j = new s(runnable);
                            break;
                        }
                        break;
                    case 1:
                        if (((G0) obj) != null) {
                            this.f171347c.f171363f.j();
                            break;
                        }
                        break;
                    case 2:
                        Boolean bool = (Boolean) obj;
                        if (bool != null) {
                            com.avito.android.inline_filters.dialog.calendar.n nVar = this.f171347c.f171361d;
                            boolean zBooleanValue = bool.booleanValue();
                            TextView textView = nVar.f171277c;
                            textView.setClickable(zBooleanValue);
                            Context context = nVar.f171275a;
                            textView.setTextColor(zBooleanValue ? C35835l0.d(R.attr.blue, context) : C35835l0.d(R.attr.gray28, context));
                            break;
                        }
                        break;
                    case 3:
                        if (((G0) obj) != null) {
                            this.f171347c.f171363f.k(null);
                            break;
                        }
                        break;
                    case 4:
                        C23424o.e eVar = (C23424o.e) obj;
                        if (eVar != null) {
                            RecyclerView recyclerView = this.f171347c.f171364g;
                            if (recyclerView == null) {
                                recyclerView = null;
                            }
                            RecyclerView.Adapter adapter = recyclerView.getAdapter();
                            if (adapter != null) {
                                eVar.b(adapter);
                                break;
                            }
                        }
                        break;
                    case 5:
                        Integer num = (Integer) obj;
                        if (num != null) {
                            w wVar = this.f171347c;
                            RecyclerView recyclerView2 = wVar.f171364g;
                            if (recyclerView2 == null) {
                                recyclerView2 = null;
                            }
                            ((GridLayoutManager) recyclerView2.getLayoutManager()).b2(num.intValue(), wVar.f171360c.d() / 4);
                            break;
                        }
                        break;
                    case 6:
                        PrintableText printableText = (PrintableText) obj;
                        if (printableText != null) {
                            com.avito.android.printable_text.a.c(this.f171347c.f171361d.f171276b, printableText);
                            break;
                        }
                        break;
                    default:
                        PrintableText printableText2 = (PrintableText) obj;
                        if (printableText2 != null) {
                            w wVar2 = this.f171347c;
                            d.a.b(com.avito.android.component.snackbar.d.f125235c, wVar2.f171358a, printableText2.k0(wVar2.f171358a.getContext()), -1, null, null, 0, null, null, 0, 0, 2040).b();
                            break;
                        }
                        break;
                }
            }
        });
        final int i19 = 5;
        oVar.getF171293d0().observe(interfaceC22983P, new InterfaceC23040h0(this) { // from class: com.avito.android.inline_filters.dialog.calendar.view.m

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ w f171347c;

            {
                this.f171347c = this;
            }

            @Override // androidx.view.InterfaceC23040h0
            public final void onChanged(Object obj) {
                switch (i19) {
                    case 0:
                        Runnable runnable = (Runnable) obj;
                        if (runnable != null) {
                            com.avito.android.progress_overlay.l lVar = this.f171347c.f171363f;
                            lVar.a("");
                            lVar.f231600j = new s(runnable);
                            break;
                        }
                        break;
                    case 1:
                        if (((G0) obj) != null) {
                            this.f171347c.f171363f.j();
                            break;
                        }
                        break;
                    case 2:
                        Boolean bool = (Boolean) obj;
                        if (bool != null) {
                            com.avito.android.inline_filters.dialog.calendar.n nVar = this.f171347c.f171361d;
                            boolean zBooleanValue = bool.booleanValue();
                            TextView textView = nVar.f171277c;
                            textView.setClickable(zBooleanValue);
                            Context context = nVar.f171275a;
                            textView.setTextColor(zBooleanValue ? C35835l0.d(R.attr.blue, context) : C35835l0.d(R.attr.gray28, context));
                            break;
                        }
                        break;
                    case 3:
                        if (((G0) obj) != null) {
                            this.f171347c.f171363f.k(null);
                            break;
                        }
                        break;
                    case 4:
                        C23424o.e eVar = (C23424o.e) obj;
                        if (eVar != null) {
                            RecyclerView recyclerView = this.f171347c.f171364g;
                            if (recyclerView == null) {
                                recyclerView = null;
                            }
                            RecyclerView.Adapter adapter = recyclerView.getAdapter();
                            if (adapter != null) {
                                eVar.b(adapter);
                                break;
                            }
                        }
                        break;
                    case 5:
                        Integer num = (Integer) obj;
                        if (num != null) {
                            w wVar = this.f171347c;
                            RecyclerView recyclerView2 = wVar.f171364g;
                            if (recyclerView2 == null) {
                                recyclerView2 = null;
                            }
                            ((GridLayoutManager) recyclerView2.getLayoutManager()).b2(num.intValue(), wVar.f171360c.d() / 4);
                            break;
                        }
                        break;
                    case 6:
                        PrintableText printableText = (PrintableText) obj;
                        if (printableText != null) {
                            com.avito.android.printable_text.a.c(this.f171347c.f171361d.f171276b, printableText);
                            break;
                        }
                        break;
                    default:
                        PrintableText printableText2 = (PrintableText) obj;
                        if (printableText2 != null) {
                            w wVar2 = this.f171347c;
                            d.a.b(com.avito.android.component.snackbar.d.f125235c, wVar2.f171358a, printableText2.k0(wVar2.f171358a.getContext()), -1, null, null, 0, null, null, 0, 0, 2040).b();
                            break;
                        }
                        break;
                }
            }
        });
        com.jakewharton.rxrelay3.c f171302m0 = oVar.getF171302m0();
        C23038g0 f171296g0 = oVar.getF171296g0();
        final com.jakewharton.rxrelay3.c f171301l0 = oVar.getF171301l0();
        C23038g0 f171295f0 = oVar.getF171295f0();
        n nVar = new n(f171302m0);
        com.avito.android.inline_filters.dialog.calendar.n nVar2 = this.f171361d;
        nVar2.f171277c.setOnClickListener(new com.avito.android.guests_selector.items.children_add_button.g(9, nVar));
        final int i22 = 0;
        this.f171367j.setOnClickListener(new View.OnClickListener() { // from class: com.avito.android.inline_filters.dialog.calendar.view.l
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i22) {
                    case 0:
                        ((l41.g) f171301l0).accept(G0.f406611a);
                        break;
                    default:
                        ((w) f171301l0).f171368k.accept(G0.f406611a);
                        break;
                }
            }
        });
        f171296g0.observe(interfaceC22983P, new x.a(new o(this)));
        final int i23 = 1;
        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: com.avito.android.inline_filters.dialog.calendar.view.l
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i23) {
                    case 0:
                        ((l41.g) this).accept(G0.f406611a);
                        break;
                    default:
                        ((w) this).f171368k.accept(G0.f406611a);
                        break;
                }
            }
        };
        Button button = this.f171366i;
        button.setOnClickListener(onClickListener);
        button.setText(this.f171370m);
        f171295f0.observe(interfaceC22983P, new x.a(new p(this)));
    }
}
