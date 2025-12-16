package com.avito.android.photo_gallery;

import android.graphics.PointF;
import android.view.GestureDetector;
import android.view.MotionEvent;
import com.avito.android.lib.design.zoom.ZoomableDraweeView;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: GalleryFragment.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/photo_gallery/g;", "Landroid/view/GestureDetector$SimpleOnGestureListener;", "_avito_photo-gallery_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.photo_gallery.g, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C33187g extends GestureDetector.SimpleOnGestureListener {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final PointF f217079b = new PointF();

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final PointF f217080c = new PointF();

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.lib.design.zoom.d f217081d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ GalleryFragment f217082e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ZoomableDraweeView f217083f;

    public C33187g(com.avito.android.lib.design.zoom.d dVar, GalleryFragment galleryFragment, ZoomableDraweeView zoomableDraweeView) {
        this.f217081d = dVar;
        this.f217082e = galleryFragment;
        this.f217083f = zoomableDraweeView;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTapEvent(@Y61.k MotionEvent motionEvent) {
        PointF pointF = new PointF(motionEvent.getX(), motionEvent.getY());
        com.avito.android.lib.design.zoom.d dVar = this.f217081d;
        PointF pointFR = dVar.r(pointF);
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f217079b.set(pointF);
            this.f217080c.set(pointFR);
        } else if (action == 1) {
            Y41.a<G0> aVar = this.f217082e.f216486F0;
            if (aVar != null) {
                aVar.invoke();
            }
            if (dVar.n(dVar.f181319h) < 1.5f) {
                this.f217081d.x(3.0f, pointFR, pointF, 300L);
            } else {
                this.f217081d.x(1.0f, pointFR, pointF, 300L);
            }
        }
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(@Y61.k MotionEvent motionEvent) {
        GalleryFragment galleryFragment = this.f217082e;
        if (!galleryFragment.f216511w0) {
            return true;
        }
        galleryFragment.onClick(this.f217083f);
        return true;
    }
}
