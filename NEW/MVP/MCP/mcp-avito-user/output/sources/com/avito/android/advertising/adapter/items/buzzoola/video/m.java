package com.avito.android.advertising.adapter.items.buzzoola.video;

import com.avito.android.advertising.loaders.BannerInfo;
import com.avito.android.advertising.loaders.C;
import kotlin.Metadata;

/* compiled from: CommercialVideoPresenter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advertising/adapter/items/buzzoola/video/m;", "Lcom/avito/android/advertising/adapter/items/buzzoola/video/b;", "_avito_advertising_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class m extends b {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ l f87587k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(int i12, CommercialVideoState commercialVideoState, l lVar, String str, BannerInfo bannerInfo, C c12, String str2, com.avito.android.advertising.loaders.j jVar, g gVar, com.avito.android.advertising.loaders.event_service.c cVar) {
        super(str, bannerInfo, i12, c12, str2, commercialVideoState, jVar, gVar, cVar);
        this.f87587k = lVar;
    }

    @Override // com.avito.android.advertising.adapter.items.buzzoola.video.b
    public final void b(long j12, float f12) {
        super.b(j12, f12);
        this.f87537f.f87517b = j12;
    }

    @Override // com.avito.android.advertising.adapter.items.buzzoola.video.b
    public final void c(int i12) {
        super.c(i12);
        if (i12 == 4) {
            this.f87587k.f87576f.h(true);
        }
    }
}
