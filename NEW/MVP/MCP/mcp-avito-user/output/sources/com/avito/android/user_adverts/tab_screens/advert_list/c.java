package com.avito.android.user_adverts.tab_screens.advert_list;

import androidx.recyclerview.widget.C23424o;
import com.avito.android.user_adverts.tab_screens.advert_list.loading.e;
import com.avito.android.user_adverts_views_pub.UserAdvertItem;
import dJ0.C39589a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: UserAdvertsListDiffCallback.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/user_adverts/tab_screens/advert_list/c;", "Landroidx/recyclerview/widget/o$f;", "LTV0/a;", "<init>", "()V", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class c extends C23424o.f<TV0.a> {
    @Inject
    public c() {
    }

    @Override // androidx.recyclerview.widget.C23424o.f
    public final boolean a(TV0.a aVar, TV0.a aVar2) {
        TV0.a aVar3 = aVar;
        TV0.a aVar4 = aVar2;
        if ((aVar3 instanceof e) && (aVar4 instanceof e)) {
            return true;
        }
        return aVar3.equals(aVar4);
    }

    @Override // androidx.recyclerview.widget.C23424o.f
    public final boolean b(TV0.a aVar, TV0.a aVar2) {
        return aVar.getF83595b() == aVar2.getF83595b();
    }

    @Override // androidx.recyclerview.widget.C23424o.f
    public final Object c(TV0.a aVar, TV0.a aVar2) {
        TV0.a aVar3 = aVar;
        TV0.a aVar4 = aVar2;
        if ((aVar3 instanceof C39589a) && (aVar4 instanceof C39589a)) {
            C39589a c39589a = (C39589a) aVar3;
            C39589a c39589aA = C39589a.a(c39589a);
            C39589a c39589a2 = (C39589a) aVar4;
            C39589a c39589aA2 = C39589a.a(c39589a2);
            boolean z12 = (L.f(c39589a.f393785D, c39589a2.f393785D) && L.f(c39589a.f393795N, c39589a2.f393795N)) ? false : true;
            if (c39589aA.equals(c39589aA2) && z12) {
                return UserAdvertItem.n.f316711a;
            }
            return null;
        }
        if (!(aVar3 instanceof com.avito.android.user_adverts.tab_screens.advert_list.shortcut_title.d) || !(aVar4 instanceof com.avito.android.user_adverts.tab_screens.advert_list.shortcut_title.d)) {
            return null;
        }
        com.avito.android.user_adverts.tab_screens.advert_list.shortcut_title.d dVar = (com.avito.android.user_adverts.tab_screens.advert_list.shortcut_title.d) aVar3;
        com.avito.android.user_adverts.tab_screens.advert_list.shortcut_title.d dVar2 = (com.avito.android.user_adverts.tab_screens.advert_list.shortcut_title.d) aVar4;
        if (!com.avito.android.user_adverts.tab_screens.advert_list.shortcut_title.d.a(dVar).equals(com.avito.android.user_adverts.tab_screens.advert_list.shortcut_title.d.a(dVar2)) || dVar.f314770d == dVar2.f314770d) {
            return null;
        }
        return UserAdvertItem.n.f316711a;
    }
}
