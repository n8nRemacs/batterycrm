package com.avito.android.component.advert_badge_bar.badge;

import Y61.k;
import Y61.l;
import com.avito.android.body_condition.h;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: ProfileBadgeItemPresenter.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/component/advert_badge_bar/badge/d;", "LTV0/d;", "Lcom/avito/android/component/advert_badge_bar/badge/e;", "Lcom/avito/android/component/advert_badge_bar/badge/BadgeItem;", "_avito_ui-components_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class d implements TV0.d<e, BadgeItem> {

    /* renamed from: b, reason: collision with root package name */
    @l
    public final Y41.l<BadgeItem, G0> f124962b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final com.avito.android.lib.util.groupable_item.b f124963c;

    /* JADX WARN: Multi-variable type inference failed */
    public d(@l Y41.l<? super BadgeItem, G0> lVar, @k com.avito.android.lib.util.groupable_item.b bVar) {
        this.f124962b = lVar;
        this.f124963c = bVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        e eVar2 = (e) eVar;
        BadgeItem badgeItem = (BadgeItem) aVar;
        eVar2.cQ(badgeItem);
        this.f124963c.a(eVar2, badgeItem);
        eVar2.setOnClickListener(new h(22, this, badgeItem));
    }

    public /* synthetic */ d(Y41.l lVar, com.avito.android.lib.util.groupable_item.b bVar, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : lVar, bVar);
    }
}
