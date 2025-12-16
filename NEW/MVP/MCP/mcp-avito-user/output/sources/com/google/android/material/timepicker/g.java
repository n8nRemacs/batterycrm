package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.view.View;
import androidx.core.view.A0;
import androidx.core.view.C22823h0;
import com.google.android.material.R;
import com.google.android.material.chip.Chip;
import com.google.android.material.timepicker.ClockHandView;
import com.google.android.material.timepicker.TimePickerView;
import java.util.Locale;
import java.util.WeakHashMap;

/* compiled from: TimePickerClockPresenter.java */
/* loaded from: classes6.dex */
class g implements ClockHandView.c, TimePickerView.d, TimePickerView.c, ClockHandView.b, i {

    /* renamed from: g, reason: collision with root package name */
    public static final String[] f357666g = {"12", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11"};

    /* renamed from: h, reason: collision with root package name */
    public static final String[] f357667h = {"00", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23"};

    /* renamed from: i, reason: collision with root package name */
    public static final String[] f357668i = {"00", "5", "10", "15", "20", "25", "30", "35", "40", "45", "50", "55"};

    /* renamed from: b, reason: collision with root package name */
    public final TimePickerView f357669b;

    /* renamed from: c, reason: collision with root package name */
    public final TimeModel f357670c;

    /* renamed from: d, reason: collision with root package name */
    public float f357671d;

    /* renamed from: e, reason: collision with root package name */
    public float f357672e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f357673f = false;

    /* compiled from: TimePickerClockPresenter.java */
    public class a extends com.google.android.material.timepicker.a {
        public a(Context context, int i12) {
            super(context, i12);
        }

        @Override // com.google.android.material.timepicker.a, androidx.core.view.C22808a
        public final void d(View view, androidx.core.view.accessibility.f fVar) {
            super.d(view, fVar);
            Resources resources = view.getResources();
            TimeModel timeModel = g.this.f357670c;
            fVar.o(resources.getString(timeModel.f357642d == 1 ? R.string.material_hour_24h_suffix : R.string.material_hour_suffix, String.valueOf(timeModel.c())));
        }
    }

    /* compiled from: TimePickerClockPresenter.java */
    public class b extends com.google.android.material.timepicker.a {
        public b(Context context, int i12) {
            super(context, i12);
        }

        @Override // com.google.android.material.timepicker.a, androidx.core.view.C22808a
        public final void d(View view, androidx.core.view.accessibility.f fVar) {
            super.d(view, fVar);
            fVar.o(view.getResources().getString(R.string.material_minute_suffix, String.valueOf(g.this.f357670c.f357644f)));
        }
    }

    public g(TimePickerView timePickerView, TimeModel timeModel) {
        this.f357669b = timePickerView;
        this.f357670c = timeModel;
        if (timeModel.f357642d == 0) {
            timePickerView.f357652f.setVisibility(0);
        }
        timePickerView.f357650d.f357602k.add(this);
        timePickerView.f357655i = this;
        timePickerView.f357654h = this;
        timePickerView.f357650d.f357610s = this;
        String[] strArr = f357666g;
        for (int i12 = 0; i12 < 12; i12++) {
            strArr[i12] = TimeModel.a(this.f357669b.getResources(), strArr[i12], "%d");
        }
        String[] strArr2 = f357668i;
        for (int i13 = 0; i13 < 12; i13++) {
            strArr2[i13] = TimeModel.a(this.f357669b.getResources(), strArr2[i13], "%02d");
        }
        invalidate();
    }

    public final void a(int i12, boolean z12) {
        boolean z13 = i12 == 12;
        TimePickerView timePickerView = this.f357669b;
        timePickerView.f357650d.f357596e = z13;
        TimeModel timeModel = this.f357670c;
        timeModel.f357645g = i12;
        int i13 = timeModel.f357642d;
        String[] strArr = z13 ? f357668i : i13 == 1 ? f357667h : f357666g;
        int i14 = z13 ? R.string.material_minute_suffix : i13 == 1 ? R.string.material_hour_24h_suffix : R.string.material_hour_suffix;
        ClockFaceView clockFaceView = timePickerView.f357651e;
        clockFaceView.i(i14, strArr);
        int i15 = (timeModel.f357645g == 10 && i13 == 1 && timeModel.f357643e >= 12) ? 2 : 1;
        ClockHandView clockHandView = clockFaceView.f357575e;
        clockHandView.f357613v = i15;
        clockHandView.invalidate();
        timePickerView.f357650d.c(z13 ? this.f357671d : this.f357672e, z12);
        boolean z14 = i12 == 12;
        Chip chip = timePickerView.f357648b;
        chip.setChecked(z14);
        int i16 = z14 ? 2 : 0;
        WeakHashMap<View, A0> weakHashMap = C22823h0.f45055a;
        chip.setAccessibilityLiveRegion(i16);
        boolean z15 = i12 == 10;
        Chip chip2 = timePickerView.f357649c;
        chip2.setChecked(z15);
        chip2.setAccessibilityLiveRegion(z15 ? 2 : 0);
        C22823h0.C(chip2, new a(timePickerView.getContext(), R.string.material_hour_selection));
        C22823h0.C(chip, new b(timePickerView.getContext(), R.string.material_minute_selection));
    }

    @Override // com.google.android.material.timepicker.ClockHandView.c
    public final void b(float f12, boolean z12) {
        if (this.f357673f) {
            return;
        }
        TimeModel timeModel = this.f357670c;
        int i12 = timeModel.f357643e;
        int i13 = timeModel.f357644f;
        int iRound = Math.round(f12);
        int i14 = timeModel.f357645g;
        TimePickerView timePickerView = this.f357669b;
        if (i14 == 12) {
            timeModel.e((iRound + 3) / 6);
            this.f357671d = (float) Math.floor(timeModel.f357644f * 6);
        } else {
            int i15 = (iRound + 15) / 30;
            if (timeModel.f357642d == 1) {
                i15 %= 12;
                if (timePickerView.f357651e.f357575e.f357613v == 2) {
                    i15 += 12;
                }
            }
            timeModel.d(i15);
            this.f357672e = (timeModel.c() * 30) % 360;
        }
        if (z12) {
            return;
        }
        c();
        if (timeModel.f357644f == i13 && timeModel.f357643e == i12) {
            return;
        }
        timePickerView.performHapticFeedback(4);
    }

    public final void c() {
        TimeModel timeModel = this.f357670c;
        int i12 = timeModel.f357646h;
        int iC2 = timeModel.c();
        int i13 = timeModel.f357644f;
        TimePickerView timePickerView = this.f357669b;
        timePickerView.getClass();
        timePickerView.f357652f.b(i12 == 1 ? R.id.material_clock_period_pm_button : R.id.material_clock_period_am_button, true);
        Locale locale = timePickerView.getResources().getConfiguration().locale;
        String str = String.format(locale, "%02d", Integer.valueOf(i13));
        String str2 = String.format(locale, "%02d", Integer.valueOf(iC2));
        Chip chip = timePickerView.f357648b;
        if (!TextUtils.equals(chip.getText(), str)) {
            chip.setText(str);
        }
        Chip chip2 = timePickerView.f357649c;
        if (TextUtils.equals(chip2.getText(), str2)) {
            return;
        }
        chip2.setText(str2);
    }

    @Override // com.google.android.material.timepicker.i
    public final void hide() {
        this.f357669b.setVisibility(8);
    }

    @Override // com.google.android.material.timepicker.i
    public final void invalidate() {
        TimeModel timeModel = this.f357670c;
        this.f357672e = (timeModel.c() * 30) % 360;
        this.f357671d = timeModel.f357644f * 6;
        a(timeModel.f357645g, false);
        c();
    }

    @Override // com.google.android.material.timepicker.i
    public final void show() {
        this.f357669b.setVisibility(0);
    }
}
