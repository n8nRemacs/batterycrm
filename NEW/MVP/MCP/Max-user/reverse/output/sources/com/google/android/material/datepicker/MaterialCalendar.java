package com.google.android.material.datepicker;

import android.R;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.ListAdapter;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import defpackage.a1d;
import defpackage.cg4;
import defpackage.dwc;
import defpackage.g2a;
import defpackage.g7i;
import defpackage.gf4;
import defpackage.h2a;
import defpackage.hfh;
import defpackage.i5i;
import defpackage.k1d;
import defpackage.lq8;
import defpackage.mq8;
import defpackage.mz0;
import defpackage.nq8;
import defpackage.oq8;
import defpackage.r6;
import defpackage.ss0;
import defpackage.usd;
import defpackage.uxc;
import defpackage.xk0;
import defpackage.y71;

/* loaded from: classes.dex */
public final class MaterialCalendar<S> extends PickerFragment<S> {
    public int j1;
    public mz0 k1;
    public g2a l1;
    public int m1;
    public i5i n1;
    public RecyclerView o1;
    public RecyclerView p1;
    public View q1;
    public View r1;
    public View s1;
    public View t1;

    @Override // androidx.fragment.app.a
    public final void M(Bundle bundle) {
        super.M(bundle);
        if (bundle == null) {
            bundle = this.X;
        }
        this.j1 = bundle.getInt("THEME_RES_ID_KEY");
        if (bundle.getParcelable("GRID_SELECTOR_KEY") != null) {
            throw new ClassCastException();
        }
        this.k1 = (mz0) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        if (bundle.getParcelable("DAY_VIEW_DECORATOR_KEY") != null) {
            throw new ClassCastException();
        }
        this.l1 = (g2a) bundle.getParcelable("CURRENT_MONTH_KEY");
    }

