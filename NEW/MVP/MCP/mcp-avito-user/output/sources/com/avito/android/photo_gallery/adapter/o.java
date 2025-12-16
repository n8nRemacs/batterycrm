package com.avito.android.photo_gallery.adapter;

import android.net.Uri;
import com.avito.android.autoteka.analytics.event.FromBlock;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;

/* compiled from: GalleryAdapter2.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/photo_gallery/adapter/o;", "Lcom/avito/android/photo_gallery/autoteka_teaser/b;", "_avito_photo-gallery_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class o implements com.avito.android.photo_gallery.autoteka_teaser.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l f216761a;

    public o(l lVar) {
        this.f216761a = lVar;
    }

    @Override // com.avito.android.photo_gallery.autoteka_teaser.b
    public final void c() {
        this.f216761a.f216750u.invoke();
    }

    @Override // com.avito.android.photo_gallery.autoteka_teaser.b
    public final void e(@Y61.k DeepLink deepLink) {
        this.f216761a.f216751v.invoke(deepLink);
    }

    @Override // com.avito.android.photo_gallery.autoteka_teaser.b
    public final void a() {
    }

    @Override // com.avito.android.photo_gallery.autoteka_teaser.b
    public final void d(@Y61.k FromBlock fromBlock) {
    }

    @Override // com.avito.android.photo_gallery.autoteka_teaser.b
    public final void b(@Y61.k Uri uri, @Y61.k FromBlock fromBlock, @Y61.k String str) {
    }

    @Override // com.avito.android.photo_gallery.autoteka_teaser.b
    public final void f(@Y61.k Uri uri, @Y61.k FromBlock fromBlock, @Y61.k String str) {
    }
}
