package com.avito.android.user_adverts.tab_screens.adverts.mvi.entity;

import Y61.k;
import Y61.l;
import com.avito.android.user_adverts.tab_screens.adverts.domain.model.item.UserAdvertItemDomain;
import com.avito.android.user_adverts.tab_screens.adverts.domain.model.item.UserAdvertsBaseItemDomain;
import com.avito.android.user_adverts.tab_screens.adverts.mvi.entity.UserAdvertsListState;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import nI0.i;

/* compiled from: UserAdvertsListState.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_user-adverts_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class a {
    public static final boolean a(@k UserAdvertsListState userAdvertsListState) {
        if (!userAdvertsListState.c()) {
            i.f414995a.getClass();
            String str = userAdvertsListState.f315384b;
            if (str.equals("active") || str.equals("sellervation") || (userAdvertsListState.f315387e == 0 && !str.equals("draft"))) {
                return true;
            }
        }
        return false;
    }

    @l
    public static final UserAdvertsListState.DataState.Loaded b(@k UserAdvertsListState userAdvertsListState) {
        UserAdvertsListState.DataState dataState = userAdvertsListState.f315396n;
        if (dataState instanceof UserAdvertsListState.DataState.Loaded) {
            return (UserAdvertsListState.DataState.Loaded) dataState;
        }
        return null;
    }

    @l
    public static final UserAdvertItemDomain c(@k UserAdvertsListState userAdvertsListState, @k String str) {
        UserAdvertsBaseItemDomain userAdvertsBaseItemDomain;
        List<UserAdvertsBaseItemDomain> list;
        Object next;
        UserAdvertsListState.DataState.Loaded loadedB = b(userAdvertsListState);
        if (loadedB == null || (list = loadedB.f315409b) == null) {
            userAdvertsBaseItemDomain = null;
        } else {
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                UserAdvertsBaseItemDomain userAdvertsBaseItemDomain2 = (UserAdvertsBaseItemDomain) next;
                if ((userAdvertsBaseItemDomain2 instanceof UserAdvertItemDomain) && L.f(((UserAdvertItemDomain) userAdvertsBaseItemDomain2).f315030P, str)) {
                    break;
                }
            }
            userAdvertsBaseItemDomain = (UserAdvertsBaseItemDomain) next;
        }
        if (userAdvertsBaseItemDomain instanceof UserAdvertItemDomain) {
            return (UserAdvertItemDomain) userAdvertsBaseItemDomain;
        }
        return null;
    }
}
