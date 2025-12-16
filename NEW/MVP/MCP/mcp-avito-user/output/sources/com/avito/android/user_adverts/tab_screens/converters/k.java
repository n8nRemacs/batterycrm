package com.avito.android.user_adverts.tab_screens.converters;

import com.avito.android.R;
import com.avito.android.user_adverts.model.UserAdvertsGroupData;
import com.avito.android.user_adverts.model.UserAdvertsGroupSelectedState;
import com.avito.android.user_adverts.model.UserAdvertsGroupState;
import com.avito.android.user_adverts.model.UserAdvertsShortcutGroup;
import com.avito.android.user_adverts.tab_screens.advert_list.shortcut_title.d;
import com.avito.android.user_adverts.tab_screens.adverts.domain.model.UserAdvertActionsInfoDomain;
import com.avito.android.user_adverts.tab_screens.adverts.domain.model.item.DisclaimerItemDomain;
import com.avito.android.user_adverts.tab_screens.adverts.domain.model.item.UserAdvertItemDomain;
import com.avito.android.user_adverts.tab_screens.adverts.domain.model.item.UserAdvertsBaseItemDomain;
import com.avito.android.user_adverts.tab_screens.converters.d;
import com.avito.android.user_adverts.tab_screens.converters.j;
import dJ0.C39589a;
import java.util.ArrayList;
import java.util.Collections;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import wJ0.g;

/* compiled from: UserItemConverter.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_adverts/tab_screens/converters/k;", "Lcom/avito/android/user_adverts/tab_screens/converters/j;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class k implements j {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final d f315805a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final a f315806b;

    @Inject
    public k(@Y61.k d dVar, @Y61.k a aVar) {
        this.f315805a = dVar;
        this.f315806b = aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.util.List] */
    @Override // com.avito.android.user_adverts.tab_screens.converters.j
    @Y61.k
    public final ArrayList a(@Y61.k j.a aVar) {
        d.a.InterfaceC9787a cVar;
        C39589a c39589a;
        C42784z0 c42784z0SingletonList;
        UserAdvertsGroupSelectedState userAdvertsGroupSelectedState;
        ArrayList arrayList = new ArrayList();
        boolean z12 = false;
        UserAdvertsShortcutGroup userAdvertsShortcutGroup = null;
        for (UserAdvertsBaseItemDomain userAdvertsBaseItemDomain : aVar.f315798c) {
            if (userAdvertsBaseItemDomain instanceof DisclaimerItemDomain) {
                arrayList.add(this.f315806b.a((DisclaimerItemDomain) userAdvertsBaseItemDomain));
            } else if (userAdvertsBaseItemDomain instanceof UserAdvertItemDomain) {
                UserAdvertsShortcutGroup.a aVar2 = UserAdvertsShortcutGroup.f312197b2;
                UserAdvertItemDomain userAdvertItemDomain = (UserAdvertItemDomain) userAdvertsBaseItemDomain;
                String str = userAdvertItemDomain.f315037h;
                aVar2.getClass();
                UserAdvertsShortcutGroup userAdvertsShortcutGroupA = UserAdvertsShortcutGroup.a.a(str);
                j.a.InterfaceC9790a interfaceC9790a = aVar.f315799d;
                boolean z13 = interfaceC9790a instanceof j.a.InterfaceC9790a.C9791a;
                if (z13) {
                    cVar = new d.a.InterfaceC9787a.C9788a(((j.a.InterfaceC9790a.C9791a) interfaceC9790a).f315801a);
                } else if (interfaceC9790a instanceof j.a.InterfaceC9790a.c) {
                    j.a.InterfaceC9790a.c cVar2 = (j.a.InterfaceC9790a.c) interfaceC9790a;
                    cVar = new d.a.InterfaceC9787a.c(cVar2.f315803a, cVar2.f315804b);
                } else {
                    if (!(interfaceC9790a instanceof j.a.InterfaceC9790a.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    cVar = d.a.InterfaceC9787a.b.f315776a;
                }
                String str2 = aVar.f315797b;
                UserAdvertActionsInfoDomain userAdvertActionsInfoDomain = aVar.f315796a;
                C39589a c39589aA = this.f315805a.a(new d.a(str2, userAdvertItemDomain, cVar, userAdvertActionsInfoDomain));
                if (L.f(userAdvertsShortcutGroup, userAdvertsShortcutGroupA)) {
                    c39589a = c39589aA;
                } else {
                    if (userAdvertActionsInfoDomain != null) {
                        String strValueOf = String.valueOf(userAdvertsShortcutGroupA.hashCode());
                        if (z12) {
                            c42784z0SingletonList = C42784z0.f406748b;
                        } else {
                            c42784z0SingletonList = Collections.singletonList(new d.a(R.string.user_adverts_actions_tooltip_title, R.string.user_adverts_actions_tooltip_desc, new g.a(Integer.valueOf(R.string.user_adverts_actions_tooltip_action), null), false, 8, null));
                            z12 = true;
                        }
                        if (z13) {
                            UserAdvertsGroupData userAdvertsGroupData = ((j.a.InterfaceC9790a.C9791a) interfaceC9790a).f315801a;
                            userAdvertsGroupData.getClass();
                            UserAdvertsGroupState userAdvertsGroupState = userAdvertsGroupData.f312182b.get(UserAdvertsShortcutGroup.a.a(userAdvertItemDomain.f315037h));
                            if (userAdvertsGroupState == null || (userAdvertsGroupSelectedState = userAdvertsGroupState.f312196f) == null) {
                                userAdvertsGroupSelectedState = UserAdvertsGroupSelectedState.f312189d;
                            }
                        } else {
                            userAdvertsGroupSelectedState = UserAdvertsGroupSelectedState.f312189d;
                        }
                        c39589a = c39589aA;
                        arrayList.add(new com.avito.android.user_adverts.tab_screens.advert_list.shortcut_title.d(userAdvertItemDomain.f315049t, userAdvertsShortcutGroupA, userAdvertsGroupSelectedState, Integer.valueOf(R.string.user_adverts_pick_all_action), strValueOf, c42784z0SingletonList));
                    } else {
                        c39589a = c39589aA;
                        String str3 = userAdvertItemDomain.f315049t;
                        if (str3 != null && str3.length() != 0) {
                            arrayList.add(new com.avito.android.user_adverts.tab_screens.advert_list.shortcut_title.d(userAdvertItemDomain.f315049t, userAdvertsShortcutGroupA, null, null, String.valueOf(userAdvertsShortcutGroupA.hashCode()), null, 44, null));
                        }
                    }
                    userAdvertsShortcutGroup = userAdvertsShortcutGroupA;
                }
                arrayList.add(c39589a);
            } else {
                continue;
            }
        }
        if (aVar.f315800e) {
            arrayList.add(new com.avito.android.user_adverts.tab_screens.advert_list.loading.e(null, 1, null));
        }
        return arrayList;
    }
}
