package com.avito.android.photo_gallery.adapter;

import android.content.ActivityNotFoundException;
import android.net.Uri;
import com.avito.android.photo_gallery.GalleryFragment;
import com.avito.android.util.V2;
import kotlin.Metadata;

/* compiled from: FullscreenGalleryAdapter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/photo_gallery/adapter/d;", "Lcom/avito/android/photo_gallery/GalleryFragment$b;", "_avito_photo-gallery_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class d implements GalleryFragment.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a f216716a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Uri f216717b;

    public d(a aVar, Uri uri) {
        this.f216716a = aVar;
        this.f216717b = uri;
    }

    @Override // com.avito.android.photo_gallery.GalleryFragment.b
    public final void a() {
        a aVar = this.f216716a;
        try {
            aVar.f216698s.invoke();
            aVar.f216689j.startActivity(aVar.f216693n.t(this.f216717b));
        } catch (ActivityNotFoundException e12) {
            V2.f318762a.a("FullScreenGalleryAdapter", "Cannot open video uri", e12);
        }
    }

    @Override // com.avito.android.photo_gallery.GalleryFragment.b
    public final void i() {
        this.f216716a.f216692m.i();
    }

    @Override // com.avito.android.photo_gallery.GalleryFragment.b
    public final void l() {
        this.f216716a.f216692m.l();
    }
}