    @Override // androidx.fragment.app.a
    public final View O(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) throws Resources.NotFoundException {
        int i;
        int i2;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(v(), this.j1);
        this.n1 = new i5i(contextThemeWrapper);
        LayoutInflater layoutInflaterCloneInContext = layoutInflater.cloneInContext(contextThemeWrapper);
        g2a g2aVar = this.k1.a;
        if (MaterialDatePicker.A0(contextThemeWrapper, R.attr.windowFullscreen)) {
            i = k1d.mtrl_calendar_vertical;
            i2 = 1;
        } else {
            i = k1d.mtrl_calendar_horizontal;
            i2 = 0;
        }
        View viewInflate = layoutInflaterCloneInContext.inflate(i, viewGroup, false);
        Resources resources = k0().getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(dwc.mtrl_calendar_navigation_bottom_padding) + resources.getDimensionPixelOffset(dwc.mtrl_calendar_navigation_top_padding) + resources.getDimensionPixelSize(dwc.mtrl_calendar_navigation_height);
        int dimensionPixelSize = resources.getDimensionPixelSize(dwc.mtrl_calendar_days_of_week_height);
        int i3 = h2a.d;
        viewInflate.setMinimumHeight(dimensionPixelOffset + dimensionPixelSize + (resources.getDimensionPixelOffset(dwc.mtrl_calendar_month_vertical_padding) * (i3 - 1)) + (resources.getDimensionPixelSize(dwc.mtrl_calendar_day_height) * i3) + resources.getDimensionPixelOffset(dwc.mtrl_calendar_bottom_padding));
        GridView gridView = (GridView) viewInflate.findViewById(uxc.mtrl_calendar_days_of_week);
        hfh.n(gridView, new mq8(0));
        int i4 = this.k1.o;
        gridView.setAdapter((ListAdapter) (i4 > 0 ? new cg4(i4) : new cg4()));
        gridView.setNumColumns(g2aVar.d);
        gridView.setEnabled(false);
        this.p1 = (RecyclerView) viewInflate.findViewById(uxc.mtrl_calendar_months);
        this.p1.setLayoutManager(new nq8(this, i2, i2));
        this.p1.setTag("MONTHS_VIEW_GROUP_TAG");
        c cVar = new c(contextThemeWrapper, this.k1, new usd(23, this));
        this.p1.setAdapter(cVar);
        int integer = contextThemeWrapper.getResources().getInteger(a1d.mtrl_calendar_year_selector_span);
        RecyclerView recyclerView = (RecyclerView) viewInflate.findViewById(uxc.mtrl_calendar_year_selector_frame);
        this.o1 = recyclerView;
        if (recyclerView != null) {
            recyclerView.setHasFixedSize(true);
            this.o1.setLayoutManager(new GridLayoutManager(integer, 0));
            this.o1.setAdapter(new g7i(this));
            this.o1.j(new y71(this));
        }
        if (viewInflate.findViewById(uxc.month_navigation_fragment_toggle) != null) {
            MaterialButton materialButton = (MaterialButton) viewInflate.findViewById(uxc.month_navigation_fragment_toggle);
            materialButton.setTag("SELECTOR_TOGGLE_TAG");
            hfh.n(materialButton, new ss0(3, this));
            View viewFindViewById = viewInflate.findViewById(uxc.month_navigation_previous);
            this.q1 = viewFindViewById;
            viewFindViewById.setTag("NAVIGATION_PREV_TAG");
            View viewFindViewById2 = viewInflate.findViewById(uxc.month_navigation_next);
            this.r1 = viewFindViewById2;
            viewFindViewById2.setTag("NAVIGATION_NEXT_TAG");
            this.s1 = viewInflate.findViewById(uxc.mtrl_calendar_year_selector_frame);
            this.t1 = viewInflate.findViewById(uxc.mtrl_calendar_day_selector_frame);
            t0(1);
            materialButton.setText(this.l1.d());
            this.p1.m(new oq8(this, cVar, materialButton));
            materialButton.setOnClickListener(new r6(5, this));
            this.r1.setOnClickListener(new lq8(this, cVar, 1));
            this.q1.setOnClickListener(new lq8(this, cVar, 0));
        }
        if (!MaterialDatePicker.A0(contextThemeWrapper, R.attr.windowFullscreen)) {
            new gf4(1).a(this.p1);
        }
        this.p1.x0(cVar.d.a.e(this.l1));
        hfh.n(this.p1, new mq8(1));
        return viewInflate;
    }

    @Override // androidx.fragment.app.a
    public final void b0(Bundle bundle) {
        bundle.putInt("THEME_RES_ID_KEY", this.j1);
        bundle.putParcelable("GRID_SELECTOR_KEY", null);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.k1);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
        bundle.putParcelable("CURRENT_MONTH_KEY", this.l1);
    }

    public final void s0(g2a g2aVar) {
        c cVar = (c) this.p1.getAdapter();
        int iE = cVar.d.a.e(g2aVar);
        int iE2 = iE - cVar.d.a.e(this.l1);
        boolean z = Math.abs(iE2) > 3;
        boolean z2 = iE2 > 0;
        this.l1 = g2aVar;
        if (z && z2) {
            this.p1.x0(iE - 3);
            this.p1.post(new xk0(this, iE, 2));
        } else if (!z) {
            this.p1.post(new xk0(this, iE, 2));
        } else {
            this.p1.x0(iE + 3);
            this.p1.post(new xk0(this, iE, 2));
        }
    }

    public final void t0(int i) {
        this.m1 = i;
        if (i == 2) {
            this.o1.getLayoutManager().z0(this.l1.c - ((g7i) this.o1.getAdapter()).d.k1.a.c);
            this.s1.setVisibility(0);
            this.t1.setVisibility(8);
            this.q1.setVisibility(8);
            this.r1.setVisibility(8);
            return;
        }
        if (i == 1) {
            this.s1.setVisibility(8);
            this.t1.setVisibility(0);
            this.q1.setVisibility(0);
            this.r1.setVisibility(0);
            s0(this.l1);
        }
    }
}
