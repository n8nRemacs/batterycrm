package com.avito.android.photo_gallery.adapter;

import android.content.ActivityNotFoundException;
import android.net.Uri;
import androidx.viewpager.widget.ViewPager;
import com.avito.android.photo_gallery.GalleryFragment;
import com.avito.android.util.V2;
import kotlin.Metadata;

/* compiled from: GalleryAdapter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/photo_gallery/adapter/j;", "Lcom/avito/android/photo_gallery/GalleryFragment$b;", "_avito_photo-gallery_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class j implements GalleryFragment.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ViewPager f216736a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f216737b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Uri f216738c;

    public j(ViewPager viewPager, g gVar, Uri uri) {
        this.f216736a = viewPager;
        this.f216737b = gVar;
        this.f216738c = uri;
    }

    @Override // com.avito.android.photo_gallery.GalleryFragment.b
    public final void a() {
        g gVar = this.f216737b;
        try {
            this.f216736a.performClick();
            gVar.f216721j.startActivity(gVar.f216726o.t(this.f216738c));
        } catch (ActivityNotFoundException e12) {
            V2.f318762a.a("GalleryAdapter", "Error while try open video", e12);
        }
    }

    @Override // com.avito.android.photo_gallery.GalleryFragment.b
    public final void i() {
        this.f216737b.f216725n.i();
    }

    @Override // com.avito.android.photo_gallery.GalleryFragment.b
    public final void l() {
        this.f216737b.f216725n.l();
    }
}
