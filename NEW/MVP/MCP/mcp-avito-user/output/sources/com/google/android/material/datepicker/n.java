package com.google.android.material.datepicker;

import android.view.View;
import com.google.android.material.datepicker.MaterialCalendar;

/* compiled from: MaterialCalendar.java */
/* loaded from: classes6.dex */
class n implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MaterialCalendar f356545b;

    public n(MaterialCalendar materialCalendar) {
        this.f356545b = materialCalendar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        MaterialCalendar materialCalendar = this.f356545b;
        MaterialCalendar.d dVar = materialCalendar.f356437l0;
        MaterialCalendar.d dVar2 = MaterialCalendar.d.f356449c;
        MaterialCalendar.d dVar3 = MaterialCalendar.d.f356448b;
        if (dVar == dVar2) {
            materialCalendar.d5(dVar3);
        } else if (dVar == dVar3) {
            materialCalendar.d5(dVar2);
        }
    }
}
