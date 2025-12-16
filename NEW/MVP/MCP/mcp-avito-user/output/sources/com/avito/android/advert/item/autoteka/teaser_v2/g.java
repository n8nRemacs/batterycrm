package com.avito.android.advert.item.autoteka.teaser_v2;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.advert.item.W0;
import com.avito.android.remote.model.autotekateaser.AutotekaTeaserItemResponse;
import com.avito.android.remote.model.autotekateaser.AutotekaTeaserResult;
import com.avito.android.remote.model.teaser.TeaserError;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: AdvertDetailsAutotekaTeaserV2Presenter.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert/item/autoteka/teaser_v2/g;", "Lcom/avito/android/advert/item/autoteka/teaser_v2/c;", "<init>", "()V", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class g implements c {

    /* renamed from: b, reason: collision with root package name */
    @l
    public W0 f73115b;

    @Inject
    public g() {
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        TeaserError error;
        AutotekaTeaserResult autotekaData;
        com.avito.android.advert.item.autoteka.teaser.v2.a aVar2 = (com.avito.android.advert.item.autoteka.teaser.v2.a) eVar;
        AdvertDetailsAutotekaTeaserV2Item advertDetailsAutotekaTeaserV2Item = (AdvertDetailsAutotekaTeaserV2Item) aVar;
        AutotekaTeaserItemResponse autotekaTeaserItemResponse = advertDetailsAutotekaTeaserV2Item.f73105d;
        if (autotekaTeaserItemResponse != null && (autotekaData = autotekaTeaserItemResponse.getAutotekaData()) != null) {
            aVar2.t10(advertDetailsAutotekaTeaserV2Item.f73106e, autotekaData, new d(this), new e(this), new f(this));
        } else {
            if (autotekaTeaserItemResponse == null || (error = autotekaTeaserItemResponse.getError()) == null) {
                return;
            }
            aVar2.w9(error);
        }
    }

    @Override // com.avito.android.advert.item.autoteka.teaser_v2.c
    public final void c0() {
        this.f73115b = null;
    }

    @Override // com.avito.android.advert.item.autoteka.teaser_v2.c
    public final void d6(@k W0 w02) {
        this.f73115b = w02;
    }
}
