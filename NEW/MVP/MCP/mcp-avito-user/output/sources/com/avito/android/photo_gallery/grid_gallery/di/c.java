package com.avito.android.photo_gallery.grid_gallery.di;

import Y41.l;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.di.InterfaceC30272y;
import com.avito.android.photo_gallery.grid_gallery.GridGalleryActivity;
import com.avito.android.photo_gallery.grid_gallery.GridGalleryOpenParams;
import cv.InterfaceC39417a;
import h31.d;
import kotlin.Metadata;

/* compiled from: GridGalleryComponent.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/photo_gallery/grid_gallery/di/c;", "", "a", "_avito_photo-gallery_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC30272y
@h31.d
/* loaded from: classes14.dex */
public interface c {

    /* compiled from: GridGalleryComponent.kt */
    @d.b
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/photo_gallery/grid_gallery/di/c$a;", "", "_avito_photo-gallery_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a {
        @Y61.k
        c a(@Y61.k d dVar, @Y61.k kj.c cVar, @Y61.k InterfaceC39417a interfaceC39417a, @h31.b @Y61.k C28478k c28478k, @h31.b @Y61.k l lVar, @h31.b @Y61.k GridGalleryOpenParams gridGalleryOpenParams);
    }

    void a(@Y61.k GridGalleryActivity gridGalleryActivity);
}
