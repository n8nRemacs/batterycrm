package com.avito.android.service_booking_day_settings.daysettings;

import android.view.View;
import com.avito.android.lib.design.switcher.Switcher;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class l implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f276899b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f276900c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f276901d;

    public /* synthetic */ l(int i12, Object obj, Object obj2) {
        this.f276899b = i12;
        this.f276900c = obj;
        this.f276901d = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        com.avito.android.lib.design.toast_bar.k kVar;
        switch (this.f276899b) {
            case 0:
                h hVar = (h) this.f276901d;
                Switcher switcher = hVar.f276878h;
                ((f) ((Y41.l) this.f276900c)).invoke(Boolean.valueOf(switcher.isChecked()));
                if (switcher.isChecked() && (kVar = hVar.f276879i) != null) {
                    kVar.f();
                    break;
                }
                break;
            default:
                ((com.avito.android.lib.design.tooltip.k) this.f276900c).dismiss();
                ((Y41.a) this.f276901d).invoke();
                break;
        }
    }
}
