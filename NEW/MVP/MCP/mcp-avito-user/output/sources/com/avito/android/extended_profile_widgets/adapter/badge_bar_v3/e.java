package com.avito.android.extended_profile_widgets.adapter.badge_bar_v3;

import Y41.l;
import Y61.k;
import com.avito.android.component.advert_badge_bar.badge.BadgeItem;
import com.avito.android.remote.model.UniversalImage;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: BadgeBarV3ItemPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/extended_profile_widgets/adapter/badge_bar_v3/e;", "Lcom/avito/android/extended_profile_widgets/adapter/badge_bar_v3/c;", "_avito_extended-profile-widgets_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class e implements c {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final l<oB.k, G0> f154230b;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public e(@k l<? super oB.k, G0> lVar) {
        this.f154230b = lVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        g gVar = (g) eVar;
        BadgeBarV3Item badgeBarV3Item = (BadgeBarV3Item) aVar;
        List<BadgeItem> list = badgeBarV3Item.f154221d;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            UniversalImage universalImage = ((BadgeItem) it.next()).f124952k;
            if (universalImage != null) {
                arrayList.add(universalImage);
            }
        }
        gVar.A00(badgeBarV3Item.f154222e, arrayList);
        gVar.a(new d(badgeBarV3Item, this));
    }
}
