package com.avito.android.photo_gallery.adapter;

import androidx.viewpager.widget.ViewPager;
import com.avito.android.photo_gallery.GalleryFragment;
import kotlin.Metadata;

/* compiled from: GalleryAdapter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/photo_gallery/adapter/i;", "Lcom/avito/android/photo_gallery/GalleryFragment$b;", "_avito_photo-gallery_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class i implements GalleryFragment.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ViewPager f216734a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f216735b;

    public i(ViewPager viewPager, g gVar) {
        this.f216734a = viewPager;
        this.f216735b = gVar;
    }

    @Override // com.avito.android.photo_gallery.GalleryFragment.b
    public final void a() {
        this.f216734a.performClick();
    }

    @Override // com.avito.android.photo_gallery.GalleryFragment.b
    public final void i() {
        this.f216735b.f216725n.i();
    }

    @Override // com.avito.android.photo_gallery.GalleryFragment.b
    public final void l() {
        this.f216735b.f216725n.l();
    }
}
