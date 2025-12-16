package com.avito.android.review_gallery.di;

import C11.b;
import Y61.k;
import Y61.l;
import com.avito.android.analytics.screens.ReviewGalleryScreen;
import com.avito.android.analytics.screens.r;
import com.avito.android.di.C;
import com.avito.android.di.InterfaceC29971h;
import com.avito.android.di.InterfaceC30272y;
import com.avito.android.review_gallery.ReviewGalleryActivity;
import kotlin.Metadata;

/* compiled from: ReviewGalleryActivityComponent.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/review_gallery/di/c;", "", "a", "b", "_avito_review-gallery_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@C
@C11.b
@InterfaceC30272y
/* loaded from: classes12.dex */
public interface c {

    /* compiled from: ReviewGalleryActivityComponent.kt */
    @b.a
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/review_gallery/di/c$a;", "", "_avito_review-gallery_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a {
        @k
        c a(@h31.b @k ReviewGalleryScreen reviewGalleryScreen, @h31.b @k r rVar, @com.avito.android.review_gallery.di.a @h31.b @k String str, @h31.b @l @com.avito.android.review_gallery.di.b String str2, @h31.b int i12, @k cv.d dVar);
    }

    /* compiled from: ReviewGalleryActivityComponent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/review_gallery/di/c$b;", "Lcom/avito/android/di/h;", "_avito_review-gallery_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @C11.c
    public interface b extends InterfaceC29971h {
        @k
        a nh();
    }

    void a(@k ReviewGalleryActivity reviewGalleryActivity);
}
