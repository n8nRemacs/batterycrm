package com.avito.android.tariff_lf_constructor.configure.creating.bottom_sheet;

import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import kotlin.Metadata;

/* compiled from: ConstructorTariffBottomSheetActivity.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/tariff_lf_constructor/configure/creating/bottom_sheet/d;", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior$c;", "_avito_tariff-lf-constructor_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class d extends BottomSheetBehavior.c {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BottomSheetBehavior<?> f299561b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ConstructorTariffBottomSheetActivity f299562c;

    public d(BottomSheetBehavior<?> bottomSheetBehavior, ConstructorTariffBottomSheetActivity constructorTariffBottomSheetActivity) {
        this.f299561b = bottomSheetBehavior;
        this.f299562c = constructorTariffBottomSheetActivity;
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.c
    public final void onStateChanged(@Y61.k View view, int i12) {
        if (this.f299561b.f355975L == 4) {
            this.f299562c.x0(true);
        }
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.c
    public final void onSlide(@Y61.k View view, float f12) {
    }
}
