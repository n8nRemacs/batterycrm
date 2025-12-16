package com.avito.android.advert_details_items.title;

import androidx.compose.runtime.internal.P;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: AdvertDetailsTitlePresenter.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert_details_items/title/d;", "Lcom/avito/android/advert_details_items/title/c;", "<init>", "()V", "_avito_advert-details-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class d implements c {
    @Inject
    public d() {
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        f fVar = (f) eVar;
        AdvertDetailsTitleItem advertDetailsTitleItem = (AdvertDetailsTitleItem) aVar;
        fVar.setTitle(advertDetailsTitleItem.f85715d);
        fVar.k(advertDetailsTitleItem.f85716e);
        if (advertDetailsTitleItem.f85717f) {
            fVar.y1();
        }
    }
}
