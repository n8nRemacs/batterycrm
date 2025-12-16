package com.avito.android.loyalty.ui.badge_details_v3.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.t;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.loyalty.ui.badge_details_v3.mvi.entity.BadgeDetailsV3InternalAction;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.s0;

/* compiled from: BadgeDetailsV3OneTimeEventProducer.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/loyalty/ui/badge_details_v3/mvi/i;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/loyalty/ui/badge_details_v3/mvi/entity/BadgeDetailsV3InternalAction;", "Lkotlin/G0;", "_avito_loyalty_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class i implements t<BadgeDetailsV3InternalAction, G0> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f183350b;

    @Inject
    public i(@Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar) {
        this.f183350b = aVar;
    }

    @Override // com.avito.android.arch.mvi.t
    public final G0 b(BadgeDetailsV3InternalAction badgeDetailsV3InternalAction) {
        BadgeDetailsV3InternalAction badgeDetailsV3InternalAction2 = badgeDetailsV3InternalAction;
        if (badgeDetailsV3InternalAction2 instanceof BadgeDetailsV3InternalAction.HandleDeeplink) {
            b.a.a(this.f183350b, ((BadgeDetailsV3InternalAction.HandleDeeplink) badgeDetailsV3InternalAction2).f183337b, null, null, 6);
            G0 g02 = G0.f406611a;
        } else {
            if (!(badgeDetailsV3InternalAction2 instanceof BadgeDetailsV3InternalAction.Loaded ? true : badgeDetailsV3InternalAction2.equals(BadgeDetailsV3InternalAction.Error.f183336b) ? true : badgeDetailsV3InternalAction2.equals(BadgeDetailsV3InternalAction.Loading.f183339b) ? true : badgeDetailsV3InternalAction2 instanceof BadgeDetailsV3InternalAction.CollapseItemClicked)) {
                throw new NoWhenBranchMatchedException();
            }
        }
        return null;
    }
}
