package com.avito.android.advert.item.safedeal.trust_factors.spacing;

import Y61.k;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.P;
import com.avito.android.advert.item.safedeal.trust_factors.i;
import com.avito.android.remote.safedeal.SafeDeal;
import com.avito.android.util.y6;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: TrustFactorsSpacingPresenter.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert/item/safedeal/trust_factors/spacing/c;", "LTV0/d;", "Lcom/avito/android/advert/item/safedeal/trust_factors/spacing/e;", "Lcom/avito/android/advert/item/safedeal/trust_factors/spacing/TrustFactorsSpacingItem;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class c implements TV0.d<e, TrustFactorsSpacingItem> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.advert.item.safedeal.trust_factors.d f79226b;

    @Inject
    public c(@k com.avito.android.advert.item.safedeal.trust_factors.d dVar) {
        this.f79226b = dVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        i iVar;
        e eVar2 = (e) eVar;
        TrustFactorsSpacingItem trustFactorsSpacingItem = (TrustFactorsSpacingItem) aVar;
        Float height = trustFactorsSpacingItem.f79217c.f84268b.getHeight();
        int iA2 = y6.a(height != null ? height.floatValue() : 0.0f);
        View view = eVar2.f79228b;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams.height = iA2;
        view.setLayoutParams(layoutParams);
        SafeDeal.TooltipData tooltipData = trustFactorsSpacingItem.f79219e;
        if (tooltipData == null || (iVar = eVar2.f79229c) == null) {
            return;
        }
        iVar.b(trustFactorsSpacingItem.f79216b, tooltipData, this.f79226b);
    }
}
