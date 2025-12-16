package com.avito.android.advert.item.rating_publish;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.advert.item.Z0;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: AdvertDetailsRatingPublishPresenter.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert/item/rating_publish/e;", "Lcom/avito/android/advert/item/rating_publish/c;", "<init>", "()V", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class e implements c {

    /* renamed from: b, reason: collision with root package name */
    @l
    public Z0 f78309b;

    @Inject
    public e() {
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        g gVar = (g) eVar;
        AdvertDetailsRatingPublishItem advertDetailsRatingPublishItem = (AdvertDetailsRatingPublishItem) aVar;
        gVar.E9(advertDetailsRatingPublishItem.f78299c.getTitle());
        gVar.a(new d(this, advertDetailsRatingPublishItem));
    }

    @Override // com.avito.android.advert.item.rating_publish.c
    public final void c0() {
        this.f78309b = null;
    }

    @Override // com.avito.android.advert.item.rating_publish.c
    public final void c6(@k Z0 z02) {
        this.f78309b = z02;
    }
}
