package com.avito.android.advert.item.advert_docking_badge_bar;

import Y61.k;
import android.view.View;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.lib.design.docking_badge.DockingBadgeContainer;
import com.avito.android.lib.design.docking_badge.DockingBadgeItem;
import java.util.List;
import kotlin.Metadata;

/* compiled from: AdvertDetailsDockingBadgeBarView.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert/item/advert_docking_badge_bar/g;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/advert/item/advert_docking_badge_bar/f;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class g extends com.avito.konveyor.adapter.b implements f {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final DockingBadgeContainer f72703b;

    public g(@k View view) {
        super(view);
        this.f72703b = (DockingBadgeContainer) view.findViewById(R.id.advert_docking_badge_bar);
    }

    @Override // com.avito.android.advert.item.advert_docking_badge_bar.f
    public final void Pc(@k List<DockingBadgeItem> list) {
        this.f72703b.setBadgeItems(list);
    }
}
