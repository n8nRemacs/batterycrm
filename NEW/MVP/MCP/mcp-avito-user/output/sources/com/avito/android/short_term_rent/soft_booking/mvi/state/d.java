package com.avito.android.short_term_rent.soft_booking.mvi.state;

import Y41.l;
import com.avito.android.remote.model.BadgeItem;
import com.avito.android.remote.model.BadgeItemHint;
import com.avito.android.remote.model.BadgeItemSize;
import com.avito.android.short_term_rent.soft_booking.mvi.state.c;
import com.avito.android.short_term_rent.view.components.retro_badges.entity.RetroBadgeItem;
import com.avito.android.short_term_rent.view.components.retro_badges.entity.RetroBadgeItemHint;
import com.avito.android.short_term_rent.view.components.retro_badges.entity.RetroBadgeItemSize;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.H;

/* compiled from: StrSoftBookingViewStateBuilder.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
final /* synthetic */ class d extends H implements l<BadgeItem, RetroBadgeItem> {
    @Override // Y41.l
    public final RetroBadgeItem invoke(BadgeItem badgeItem) {
        RetroBadgeItemSize retroBadgeItemSize;
        BadgeItem badgeItem2 = badgeItem;
        ((c) this.receiver).getClass();
        String icon = badgeItem2.getIcon();
        BadgeItemSize size = badgeItem2.getSize();
        int i12 = size == null ? -1 : c.a.f282815b[size.ordinal()];
        if (i12 == -1) {
            retroBadgeItemSize = RetroBadgeItemSize.f283054c;
        } else if (i12 != 1) {
            if (i12 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            retroBadgeItemSize = RetroBadgeItemSize.f283054c;
        } else {
            retroBadgeItemSize = RetroBadgeItemSize.f283053b;
        }
        String title = badgeItem2.getTitle();
        BadgeItemHint hint = badgeItem2.getHint();
        return new RetroBadgeItem(retroBadgeItemSize, icon, title, hint != null ? new RetroBadgeItemHint(hint.getButtonTitle(), hint.getDescription(), hint.getIcon(), hint.getTitle()) : null);
    }
}
