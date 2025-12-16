package com.avito.android.photo_gallery.adapter;

import android.content.ActivityNotFoundException;
import com.avito.android.photo_gallery.GalleryFragment;
import com.avito.android.remote.model.Video;
import com.avito.android.util.V2;
import kotlin.Metadata;

/* compiled from: GalleryAdapter2.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/photo_gallery/adapter/m;", "Lcom/avito/android/photo_gallery/GalleryFragment$b;", "_avito_photo-gallery_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class m implements GalleryFragment.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l f216758a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Video f216759b;

    public m(l lVar, Video video) {
        this.f216758a = lVar;
        this.f216759b = video;
    }

    @Override // com.avito.android.photo_gallery.GalleryFragment.b
    public final void a() {
        l lVar = this.f216758a;
        try {
            lVar.f216742m.performClick();
            lVar.f216740k.startActivity(lVar.f216746q.t(this.f216759b.getVideoUrl()));
        } catch (ActivityNotFoundException e12) {
            V2.f318762a.a("GalleryAdapter", "Error while try open video", e12);
        }
    }

    @Override // com.avito.android.photo_gallery.GalleryFragment.b
    public final void i() {
        this.f216758a.f216745p.i();
    }

    @Override // com.avito.android.photo_gallery.GalleryFragment.b
    public final void l() {
        this.f216758a.f216745p.l();
    }
}
