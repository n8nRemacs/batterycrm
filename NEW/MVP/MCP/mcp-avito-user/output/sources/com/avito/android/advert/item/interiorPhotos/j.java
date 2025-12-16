package com.avito.android.advert.item.interiorPhotos;

import androidx.compose.runtime.internal.P;
import com.avito.android.advert.item.W0;
import com.avito.android.advert.item.Z0;
import com.avito.android.interior_photos_block.entity.InteriorPhotoBlock;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: InteriorPhotosPresenter.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/interiorPhotos/j;", "Lcom/avito/android/advert/item/interiorPhotos/g;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class j implements g {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final B7.a f76600b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert_core.analytics.a f76601c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public Z0 f76602d;

    @Inject
    public j(@Y61.k B7.a aVar, @Y61.k com.avito.android.advert_core.analytics.a aVar2) {
        this.f76600b = aVar;
        this.f76601c = aVar2;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        l lVar = (l) eVar;
        InteriorPhotosItem interiorPhotosItem = (InteriorPhotosItem) aVar;
        h hVar = new h(new i(this, interiorPhotosItem), this);
        Map<String, Object> map = interiorPhotosItem.f76586i;
        if (map != null) {
            this.f76600b.b(interiorPhotosItem.f76587j, map);
        }
        lVar.q70(new InteriorPhotoBlock(interiorPhotosItem.f76584g, interiorPhotosItem.f76585h), hVar);
    }

    @Override // com.avito.android.advert.item.interiorPhotos.g
    public final void m(@Y61.k W0 w02) {
        this.f76602d = (Z0) w02;
    }
}
