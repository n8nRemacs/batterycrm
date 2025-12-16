package com.avito.android.bottom_navigation;

import SK0.b;
import android.annotation.SuppressLint;
import com.avito.android.ai_assistant.AiAssistantOpenLink;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.event.C28451y0;
import com.avito.android.analytics.event.f1;
import com.avito.android.bottom_navigation.space.BottomNavigationSpace;
import com.avito.android.deep_linking.links.AdvertPublicationLink;
import com.avito.android.deep_linking.links.PassportProfilesListLink;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.home.bottom_navigation.BottomNavigationFragment;
import java.util.Locale;
import kotlin.Metadata;

/* compiled from: BottomNavigationController.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bottom_navigation/e;", "LXj/c;", "_avito_bottom-navigation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.bottom_navigation.e, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C28883e implements Xj.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C28885g f107003a;

    public C28883e(C28885g c28885g) {
        this.f107003a = c28885g;
    }

    @Override // Xj.c
    @SuppressLint({"DefaultLocale"})
    public final void a(@Y61.k NavigationTabSetItem navigationTabSetItem) {
        String name;
        C28885g c28885g = this.f107003a;
        String strInvoke = c28885g.f107018n.invoke();
        NavigationTabSetItem navigationTabSetItemA = c28885g.a();
        String str = null;
        if (navigationTabSetItem == NavigationTab.f106976l) {
            com.avito.android.deeplink_handler.handler.composite.a aVar = BottomNavigationFragment.this.f162275w0;
            if (aVar == null) {
                aVar = null;
            }
            b.a.a(aVar, new AiAssistantOpenLink("H4sIAAAAAAAA_0q0MrSqLraytFJKK8rPjS9ITE9Vsi62MrNSKklMSkosUrKuBQQAAP__vT7qBiMAAAA"), null, null, 6);
        } else if (navigationTabSetItem != GlobalNavigationTab.f106940i) {
            c28885g.e(navigationTabSetItem);
        } else if (!navigationTabSetItem.getF106947d() || c28885g.f107009e.a()) {
            com.avito.android.deeplink_handler.handler.composite.a aVar2 = BottomNavigationFragment.this.f162275w0;
            if (aVar2 == null) {
                aVar2 = null;
            }
            b.a.a(aVar2, new AdvertPublicationLink.Public(null, null, false, null, false, null, null, null, null, null, 1023, null), null, null, 6);
        } else {
            c28885g.f107010f.a(navigationTabSetItem);
        }
        f1 f1Var = new f1(navigationTabSetItem.getName());
        InterfaceC28373a interfaceC28373a = c28885g.f107011g;
        interfaceC28373a.c(f1Var);
        String name2 = navigationTabSetItem.getName();
        Locale locale = Locale.ROOT;
        String lowerCase = name2.toLowerCase(locale);
        String lowerCase2 = (navigationTabSetItemA == null || (name = navigationTabSetItemA.getName()) == null) ? null : name.toLowerCase(locale);
        if (lowerCase2 == null) {
            lowerCase2 = "";
        }
        interfaceC28373a.c(new C28451y0(lowerCase, lowerCase2, true, strInvoke));
        if (c28885g.f107019o != BottomNavigationSpace.f107066c) {
            return;
        }
        if (navigationTabSetItem == NavigationTab.f106975k) {
            str = "avito_for_business_click_tab_main";
        } else if (!navigationTabSetItem.equals(navigationTabSetItemA)) {
            if (navigationTabSetItem == NavigationTab.f106971g) {
                str = "avito_for_business_select_tab_favorites";
            } else if (navigationTabSetItem == NavigationTab.f106972h) {
                str = "avito_for_business_select_tab_user_adverts";
            } else if (navigationTabSetItem == NavigationTab.f106973i) {
                str = "avito_for_business_select_tab_message";
            } else if (navigationTabSetItem == NavigationTab.f106974j) {
                str = "avito_for_business_select_tab_profile";
            }
        }
        if (str == null) {
            return;
        }
        b.a.a(c28885g.f107017m, new C28884f(str), null, null, null, 14);
    }

    public final void b(@Y61.k NavigationTab navigationTab) {
        if (navigationTab == NavigationTab.f106974j) {
            com.avito.android.deeplink_handler.handler.composite.a aVar = BottomNavigationFragment.this.f162275w0;
            if (aVar == null) {
                aVar = null;
            }
            b.a.a(aVar, new PassportProfilesListLink(false, 1, null), null, null, 6);
        }
    }
}
