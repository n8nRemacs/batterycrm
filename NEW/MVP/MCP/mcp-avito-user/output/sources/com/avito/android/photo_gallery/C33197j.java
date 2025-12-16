package com.avito.android.photo_gallery;

import com.avito.android.analytics.screens.Screen;
import com.avito.android.photo_gallery.adapter.q;
import com.avito.android.pinch_to_zoom.PinchToZoomSource;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.NativeVideoStatus;
import com.avito.android.util.C35966w1;
import kotlin.Metadata;
import okhttp3.internal.http2.Http2;

/* compiled from: GalleryFragment.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_photo-gallery_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.photo_gallery.j, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C33197j {
    public static GalleryFragment a(Image image, boolean z12, GalleryFragmentType galleryFragmentType, boolean z13, boolean z14, String str, Screen screen, String str2, Float f12, q.g gVar, q.b bVar, NativeVideoStatus nativeVideoStatus, PinchToZoomSource pinchToZoomSource, String str3, Image image2, int i12) {
        boolean z15 = (i12 & 8) != 0 ? false : z13;
        String str4 = (i12 & 32) != 0 ? null : str;
        Float f13 = (i12 & 256) != 0 ? null : f12;
        NativeVideoStatus nativeVideoStatus2 = (i12 & 2048) != 0 ? null : nativeVideoStatus;
        PinchToZoomSource pinchToZoomSource2 = (i12 & 4096) != 0 ? null : pinchToZoomSource;
        String str5 = (i12 & 8192) != 0 ? null : str3;
        Image image3 = (i12 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? null : image2;
        GalleryFragment galleryFragment = new GalleryFragment();
        C35966w1.a(galleryFragment, -1, new C33196i(image, z12, galleryFragmentType, z15, screen, z14, str4, str2, gVar, bVar, nativeVideoStatus2, pinchToZoomSource2, str5, image3, f13));
        return galleryFragment;
    }
}
