package com.avito.android.advert.item.auto_media.preview;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.MediaSectionType;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: AutoMediaPreviewPresenter.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert/item/auto_media/preview/d;", "LTV0/d;", "Lcom/avito/android/advert/item/auto_media/preview/f;", "Lcom/avito/android/advert/item/auto_media/preview/AutoMediaPreviewItem;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class d implements TV0.d<f, AutoMediaPreviewItem> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.deeplink_handler.handler.composite.a f72951b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final com.avito.android.advert.item.auto_media.a f72952c;

    @Inject
    public d(@k com.avito.android.deeplink_handler.handler.composite.a aVar, @k com.avito.android.advert.item.auto_media.a aVar2) {
        this.f72951b = aVar;
        this.f72952c = aVar2;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        f fVar = (f) eVar;
        AutoMediaPreviewItem autoMediaPreviewItem = (AutoMediaPreviewItem) aVar;
        fVar.b(autoMediaPreviewItem.f72938c);
        fVar.WL(autoMediaPreviewItem.f72940e);
        fVar.z1(autoMediaPreviewItem.f72939d);
        boolean z12 = autoMediaPreviewItem.f72941f == MediaSectionType.VIDEO;
        fVar.QF(z12);
        fVar.S(new c(z12, this, autoMediaPreviewItem));
        fVar.m20(z12);
    }
}
