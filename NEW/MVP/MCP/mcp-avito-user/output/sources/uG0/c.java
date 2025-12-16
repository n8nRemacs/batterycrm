package Ug0;

import Y61.k;
import android.view.View;
import com.avito.android.rating_form.activity.bottom_sheet.RatingFormBottomSheetActivity;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import kotlin.Metadata;

/* compiled from: RatingFormBottomSheetActivity.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LUg0/c;", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior$c;", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class c extends BottomSheetBehavior.c {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ RatingFormBottomSheetActivity f16551b;

    public c(RatingFormBottomSheetActivity ratingFormBottomSheetActivity) {
        this.f16551b = ratingFormBottomSheetActivity;
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.c
    public final void onStateChanged(@k View view, int i12) {
        if (i12 == 5) {
            this.f16551b.finish();
        }
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.c
    public final void onSlide(@k View view, float f12) {
    }
}
