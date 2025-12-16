package com.avito.android.extended_profile_widgets.adapter.badge_bar;

import Y41.l;
import com.avito.android.component.advert_badge_bar.badge.BadgeItem;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import oB.o;

/* compiled from: BadgeBarItemPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/component/advert_badge_bar/badge/BadgeItem;", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/component/advert_badge_bar/badge/BadgeItem;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes13.dex */
final class d extends N implements l<BadgeItem, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ e f154215l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar) {
        super(1);
        this.f154215l = eVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // Y41.l
    public final G0 invoke(BadgeItem badgeItem) {
        DeepLink deepLink = badgeItem.f124953l;
        if (deepLink != null) {
            this.f154215l.f154216b.invoke(new o(deepLink, null, 2, 0 == true ? 1 : 0));
        }
        return G0.f406611a;
    }
}
