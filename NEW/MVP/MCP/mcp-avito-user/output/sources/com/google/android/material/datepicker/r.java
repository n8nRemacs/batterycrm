package com.google.android.material.datepicker;

import android.view.View;

/* compiled from: MaterialDatePicker.java */
/* loaded from: classes6.dex */
class r implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MaterialDatePicker f356551b;

    public r(MaterialDatePicker materialDatePicker) {
        this.f356551b = materialDatePicker;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        MaterialDatePicker materialDatePicker = this.f356551b;
        materialDatePicker.f356454B0.setEnabled(materialDatePicker.b5().C4());
        materialDatePicker.f356478z0.toggle();
        materialDatePicker.f5(materialDatePicker.f356478z0);
        materialDatePicker.e5();
    }
}
