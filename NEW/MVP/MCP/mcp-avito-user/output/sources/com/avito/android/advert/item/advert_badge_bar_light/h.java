package com.avito.android.advert.item.advert_badge_bar_light;

import Y61.k;
import android.view.View;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.lib.design.docking_badge.DockingBadgeContainer;
import com.avito.android.lib.design.docking_badge.DockingBadgeItem;
import java.util.List;
import kotlin.Metadata;

/* compiled from: AdvertDetailsBadgeBarLightView.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert/item/advert_badge_bar_light/h;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/advert/item/advert_badge_bar_light/g;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class h extends com.avito.konveyor.adapter.b implements g {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final DockingBadgeContainer f72690b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f72691c;

    public h(@k View view) {
        super(view);
        this.f72690b = (DockingBadgeContainer) view.findViewById(R.id.advert_badge_bar_light);
    }

    @Override // com.avito.android.advert.item.advert_badge_bar_light.g
    public final void HB(@k List<DockingBadgeItem> list, boolean z12) {
        this.f72691c = z12;
        this.f72690b.setBadgeItems(list);
    }

    @Override // com.avito.android.advert.item.advert_badge_bar_light.g
    /* renamed from: Rn, reason: from getter */
    public final boolean getF72691c() {
        return this.f72691c;
    }
}
