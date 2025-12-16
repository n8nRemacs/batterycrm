package com.avito.android.photo_gallery.adapter;

import android.content.Context;
import com.avito.android.analytics.event.native_video.VideoEventFromPage;
import com.avito.android.photo_gallery.GalleryFragment;
import com.avito.android.photo_gallery.adapter.q;
import com.avito.android.player.PlayerAnalyticsParameters;
import com.avito.android.rec.ScreenSource;
import kotlin.Metadata;
import mc.C44049b;

/* compiled from: FullscreenGalleryAdapter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/photo_gallery/adapter/e;", "Lcom/avito/android/photo_gallery/GalleryFragment$b;", "_avito_photo-gallery_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class e implements GalleryFragment.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q.d f216718a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a f216719b;

    public e(q.d dVar, a aVar) {
        this.f216718a = dVar;
        this.f216719b = aVar;
    }

    @Override // com.avito.android.photo_gallery.GalleryFragment.b
    public final void a() {
        String url = this.f216718a.f216766a.getUrl();
        if (url != null) {
            a aVar = this.f216719b;
            Context context = aVar.f216689j;
            ScreenSource.ADVERT advert = ScreenSource.ADVERT.f251774d;
            String str = aVar.f216691l;
            if (str == null) {
                str = "";
            }
            context.startActivity(aVar.f216694o.a(url, null, null, null, advert, (80 & 128) != 0 ? null : 0, new PlayerAnalyticsParameters(str, C44049b.a(VideoEventFromPage.f90106b), null, 4, null)));
        }
    }

    @Override // com.avito.android.photo_gallery.GalleryFragment.b
    public final void i() {
        this.f216719b.f216692m.i();
    }

    @Override // com.avito.android.photo_gallery.GalleryFragment.b
    public final void l() {
        this.f216719b.f216692m.l();
    }
}
