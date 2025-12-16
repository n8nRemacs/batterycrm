package com.avito.android.photo_gallery.ui;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.P;
import androidx.viewpager.widget.ViewPager;
import com.avito.android.R;
import com.avito.android.lib.design.page_indicator.PageIndicator;
import kotlin.Metadata;

/* compiled from: PageIndicatorView.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/photo_gallery/ui/f;", "Lcom/avito/android/photo_gallery/ui/h;", "_avito_photo-gallery_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class f implements h {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final PageIndicator f217713a;

    public f(@Y61.k PhotoGallery photoGallery, @Y61.k ViewPager viewPager) {
        PageIndicator pageIndicator = (PageIndicator) LayoutInflater.from(photoGallery.getContext()).inflate(R.layout.page_indicator_dots, (ViewGroup) photoGallery, false);
        this.f217713a = pageIndicator;
        photoGallery.addView(pageIndicator);
        pageIndicator.e(viewPager);
    }

    @Override // com.avito.android.photo_gallery.ui.h
    public final View getView() {
        return this.f217713a;
    }

    @Override // com.avito.android.photo_gallery.ui.h
    public final void b(boolean z12) {
    }

    @Override // com.avito.android.photo_gallery.ui.h
    public final void a(int i12, @Y61.l Integer num) {
    }
}
