package com.google.android.material.timepicker;

import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.R;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.chip.Chip;
import j.N;
import j.P;

/* loaded from: classes6.dex */
class TimePickerView extends ConstraintLayout implements h {

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ int f357647k = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Chip f357648b;

    /* renamed from: c, reason: collision with root package name */
    public final Chip f357649c;

    /* renamed from: d, reason: collision with root package name */
    public final ClockHandView f357650d;

    /* renamed from: e, reason: collision with root package name */
    public final ClockFaceView f357651e;

    /* renamed from: f, reason: collision with root package name */
    public final MaterialButtonToggleGroup f357652f;

    /* renamed from: g, reason: collision with root package name */
    public final View.OnClickListener f357653g;

    /* renamed from: h, reason: collision with root package name */
    public g f357654h;

    /* renamed from: i, reason: collision with root package name */
    public g f357655i;

    /* renamed from: j, reason: collision with root package name */
    public MaterialTimePicker f357656j;

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            g gVar = TimePickerView.this.f357655i;
            if (gVar != null) {
                gVar.a(((Integer) view.getTag(R.id.selection_type)).intValue(), true);
            }
        }
    }

    public interface b {
    }

    public interface c {
    }

    public interface d {
    }

    public TimePickerView(Context context, @P AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a aVar = new a();
        LayoutInflater.from(context).inflate(R.layout.material_timepicker, this);
        this.f357651e = (ClockFaceView) findViewById(R.id.material_clock_face);
        MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) findViewById(R.id.material_clock_period_toggle);
        this.f357652f = materialButtonToggleGroup;
        materialButtonToggleGroup.f356072d.add(new k(this, 1));
        Chip chip = (Chip) findViewById(R.id.material_minute_tv);
        this.f357648b = chip;
        Chip chip2 = (Chip) findViewById(R.id.material_hour_tv);
        this.f357649c = chip2;
        this.f357650d = (ClockHandView) findViewById(R.id.material_clock_hand);
        n nVar = new n(new GestureDetector(getContext(), new m(this)));
        chip.setOnTouchListener(nVar);
        chip2.setOnTouchListener(nVar);
        chip.setTag(R.id.selection_type, 12);
        chip2.setTag(R.id.selection_type, 10);
        chip.setOnClickListener(aVar);
        chip2.setOnClickListener(aVar);
        chip.setAccessibilityClassName("android.view.View");
        chip2.setAccessibilityClassName("android.view.View");
    }

    @Override // android.view.View
    public final void onVisibilityChanged(@N View view, int i12) {
        super.onVisibilityChanged(view, i12);
        if (view == this && i12 == 0) {
            this.f357649c.sendAccessibilityEvent(8);
        }
    }
}
