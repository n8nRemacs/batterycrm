package com.google.android.material.datepicker;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.core.view.C22808a;
import com.google.android.material.R;
import j.N;

/* compiled from: MaterialCalendar.java */
/* loaded from: classes6.dex */
class l extends C22808a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ MaterialCalendar f356541d;

    public l(MaterialCalendar materialCalendar) {
        this.f356541d = materialCalendar;
    }

    @Override // androidx.core.view.C22808a
    public final void d(View view, @N androidx.core.view.accessibility.f fVar) {
        View.AccessibilityDelegate accessibilityDelegate = this.f44991a;
        AccessibilityNodeInfo accessibilityNodeInfo = fVar.f44999a;
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        MaterialCalendar materialCalendar = this.f356541d;
        accessibilityNodeInfo.setHintText(materialCalendar.f356444s0.getVisibility() == 0 ? materialCalendar.getString(R.string.mtrl_picker_toggle_to_year_selection) : materialCalendar.getString(R.string.mtrl_picker_toggle_to_day_selection));
    }
}
