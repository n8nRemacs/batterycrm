package com.avito.android.short_term_rent.bookingform.data.models;

import Y41.l;
import com.adjust.sdk.Constants;
import com.avito.android.short_term_rent.view.components.retro_badges.entity.RetroBadgeItem;
import com.avito.android.short_term_rent.view.components.retro_badges.entity.RetroBadgeItemHint;
import com.avito.android.short_term_rent.view.components.retro_badges.entity.RetroBadgeItemSize;
import jw0.C42435b;
import kotlin.Metadata;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.L;

/* compiled from: BookingFormDtoBlocksToBlockItemsMapper.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
final /* synthetic */ class a extends H implements l<C42435b, RetroBadgeItem> {
    @Override // Y41.l
    public final RetroBadgeItem invoke(C42435b c42435b) {
        C42435b c42435b2 = c42435b;
        ((c) this.receiver).getClass();
        String title = c42435b2.getTitle();
        return new RetroBadgeItem(L.f(c42435b2.getSize(), Constants.SMALL) ? RetroBadgeItemSize.f283053b : RetroBadgeItemSize.f283054c, c42435b2.getIcon(), title, new RetroBadgeItemHint(c42435b2.getHint().getButtonTitle(), c42435b2.getHint().getDescription(), c42435b2.getHint().getIcon(), c42435b2.getHint().getTitle()));
    }
}
