package com.avito.android.advert_stats.item.details;

import com.avito.android.remote.model.Image;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: StatDetailItemPresenter.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/advert_stats/item/details/d;", "LTV0/d;", "Lcom/avito/android/advert_stats/item/details/f;", "Lcom/avito/android/advert_stats/item/details/a;", "<init>", "()V", "_avito_advert-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class d implements TV0.d<f, a> {
    @Inject
    public d() {
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        f fVar = (f) eVar;
        a aVar2 = (a) aVar;
        fVar.setText(aVar2.f86736c);
        fVar.DY(aVar2.f86739f);
        Integer num = aVar2.f86737d;
        Image image = aVar2.f86738e;
        if (image != null) {
            fVar.x(com.avito.android.image_loader.b.b(image));
        } else if (num != null) {
            fVar.tm(num.intValue());
        } else {
            fVar.Uy();
        }
        fVar.Ri(aVar2.f86740g, (image == null && num == null) ? false : true);
    }
}
