package com.avito.android.universal_map.map.point_info;

import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: UniversalMapPointInfoView.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/universal_map/map/point_info/k;", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior$c;", "_avito_universal-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class k extends BottomSheetBehavior.c {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m f305826b;

    public k(m mVar) {
        this.f305826b = mVar;
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.c
    public final void onSlide(@Y61.k View view, float f12) {
        Float fValueOf = Float.valueOf(f12);
        if (Float.compare(fValueOf.floatValue(), Float.NaN) == 0) {
            fValueOf = null;
        }
        float fFloatValue = fValueOf != null ? fValueOf.floatValue() : 0.0f;
        com.avito.android.map_core.overlay.e eVar = this.f305826b.f305852y;
        if (eVar.f185676b.getHeight() == 0) {
            return;
        }
        eVar.f185676b.setAlpha(Math.max(-fFloatValue, 0.0f));
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.c
    public final void onStateChanged(@Y61.k View view, int i12) {
        if (i12 == 5) {
            m mVar = this.f305826b;
            mVar.f305834g.l(null, true);
            mVar.f305849v.accept(G0.f406611a);
            mVar.h();
        }
    }
}
