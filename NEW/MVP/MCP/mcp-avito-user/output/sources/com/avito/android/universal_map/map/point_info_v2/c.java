package com.avito.android.universal_map.map.point_info_v2;

import Y61.k;
import android.view.View;
import com.avito.android.util.D6;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: UniversalMapPointInfoViewV2Impl.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/universal_map/map/point_info_v2/c;", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior$c;", "_avito_universal-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class c extends BottomSheetBehavior.c {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f305907b;

    public c(h hVar) {
        this.f305907b = hVar;
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.c
    public final void onSlide(@k View view, float f12) {
        h.g(this.f305907b, view, f12 >= 0.0f);
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.c
    public final void onStateChanged(@k View view, int i12) {
        h hVar = this.f305907b;
        if (i12 == 4) {
            D6.w(hVar.f305914B.f185676b);
        } else {
            if (i12 != 5) {
                return;
            }
            hVar.f305922h.l(null, true);
            hVar.f305939y.accept(G0.f406611a);
            hVar.h();
        }
    }
}
