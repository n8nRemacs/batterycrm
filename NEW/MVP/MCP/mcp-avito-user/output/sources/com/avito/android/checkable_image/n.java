package com.avito.android.checkable_image;

import android.view.View;
import com.avito.android.R;
import com.google.android.material.internal.CheckableImageButton;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.s0;

/* compiled from: View.kt */
@s0
@Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002¸\u0006\u0000"}, d2 = {"androidx/core/view/s0", "Landroid/view/View$OnAttachStateChangeListener;", "core-ktx_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class n implements View.OnAttachStateChangeListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CheckableImageButton f118102b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ CheckableImageButton f118103c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l0.h f118104d;

    public n(CheckableImageButton checkableImageButton, CheckableImageButton checkableImageButton2, l0.h hVar) {
        this.f118102b = checkableImageButton;
        this.f118103c = checkableImageButton2;
        this.f118104d = hVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.f118102b.removeOnAttachStateChangeListener(this);
        CheckableImageButton checkableImageButton = this.f118103c;
        checkableImageButton.setOnTouchListener(null);
        this.f118104d.f406842b = null;
        checkableImageButton.setTag(R.id.tag_favorite_lottie_enabled, null);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
