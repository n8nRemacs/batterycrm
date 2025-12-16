package com.avito.android.universal_map.map_mvi.point_info;

import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import rG0.AbstractC47541a;

/* compiled from: UniversalMapPointInfoMviView.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/universal_map/map_mvi/point_info/e;", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior$c;", "_avito_universal-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class e extends BottomSheetBehavior.c {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f306285b;

    public e(g gVar) {
        this.f306285b = gVar;
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.c
    public final void onSlide(@Y61.k View view, float f12) {
        Float fValueOf = Float.valueOf(f12);
        if (Float.compare(fValueOf.floatValue(), Float.NaN) == 0) {
            fValueOf = null;
        }
        float fFloatValue = fValueOf != null ? fValueOf.floatValue() : 0.0f;
        com.avito.android.map_core.overlay.e eVar = this.f306285b.f306308v;
        if (eVar.f185676b.getHeight() == 0) {
            return;
        }
        eVar.f185676b.setAlpha(Math.max(-fFloatValue, 0.0f));
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.c
    public final void onStateChanged(@Y61.k View view, int i12) {
        if (i12 == 5) {
            g gVar = this.f306285b;
            gVar.f306294h.l(null, true);
            gVar.f306292f.invoke(AbstractC47541a.c.b.f429693a);
            gVar.e();
        }
    }
}
