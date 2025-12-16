package com.avito.android.component.advert_badge_bar.badge_item;

import TV0.e;
import Y61.l;
import com.avito.android.body_condition.h;
import com.avito.android.component.advert_badge_bar.badge.BadgeItem;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: BadgeItemPresenter.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/component/advert_badge_bar/badge_item/b;", "LTV0/d;", "Lcom/avito/android/component/advert_badge_bar/badge/a;", "Lcom/avito/android/component/advert_badge_bar/badge/BadgeItem;", "_avito_ui-components_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class b implements TV0.d<com.avito.android.component.advert_badge_bar.badge.a, BadgeItem> {

    /* renamed from: b, reason: collision with root package name */
    @l
    public final Y41.l<BadgeItem, G0> f124985b;

    /* JADX WARN: Multi-variable type inference failed */
    public b() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // TV0.d
    public final void O5(e eVar, TV0.a aVar, int i12) {
        com.avito.android.component.advert_badge_bar.badge.a aVar2 = (com.avito.android.component.advert_badge_bar.badge.a) eVar;
        BadgeItem badgeItem = (BadgeItem) aVar;
        aVar2.setTitle(badgeItem.f124945d);
        aVar2.h(badgeItem.f124946e);
        aVar2.dx(badgeItem.f124947f, badgeItem.f124948g);
        aVar2.da(badgeItem.f124949h);
        aVar2.g7(badgeItem.f124950i);
        aVar2.k50(badgeItem.f124951j);
        aVar2.i(badgeItem.f124952k);
        aVar2.setOnClickListener(new h(23, this, badgeItem));
        aVar2.u40(badgeItem.f124954m);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b(@l Y41.l<? super BadgeItem, G0> lVar) {
        this.f124985b = lVar;
    }

    public /* synthetic */ b(Y41.l lVar, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : lVar);
    }
}
