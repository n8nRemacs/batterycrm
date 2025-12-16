package com.avito.android.loyalty.links.badges;

import Ju.AbstractC14250d;
import cX.C27116b;
import cX.InterfaceC27115a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.NoMatchLink;
import com.avito.android.loyalty.remote.model.badge_details.BadgeDetailsAction;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;

/* compiled from: BadgeBarShowLinkAsyncHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LcX/b;", "it", "Lkotlin/G0;", "accept", "(LcX/b;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class c<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f183217b;

    public c(e eVar) {
        this.f183217b = eVar;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        com.avito.android.loyalty.ui.badge_details.a aVar;
        C27116b c27116b = (C27116b) obj;
        e eVar = this.f183217b;
        eVar.f183224k.getClass();
        List<InterfaceC27115a> listB = c27116b.b();
        if (listB == null) {
            listB = C42784z0.f406748b;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = listB.iterator();
        while (it.hasNext()) {
            com.avito.conveyor_item.a aVarA = com.avito.android.loyalty.ui.badge_details.e.a((InterfaceC27115a) it.next());
            if (aVarA != null) {
                arrayList.add(aVarA);
            }
        }
        BadgeDetailsAction action = c27116b.getAction();
        if (action != null) {
            String title = action.getTitle();
            if (title == null) {
                title = "";
            }
            DeepLink uri = action.getUri();
            if (uri == null) {
                uri = new NoMatchLink();
            }
            aVar = new com.avito.android.loyalty.ui.badge_details.a(title, uri);
        } else {
            aVar = null;
        }
        eVar.f183221h.k0(new b(new com.avito.android.loyalty.ui.badge_details.b(arrayList, aVar), eVar));
        eVar.j(AbstractC14250d.c.f9171c);
    }
}
