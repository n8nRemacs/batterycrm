package com.avito.android.messenger.channels.mvi.view;

import FY.a;
import GY.b;
import android.content.res.Resources;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import androidx.transition.C23503n;
import cZ.AbstractC27130a;
import com.avito.android.R;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.WebViewLink;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.lib.design.chips.Chips;
import com.avito.android.messenger.analytics.C31646b;
import com.avito.android.messenger.channels.mvi.view.C31886o;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.avito.android.util.D6;
import com.avito.android.util.Q5;
import com.avito.android.util.V2;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: ChannelsFragment.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LFY/d;", VoiceInfo.STATE, "Lkotlin/G0;", "invoke", "(LFY/d;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.messenger.channels.mvi.view.f, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
final class C31877f extends kotlin.jvm.internal.N implements Y41.l<FY.d, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ ChannelsFragment f188744l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31877f(ChannelsFragment channelsFragment) {
        super(1);
        this.f188744l = channelsFragment;
    }

    @Override // Y41.l
    public final G0 invoke(FY.d dVar) throws Resources.NotFoundException {
        MenuItem menuItemFindItem;
        final FY.d dVar2 = dVar;
        ChannelsFragment channelsFragment = this.f188744l;
        C31886o c31886o = channelsFragment.f188603I0;
        if (c31886o != null) {
            final C31876e c31876e = new C31876e(1, (com.avito.android.messenger.channels.mvi.header_feature.M) channelsFragment.f188619z0.getValue(), com.avito.android.messenger.channels.mvi.header_feature.M.class, "accept", "accept(Ljava/lang/Object;)V", 0);
            c31886o.getClass();
            C31886o.b bVar = c31886o.f188786k;
            FY.d dVar3 = bVar.f188788b;
            boolean z12 = dVar2.f4767a;
            final C31886o c31886o2 = C31886o.this;
            if (dVar3 == null || z12 != dVar3.f4767a) {
                c31886o2.getClass();
                Q5 q52 = new Q5(new C23503n());
                View view = c31886o2.f188783h;
                q52.b(view);
                View view2 = c31886o2.f188784i;
                q52.b(view2);
                androidx.transition.Q.a(c31886o2.f188782g, q52.c());
                if (z12) {
                    D6.g(view);
                    D6.H(view2);
                } else {
                    D6.g(view2);
                    D6.H(view);
                }
            }
            DeepLink deepLink = dVar3 != null ? dVar3.f4773g : null;
            final DeepLink deepLink2 = dVar2.f4773g;
            final boolean z13 = true;
            final boolean z14 = false;
            if (!kotlin.jvm.internal.L.f(deepLink2, deepLink)) {
                Toolbar toolbar = c31886o2.f188782g;
                MenuItem menuItemFindItem2 = toolbar.getMenu().findItem(R.id.assistant_settings_menu_item);
                if (menuItemFindItem2 == null) {
                    if (deepLink2 != null) {
                        final int i12 = 0;
                        com.avito.android.ui.d.a(toolbar.getMenu().add(0, R.id.assistant_settings_menu_item, 0, R.string.messenger_assistant_channels_list_menu_item), new MenuItem.OnMenuItemClickListener() { // from class: com.avito.android.messenger.channels.mvi.view.m
                            @Override // android.view.MenuItem.OnMenuItemClickListener
                            public final boolean onMenuItemClick(MenuItem menuItem) {
                                switch (i12) {
                                    case 0:
                                        b.a.a(c31886o2.f188778c, deepLink2, null, null, 6);
                                        break;
                                    default:
                                        b.a.a(c31886o2.f188778c, deepLink2, null, null, 6);
                                        break;
                                }
                                return true;
                            }
                        });
                    }
                } else if (deepLink2 != null) {
                    final int i13 = 1;
                    com.avito.android.ui.d.a(menuItemFindItem2, new MenuItem.OnMenuItemClickListener() { // from class: com.avito.android.messenger.channels.mvi.view.m
                        @Override // android.view.MenuItem.OnMenuItemClickListener
                        public final boolean onMenuItemClick(MenuItem menuItem) {
                            switch (i13) {
                                case 0:
                                    b.a.a(c31886o2.f188778c, deepLink2, null, null, 6);
                                    break;
                                default:
                                    b.a.a(c31886o2.f188778c, deepLink2, null, null, 6);
                                    break;
                            }
                            return true;
                        }
                    });
                    menuItemFindItem2.setVisible(true);
                    menuItemFindItem2.setEnabled(true);
                } else {
                    menuItemFindItem2.setVisible(false);
                    menuItemFindItem2.setEnabled(false);
                }
            }
            AbstractC27130a abstractC27130a = dVar3 != null ? dVar3.f4768b : null;
            AbstractC27130a abstractC27130a2 = dVar2.f4768b;
            if (!kotlin.jvm.internal.L.f(abstractC27130a2, abstractC27130a)) {
                Toolbar toolbar2 = c31886o2.f188782g;
                MenuItem menuItemFindItem3 = toolbar2.getMenu().findItem(R.id.crm_entry_point_menu_item);
                if (menuItemFindItem3 == null) {
                    if (abstractC27130a2 instanceof AbstractC27130a.C2047a) {
                        com.avito.android.ui.d.a(toolbar2.getMenu().add(0, R.id.crm_entry_point_menu_item, 0, ((AbstractC27130a.C2047a) abstractC27130a2).f57929a), new MenuItemOnMenuItemClickListenerC31882k(c31886o2, abstractC27130a2, 0));
                    }
                } else if (abstractC27130a2 instanceof AbstractC27130a.C2047a) {
                    menuItemFindItem3.setTitle(((AbstractC27130a.C2047a) abstractC27130a2).f57929a);
                    com.avito.android.ui.d.a(menuItemFindItem3, new MenuItemOnMenuItemClickListenerC31882k(c31886o2, abstractC27130a2, 1));
                    menuItemFindItem3.setVisible(true);
                    menuItemFindItem3.setEnabled(true);
                } else if (abstractC27130a2 instanceof AbstractC27130a.b) {
                    menuItemFindItem3.setVisible(false);
                    menuItemFindItem3.setEnabled(false);
                }
            }
            WebViewLink.OnlyAvitoDomain onlyAvitoDomain = dVar3 != null ? dVar3.f4771e : null;
            WebViewLink.OnlyAvitoDomain onlyAvitoDomain2 = dVar2.f4771e;
            if (!kotlin.jvm.internal.L.f(onlyAvitoDomain2, onlyAvitoDomain)) {
                Toolbar toolbar3 = c31886o2.f188782g;
                MenuItem menuItemFindItem4 = toolbar3.getMenu().findItem(R.id.auto_replies_menu_item);
                boolean z15 = dVar2.f4772f;
                if (menuItemFindItem4 == null) {
                    if (onlyAvitoDomain2 != null) {
                        MenuItem menuItemAdd = toolbar3.getMenu().add(0, R.id.auto_replies_menu_item, 0, R.string.messenger_auto_replies_button_description);
                        String string = c31886o2.f188781f.getString(R.string.messenger_auto_replies_button_description);
                        if (menuItemAdd instanceof K0.b) {
                            ((K0.b) menuItemAdd).setContentDescription((CharSequence) string);
                        } else {
                            menuItemAdd.setContentDescription(string);
                        }
                        menuItemAdd.setIcon(R.drawable.ic_messenger_auto_replies_24);
                        menuItemAdd.setShowAsActionFlags(2);
                        final int i14 = 0;
                        com.avito.android.ui.d.a(menuItemAdd, new MenuItem.OnMenuItemClickListener() { // from class: com.avito.android.messenger.channels.mvi.view.l
                            @Override // android.view.MenuItem.OnMenuItemClickListener
                            public final boolean onMenuItemClick(MenuItem menuItem) {
                                switch (i14) {
                                    case 0:
                                        C31646b c31646b = new C31646b();
                                        C31886o c31886o3 = c31886o2;
                                        c31886o3.f188779d.c(c31646b);
                                        b.a.a(c31886o3.f188778c, dVar2.f4771e, null, null, 6);
                                        break;
                                    default:
                                        C31646b c31646b2 = new C31646b();
                                        C31886o c31886o4 = c31886o2;
                                        c31886o4.f188779d.c(c31646b2);
                                        b.a.a(c31886o4.f188778c, dVar2.f4771e, null, null, 6);
                                        break;
                                }
                                return true;
                            }
                        });
                        if (z15 && c31886o2.b()) {
                            c31876e.invoke(a.C0291a.f4753a);
                        }
                    }
                } else if (onlyAvitoDomain2 != null) {
                    final int i15 = 1;
                    com.avito.android.ui.d.a(menuItemFindItem4, new MenuItem.OnMenuItemClickListener() { // from class: com.avito.android.messenger.channels.mvi.view.l
                        @Override // android.view.MenuItem.OnMenuItemClickListener
                        public final boolean onMenuItemClick(MenuItem menuItem) {
                            switch (i15) {
                                case 0:
                                    C31646b c31646b = new C31646b();
                                    C31886o c31886o3 = c31886o2;
                                    c31886o3.f188779d.c(c31646b);
                                    b.a.a(c31886o3.f188778c, dVar2.f4771e, null, null, 6);
                                    break;
                                default:
                                    C31646b c31646b2 = new C31646b();
                                    C31886o c31886o4 = c31886o2;
                                    c31886o4.f188779d.c(c31646b2);
                                    b.a.a(c31886o4.f188778c, dVar2.f4771e, null, null, 6);
                                    break;
                            }
                            return true;
                        }
                    });
                    menuItemFindItem4.setVisible(true);
                    menuItemFindItem4.setEnabled(true);
                    if (z15 && c31886o2.b()) {
                        c31876e.invoke(a.C0291a.f4753a);
                    }
                } else {
                    menuItemFindItem4.setVisible(false);
                    menuItemFindItem4.setEnabled(false);
                }
            }
            GY.b bVar2 = dVar3 != null ? dVar3.f4769c : null;
            GY.b bVar3 = dVar2.f4769c;
            if (!kotlin.jvm.internal.L.f(bVar2, bVar3)) {
                c31886o2.getClass();
                boolean zF2 = kotlin.jvm.internal.L.f(bVar3, b.a.f6564a);
                Toolbar toolbar4 = c31886o2.f188782g;
                if (zF2) {
                    MenuItem menuItemFindItem5 = toolbar4.getMenu().findItem(R.id.menu_filter);
                    if (menuItemFindItem5 != null) {
                        menuItemFindItem5.setVisible(false);
                    }
                } else if (bVar3 instanceof b.C0356b) {
                    MenuItem menuItemFindItem6 = toolbar4.getMenu().findItem(R.id.menu_filter);
                    if (menuItemFindItem6 != null) {
                        menuItemFindItem6.setIcon(R.drawable.ic_messenger_filter_select);
                        menuItemFindItem6.setVisible(true);
                        com.avito.android.ui.d.a(menuItemFindItem6, new MenuItem.OnMenuItemClickListener() { // from class: com.avito.android.messenger.channels.mvi.view.n
                            @Override // android.view.MenuItem.OnMenuItemClickListener
                            public final boolean onMenuItemClick(MenuItem menuItem) {
                                C31886o c31886o3 = c31886o2;
                                c31886o3.f188780e.d();
                                com.avito.android.lib.util.g.a(new com.avito.android.messenger.channels.filter.d(c31886o3.f188777b.getContext(), z13, new C31887p(c31886o3, c31876e)));
                                return true;
                            }
                        });
                    }
                } else if ((bVar3 instanceof b.c) && (menuItemFindItem = toolbar4.getMenu().findItem(R.id.menu_filter)) != null) {
                    menuItemFindItem.setIcon(R.drawable.ic_messenger_filter_unselect);
                    menuItemFindItem.setVisible(true);
                    com.avito.android.ui.d.a(menuItemFindItem, new MenuItem.OnMenuItemClickListener() { // from class: com.avito.android.messenger.channels.mvi.view.n
                        @Override // android.view.MenuItem.OnMenuItemClickListener
                        public final boolean onMenuItemClick(MenuItem menuItem) {
                            C31886o c31886o3 = c31886o2;
                            c31886o3.f188780e.d();
                            com.avito.android.lib.util.g.a(new com.avito.android.messenger.channels.filter.d(c31886o3.f188777b.getContext(), z14, new C31887p(c31886o3, c31876e)));
                            return true;
                        }
                    });
                }
            }
            List<GY.a> list = dVar3 != null ? dVar3.f4770d : null;
            List<GY.a> list2 = dVar2.f4770d;
            if (!kotlin.jvm.internal.L.f(list, list2)) {
                c31886o2.getClass();
                boolean z16 = !list2.isEmpty();
                Chips chips = c31886o2.f188785j;
                D6.G(chips, z16);
                chips.setChipsSelectedListener(null);
                chips.j();
                chips.setData(list2);
                if (!list2.isEmpty()) {
                    for (Object obj : list2) {
                        if (((GY.a) obj).getF6556c()) {
                            chips.q((com.avito.android.lib.design.chips.h) obj, false);
                            chips.setKeepSelected(true);
                            chips.setChipsSelectedListener(new C31888q(c31886o2, c31876e));
                        }
                    }
                    throw new NoSuchElementException("Collection contains no element matching the predicate.");
                }
            }
            bVar.f188788b = dVar2;
        }
        V2.f318762a.i("ChannelsFragment", "Rendered state: " + dVar2, null);
        return G0.f406611a;
    }
}
