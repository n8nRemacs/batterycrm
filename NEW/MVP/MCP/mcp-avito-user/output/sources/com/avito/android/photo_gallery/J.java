package com.avito.android.photo_gallery;

import android.view.GestureDetector;
import android.view.MotionEvent;
import kotlin.Metadata;

/* compiled from: PhotoGallerySwipeCloseView.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/photo_gallery/J;", "Landroid/view/GestureDetector$SimpleOnGestureListener;", "_avito_photo-gallery_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class J extends GestureDetector.SimpleOnGestureListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PhotoGallerySwipeCloseView f216527b;

    public J(PhotoGallerySwipeCloseView photoGallerySwipeCloseView) {
        this.f216527b = photoGallerySwipeCloseView;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onFling(@Y61.l MotionEvent motionEvent, @Y61.k MotionEvent motionEvent2, float f12, float f13) {
        PhotoGallerySwipeCloseView photoGallerySwipeCloseView = this.f216527b;
        photoGallerySwipeCloseView.f216672b = false;
        if (photoGallerySwipeCloseView.f216678h != null) {
            f13 = 0.0f;
        }
        photoGallerySwipeCloseView.a(f13);
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(@Y61.l MotionEvent motionEvent, @Y61.k MotionEvent motionEvent2, float f12, float f13) {
        int i12 = (int) f13;
        PhotoGallerySwipeCloseView photoGallerySwipeCloseView = this.f216527b;
        if (photoGallerySwipeCloseView.f216678h == null) {
            photoGallerySwipeCloseView.setScrollY(photoGallerySwipeCloseView.getScrollY() + i12);
            return true;
        }
        if (kotlin.jvm.internal.L.f(photoGallerySwipeCloseView.f216679i, Boolean.TRUE)) {
            photoGallerySwipeCloseView.setScrollY(Math.max(0, photoGallerySwipeCloseView.getScrollY() + i12));
            return true;
        }
        if (kotlin.jvm.internal.L.f(photoGallerySwipeCloseView.f216679i, Boolean.FALSE)) {
            photoGallerySwipeCloseView.setScrollY(Math.min(0, photoGallerySwipeCloseView.getScrollY() + i12));
            return true;
        }
        photoGallerySwipeCloseView.setScrollY(photoGallerySwipeCloseView.getScrollY() + i12);
        return true;
    }
}
