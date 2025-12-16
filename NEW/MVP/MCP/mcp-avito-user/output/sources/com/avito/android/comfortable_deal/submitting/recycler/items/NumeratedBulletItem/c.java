package com.avito.android.comfortable_deal.submitting.recycler.items.NumeratedBulletItem;

import androidx.compose.runtime.internal.P;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: NumeratedBulletItemPresenter.kt */
@P
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/comfortable_deal/submitting/recycler/items/NumeratedBulletItem/c;", "LTV0/d;", "Lcom/avito/android/comfortable_deal/submitting/recycler/items/NumeratedBulletItem/e;", "Lcom/avito/android/comfortable_deal/submitting/recycler/items/NumeratedBulletItem/NumeratedBulletItem;", "<init>", "()V", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class c implements TV0.d<e, NumeratedBulletItem> {
    @Inject
    public c() {
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        e eVar2 = (e) eVar;
        NumeratedBulletItem numeratedBulletItem = (NumeratedBulletItem) aVar;
        eVar2.K7(String.valueOf(numeratedBulletItem.f123210c));
        eVar2.setTitle(numeratedBulletItem.f123211d);
    }
}
