package com.google.android.material.timepicker;

import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.chip.Chip;
import defpackage.ar5;
import defpackage.k1d;
import defpackage.uxc;

/* loaded from: classes.dex */
class TimePickerView extends ConstraintLayout {
    public static final /* synthetic */ int G0 = 0;
    public final Chip F0;

    public TimePickerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        e eVar = new e(this);
        LayoutInflater.from(context).inflate(k1d.material_timepicker, this);
        MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) findViewById(uxc.material_clock_period_toggle);
        materialButtonToggleGroup.c.add(new d());
        Chip chip = (Chip) findViewById(uxc.material_minute_tv);
        Chip chip2 = (Chip) findViewById(uxc.material_hour_tv);
        this.F0 = chip2;
        ar5 ar5Var = new ar5(2, new GestureDetector(getContext(), new f(this)));
        chip.setOnTouchListener(ar5Var);
        chip2.setOnTouchListener(ar5Var);
        chip.setTag(uxc.selection_type, 12);
        chip2.setTag(uxc.selection_type, 10);
        chip.setOnClickListener(eVar);
        chip2.setOnClickListener(eVar);
        chip.setAccessibilityClassName("android.view.View");
        chip2.setAccessibilityClassName("android.view.View");
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        if (view == this && i == 0) {
            this.F0.sendAccessibilityEvent(8);
        }
    }
}
