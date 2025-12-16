package com.avito.android.photo_gallery;

import android.view.MotionEvent;
import android.view.View;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: GalleryFragment.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/photo_gallery/h;", "Landroid/view/View$OnTouchListener;", "_avito_photo-gallery_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.photo_gallery.h, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class ViewOnTouchListenerC33195h implements View.OnTouchListener {

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public Float f217455b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ GalleryFragment f217456c;

    public ViewOnTouchListenerC33195h(GalleryFragment galleryFragment) {
        this.f217456c = galleryFragment;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(@Y61.l View view, @Y61.k MotionEvent motionEvent) {
        Y41.a<G0> aVar;
        int action = motionEvent.getAction();
        GalleryFragment galleryFragment = this.f217456c;
        if (action == 0) {
            com.avito.android.lib.design.zoom.d dVar = galleryFragment.f216503o0;
            this.f217455b = Float.valueOf(dVar.n(dVar.f181319h));
            return false;
        }
        if (action != 1) {
            return false;
        }
        com.avito.android.lib.design.zoom.d dVar2 = galleryFragment.f216503o0;
        if (kotlin.jvm.internal.L.b(dVar2.n(dVar2.f181319h), this.f217455b) || (aVar = galleryFragment.f216486F0) == null) {
            return false;
        }
        aVar.invoke();
        return false;
    }
}
