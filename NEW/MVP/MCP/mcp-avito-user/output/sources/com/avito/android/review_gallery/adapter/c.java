package com.avito.android.review_gallery.adapter;

import Y61.k;
import Y61.l;
import android.view.MotionEvent;
import android.view.View;
import kotlin.Metadata;

/* compiled from: ReviewGalleryFragment.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/review_gallery/adapter/c;", "Landroid/view/View$OnTouchListener;", "_avito_review-gallery_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class c implements View.OnTouchListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ReviewGalleryFragment f255471b;

    public c(ReviewGalleryFragment reviewGalleryFragment) {
        this.f255471b = reviewGalleryFragment;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(@l View view, @k MotionEvent motionEvent) {
        if (motionEvent.getAction() != 0) {
            return false;
        }
        com.avito.android.lib.design.zoom.d dVar = this.f255471b.f255459p0;
        dVar.n(dVar.f181319h);
        return false;
    }
}
