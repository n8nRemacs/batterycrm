package com.avito.android.photo_picker.edit;

import android.animation.ValueAnimator;
import com.avito.android.krop.KropView;
import com.avito.android.util.C35835l0;
import kotlin.Metadata;

/* compiled from: EditPhotoFragment.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/photo_picker/edit/f;", "Lcom/avito/android/krop/KropView$a;", "_avito_photo-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class f implements KropView.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ EditPhotoFragment f219404a;

    public f(EditPhotoFragment editPhotoFragment) {
        this.f219404a = editPhotoFragment;
    }

    @Override // com.avito.android.krop.KropView.a
    public final void a() {
        EditPhotoFragment editPhotoFragment = this.f219404a;
        ValueAnimator valueAnimator = editPhotoFragment.f219363u0;
        if (valueAnimator == null) {
            valueAnimator = null;
        }
        valueAnimator.cancel();
        if (!editPhotoFragment.f219364v0) {
            editPhotoFragment.b5(C35835l0.d(editPhotoFragment.f219362t0, editPhotoFragment.requireContext()));
            editPhotoFragment.f219364v0 = true;
        }
        ValueAnimator valueAnimator2 = editPhotoFragment.f219363u0;
        ValueAnimator valueAnimator3 = valueAnimator2 != null ? valueAnimator2 : null;
        valueAnimator3.setStartDelay(1500L);
        valueAnimator3.start();
    }
}
