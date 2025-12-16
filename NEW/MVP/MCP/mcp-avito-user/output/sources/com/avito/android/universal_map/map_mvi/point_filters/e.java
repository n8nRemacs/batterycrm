package com.avito.android.universal_map.map_mvi.point_filters;

import Y61.k;
import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import kotlin.Metadata;
import rG0.AbstractC47541a;

/* compiled from: UniversalMapPinFiltersMviView.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/universal_map/map_mvi/point_filters/e;", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior$c;", "_avito_universal-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class e extends BottomSheetBehavior.c {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f306275b;

    public e(d dVar) {
        this.f306275b = dVar;
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.c
    public final void onStateChanged(@k View view, int i12) {
        d dVar = this.f306275b;
        if (i12 == 4) {
            dVar.f306249a.invalidate();
            dVar.f306249a.requestLayout();
        } else {
            if (i12 != 5) {
                return;
            }
            dVar.f306254f.invoke(AbstractC47541a.AbstractC12359a.b.f429673a);
            dVar.c();
        }
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.c
    public final void onSlide(@k View view, float f12) {
    }
}
