package com.avito.android.universal_map.map_mvi.point_info;

import android.view.View;
import com.avito.android.util.D6;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import kotlin.Metadata;
import rG0.AbstractC47541a;

/* compiled from: UniversalMapPointInfoViewMviV2Impl.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/universal_map/map_mvi/point_info/j;", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior$c;", "_avito_universal-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class j extends BottomSheetBehavior.c {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o f306319b;

    public j(o oVar) {
        this.f306319b = oVar;
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.c
    public final void onSlide(@Y61.k View view, float f12) {
        o.e(this.f306319b, view, f12 >= 0.0f);
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.c
    public final void onStateChanged(@Y61.k View view, int i12) {
        o oVar = this.f306319b;
        if (i12 == 4) {
            D6.w(oVar.f306349y.f185676b);
        } else {
            if (i12 != 5) {
                return;
            }
            oVar.f306333i.l(null, true);
            oVar.f306331g.invoke(AbstractC47541a.c.b.f429693a);
            oVar.f();
        }
    }
}
