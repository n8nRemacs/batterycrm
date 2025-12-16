package com.google.android.material.datepicker;

import android.view.View;
import android.widget.AdapterView;
import defpackage.h2a;

/* loaded from: classes.dex */
public final class a implements AdapterView.OnItemClickListener {
    public final /* synthetic */ MaterialCalendarGridView a;
    public final /* synthetic */ c b;

    public a(c cVar, MaterialCalendarGridView materialCalendarGridView) {
        this.b = cVar;
        this.a = materialCalendarGridView;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        MaterialCalendarGridView materialCalendarGridView = this.a;
        h2a h2aVarA = materialCalendarGridView.a();
        if (i < h2aVarA.a() || i > h2aVarA.c()) {
            return;
        }
        if (materialCalendarGridView.a().getItem(i).longValue() >= ((MaterialCalendar) this.b.o.b).k1.c.a) {
            throw null;
        }
    }
}
