package com.avito.android.advert_core.advert_badge_bar;

import android.view.View;
import com.avito.android.component.advert_badge_bar.AdvertBadgeBar;
import com.avito.android.component.advert_badge_bar.badge.BadgeItem;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: AdvertBadgeBarItemView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert_core/advert_badge_bar/d;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/advert_core/advert_badge_bar/c;", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class d extends com.avito.konveyor.adapter.b implements c {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final AdvertBadgeBar f82721b;

    public d(@Y61.k View view) {
        super(view);
        this.f82721b = (AdvertBadgeBar) view;
    }

    @Override // com.avito.android.advert_core.advert_badge_bar.c
    public final void Rv(int i12) {
        this.f82721b.setOrientation(i12);
    }

    @Override // com.avito.android.advert_core.advert_badge_bar.c
    public final void hk(@Y61.k Y41.a<G0> aVar) {
        this.f82721b.setExpandButtonClickListener(aVar);
    }

    @Override // com.avito.android.advert_core.advert_badge_bar.c
    public final void iG(@Y61.k Y41.l<? super BadgeItem, G0> lVar) {
        this.f82721b.setOnBadgeClickListener(lVar);
    }

    @Override // com.avito.android.advert_core.advert_badge_bar.c
    public final void s00(int i12, @Y61.k String str, @Y61.k List list) {
        this.f82721b.b(i12, str, list);
    }

    @Override // com.avito.android.advert_core.advert_badge_bar.c
    public final void s2(boolean z12) {
        this.f82721b.setExpanded(z12);
    }
}
