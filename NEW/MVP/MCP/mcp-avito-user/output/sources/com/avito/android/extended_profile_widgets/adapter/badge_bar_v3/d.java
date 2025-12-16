package com.avito.android.extended_profile_widgets.adapter.badge_bar_v3;

import Y41.l;
import android.os.Bundle;
import android.os.Parcelable;
import com.avito.android.component.advert_badge_bar.badge.BadgeItem;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.loyalty.data.Badge;
import com.avito.android.loyalty.links.BadgeBarShowListLink;
import com.avito.android.remote.model.Action;
import java.util.ArrayList;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.N;
import oB.k;
import oB.o;

/* compiled from: BadgeBarV3ItemPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes13.dex */
final class d extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ BadgeBarV3Item f154228l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ e f154229m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(BadgeBarV3Item badgeBarV3Item, e eVar) {
        super(0);
        this.f154228l = badgeBarV3Item;
        this.f154229m = eVar;
    }

    @Override // Y41.a
    public final G0 invoke() {
        DeepLink deepLink;
        BadgeBarV3Item badgeBarV3Item = this.f154228l;
        Action action = badgeBarV3Item.f154223f;
        if (action != null && (deepLink = action.getDeepLink()) != null) {
            boolean z12 = deepLink instanceof BadgeBarShowListLink;
            e eVar = this.f154229m;
            if (z12) {
                l<k, G0> lVar = eVar.f154230b;
                List<BadgeItem> list = badgeBarV3Item.f154221d;
                ArrayList arrayList = new ArrayList(C42745f0.q(list, 10));
                for (BadgeItem badgeItem : list) {
                    arrayList.add(new Badge(badgeItem.f124944c, badgeItem.f124945d, badgeItem.f124946e, badgeItem.f124952k, badgeItem.f124953l));
                }
                ArrayList<? extends Parcelable> arrayList2 = new ArrayList<>(arrayList);
                Bundle bundle = new Bundle();
                bundle.putParcelableArrayList("key_badges_list", arrayList2);
                lVar.invoke(new o(deepLink, bundle));
            } else {
                eVar.f154230b.invoke(new o(deepLink, null, 2, null));
            }
        }
        return G0.f406611a;
    }
}
