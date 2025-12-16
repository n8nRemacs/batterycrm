package com.avito.android.advert.item.ownership_discrepancy.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.advert.item.ownership_discrepancy.mvi.entity.OwnershipDiscrepancyInternalAction;
import com.avito.android.arch.mvi.t;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import l6.b;

/* compiled from: OwnershipDiscrepancyOneTimeEventProducer.kt */
@P
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/advert/item/ownership_discrepancy/mvi/g;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/advert/item/ownership_discrepancy/mvi/entity/OwnershipDiscrepancyInternalAction;", "Ll6/b;", "<init>", "()V", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class g implements t<OwnershipDiscrepancyInternalAction, l6.b> {
    @Inject
    public g() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final l6.b b(OwnershipDiscrepancyInternalAction ownershipDiscrepancyInternalAction) {
        OwnershipDiscrepancyInternalAction ownershipDiscrepancyInternalAction2 = ownershipDiscrepancyInternalAction;
        if (!(ownershipDiscrepancyInternalAction2 instanceof OwnershipDiscrepancyInternalAction.FollowLink)) {
            throw new NoWhenBranchMatchedException();
        }
        OwnershipDiscrepancyInternalAction.FollowLink followLink = (OwnershipDiscrepancyInternalAction.FollowLink) ownershipDiscrepancyInternalAction2;
        return new b.a(followLink.f78117b, followLink.f78118c, followLink.f78119d);
    }
}
