package com.avito.android.universal_map.map.pin_filters;

import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import kotlin.Metadata;

/* compiled from: UniversalMapPinFiltersView.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/universal_map/map/pin_filters/i;", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior$c;", "_avito_universal-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class i extends BottomSheetBehavior.c {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f305745b;

    public i(h hVar) {
        this.f305745b = hVar;
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.c
    public final void onStateChanged(@Y61.k View view, int i12) {
        h hVar = this.f305745b;
        if (i12 == 4) {
            hVar.f305727a.invalidate();
            hVar.f305727a.requestLayout();
        } else {
            if (i12 != 5) {
                return;
            }
            hVar.f305740n.accept(Boolean.valueOf(hVar.f305743q));
            hVar.f305743q = true;
        }
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.c
    public final void onSlide(@Y61.k View view, float f12) {
    }
}
