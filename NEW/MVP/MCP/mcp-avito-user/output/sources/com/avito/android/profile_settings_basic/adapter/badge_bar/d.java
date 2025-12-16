package com.avito.android.profile_settings_basic.adapter.badge_bar;

import Qb0.e;
import Y41.l;
import com.avito.android.component.advert_badge_bar.badge.BadgeItem;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: BadgeBarItemPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/component/advert_badge_bar/badge/BadgeItem;", "badgeItem", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/component/advert_badge_bar/badge/BadgeItem;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class d extends N implements l<BadgeItem, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ e f228578l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar) {
        super(1);
        this.f228578l = eVar;
    }

    @Override // Y41.l
    public final G0 invoke(BadgeItem badgeItem) {
        BadgeItem badgeItem2 = badgeItem;
        if (badgeItem2.f124953l != null) {
            e eVar = this.f228578l;
            eVar.f228579b.invoke(new e.a(badgeItem2));
        }
        return G0.f406611a;
    }
}
