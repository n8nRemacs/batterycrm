package com.avito.android.photo_gallery_carousel.items.native_video;

import com.avito.android.analytics.event.native_video.VideoEventFromPage;
import com.avito.android.photo_gallery_carousel.gallery_view.a;
import com.avito.android.player.PlayerAnalyticsParameters;
import com.avito.android.rec.ScreenSource;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import mc.C44049b;

/* compiled from: GalleryNativeVideoItemPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class h extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ GalleryNativeVideoItem f217995l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ i f217996m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(GalleryNativeVideoItem galleryNativeVideoItem, i iVar) {
        super(0);
        this.f217995l = galleryNativeVideoItem;
        this.f217996m = iVar;
    }

    @Override // Y41.a
    public final G0 invoke() {
        GalleryNativeVideoItem galleryNativeVideoItem = this.f217995l;
        String url = galleryNativeVideoItem.f217981d.getUrl();
        if (url != null) {
            i iVar = this.f217996m;
            ScreenSource.ADVERT advert = ScreenSource.ADVERT.f251774d;
            String str = galleryNativeVideoItem.f217982e;
            if (str == null) {
                str = "";
            }
            iVar.f217997b.invoke(new a.d(iVar.f217999d.a(url, null, null, null, advert, (80 & 128) != 0 ? null : 0, new PlayerAnalyticsParameters(str, C44049b.a(VideoEventFromPage.f90108d), null, 4, null))));
        }
        return G0.f406611a;
    }
}
