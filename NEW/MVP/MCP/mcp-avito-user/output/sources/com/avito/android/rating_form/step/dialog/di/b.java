package com.avito.android.rating_form.step.dialog.di;

import Y61.k;
import androidx.view.S0;
import com.avito.android.di.B;
import com.avito.android.rating_form.di.e;
import com.avito.android.rating_form.di.g;
import com.avito.android.rating_form.step.RatingFormStepArguments;
import com.avito.android.rating_form.step.dialog.BottomSheetDialogFragment;
import com.avito.android.rating_form.step.dialog.DialogInfo;
import com.avito.android.rating_form.step.dialog.FullscreenDialogFragment;
import cv.InterfaceC39417a;
import h31.d;
import kotlin.Metadata;

/* compiled from: RatingFormDialogComponent.kt */
@B
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/rating_form/step/dialog/di/b;", "", "a", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@d
/* loaded from: classes16.dex */
public interface b {

    /* compiled from: RatingFormDialogComponent.kt */
    @d.b
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/rating_form/step/dialog/di/b$a;", "", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a {
        @k
        b a(@h31.b @k S0 s02, @h31.b @k RatingFormStepArguments ratingFormStepArguments, @h31.b @k DialogInfo dialogInfo, @k g gVar, @k InterfaceC39417a interfaceC39417a, @k e eVar);
    }

    void a(@k FullscreenDialogFragment fullscreenDialogFragment);

    void b(@k BottomSheetDialogFragment bottomSheetDialogFragment);
}
