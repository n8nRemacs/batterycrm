package com.google.android.material.datepicker;

import android.R;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import defpackage.dwc;
import defpackage.g2a;
import defpackage.h2a;
import defpackage.k1d;
import defpackage.mid;
import defpackage.mz0;
import defpackage.phd;
import defpackage.usd;
import defpackage.uxc;
import defpackage.vxg;
import defpackage.xhd;
import java.util.Calendar;

/* loaded from: classes.dex */
public final class c extends phd {
    public final int X;
    public final mz0 d;
    public final usd o;

    public c(ContextThemeWrapper contextThemeWrapper, mz0 mz0Var, usd usdVar) {
        g2a g2aVar = mz0Var.a;
        g2a g2aVar2 = mz0Var.b;
        g2a g2aVar3 = mz0Var.d;
        if (g2aVar.a.compareTo(g2aVar3.a) > 0) {
            throw new IllegalArgumentException("firstPage cannot be after currentPage");
        }
        if (g2aVar3.a.compareTo(g2aVar2.a) > 0) {
            throw new IllegalArgumentException("currentPage cannot be after lastPage");
        }
        this.X = (contextThemeWrapper.getResources().getDimensionPixelSize(dwc.mtrl_calendar_day_height) * h2a.d) + (MaterialDatePicker.A0(contextThemeWrapper, R.attr.windowFullscreen) ? contextThemeWrapper.getResources().getDimensionPixelSize(dwc.mtrl_calendar_day_height) : 0);
        this.d = mz0Var;
        this.o = usdVar;
        A(true);
    }

    @Override // defpackage.phd
    public final int j() {
        return this.d.Y;
    }

    @Override // defpackage.phd
    public final long k(int i) {
        Calendar calendarA = vxg.a(this.d.a.a);
        calendarA.add(2, i);
        calendarA.set(5, 1);
        Calendar calendarA2 = vxg.a(calendarA);
        calendarA2.get(2);
        calendarA2.get(1);
        calendarA2.getMaximum(7);
        calendarA2.getActualMaximum(5);
        calendarA2.getTimeInMillis();
        return calendarA2.getTimeInMillis();
    }

    @Override // defpackage.phd
    public final void r(mid midVar, int i) {
        b bVar = (b) midVar;
        mz0 mz0Var = this.d;
        Calendar calendarA = vxg.a(mz0Var.a.a);
        calendarA.add(2, i);
        g2a g2aVar = new g2a(calendarA);
        bVar.E0.setText(g2aVar.d());
        MaterialCalendarGridView materialCalendarGridView = (MaterialCalendarGridView) bVar.F0.findViewById(uxc.month_grid);
        if (materialCalendarGridView.a() == null || !g2aVar.equals(materialCalendarGridView.a().a)) {
            new h2a(g2aVar, mz0Var);
            throw null;
        }
        materialCalendarGridView.invalidate();
        materialCalendarGridView.a().getClass();
        throw null;
    }

    @Override // defpackage.phd
    public final mid t(ViewGroup viewGroup, int i) {
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(viewGroup.getContext()).inflate(k1d.mtrl_calendar_month_labeled, viewGroup, false);
        if (!MaterialDatePicker.A0(viewGroup.getContext(), R.attr.windowFullscreen)) {
            return new b(linearLayout, false);
        }
        linearLayout.setLayoutParams(new xhd(-1, this.X));
        return new b(linearLayout, true);
    }
}
