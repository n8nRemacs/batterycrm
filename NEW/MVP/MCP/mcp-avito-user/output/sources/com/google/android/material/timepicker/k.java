package com.google.android.material.timepicker;

import com.google.android.material.R;
import com.google.android.material.button.MaterialButtonToggleGroup;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class k implements MaterialButtonToggleGroup.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f357680a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f357681b;

    public /* synthetic */ k(Object obj, int i12) {
        this.f357680a = i12;
        this.f357681b = obj;
    }

    @Override // com.google.android.material.button.MaterialButtonToggleGroup.d
    public final void a(int i12, boolean z12) {
        Object obj = this.f357681b;
        switch (this.f357680a) {
            case 0:
                l lVar = (l) obj;
                lVar.getClass();
                if (z12) {
                    lVar.f357683c.f(i12 == R.id.material_clock_period_pm_button ? 1 : 0);
                    break;
                }
                break;
            default:
                TimePickerView timePickerView = (TimePickerView) obj;
                if (!z12) {
                    int i13 = TimePickerView.f357647k;
                    timePickerView.getClass();
                    break;
                } else {
                    g gVar = timePickerView.f357654h;
                    if (gVar != null) {
                        gVar.f357670c.f(i12 == R.id.material_clock_period_pm_button ? 1 : 0);
                        break;
                    }
                }
                break;
        }
    }
}
