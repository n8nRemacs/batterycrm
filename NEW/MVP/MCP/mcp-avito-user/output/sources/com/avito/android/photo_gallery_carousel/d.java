package com.avito.android.photo_gallery_carousel;

import Y61.k;
import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: CarouselPhotoGalleryPageIndicatorHolder.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/photo_gallery_carousel/d;", "", "_avito_photo-gallery-carousel_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final View f217737a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final TextView f217738b;

    /* renamed from: c, reason: collision with root package name */
    public int f217739c;

    /* renamed from: d, reason: collision with root package name */
    public int f217740d;

    public d(@k View view) {
        this.f217737a = view;
        View viewFindViewById = view.findViewById(R.id.page_indicator);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f217738b = (TextView) viewFindViewById;
        view.setVisibility(4);
    }
}
