package com.avito.android.advert_core.aler_banner;

import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: AlertBannerPresenter.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert_core/aler_banner/d;", "Lcom/avito/android/advert_core/aler_banner/c;", "<init>", "()V", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class d implements c {
    @Inject
    public d() {
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        f fVar = (f) eVar;
        AlertBannerItem alertBannerItem = (AlertBannerItem) aVar;
        fVar.setTitle(alertBannerItem.f82733b);
        fVar.setText(alertBannerItem.f82734c);
        fVar.At(alertBannerItem.f82735d);
    }
}
