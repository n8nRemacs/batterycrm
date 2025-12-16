package com.google.android.material.datepicker;

import android.widget.LinearLayout;
import android.widget.TextView;
import defpackage.gzc;
import defpackage.hfh;
import defpackage.mid;
import defpackage.reh;
import defpackage.uxc;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class b extends mid {
    public final TextView E0;
    public final MaterialCalendarGridView F0;

    public b(LinearLayout linearLayout, boolean z) {
        super(linearLayout);
        TextView textView = (TextView) linearLayout.findViewById(uxc.month_title);
        this.E0 = textView;
        WeakHashMap weakHashMap = hfh.a;
        new reh(gzc.tag_accessibility_heading, Boolean.class, 0, 28, 3).f(textView, Boolean.TRUE);
        this.F0 = (MaterialCalendarGridView) linearLayout.findViewById(uxc.month_grid);
        if (z) {
            return;
        }
        textView.setVisibility(8);
    }
}
