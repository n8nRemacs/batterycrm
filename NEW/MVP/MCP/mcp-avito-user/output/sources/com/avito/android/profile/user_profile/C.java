package com.avito.android.profile.user_profile;

import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.Toolbar;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.avito.android.R;
import com.avito.android.profile.user_profile.cards.CardItem;
import com.avito.android.profile.user_profile.mvi.entity.UserProfileState;
import com.avito.android.remote.model.notification.NotificationsCount;
import com.avito.android.util.C35766c3;
import com.avito.android.util.D6;
import com.avito.android.util.P5;
import java.util.Collections;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.L;
import ru.avito.component.appbar.ActionMenu;

/* compiled from: UserProfileView.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
final /* synthetic */ class C extends H implements Y41.l<UserProfileState, G0> {
    @Override // Y41.l
    public final G0 invoke(UserProfileState userProfileState) {
        UserProfileState.VisibleData.HeaderState headerState;
        int i12;
        Integer numValueOf;
        UserProfileState userProfileState2 = userProfileState;
        D d12 = (D) this.receiver;
        d12.getClass();
        UserProfileState.VisibleData visibleData = userProfileState2.f226450c;
        com.avito.android.profile.user_profile.header.b bVar = d12.f224210n;
        if (visibleData != null && (headerState = visibleData.f226465c) != null && !L.f(bVar.f226155d, headerState)) {
            bVar.f226155d = headerState;
            D d13 = bVar.f226154c;
            com.avito.android.profile.user_profile.cards.o oVar = bVar.f226153b;
            Integer numValueOf2 = Integer.valueOf(oVar.a());
            M81.c cVar = d13.f224203g;
            Toolbar toolbar = cVar.f10415d;
            toolbar.u(numValueOf2.intValue(), toolbar.getContentInsetRight());
            List<ActionMenu> list = headerState.f226471d;
            if (!list.isEmpty()) {
                cVar.f10415d.getMenu().clear();
                int i13 = 0;
                for (Object obj : list) {
                    int i14 = i13 + 1;
                    if (i13 < 0) {
                        C42745f0.H0();
                        throw null;
                    }
                    P5.a(cVar.f10415d, i13, (ActionMenu) obj);
                    i13 = i14;
                }
            }
            if (headerState.f226469b) {
                d13.a(null);
                d13.b(oVar.e());
            } else if (headerState.f226472e != null) {
                oVar.getClass();
                d13.g5(R.drawable.ic_share_24, Integer.valueOf(R.attr.blue));
                d13.b(null);
            } else {
                d13.a(null);
                d13.b(null);
            }
            UserProfileState.VisibleData.HeaderState.NotificationsState notificationsState = headerState.f226473f;
            if (notificationsState != null) {
                NotificationsCount notificationsCount = notificationsState.f226475c;
                if (notificationsCount.getUnread() == 0) {
                    oVar.getClass();
                    i12 = R.drawable.ic_up_notifications_24;
                } else {
                    oVar.getClass();
                    i12 = R.drawable.ic_up_notifications_red_24;
                }
                if (notificationsCount.getUnread() == 0) {
                    oVar.getClass();
                    numValueOf = Integer.valueOf(R.attr.blue);
                } else {
                    numValueOf = null;
                }
                MenuItem menuItemFindItem = cVar.f10415d.getMenu().findItem(notificationsState.f226474b);
                if (menuItemFindItem != null) {
                    menuItemFindItem.setIcon(i12);
                    if (numValueOf != null) {
                        C35766c3.b(menuItemFindItem, cVar.f10414c, numValueOf.intValue());
                    }
                }
            }
        }
        com.avito.android.extended_profile_ui_components.l lVar = d12.f224206j;
        M81.c cVar2 = d12.f224203g;
        boolean z12 = userProfileState2.f226451d;
        View view = d12.f224208l;
        SwipeRefreshLayout swipeRefreshLayout = d12.f224205i;
        View view2 = d12.f224209m;
        ViewGroup viewGroup = d12.f224204h;
        if (z12) {
            bVar.f226155d = null;
            bVar.f226154c.f224203g.f10415d.getMenu().clear();
            D6.H(viewGroup);
            D6.w(view2);
            N81.e eVar = cVar2.f10418g;
            if (eVar != null) {
                eVar.b();
                G0 g02 = G0.f406611a;
            }
            lVar.d();
            D6.w(view);
            swipeRefreshLayout.setRefreshing(false);
        } else {
            Throwable th2 = userProfileState2.f226452e;
            if (th2 != null) {
                d12.f224201e.l(C42784z0.f406748b, null);
                D6.H(viewGroup);
                D6.w(view2);
                N81.e eVar2 = cVar2.f10418g;
                if (eVar2 != null) {
                    eVar2.b();
                    G0 g03 = G0.f406611a;
                }
                lVar.c(th2, d12.f224202f);
                D6.w(view);
                swipeRefreshLayout.setRefreshing(false);
            } else if (userProfileState2.f226453f) {
                D6.w(viewGroup);
                D6.H(view2);
                swipeRefreshLayout.setRefreshing(false);
            } else if (visibleData != null) {
                CardItem.SilentUpdateItem silentUpdateItem = visibleData.f226464b;
                d12.c(C42745f0.h0(visibleData.f226466d, silentUpdateItem != null ? Collections.singletonList(silentUpdateItem) : C42784z0.f406748b));
            }
        }
        if (userProfileState2.f226454g) {
            D6.H(viewGroup);
            D6.w(view2);
            List<CardItem> list2 = visibleData != null ? visibleData.f226466d : null;
            if (list2 == null) {
                list2 = C42784z0.f406748b;
            }
            d12.c(list2);
            N81.e eVar3 = cVar2.f10418g;
            if (eVar3 != null) {
                eVar3.b();
                G0 g04 = G0.f406611a;
            }
            D6.H(view);
            swipeRefreshLayout.setRefreshing(false);
        }
        return G0.f406611a;
    }
}
