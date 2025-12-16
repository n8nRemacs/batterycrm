package com.avito.android.gallery.ui.adapter;

import androidx.viewpager.widget.ViewPager;
import com.avito.android.gallery.ui.adapter.GalleryFragment;
import kotlin.Metadata;

/* compiled from: GalleryAdapter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/gallery/ui/adapter/c;", "Lcom/avito/android/gallery/ui/adapter/GalleryFragment$b;", "_avito_gallery_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class c implements GalleryFragment.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ViewPager f159263a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f159264b;

    public c(ViewPager viewPager, d dVar) {
        this.f159263a = viewPager;
        this.f159264b = dVar;
    }

    @Override // com.avito.android.gallery.ui.adapter.GalleryFragment.b
    public final void a() {
        this.f159263a.performClick();
    }

    @Override // com.avito.android.gallery.ui.adapter.GalleryFragment.b
    public final void i() {
        this.f159264b.f159266k.i();
    }

    @Override // com.avito.android.gallery.ui.adapter.GalleryFragment.b
    public final void l() {
        this.f159264b.f159266k.getClass();
    }
}
