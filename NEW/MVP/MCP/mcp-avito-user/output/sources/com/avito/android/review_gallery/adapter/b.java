package com.avito.android.review_gallery.adapter;

import Y61.k;
import Y61.l;
import android.graphics.PointF;
import android.view.GestureDetector;
import android.view.MotionEvent;
import com.avito.android.lib.design.zoom.ZoomableDraweeView;
import kotlin.Metadata;

/* compiled from: ReviewGalleryFragment.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/review_gallery/adapter/b;", "Landroid/view/GestureDetector$SimpleOnGestureListener;", "_avito_review-gallery_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class b extends GestureDetector.SimpleOnGestureListener {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final PointF f255466b = new PointF();

    /* renamed from: c, reason: collision with root package name */
    @k
    public final PointF f255467c = new PointF();

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.lib.design.zoom.d f255468d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ReviewGalleryFragment f255469e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ZoomableDraweeView f255470f;

    public b(com.avito.android.lib.design.zoom.d dVar, ReviewGalleryFragment reviewGalleryFragment, ZoomableDraweeView zoomableDraweeView) {
        this.f255468d = dVar;
        this.f255469e = reviewGalleryFragment;
        this.f255470f = zoomableDraweeView;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTapEvent(@k MotionEvent motionEvent) {
        PointF pointF = new PointF(motionEvent.getX(), motionEvent.getY());
        com.avito.android.lib.design.zoom.d dVar = this.f255468d;
        PointF pointFR = dVar.r(pointF);
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f255466b.set(pointF);
            this.f255467c.set(pointFR);
        } else if (action == 1) {
            if (dVar.n(dVar.f181319h) < 1.5f) {
                this.f255468d.x(3.0f, pointFR, pointF, 300L);
            } else {
                this.f255468d.x(1.0f, pointFR, pointF, 300L);
            }
        }
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(@l MotionEvent motionEvent, @k MotionEvent motionEvent2, float f12, float f13) {
        if (this.f255469e.f255463t0) {
            com.avito.android.lib.design.zoom.d dVar = this.f255468d;
            if (dVar.n(dVar.f181319h) < 1.5f) {
                return true;
            }
        }
        return super.onScroll(motionEvent, motionEvent2, f12, f13);
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(@k MotionEvent motionEvent) {
        this.f255469e.onClick(this.f255470f);
        return true;
    }
}
