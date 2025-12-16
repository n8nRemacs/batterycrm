package com.yandex.mobile.ads.impl;

import android.view.View;
import android.widget.ProgressBar;
import com.yandex.mobile.ads.impl.t50;

/* loaded from: classes8.dex */
public final class m40 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final k60 f387843a;

    public m40(@j.N k60 k60Var) {
        this.f387843a = k60Var;
    }

    @j.N
    public final t50 a(@j.N se1 se1Var, @j.N t50 t50Var) {
        boolean z12 = this.f387843a.getVolume() == 0.0f;
        View viewL = se1Var.l();
        Float fValueOf = null;
        Boolean boolValueOf = viewL != null ? Boolean.valueOf(viewL.isEnabled()) : null;
        ProgressBar progressBarJ = se1Var.j();
        if (progressBarJ != null) {
            int progress = progressBarJ.getProgress();
            int max = progressBarJ.getMax();
            if (max != 0) {
                fValueOf = Float.valueOf(progress / max);
            }
        }
        t50.a aVar = new t50.a();
        aVar.b(z12);
        if (boolValueOf != null) {
            aVar.a(boolValueOf.booleanValue());
        }
        if (fValueOf != null) {
            aVar.b(fValueOf.floatValue());
        }
        aVar.a(t50Var.a());
        return aVar.a();
    }
}
