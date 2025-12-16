package com.avito.android.extended_profile_widgets.adapter.badge_bar;

import Y41.l;
import Y61.k;
import android.view.View;
import com.avito.android.R;
import com.avito.android.component.advert_badge_bar.AdvertBadgeBar;
import com.avito.android.component.advert_badge_bar.badge.BadgeItem;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: BadgeBarItemView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/extended_profile_widgets/adapter/badge_bar/h;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/extended_profile_widgets/adapter/badge_bar/g;", "_avito_extended-profile-widgets_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class h extends com.avito.konveyor.adapter.b implements g {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final AdvertBadgeBar f154218b;

    public h(@k View view) {
        super(view);
        this.f154218b = (AdvertBadgeBar) view;
    }

    @Override // com.avito.android.extended_profile_widgets.adapter.badge_bar.g
    public final void T10(@k BadgeBarItem badgeBarItem, @k l<? super BadgeItem, G0> lVar) {
        AdvertBadgeBar advertBadgeBar = this.f154218b;
        advertBadgeBar.b(3, advertBadgeBar.getContext().getString(R.string.extended_profile_expand_badge_bar_text), badgeBarItem.f154210d);
        advertBadgeBar.setOnBadgeClickListener(lVar);
    }
}
