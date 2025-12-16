package com.avito.android.profile_settings_extended.adapter.badge_bar;

import Y41.l;
import Y61.k;
import android.view.View;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.component.advert_badge_bar.AdvertBadgeBar;
import com.avito.android.component.advert_badge_bar.badge.BadgeItem;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: BadgeBarItemView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/profile_settings_extended/adapter/badge_bar/h;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/profile_settings_extended/adapter/badge_bar/g;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class h extends com.avito.konveyor.adapter.b implements g {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final AdvertBadgeBar f229163b;

    public h(@k View view) {
        super(view);
        View viewFindViewById = view.findViewById(R.id.badge_bar);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.component.advert_badge_bar.AdvertBadgeBar");
        }
        this.f229163b = (AdvertBadgeBar) viewFindViewById;
    }

    @Override // com.avito.android.profile_settings_extended.adapter.badge_bar.g
    public final void B70(@k BadgeBarItem badgeBarItem, @k l<? super BadgeItem, G0> lVar) {
        AdvertBadgeBar advertBadgeBar = this.f229163b;
        advertBadgeBar.b(3, advertBadgeBar.getContext().getString(R.string.basic_profile_settings_expand_badges), badgeBarItem.f229154c);
        advertBadgeBar.setOnBadgeClickListener(lVar);
    }
}
