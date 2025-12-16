package com.avito.android.interior_photos_block;

import android.view.View;
import com.avito.android.interior_photos_block.entity.InteriorPhotoBlock;
import iO.InterfaceC41322a;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: View.kt */
@s0
@Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002¸\u0006\u0000"}, d2 = {"androidx/core/view/r0", "Landroid/view/View$OnAttachStateChangeListener;", "core-ktx_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class g implements View.OnAttachStateChangeListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f173046b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ k f173047c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ InteriorPhotoBlock f173048d;

    public g(View view, k kVar, InteriorPhotoBlock interiorPhotoBlock) {
        this.f173046b = view;
        this.f173047c = kVar;
        this.f173048d = interiorPhotoBlock;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.f173046b.removeOnAttachStateChangeListener(this);
        ((com.avito.android.interior_photos_block.mvi.k) this.f173047c.f173055d.getValue()).accept(new InterfaceC41322a.C11374a(this.f173048d));
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
