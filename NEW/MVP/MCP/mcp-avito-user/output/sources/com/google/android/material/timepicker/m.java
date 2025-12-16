package com.google.android.material.timepicker;

import android.view.GestureDetector;
import android.view.MotionEvent;

/* compiled from: TimePickerView.java */
/* loaded from: classes6.dex */
class m extends GestureDetector.SimpleOnGestureListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TimePickerView f357696b;

    public m(TimePickerView timePickerView) {
        this.f357696b = timePickerView;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        MaterialTimePicker materialTimePicker = this.f357696b.f357656j;
        if (materialTimePicker == null) {
            return false;
        }
        materialTimePicker.f357634y0 = 1;
        materialTimePicker.d5(materialTimePicker.f357632w0);
        materialTimePicker.f357622m0.b();
        return true;
    }
}
