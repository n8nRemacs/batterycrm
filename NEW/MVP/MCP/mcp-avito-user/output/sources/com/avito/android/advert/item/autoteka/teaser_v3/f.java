package com.avito.android.advert.item.autoteka.teaser_v3;

import androidx.compose.runtime.internal.P;
import com.avito.android.advert.item.W0;
import com.avito.android.remote.model.autotekateaser.AutotekaTeaserItemResponse;
import com.avito.android.remote.model.autotekateaser.AutotekaTeaserResult;
import com.avito.android.remote.model.teaser.TeaserError;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: AdvertDetailsAutotekaTeaserV3Presenter.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert/item/autoteka/teaser_v3/f;", "Lcom/avito/android/advert/item/autoteka/teaser_v3/c;", "<init>", "()V", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class f implements c {

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public W0 f73132b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public h f73133c;

    @Inject
    public f() {
    }

    @Override // com.avito.android.advert.item.autoteka.teaser_v3.c
    public final void J5(@Y61.k W0 w02) {
        this.f73132b = w02;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        TeaserError error;
        AutotekaTeaserResult autotekaData;
        h hVar = (h) eVar;
        AdvertDetailsAutotekaTeaserV3Item advertDetailsAutotekaTeaserV3Item = (AdvertDetailsAutotekaTeaserV3Item) aVar;
        this.f73133c = hVar;
        AutotekaTeaserItemResponse autotekaTeaserItemResponse = advertDetailsAutotekaTeaserV3Item.f73123d;
        if (autotekaTeaserItemResponse != null && (autotekaData = autotekaTeaserItemResponse.getAutotekaData()) != null) {
            hVar.us(advertDetailsAutotekaTeaserV3Item.f73124e, autotekaData, new d(this), new e(this));
        } else {
            if (autotekaTeaserItemResponse == null || (error = autotekaTeaserItemResponse.getError()) == null) {
                return;
            }
            hVar.w9(error);
        }
    }

    @Override // com.avito.android.advert.item.autoteka.teaser_v3.c
    public final void c0() {
        this.f73132b = null;
    }
}
