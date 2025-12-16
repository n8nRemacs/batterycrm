package com.avito.android.advert.item.safedeal.trust_factors.badge_bar;

import Y61.k;
import Y61.l;
import android.view.View;
import androidx.compose.runtime.internal.P;
import com.avito.android.advert.item.safedeal.trust_factors.i;
import com.avito.android.advert.item.safedeal.trust_factors.n;
import com.avito.android.component.advert_badge_bar.AdvertBadgeBar;
import kotlin.Metadata;

/* compiled from: TrustFactorsBadgeBarView.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert/item/safedeal/trust_factors/badge_bar/g;", "Lcom/avito/konveyor/adapter/b;", "LTV0/e;", "Lcom/avito/android/advert/item/safedeal/trust_factors/n;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class g extends com.avito.konveyor.adapter.b implements TV0.e, n {

    /* renamed from: b, reason: collision with root package name */
    @l
    public final i f79043b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final AdvertBadgeBar f79044c;

    public g(@k View view, @l i iVar) {
        super(view);
        this.f79043b = iVar;
        this.f79044c = (AdvertBadgeBar) view;
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        i iVar = this.f79043b;
        if (iVar != null) {
            iVar.a();
        }
    }
}
