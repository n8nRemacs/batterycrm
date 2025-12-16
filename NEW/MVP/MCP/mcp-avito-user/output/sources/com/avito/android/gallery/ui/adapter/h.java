package com.avito.android.gallery.ui.adapter;

import Y61.k;
import android.graphics.PointF;
import android.view.GestureDetector;
import android.view.MotionEvent;
import com.avito.android.gallery.ui.adapter.GalleryFragment;
import kotlin.Metadata;

/* compiled from: GalleryFragment.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/gallery/ui/adapter/h;", "Landroid/view/GestureDetector$SimpleOnGestureListener;", "_avito_gallery_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class h extends GestureDetector.SimpleOnGestureListener {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final PointF f159275b = new PointF();

    /* renamed from: c, reason: collision with root package name */
    @k
    public final PointF f159276c = new PointF();

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.lib.design.zoom.d f159277d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ GalleryFragment f159278e;

    public h(com.avito.android.lib.design.zoom.d dVar, GalleryFragment galleryFragment) {
        this.f159277d = dVar;
        this.f159278e = galleryFragment;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTapEvent(@k MotionEvent motionEvent) {
        PointF pointF = new PointF(motionEvent.getX(), motionEvent.getY());
        com.avito.android.lib.design.zoom.d dVar = this.f159277d;
        PointF pointFR = dVar.r(pointF);
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f159275b.set(pointF);
            this.f159276c.set(pointFR);
        } else if (action == 1) {
            if (dVar.n(dVar.f181319h) < 1.5f) {
                this.f159277d.x(3.0f, pointFR, pointF, 300L);
            } else {
                this.f159277d.x(1.0f, pointFR, pointF, 300L);
            }
        }
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(@k MotionEvent motionEvent) {
        GalleryFragment.b bVar;
        GalleryFragment galleryFragment = this.f159278e;
        if (!galleryFragment.f159255t0 || (bVar = galleryFragment.f159253r0) == null) {
            return true;
        }
        bVar.a();
        return true;
    }
}
