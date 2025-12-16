package com.avito.android.photo_picker.edit;

import android.animation.Animator;
import android.view.View;
import com.avito.android.util.C35872q;
import kotlin.Metadata;

/* compiled from: EditPhotoFragment.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/photo_picker/edit/e;", "Lcom/avito/android/util/q$b;", "_avito_photo-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class e extends C35872q.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ EditPhotoFragment f219403a;

    public e(EditPhotoFragment editPhotoFragment) {
        this.f219403a = editPhotoFragment;
    }

    @Override // com.avito.android.util.C35872q.b, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(@Y61.k Animator animator) {
        View view = this.f219403a.f219359q0;
        if (view == null) {
            view = null;
        }
        view.setEnabled(true);
    }

    @Override // com.avito.android.util.C35872q.b, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(@Y61.k Animator animator) {
        View view = this.f219403a.f219359q0;
        if (view == null) {
            view = null;
        }
        view.setEnabled(false);
    }
}
